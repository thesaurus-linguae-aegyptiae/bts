package org.bbaw.bts.dao.couchDB.impl;


import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.bbaw.bts.btsmodel.BTSUser;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.dao.BTSUserDao;
import org.bbaw.bts.core.dao.util.DaoConstants;
import org.bbaw.bts.modelUtils.EmfModelHelper;
import org.bbaw.bts.tempmodel.DBRevision;
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
import org.lightcouch.Response;
import org.lightcouch.View;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;

@Creatable
public class BTSUserDaoImpl extends CouchDBDao<BTSUser, String> implements BTSUserDao
{

	private static final String _USERS = "_users";
	private static final String COUCHDB_USERS_PREFIX = "org.couchdb.user:";

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
	
	@Override
	public BTSUser add(BTSUser entity, String path) {
		BTSUser user = super.add(entity, path);
		
		
		//FIXME check update _users
		CouchDbClient dbClient = connectionProvider.getDBClient(CouchDbClient.class, _USERS);
		
		InputStream is = null;
		JsonObject jso = null;
		try {
			is = dbClient.find(COUCHDB_USERS_PREFIX + entity.getUserName());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean valid = false;
		if (is != null)
		{
			jso = EmfModelHelper.load(is, JsonObject.class);
			valid = checkDBUserBTSUser(jso, entity);		
		}
		if (valid)
		{
			return user;
		}
		jso = updateOrMakeNewDBUser(jso, entity, dbClient);
		String string = dbClient.getGson().toJson(jso);
		System.out.println(string);
		System.out.println(jso);
		Response response = dbClient.save(jso);
		user.set_rev(response.getRev());
//		// save jso
//		HttpPost head = new HttpPost(dbClient.getDBUri() + COUCHDB_USERS_PREFIX + entity.getUserName());
////		HttpPost post = new HttpPost(builder(dbClient.getDBUri()).path("_purge").build());
//		HttpEntity body;
//		try {
//			body = new ByteArrayEntity(string.getBytes("UTF-8"));
//			head.setEntity(body);
//			head.setHeader("Content-Type", "application/json");
//
//			HttpResponse response = dbClient.executeRequest(head); 
//			String revision = response.getFirstHeader("ETAG").getValue();
//		} catch (UnsupportedEncodingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		

//		HttpClientUtils.closeQuietly(response); // closes the response
		// update password
		return user;
	}

	private JsonObject updateOrMakeNewDBUser(JsonObject jso, BTSUser entity, CouchDbClient dbClient) {
		if (jso == null)
		{
			jso = new JsonObject();
			// type
			jso.addProperty("password", entity.getPassword());
		}
		// id
		jso.addProperty("_id", COUCHDB_USERS_PREFIX + entity.getUserName());
		
		// type
		jso.addProperty("type", "user");

		// username
		jso.addProperty("name", entity.getUserName());

		// roles == groups
		// for collection framework objects
		JsonArray array = new JsonArray();
		for (String group : entity.getGroupIds()) {
			JsonPrimitive element = new JsonPrimitive(group);
			array.add(element);
		}
		jso.add("roles", array);
		
		
		return jso;
	}

	private boolean checkDBUserBTSUser(JsonObject jso, BTSUser entity) {
		if (jso == null)
		{
			return false;
		}
		// type
		String type = jso.get("type").getAsString();
		if (type == null || !"user".equals(type)) return false;
		
		// username
		String name = jso.get("name").getAsString();
		if (name == null || !entity.getUserName().equals(name)) return false;
		
		// roles == groups
		Set<String> roles = new HashSet<String>(entity.getGroupIds().size());
		for (JsonElement role : jso.getAsJsonArray("roles"))
		{
			String r = role.getAsString();
			roles.add(r);
		}
		for (String group : entity.getGroupIds())
		{
			if (!roles.contains(group))
			{
				return false;
			}
		}
		
		// all checks survived
		return true;
	}
}
