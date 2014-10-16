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
package org.bbaw.bts.core.dao;

import java.util.List;
import java.util.Set;

import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.searchModel.BTSQueryRequest;
import org.bbaw.bts.tempmodel.DBRevision;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * The Interface GenericDao provides the generic DataAccessObject for BTSDBBaseObjects.
 * All DAOs in BTS should extend this Interface.
 *
 * @author Christoph Plutte
 * @param <E> the element type
 * @param <K> the key type
 */
public interface GenericDao<E extends BTSDBBaseObject, K>
{

	/**
	 * Adds the entity to database.
	 *
	 * @param entity the entity
	 * @param path the path in database
	 * @return the entity
	 */
	E add(E entity, String path);

	/**
	 * Adds the multiple entities to database.
	 *
	 * @param entitys the entitys
	 * @param path the path in database
	 * @return true, if successful
	 */
	boolean addMultiple(Set<E> entitys, String path);

	/**
	 * Updates the entity.
	 *
	 * @param entity the entity
	 * @param path the path in database
	 * @return the entity
	 */
	E update(E entity, String path);

	/**
	 * Removes the entity from database.
	 *
	 * @param entity the entity
	 * @param path the path in database
	 */
	void remove(E entity, String path);
	
	/**
	 * Removes the given revision of the entity from database.
	 *
	 * @param entity the entity
	 * @param path the path in database
	 * @param revision the revision
	 * @return true, if successful
	 */
	boolean remove(E entity, String path, String revision);

	
	/**
	 * Purges entity completely from database, no version control of entity.
	 *
	 * @param entity the entity
	 * @param path the path in database
	 */
	void purge(E entity, String path);
	
	/**
	 * Sets the entity as deleted.
	 *
	 * @param entity the entity
	 * @param path the path in database
	 * @param deleted true if deleted, false if undeleted
	 * @return the entity
	 */
	E setDeleted(E entity, String path, boolean deleted);

	/**
	 * Find entity by key
	 *
	 * @param key the key
	 * @param path the path in database
	 * @return the entity
	 */
	E find(K key, String path);
	
	/**
	 * Find revision of entity
	 *
	 * @param key the key
	 * @param path the path in database
	 * @param revision the id of the requested revision 
	 * @return the entity in the requested revision or null if not available
	 */
	E find(K key, String path, String revision);
	
	/**
	 * Find entity by uri
	 *
	 * @param uri the uri
	 * @return the entity
	 */
	E find(URI uri);

	/**
	 * Reload entity from database
	 *
	 * @param key the key of entity
	 * @param path the path in database
	 * @return the entity
	 */
	E reload(K key, String path);
	
	/**
	 * Reload conflicts of given entity.
	 *
	 * @param entity the entity
	 */
	void reloadConflicts(E entity);

	/**
	 * Lists all objects of this type under the given path in database and matching the given object state.
	 *
	 * @param path the path in database
	 * @param objectState the object state e.g. deleted, active
	 * @return the list of entities matching the criterias
	 */
	List<E> list(String path, String objectState);
	
	List<E> list(String path, String staticQueryId,
			String objectState);
	/**
	 * List available revisions of object by id.
	 *
	 * @param id the id of object
	 * @param path the path in database
	 * @return the list of revisions
	 */
	List<DBRevision> listAvailableRevisions(K id, String path);


	/**
	 * Find by query id. This allows to execute predefined queries by their id.
	 *
	 * @param searchId the search id
	 * @param path the path in database
	 * @param objectState the object state
	 * @return the list of matching entities
	 */
	List<E> findByQueryId(String searchId, String path, String objectState);

	/**
	 * Query for entities with given query, indexname, indextype, objectstate
	 *
	 * @param query the query
	 * @param indexName the index name
	 * @param indexType the index type
	 * @param objectState the object state
	 * @param registerQuery whether the query should be registered e.g. with percolator.
	 * @return the list of matching entities
	 */
	List<E> query(BTSQueryRequest query, String indexName, String indexType,
			String objectState, boolean registerQuery);

	/**
	 * Checks whether the object is loaded and stored in cache.
	 *
	 * @param dbPath the db path
	 * @param objectId the object id
	 * @return true, if successful
	 */
	boolean objectIsLoaded(String path, K key);

	// TODO query method with result object that can hold scoring information
	// for each object

	/**
	 * Checks if user is authorized to access database.
	 *
	 * @param userName the user name
	 * @param passWord the pass word
	 * @return true, if is authorized user
	 */
	boolean isAuthorizedUser(String userName, String passWord);
	
	/**
	 * Fills the given EMF-Resource with content from database.
	 *
	 * @param resource the resource
	 * @param objectAsString the object as string
	 */
	void fillResource(Resource resource, String objectAsString);
	
	E loadFully(E entity);

	E loadObjectFromString(String id, String path, URI uri, String sourceAsString);//E loadEntityFromString(String jo, String dbPath);
}