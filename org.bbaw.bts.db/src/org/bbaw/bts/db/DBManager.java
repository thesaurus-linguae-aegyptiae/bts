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
package org.bbaw.bts.db;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.util.List;

import org.bbaw.bts.btsmodel.BTSProject;
import org.bbaw.bts.btsmodel.BTSProjectDBCollection;

/**
 * The Interface DBManager provides dao layer access to basic database management functions not covered by specific dao.
 * 
 * This means installation of database, syncing, indexing, starting, shutdown, checks.
 *
 * @author Christoph Plutte
 */
public interface DBManager
{

	/**
	 * Prepare db synchronization with remote database.
	 *
	 * @param project the project to be synced
	 * @return true, if successful
	 * @throws MalformedURLException the malformed url exception
	 */
	boolean prepareDBSynchronization(BTSProject project) throws MalformedURLException;

	/**
	 * Prepare database indexing .
	 *
	 * @param project the project
	 * @return true, if successful
	 * @throws URISyntaxException the URI syntax exception
	 */
	boolean prepareDBIndexing(BTSProject project) throws URISyntaxException;

	/**
	 * Prepare database for startup.
	 *
	 * @return true, if successful
	 * @throws URISyntaxException the URI syntax exception
	 */
	boolean prepareDB() throws URISyntaxException;

	/**
	 * Checks whether database is installed.
	 *
	 * @param db_installation_dir the database installation directory
	 * @return true, if successful
	 */
	boolean databaseIsInstalled(String db_installation_dir);

	/**
	 * Install database in the given repository setting it to the given port and registering the given credentials as
	 * local database administrator.
	 * 
	 * throws an exception if anything goes wrong such as file not found...
	 *
	 * @param dbInstallationDir the database installation directory
	 * @param localPort the local port
	 * @param localAdminName the local admin name
	 * @param localAdminpassword the local adminpassword
	 * @return true, if successful
	 * @throws Exception the exception
	 */
	boolean installDatabase(String dbInstallationDir, int localPort, String localAdminName, String localAdminpassword) throws Exception;

	/**
	 * Check connection to database using given credentials.
	 *
	 * @param url the url of database
	 * @param username the username
	 * @param password the password
	 * @return true, if successful
	 * @throws MalformedURLException the malformed url exception
	 */
	boolean checkConnection(String url, String username, String password) throws MalformedURLException;

	/**
	 * Prepares db collection indexing.
	 *
	 * @param db collection the db collection name
	 * @return true, if successful
	 */
	boolean prepareDBCollectionIndexing(String string);
	
	/**
	 * Starts database accesable under given url.
	 *
	 * @param btsInstallationDir the bts installation dir
	 * @param localDBUrl the local db url
	 * @return true, if successful
	 * @throws Exception the exception
	 */
	boolean startDatabase(String btsInstallationDir, String localDBUrl) throws Exception;

	/**
	 * Synchronizes remote projects.
	 *
	 * @param mainProject the main project
	 * @param projecsToSync the projecs to sync
	 * @param serverurl the serverurl
	 * @param localDBUrl the local db url
	 * @return true, if successful
	 * @throws Exception the exception
	 */
	boolean synchronizeRemoteProjects(String mainProject,
			List<String> projecsToSync, String serverurl, String localDBUrl) throws Exception;

	/**
	 * Shutdown database.
	 */
	void shutdown();

	/**
	 * Sets the local db url.
	 *
	 * @param localDBUrl the new local db url
	 */
	void setLocalDBUrl(String localDBUrl);

	/**
	 * Check and create db collection.
	 *
	 * @param project the project
	 * @param collection the collection
	 * @param string the string
	 * @param index the index
	 * @param synchronize the synchronize
	 * @return true, if successful
	 */
	boolean checkAndCreateDBCollection(BTSProject project, BTSProjectDBCollection collection, String string, boolean index, boolean synchronize);

	/**
	 * Check user is database admin.
	 *
	 * @param userName the user name
	 * @param password the password
	 * @return true, if successful
	 */
	boolean checkUserIsDBAdmin(String userName, String password);

	/**
	 * checks if database collection exists.
	 *
	 * @param dbCollectionName the db collection name
	 * @return true, if collection exists
	 */
	boolean dbCollectionExists(String dbCollectionName);

	
	/** Checks whether optimization of Cache, logging or so is required.
	 * @return true if optimization is required or recommended
	 */
	boolean optimizationRequired();

	/**
	 * optimize storage, cache and logging.
	 * @return true if successful
	 */
	boolean optimize();

}
