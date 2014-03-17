package org.bbaw.bts.core.dao.util;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSConfiguration;
import org.bbaw.bts.commons.interfaces.ScatteredCachingPart;
import org.eclipse.core.runtime.Assert;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

public class ScatteredCachingMapService implements Map<URI, Resource> {

	@Inject
	@Optional
	private EPartService partService;

	private Map<URI, Resource> configurationMap = new HashMap<URI, Resource>();

	@Override
	public void clear() {
		configurationMap.clear();

	}

	@Override
	public boolean containsKey(Object key) {
		if (configurationMap.containsKey(key)) {
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
						if (map != null && map.containsKey(key)) {
							return true;
						}
					}
				}

			}
		} catch (IllegalStateException e) {
			System.err.println("Application does not have an active window");
			return false;
		}
		return false;
	}

	@Override
	public boolean containsValue(Object value) {
		if (configurationMap.containsValue(value)) {
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
					for (Map map : maps) {
						if (map != null && map.containsKey(key)) {
							return (Resource) map.get(key);
						}
					}
				}

			}
		} catch (IllegalStateException e) {
			System.err.println("Application does not have an active window");
		}
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
		if (value.getContents() != null && !value.getContents().isEmpty()
				&& value.getContents().get(0) instanceof BTSConfiguration) {
			configurationMap.put(key, value);
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
