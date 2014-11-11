package org.bbaw.bts.core.controller.impl;

import org.bbaw.bts.core.controller.generalController.DBAdminController;
import org.bbaw.bts.core.controller.impl.generalController.DBAdminControllerImpl;
import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.MApplication;

public class DBAdminControllerContextFunction extends ContextFunction
{
	@Override
	public Object compute(IEclipseContext context)
	{
		System.out.println("Intitialize  DBAdminController");
		// Add the new object to the application context
		DBAdminController controller = ContextInjectionFactory.make(DBAdminControllerImpl.class, context);

		MApplication application = context.get(MApplication.class);

		if (application == null)
		{
			context.set(DBAdminController.class, controller);
		} else
		{
			IEclipseContext ctx = application.getContext();
			ctx.set(DBAdminController.class, controller);
		}

		return controller;
	}
}
