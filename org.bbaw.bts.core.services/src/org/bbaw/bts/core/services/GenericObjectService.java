package org.bbaw.bts.core.services;

import java.util.List;
import java.util.Set;

import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.searchModel.BTSQueryRequest;
import org.elasticsearch.action.search.SearchRequestBuilder;

public interface GenericObjectService<E extends BTSDBBaseObject, K>
{

	E createNew();

	boolean save(E entity);

	boolean saveMultiple(Set<E> entitys);

	void update(E entity);

	void remove(E entity);

	E find(K key);

	List<E> list();

	List<E> list(String dbPath, String queryId);

	<T> List<T> query(BTSQueryRequest query);

	List<E> filter(List<E> objects);

	SearchRequestBuilder getSearchRequestBuilder();

}