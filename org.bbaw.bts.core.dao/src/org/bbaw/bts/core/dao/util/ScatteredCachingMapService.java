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
package org.bbaw.bts.core.dao.util;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSConfiguration;
import org.bbaw.bts.btsmodel.DBLease;
import org.bbaw.bts.commons.interfaces.ScatteredCachingPart;
import org.eclipse.core.runtime.Assert;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

/**
 * The Class ScatteredCachingMapService implements hashmap customize caching of EMF-Resources in ResourceSet.
 * The service does not actually store the cached objects but looks for Parts that cache their locally stored data locally.
 *
 * @author Christoph Plutte
 */
public class ScatteredCachingMapService implements Map<URI, Resource> {

	/** The part service. */
	@Inject
	@Optional
	private EPartService partService;

	/** The configuration map. */
	private Map<URI, Resource> configurationMap = new HashMap<URI, Resource>();

	/** The model service. */
	@Inject
	private EModelService modelService;

	/** The workbench window. */
	@Inject
	@Optional
	private MWindow  workbenchWindow;

	/** The application. */
	@Inject
	@Optional
	private MApplication application;

	/** The context. */
	@Inject
	private IEclipseContext context;
	
	/** The resource set. */
	@Inject
	private ResourceSet resourceSet;

	/** The notification map. */
	private Map<URI, Resource> notificationMap = new HashMap<URI, Resource>();
	
	/** The eclassmap. */
	private Map<URI, Resource> eclassmap = new HashMap<URI, Resource>();

	/* (non-Javadoc)
	 * @see java.util.Map#clear()
	 */
	@Override
	public void clear() {
		configurationMap.clear();

	}

