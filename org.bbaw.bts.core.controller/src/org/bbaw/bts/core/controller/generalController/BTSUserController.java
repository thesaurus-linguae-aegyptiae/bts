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

import java.util.List;

import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.BTSProject;
import org.bbaw.bts.btsmodel.BTSUser;
import org.bbaw.bts.btsmodel.BTSUserGroup;
import org.bbaw.bts.searchModel.BTSQueryRequest;
import org.eclipse.core.runtime.IProgressMonitor;

/** UserController manages all view access to user objects and usergroup objects.
 * @author Christoph Plutte
 *
 */
public interface BTSUserController {

	/** Gets the display name of a user by its user id.
	 * @param userId
	 * @return
	 */
	String getUserDisplayName(String userId);

	/** Checks whether the given user is authorized to connect to database, if so it authenticates it.
	 * @param validUser user to authenticate.
	 * @return true if user is authorized.
	 */
	boolean setAuthenticatedUser(BTSUser validUser);

	/**Checks whether the given username and password is authorized to connect to database, if so it authenticates it.
	 * @param userName 
	 * @param passWord
	 * @return true if user is authorized.
	 */
	boolean setAuthentication(String userName, String passWord);

	/** Querys db for given query and returns list of matching users.
	 * @param query
	 * @return
	 */
	List<BTSUser> query(BTSQueryRequest query, IProgressMonitor monitor);

	/** Find user by id.
	 * @param id
	 * @return
	 */
	BTSUser findUser(String id, IProgressMonitor monitor);

	/** Find usergroup by id.
	 * @param id
	 * @return
	 */
	BTSUserGroup findUserGroup(String id, IProgressMonitor monitor);

	/** Find user or usergroup by id. If id matches to user this is returned, if id matches to usergroup the latter is returned.
	 * @param id
	 * @return
	 */
	BTSObject findUserOrUserGroup(String id, IProgressMonitor monitor);

	/** Sets the given user to be remembered in rememberMe function, storing user credentials for next login in a secure manner.
	 * @param validUser
	 */
	void setRememberedUser(BTSUser validUser);
	
	/** list all users.
	 * @return
	 */
	List<BTSUser> listAll(IProgressMonitor monitor);
	
	/** List all users without requiring previous authentication of an authorized user. This method can be used to check whether the
	 * given credentials are valid.
	 * @param userName
	 * @param passWord
	 * @return
	 */
	List<BTSUser> listAll(String userName, String passWord);
	
	
	boolean removeUserUserGroup(BTSObject object, List<BTSProject> projects);

	boolean authenticatedUserIsDBAdmin(String userName, String password);

	boolean isValidAuthentication(String userName, String passWord);

	boolean checkAndChangeDBAdminPassword(String userName, String newPassword);

}
