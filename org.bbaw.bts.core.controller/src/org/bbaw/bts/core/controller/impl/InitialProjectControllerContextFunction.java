package org.bbaw.bts.core.controller.impl;

import org.bbaw.bts.core.controller.generalController.BTSProjectController;
import org.bbaw.bts.core.controller.impl.generalController.BTSProjectControllerImpl;
import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.MApplication;

public class InitialProjectControllerContextFunction extends ContextFunction
{
	@Override
	public Object compute(IEclipseContext context)
	{
		System.out.println("Intitialize InitialProjectController");
		// Add the new object to the application context
		MApplication application = context.get(MApplication.class);
		IEclipseContext ctx = application.getContext();

		BTSProjectController controller = ContextInjectionFactory.make(BTSProjectControllerImpl.class, context);
		ctx.set(BTSProjectController.class, controller);

		return controller;
	}
}