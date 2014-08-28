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

import org.bbaw.bts.btsmodel.BTSUser;


// TODO: Auto-generated Javadoc
/**
 * The Service Interface BTSUserService provides service layer access to BTSUser-objects.
 * 
 * Service-Implementations should incorporate as much as possible of business logic which 
 * does not depend on UI specific implementation and should be implemented in the controller layer
 * nor database specific logic which should be implemented in the dao layer.
 * 
 * Services should be implemented generically.
 */
public interface BTSUserService extends GenericObjectService<BTSUser, String>
{

	/**
	 * Creates the new user object.
	 *
	 * @param userName the user name
	 * @return the BTS user
	 */
	BTSUser createNewUser(String userName);

	/**
	 * Sets the authentication of the given credentials.
	 *
	 * @param userName the user name
	 * @param passWord the pass word
	 * @return true, if successful
	 */
	boolean setAuthentication(String userName, String passWord);

	/**
	 * Sets the remembered user in the remember-Me function.
	 *
	 * @param user the new remembered user
	 */
	void setRememberedUser(BTSUser user);
	
	/**
	 * List all BTSUser-objects using the given credentials.
	 *
	 * @param objectState the object state
	 * @param userName the user name
	 * @param passWord the pass word
	 * @return the list all user objects
	 */
	List<BTSUser> listAll(String objectState, String userName, String passWord);


}
