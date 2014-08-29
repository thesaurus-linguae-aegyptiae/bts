package org.bbaw.bts.core.services.corpus.impl;

import org.bbaw.bts.core.services.corpus.BTSAnnotationService;
import org.bbaw.bts.core.services.corpus.impl.services.BTSAnnotationServiceImpl;
import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.MApplication;

public class BTSAnnotationServiceContextFunction extends ContextFunction
{
	@Override
	public Object compute(IEclipseContext context)
	{
		System.out.println("Intitialize BTSAnnotationService");
		// Add the new object to the application context
		MApplication application = context.get(MApplication.class);
		IEclipseContext ctx = context;
		if (application != null)
		{
			ctx= application.getContext();
		}
		if (ctx == null)
		{
			ctx = context;
		}

		BTSAnnotationService annotationService =  ContextInjectionFactory.make(BTSAnnotationServiceImpl.class, ctx);
		ctx.set(BTSAnnotationService.class, annotationService);

		return annotationService;
	}
}