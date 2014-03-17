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

	List<E> list(String objectState);

	List<E> list(String dbPath, String queryId, String objectState);

	<T> List<T> query(BTSQueryRequest query, String objectState);

	<T> List<T> query(BTSQueryRequest query, String objectState,
			boolean registerQuery);

	List<E> filter(List<E> objects);

	SearchRequestBuilder getSearchRequestBuilder();

	void addRevisionStatement(E entity);

}