package org.bbaw.bts.core.services.impl;

import org.bbaw.bts.core.services.BTSUserService;
import org.bbaw.bts.core.services.impl.services.BTSUserServiceImpl;
import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.MApplication;

public class BTSUserServiceContextFunction extends ContextFunction
{
	@Override
	public Object compute(IEclipseContext context)
	{
		System.out.println("Intitialize BTSUserService");
		// Add the new object to the application context
		MApplication application = context.get(MApplication.class);
		IEclipseContext ctx = application.getContext();

		BTSUserService userService = ContextInjectionFactory.make(BTSUserServiceImpl.class, context);
		ctx.set(BTSUserService.class, userService);

		return userService;
	}
}