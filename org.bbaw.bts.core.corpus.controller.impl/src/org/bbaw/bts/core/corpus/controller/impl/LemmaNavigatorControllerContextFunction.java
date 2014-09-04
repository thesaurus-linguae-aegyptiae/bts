package org.bbaw.bts.core.corpus.controller.impl;

import org.bbaw.bts.core.corpus.controller.impl.partController.LemmaNavigatorControllerImpl;
import org.bbaw.bts.core.corpus.controller.partController.LemmaNavigatorController;
import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.MApplication;

public class LemmaNavigatorControllerContextFunction extends ContextFunction{

	@Override
	public Object compute(IEclipseContext context) {
		System.out.println("Intitialize LemmaNavigatorController");

		// Add the new object to the application context
		MApplication application = context.get(MApplication.class);
		IEclipseContext ctx = application.getContext();

		LemmaNavigatorController controller = ContextInjectionFactory.make(
				LemmaNavigatorControllerImpl.class, context);
		ctx.set(LemmaNavigatorController.class, controller);

		return controller;
	}
}
