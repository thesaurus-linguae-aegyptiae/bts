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
package org.bbaw.bts.core.controller.generalController;

import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.BTSProjectDBCollection;
import org.bbaw.bts.btsmodel.BTSUser;

/**
 * The PermissionsAndExpressionsEvaluationController manages the user editing and reading permissions and the core-expressions.
 * The implementation should listen to object selection and calculate permissions and core-expression according to selection, user, user-role,
 * and further configuration.
 */
public interface PermissionsAndExpressionsEvaluationController {

	/**
	 * Inits the controller.
	 */
	void init();

	/**
	 * Activate db collection context.
	 *
	 * @param prefMainCorpus the pref main corpus
	 */
	void activateDBCollectionContext(String prefMainCorpus);

	/**
	 * Authenticated user is db admin.
	 *
	 * @param remoteDBAdmin the remote db admin
	 * @return true, if successful
	 */
	boolean authenticatedUserIsDBAdmin(boolean remoteDBAdmin);

	/**
	 * Check if authenticated user may sync db coll.
	 *
	 * @param dbCollectionName the db collection name
	 * @return true, if successful
	 */
	boolean authenticatedUserMaySyncDBColl(String dbCollectionName);
	
	/**
	 * Check if authenticated user may edit obeject.
	 *
	 * @param object the object
	 * @return true, if successful
	 */
	boolean authenticatedUserMayEditObject(BTSObject object);
	
	boolean userMayEditObject(BTSUser user, Object object);

	boolean authenticatedUserMayAddToDBCollection(BTSProjectDBCollection dbCollection);

}
