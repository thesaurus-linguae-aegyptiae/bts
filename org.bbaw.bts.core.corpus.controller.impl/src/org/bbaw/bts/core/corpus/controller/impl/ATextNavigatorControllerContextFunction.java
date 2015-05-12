package org.bbaw.bts.core.corpus.controller.impl;

import org.bbaw.bts.core.corpus.controller.impl.partController.ATextNavigatorControllerImpl;
import org.bbaw.bts.core.corpus.controller.partController.ATextNavigatorController;
import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.MApplication;

public class ATextNavigatorControllerContextFunction extends ContextFunction {
	@Override
	public Object compute(IEclipseContext context) {
		System.out.println("Intitialize ATextNavigatorController");

		// Add the new object to the application context
		MApplication application = context.get(MApplication.class);
		IEclipseContext ctx = application.getContext();

		ATextNavigatorController controller = ContextInjectionFactory.make(
				ATextNavigatorControllerImpl.class, context);
		ctx.set(ATextNavigatorController.class, controller);

		return controller;
	}
}
