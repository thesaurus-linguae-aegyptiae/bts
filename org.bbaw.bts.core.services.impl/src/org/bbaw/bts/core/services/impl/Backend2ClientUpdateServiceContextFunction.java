package org.bbaw.bts.core.services.impl;

import org.bbaw.bts.core.services.Backend2ClientUpdateService;
import org.bbaw.bts.core.services.impl.services.Backend2ClientUpdateServiceImpl;
import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.MApplication;

public class Backend2ClientUpdateServiceContextFunction extends ContextFunction
{
	@Override
	public Object compute(IEclipseContext context)
	{
		System.out.println("Intitialize Backend2ClientUpdateService########################");
		MApplication application = context.get(MApplication.class);
		IEclipseContext ctx = application.getContext();

		Backend2ClientUpdateService service = ContextInjectionFactory.make(Backend2ClientUpdateServiceImpl.class,
				context);
		ctx.set(Backend2ClientUpdateService.class, service);
		// service.startService();
		System.out.println("Intitialized Backend2ClientUpdateService########################");

		return service;
	}
}
