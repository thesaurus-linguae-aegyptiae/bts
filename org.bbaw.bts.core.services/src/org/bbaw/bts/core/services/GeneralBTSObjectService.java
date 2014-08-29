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

import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.searchModel.BTSQueryRequest;
import org.bbaw.bts.tempmodel.DBRevision;

/**
 * The Service Interface GeneralBTSObjectService provides service layer access to BTSObject-objects.
 * 
 * Service-Implementations should incorporate as much as possible of business logic which 
 * does not depend on UI specific implementation and should be implemented in the controller layer
 * nor database specific logic which should be implemented in the dao layer.
 * 
 * Services should be implemented generically.
 */
public interface GeneralBTSObjectService {
	
	/**
	 * Query objects.
	 *
	 * @param query the query
	 * @param objectState the object state
	 * @param registerQuery the register query
	 * @param className the class name
	 * @return the list of matching objects
	 */
	List<BTSObject> queryObjects(BTSQueryRequest query,
			String objectState, boolean registerQuery, String className);

	/**
	 * Gets the display name of given object. Providing a classname is not required but betters performance.
	 *
	 * @param id the id
	 * @param className the name of the class
	 * @return the display name
	 */
	String getDisplayName(String id, String className);
	
	/**
	 * Find object by id.
	 * 
	 * Providing a classname is not required but betters performance.
	 *
	 * @param id the id
	 * @param className the class name
	 * @return the BTS object
	 */
	BTSObject findObject(String id, String className);

	/**
	 * Save the given object whether new or modified.
	 *
	 * @param dbBaseObject the db base object
	 * @return true, if successful
	 */
	boolean save(BTSDBBaseObject dbBaseObject);

	/**
	 * Find object by id and revision.
	 *
	 * @param id the id of requested object
	 * @param dbCollectionKey the db collection key
	 * @param object the object
	 * @param rev the rev
	 * @return the BTSDB base object
	 */
	BTSDBBaseObject find(String id, String dbCollectionKey,  BTSDBBaseObject object, String rev);

	/**
	 * Removes the revision of the given object.
	 *
	 * @param object the object
	 * @param revision the revision
	 * @return true, if successful
	 */
	boolean removeRevision(BTSDBBaseObject object, String revision);

	/**
	 * Reload conflicts of given object.
	 *
	 * @param object the object
	 */
	void reloadConflicts(BTSDBBaseObject object);

	/**
	 * List available revisions of given object.
	 *
	 * @param object the object
	 * @param fetchFromRemote true if it should fetch revisions from remote
	 * @return the list of available revisions
	 */
	List<DBRevision> listAvailableRevisions(BTSDBBaseObject object,
			boolean fetchFromRemote);

	/**
	 * Find the given revision of the object by id.
	 *
	 * @param id the id of the requested object
	 * @param dbCollectionKey the db collection key
	 * @param rev the id of the revision
	 * @param object the requested object
	 * @param fromRemote true if it should fetch revision from remote database
	 * @return the matching BTSDBbaseobject in the given revision
	 */
	BTSDBBaseObject find(String id, String dbCollectionKey,
			String rev, BTSDBBaseObject object, boolean fromRemote);

}