	/* (non-Javadoc)
	 * @see java.util.Map#containsKey(java.lang.Object)
	 */
	@Override
	public boolean containsKey(Object key) {
		if (configurationMap.containsKey(key)) {
			return true;
		}
		if (notificationMap.containsKey(key)) {
			return true;
		}
		if (partService == null) {
			return false;
		}

		try {
			Collection<MPart> parts = partService.getParts();
			for (MPart part : parts) {
				if (part.getObject() != null
						&& part.getObject() instanceof ScatteredCachingPart) {
					List<Map> maps = ((ScatteredCachingPart) part.getObject())
							.getScatteredCashMaps();
					for (Map map : maps) {
						if (map != null && map.containsKey(key) && !((Resource) map.get(key)).getContents().isEmpty()) {
							return true;
						}
					}
				}

			}
		} catch (IllegalStateException e) {
			Collection<MPart> parts = modelService.findElements(getWindow(), null, MPart.class, null,
					EModelService.OUTSIDE_PERSPECTIVE | EModelService.IN_ACTIVE_PERSPECTIVE
							| EModelService.IN_SHARED_AREA);
			for (MPart part : parts) {
				if (part.getObject() != null
						&& part.getObject() instanceof ScatteredCachingPart) {
					List<Map> maps = ((ScatteredCachingPart) part.getObject())
							.getScatteredCashMaps();
					for (Map map : maps) {
						if (map != null && map.containsKey(key) && !((Resource) map.get(key)).getContents().isEmpty()) {
							return true;
						}
					}
				}

			}
			return false;
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see java.util.Map#containsValue(java.lang.Object)
	 */
	@Override
	public boolean containsValue(Object value) {
		if (configurationMap.containsValue(value)) {
			return true;
		}
		if (notificationMap.containsValue(value)) {
			return true;
		}
		if (partService == null) {
			return false;
		} else if (partService.getActivePart() != null) {
			Collection<MPart> parts = partService.getParts();
			for (MPart part : parts) {
				if (part.getObject() != null
						&& part.getObject() instanceof ScatteredCachingPart) {
					List<Map> maps = ((ScatteredCachingPart) part.getObject())
							.getScatteredCashMaps();
					for (Map map : maps) {
						if (map.containsValue(value)) {
							return true;
						}
					}
				}

			}
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see java.util.Map#entrySet()
	 */
	@Override
	public Set<java.util.Map.Entry<URI, Resource>> entrySet() {
		throw new UnsupportedOperationException(
				"ScatteredCachingMapService unsupported operation: keySet not implemented");

	}

	/* (non-Javadoc)
	 * @see java.util.Map#get(java.lang.Object)
	 */
	@Override
	public Resource get(Object key) {
		// FIXME dies setzt ein active window voraus - nicht gegeben, wenn parts
		// im dialog geöffnet werden.
		if (key instanceof URI) // eClass 
		{
			URI uri = (URI) key;
			if (uri.toString().startsWith("http://bts"))
			{
				return eclassmap.get(key);//(Resource) resourceSet.getEObject(uri, false);
			}
		}
		if (notificationMap.containsKey(key)) {
			return notificationMap.get(key);
		}
		if (configurationMap.containsKey(key)) {
			return configurationMap.get(key);
		}

		if (partService == null) {
			return null;
		}
		if (key == null) {
			return null;
		}
		try {
			Collection<MPart> parts = partService.getParts();
			for (MPart part : parts) {
				if (part.getObject() != null
						&& part.getObject() instanceof ScatteredCachingPart) {
					List<Map> maps = ((ScatteredCachingPart) part.getObject())
							.getScatteredCashMaps();
					synchronized (maps)
					{
					for (Map map : maps) {
						if (map != null && map.containsKey(key) && !((Resource) map.get(key)).getContents().isEmpty()) {
							return (Resource) map.get(key);
						}
					}
					}
				}

			}
		} catch (IllegalStateException e) {
			Collection<MPart> parts = modelService.findElements(getWindow(), null, MPart.class, null,
					EModelService.OUTSIDE_PERSPECTIVE | EModelService.IN_ACTIVE_PERSPECTIVE
							| EModelService.IN_SHARED_AREA);
			for (MPart part : parts) {
				if (part.getObject() != null
						&& part.getObject() instanceof ScatteredCachingPart) {
					List<Map> maps = ((ScatteredCachingPart) part.getObject())
							.getScatteredCashMaps();
					synchronized (maps)
					{
					for (Map map : maps) {
						if (map != null && map.containsKey(key) && !((Resource) map.get(key)).getContents().isEmpty()) {
							return (Resource) map.get(key);
						}
					}
					}
				}
			}
//			System.err.println("Application does not have an active window");
		}
		return null;
	}
	
	/**
	 * Gets the window.
	 *
	 * @return the window
	 */
	private MWindow getWindow() {
		if (workbenchWindow != null)
			return workbenchWindow;
		if (application == null)
		{
			application = context.get(MApplication.class);
		}
		if (application.getSelectedElement() != null)
			return application.getSelectedElement();
		List<MWindow> windows = application.getChildren();
		if (windows.size() != 0)
			return windows.get(0);
		return null;
	}
	
	/* (non-Javadoc)
	 * @see java.util.Map#isEmpty()
	 */
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see java.util.Map#keySet()
	 */
	@Override
	public Set<URI> keySet() {
		throw new UnsupportedOperationException(
				"ScatteredCachingMapService unsupported operation: keySet not implemented");
	}

	/* (non-Javadoc)
	 * @see java.util.Map#put(java.lang.Object, java.lang.Object)
	 */
	@Override
	public Resource put(URI key, Resource value) {
		if (key.toString().startsWith("http://btsmodel") || key.toString().startsWith("http://btsCorpusModel"))
		{
			eclassmap.put(key, value);
		}
		else if (value.getContents() != null && !value.getContents().isEmpty()
				&& value.getContents().get(0) instanceof BTSConfiguration) {
			configurationMap.put(key, value);
		}
		else if (value.getContents() != null && !value.getContents().isEmpty()
				&& value.getContents().get(0) instanceof DBLease) {
			notificationMap.put(key, value);
		}
		return value;

	}

	/* (non-Javadoc)
	 * @see java.util.Map#putAll(java.util.Map)
	 */
	@Override
	public void putAll(Map<? extends URI, ? extends Resource> m) {
		Assert.isNotNull(m);
		for (URI uri : m.keySet()) {
			if (m.get(uri) instanceof BTSConfiguration) {
				put(uri, m.get(uri));
			}
		}

	}

	/* (non-Javadoc)
	 * @see java.util.Map#remove(java.lang.Object)
	 */
	@Override
	public Resource remove(Object key) {
		if (configurationMap.containsKey(key)) {
			return configurationMap.remove(key);
		}
		if (notificationMap.containsKey(key)) {
			return notificationMap.remove(key);
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see java.util.Map#size()
	 */
	@Override
	public int size() {
		if (partService == null) {
			return 0;
		}
		Collection<MPart> parts = partService.getParts();
		int size = 0;
		for (MPart part : parts) {
			if (part.getObject() != null
					&& part.getObject() instanceof ScatteredCachingPart) {
				List<Map> maps = ((ScatteredCachingPart) part.getObject())
						.getScatteredCashMaps();
				for (Map map : maps) {
					size = size + map.size();
				}
			}

		}
		return size;
	}

	/* (non-Javadoc)
	 * @see java.util.Map#values()
	 */
	@Override
	public Collection<Resource> values() {
		Collection<Resource> cols = new Vector<Resource>(0);
		return cols;

	}

}
