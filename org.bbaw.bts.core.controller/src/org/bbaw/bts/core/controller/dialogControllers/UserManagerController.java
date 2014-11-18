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
package org.bbaw.bts.core.controller.dialogControllers;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.BTSProject;
import org.bbaw.bts.btsmodel.BTSUser;
import org.bbaw.bts.btsmodel.BTSUserGroup;
import org.bbaw.bts.btsviewmodel.TreeNodeWrapper;
import org.bbaw.bts.searchModel.BTSQueryResultAbstract;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.jface.viewers.ContentViewer;
import org.eclipse.jface.viewers.ViewerFilter;

/**
 * The UserManagerController manages user objects and access of the userManagerPart.
 */
/**
 * @author Christoph Plutte
 *
 */
public interface UserManagerController
{

	/**
	 * List user groups.
	 *
	 * @return the list
	 */
	List<BTSUserGroup> listUserGroups(IProgressMonitor monitor);

	/**
	 * List users.
	 *
	 * @return the list
	 */
	List<BTSUser> listUsers(IProgressMonitor monitor);

	/**
	 * Find group members.
	 *
	 * @param group the group
	 * @param queryResultMap the query result map
	 * @param viewer the viewer
	 * @param parentHolder the parent holder
	 * @param referenceName the reference name
	 * @return the list
	 */
	List<BTSUser> findGroupMembers(BTSUserGroup group, Map<String, BTSQueryResultAbstract> queryResultMap,
			ContentViewer viewer, TreeNodeWrapper parentHolder, EReference referenceName, IProgressMonitor monitor);

	/**
	 * Creates the new user.
	 *
	 * @param userName the user name
	 * @return the BTS user
	 */
	BTSUser createNewUser(String userName);

	/**
	 * Creates the new user group.
	 *
	 * @return the BTS user group
	 */
	BTSUserGroup createNewUserGroup();

	/**
	 * Save users.
	 *
	 * @param dirtyUsers the dirty users
	 * @return true, if successful
	 */
	boolean saveUsers(Set<BTSUser> dirtyUsers);

	/**
	 * Save user groups.
	 *
	 * @param dirtyUserGroups the dirty user groups
	 * @return true, if successful
	 */
	boolean saveUserGroups(Set<BTSUserGroup> dirtyUserGroups);

	/**
	 * Save db base object.
	 *
	 * @param dbBaseObject the db base object
	 * @return true, if successful
	 */
	boolean saveDBBaseObject(BTSDBBaseObject dbBaseObject);

	
	/** Lists terminated users and user groups.
	 * @return all terminated users and user groups.
	 */
	List<BTSObject> listTerminatedUsersUserGroups(IProgressMonitor monitor);

	List<BTSObject> getUserUserGroupOrphans(ViewerFilter[] filters, IProgressMonitor monitor);


}
