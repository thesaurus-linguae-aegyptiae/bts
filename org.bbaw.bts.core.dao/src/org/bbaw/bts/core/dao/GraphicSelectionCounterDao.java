package org.bbaw.bts.core.dao;

import java.util.List;

import org.bbaw.bts.btsmodel.GraphicSelectionCounter;

public interface GraphicSelectionCounterDao extends
		GenericDao<GraphicSelectionCounter, String> {

	List<GraphicSelectionCounter> autocomplete(String prefix, String indexName);
}
