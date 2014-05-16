package org.bbaw.bts.dao.couchDB.impl;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.bbaw.bts.btsmodel.BTSProject;
import org.bbaw.bts.btsmodel.DBLease;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.dao.DBLeaseDao;
import org.bbaw.bts.core.dao.util.DaoConstants;
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

public class DBLeaseDaoImpl extends CouchDBDao<DBLease, String> implements DBLeaseDao
{

	@Override
	public boolean removeDBLease(DBLease lease, String path)
	{
		super.remove(lease, path);
		return true;
	}

	@Override
	public List<DBLease> list(String path, String objectState)
	{
		String viewId = DaoConstants.VIEW_ALL_DBLEASES;
		if (objectState != null
				&& objectState.equals(BTSConstants.OBJECT_STATE_ACTIVE)) {
			viewId = DaoConstants.VIEW_ALL_DBLEASES;
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

		ArrayList<DBLease> results = new ArrayList<DBLease>();
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("json", new JsResourceFactoryImpl());
		resourceSet.getURIConverter().getURIHandlers().add(0, new CouchDBHandler());
		for (String jo : allDocs)
		{
			System.out.println(jo);
			if (true)
			{
				URI uri = URI.createURI(getLocalDBURL() + "/" + path + "/" + extractIdFromObjectString(jo));
				Resource resource = resourceSet.getResource(uri, true);
				final JSONLoad loader = new JSONLoad(new ByteArrayInputStream(jo.getBytes()),
						new HashMap<Object, Object>());
				loader.fillResource(resource);
				results.add((DBLease) resource.getContents().get(0));
			}
		}
		return results;
	}
}
