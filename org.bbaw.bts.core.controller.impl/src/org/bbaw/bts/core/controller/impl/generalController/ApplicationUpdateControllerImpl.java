package org.bbaw.bts.core.controller.impl.generalController;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Iterator;

import javax.inject.Inject;

import org.bbaw.bts.btsviewmodel.BtsviewmodelFactory;
import org.bbaw.bts.btsviewmodel.StatusMessage;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.commons.BTSPluginIDs;
import org.bbaw.bts.core.controller.generalController.ApplicationUpdateController;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.core.runtime.preferences.ConfigurationScope;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.services.log.Logger;
import org.eclipse.e4.ui.di.UISynchronize;
import org.eclipse.e4.ui.services.internal.events.EventBroker;
import org.eclipse.e4.ui.workbench.IWorkbench;
import org.eclipse.equinox.p2.core.IProvisioningAgent;
import org.eclipse.equinox.p2.engine.IProvisioningPlan;
import org.eclipse.equinox.p2.metadata.IInstallableUnit;
import org.eclipse.equinox.p2.operations.ProvisioningSession;
import org.eclipse.equinox.p2.operations.Update;
import org.eclipse.equinox.p2.operations.UpdateOperation;
import org.eclipse.equinox.p2.query.IQueryResult;
import org.eclipse.equinox.p2.query.IQueryable;
import org.eclipse.equinox.p2.query.QueryUtil;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

