/**
 * This file is part of Berlin Text System.
 * 
 * The software Berlin Text System serves as a client user interface for working with
 * text corpus data. See: aaew.bbaw.de
 * 
 * The software Berlin Text System was developed at the Berlin-Brandenburg Academy
 * of Sciences and Humanities, Jägerstr. 22/23, D-10117 Berlin.
 * www.bbaw.de
 * 
 * Copyright (C) 2013-2014  Berlin-Brandenburg Academy
 * of Sciences and Humanities
 * 
 * The software Berlin Text System was developed by @author: Christoph Plutte.
 * 
 * Berlin Text System is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Berlin Text System is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with Berlin Text System.  
 * If not, see <http://www.gnu.org/licenses/lgpl-3.0.html>.
 */
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
import org.eclipse.e4.core.services.log.Logger;
import org.eclipse.swt.graphics.Font;

/**
 * The Class BTSFontManagerImpl implements the interface BTSFontManager.
 */
public class BTSFontManagerImpl implements BTSFontManager
{

	/** The context. */
	@Inject
	private IEclipseContext context;
	
	/** The logger. */
	@Inject
	private Logger logger;
	
	/** The Constant FONT_PROVIDER_EXTENSION_POINT_ID. */
	private static final String FONT_PROVIDER_EXTENSION_POINT_ID = "org.bbaw.bts.ui.font.fontProvider";

	/* (non-Javadoc)
	 * @see org.bbaw.bts.ui.font.BTSFontManager#getFont(java.lang.String)
	 */
	@Override
	public Font getFont(String fontName)
	{
		logger.info("FontManager load font, name: " + fontName);
		IExtensionRegistry registry = ((IExtensionRegistry) context.get(IExtensionRegistry.class.getName()));

		IConfigurationElement[] config = registry.getConfigurationElementsFor(FONT_PROVIDER_EXTENSION_POINT_ID);
		logger.info("FontManager load extension, number of extensions: " + config.length);
		for (IConfigurationElement e : config)
		{
			Object o = null;
			try
			{
				o = e.createExecutableExtension("class");
			} catch (CoreException e1)
			{
				logger.error(e1);
			}
			if (o != null && o instanceof BTSFontProvider)
			{
				BTSFontProvider p = (BTSFontProvider) o;
				logger.info("FontManager load extension, BTSFontProvider name: " + p.getFontName());

				if (p.getFontName() != null && p.getFontName().equals(fontName))
				{
					return p.getFont();
				}
			}
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see org.bbaw.bts.ui.font.BTSFontManager#getAvailableFontNames()
	 */
	@Override
	public String[] getAvailableFontNames()
	{
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Gets the registered font provider.
	 *
	 * @return the registered font provider
	 * @throws CoreException the core exception
	 */
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
