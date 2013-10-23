package org.bbaw.bts.core.controller.impl;

import org.bbaw.bts.core.controller.impl.partController.CorpusNavigatorControllerImpl;
import org.bbaw.bts.core.controller.partController.CorpusNavigatorController;
import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.MApplication;

public class BTSCorpusNavigatorControllerContextFunction extends ContextFunction
{
	@Override
	public Object compute(IEclipseContext context)
	{
		System.out.println("Intitialize CorpusNavigatorController");
		// Add the new object to the application context
		MApplication application = context.get(MApplication.class);
		IEclipseContext ctx = application.getContext();

		CorpusNavigatorController controller = ContextInjectionFactory.make(CorpusNavigatorControllerImpl.class,
				context);
		ctx.set(CorpusNavigatorController.class, controller);

		return controller;
	}
}