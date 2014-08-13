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
import org.eclipse.e4.ui.model.application.ui.MElementContainer;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.e4.ui.model.application.ui.basic.MWindowElement;
import org.eclipse.e4.ui.workbench.UIEvents.TrimmedWindow;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.e4.ui.workbench.modeling.ModelService;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

public class ScatteredCachingMapService implements Map<URI, Resource> {

	@Inject
	@Optional
	private EPartService partService;

	private Map<URI, Resource> configurationMap = new HashMap<URI, Resource>();

	@Inject
	private EModelService modelService;

	@Inject
	@Optional
	private MWindow  workbenchWindow;

	@Inject
	@Optional
	private MApplication application;

	@Inject
	private IEclipseContext context;
	
	@Inject
	private ResourceSet resourceSet;

	private Map<URI, Resource> notificationMap = new HashMap<URI, Resource>();
	
	private Map<URI, Resource> eclassmap = new HashMap<URI, Resource>();

	@Override
	public void clear() {
		configurationMap.clear();

	}

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

	@Override
	public Set<java.util.Map.Entry<URI, Resource>> entrySet() {
		throw new UnsupportedOperationException(
				"ScatteredCachingMapService unsupported operation: keySet not implemented");

	}

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
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Set<URI> keySet() {
		throw new UnsupportedOperationException(
				"ScatteredCachingMapService unsupported operation: keySet not implemented");
	}

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

	@Override
	public void putAll(Map<? extends URI, ? extends Resource> m) {
		Assert.isNotNull(m);
		for (URI uri : m.keySet()) {
			if (m.get(uri) instanceof BTSConfiguration) {
				put(uri, m.get(uri));
			}
		}

	}

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

	@Override
	public Collection<Resource> values() {
		Collection<Resource> cols = new Vector<Resource>(0);
		return cols;

	}

}
