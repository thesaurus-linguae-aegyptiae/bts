package org.bbaw.bts.core.services.corpus.impl;

import org.bbaw.bts.core.services.corpus.BTSThsEntryService;
import org.bbaw.bts.core.services.corpus.impl.services.BTSThsEntryServiceImpl;
import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.MApplication;

public class BTSThsEntryServiceContextFunction extends ContextFunction {
	@Override
	public Object compute(IEclipseContext context) {
		System.out.println("Intitialize BTSThsEntryService");

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
		BTSThsEntryService service =  ContextInjectionFactory.make(BTSThsEntryServiceImpl.class, ctx);
				
		ctx.set(BTSThsEntryService.class, service);

		return service;
	}
}
