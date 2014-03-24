package org.bbaw.bts.db;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

import org.bbaw.bts.btsmodel.BTSProject;

public interface DBManager
{

	boolean prepareDBSynchronization(BTSProject project) throws MalformedURLException;

	boolean prepareDBIndexing(BTSProject project) throws URISyntaxException;

	boolean prepareDB() throws URISyntaxException;

	boolean databaseIsInstalled();

	boolean installDatabase(String string);

	boolean checkConnection(String url, String username, String password) throws MalformedURLException;

	boolean prepareDBCollectionIndexing(String string);

}
