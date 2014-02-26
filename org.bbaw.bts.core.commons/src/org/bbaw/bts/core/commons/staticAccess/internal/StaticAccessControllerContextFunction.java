package org.bbaw.bts.core.commons.staticAccess.internal;

import org.bbaw.bts.core.commons.staticAccess.StaticAccessController;
import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;

public class StaticAccessControllerContextFunction extends ContextFunction {
	@Override
	public Object compute(IEclipseContext context) {
		System.out.println("Intitialize StaticAccessController");
		// Add the new object to the application context
		// MApplication application = context.get(MApplication.class);
		// IEclipseContext ctx = application.getContext();

		StaticAccessController controller = ContextInjectionFactory.make(
				StaticAccessController.class, context);
		context.set(StaticAccessController.class, controller);

		return controller;
	}
}
