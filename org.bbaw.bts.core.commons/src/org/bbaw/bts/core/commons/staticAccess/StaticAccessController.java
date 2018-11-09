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
package org.bbaw.bts.core.commons.staticAccess;

import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.core.runtime.preferences.ConfigurationScope;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.e4.core.commands.EHandlerService;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.Preference;
import org.eclipse.e4.core.services.log.Logger;
import org.eclipse.e4.ui.services.EContextService;

/**
 * The Class StaticAccessController provides static access to EclipseContext.
 * It should be created programmatically and receive injection.
 * Then it can be statically accessed from anywhere providing convenient way to integrate
 * legacy code into E4.
 *
 * @author Christoph Plutte
 */
public class StaticAccessController {

	/** The EHandlerService. */
	@Inject
	@Optional
	private static EHandlerService service;
	
	/** The EContextService. */
	@Inject
	@Optional
	private static EContextService contextService;
	
	/** The context. */
	@Inject
	private static IEclipseContext context;

	/** The preference store. */
	private static IEclipsePreferences preferenceStore = ConfigurationScope.INSTANCE.getNode("org.bbaw.bts.app");
	@Inject
	@Named("org.bbaw.bts.ui.resources.BTSResourceProvider")
	private static Object resourceProvider;
	
	/** The logger. */
	@Inject
	private Logger logger;
	
	/**
	 * Gets the service.
	 *
	 * @return the service
	 */
	public static EHandlerService getService() {
		if (service == null)
		{
			service = context.get(EHandlerService.class);
		}
		return service;
	}


	/**
	 * Sets the service.
	 *
	 * @param service the new service
	 */
	public void setService(EHandlerService service) {
		this.service = service;
	}

	/**
	 * Gets the context service.
	 *
	 * @return the context service
	 */
	public static EContextService getContextService() {
		if (contextService == null)
		{
			contextService = context.get(EContextService.class);
		}
		return contextService;
	}

	/**
	 * Sets the context service.
	 *
	 * @param contextService the new context service
	 */
	public static void setContextService(EContextService contextService) {
		StaticAccessController.contextService = contextService;
	}

	/**
	 * Gets the resource provider.
	 *
	 * @return the resource provider
	 */
	public static Object getResourceProvider() {
		return resourceProvider;
	}

	/**
	 * Gets the context.
	 *
	 * @return the context
	 */
	public static IEclipseContext getContext() {
		return context;
	}

	/**
	 * Gets the preference store.
	 *
	 * @return the preference store
	 */
	public static Object getPreferenceStore() {
		return null;
	}


	/**
	 * Gets the logger.
	 *
	 * @return the logger
	 */
	public Logger getLogger() {
		return logger;
	}


	/**
	 * Sets the logger.
	 *
	 * @param logger the new logger
	 */
	public void setLogger(Logger logger) {
		this.logger = logger;
	}

}
