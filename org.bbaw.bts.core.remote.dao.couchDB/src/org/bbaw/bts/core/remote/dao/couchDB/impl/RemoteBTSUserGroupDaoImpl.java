package org.bbaw.bts.core.remote.dao.couchDB.impl;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.bbaw.bts.btsmodel.BTSUserGroup;
import org.bbaw.bts.core.remote.dao.RemoteBTSUserGroupDao;
import org.bbaw.bts.core.remote.dao.util.RemoteDaoConstants;
import org.eclipse.e4.core.di.annotations.Creatable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipselabs.emfjson.couchdb.CouchDBHandler;
import org.eclipselabs.emfjson.internal.JSONLoad;
import org.eclipselabs.emfjson.resource.JsResourceFactoryImpl;
import org.lightcouch.CouchDbClient;

import com.google.gson.JsonObject;

@Creatable
public class RemoteBTSUserGroupDaoImpl extends RemoteCouchDBDao<BTSUserGroup, String> implements RemoteBTSUserGroupDao
{

	@Override
	public boolean removeBTSUserGroup(BTSUserGroup userGroup, String path)
	{
		// TODO Auto-generated method stub
		super.remove(userGroup, path);
		return true;
	}

	@Override
	public List<BTSUserGroup> list(String path)
	{
		List<JsonObject> allDocs = connectionProvider.getDBClient(CouchDbClient.class, path)
				.view(RemoteDaoConstants.VIEW_ALL_BTSUSERGROUPS).includeDocs(true).query(JsonObject.class);
		ArrayList<BTSUserGroup> results = new ArrayList<BTSUserGroup>();
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("json", new JsResourceFactoryImpl());
		resourceSet.getURIConverter().getURIHandlers().add(0, new CouchDBHandler());
		for (JsonObject jo : allDocs)
		{
			System.out.println(jo.get(RemoteDaoConstants.ID_STRING).getAsString());
			if (!jo.get(RemoteDaoConstants.ID_STRING).getAsString().startsWith("_"))
			{
				URI uri = URI.createURI(getRemoteDBURL() + path + jo.get(RemoteDaoConstants.ID_STRING).getAsString());
				Resource resource = resourceSet.getResource(uri, true);
				final JSONLoad loader = new JSONLoad(new ByteArrayInputStream(jo.toString().getBytes()),
						new HashMap<Object, Object>());
				loader.fillResource(resource);
				results.add((BTSUserGroup) resource.getContents().get(0));
			}
		}
		if (!results.isEmpty())
		{
			registerQueryIdWithInternalRegistry(RemoteDaoConstants.VIEW_ALL_BTSUSERGROUPS, path);
		}
		return results;
	}
}
