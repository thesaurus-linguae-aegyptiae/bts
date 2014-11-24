package org.bbaw.bts.core.dao.corpus.couchdb.impl;

import java.util.List;
import java.util.Vector;
import java.util.regex.Matcher;

import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.dao.corpus.BTSThsEntryDao;
import org.bbaw.bts.core.dao.util.DaoConstants;
import org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaEntry;
import org.bbaw.bts.corpus.btsCorpusModel.BTSThsEntry;
import org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelFactory;
import org.bbaw.bts.dao.couchDB.CouchDBDao;

public class BTSThsEntryDaoImpl extends AbstractCorpusObjectDaoImpl<BTSThsEntry, String> implements BTSThsEntryDao
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
				&& objectState.equals(BTSConstants.OBJECT_STATE_ACTIVE)) {
			viewId = DaoConstants.VIEW_ALL_ACTIVE_BTSTHSENTRIES;
		} else if (objectState != null
				&& objectState.equals(BTSConstants.OBJECT_STATE_TERMINATED)) {
			viewId = DaoConstants.VIEW_ALL_TERMINATED_BTSTHSENTRIES;
		}
		List<String> allDocs = loadDocsFromView(viewId, path, "ths");
		List<BTSThsEntry> results = super.loadObjectsFromStrings(allDocs, path);//loadPartialObjectsFromStrings(allDocs, path);
		if (!results.isEmpty())
		{
			registerQueryIdWithInternalRegistry(viewId, path);
		}
		return results;
//		List<String> allDocs = new ArrayList<String>(0);
//		View view;
//		try {
//			view = connectionProvider.getDBClient(CouchDbClient.class, path)
//					.view(viewId);
//			allDocs = view.includeDocs(true).query();
//		} catch (NoDocumentException e) {
//			e.printStackTrace();
//			createView(path, "ths", viewId);
//			view = connectionProvider.getDBClient(CouchDbClient.class, path)
//					.view(viewId);
//			allDocs = view.includeDocs(true).query();
//		}
//		ArrayList<BTSThsEntry> results = new ArrayList<BTSThsEntry>();
//		ResourceSet resourceSet = new ResourceSetImpl();
//		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("json", new JsResourceFactoryImpl());
//		resourceSet.getURIConverter().getURIHandlers().add(0, new CouchDBHandler());
//		for (String jo : allDocs)
//		{
//			if (true)
//			{
//				URI uri = URI.createURI(getLocalDBURL() + "/" + path + "/"
//						+ extractIdFromObjectString(jo));
//				System.out.println(uri);
//
//				BTSThsEntry entry = find(uri);
//				if (entry != null)
//				{
//					System.out.println("uri found " + uri);
//					results.add(entry);
//				}
//				else
//				{
//					Resource resource = resourceSet.getResource(uri, true);
//					final JSONLoad loader = new JSONLoad(new ByteArrayInputStream(
//							jo.getBytes()),
//							new HashMap<Object, Object>());
//					loader.fillResource(resource);
//					if (!resource.getContents().isEmpty()) {
//						BTSThsEntry ths = (BTSThsEntry) resource.getContents().get(0);
//						checkForConflicts(ths, path);
//						results.add(ths);
//					}
//				}
//				
//			}
//		}
//		if (!results.isEmpty())
//		{
//			registerQueryIdWithInternalRegistry(viewId, path);
//		}
//		return results;
	}

	@Override
	public List<BTSThsEntry> list(String path,
			String staticQueryId, String objectState) {

//		List<String> allDocs = new ArrayList<String>(0);
//		View view;
//		try {
//			view = connectionProvider.getDBClient(CouchDbClient.class, path)
//					.view(staticQueryId);
//			allDocs = view.includeDocs(true).query();
//		} catch (NoDocumentException e) {
//			e.printStackTrace();
//			createView(path, "ths", staticQueryId);
//			view = connectionProvider.getDBClient(CouchDbClient.class, path)
//					.view(staticQueryId);
//			allDocs = view.includeDocs(true).query();
//		}
		List<String> allDocs = loadDocsFromView(staticQueryId, path, "ths");
		List<BTSThsEntry> results = loadPartialObjectsFromStrings(allDocs, path);
		if (!results.isEmpty())
		{
			registerQueryIdWithInternalRegistry(staticQueryId, path);
		}
		return results;
		// List<JsonObject> allDocs = connectionProvider
		// .getDBClient(CouchDbClient.class, path).view(staticQueryId)
		// .includeDocs(true).query(JsonObject.class);
//		ArrayList<BTSThsEntry> results = new ArrayList<BTSThsEntry>();
//		ResourceSet resourceSet = new ResourceSetImpl();
//		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
//				"json", new JsResourceFactoryImpl());
//		resourceSet.getURIConverter().getURIHandlers()
//				.add(0, new CouchDBHandler());
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
//		for (String jo : allDocs) {
//			System.out.println(jo);
//			if (true) {
//				// FIXME path statt DaoConstants.ADMIN???
//				URI uri = URI.createURI(getLocalDBURL() + "/" + path + "/"
//						+ extractIdFromObjectString(jo));
//				Resource resource = resourceSet.getResource(uri, true);
//				final JSONLoad loader = new JSONLoad(new ByteArrayInputStream(
//						jo.getBytes()),
//						new HashMap<Object, Object>());
//				loader.fillResource(resource);
//				if (!resource.getContents().isEmpty()) {
//					results.add((BTSThsEntry) resource.getContents().get(0));
//				}
//			}
//		}
//		if (!results.isEmpty()) {
//			registerQueryIdWithInternalRegistry(staticQueryId, path);
//		}
//		return results;
	}

	@Override
	protected BTSThsEntry createObject() {
		return BtsCorpusModelFactory.eINSTANCE.createBTSThsEntry();
	}
	
	
}
