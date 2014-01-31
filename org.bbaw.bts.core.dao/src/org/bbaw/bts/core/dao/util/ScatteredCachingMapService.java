package org.bbaw.bts.core.dao.util;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.inject.Inject;

import org.bbaw.bts.commons.interfaces.ScatteredCachingPart;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

public class ScatteredCachingMapService implements Map<URI, Resource> {

	@Inject
	@Optional
	private EPartService partService;

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean containsKey(Object key) {
		if (partService == null) {
			return false;
		}
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
		return false;
	}

	@Override
	public boolean containsValue(Object value) {
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Resource get(Object key) {
		// FIXME dies setzt ein active window voraus - nicht gegeben, wenn parts
		// im dialog geöffnet werden.
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
			e.printStackTrace();
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Resource put(URI key, Resource value) {
		// TODO Auto-generated method stub
		return value;
	}

	@Override
	public void putAll(Map<? extends URI, ? extends Resource> m) {
		// TODO Auto-generated method stub

	}

	@Override
	public Resource remove(Object key) {
		// TODO Auto-generated method stub
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
		// TODO Auto-generated method stub
		return null;
	}

}
