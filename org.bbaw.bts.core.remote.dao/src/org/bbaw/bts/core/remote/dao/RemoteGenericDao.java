package org.bbaw.bts.core.remote.dao;

import java.util.List;

import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.searchModel.BTSQueryRequest;
import org.bbaw.bts.tempmodel.DBRevision;

public interface RemoteGenericDao<E extends BTSDBBaseObject, K>
{

	void add(E entity, String path);

	void update(E entity, String path);

	void remove(E entity, String path);
	
	void setDeleted(E entity, String path, boolean deleted);


	E find(K key, String path);
	
	E find(K key, String path, String revision);

	E reload(K key, String path);

	List<E> list(String path);

	List<DBRevision> listAvailableRevisions(K key, String path);

	List<E> findByQueryId(String searchId, String path);

	List<E> query(BTSQueryRequest query, String indexName, String indexType);

	boolean objectIsLoaded(String dbPath, String objectId);

	// TODO query method with result object that can hold scoring information
	// for each object
	boolean isAuthorizedUser(String userName, String passWord);

}