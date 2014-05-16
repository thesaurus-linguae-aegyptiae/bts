package org.bbaw.bts.dao.couchDB.impl;

import java.io.ByteArrayInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.bbaw.bts.btsmodel.BTSUser;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.dao.BTSUserDao;
import org.bbaw.bts.core.dao.util.DaoConstants;
import org.eclipse.e4.core.di.annotations.Creatable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipselabs.emfjson.couchdb.CouchDBHandler;
import org.eclipselabs.emfjson.internal.JSONLoad;
import org.eclipselabs.emfjson.resource.JsResourceFactoryImpl;
import org.lightcouch.CouchDbClient;
import org.lightcouch.DesignDocument;
import org.lightcouch.NoDocumentException;
import org.lightcouch.View;

@Creatable
public class BTSUserDaoImpl extends CouchDBDao<BTSUser, String> implements BTSUserDao
{

	@Override
	public boolean removeBTSUser(BTSUser btsUser, String path)
	{
		// TODO Auto-generated method stub
		super.remove(btsUser, path);
		return true;
	}

	@Override
	public List<BTSUser> list(String path, String objectState)
	{
		String viewId = DaoConstants.VIEW_ALL_BTSUSERS;
		if (objectState != null
				&& objectState.equals(BTSConstants.OBJECT_STATE_ACTIVE)) {
			viewId = DaoConstants.VIEW_ALL_ACTIVE_BTSUSERS;
		} else if (objectState != null
				&& objectState.equals(BTSConstants.OBJECT_STATE_TERMINATED)) {
			viewId = DaoConstants.VIEW_ALL_TERMINATED_BTSUSERS;
		}
		// List<JsonObject> allDocs =
		// connectionProvider.getDBClient(CouchDbClient.class, path)
		// .view(viewId).includeDocs(true).query(JsonObject.class);
		List<String> allDocs = new ArrayList<String>(0);
		View view;
		try {
			view = connectionProvider.getDBClient(CouchDbClient.class, path)
					.view(viewId);
			allDocs = view.includeDocs(true).query();
		} catch (NoDocumentException e) {
			e.printStackTrace();
			createView(path, path, viewId);
			view = connectionProvider.getDBClient(CouchDbClient.class, path)
					.view(viewId);
			allDocs = view.includeDocs(true).query();
		}
		ArrayList<BTSUser> results = new ArrayList<BTSUser>();
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("json", new JsResourceFactoryImpl());
		resourceSet.getURIConverter().getURIHandlers().add(0, new CouchDBHandler());
		for (String jo : allDocs)
		{
			System.out.println(jo);
			if (true)
			{
				URI uri = URI.createURI(getLocalDBURL() + "/" + path + "/"
						+ extractIdFromObjectString(jo));
				Resource resource = resourceSet.getResource(uri, true);
				final JSONLoad loader = new JSONLoad(new ByteArrayInputStream(
						jo.getBytes()),
						new HashMap<Object, Object>());
				loader.fillResource(resource);
				results.add((BTSUser) resource.getContents().get(0));
			}
		}
		// for (JsonObject jo : allDocs)
		// {
		// System.out.println(jo.get(DaoConstants.ID_STRING).getAsString());
		// if (!jo.get(DaoConstants.ID_STRING).getAsString().startsWith("_"))
		// {
		// URI uri = URI.createURI(getLocalDBURL() + "/" + path + "/"
		// + jo.get(DaoConstants.ID_STRING).getAsString());
		// Resource resource = resourceSet.getResource(uri, true);
		// final JSONLoad loader = new JSONLoad(new
		// ByteArrayInputStream(jo.toString().getBytes()),
		// new HashMap<Object, Object>());
		// loader.fillResource(resource);
		// results.add((BTSUser) resource.getContents().get(0));
		// }
		// }
		if (!results.isEmpty())
		{
			registerQueryIdWithInternalRegistry(viewId, path);
		}
		return results;
	}

	@Override
	public List<BTSUser> list(String path, String objectState,
			String userName, String passWord) {
		String viewId = DaoConstants.VIEW_ALL_BTSUSERS;
		if (objectState != null
				&& objectState.equals(BTSConstants.OBJECT_STATE_ACTIVE)) {
			viewId = DaoConstants.VIEW_ALL_ACTIVE_BTSUSERS;
		} else if (objectState != null
				&& objectState.equals(BTSConstants.OBJECT_STATE_TERMINATED)) {
			viewId = DaoConstants.VIEW_ALL_TERMINATED_BTSUSERS;
		}
		// List<JsonObject> allDocs =
		// connectionProvider.getDBClient(CouchDbClient.class, path)
		// .view(viewId).includeDocs(true).query(JsonObject.class);
		List<String> allDocs = new ArrayList<String>(0);
		View view;
		try {
			view = connectionProvider.getDBClient(CouchDbClient.class, path, userName, passWord)
					.view(viewId);
			allDocs = view.includeDocs(true).query();
		} catch (NoDocumentException e) {
			e.printStackTrace();
			CouchDbClient dbClient = connectionProvider.getDBClient(CouchDbClient.class, path, userName, passWord);
			DesignDocument designDoc = dbClient.design().getFromDesk(path);
			dbClient.design().synchronizeWithDb(designDoc); // sync with db
			view = connectionProvider.getDBClient(CouchDbClient.class, path, userName, passWord)
					.view(viewId);
			allDocs = view.includeDocs(true).query();
		}
		ArrayList<BTSUser> results = new ArrayList<BTSUser>();
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("json", new JsResourceFactoryImpl());
		resourceSet.getURIConverter().getURIHandlers().add(0, new CouchDBHandler());
		for (String jo : allDocs)
		{
			System.out.println(jo);
			if (true)
			{
				URI uri = URI.createURI(getLocalDBURL(userName, passWord) + "/" + path + "/"
						+ extractIdFromObjectString(jo));
				Resource resource = resourceSet.getResource(uri, true);
				final JSONLoad loader = new JSONLoad(new ByteArrayInputStream(
						jo.getBytes()),
						new HashMap<Object, Object>());
				loader.fillResource(resource);
				results.add((BTSUser) resource.getContents().get(0));
			}
		}
		if (!results.isEmpty())
		{
			registerQueryIdWithInternalRegistry(viewId, path);
		}
		return results;
	}

	private String getLocalDBURL(String userName, String passWord) {
		String localUrl = getLocalDBURL();
		if (userName != null && passWord != null)
		{
			try {
				URL url = new URL(localUrl);
				return url.getProtocol() + "://"+ userName + ":" + passWord+  "@" + url.getHost() + ":" + url.getPort();
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}
}
