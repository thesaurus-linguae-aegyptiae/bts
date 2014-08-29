package org.bbaw.bts.core.services.impl;

import org.bbaw.bts.core.services.BTSStatusMessageService;
import org.bbaw.bts.core.services.impl.services.BTSStatusMessageServiceImpl;
import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.MApplication;

public class BTSStatusMessageServiceContextFunction extends ContextFunction
{
	@Override
	public Object compute(IEclipseContext context)
	{
		System.out.println("Intitialize BTSStatusMessageService");
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

		BTSStatusMessageService service = ContextInjectionFactory.make(BTSStatusMessageServiceImpl.class, ctx);
		ctx.set(BTSStatusMessageService.class, service);

		return service;
	}
}