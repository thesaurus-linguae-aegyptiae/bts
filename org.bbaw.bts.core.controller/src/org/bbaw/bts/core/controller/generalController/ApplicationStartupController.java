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

import java.net.MalformedURLException;
import java.util.List;

import org.bbaw.bts.btsmodel.BTSProject;
import org.bbaw.bts.core.services.BTSProjectService;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.equinox.app.IApplicationContext;


/** Application controller controlls the startup process of the application and manages also the 
 * first startup which is actually the installation process.
 * @author Christoph Plutte
 *
 */
public interface ApplicationStartupController
{
	/** Starts application. Should be called on E4 Event PostContextConstruct.
	 * @param context EclipseContext
	 * @param projectService project Service
	 * @param appContext application Context
	 */
	void applicationStartup(IEclipseContext context, BTSProjectService projectService, IApplicationContext appContext);

	/** Checks the database connection.
	 * @param url url of database
	 * @param user username, login credentials
	 * @param password password, login credentials
	 * @return true if connection could be established successfully
	 * @throws MalformedURLException if url not valid
	 */
	boolean checkDBConnection(String url, String user, String password) throws MalformedURLException;

	/** Loads projects form remote database.
	 * @return list of projects from remote database
	 * @throws MalformedURLException exception if url not valid.
	 */
	List<BTSProject> loadRemoteProjects() throws MalformedURLException;

	/** Sets the remote database connection 
	 * @param url url of database
	 * @param user username, login credentials
	 * @param password password, login credentials
	 * @throws MalformedURLException if url not valid
	 */
	void setRemoteDBConnection(String url, String user, String password) throws MalformedURLException;

	/** Gets the path to the directory of the database installation.
	 * @return full path to db installation directory.
	 */
	String getDBInstallationDir();
	
	/** Installs the database in the given directory with the given port and sets the given login credentials as database administrator.
	 * @param dbInstallationDir installation dir.
	 * @param localPort port to set database to
	 * @param localAdminName username
	 * @param localAdminpassword password
	 * @return
	 */
	boolean installDB(String dbInstallationDir, int localPort, String localAdminName, String localAdminpassword);
	
	/** Checks if database is already installed or installation is required.
	 * @return true if installation is required, otherwise false.
	 */
	boolean requiresDBInstallation();
		
	/** Initializes and creates local user which is registered with the database and my connect to db.
	 * @param localAdminName username
	 * @param localAdminPassword password
	 * @return true if initialization successful, otherwise false.
	 */
	boolean initializeLocalUser(String username, String password);
	
	/** Synchronizes remote projects from remote database.
	 * @param mainProject main project key
	 * @param projecsToSync list of projects to sync
	 * @param serverurl url of remote db
	 * @param localDBUrl url of local db
	 * @return true if sync successfull
	 * @throws Exception if error occurs.
	 */
	boolean synchronizeRemoteProjects(String mainProject, List<String> projecsToSync, String serverurl, String localDBUrl) throws Exception;
}