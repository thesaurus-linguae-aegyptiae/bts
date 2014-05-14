package org.bbaw.bts.e4.p2;


import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.net.URISyntaxException;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.equinox.p2.core.IProvisioningAgent;
import org.eclipse.equinox.p2.core.ProvisionException;
import org.eclipse.equinox.p2.operations.ProvisioningJob;
import org.eclipse.equinox.p2.operations.ProvisioningSession;
import org.eclipse.equinox.p2.operations.UpdateOperation;
import org.eclipse.equinox.p2.repository.artifact.IArtifactRepositoryManager;
import org.eclipse.equinox.p2.repository.metadata.IMetadataRepositoryManager;

public class P2Util {

//	private static Logger LOG = Logger.getLogger(P2Util.class);

	public static IStatus checkForUpdates(IProvisioningAgent agent, IProgressMonitor monitor) throws Exception {

		try {
			addUpdateSite(agent);

			ProvisioningSession session = new ProvisioningSession(agent);
			// the default update operation looks for updates to the currently
			// running profile, using the default profile root marker. To change
			// which installable units are being updated, use the more detailed
			// constructors.
			UpdateOperation operation = new UpdateOperation(session);
			SubMonitor sub = SubMonitor.convert(monitor, "Checking for application updates...", 200);
			IStatus status = operation.resolveModal(sub.newChild(100));
			if (status.getCode() == UpdateOperation.STATUS_NOTHING_TO_UPDATE) {
				return status;
			}
			if (status.getSeverity() == IStatus.CANCEL)
				throw new OperationCanceledException();

			if (status.getSeverity() != IStatus.ERROR) {
				// More complex status handling might include showing the user what updates
				// are available if there are multiples, differentiating patches vs. updates, etc.
				// In this example, we simply update as suggested by the operation.
				ProvisioningJob job = operation.getProvisioningJob(null);
				status = job.runModal(sub.newChild(100));
				if (status.getSeverity() == IStatus.CANCEL)
					throw new OperationCanceledException();
			}

			return status;

		} catch (Throwable ex) {
//			LOG.error(ex);
			return null;

		} finally {
			// if (useProxy) {
			// proxySettings.resetProxy();
			// }
		}
	}

	private static void addUpdateSite(IProvisioningAgent provisioningAgent) throws InvocationTargetException {
		// Load repository manager
		IMetadataRepositoryManager metadataManager = (IMetadataRepositoryManager) provisioningAgent.getService(IMetadataRepositoryManager.SERVICE_NAME);
		if (metadataManager == null) {
			System.err.println("Metadata manager was null");
			Throwable throwable = new Throwable("Could not load Metadata Repository Manager");
			throwable.fillInStackTrace();
			throw new InvocationTargetException(throwable);
		}

		// Load artifact manager
		IArtifactRepositoryManager artifactManager = (IArtifactRepositoryManager) provisioningAgent.getService(IArtifactRepositoryManager.SERVICE_NAME);
		if (artifactManager == null) {
			System.err.println("Artifact manager was null");
			Throwable throwable = new Throwable("Could not load Artifact Repository Manager");
			throwable.fillInStackTrace();
			throw new InvocationTargetException(throwable);
		}

		// Load repo
		try {
			// create uri
	        URI repoLocation = new URI("http://localhost:8080/bts/");
	        

			System.out.println("Adding repository " + repoLocation);
			metadataManager.loadRepository(repoLocation, null);
			artifactManager.loadRepository(repoLocation, null);

		} catch (ProvisionException pe) {
			System.err.println("Caught provisioning exception " + pe.getMessage()/* , pe */);
			throw new InvocationTargetException(pe);

		} catch (URISyntaxException e) {
			System.err.println("Caught URI syntax exception " + e.getMessage()/* , e */);
			throw new InvocationTargetException(e);
		}
	}
}
