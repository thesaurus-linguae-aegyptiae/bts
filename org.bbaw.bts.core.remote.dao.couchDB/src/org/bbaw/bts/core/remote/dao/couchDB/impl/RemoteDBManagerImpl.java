package org.bbaw.bts.core.remote.dao.couchDB.impl;

import javax.inject.Inject;

import org.bbaw.bts.core.remote.dao.RemoteDBConnectionProvider;
import org.bbaw.bts.core.remote.dao.RemoteDBManager;
import org.lightcouch.CouchDbClient;

public class RemoteDBManagerImpl implements RemoteDBManager {

	@Inject
	protected RemoteDBConnectionProvider connectionProvider;
	@Override
	public boolean checkUserIsDBAdmin(String userName, String password) {
		CouchDbClient dbClient = null;
		boolean success = true;
		try {
			dbClient = connectionProvider.getDBClient(CouchDbClient.class, "_users");
			if (dbClient == null)
			{
				return true; // no remote database -> only local
			}
			dbClient.design().getFromDb("_all_docs");
		} catch (Exception e) {
			success = false;
		}
		return success;
	}
	
	@Override
	public boolean dbCollectionExists(String dbCollectionName) {
		CouchDbClient dbClient = null;
		boolean exists = true;
		try {
			dbClient = connectionProvider.getDBClient(CouchDbClient.class, dbCollectionName);
		} catch (Exception e) {
			exists = false;
		}
		return exists;
	}
}
