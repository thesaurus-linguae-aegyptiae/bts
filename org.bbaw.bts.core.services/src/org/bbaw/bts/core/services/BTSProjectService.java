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
import java.util.Map;

import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.BTSProject;
import org.bbaw.bts.btsmodel.BTSProjectDBCollection;

/**
 * The Service Interface BTSProjectService provides service layer access to BTSProject-objects.
 * 
 * Service-Implementations should incorporate as much as possible of business logic which 
 * does not depend on UI specific implementation and should be implemented in the controller layer
 * nor database specific logic which should be implemented in the dao layer.
 * 
 * Services should be implemented generically.
 */
public interface BTSProjectService extends GenericObjectService<BTSProject, String>
{

	/**
	 * List remote projects.
	 * @param password 
	 * @param username 
	 *
	 * @return the list
	 */
	List<BTSProject> listRemoteProjects(String username, String password);

	/**
	 * Find project by project prefix.
	 *
	 * @param project the project
	 * @return the BTS project
	 */
	BTSProject findByProjectPrefix(String project);

	/**
	 * Check and add db collection.
	 *
	 * @param project the project
	 * @param corpusPrefix the corpus prefix
	 * @param b the b
	 * @param synchronizeCorpus the synchronize corpus
	 * @return the BTS project db collection
	 */
	BTSProjectDBCollection checkAndAddDBCollection(BTSProject project, String corpusPrefix,
			boolean b, boolean synchronizeCorpus);

	boolean removeUserUserGroupFromAuthorization(BTSObject object,
			List<BTSProject> projects);

	BTSProjectDBCollection findProjectCollection(String dbCollectionName);

	Map<String, BTSProjectDBCollection> loadProjectDBCollectionMap();

}
