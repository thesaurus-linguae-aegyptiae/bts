package org.bbaw.bts.core.corpus.controller.impl;

import org.bbaw.bts.core.corpus.controller.impl.partController.EgyTextTranslationPartControllerImpl;
import org.bbaw.bts.core.corpus.controller.partController.EgyTextTranslationPartController;
import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.MApplication;

public class EgyTextTranslationPartControllerContextFunction extends ContextFunction
{
	@Override
	public Object compute(IEclipseContext context)
	{
		System.out.println("Intitialize EgyTextTranslationPartController");

		// Add the new object to the application context
		MApplication application = context.get(MApplication.class);
		IEclipseContext ctx = application.getContext();

		EgyTextTranslationPartController controller = ContextInjectionFactory.make(EgyTextTranslationPartControllerImpl.class, context);
		ctx.set(EgyTextTranslationPartController.class, controller);

		return controller;
	}
}
