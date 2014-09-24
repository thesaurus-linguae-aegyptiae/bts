package org.bbaw.bts.core.corpus.controller.impl;

import org.bbaw.bts.core.corpus.controller.impl.partController.LemmaEditorControllerImpl;
import org.bbaw.bts.core.corpus.controller.partController.LemmaEditorController;
import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.MApplication;

public class LemmaEditorControllerContextFunction extends ContextFunction {
	@Override
	public Object compute(IEclipseContext context) {
		System.out.println("Intitialize LemmaEditorController");

		// Add the new object to the application context
		MApplication application = context.get(MApplication.class);
		IEclipseContext ctx = application.getContext();

		LemmaEditorController controller = ContextInjectionFactory.make(
				LemmaEditorControllerImpl.class, context);
		ctx.set(LemmaEditorController.class, controller);

		return controller;
	}
}
