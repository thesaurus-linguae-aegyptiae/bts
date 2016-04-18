package org.bbaw.bts.core.controller.impl.generalController;

import java.net.URI;
import java.net.URISyntaxException;

import javax.inject.Inject;

import org.bbaw.bts.btsviewmodel.BtsviewmodelFactory;
import org.bbaw.bts.btsviewmodel.StatusMessage;
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
import org.eclipse.equinox.p2.operations.ProvisioningSession;
import org.eclipse.equinox.p2.operations.Update;
import org.eclipse.equinox.p2.operations.UpdateOperation;
import org.eclipse.jface.dialogs.MessageDialog;

@SuppressWarnings("restriction")
public class ApplicationUpdateControllerImpl extends Job implements
		ApplicationUpdateController {

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
	private volatile EUpdateStatusType status;
	private boolean updatePending;
	private long timeStamp;

	//public final String DEFAULT_PREF_P2_UPDATE_SITE = "http://telota.bbaw.de/bts-update/update-3.x/repository_3.0.15/";
	public final String DEFAULT_PREF_P2_UPDATE_SITE = "file:///D:/GIT/aaew/bts-git/aaew-bts/org.bbaw.bts.app.product/target/repository/";
	
	public ApplicationUpdateControllerImpl() {
		super("Application Update Check Job");
		updateJob = null;
		updates = null;
		status = EUpdateStatusType.NO_UPDATE;
		updatePending = false;
		timeStamp = 0;
		schedule();
	}
	
	@Override
	public boolean isUpdateAvailable() {
		info("Return Software Update availability.");
		if (updates != null) { 
			if (updates.length > 0) {
				assert status == EUpdateStatusType.UPDATE_AVAILABLE;
				return true;
			} else {
				info("No software updates.");
			}
		} else {
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
		if (updates != null && updates.length > 0) {
        	info("Updates available: "+updates.length);
        	for (Update u : updates) {
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
					status = EUpdateStatusType.UPDATE_RUNNING;
					super.running(event);
				}
				
				@Override
				public void done(IJobChangeEvent event) {
					info("update job done. "+event);
					status = event.getResult().isOK() ?
							EUpdateStatusType.UPDATE_SUCCESS
							: EUpdateStatusType.UPDATE_FAILED;
					updatePending = false;
					updateJob = null;
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
		agent = context.get(IProvisioningAgent.class);
		if (workbench != null && agent != null) {
			IStatus runStatus = checkForUpdates(monitor);
			schedule(TIME_UNTIL_RECHECK);
			info("Update Check Controller Status: "+status+"\nStatus of last check: "+runStatus);
			if (status == EUpdateStatusType.UPDATE_AVAILABLE) {
				if (!updatePending) {
					confirmInstallation();
				} else {
					scheduleUpdate();
				}
			}
			return runStatus;
		} else {
			info("Update Checker: Waiting for Workbench initialization.");
			schedule(2000);
			return Status.CANCEL_STATUS;
		}
	}
	
	private void confirmInstallation() {
		sync.syncExec(new Runnable() {
			 
            @Override
            public void run() {
            	String msg = "";
            	for (Update u : updates) {
            		msg += "\n" + u;
            	}
                boolean performUpdate = MessageDialog.openQuestion(
                        null,
                        "Updates available",
                        "There are updates available. Do you want to install them now?\n"+msg);
                if (performUpdate) {
                	info("Installation of Updates confirmed.");
                	updatePending = true;
                	scheduleUpdate();
                } else {
                	status = EUpdateStatusType.UPDATE_DECLINED;
                }
            }
        });
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
			if (updates != null) {
				status = (updates.length > 0)
						? EUpdateStatusType.UPDATE_AVAILABLE
						: EUpdateStatusType.NO_UPDATE;
				return Status.CANCEL_STATUS;
			} else {
				logger.warn("Check for updates anyway.");
			}
		}
		// if more than specified time since latest update, re-check
		status = EUpdateStatusType.CHECK_RUNNING;
		timeStamp = now;

		// set up provisioning services
		ProvisioningSession session = new ProvisioningSession(agent);
		UpdateOperation operation = new UpdateOperation(session);

		// lookup repository URL: try app configuration, use hard coded default
		IEclipsePreferences prefs = ConfigurationScope.INSTANCE.getNode("org.bbaw.bts.app");
		String url = prefs.get(BTSPluginIDs.PREF_P2_UPDATE_SITE,
				DEFAULT_PREF_P2_UPDATE_SITE);

		info("P2_UPDATE_SITE url " + url);
		URI uri = null;
   		try {
			uri = new URI(url);
		} catch (URISyntaxException e) {
			logger.warn(e, "P2 Update site invalid.");
			e.printStackTrace();
			status = EUpdateStatusType.CHECK_FAILED;
			return Status.CANCEL_STATUS;
		}
   		
        // set location of artifact and metadata repo
        operation.getProvisioningContext().setArtifactRepositories(new URI[] { uri });
        operation.getProvisioningContext().setMetadataRepositories(new URI[] { uri });
        
        // perform operation
        IStatus updateStatus = operation.resolveModal(monitor);
        info("P2 Update Status : " + updateStatus.getCode());
        
        // if nothing to do, do nothing
        if (updateStatus.getCode() == UpdateOperation.STATUS_NOTHING_TO_UPDATE) {
        	status = EUpdateStatusType.NO_UPDATE;
        	return Status.OK_STATUS;
        }
        
        // abort unless status ok
        if (!updateStatus.isOK()) {
        	status = EUpdateStatusType.CHECK_FAILED;
        	return Status.CANCEL_STATUS;
        }
        
        // try to retrieve update job
        // obtain updates list
		updateJob = operation.getProvisioningJob(monitor);
        updates = operation.getPossibleUpdates();
        
        if (updates != null && updates.length > 0) {
        	info("Updates available: "+updates.length);
        	for (Update u : updates) {
        		info(" "+u.toUpdate+" >> "+u.replacement);
        	}
        	info(operation.getResolutionDetails());
        	status = EUpdateStatusType.UPDATE_AVAILABLE;
        	sendStatusMessage("Updates available: "+updates.length);
        	return Status.OK_STATUS;
        }
        
        updates = new Update[0];
        status = EUpdateStatusType.NO_UPDATE;
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
	
}
