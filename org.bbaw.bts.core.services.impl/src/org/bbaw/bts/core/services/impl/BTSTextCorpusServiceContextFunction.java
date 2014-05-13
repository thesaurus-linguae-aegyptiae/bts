package org.bbaw.bts.core.services.impl;

import org.bbaw.bts.core.services.BTSTextCorpusService;
import org.bbaw.bts.core.services.impl.services.BTSTextCorpusServiceImpl;
import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.MApplication;

public class BTSTextCorpusServiceContextFunction extends ContextFunction
{
	@Override
	public Object compute(IEclipseContext context)
	{
		System.out.println("Intitialize BTSTextCorpusService");
		BTSTextCorpusService service = ContextInjectionFactory.make(BTSTextCorpusServiceImpl.class, context);
		// Add the new object to the application context
		MApplication application = context.get(MApplication.class);
		IEclipseContext ctx = context;
		if (application != null)
		{
			ctx= application.getContext();
		}
		if (ctx != null)
		{
			ctx.set(BTSTextCorpusService.class, service);
		}
		else
		{
			context.set(BTSTextCorpusService.class, service);
		}

		return service;
	}
}