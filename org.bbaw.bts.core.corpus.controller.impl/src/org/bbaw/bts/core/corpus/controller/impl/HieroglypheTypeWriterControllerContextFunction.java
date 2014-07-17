package org.bbaw.bts.core.corpus.controller.impl;

import javax.inject.Inject;

import org.bbaw.bts.core.corpus.controller.impl.partController.HieroglyphTypeWriterControllerImpl;
import org.bbaw.bts.core.corpus.controller.partController.HieroglyphTypeWriterController;
import org.bbaw.bts.core.services.UserActionCounterService;
import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.MApplication;

public class HieroglypheTypeWriterControllerContextFunction extends
		ContextFunction {
	@Inject
	UserActionCounterService service;
	@Override
	public Object compute(IEclipseContext context) {
		System.out.println("Intitialize HieroglypheTypeWriterController");
		// Add the new object to the application context
		MApplication application = context.get(MApplication.class);
		IEclipseContext ctx = application.getContext();

		HieroglyphTypeWriterController controller = ContextInjectionFactory
				.make(HieroglyphTypeWriterControllerImpl.class, context);
		ctx.set(HieroglyphTypeWriterController.class, controller);

		return controller;
	}
}