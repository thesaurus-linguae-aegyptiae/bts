package org.bbaw.bts.core.services.impl;

import org.bbaw.bts.core.services.BTSEvaluationService;
import org.bbaw.bts.core.services.impl.services.BTSEvaluationServiceImpl;
import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;

public class BTSEvaluationServiceContextFunction extends ContextFunction
{

	@Override
	public Object compute(IEclipseContext context)
	{
		System.out.println("Intitialize BTSEvaluationService");
		// Add the new object to the application context
		// MApplication application = context.get(MApplication.class);
		// IEclipseContext ctx = application.getContext();
		//
		BTSEvaluationService service = ContextInjectionFactory.make(BTSEvaluationServiceImpl.class, context);
		context.set(BTSEvaluationService.class, service);

		return service;
	}
}
