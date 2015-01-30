/*******************************************************************************
 * Copyright (c) 2012 - 2014 Joseph Carroll and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Joseph Carroll <jdsalingerjr@gmail.com> - initial API and implementation
 * 	   Lars Vogel <Lars.Vogel@gmail.com> - ongoing maintenance
 ******************************************************************************/
package org.eclipse.e4.ui.workbench.perspectiveswitcher;

import org.eclipse.e4.ui.internal.workbench.URIHelper;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;

/**
 * The activator class controls the plug-in life cycle
 */
public class E4PerspectiveSwitcherActivator implements BundleActivator {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.eclipse.e4.ui.workbench.perspectiveswitcher"; //$NON-NLS-1$

	public static final String RESOURCE_SCHEMA = "bundleclass://"; //$NON-NLS-1$
	public static final String RESOURCE_SEPARATOR = "/"; //$NON-NLS-1$

	// The shared instance
	private static E4PerspectiveSwitcherActivator plugin;

	/**
	 * The constructor
	 */
	public E4PerspectiveSwitcherActivator() {
	}

	@Override
	public void start(BundleContext context) throws Exception {
		plugin = this;
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static E4PerspectiveSwitcherActivator getDefault() {
		return plugin;
	}

	/**
	 * Returns the platform URI of the bundle
	 * 
	 * @return the platform URI
	 */
	public String getPlatformURI() {
		return URIHelper.constructPlatformURI(FrameworkUtil.getBundle(E4PerspectiveSwitcherActivator.class));
	}

	/**
	 * Returns the platform resource URI for the provided class
	 * 
	 * @param clazz
	 *            the class to get the resource URI for
	 * @return the platform resource URI
	 */
	public String getResourceURI(Class<?> clazz) {
		return RESOURCE_SCHEMA + PLUGIN_ID + RESOURCE_SEPARATOR
				+ clazz.getCanonicalName();
	}

}
