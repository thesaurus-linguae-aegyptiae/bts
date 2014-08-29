package org.bbaw.bts.core.corpus.controller.impl;

import org.bbaw.bts.core.corpus.controller.impl.partController.AnnotationPartControllerImpl;
import org.bbaw.bts.core.corpus.controller.partController.AnnotationPartController;
import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.MApplication;

public class AnnotationPartControllerContextFunction extends ContextFunction {
	@Override
	public Object compute(IEclipseContext context) {
		System.out.println("Intitialize AnnotationPartController");

		// Add the new object to the application context
		MApplication application = context.get(MApplication.class);
		IEclipseContext ctx = application.getContext();

		AnnotationPartController controller = ContextInjectionFactory.make(
				AnnotationPartControllerImpl.class, context);
		ctx.set(AnnotationPartController.class, controller);

		return controller;
	}
}
