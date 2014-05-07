package org.bbaw.bts.core.commons.staticAccess;

import javax.inject.Inject;

import org.bbaw.bts.ui.resources.BTSResourceProvider;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.e4.core.commands.EHandlerService;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.extensions.Preference;
import org.eclipse.e4.core.services.log.Logger;
import org.eclipse.e4.ui.services.EContextService;
import org.eclipse.jface.preference.IPreferenceStore;

public class StaticAccessController {

	@Inject
	private static EHandlerService service;
	@Inject
	private static EContextService contextService;
	@Inject
	private static BTSResourceProvider resourceProvider;
	@Inject
	private static IEclipseContext context;
	@Inject
	@Preference
	private static IEclipsePreferences preferenceStore;
	
	@Inject
	private Logger logger;
	
	public static EHandlerService getService() {
		return service;
	}


	public void setService(EHandlerService service) {
		this.service = service;
	}

	public static EContextService getContextService() {
		return contextService;
	}

	public static void setContextService(EContextService contextService) {
		StaticAccessController.contextService = contextService;
	}

	public static BTSResourceProvider getResourceProvider() {
		return resourceProvider;
	}

	public static IEclipseContext getContext() {
		return context;
	}

	public static IPreferenceStore getPreferenceStore() {
		return null;
	}


	public Logger getLogger() {
		return logger;
	}


	public void setLogger(Logger logger) {
		this.logger = logger;
	}

}
