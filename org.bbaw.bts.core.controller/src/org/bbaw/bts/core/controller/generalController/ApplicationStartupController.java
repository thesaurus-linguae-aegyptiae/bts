package org.bbaw.bts.core.controller.generalController;

import java.net.MalformedURLException;
import java.util.List;

import org.bbaw.bts.btsmodel.BTSProject;
import org.bbaw.bts.core.services.BTSProjectService;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.equinox.app.IApplicationContext;

public interface ApplicationStartupController
{
	void applicationStartup(IEclipseContext context, BTSProjectService projectService, IApplicationContext appContext);

	boolean checkDBConnection(String url, String user, String password) throws MalformedURLException;

	List<BTSProject> loadRemoteProjects() throws MalformedURLException;

	void setRemoteDBConnection(String url, String user, String password) throws MalformedURLException;

	String getDBInstallationDir();
	
	boolean installDB(String dbInstallationDir, int localPort, String localAdminName, String localAdminpassword);
	
	boolean requiresDBInstallation();
		
	boolean initializeLocalUser(String localAdminName, String localAdminPassword);
	
	boolean synchronizeRemoteProjects(String mainProject, List<String> projecsToSync, String serverurl, String localDBUrl) throws Exception;
}