package org.bbaw.bts.core.remote.dao;


public interface RemoteDBManager {

	boolean checkUserIsDBAdmin(String userName, String password);

	boolean dbCollectionExists(String dbCollectionName);

	<T>T getDBClient(Class<T> clazz, String dbcollection);

}
