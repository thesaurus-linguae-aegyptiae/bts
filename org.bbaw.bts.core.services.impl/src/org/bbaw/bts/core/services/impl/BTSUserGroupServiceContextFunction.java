package org.bbaw.bts.core.services.impl;

import org.bbaw.bts.core.services.BTSUserGroupService;
import org.bbaw.bts.core.services.impl.services.BTSUserGroupServiceImpl;
import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.MApplication;

public class BTSUserGroupServiceContextFunction extends ContextFunction
{
	@Override
	public Object compute(IEclipseContext context)
	{
		System.out.println("Intitialize BTSUserGroupService");
		// Add the new object to the application context
		MApplication application = context.get(MApplication.class);
		IEclipseContext ctx = context;
		if (application != null && application.getContext() != null) {
			ctx = application.getContext();
		}
		if (ctx == null)
		{
			ctx = context;
		}
		BTSUserGroupService userGroupService = ContextInjectionFactory.make(BTSUserGroupServiceImpl.class, ctx);
		ctx.set(BTSUserGroupService.class, userGroupService);

		return userGroupService;
	}
}