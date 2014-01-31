package org.bbaw.bts.core.services.impl;

import org.bbaw.bts.core.services.GraphicSelectionCounterService;
import org.bbaw.bts.core.services.impl.services.GraphicSelectionCounterServiceImpl;
import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.MApplication;

public class GraphicSelectionCounterContextFunction extends ContextFunction {
	@Override
	public Object compute(IEclipseContext context) {
		System.out.println("Intitialize GraphicSelectionCounterService");
		// Add the new object to the application context
		MApplication application = context.get(MApplication.class);
		IEclipseContext ctx = application.getContext();

		GraphicSelectionCounterService service = ContextInjectionFactory.make(
				GraphicSelectionCounterServiceImpl.class, context);
		ctx.set(GraphicSelectionCounterService.class, service);

		return service;
	}
}