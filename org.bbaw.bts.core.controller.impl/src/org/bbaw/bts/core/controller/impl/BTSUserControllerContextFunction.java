package org.bbaw.bts.core.controller.impl;

import org.bbaw.bts.core.controller.generalController.BTSUserController;
import org.bbaw.bts.core.controller.impl.generalController.BTSUserControllerImpl;
import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.MApplication;

public class BTSUserControllerContextFunction extends ContextFunction {
	@Override
	public Object compute(IEclipseContext context) {
		System.out.println("Intitialize BTSUserController");
		// Add the new object to the application context
		MApplication application = context.get(MApplication.class);
		IEclipseContext ctx = context;
		if (application != null && application.getContext() != null) {
			ctx = application.getContext();
		}

		BTSUserController controller = ContextInjectionFactory.make(
				BTSUserControllerImpl.class, context);
		ctx.set(BTSUserController.class, controller);

		return controller;
	}
}
