package org.bbaw.bts.core.services.impl;

import org.bbaw.bts.core.services.BTSListEntryService;
import org.bbaw.bts.core.services.impl.services.BTSListEntryServiceImpl;
import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.MApplication;

public class BTSListEntryServiceContextFunction extends ContextFunction
{
	@Override
	public Object compute(IEclipseContext context)
	{
		System.out.println("Intitialize services");
		// Add the new object to the application context
		MApplication application = context.get(MApplication.class);
		IEclipseContext ctx = application.getContext();

		BTSListEntryService listEntryService = ContextInjectionFactory.make(BTSListEntryServiceImpl.class, context);
		ctx.set(BTSListEntryService.class, listEntryService);

		return listEntryService;
	}
}