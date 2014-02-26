package org.bbaw.bts.core.controller.impl;

import org.bbaw.bts.core.controller.generalController.EditingDomainController;
import org.bbaw.bts.core.controller.impl.generalController.EditingDomainControllerImpl;
import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.MApplication;

public class EditingDomainControllerContextFunction extends ContextFunction {
	@Override
	public Object compute(IEclipseContext context) {
		System.out.println("Intitialize  EditingDomainController");
		// Add the new object to the application context
		EditingDomainController controller = ContextInjectionFactory.make(
				EditingDomainControllerImpl.class, context);

		MApplication application = context.get(MApplication.class);

		if (application == null) {
			context.set(EditingDomainController.class, controller);
		} else {
			IEclipseContext ctx = application.getContext();
			ctx.set(EditingDomainController.class, controller);
		}

		return controller;
	}
}
