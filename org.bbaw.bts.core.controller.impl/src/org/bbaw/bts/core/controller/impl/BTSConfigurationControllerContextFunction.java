package org.bbaw.bts.core.controller.impl;

import org.bbaw.bts.core.controller.generalController.BTSConfigurationController;
import org.bbaw.bts.core.controller.impl.generalController.BTSConfigurationControllerImpl;
import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.MApplication;

public class BTSConfigurationControllerContextFunction extends ContextFunction
{
	@Override
	public Object compute(IEclipseContext context)
	{
		System.out.println("Intitialize BTSConfigurationController");
		// Add the new object to the application context
		MApplication application = context.get(MApplication.class);
		IEclipseContext ctx = application.getContext();

		BTSConfigurationController controller = ContextInjectionFactory.make(BTSConfigurationControllerImpl.class,
				context);
		ctx.set(BTSConfigurationController.class, controller);

		return controller;
	}
}