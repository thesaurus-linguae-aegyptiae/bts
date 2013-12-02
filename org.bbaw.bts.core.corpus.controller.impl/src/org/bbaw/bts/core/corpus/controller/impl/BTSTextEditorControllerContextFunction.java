package org.bbaw.bts.core.corpus.controller.impl;

import org.bbaw.bts.core.corpus.controller.impl.partController.BTSTextEditorControllerImpl;
import org.bbaw.bts.core.corpus.controller.partController.BTSTextEditorController;
import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.MApplication;

public class BTSTextEditorControllerContextFunction extends ContextFunction
{
	@Override
	public Object compute(IEclipseContext context)
	{
		System.out.println("Intitialize BTSTextEditorController");

		// Add the new object to the application context
		MApplication application = context.get(MApplication.class);
		IEclipseContext ctx = application.getContext();

		BTSTextEditorController controller = ContextInjectionFactory.make(BTSTextEditorControllerImpl.class, context);
		ctx.set(BTSTextEditorController.class, controller);

		return controller;
	}
}
