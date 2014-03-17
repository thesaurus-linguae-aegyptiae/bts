package org.bbaw.bts.core.corpus.controller.impl;

import org.bbaw.bts.core.corpus.controller.impl.partController.ThsNavigatorControllerImpl;
import org.bbaw.bts.core.corpus.controller.partController.ThsNavigatorController;
import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.MApplication;

public class ThsNavigatorControllerContextFunction extends ContextFunction {
	@Override
	public Object compute(IEclipseContext context) {
		System.out.println("Intitialize ThsNavigatorController");

		// Add the new object to the application context
		MApplication application = context.get(MApplication.class);
		IEclipseContext ctx = application.getContext();

		ThsNavigatorController controller = ContextInjectionFactory.make(
				ThsNavigatorControllerImpl.class, context);
		ctx.set(ThsNavigatorController.class, controller);

		return controller;
	}
}
