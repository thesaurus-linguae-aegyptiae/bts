package org.bbaw.bts.core.corpus.controller.impl;

import org.bbaw.bts.core.corpus.controller.generalController.ObjectPathController;
import org.bbaw.bts.core.corpus.controller.impl.generalController.ObjectPathControllerImpl;
import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.MApplication;

public class ObjectPathControllerContextFunction extends ContextFunction {
	@Override
	public Object compute(IEclipseContext context) {
		System.out.println("Intitialize ObjectPathController");

		// Add the new object to the application context
		MApplication application = context.get(MApplication.class);
		IEclipseContext ctx = application.getContext();

		ObjectPathController controller = ContextInjectionFactory.make(
				ObjectPathControllerImpl.class, context);
		ctx.set(ObjectPathController.class, controller);

		return controller;
	}
}