/**
 * This file is part of Berlin Text System.
 * 
 * The software Berlin Text System serves as a client user interface for working with
 * text corpus data. See: aaew.bbaw.de
 * 
 * The software Berlin Text System was developed at the Berlin-Brandenburg Academy
 * of Sciences and Humanities, Jägerstr. 22/23, D-10117 Berlin.
 * www.bbaw.de
 * 
 * Copyright (C) 2013-2014  Berlin-Brandenburg Academy
 * of Sciences and Humanities
 * 
 * The software Berlin Text System was developed by @author: Christoph Plutte.
 * 
 * Berlin Text System is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Berlin Text System is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with Berlin Text System.  
 * If not, see <http://www.gnu.org/licenses/lgpl-3.0.html>.
 */
package org.bbaw.bts.core.services;

import java.util.List;
import java.util.Set;

import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.btsmodel.BTSIdentifiableItem;
import org.bbaw.bts.core.dao.util.BTSQueryRequest;
import org.bbaw.bts.tempmodel.DBRevision;
import org.eclipse.core.runtime.IProgressMonitor;
import org.elasticsearch.action.search.SearchRequestBuilder;

/**
 * The Service Interface GenericObjectService provides service layer access to GenericObject-objects.
 * 
 * Service-Implementations should incorporate as much as possible of business logic which 
 * does not depend on UI specific implementation and should be implemented in the controller layer
 * nor database specific logic which should be implemented in the dao layer.
 * 
 * Services should be implemented generically.
 *
 * @param <E> the element type
 * @param <K> the key type
 */
public interface GenericObjectService<E extends BTSDBBaseObject, K>
{

	/**
	 * Creates  new object of parametrized type.
	 *
	 * @return the e
	 */
	E createNew();
	
	/**
	 * Creates new object of parametrized type with a new relation type 'partOf' referencing the given parentObject.
	 *
	 * @param parentObject the parent object
	 * @return the new Object
	 */
	E createNewRelationPartOf(BTSIdentifiableItem parentObject);

	/**
	 * Save entity.
	 *
	 * @param entity the entity
	 * @return true, if successful
	 */
	boolean save(E entity);

	/**
	 * Save multiple entities whether new or modified.
	 *
	 * @param entitys the entitys
	 * @return true, if successful
	 */
	boolean saveMultiple(Set<E> entitys);

	/**
	 * Update given entity.
	 *
	 * @param entity the entity
	 */
	void update(E entity);

	/**
	 * Removes the given entity.
	 *
	 * @param entity the entity
	 */
	void remove(E entity);
	
	/**
	 * Removes the  revision of the given entity.
	 *
	 * @param entity the entity
	 * @param revision the revision
	 * @return true, if successful
	 */
	boolean removeRevision(E entity, String revision);


	/**
	 * Find entity by id.
	 *
	 * @param key the key
	 * @return the entity
	 */
	E find(K key, IProgressMonitor monitor);
	
	
	/**
	 * Find entity by id and return json string.
	 *
	 * @param key the key
	 * @return the entity
	 */
	String findAsJsonString(K key, IProgressMonitor monitor);
	
	/**
	 * Find entity by id and return json string.
	 *
	 * @param key the key
	 * @return the entity
	 */
	String findAsJsonString(K key, String path, IProgressMonitor monitor);
	/**
	 * Find given revision of entity by id and database path.
	 *
	 * @param key the key
	 * @param path the path in database
	 * @param revision the revision
	 * @return the entity in the given revision
	 */
	E find(K key, String path, String revision, IProgressMonitor monitor);
	
	/**
	 * Find given revision of entity by id and database path and return json string.
	 *
	 * @param key the key
	 * @param path the path in database
	 * @param revision the revision
	 * @return the entity in the given revision
	 */
	String findAsJsonString(K key, String path, String revision, IProgressMonitor monitor);
	
	/**
	 * Find given revision of entity by id and database path.
	 *
	 * @param key the key
	 * @param path the path in databae
	 * @param revision the revision
	 * @param fromRemote true whether it should try to fetch revision from remote database
	 * @return the entity in the given revision
	 */
	E find(K key, String path,
			String revision, boolean fromRemote, IProgressMonitor monitor);

	/**
	 * List all entities of given object state.
	 *
	 * @param objectState the object state
	 * @return the list of entities
	 */
	List<E> list(String objectState, IProgressMonitor monitor);

	/**
	 * List all entities of given object state.
	 *
	 * @param dbPath the db path in database
	 * @param queryId the query id
	 * @param objectState the object state
	 * @return the list of entities
	 */
	List<E> list(String dbPath, String queryId, String objectState, IProgressMonitor monitor);

	/**
	 * Query objects of parametrized type.
	 *
	 * @param query the query
	 * @param objectState the object state
	 * @param monitor 
	 * @return the list of objects matching given query
	 */
	List<E> query(BTSQueryRequest query, String objectState, IProgressMonitor monitor);
	
	/**
	 * Query objects of parametrized type and return list of json string.
	 *
	 * @param query the query
	 * @param objectState the object state
	 * @param monitor 
	 * @return the list of objects matching given query
	 */
	List<String> queryAsJsonString(BTSQueryRequest query, String objectState, IProgressMonitor monitor);


	/**
	 * Query objects of parametrized type.
	 *
	 * @param query the query
	 * @param objectState the object state
	 * @param registerQuery true if query should be registered
	 * @return the list of objects matching given query
	 */
	List<E> query(BTSQueryRequest query, String objectState,
			boolean registerQuery, IProgressMonitor monitor);

	/**
	 * Filter objects according to reading rights of currently authenticated user.
	 *
	 * @param objects the list of objects to be filtered
	 * @return the list of objects currently authenticated user may read
	 */
	List<E> filter(List<E> objects);

	/**
	 * Gets the search request builder for building a Elasticsearch.
	 *
	 * @return the search request builder
	 */
	SearchRequestBuilder getSearchRequestBuilder();

	/**
	 * Adds the revision statement to the given entity.
	 *
	 * @param entity the entity
	 */
	void addRevisionStatement(E entity);
	
	/**
	 * Reload conflicts of given objects form database.
	 *
	 * @param object the object with reloaded current conflicts
	 */
	void reloadConflicts(E object);

	/**
	 * List all available revisions of given object.
	 *
	 * @param object the object which revisions are requested
	 * @param fetchFromRemote true whether it should fetch revisions from remote
	 * @return the list of available revisions
	 */
	List<DBRevision> listAvailableRevisions(BTSDBBaseObject object,
			boolean fetchFromRemote, IProgressMonitor monitor);

	/**
	 * Gets the display name of the given object by id.
	 *
	 * @param userId the user id
	 * @return the display name
	 */
	String getDisplayName(String userId, IProgressMonitor monitor);

	List<E> listChunks(int chunkSize, String[] chunkIds, String dbCollectionName, String objectStateActive,
			IProgressMonitor monitor);
}