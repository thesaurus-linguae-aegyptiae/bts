package org.bbaw.bts.core.services.corpus.impl;

import org.bbaw.bts.core.services.corpus.BTSAbstractTextService;
import org.bbaw.bts.core.services.corpus.impl.services.BTSAbstractTextServiceImpl;
import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.MApplication;

public class BTSAbstractTextServiceContextFunction extends ContextFunction {
	@Override
	public Object compute(IEclipseContext context) {
		System.out.println("Intitialize BTSAbstractTextService");

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
		BTSAbstractTextService service =  ContextInjectionFactory.make(BTSAbstractTextServiceImpl.class, ctx);
				
		ctx.set(BTSAbstractTextService.class, service);

		return service;
	}
}
