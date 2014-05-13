package org.bbaw.bts.core.dao;

import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.emf.ecore.resource.ResourceSet;

public interface DBConnectionProvider
{

	<T> T getDBClient(Class<T> clazz, String path);

	<T> T getDBClient(Class<T> clazz, String path, String userName, String password);

	<T> T getSearchClient(Class<T> clazz);

	ResourceSet getEmfResourceSet();

	String getLocalDBURL();

	<T> T getDBClient(Class<T> clazz, String localDBUrl,
			String collectionName) throws MalformedURLException;

	void setLocalDBUrl(URL url);

}
