package org.bbaw.bts.core.remote.dao;

import org.eclipse.emf.ecore.resource.ResourceSet;

public interface RemoteDBConnectionProvider
{

	<T> T getDBClient(Class<T> clazz, String path);

	<T> T getDBClient(Class<T> clazz, String path, String userName, String password);

	<T> T getSearchClient(Class<T> clazz);

	ResourceSet getEmfResourceSet();

	String getRemoteDBURL();

	void purgeDBConnectionPool();
}
