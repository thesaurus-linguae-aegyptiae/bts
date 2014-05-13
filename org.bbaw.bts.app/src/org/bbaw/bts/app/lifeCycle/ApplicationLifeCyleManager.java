package org.bbaw.bts.app.lifeCycle;

import javax.inject.Inject;

import org.bbaw.bts.core.controller.generalController.ApplicationStartupController;
import org.bbaw.bts.core.services.BTSProjectService;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.services.log.Logger;
import org.eclipse.e4.ui.di.UISynchronize;
import org.eclipse.e4.ui.workbench.IWorkbench;
import org.eclipse.e4.ui.workbench.lifecycle.PostContextCreate;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.equinox.p2.core.IProvisioningAgent;

public class ApplicationLifeCyleManager
{

	@PostContextCreate
	void managePostContextCreate(IEclipseContext context, BTSProjectService projectService,
			IApplicationContext appContext, Logger logger, ApplicationStartupController applicationStartupController)
	{
		logger.info("ApplicationStartupControllerImpl.applicationStartup");
		applicationStartupController.applicationStartup(context, projectService, appContext);
	}
}
