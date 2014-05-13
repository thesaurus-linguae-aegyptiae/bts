package org.bbaw.bts.dao.couchDB.impl;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSDBCollectionRoleDesc;
import org.bbaw.bts.btsmodel.BTSProject;
import org.bbaw.bts.btsmodel.BTSProjectDBCollection;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.dao.BTSProjectDao;
import org.bbaw.bts.core.dao.DBConnectionProvider;
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
import org.lightcouch.NoDocumentException;
import org.lightcouch.View;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

@Creatable
public class BTSProjectDaoImpl extends CouchDBDao<BTSProject, String> implements BTSProjectDao
{

	@Inject
	protected DBConnectionProvider connectionProvider;

	@Override
	public boolean removeBTSProject(BTSProject btsProject)
	{
		// TODO Auto-generated method stub
		super.remove(btsProject, DaoConstants.ADMIN);
		return true;
	}

	@Override
	public List<BTSProject> list(String path, String objectState)
	{
		String viewId = DaoConstants.VIEW_ALL_BTSPROJECTS;
		if (objectState != null
				&& objectState.equals(BTSConstants.OBJECT_STATE_ACITVE)) {
			viewId = DaoConstants.VIEW_ALL_ACTIVE_BTSPROJECTS;
		} else if (objectState != null
				&& objectState.equals(BTSConstants.OBJECT_STATE_TERMINATED)) {
			viewId = DaoConstants.VIEW_ALL_TERMINATED_BTSPROJECTS;
		}
		List<String> allDocs = new ArrayList<String>(0);
		View view;
		CouchDbClient dbClient = connectionProvider.getDBClient(CouchDbClient.class, path);
		try
		{

			view = dbClient.view(viewId);
			allDocs = view.includeDocs(true).query();
		} catch (NoDocumentException e)
		{
			System.out.println("create view with id: " + viewId);
			createView(path, path, viewId);
			view = dbClient.view(viewId);
			allDocs = view.includeDocs(true).query();
		}

		ArrayList<BTSProject> results = new ArrayList<BTSProject>();
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("json", new JsResourceFactoryImpl());
		resourceSet.getURIConverter().getURIHandlers().add(0, new CouchDBHandler());
		for (String jo : allDocs)
		{
			System.out.println(jo);
			if (true)
			{
				URI uri = URI.createURI(getLocalDBURL() + DaoConstants.ADMIN + extractIdFromObjectString(jo));
				Resource resource = resourceSet.getResource(uri, true);
				final JSONLoad loader = new JSONLoad(new ByteArrayInputStream(jo.getBytes()),
						new HashMap<Object, Object>());
				loader.fillResource(resource);
				results.add((BTSProject) resource.getContents().get(0));
			}
		}
		if (!results.isEmpty())
		{
			registerQueryIdWithInternalRegistry(viewId, path);
		}
		return results;
	}

//	@Override
//	public void add(BTSProject entity, String path)
//	{
//
//		URI uri = URI.createURI(getLocalDBURL() + DaoConstants.ADMIN + entity.get_id());
//		System.out.println(uri);
//		Resource resource = connectionProvider.getEmfResourceSet().createResource(uri);
//		resource.getContents().add(entity);
//
//		try
//		{
//			resource.save(null);
//		} catch (IOException e)
//		{
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			throw new RuntimeException("Save Resource failed");
//		}
//	}
//
//	@Override
//	public void update(BTSProject entity, String path)
//	{
//		// FIXME implement Update
//		URI uri = URI.createURI(getLocalDBURL() + DaoConstants.ADMIN + entity.get_id());
//		Resource resource = connectionProvider.getEmfResourceSet().createResource(uri);
//		resource.getContents().add(entity);
//
//		try
//		{
//			resource.save(null);
//		} catch (IOException e)
//		{
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			throw new RuntimeException("Save Resource failed");
//		}
//	}

//	@Override
//	public void remove(BTSProject entity, String path)
//	{
//		URI uri = URI.createURI(getLocalDBURL() + DaoConstants.ADMIN + entity.get_id());
//		Resource resource = connectionProvider.getEmfResourceSet().createResource(uri);
//		resource.getContents().add(entity);
//
//		try
//		{
//			resource.delete(null);
//		} catch (IOException e)
//		{
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			throw new RuntimeException("Delete Resource failed");
//		}
//	}

	@SuppressWarnings("unchecked")
	@Override
	public BTSProject find(String key, String path)
	{
		URI uri = URI.createURI(getLocalDBURL() + DaoConstants.ADMIN + key.toString());
		Resource resource = connectionProvider.getEmfResourceSet().getResource(uri, true);
		if (resource.getContents().size() > 0)
		{
			Object o = resource.getContents().get(0);
			if (o instanceof BTSProject)
			{
				return (BTSProject) o;
			}
		}
		return null;
	}

	@Override
	public void addAuthorisation(BTSProjectDBCollection coll, String prefix)
	{
		if (!coll.getRoleDescriptions().isEmpty())
		{
			CouchDbClient dbClient = connectionProvider.getDBClient(CouchDbClient.class, coll.getCollectionName());
			Gson gson = dbClient.getGson();

			String json = "{ ";
			json += "\"_id\":\"_security\",";
			for (int i = 0; i < coll.getRoleDescriptions().size(); i++)
			{
				BTSDBCollectionRoleDesc desc = coll.getRoleDescriptions().get(i);
				json += "\"" + desc.getRoleName() + "\": { \"names\" : " + gson.toJson(desc.getUserNames()) + ",";
				json += " \"roles\" : " + gson.toJson(desc.getUserRoles()) + "}";
				if (i < coll.getRoleDescriptions().size() - 1)
				{
					json += ",";
				}
			}
			json += "}";
			JsonObject jsonobj = dbClient.getGson().fromJson(json, JsonObject.class);
			System.out.println(json);
			dbClient.save(jsonobj);
		} else
		{
			//remove _security
			CouchDbClient dbClient = connectionProvider.getDBClient(CouchDbClient.class, coll.getCollectionName());
			dbClient.remove("_security", "0");

		}

	}
}
