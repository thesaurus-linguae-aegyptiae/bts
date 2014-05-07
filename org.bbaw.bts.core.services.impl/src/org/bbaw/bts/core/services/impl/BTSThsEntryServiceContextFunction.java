package org.bbaw.bts.core.services.impl;

import org.bbaw.bts.core.services.BTSThsEntryService;
import org.bbaw.bts.core.services.impl.services.BTSThsEntryServiceImpl;
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

		BTSThsEntryService service = ContextInjectionFactory.make(
				BTSThsEntryServiceImpl.class, context);
		ctx.set(BTSThsEntryService.class, service);

		return service;
	}
}
