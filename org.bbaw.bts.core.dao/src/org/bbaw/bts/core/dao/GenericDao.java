package org.bbaw.bts.core.dao;

import java.util.List;
import java.util.Set;

import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.searchModel.BTSQueryRequest;

public interface GenericDao<E extends BTSDBBaseObject, K>
{

	void add(E entity, String path);

	boolean addMultiple(Set<E> entitys, String path);

	void update(E entity, String path);

	void remove(E entity, String path);

	E find(K key, String path);

	E reload(K key, String path);

	List<E> list(String path);

	List<E> findByQueryId(String searchId, String path);

	List<E> query(BTSQueryRequest query, String indexName, String indexType);

	boolean objectIsLoaded(String dbPath, String objectId);

	// TODO query method with result object that can hold scoring information
	// for each object

	boolean isAuthorizedUser(String userName, String passWord);

}