package org.bbaw.bts.ui.font.internal;

import org.bbaw.bts.ui.font.BTSFontManager;
import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.MApplication;

public class BTSFontManagerContextFunction extends ContextFunction
{
	@Override
	public Object compute(IEclipseContext context)
	{
		MApplication application = context.get(MApplication.class);
		if (application != null && application.getContext() != null)
		{
			context = application.getContext();
		}
		BTSFontManager fontManager;
		fontManager = ContextInjectionFactory.make(BTSFontManagerImpl.class, context);
		context.set(BTSFontManager.class, fontManager);

		return fontManager;
	}
}
