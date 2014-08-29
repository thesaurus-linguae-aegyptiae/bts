package org.bbaw.bts.core.services.impl;

import org.bbaw.bts.core.services.BTSCommentService;
import org.bbaw.bts.core.services.impl.services.BTSCommentServiceImpl;
import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.MApplication;

public class BTSCommentServiceContextFunction extends ContextFunction
{
	@Override
	public Object compute(IEclipseContext context)
	{
		System.out.println("Intitialize  BTSCommentService");
		// Add the new object to the application context
		MApplication application = context.get(MApplication.class);
		IEclipseContext ctx = context;
		if (application != null)
		{
			ctx= application.getContext();
		}
		if (ctx == null)
		{
			ctx = context;
		}

		 BTSCommentService service = ContextInjectionFactory.make( BTSCommentServiceImpl.class, ctx);
		ctx.set( BTSCommentService.class, service);

		return service;
	}
}