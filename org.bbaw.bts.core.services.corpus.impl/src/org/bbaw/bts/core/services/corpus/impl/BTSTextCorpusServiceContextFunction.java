package org.bbaw.bts.core.services.corpus.impl;

import org.bbaw.bts.core.services.corpus.BTSTextCorpusService;
import org.bbaw.bts.core.services.corpus.impl.services.BTSTextCorpusServiceImpl;
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
		// Add the new object to the application context
		MApplication application = context.get(MApplication.class);
		IEclipseContext ctx = context;
		if (application != null)
		{
			ctx= application.getContext();
		}
		BTSTextCorpusService service =  ContextInjectionFactory.make(BTSTextCorpusServiceImpl.class, context);

		ctx.set(BTSTextCorpusService.class, service);

		return service;
	}
}