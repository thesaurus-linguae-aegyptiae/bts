package org.bbaw.bts.core.remote.dao.couchDB.impl;

import java.io.IOException;
import java.util.List;
import java.util.Vector;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSDBCollectionRoleDesc;
import org.bbaw.bts.btsmodel.BTSProject;
import org.bbaw.bts.btsmodel.BTSProjectDBCollection;
import org.bbaw.bts.core.remote.dao.RemoteBTSProjectDao;
import org.bbaw.bts.core.remote.dao.RemoteDBConnectionProvider;
import org.bbaw.bts.core.remote.dao.util.RemoteDaoConstants;
import org.eclipse.e4.core.di.annotations.Creatable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.lightcouch.CouchDbClient;
import org.lightcouch.DesignDocument;
import org.lightcouch.NoDocumentException;
import org.lightcouch.View;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

@Creatable
public class RemoteBTSProjectDaoImpl extends RemoteCouchDBDao<BTSProject, String> implements RemoteBTSProjectDao
{

	@Inject
	protected RemoteDBConnectionProvider connectionProvider;

	@Override
	public boolean removeBTSProject(BTSProject btsProject)
	{
		// TODO Auto-generated method stub
		super.remove(btsProject, RemoteDaoConstants.ADMIN);
		return true;
	}

	@Override
	public List<BTSProject> list(String path)
	{
		List<String> allDocs = loadDocsFromView(RemoteDaoConstants.VIEW_ALL_BTSPROJECTS, path, path);
		List<BTSProject> results = loadObjectsFromStrings(allDocs, path);
		if (!results.isEmpty())
		{
			registerQueryIdWithInternalRegistry(RemoteDaoConstants.VIEW_ALL_BTSPROJECTS, path);
		}
		return results;
	}
	
	@Override
	public List<BTSProject> list(String path, String username, String password) {
		View view;
		List<String> allDocs = new Vector<String>();
		CouchDbClient dbClient = connectionProvider.getDBClient(CouchDbClient.class, path, username, password);
		try
		{

			view = dbClient.view(RemoteDaoConstants.VIEW_ALL_BTSPROJECTS);
			allDocs = view.includeDocs(true).query();
		} catch (NoDocumentException e)
		{
			e.printStackTrace();

			DesignDocument designDoc = dbClient.design().getFromDesk(RemoteDaoConstants.VIEW_ALL_BTSPROJECTS);
			// designDoc.new DesignDocument();//
			dbClient.design().synchronizeWithDb(designDoc);
			view = dbClient.view(RemoteDaoConstants.VIEW_ALL_BTSPROJECTS);
			allDocs = view.includeDocs(true).query();
		}
		List<BTSProject> results = loadObjectsFromStrings(allDocs, path);
		if (!results.isEmpty())
		{
			registerQueryIdWithInternalRegistry(RemoteDaoConstants.VIEW_ALL_BTSPROJECTS, path);
		}
		return results;
	}

	@Override
	public void add(BTSProject entity, String path)
	{

		URI uri = URI.createURI(getRemoteDBURL() + RemoteDaoConstants.ADMIN + entity.get_id());
		System.out.println(uri);
		Resource resource = connectionProvider.getEmfResourceSet().createResource(uri);
		resource.getContents().add(entity);

		try
		{
			resource.save(null);
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("Save Resource failed");
		}
	}

	@Override
	public void update(BTSProject entity, String path)
	{
		// FIXME implement Update
		URI uri = URI.createURI(getRemoteDBURL() + RemoteDaoConstants.ADMIN + entity.get_id());
		Resource resource = connectionProvider.getEmfResourceSet().createResource(uri);
		resource.getContents().add(entity);

		try
		{
			resource.save(null);
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("Save Resource failed");
		}
	}

	@Override
	public void remove(BTSProject entity, String path)
	{
		URI uri = URI.createURI(getRemoteDBURL() + RemoteDaoConstants.ADMIN + entity.get_id());
		Resource resource = connectionProvider.getEmfResourceSet().createResource(uri);
		resource.getContents().add(entity);

		try
		{
			resource.delete(null);
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("Delete Resource failed");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public BTSProject find(String key, String path)
	{
		URI uri = URI.createURI(getRemoteDBURL() + RemoteDaoConstants.ADMIN + key.toString());
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
	public void addAuthorisation(BTSProjectDBCollection coll, String path)
	{
		if (!coll.getRoleDescriptions().isEmpty())
		{
			CouchDbClient dbClient = connectionProvider.getDBClient(CouchDbClient.class, coll.getCollectionName());
			Gson gson = dbClient.getGson();

			String json = "{ \"_id\": \"_security\", ";
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
			dbClient.remove("_security", null);

		}

	}

	

	
}
