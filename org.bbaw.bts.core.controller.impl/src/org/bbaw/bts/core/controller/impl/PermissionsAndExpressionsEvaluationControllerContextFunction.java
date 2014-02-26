package org.bbaw.bts.core.controller.impl;

import org.bbaw.bts.core.controller.generalController.PermissionsAndExpressionsEvaluationController;
import org.bbaw.bts.core.controller.impl.generalController.PermissionsAndExpressionsEvaluationControllerImpl;
import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.MApplication;

public class PermissionsAndExpressionsEvaluationControllerContextFunction
		extends ContextFunction {
	@Override
	public Object compute(IEclipseContext context) {
		System.out
				.println("Intitialize  PermissionsAndExpressionsEvaluationController");
		// Add the new object to the application context
		PermissionsAndExpressionsEvaluationController controller = ContextInjectionFactory
				.make(PermissionsAndExpressionsEvaluationControllerImpl.class,
						context);

		MApplication application = context.get(MApplication.class);

		if (application == null) {
			context.set(PermissionsAndExpressionsEvaluationController.class,
					controller);
		} else {
			IEclipseContext ctx = application.getContext();
			ctx.set(PermissionsAndExpressionsEvaluationController.class,
					controller);
		}

		return controller;
	}
}
