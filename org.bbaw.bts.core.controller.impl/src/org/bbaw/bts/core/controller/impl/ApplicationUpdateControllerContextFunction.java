package org.bbaw.bts.core.controller.impl;

import org.bbaw.bts.core.controller.generalController.ApplicationUpdateController;
import org.bbaw.bts.core.controller.impl.generalController.ApplicationUpdateControllerImpl;
import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;


public class ApplicationUpdateControllerContextFunction extends ContextFunction {
	@Override
	public Object compute(IEclipseContext context)
	{
		System.out.println("Intitialize ApplicationUpdateController");
		// Add the new object to the application context
		ApplicationUpdateController controller = ContextInjectionFactory.make(ApplicationUpdateControllerImpl.class,
				context);
		context.set(ApplicationUpdateController.class, controller);

		return controller;
	}

}
