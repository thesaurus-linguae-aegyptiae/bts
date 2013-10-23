package org.bbaw.bts.app.lifeCycle;

import javax.inject.Inject;

import org.bbaw.bts.core.controller.generalController.ApplicationStartupController;
import org.bbaw.bts.core.services.BTSProjectService;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.workbench.lifecycle.PostContextCreate;
import org.eclipse.equinox.app.IApplicationContext;

public class ApplicationLifeCyleManager
{

	@Inject
	private ApplicationStartupController applicationStartupController;

	@PostContextCreate
	void managePostContextCreate(IEclipseContext context, BTSProjectService projectService,
			IApplicationContext appContext)
	{
		applicationStartupController.applicationStartup(context, projectService, appContext);

	}
}
