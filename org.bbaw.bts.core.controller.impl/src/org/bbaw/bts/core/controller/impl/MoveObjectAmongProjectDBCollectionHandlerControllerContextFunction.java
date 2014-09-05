package org.bbaw.bts.core.controller.impl;

import org.bbaw.bts.core.controller.handlerController.MoveObjectAmongProjectDBCollectionHandlerController;
import org.bbaw.bts.core.controller.impl.handlerController.MoveObjectAmongProjectDBCollectionHandlerControllerImpl;
import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.MApplication;

public class MoveObjectAmongProjectDBCollectionHandlerControllerContextFunction extends ContextFunction
{
	@Override
	public Object compute(IEclipseContext context)
	{
		System.out.println("Intitialize MoveObjectAmongProjectDBCollectionHandlerController");
		// Add the new object to the application context
		MApplication application = context.get(MApplication.class);
		IEclipseContext ctx = application.getContext();

		MoveObjectAmongProjectDBCollectionHandlerController controller = ContextInjectionFactory.make(
				MoveObjectAmongProjectDBCollectionHandlerControllerImpl.class, context);
		ctx.set(MoveObjectAmongProjectDBCollectionHandlerController.class, controller);

		return controller;
	}
}