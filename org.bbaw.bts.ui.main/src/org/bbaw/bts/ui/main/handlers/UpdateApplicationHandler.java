 
package org.bbaw.bts.ui.main.handlers;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Set;

import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.commons.BTSPluginIDs;
import org.bbaw.bts.e4.p2.P2Util;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.extensions.Preference;
import org.eclipse.e4.core.services.log.Logger;
import org.eclipse.e4.ui.di.UISynchronize;
import org.eclipse.e4.ui.workbench.IWorkbench;
import org.eclipse.equinox.p2.core.IProvisioningAgent;
import org.eclipse.equinox.p2.engine.IProfile;
import org.eclipse.equinox.p2.engine.IProfileRegistry;
import org.eclipse.equinox.p2.engine.ProvisioningContext;
import org.eclipse.equinox.p2.operations.ProvisioningJob;
import org.eclipse.equinox.p2.operations.ProvisioningSession;
import org.eclipse.equinox.p2.operations.Update;
import org.eclipse.equinox.p2.operations.UpdateOperation;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;


public class UpdateApplicationHandler {
		      

		  @Execute
		  public void execute(final IProvisioningAgent agent, final Shell parent,
		      final UISynchronize sync, final IWorkbench workbench, final Logger logger,
		      final @Preference(nodePath = "org.bbaw.bts.app") IEclipsePreferences prefs) {
		    Job j = new Job("Update Job") {
		      private boolean doInstall = false;

		      @Override
		      protected IStatus run(final IProgressMonitor monitor) {

		        /* 1. Prepare update plumbing */

		        final ProvisioningSession session = new ProvisioningSession(agent);
		        final UpdateOperation operation = new UpdateOperation(session);

		        // create uri
		        String urlString = prefs.get(BTSPluginIDs.PREF_P2_UPDATE_SITE, BTSConstants.DEFAULT_PREF_P2_UPDATE_SITE);
		        logger.info("P2_UPDATE_SITE url " + urlString);
		        URI uri = null;
		        try {
		          uri = new URI(urlString);
		        } catch (final URISyntaxException e) {
		          sync.syncExec(new Runnable() {
		            @Override
		            public void run() {
		              MessageDialog
		              .openError(parent, "URI invalid", e.getMessage());
		            }
		          });
		          return Status.CANCEL_STATUS;
		        }

		        // set location of artifact and metadata repo
		        operation.getProvisioningContext().setArtifactRepositories(new URI[] { uri });
		        operation.getProvisioningContext().setMetadataRepositories(new URI[] { uri });

		        /* 2. check for updates */


				SubMonitor sub = SubMonitor.convert(new NullProgressMonitor(), "Checking for application updates...", 200);
				IStatus status2 = operation.resolveModal(sub.newChild(100));
		        logger.info("P2 Update Status : " + status2.getCode());

		        // run update checks causing I/O
		        final IStatus status = operation.resolveModal(monitor);

		        logger.info("P2 Update Status : " + status.getCode());
		        // failed to find updates (inform user and exit)
		        if (status.getCode() == UpdateOperation.STATUS_NOTHING_TO_UPDATE) {
		          sync.syncExec(new Runnable() {
		            @Override
		            public void run() {
		              MessageDialog
		                  .openWarning(parent, "No update",
		                      "No updates for the current installation have been found");
		            }
		          });
		         
		          return Status.CANCEL_STATUS;
		        }

		        /* 3. Ask if updates should be installed and run installation */

		        // found updates, ask user if to install?
		        if (status.isOK() && status.getSeverity() != IStatus.ERROR) {
		          sync.syncExec(new Runnable() {
		            @Override
		            public void run() {
		              String updates = "";
		              Update[] possibleUpdates = operation
		                  .getPossibleUpdates();
		              for (Update update : possibleUpdates) {
		                updates += update + "\n";
		              }
		              doInstall = MessageDialog.openQuestion(parent,
		                  "Really install updates?", updates);
		            }
		          });
		        }

		        // start installation
		        if (doInstall) {
		          final ProvisioningJob provisioningJob = operation
		              .getProvisioningJob(monitor);
		          // updates cannot run from within Eclipse IDE!!!
		          if (provisioningJob == null) {
		            System.err
		                .println("Running update from within Eclipse IDE? This won't work!!!");
		            throw new NullPointerException();
		          }

		          // register a job change listener to track
		          // installation progress and notify user upon success
		          provisioningJob
		              .addJobChangeListener(new JobChangeAdapter() {
		                @Override
		                public void done(IJobChangeEvent event) {
		                  if (event.getResult().isOK()) {
		                    sync.syncExec(new Runnable() {

		                      @Override
		                      public void run() {
		                        boolean restart = MessageDialog
		                            .openQuestion(parent,
		                                "Updates installed, restart?",
		                                "Updates have been installed successfully, do you want to restart?");
		                        if (restart) {
		                          workbench.restart();
		                        }
		                      }
		                    });

		                  }
		                  super.done(event);
		                }
		              });

		          provisioningJob.schedule();
		        }
		        return Status.OK_STATUS;
		      }
		    };
		    j.schedule();
		  }
		} 