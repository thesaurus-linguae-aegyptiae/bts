package org.bbaw.bts.app.lifeCycle;

import org.bbaw.bts.core.services.BTSProjectService;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.workbench.lifecycle.PostContextCreate;

public class ApplicationLifeCyleManager
{

	@PostContextCreate
	void managePostContextCreate(IEclipseContext context, BTSProjectService projectService)
	{
		System.out.println("start up");

	}
}
