package org.bbaw.bts.core.services.impl;

import org.bbaw.bts.core.services.GeneralMoveObjectAmongProjectsService;
import org.bbaw.bts.core.services.impl.services.GeneralMoveObjectAmongProjectsServiceImpl;
import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.MApplication;

public class GeneralMoveObjectAmongProjectsServiceContextFunction extends ContextFunction
{
	@Override
	public Object compute(IEclipseContext context)
	{
		System.out.println("Intitialize GeneralMoveObjectAmongProjectsService");
		// Add the new object to the application context
		IEclipseContext ctx = context;
		MApplication application = context.get(MApplication.class);
		if (application != null)
		{
			ctx = application.getContext();
		}

		GeneralMoveObjectAmongProjectsService service = ContextInjectionFactory.make(GeneralMoveObjectAmongProjectsServiceImpl.class, ctx);
		ctx.set(GeneralMoveObjectAmongProjectsService.class, service);

		return service;
	}
}