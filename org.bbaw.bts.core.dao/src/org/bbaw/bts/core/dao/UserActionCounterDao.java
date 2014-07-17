package org.bbaw.bts.core.dao;

import java.util.List;

import org.bbaw.bts.btsmodel.UserActionCounter;

public interface UserActionCounterDao extends
		GenericDao<UserActionCounter, String> {

	List<UserActionCounter> autocomplete(String prefix, String indexName);
}
