package org.bbaw.bts.core.controller.impl;

import org.bbaw.bts.core.controller.impl.partController.PassportEditorPartControllerImpl;
import org.bbaw.bts.core.controller.partController.PassportEditorPartController;
import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.MApplication;

public class PassportEditorPartControllerContextFunction extends ContextFunction
{
	@Override
	public Object compute(IEclipseContext context)
	{
		System.out.println("Intitialize PassportEditorPartController");
		// Add the new object to the application context
		MApplication application = context.get(MApplication.class);
		IEclipseContext ctx = application.getContext();

		PassportEditorPartController controller = ContextInjectionFactory.make(PassportEditorPartControllerImpl.class,
				context);
		ctx.set(PassportEditorPartController.class, controller);

		return controller;
	}
}
