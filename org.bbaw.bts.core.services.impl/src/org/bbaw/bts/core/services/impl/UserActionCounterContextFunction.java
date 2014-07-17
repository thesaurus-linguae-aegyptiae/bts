package org.bbaw.bts.core.services.impl;

import org.bbaw.bts.core.services.UserActionCounterService;
import org.bbaw.bts.core.services.impl.services.UserActionCounterServiceImpl;
import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.MApplication;

public class UserActionCounterContextFunction extends ContextFunction {
	@Override
	public Object compute(IEclipseContext context) {
		System.out.println("Intitialize UserActionCounter");
		// Add the new object to the application context
		MApplication application = context.get(MApplication.class);
		IEclipseContext ctx = application.getContext();

		UserActionCounterService service = ContextInjectionFactory.make(
				UserActionCounterServiceImpl.class, context);
		ctx.set(UserActionCounterService.class, service);

		return service;
	}
}