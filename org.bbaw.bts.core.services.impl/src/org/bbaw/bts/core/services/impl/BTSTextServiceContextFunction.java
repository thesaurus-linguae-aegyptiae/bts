package org.bbaw.bts.core.services.impl;

import org.bbaw.bts.core.services.BTSTextService;
import org.bbaw.bts.core.services.impl.services.BTSTextServiceImpl;
import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.MApplication;

public class BTSTextServiceContextFunction extends ContextFunction
{
	@Override
	public Object compute(IEclipseContext context)
	{
		System.out.println("Intitialize BTSTextService");
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
		BTSTextService textService = ContextInjectionFactory.make(BTSTextServiceImpl.class, ctx);
		ctx.set(BTSTextService.class, textService);

		return textService;
	}
}