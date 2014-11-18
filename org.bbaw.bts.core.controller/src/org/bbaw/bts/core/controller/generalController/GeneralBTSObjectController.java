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

import org.bbaw.bts.btsmodel.BTSConfigItem;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.searchModel.BTSQueryRequest;
import org.eclipse.core.runtime.IProgressMonitor;

/**
 * The GeneralBTSObjectController manages access to BTSObjects if their type is not specified.
 */
public interface GeneralBTSObjectController {
	
	/**
	 * Gets the object proposals for.
	 *
	 * @param configItem the config item
	 * @param text the text
	 * @param object the object
	 * @return the object proposals for
	 */
	List<BTSObject> getObjectProposalsFor(
			BTSConfigItem configItem, String text, BTSObject object, IProgressMonitor monitor);

	/**
	 * Gets the display name of the object by its id.
	 *
	 * @param id the id
	 * @return the display name of the object or id if object not found
	 */
	String getDisplayName(String id);
	
	/**
	 * Query objects with given query and object state, classname.
	 *
	 * @param query the query
	 * @param objectState the object state
	 * @param registerQuery true if query should be registered e.g. with percolator.
	 * @param className the class name
	 * @return the list
	 */
	List<BTSObject> queryObjects(BTSQueryRequest query,
			String objectState, boolean registerQuery, String className, IProgressMonitor monitor);
	
	/**
	 * Find object by id and - if available - classname.
	 * Providing a classname is not required but improves performance.
	 *
	 * @param id the id
	 * @param classname the classname if available of the object.
	 * @return the BTS object
	 */
	BTSObject findObject(String id, String classname, IProgressMonitor monitor);
}
