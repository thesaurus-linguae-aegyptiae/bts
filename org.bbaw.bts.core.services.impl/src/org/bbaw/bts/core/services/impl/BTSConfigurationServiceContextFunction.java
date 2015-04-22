package org.bbaw.bts.core.services.impl;

import org.bbaw.bts.core.services.BTSConfigurationService;
import org.bbaw.bts.core.services.impl.services.BTSConfigurationServiceImpl;
import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.MApplication;

public class BTSConfigurationServiceContextFunction extends ContextFunction
{
	@Override
	public Object compute(IEclipseContext context)
	{
		System.out.println("Intitialize BTSConfigurationService");
		// Add the new object to the application context
		MApplication application = context.get(MApplication.class);
		IEclipseContext ctx = context;
		if (application != null && application.getContext() != null) {
			ctx = application.getContext();
		}


		BTSConfigurationService service = ContextInjectionFactory.make(BTSConfigurationServiceImpl.class, context);
		ctx.set(BTSConfigurationService.class, service);

		return service;
	}
}