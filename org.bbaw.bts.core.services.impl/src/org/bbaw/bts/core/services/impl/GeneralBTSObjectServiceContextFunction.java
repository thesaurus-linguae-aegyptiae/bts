package org.bbaw.bts.core.services.impl;

import org.bbaw.bts.core.services.GeneralBTSObjectService;
import org.bbaw.bts.core.services.impl.services.GeneralBTSObjectServiceImpl;
import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.MApplication;

public class GeneralBTSObjectServiceContextFunction extends ContextFunction
{
	@Override
	public Object compute(IEclipseContext context)
	{
		System.out.println("Intitialize GeneralBTSObjectService");
		// Add the new object to the application context
		IEclipseContext ctx = context;
		MApplication application = context.get(MApplication.class);
		if (application != null)
		{
			ctx = application.getContext();
		}
		if (ctx == null)
		{
			ctx = context;
		}
		GeneralBTSObjectService service = ContextInjectionFactory.make(GeneralBTSObjectServiceImpl.class, ctx);
		ctx.set(GeneralBTSObjectService.class, service);

		return service;
	}
}