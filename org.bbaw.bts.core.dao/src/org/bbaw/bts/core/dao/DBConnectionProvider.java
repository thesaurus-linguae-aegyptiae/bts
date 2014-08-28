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

import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.emf.ecore.resource.ResourceSet;

/**
 * The Interface DBConnectionProvider provides database connections.
 *
 * @author Christoph Plutte
 */
public interface DBConnectionProvider
{

	/**
	 * Gets the DB client.
	 *
	 * @param <T> the generic type
	 * @param clazz the clazz
	 * @param path the path
	 * @return the DB client
	 */
	<T> T getDBClient(Class<T> clazz, String path);

	/**
	 * Gets the DB client.
	 *
	 * @param <T> the generic type
	 * @param clazz the clazz
	 * @param path the path
	 * @param userName the user name
	 * @param password the password
	 * @return the DB client
	 */
	<T> T getDBClient(Class<T> clazz, String path, String userName, String password);

	/**
	 * Gets the search client.
	 *
	 * @param <T> the generic type
	 * @param clazz the clazz
	 * @return the search client
	 */
	<T> T getSearchClient(Class<T> clazz);

	/**
	 * Gets the emf resource set.
	 *
	 * @return the emf resource set
	 */
	ResourceSet getEmfResourceSet();

	/**
	 * Gets the local dburl.
	 *
	 * @return the local dburl
	 */
	String getLocalDBURL();

	/**
	 * Gets the DB client.
	 *
	 * @param <T> the generic type
	 * @param clazz the clazz
	 * @param localDBUrl the local db url
	 * @param collectionName the collection name
	 * @return the DB client
	 * @throws MalformedURLException the malformed url exception
	 */
	<T> T getDBClient(Class<T> clazz, String localDBUrl,
			String collectionName) throws MalformedURLException;

	/**
	 * Sets the local db url.
	 *
	 * @param url the new local db url
	 */
	void setLocalDBUrl(URL url);

}
