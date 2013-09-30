package org.bbaw.bts.core.services.impl;

import org.bbaw.bts.core.services.BTSProjectService;
import org.bbaw.bts.core.services.impl.services.BTSProjectServiceImpl;
import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.MApplication;

public class BTSProjectServiceContextFunction extends ContextFunction
{
	@Override
	public Object compute(IEclipseContext context)
	{
		System.out.println("Intitialize BTSProjectService");
		// Add the new object to the application context
		BTSProjectService projectService = ContextInjectionFactory.make(BTSProjectServiceImpl.class, context);

		MApplication application = context.get(MApplication.class);
		// IEclipseContext ctx = application.getContext();

		context.set(BTSProjectService.class, projectService);

		return projectService;
	}
}