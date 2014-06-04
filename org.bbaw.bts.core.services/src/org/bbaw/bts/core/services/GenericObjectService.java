package org.bbaw.bts.core.services;

import java.util.List;
import java.util.Set;

import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.searchModel.BTSQueryRequest;
import org.bbaw.bts.tempmodel.DBRevision;
import org.elasticsearch.action.search.SearchRequestBuilder;

public interface GenericObjectService<E extends BTSDBBaseObject, K>
{

	E createNew();

	boolean save(E entity);

	boolean saveMultiple(Set<E> entitys);

	void update(E entity);

	void remove(E entity);
	
	boolean removeRevision(E entity, String revision);


	E find(K key);
	
	E find(K key, String path, String revision);
	
	E find(K key, String path,
			String revision, boolean fromRemote);

	List<E> list(String objectState);

	List<E> list(String dbPath, String queryId, String objectState);

	<T> List<T> query(BTSQueryRequest query, String objectState);

	<T> List<T> query(BTSQueryRequest query, String objectState,
			boolean registerQuery);

	List<E> filter(List<E> objects);

	SearchRequestBuilder getSearchRequestBuilder();

	void addRevisionStatement(E entity);
	
	void reloadConflicts(E object);

	List<DBRevision> listAvailableRevisions(BTSDBBaseObject object,
			boolean fetchFromRemote);

	String getDisplayName(String userId);

}