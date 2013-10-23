package org.bbaw.bts.core.controller.impl;

import org.bbaw.bts.core.controller.handlerController.Backend2ClientUpdateHandlerController;
import org.bbaw.bts.core.controller.impl.handlerController.Backend2ClientUpdateHandlerControllerImpl;
import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.MApplication;

public class Backend2ClientUpdateHandlerControllerContextFunction extends ContextFunction
{
	@Override
	public Object compute(IEclipseContext context)
	{
		System.out.println("Intitialize Backend2ClientUpdateHandlerController");
		// Add the new object to the application context
		MApplication application = context.get(MApplication.class);
		IEclipseContext ctx = application.getContext();

		Backend2ClientUpdateHandlerController controller = ContextInjectionFactory.make(
				Backend2ClientUpdateHandlerControllerImpl.class, context);
		ctx.set(Backend2ClientUpdateHandlerController.class, controller);

		return controller;
	}
}