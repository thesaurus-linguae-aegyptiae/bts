package org.bbaw.bts.core.corpus.controller.impl;

import org.bbaw.bts.core.corpus.controller.impl.partController.LemmatizerPartControllerImpl;
import org.bbaw.bts.core.corpus.controller.partController.LemmatizerPartController;
import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.MApplication;

public class LemmatizerPartControllerContextFunction extends ContextFunction {
	@Override
	public Object compute(IEclipseContext context) {
		System.out.println("Intitialize LemmatizerPartController");

		// Add the new object to the application context
		MApplication application = context.get(MApplication.class);
		IEclipseContext ctx = application.getContext();

		LemmatizerPartController controller = ContextInjectionFactory.make(
				LemmatizerPartControllerImpl.class, context);
		ctx.set(LemmatizerPartController.class, controller);

		return controller;
	}
}