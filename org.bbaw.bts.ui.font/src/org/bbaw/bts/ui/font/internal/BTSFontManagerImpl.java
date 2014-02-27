package org.bbaw.bts.ui.font.internal;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.bbaw.bts.ui.font.BTSFontManager;
import org.bbaw.bts.ui.font.BTSFontProvider;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.swt.graphics.Font;

public class BTSFontManagerImpl implements BTSFontManager
{

	@Inject
	private IEclipseContext context;
	private static final String FONT_PROVIDER_EXTENSION_POINT_ID = "org.bbaw.bts.ui.font.fontProvider";

	@Override
	public Font getFont(String fontName)
	{
		IExtensionRegistry registry = ((IExtensionRegistry) context.get(IExtensionRegistry.class.getName()));

		IConfigurationElement[] config = registry.getConfigurationElementsFor(FONT_PROVIDER_EXTENSION_POINT_ID);
		for (IConfigurationElement e : config)
		{
			Object o = null;
			try
			{
				o = e.createExecutableExtension("class");
			} catch (CoreException e1)
			{
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			if (o != null && o instanceof BTSFontProvider)
			{
				BTSFontProvider p = (BTSFontProvider) o;
				if (p.getFontName() != null && p.getFontName().equals(fontName))
				{
					return p.getFont();
				}
			}
		}
		return null;
	}

	@Override
	public String[] getAvailableFontNames()
	{
		// TODO Auto-generated method stub
		return null;
	}

	private Map<String, BTSFontProvider> getRegisteredFontProvider() throws CoreException
	{
		IExtensionRegistry registry = ((IExtensionRegistry) context.get(IExtensionRegistry.class.getName()));

		IConfigurationElement[] config = registry.getConfigurationElementsFor(FONT_PROVIDER_EXTENSION_POINT_ID);
		Map<String, BTSFontProvider> providers = new HashMap<String, BTSFontProvider>(config.length);
		for (IConfigurationElement e : config)
		{
			final Object o = e.createExecutableExtension("class");
			if (o instanceof BTSFontProvider)
			{
				BTSFontProvider p = (BTSFontProvider) o;
				providers.put(p.getFontName(), p);
			}
		}
		return providers;
	}
}