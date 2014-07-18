package org.bbaw.bts.core.dao;

import java.util.List;
import java.util.Set;

import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.btsmodel.DBLease;
import org.bbaw.bts.searchModel.BTSQueryRequest;
import org.bbaw.bts.tempmodel.DBRevision;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

public interface GenericDao<E extends BTSDBBaseObject, K>
{

	E add(E entity, String path);

	boolean addMultiple(Set<E> entitys, String path);

	E update(E entity, String path);

	void remove(E entity, String path);
	
	boolean remove(E entity, String path, String revision);

	
	void purge(E entity, String path);
	
	E setDeleted(E entity, String path, boolean deleted);

	E find(K key, String path);
	
	E find(K key, String path, String revision);
	
	E find(URI uri);

	E reload(K key, String path);
	
	void reloadConflicts(E entity);

	List<E> list(String path, String objectState);
	
	List<DBRevision> listAvailableRevisions(K id, String path);


	List<E> findByQueryId(String searchId, String path, String objectState);

	List<E> query(BTSQueryRequest query, String indexName, String indexType,
			String objectState, boolean registerQuery);

	boolean objectIsLoaded(String dbPath, String objectId);

	// TODO query method with result object that can hold scoring information
	// for each object

	boolean isAuthorizedUser(String userName, String passWord);
	
	void fillResource(Resource resource, String objectAsString);

}