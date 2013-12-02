package org.bbaw.bts.core.dao;

import org.eclipse.emf.ecore.resource.ResourceSet;

public interface DBConnectionProvider
{

	<T> T getDBClient(Class<T> clazz, String path);

	<T> T getDBClient(Class<T> clazz, String path, String userName, String password);

	<T> T getSearchClient(Class<T> clazz);

	ResourceSet getEmfResourceSet();

	String getLocalDBURL();

}
