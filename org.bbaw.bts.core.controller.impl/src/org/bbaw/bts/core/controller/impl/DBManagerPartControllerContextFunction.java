package org.bbaw.bts.core.controller.impl;

import org.bbaw.bts.core.controller.dialogControllers.DBManagerPartController;
import org.bbaw.bts.core.controller.impl.dialogControllers.DBManagerPartControllerImpl;
import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.MApplication;

public class DBManagerPartControllerContextFunction extends ContextFunction
{
	@Override
	public Object compute(IEclipseContext context)
	{
		System.out.println("Intitialize  DBManagerPartController");
		// Add the new object to the application context
		DBManagerPartController controller = ContextInjectionFactory.make(DBManagerPartControllerImpl.class, context);

		MApplication application = context.get(MApplication.class);

		if (application == null)
		{
			context.set(DBManagerPartController.class, controller);
		} else
		{
			IEclipseContext ctx = application.getContext();
			ctx.set(DBManagerPartController.class, controller);
		}

		return controller;
	}
}
