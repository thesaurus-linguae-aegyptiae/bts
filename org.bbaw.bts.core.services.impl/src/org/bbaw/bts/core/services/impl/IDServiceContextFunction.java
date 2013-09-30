package org.bbaw.bts.core.services.impl;

import org.bbaw.bts.core.services.IDService;
import org.bbaw.bts.core.services.impl.services.IDServiceImpl;
import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.MApplication;

public class IDServiceContextFunction extends ContextFunction
{
	@Override
	public Object compute(IEclipseContext context)
	{
		System.out.println("Intitialize IDService");
		IDService idService = ContextInjectionFactory.make(IDServiceImpl.class, context);

		MApplication application = context.get(MApplication.class);
		// IEclipseContext ctx = application.getContext();

		context.set(IDService.class, idService);

		return idService;
	}
}
