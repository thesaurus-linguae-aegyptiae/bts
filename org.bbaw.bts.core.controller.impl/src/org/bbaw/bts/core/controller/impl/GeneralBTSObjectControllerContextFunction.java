package org.bbaw.bts.core.controller.impl;

import org.bbaw.bts.core.controller.generalController.GeneralBTSObjectController;
import org.bbaw.bts.core.controller.impl.generalController.GeneralBTSObjectControllerImpl;
import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.MApplication;

public class GeneralBTSObjectControllerContextFunction extends ContextFunction
{
	@Override
	public Object compute(IEclipseContext context)
	{
		System.out.println("Intitialize GeneralBTSObjectController");
		GeneralBTSObjectController controller = ContextInjectionFactory.make(GeneralBTSObjectControllerImpl.class,
				context);
		MApplication application = context.get(MApplication.class);
		if (application == null)
		{
			context.set(GeneralBTSObjectController.class, controller);
		} else
		{
			IEclipseContext ctx = application.getContext();
			ctx.set(GeneralBTSObjectController.class, controller);
		}

		return controller;
	}
}
