package org.bbaw.bts.dao.couchDB.impl;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import org.bbaw.bts.btsmodel.BTSCorpusObject;
import org.bbaw.bts.btsmodel.BTSPassportEntry;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.core.dao.CorpusObjectDao;
import org.bbaw.bts.core.dao.util.DaoConstants;
import org.bbaw.bts.searchModel.BTSQueryRequest;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipselabs.emfjson.couchdb.CouchDBHandler;
import org.eclipselabs.emfjson.internal.JSONLoad;
import org.eclipselabs.emfjson.resource.JsResourceFactoryImpl;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.action.search.SearchType;
import org.elasticsearch.client.Client;
import org.elasticsearch.search.SearchHit;
import org.lightcouch.CouchDbClient;
import org.lightcouch.NoDocumentException;
import org.lightcouch.View;

import com.google.gson.JsonObject;

public class CorpusObjectDaoImpl extends CouchDBDao<BTSCorpusObject, String> implements CorpusObjectDao
{

	@Override
	public List<BTSCorpusObject> getRootBTSCorpusObjects(String path)
	{
		List<JsonObject> allDocs = connectionProvider.getDBClient(CouchDbClient.class, path)
				.view(DaoConstants.VIEW_ALL_DOCS).includeDocs(true).query(JsonObject.class);
		ArrayList<BTSCorpusObject> results = new ArrayList<BTSCorpusObject>();
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("json", new JsResourceFactoryImpl());
		resourceSet.getURIConverter().getURIHandlers().add(0, new CouchDBHandler());
		for (JsonObject jo : allDocs)
		{
			System.out.println(jo.get(DaoConstants.ID_STRING).getAsString());
			if (!jo.get(DaoConstants.ID_STRING).getAsString().startsWith("_"))
			{
				URI uri = URI.createURI(getLocalDBURL() + path + jo.get(DaoConstants.ID_STRING).getAsString());
				Resource resource = resourceSet.getResource(uri, true);
				final JSONLoad loader = new JSONLoad(new ByteArrayInputStream(jo.toString().getBytes()),
						new HashMap<Object, Object>());
				loader.fillResource(resource);
				Object o = resource.getContents().get(0);
				if (o instanceof BTSCorpusObject)
				{
					results.add((BTSCorpusObject) o);
				}
			}
		}
		if (!results.isEmpty())
		{
			registerQueryIdWithInternalRegistry(DaoConstants.VIEW_ALL_DOCS, path);
		}
		return results;
	}

	@Override
	public List<BTSCorpusObject> list(String path)
	{
		List<String> allDocs = new ArrayList<String>(0);
		View view;
		try
		{
			view = connectionProvider.getDBClient(CouchDbClient.class, path).view(DaoConstants.VIEW_ALL_CORPUS_OBJECTS);
			allDocs = view.includeDocs(true).query();
		} catch (NoDocumentException e)
		{
			e.printStackTrace();
			createView(path, path, DaoConstants.VIEW_ALL_CORPUS_OBJECTS);
			view = connectionProvider.getDBClient(CouchDbClient.class, path).view(DaoConstants.VIEW_ALL_CORPUS_OBJECTS);
			allDocs = view.includeDocs(true).query();
		}

		ArrayList<BTSCorpusObject> results = new ArrayList<BTSCorpusObject>();
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
				results.add((BTSCorpusObject) resource.getContents().get(0));
			}
		}
		if (!results.isEmpty())
		{
			registerQueryIdWithInternalRegistry(DaoConstants.VIEW_ALL_CORPUS_OBJECTS, path);
		}
		return results;

	}

	@Override
	public List<BTSCorpusObject> findByQueryId(String searchId, String path)
	{
		List<String> allDocs = new ArrayList<String>(0);
		View view;
		CouchDbClient dbClient = connectionProvider.getDBClient(CouchDbClient.class, path);
		try
		{
			view = dbClient.view(searchId);
			allDocs = view.includeDocs(true).query();
		} catch (NoDocumentException e)
		{
			e.printStackTrace();
			createView(path, DaoConstants.PROJECT_CORPUS, searchId);
			view = dbClient.view(searchId);
			allDocs = view.includeDocs(true).query();
		}

		ArrayList<BTSCorpusObject> results = new ArrayList<BTSCorpusObject>();
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
				results.add((BTSCorpusObject) resource.getContents().get(0));
			}
		}
		if (!results.isEmpty())
		{
			registerQueryIdWithInternalRegistry(searchId, path);
		}
		return results;
	}

	@Override
	public Collection<? extends BTSPassportEntry> getPassportEntryProposals(
			BTSQueryRequest query, String indexName, String indexType) {
		if (query.getSearchRequestBuilder() == null) {
			SearchResponse response = connectionProvider
					.getSearchClient(Client.class)
					.prepareSearch(indexName)
					.setTypes(indexType)
					.setSearchType(SearchType.QUERY_AND_FETCH)
					.setQuery(query.getQueryBuilder())
					// Query
					// .setFilter(FilterBuilders.rangeFilter("age").from(12).to(18))
					// // Filter
					.setFrom(0).setSize(60).setExplain(true).execute()
					.actionGet();
			List<BTSPassportEntry> result = new Vector<BTSPassportEntry>();
			for (SearchHit hit : response.getHits()) {
				result.addAll(transformHitToPassportEntry(hit, query));
			}

			return result;
		} else {
			SearchResponse response = query.getSearchRequestBuilder()
					.setIndices(indexName).setTypes(indexType)
					.setSearchType(SearchType.QUERY_AND_FETCH).execute()
					.actionGet();
			List<BTSPassportEntry> result = new Vector<BTSPassportEntry>();
			for (SearchHit hit : response.getHits()) {
				result.addAll(transformHitToPassportEntry(hit, query));
			}

			return result;
		}
	}

	private List<BTSPassportEntry> transformHitToPassportEntry(SearchHit hit,
			BTSQueryRequest query) {
		List<BTSPassportEntry> result = new Vector<BTSPassportEntry>();
		for (Object o : hit.getFields().get(query.getRequestField())
				.getValues()) {
			if (o instanceof String) {
				if (((String) o).startsWith(query.getAutocompletePrefix())) {
					System.out.println(o);
				}
			} else if (o instanceof List) {
				List l = (List) o;
				for (Object oo : l) {
					if (oo instanceof String) {
						if (((String) oo).startsWith(query
								.getAutocompletePrefix())) {
							System.out.println(oo);
						}
					} else if (oo instanceof List) {
						List ll = (List) oo;
						for (Object ooo : ll) {
							if (ooo instanceof String) {
								if (((String) ooo).startsWith(query
										.getAutocompletePrefix())) {
									System.out.println(ooo);
								}
							} else if (ooo instanceof List) {
								List lll = (List) ooo;
								for (Object oooo : lll) {
									if (oooo instanceof String) {
										if (((String) oooo).startsWith(query
												.getAutocompletePrefix())) {
											System.out.println(oooo);
										}
									}
 else if (oooo instanceof Map) {
										Map map = (Map) oooo;

										if (map.containsKey("type")) {
											if (query
													.getRequestTypeFieldValue()
													.equals((String) map
															.get("type"))) {
												BTSPassportEntry entry = BtsmodelFactory.eINSTANCE
														.createBTSPassportEntryItem();
												entry.setType((String) map
														.get("type"));
												if (map.containsKey("value")) {
													entry.setValue((String) map
															.get("value"));
												}
												if (map.containsKey("_id")) {
													entry.set_id((String) map
															.get("_id"));
												}
												result.add(entry);
											}

										}

									}
								}
							}
						}
					}
				}
			}
		}

		return result;

	}

}
