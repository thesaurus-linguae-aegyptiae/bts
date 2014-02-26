package org.bbaw.bts.core.services.impl;

import org.bbaw.bts.core.services.PermissionsAndExpressionsEvaluationService;
import org.bbaw.bts.core.services.impl.services.PermissionsAndExpressionsEvaluationServiceImpl;
import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.MApplication;

public class PermissionsAndExpressionsEvaluationServiceCF extends
		ContextFunction {
	@Override
	public Object compute(IEclipseContext context) {
		System.out
				.println("Intitialize  PermissionsAndExpressionsEvaluationService");
		// Add the new object to the application context
		PermissionsAndExpressionsEvaluationService controller = ContextInjectionFactory
				.make(PermissionsAndExpressionsEvaluationServiceImpl.class,
						context);

		MApplication application = context.get(MApplication.class);

		if (application == null) {
			context.set(PermissionsAndExpressionsEvaluationService.class,
					controller);
		} else {
			IEclipseContext ctx = application.getContext();
			ctx.set(PermissionsAndExpressionsEvaluationService.class,
					controller);
		}

		return controller;
	}
}
