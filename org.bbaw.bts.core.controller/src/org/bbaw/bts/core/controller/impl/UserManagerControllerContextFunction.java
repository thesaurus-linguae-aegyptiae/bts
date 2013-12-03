package org.bbaw.bts.core.controller.impl;

import org.bbaw.bts.core.controller.dialogControllers.UserManagerController;
import org.bbaw.bts.core.controller.impl.dialogControllers.UserManagerControllerImpl;
import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.MApplication;

public class UserManagerControllerContextFunction extends ContextFunction
{
	@Override
	public Object compute(IEclipseContext context)
	{
		System.out.println("Intitialize  UserManagerController");
		// Add the new object to the application context
		UserManagerController controller = ContextInjectionFactory.make(UserManagerControllerImpl.class, context);

		MApplication application = context.get(MApplication.class);

		if (application == null)
		{
			context.set(UserManagerController.class, controller);
		} else
		{
			IEclipseContext ctx = application.getContext();
			ctx.set(UserManagerController.class, controller);
		}

		return controller;
	}
}
