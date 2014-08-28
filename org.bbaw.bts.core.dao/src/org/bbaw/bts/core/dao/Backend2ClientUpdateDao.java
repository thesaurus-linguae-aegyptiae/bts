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

import org.bbaw.bts.core.commons.Backend2ClientUpdateListener;

/**
 * The Interface Backend2ClientUpdateDao should be implemented to handle database update events.
 *
 * @author Christoph Plutte
 */
public interface Backend2ClientUpdateDao
{

	/**
	 * Adds the update listener.
	 *
	 * @param listener the listener
	 */
	void addUpdateListener(Backend2ClientUpdateListener listener);

	/**
	 * Run and listen to updates.
	 *
	 * @param generalPurposeDao the general purpose dao
	 * @param dbCollection the db collection
	 */
	void runAndListenToUpdates(GeneralPurposeDao generalPurposeDao, String dbCollection);

	/**
	 * Removes the update listener.
	 *
	 * @param listener the listener
	 */
	void removeUpdateListener(Backend2ClientUpdateListener listener);

	/**
	 * Stop listening.
	 */
	void stopListening();

	/**
	 * Find queries to which the given object matches and list the ids of these queries.
	 *
	 * @param object the object
	 * @param id the id
	 * @param dbCollection the db collection
	 * @return the list of query-ids that find the given object
	 */
	List<String> fingQueryIds(Object object, String id, String dbCollection);
}
