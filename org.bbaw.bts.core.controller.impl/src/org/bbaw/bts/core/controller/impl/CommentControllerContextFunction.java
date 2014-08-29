package org.bbaw.bts.core.controller.impl;

import org.bbaw.bts.core.controller.dialogControllers.UserManagerController;
import org.bbaw.bts.core.controller.generalController.CommentController;
import org.bbaw.bts.core.controller.impl.dialogControllers.UserManagerControllerImpl;
import org.bbaw.bts.core.controller.impl.generalController.CommentControllerImpl;
import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.MApplication;

public class CommentControllerContextFunction extends ContextFunction
{
	@Override
	public Object compute(IEclipseContext context)
	{
		System.out.println("Intitialize  CommentController");
		// Add the new object to the application context
		CommentController controller = ContextInjectionFactory.make(CommentControllerImpl.class, context);

		MApplication application = context.get(MApplication.class);

		if (application == null)
		{
			context.set(CommentController.class, controller);
		} else
		{
			IEclipseContext ctx = application.getContext();
			ctx.set(CommentController.class, controller);
		}

		return controller;
	}
}
