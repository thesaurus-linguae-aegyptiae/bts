package org.bbaw.bts.dao.couchDB.impl;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import org.bbaw.bts.btsmodel.BTSCorpusObject;
import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.btsmodel.BTSPassportEntry;
import org.bbaw.bts.btsmodel.BTSPassportEntryItem;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.dao.CorpusObjectDao;
import org.bbaw.bts.core.dao.util.DaoConstants;
import org.bbaw.bts.searchModel.BTSQueryRequest;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipselabs.emfjson.couchdb.CouchDBHandler;
import org.eclipselabs.emfjson.internal.JSONLoad;
import org.eclipselabs.emfjson.internal.JSONUtil;
import org.eclipselabs.emfjson.resource.JsResourceFactoryImpl;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.action.search.SearchType;
import org.elasticsearch.client.Client;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHitField;
import org.lightcouch.CouchDbClient;
import org.lightcouch.NoDocumentException;
import org.lightcouch.View;

import com.google.gson.JsonObject;

public class CorpusObjectDaoImpl extends CouchDBDao<BTSCorpusObject, String>
		implements CorpusObjectDao {

	@Override
	public List<BTSCorpusObject> getRootBTSCorpusObjects(String path) {
		List<JsonObject> allDocs = connectionProvider
				.getDBClient(CouchDbClient.class, path)
				.view(DaoConstants.VIEW_ALL_DOCS).includeDocs(true)
				.query(JsonObject.class);
		ArrayList<BTSCorpusObject> results = new ArrayList<BTSCorpusObject>();
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
				"json", new JsResourceFactoryImpl());
		resourceSet.getURIConverter().getURIHandlers()
				.add(0, new CouchDBHandler());
		for (JsonObject jo : allDocs) {
			System.out.println(jo.get(DaoConstants.ID_STRING).getAsString());
			if (!jo.get(DaoConstants.ID_STRING).getAsString().startsWith("_")) {
				URI uri = URI.createURI(getLocalDBURL() + path
						+ jo.get(DaoConstants.ID_STRING).getAsString());
				Resource resource = resourceSet.getResource(uri, true);
				final JSONLoad loader = new JSONLoad(new ByteArrayInputStream(
						jo.toString().getBytes()),
						new HashMap<Object, Object>());
				loader.fillResource(resource);
				Object o = resource.getContents().get(0);
				if (o instanceof BTSCorpusObject) {
					checkForConflicts((BTSCorpusObject) o, path);
					results.add((BTSCorpusObject) o);
				}
			}
		}
		if (!results.isEmpty()) {
			registerQueryIdWithInternalRegistry(DaoConstants.VIEW_ALL_DOCS,
					path);
		}
		return results;
	}

	@Override
	public List<BTSCorpusObject> list(String path, String objectState) {
		String viewId = DaoConstants.VIEW_ALL_CORPUS_OBJECTS;
		if (objectState != null
				&& objectState.equals(BTSConstants.OBJECT_STATE_ACTIVE)) {
			viewId = DaoConstants.VIEW_ALL_ACTIVE_CORPUS_OBJECTS;
		} else if (objectState != null
				&& objectState.equals(BTSConstants.OBJECT_STATE_TERMINATED)) {
			viewId = DaoConstants.VIEW_ALL_TERMINATED_CORPUS_OBJECTS;
		}
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

		ArrayList<BTSCorpusObject> results = new ArrayList<BTSCorpusObject>();
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
				"json", new JsResourceFactoryImpl());
		resourceSet.getURIConverter().getURIHandlers()
				.add(0, new CouchDBHandler());
		for (String jo : allDocs) {
			System.out.println(jo);
			if (true) {
				// FIXME path statt DaoConstants.ADMIN???
				URI uri = URI.createURI(getLocalDBURL() + DaoConstants.ADMIN
						+ extractIdFromObjectString(jo));
				Resource resource = resourceSet.getResource(uri, true);
				final JSONLoad loader = new JSONLoad(new ByteArrayInputStream(
						jo.getBytes()), new HashMap<Object, Object>());
				loader.fillResource(resource);
				results.add((BTSCorpusObject) resource.getContents().get(0));
			}
		}
		if (!results.isEmpty()) {
			registerQueryIdWithInternalRegistry(viewId, path);
		}
		return results;

	}

	@Override
	public List<BTSCorpusObject> findByQueryId(String searchId, String path,
			String objectState) {
		if (objectState != null
				&& objectState.equals(BTSConstants.OBJECT_STATE_ACTIVE)) {
			searchId = getActiveSearchId(searchId);
		} else if (objectState != null
				&& objectState.equals(BTSConstants.OBJECT_STATE_TERMINATED)) {
			searchId = getTerminatedSearchId(searchId);
		}
		List<String> allDocs = new ArrayList<String>(0);
		View view;
		CouchDbClient dbClient = connectionProvider.getDBClient(
				CouchDbClient.class, path);
		try {
			view = dbClient.view(searchId);
			allDocs = view.includeDocs(true).query();
		} catch (NoDocumentException e) {
			e.printStackTrace();
			createView(path, DaoConstants.PROJECT_CORPUS, searchId);
			view = dbClient.view(searchId);
			allDocs = view.includeDocs(true).query();
		}

		ArrayList<BTSCorpusObject> results = new ArrayList<BTSCorpusObject>();
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
				"json", new JsResourceFactoryImpl());
		resourceSet.getURIConverter().getURIHandlers()
				.add(0, new CouchDBHandler());
		for (String jo : allDocs) {
			System.out.println(jo);
			if (true) {
				URI uri = URI.createURI(getLocalDBURL() + DaoConstants.ADMIN
						+ extractIdFromObjectString(jo));
				Resource resource = resourceSet.getResource(uri, true);
				final JSONLoad loader = new JSONLoad(new ByteArrayInputStream(
						jo.getBytes()), new HashMap<Object, Object>());
				loader.fillResource(resource);
				results.add((BTSCorpusObject) resource.getContents().get(0));
			}
		}
		if (!results.isEmpty()) {
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
		Map source = hit.getSource();
		Map pp = (Map) source.get("passport");
		
		result.addAll(transfromFromPPEntryMap(pp, query));
		return result;

	}

	private Collection<? extends BTSPassportEntry> transfromFromPPEntryMap(
			Map map, BTSQueryRequest query) {
		List<BTSPassportEntry> result = new Vector<BTSPassportEntry>(1);

		if (map.containsKey(DaoConstants.ID_STRING))
		{
			BTSPassportEntryItem item = BtsmodelFactory.eINSTANCE.createBTSPassportEntryItem();
			item.set_id((String) map.get(DaoConstants.ID_STRING));
			item.setValue((String) map.get("value"));
			item.setType((String) map.get("type"));
			if (item.getValue() != null && item.getValue().startsWith(query.getAutocompletePrefix()))
			{
				result.add(item);
			}
		}
		if (!map.containsKey("children"))
		{
			return result;
		}

		List children = (List) map.get("children");
		for (Object o : children)
		{
			if (o instanceof Map)
			{
				result.addAll(transfromFromPPEntryMap((Map) o, query));
			}
		}
		
		return result;
	}

}
