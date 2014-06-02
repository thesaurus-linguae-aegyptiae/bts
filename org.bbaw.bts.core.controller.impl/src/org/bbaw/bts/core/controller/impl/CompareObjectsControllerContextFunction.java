package org.bbaw.bts.core.controller.impl;

import org.bbaw.bts.core.controller.dialogControllers.CompareObjectsController;
import org.bbaw.bts.core.controller.impl.dialogControllers.CompareObjectsControllerImpl;
import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.MApplication;

public class CompareObjectsControllerContextFunction extends ContextFunction
{
	@Override
	public Object compute(IEclipseContext context)
	{
		System.out.println("Intitialize  CompareObjectsController");
		// Add the new object to the application context
		CompareObjectsController controller = ContextInjectionFactory.make(CompareObjectsControllerImpl.class, context);

		MApplication application = context.get(MApplication.class);

		if (application == null)
		{
			context.set(CompareObjectsController.class, controller);
		} else
		{
			IEclipseContext ctx = application.getContext();
			ctx.set(CompareObjectsController.class, controller);
		}

		return controller;
	}
}
