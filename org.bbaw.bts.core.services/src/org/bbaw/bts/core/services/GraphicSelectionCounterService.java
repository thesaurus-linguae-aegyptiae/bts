package org.bbaw.bts.core.services;

import java.util.List;

import org.bbaw.bts.btsmodel.GraphicSelectionCounter;

public interface GraphicSelectionCounterService extends
		GenericObjectService<GraphicSelectionCounter, String> {

	List<GraphicSelectionCounter> getCountersForPrefix(String code);

	void updateCounters(List<String> toAdd);

}
