package org.bbaw.bts.db;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.util.List;

import org.bbaw.bts.btsmodel.BTSProject;

public interface DBManager
{

	boolean prepareDBSynchronization(BTSProject project) throws MalformedURLException;

	boolean prepareDBIndexing(BTSProject project) throws URISyntaxException;

	boolean prepareDB() throws URISyntaxException;

	boolean databaseIsInstalled(String db_installation_dir);

	boolean installDatabase(String string, int localPort, String localAdminName, String localAdminpassword) throws Exception;

	boolean checkConnection(String url, String username, String password) throws MalformedURLException;

	boolean prepareDBCollectionIndexing(String string);
	
	boolean startDatabase(String btsInstallationDir, String localDBUrl) throws Exception;

	boolean synchronizeRemoteProjects(String mainProject,
			List<String> projecsToSync, String serverurl, String localDBUrl) throws Exception;

	void shutdown();

	void setLocalDBUrl(String localDBUrl);

}
