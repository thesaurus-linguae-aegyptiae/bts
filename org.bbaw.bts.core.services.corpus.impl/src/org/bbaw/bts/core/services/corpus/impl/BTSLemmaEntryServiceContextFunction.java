package org.bbaw.bts.core.services.corpus.impl;

import org.bbaw.bts.core.services.corpus.BTSLemmaEntryService;
import org.bbaw.bts.core.services.corpus.impl.services.BTSLemmaEntryServiceImpl;
import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.MApplication;

public class BTSLemmaEntryServiceContextFunction extends ContextFunction
{
	@Override
	public Object compute(IEclipseContext context)
	{
		System.out.println("Intitialize services");
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
		BTSLemmaEntryService listEntryService =  ContextInjectionFactory.make(BTSLemmaEntryServiceImpl.class, ctx);
		ctx.set(BTSLemmaEntryService.class, listEntryService);

		return listEntryService;
	}
}