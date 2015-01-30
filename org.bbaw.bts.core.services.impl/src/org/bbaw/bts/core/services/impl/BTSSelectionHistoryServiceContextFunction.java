package org.bbaw.bts.core.services.impl;

import org.bbaw.bts.core.services.BTSSelectionHistoryService;
import org.bbaw.bts.core.services.impl.services.BTSSelectionHistoryServiceImpl;
import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.MApplication;

public class BTSSelectionHistoryServiceContextFunction extends ContextFunction {
	@Override
	public Object compute(IEclipseContext context) {
		System.out.println("Intitialize Service: generic BTS Object Selection History");
		// retrieve application-wide context rather than ui-part specific 
		MApplication application = context.get(MApplication.class);
		IEclipseContext ctx = (application != null) ? application.getContext() : context;
		if (ctx == null)
			ctx = context;
		// instantiate, inject and register service
		BTSSelectionHistoryService service = ContextInjectionFactory.make(BTSSelectionHistoryServiceImpl.class, ctx);
		ctx.set(BTSSelectionHistoryService.class, service);

		return service;		
	}
}