@SuppressWarnings("restriction")
public class ApplicationUpdateControllerImpl extends Job implements
		ApplicationUpdateController {

	private static final String APP_FEATURE_GROUP_ID = "org.bbaw.bts.app.feature.feature.group";

	private class ApplicationUpdateConfirmationDialog extends Dialog {
		private Text changelogText;

		protected ApplicationUpdateConfirmationDialog(Shell parentShell) {
			super(parentShell);
		}

		@Override
		protected Control createDialogArea(Composite parent) {
			Composite container = (Composite) super.createDialogArea(parent);
			Label messageLabel = new Label(container, SWT.BOLD);
			messageLabel.setText("The following updates can be installed.");

			Text updateDetailsText = new Text(container, SWT.MULTI | SWT.BORDER);
			updateDetailsText.setEditable(false);
			String msg = "";
			for (Update u : updateOperation.getPossibleUpdates()) {
				msg += u.toUpdate.getId() + "\t\t" + u.toUpdate.getVersion() + " ===> " + u.replacement.getVersion() + "\n";
			}
			updateDetailsText.setText(msg);

			changelogText = new Text(container, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER);
			changelogText.setEditable(false);
			changelogText.setEnabled(true);
			GridData changelogTextLayoutData = new GridData(SWT.FILL, SWT.FILL, true, true);
			changelogTextLayoutData.widthHint = convertWidthInCharsToPixels(80);
			changelogTextLayoutData.heightHint = 400;
			changelogText.setLayoutData(changelogTextLayoutData);
			changelogText.setTabs(2);
			changelogText.setBackground(Display.getDefault().getSystemColor(SWT.COLOR_LIST_BACKGROUND));

			Label instructionLabel = new Label(container, SWT.NONE);
			instructionLabel.setText("To install these updates, confirm with OK.");

			initDialogArea();

			container.pack();
			return container;
		}

		protected void initDialogArea() {
			IProvisioningPlan provisioningPlan = updateOperation.getProvisioningPlan();
			IQueryable<IInstallableUnit> additions = provisioningPlan.getAdditions();
			IQueryResult<IInstallableUnit> appFeatureUnit = additions.query(
					QueryUtil.createMatchQuery("id == $0", APP_FEATURE_GROUP_ID),
					null);

			if (!appFeatureUnit.isEmpty()) {
				IInstallableUnit feature = appFeatureUnit.iterator().next();
				String description = feature.getProperty(IInstallableUnit.PROP_DESCRIPTION);
				info("Description of feature "+feature.getId()+":\n"+description);
				changelogText.append(description);
			}
		}

		@Override
		protected void configureShell(Shell newShell) {
			super.configureShell(newShell);
			newShell.setText("Software Update available");
		}

		@Override
		protected boolean isResizable() {
		    return true;
		}
	}

	@Inject
	private Logger logger;

	@Inject
	private IProvisioningAgent agent;

	@Inject
	private UISynchronize sync;

	@Inject
	private IWorkbench workbench;

	@Inject
	private EventBroker eventBroker;

	@Inject
	private IEclipseContext context;

	private Job updateJob;
	private Update[] updates;
	private UpdateOperation updateOperation = null;
	private volatile EUpdateStatusType status = EUpdateStatusType.NO_UPDATE;
	private boolean updatePending;
	private long timeStamp;

	final Update[] NULL_UPDATE = new Update[0];


	public ApplicationUpdateControllerImpl() {
		super("Application Update Check Job");
		updateJob = null;
		updates = null;
		updatePending = false;
		timeStamp = 0;
		schedule();
	}

	@Override
	public boolean isUpdateAvailable() {
		info("Return Software Update availability.");
		if (updateOperation != null && updateOperation.getPossibleUpdates() != null) { 
			if (updateOperation.getPossibleUpdates().length > 0) {
				assert status == EUpdateStatusType.UPDATE_AVAILABLE || status == EUpdateStatusType.UPDATE_REJECTED;
				return true;
			} else {
				info("No software updates.");
			}
		} else {
			info("Schedule check for update availability.");
			scheduleCheck();
		}
		return false;
	}

	@Override
	public EUpdateStatusType getStatus() {
		return status;
	}

	@Override
	public IStatus scheduleUpdate() {
		info("SOFTWARE UPDATE CONFIRMED.");

		if (updateOperation.getPossibleUpdates() != null 
				&& updateOperation.getPossibleUpdates().length > 0) {
			info("Updates available: "+updateOperation.getPossibleUpdates().length);
			for (Update u : updateOperation.getPossibleUpdates()) {
				info(" "+u.toUpdate);
			}
		}

		if (updateJob != null) {
			updateJob.addJobChangeListener(new JobChangeAdapter() {

				@Override
				public void scheduled(IJobChangeEvent event) {
					info("update job is scheduled. "+event);
					super.scheduled(event);
				}
				
				@Override
				public void running(IJobChangeEvent event) {
					info("update job is running. "+event);
					sendStatusMessage("Installing updates...");
					setStatus(EUpdateStatusType.UPDATE_RUNNING);
					super.running(event);
				}

				@Override
				public void done(IJobChangeEvent event) {
					info("update job done. "+event);
					setStatus(event.getResult().isOK() ?
							EUpdateStatusType.UPDATE_SUCCESS
							: EUpdateStatusType.UPDATE_FAILED);
					updatePending = false;
					updateJob = null;
					updates = null;
					updateOperation = null;
					if (status == EUpdateStatusType.UPDATE_SUCCESS) {
						sync.syncExec(new Runnable() {
				            @Override
				            public void run() {
				              boolean restart = MessageDialog.openQuestion(null, "Updates installed, restart?",
				                  "Updates have been installed. Do you want to restart?");
				              if (restart) {
				                workbench.restart();
				              }
				            }
				          });
						sendStatusMessage("Software Update successful.");
					} else {
						sendStatusMessage("Software Update failed.");
					}
					super.done(event);
				}
			});

			info("Schedule update job");
			updateJob.schedule();
		} else {
			sendStatusMessage("Software Update failed: no job.");
			return Status.CANCEL_STATUS;
		}
		return null;
	}
	
	@Override
	public void scheduleCheck() {
		schedule();
	}

	@Override
	protected IStatus run(IProgressMonitor monitor) {
		try {
			agent = context.get(IProvisioningAgent.class);
		} catch (NullPointerException e) {
			//
		}
		if (workbench != null && agent != null) {
			IStatus runStatus = checkForUpdates(monitor);
			schedule(TIME_UNTIL_RECHECK);
			askForConfirmationAndInstall();
			return runStatus;
		} else {
			info("Update Checker: Waiting for Workbench initialization.");
			schedule(2000);
			return Status.CANCEL_STATUS;
		}
	}


	@Override
	public void askForConfirmationAndInstall() {
		if (isUpdateAvailable() && !updatePending) {
			sync.syncExec(new Runnable() {

				@Override
				public void run() {
					int performUpdate = new ApplicationUpdateConfirmationDialog(
							Display.getDefault().getActiveShell()).open();
					if (performUpdate == Window.OK) {
						info("Installation of Updates confirmed.");
						updatePending = true;
						scheduleUpdate();
					} else {
						setStatus(EUpdateStatusType.UPDATE_REJECTED);
					}
				}
			});

		} else {
			scheduleUpdate();
		}
	}
	
	@Override
	public boolean shouldSchedule() {
		return !(status == EUpdateStatusType.CHECK_RUNNING || status == EUpdateStatusType.UPDATE_RUNNING);
	}
	
	private synchronized IStatus checkForUpdates(IProgressMonitor monitor) { 
		long now = System.currentTimeMillis();
		// if latest check within specified time, return status
		if (now - timeStamp < TIME_UNTIL_RECHECK) {
			info("p2 update: last checked at "+timeStamp);
			if (updateOperation.getPossibleUpdates() != null) {
				if (status != EUpdateStatusType.UPDATE_REJECTED) {
					setStatus((updateOperation.getPossibleUpdates().length > 0)
							? EUpdateStatusType.UPDATE_AVAILABLE
							: EUpdateStatusType.NO_UPDATE);
				}
				return Status.CANCEL_STATUS;
			} else {
				logger.warn("Check for updates anyway.");
			}
		}
		// if more than specified time since latest update, re-check
		// (unless installation of updates has already been declined)
		if (status != EUpdateStatusType.UPDATE_REJECTED) {
			setStatus(EUpdateStatusType.CHECK_RUNNING);
			timeStamp = now;
		} else {
			return Status.CANCEL_STATUS;
		}

		// set up provisioning services
		ProvisioningSession session = new ProvisioningSession(agent);
		updateOperation = new UpdateOperation(session);

		// lookup repository URL: try app configuration, use hard coded default
		IEclipsePreferences prefs = ConfigurationScope.INSTANCE.getNode("org.bbaw.bts.app");
		String url = prefs.get(BTSPluginIDs.PREF_P2_UPDATE_SITE,
				BTSConstants.DEFAULT_PREF_P2_UPDATE_SITE);

		info("P2_UPDATE_SITE url " + url);
		URI uri = null;
   		try {
			uri = new URI(url);
		} catch (URISyntaxException e) {
			logger.warn(e, "P2 Update site invalid.");
			e.printStackTrace();
			setStatus(EUpdateStatusType.CHECK_FAILED);
			return Status.CANCEL_STATUS;
		}

        // set location of artifact and metadata repo
        updateOperation.getProvisioningContext().setArtifactRepositories(new URI[] { uri });
        updateOperation.getProvisioningContext().setMetadataRepositories(new URI[] { uri });

        // perform operation
        IStatus updateStatus = null;
		try {
			updateStatus = updateOperation.resolveModal(monitor);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			info("P2 Update Status not OK due to errors: ");
			e.printStackTrace();
			setStatus(EUpdateStatusType.CHECK_FAILED);
        	return Status.CANCEL_STATUS;
		}
		
		// if nothing to do, do nothing
		if (updateStatus.getCode() == UpdateOperation.STATUS_NOTHING_TO_UPDATE) {
			setStatus(EUpdateStatusType.NO_UPDATE);
			return Status.OK_STATUS;
		}

		// abort unless status ok
		if (!updateStatus.isOK()) {
			setStatus(EUpdateStatusType.CHECK_FAILED);
			return Status.CANCEL_STATUS;
		}

		// try to retrieve update job
		// obtain updates list
		updateJob = updateOperation.getProvisioningJob(monitor);
		updates = updateOperation.getPossibleUpdates();

		if (updateOperation.getPossibleUpdates() != null && updateOperation.getPossibleUpdates().length > 0) {
			info("Updates available: "+updates.length);
			for (Update u : updateOperation.getPossibleUpdates()) {
				info(" "+u.toUpdate+" >> "+u.replacement);
			}
			info(updateOperation.getResolutionDetails());
			if (status != EUpdateStatusType.UPDATE_REJECTED) {
				setStatus(EUpdateStatusType.UPDATE_AVAILABLE);
			}
			sendStatusMessage("Updates available: "+updateOperation.getPossibleUpdates().length);
			return Status.OK_STATUS;
		}

		updates = NULL_UPDATE;
		setStatus(EUpdateStatusType.NO_UPDATE);
		return Status.OK_STATUS;
	}

	private void sendStatusMessage(String msg) {
    	StatusMessage sm = BtsviewmodelFactory.eINSTANCE.createInfoMessage();
    	sm.setMessage(msg);
    	eventBroker.post("status_info/current_text_code", sm);
	}

	private void info(String msg) {
		try {
			logger.info(msg);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private boolean setStatus(EUpdateStatusType newStatus) {
		if (newStatus != status) {
			info("Change status from "+status+" to "+newStatus);
			status = newStatus;
			return true;
		}
		return false;
	}
	
}
