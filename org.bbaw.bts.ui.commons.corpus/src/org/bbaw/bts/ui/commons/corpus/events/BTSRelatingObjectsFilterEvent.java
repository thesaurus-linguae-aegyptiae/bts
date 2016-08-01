package org.bbaw.bts.ui.commons.corpus.events;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class BTSRelatingObjectsFilterEvent {

	private HashMap<String, Boolean> filters;
	
	public BTSRelatingObjectsFilterEvent() {
		filters = new HashMap<String, Boolean>();
	}
	
	public BTSRelatingObjectsFilterEvent(Map<String, Boolean> arg) {
		this();
		for (Entry<String, Boolean> e : arg.entrySet()) {
			filters.put(e.getKey(), e.getValue());
		}
	}
	
	public Map<String, Boolean> getFilters() {
		return filters;
	}
	
}
