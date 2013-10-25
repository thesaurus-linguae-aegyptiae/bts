package org.bbaw.bts.dao.couchDB.impl;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.bbaw.bts.btsmodel.BTSUserGroup;
import org.bbaw.bts.core.dao.BTSUserGroupDao;
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

@Creatable
public class BTSUserGroupDaoImpl extends CouchDBDao<BTSUserGroup, String> implements BTSUserGroupDao
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
		List<String> allDocs = new ArrayList<String>();
		View view;
		CouchDbClient dbClient = connectionProvider.getDBClient(CouchDbClient.class, path);
		try
		{

			view = dbClient.view(DaoConstants.VIEW_ALL_BTSUSERGROUPS);
			allDocs = view.includeDocs(true).query();
		} catch (NoDocumentException e)
		{
			e.printStackTrace();
			createView(path, path, DaoConstants.VIEW_ALL_BTSUSERGROUPS);
			view = dbClient.view(DaoConstants.VIEW_ALL_BTSUSERGROUPS);
			allDocs = view.includeDocs(true).query();
		}
		ArrayList<BTSUserGroup> results = new ArrayList<BTSUserGroup>();
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("json", new JsResourceFactoryImpl());
		resourceSet.getURIConverter().getURIHandlers().add(0, new CouchDBHandler());
		for (String jo : allDocs)
		{
			URI uri = URI.createURI(getLocalDBURL() + "/" + path + "/" + extractIdFromObjectString(jo));
			Resource resource = resourceSet.getResource(uri, true);
			final JSONLoad loader = new JSONLoad(new ByteArrayInputStream(jo.getBytes()), new HashMap<Object, Object>());
			loader.fillResource(resource);
			results.add((BTSUserGroup) resource.getContents().get(0));
		}
		if (!results.isEmpty())
		{
			registerQueryIdWithInternalRegistry(DaoConstants.VIEW_ALL_BTSUSERGROUPS, path);
		}
		return results;
	}
}
