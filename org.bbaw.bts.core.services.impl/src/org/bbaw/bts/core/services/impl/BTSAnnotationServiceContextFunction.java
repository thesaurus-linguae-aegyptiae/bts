package org.bbaw.bts.core.services.impl;

import org.bbaw.bts.core.services.BTSAnnotationService;
import org.bbaw.bts.core.services.impl.services.BTSAnnotationServiceImpl;
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
		IEclipseContext ctx = application.getContext();

		BTSAnnotationService annotationService = ContextInjectionFactory.make(BTSAnnotationServiceImpl.class, context);
		ctx.set(BTSAnnotationService.class, annotationService);

		return annotationService;
	}
}