package org.bbaw.bts.dao.couchDB.impl;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import org.bbaw.bts.btsmodel.BTSThsEntry;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.dao.BTSThsEntryDao;
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
public class BTSThsEntryDaoImpl extends CouchDBDao<BTSThsEntry, String> implements BTSThsEntryDao
{

	@Override
	public boolean removeBTSThsEntry(BTSThsEntry btsThsEntry, String path)
	{
		// TODO Auto-generated method stub
		super.remove(btsThsEntry, path);
		return true;
	}

	@Override
	public List<BTSThsEntry> list(String path, String objectState)
	{
		String viewId = DaoConstants.VIEW_ALL_BTSTHSENTRIES;
		if (objectState != null
				&& objectState.equals(BTSConstants.OBJECT_STATE_ACITVE)) {
			viewId = DaoConstants.VIEW_ALL_ACTIVE_BTSTHSENTRIES;
		} else if (objectState != null
				&& objectState.equals(BTSConstants.OBJECT_STATE_TERMINATED)) {
			viewId = DaoConstants.VIEW_ALL_TERMINATED_BTSTHSENTRIES;
		}
		// List<JsonObject> allDocs =
		// connectionProvider.getDBClient(CouchDbClient.class, path)
		// .view(viewId)
		// .includeDocs(true).query(JsonObject.class);
		List<String> allDocs = new ArrayList<String>(0);
		View view;
		try {
			view = connectionProvider.getDBClient(CouchDbClient.class, path)
					.view(viewId);
			allDocs = view.includeDocs(true).query();
		} catch (NoDocumentException e) {
			e.printStackTrace();
			createView(path, "ths", viewId);
			view = connectionProvider.getDBClient(CouchDbClient.class, path)
					.view(viewId);
			allDocs = view.includeDocs(true).query();
		}
		ArrayList<BTSThsEntry> results = new ArrayList<BTSThsEntry>();
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("json", new JsResourceFactoryImpl());
		resourceSet.getURIConverter().getURIHandlers().add(0, new CouchDBHandler());
		// for (JsonObject jo : allDocs)
		// {
		// System.out.println(jo.get(DaoConstants.ID_STRING).getAsString());
		// if (!jo.get(DaoConstants.ID_STRING).getAsString().startsWith("_"))
		// {
		// URI uri = URI.createURI(getLocalDBURL() + path +
		// jo.get(DaoConstants.ID_STRING).getAsString());
		// Resource resource = resourceSet.getResource(uri, true);
		// final JSONLoad loader = new JSONLoad(new
		// ByteArrayInputStream(jo.toString().getBytes()),
		// new HashMap<Object, Object>());
		// loader.fillResource(resource);
		// results.add((BTSThsEntry) resource.getContents().get(0));
		// }
		// }
		for (String jo : allDocs)
		{
			System.out.println(jo);
			if (true)
			{
				URI uri = URI.createURI(getLocalDBURL() + "/" + path + "/"
						+ extractIdFromObjectString(jo));
				BTSThsEntry entry = find(uri);
				if (entry != null)
				{
					System.out.println("uri found " + uri);
					results.add(entry);
				}
				else
				{
					Resource resource = resourceSet.getResource(uri, true);
					final JSONLoad loader = new JSONLoad(new ByteArrayInputStream(
							jo.getBytes()),
							new HashMap<Object, Object>());
					loader.fillResource(resource);
					if (!resource.getContents().isEmpty()) {
						results.add((BTSThsEntry) resource.getContents().get(0));
					}
				}
				
			}
		}
		if (!results.isEmpty())
		{
			registerQueryIdWithInternalRegistry(viewId, path);
		}
		return results;
	}

	@Override
	public Collection<? extends BTSThsEntry> list(String path,
			String staticQueryId, String objectState) {

		List<String> allDocs = new ArrayList<String>(0);
		View view;
		try {
			view = connectionProvider.getDBClient(CouchDbClient.class, path)
					.view(staticQueryId);
			allDocs = view.includeDocs(true).query();
		} catch (NoDocumentException e) {
			e.printStackTrace();
			createView(path, "ths", staticQueryId);
			view = connectionProvider.getDBClient(CouchDbClient.class, path)
					.view(staticQueryId);
			allDocs = view.includeDocs(true).query();
		}

		// List<JsonObject> allDocs = connectionProvider
		// .getDBClient(CouchDbClient.class, path).view(staticQueryId)
		// .includeDocs(true).query(JsonObject.class);
		ArrayList<BTSThsEntry> results = new ArrayList<BTSThsEntry>();
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
				"json", new JsResourceFactoryImpl());
		resourceSet.getURIConverter().getURIHandlers()
				.add(0, new CouchDBHandler());
		// for (JsonObject jo : allDocs) {
		// System.out.println(jo.get(DaoConstants.ID_STRING).getAsString());
		// if (!jo.get(DaoConstants.ID_STRING).getAsString().startsWith("_")) {
		// URI uri = URI.createURI(getLocalDBURL() + path
		// + jo.get(DaoConstants.ID_STRING).getAsString());
		// Resource resource = resourceSet.getResource(uri, true);
		// final JSONLoad loader = new JSONLoad(new ByteArrayInputStream(
		// jo.toString().getBytes()),
		// new HashMap<Object, Object>());
		// loader.fillResource(resource);
		// results.add((BTSThsEntry) resource.getContents().get(0));
		// }
		// }
		for (String jo : allDocs) {
			System.out.println(jo);
			if (true) {
				// FIXME path statt DaoConstants.ADMIN???
				URI uri = URI.createURI(getLocalDBURL() + "/" + path + "/"
						+ extractIdFromObjectString(jo));
				Resource resource = resourceSet.getResource(uri, true);
				final JSONLoad loader = new JSONLoad(new ByteArrayInputStream(
						jo.getBytes()),
						new HashMap<Object, Object>());
				loader.fillResource(resource);
				if (!resource.getContents().isEmpty()) {
					results.add((BTSThsEntry) resource.getContents().get(0));
				}
			}
		}
		if (!results.isEmpty()) {
			registerQueryIdWithInternalRegistry(staticQueryId, path);
		}
		return results;
	}
}
