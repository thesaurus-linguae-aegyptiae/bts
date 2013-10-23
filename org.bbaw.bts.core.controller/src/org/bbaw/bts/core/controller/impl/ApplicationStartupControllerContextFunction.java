package org.bbaw.bts.core.controller.impl;

import org.bbaw.bts.core.controller.generalController.ApplicationStartupController;
import org.bbaw.bts.core.controller.impl.generalController.ApplicationStartupControllerImpl;
import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;

public class ApplicationStartupControllerContextFunction extends ContextFunction
{
	@Override
	public Object compute(IEclipseContext context)
	{
		System.out.println("Intitialize ApplicationStartupController");
		// Add the new object to the application context
		// MApplication application = context.get(MApplication.class);
		// IEclipseContext ctx = application.getContext();

		ApplicationStartupController controller = ContextInjectionFactory.make(ApplicationStartupControllerImpl.class,
				context);
		context.set(ApplicationStartupController.class, controller);

		return controller;
	}
}
