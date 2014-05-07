package org.bbaw.bts.core.services.impl;

import org.bbaw.bts.core.services.CorpusObjectService;
import org.bbaw.bts.core.services.impl.services.CorpusObjectServiceImpl;
import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.MApplication;

public class CorpusObjectServiceContextFunction extends ContextFunction
{
	@Override
	public Object compute(IEclipseContext context)
	{
		System.out.println("Intitialize CorpusObjectService");

		MApplication application = context.get(MApplication.class);
		IEclipseContext ctx = context;
		if (application != null)
		{
			ctx= application.getContext();
		}

		CorpusObjectService corpusObjectService = ContextInjectionFactory.make(CorpusObjectServiceImpl.class, context);
		ctx.set(CorpusObjectService.class, corpusObjectService);

		return corpusObjectService;
	}
}