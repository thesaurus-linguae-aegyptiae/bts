package org.bbaw.bts.core.controller.impl;

import org.bbaw.bts.core.controller.dialogControllers.BTSConfigurationDialogController;
import org.bbaw.bts.core.controller.impl.dialogControllers.BTSConfigurationDialogControllerImpl;
import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.MApplication;

public class BTSConfigurationDialogControllerContextFunction extends ContextFunction
{
	@Override
	public Object compute(IEclipseContext context)
	{
		System.out.println("Intitialize BTSConfigurationDialogController");
		// Add the new object to the application context
		MApplication application = context.get(MApplication.class);
		IEclipseContext ctx = application.getContext();

		BTSConfigurationDialogController controller = ContextInjectionFactory.make(
				BTSConfigurationDialogControllerImpl.class, context);
		ctx.set(BTSConfigurationDialogController.class, controller);

		return controller;
	}
}
