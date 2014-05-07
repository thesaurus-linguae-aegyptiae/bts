package org.bbaw.bts.dao.couchDB.impl;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.dao.DBConnectionProvider;
import org.bbaw.bts.core.dao.GenericDao;
import org.bbaw.bts.core.dao.util.DaoConstants;
import org.bbaw.bts.modelUtils.EmfModelHelper;
import org.bbaw.bts.searchModel.BTSQueryRequest;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Creatable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipselabs.emfjson.couchdb.CouchDBHandler;
import org.eclipselabs.emfjson.internal.JSONLoad;
import org.eclipselabs.emfjson.resource.JsResourceFactoryImpl;
import org.elasticsearch.ElasticsearchException;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.action.search.SearchType;
import org.elasticsearch.client.Client;
import org.elasticsearch.common.xcontent.XContentFactory;
import org.elasticsearch.index.query.FilterBuilders;
import org.elasticsearch.search.SearchHit;
import org.lightcouch.CouchDbClient;
import org.lightcouch.DesignDocument;
import org.lightcouch.NoDocumentException;
import org.lightcouch.View;

import com.google.gson.JsonObject;

@Creatable
public abstract class CouchDBDao<E extends BTSDBBaseObject, K extends Serializable> implements GenericDao<E, K>
{

	protected Class<? extends BTSDBBaseObject> daoType;

	@Inject
	protected DBConnectionProvider connectionProvider;

	@Inject
	private IEclipseContext context;

	protected String protocol;
	protected String host;
	protected int port;

	private Pattern idPattern = Pattern.compile(DaoConstants.ID_PATTERN);

	@SuppressWarnings("unchecked")
	public CouchDBDao()
	{
		daoType = (Class<E>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];

	}

	@Override
	public void add(E entity, String path)
	{
		Map<String, String> options = new HashMap<String, String>();
		options.put(XMLResource.OPTION_ENCODING, BTSConstants.ENCODING); // set
																			// encoding
																			// to
		// UTF-8
		Resource resource = entity.eResource();
		// check if entity has resource, that is if it was newly created or not
		if (resource == null)
		{
			URI uri = URI.createURI(getLocalDBURL() + "/" + path + "/" + entity.get_id());
			System.out.println(uri);
			resource = connectionProvider.getEmfResourceSet().createResource(uri);
			resource.getContents().add(entity);
		}

		try
		{
			resource.save(options);
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("Save Resource failed");
		}
	}

	@Override
	public boolean addMultiple(Set<E> entities, String path)
	{

		//FIXME optimize couchdb bath saving
		for (E entity : entities)
		{
			add(entity, path);
		}
		return true;
	}

	@Override
	public void update(E entity, String path)
	{
		try
		{
			entity.eResource().save(null);
		} catch (IOException e)
		{
			e.printStackTrace();
			throw new RuntimeException("Save Resource failed");
		}
	}

	@Override
	public void remove(E entity, String path)
	{
		try
		{
			entity.eResource().delete(null);
		} catch (IOException e)
		{
			e.printStackTrace();
			throw new RuntimeException("Delete Resource failed");
		}
		CouchDbClient dbClient = connectionProvider.getDBClient(
				CouchDbClient.class, path);
		dbClient.remove(entity.get_id(), entity.get_rev());

	}

	@SuppressWarnings("unchecked")
	@Override
	public E find(K key, String path)
	{
		URI uri = URI.createURI(getLocalDBURL() + "/" + path + "/" + key.toString());
		Resource resource = connectionProvider.getEmfResourceSet().getResource(uri, true);
		Map<String, String> options = new HashMap<String, String>();
		
		options.put(XMLResource.OPTION_ENCODING, BTSConstants.ENCODING);
		System.out.println(uri);
		try {
			resource.load(options);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (resource.getContents().size() > 0)
		{
			Object o = resource.getContents().get(0);
			if (o instanceof BTSDBBaseObject)
			{
				return (E) o;
			}
		}
		return null;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public E find(URI uri)
	{
		Resource resource = connectionProvider.getEmfResourceSet().getResource(uri, true);
		Map<String, String> options = new HashMap<String, String>();
		
		options.put(XMLResource.OPTION_ENCODING, BTSConstants.ENCODING);
		System.out.println(uri);
		try {
			resource.load(options);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (resource.getContents().size() > 0)
		{
			Object o = resource.getContents().get(0);
			if (o instanceof BTSDBBaseObject)
			{
				return (E) o;
			}
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<E> list(String path, String objectState)
	{
		String view = DaoConstants.VIEW_ALL_DOCS;
		if (objectState != null
				&& objectState.equals(BTSConstants.OBJECT_STATE_ACITVE)) {
			view = DaoConstants.VIEW_ALL_ACTIVE_DOCS;
		} else if (objectState != null
				&& objectState.equals(BTSConstants.OBJECT_STATE_TERMINATED)) {
			view = DaoConstants.VIEW_ALL_TERMINATED_DOCS;
		}
		List<JsonObject> allDocs = connectionProvider.getDBClient(CouchDbClient.class, path)
.view(view)
				.includeDocs(true).query(JsonObject.class);
		ArrayList<BTSDBBaseObject> results = new ArrayList<BTSDBBaseObject>();
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("json", new JsResourceFactoryImpl());
		connectionProvider.getEmfResourceSet().getURIConverter().getURIHandlers().add(0, new CouchDBHandler());
		for (JsonObject jo : allDocs)
		{
			System.out.println(jo.get(DaoConstants.ID_STRING).getAsString());
			if (!jo.get(DaoConstants.ID_STRING).getAsString().startsWith("_"))
			{
				URI uri = URI.createURI(getLocalDBURL() + path + jo.get(DaoConstants.ID_STRING).getAsString());
				Resource resource = connectionProvider.getEmfResourceSet().getResource(uri, true);
				final JSONLoad loader = new JSONLoad(new ByteArrayInputStream(jo.toString().getBytes()),
						new HashMap<Object, Object>());
				loader.fillResource(resource);
				results.add((BTSDBBaseObject) resource.getContents().get(0));
			}
		}
		if (!results.isEmpty())
		{
			registerQueryIdWithInternalRegistry(DaoConstants.VIEW_ALL_DOCS, path);
		}
		return (List<E>) results;
	}

	@Override
	public E reload(K key, String path)
	{
		URI uri = URI.createURI(getLocalDBURL() + "/" + path + "/" + key.toString());
		Resource resource = connectionProvider.getEmfResourceSet().getResource(uri, true);
		if (!resource.getContents().isEmpty())
		{
			EObject eObject = resource.getContents().get(0);
			Copier copier = new Copier();
			EClass eClass = eObject.eClass();

			if (resource.getContents().size() > 0) {
				ResourceSet tempResourceSet = new ResourceSetImpl();
				tempResourceSet.getURIConverter().getURIHandlers()
						.add(0, new CouchDBHandler());

				Resource tempResource = tempResourceSet.getResource(uri, true);
				EObject copyEObject = tempResource.getContents().get(0);
				if (copyEObject instanceof BTSDBBaseObject) {

					eObject = EmfModelHelper.mergeChanges(eObject, copyEObject);
					return (E) eObject;
				}
			}
		}
		else
		{
			return find(key, path);
		}
		return null;
	}

	public void createView(String path, String sourcePath, String viewName)
	{
		System.out.println("path " + path + " viewName " + viewName);
		CouchDbClient dbClient = connectionProvider.getDBClient(CouchDbClient.class, path);
		// design documents stored on local .js files

		DesignDocument designDoc = dbClient.design().getFromDesk(sourcePath);
		// designDoc.new DesignDocument();//
		dbClient.design().synchronizeWithDb(designDoc); // sync with db
		// dbClient.syncDesignDocsWithDb(); // sync all
	}

	public String extractIdFromObjectString(String objectString)
	{

		Matcher m = idPattern.matcher(objectString);

		if (m.find())
		{
			System.out.println(m.group(2));
		}
		return m.group(2);
	}

	@Override
	public List<E> query(BTSQueryRequest query, String indexName,
			String indexType, String objectState, boolean registerQuery)
	{

		if (query.getSearchRequestBuilder() == null)
		{
			SearchResponse response;
//			connectionProvider.getSearchClient(Client.class).admin().cluster().prepareHealth().setWaitForGreenStatus().execute().actionGet(); 
			if (BTSConstants.OBJECT_STATE_ACITVE.equals(objectState)) {
				response = connectionProvider
						.getSearchClient(Client.class)
						.prepareSearch(indexName)
						.setTypes(indexType)
						.setSearchType(SearchType.QUERY_AND_FETCH)
						.setQuery(query.getQueryBuilder())
						// Query
						.setPostFilter(
								FilterBuilders.termFilter("state",
										BTSConstants.OBJECT_STATE_ACITVE))
						// // Filter
						.setFrom(0).setSize(60).setExplain(true).execute()
						.actionGet();
			} else if (BTSConstants.OBJECT_STATE_TERMINATED.equals(objectState)) {
				response = connectionProvider
					.getSearchClient(Client.class)
					.prepareSearch(indexName)
					.setTypes(indexType)
					.setSearchType(SearchType.QUERY_AND_FETCH)
					.setQuery(query.getQueryBuilder())
					// Query
						.setPostFilter(
								FilterBuilders.termFilter("state",
										BTSConstants.OBJECT_STATE_TERMINATED))
					// // Filter
					.setFrom(0).setSize(60).setExplain(true).execute()
					.actionGet();
			} else {
				response = connectionProvider.getSearchClient(Client.class)
						.prepareSearch(indexName)
						.setTypes(indexType)
						.setSearchType(SearchType.QUERY_AND_FETCH)
						.setQuery(query.getQueryBuilder())
						// Query
						// // Filter
						.setFrom(0).setSize(60).setExplain(true).execute()
						.actionGet();
			}
			List<E> result = new Vector<E>();
			for (SearchHit hit : response.getHits())
			{
				try {
					result.add(loadObjectFromHit(hit, indexName));
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if (registerQuery)
			{
				registerQueryWithPercolator(query, indexName, indexType);
			}

			return result;
		}
 else
		{
			SearchResponse response = query.getSearchRequestBuilder()
					.setIndices(indexName).setTypes(indexType)
					.setSearchType(SearchType.QUERY_AND_FETCH).execute()
					.actionGet();
			List<E> result = new Vector<E>();
			for (SearchHit hit : response.getHits()) {
				try {
					result.add(loadObjectFromHit(hit, indexName));
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if (!result.isEmpty()) {
				registerQueryWithPercolator(query, indexName, indexType);
			}

			return result;
		}
	}

	protected void registerQueryWithPercolator(final BTSQueryRequest query, final String indexName, String indexType)
	{
		// register query with percolator
		// Index the query = register it in the percolator
		
		Job job = new Job("register with percolator"){
			@Override
			  protected IStatus run(IProgressMonitor monitor) {
				try
				{
					connectionProvider
							.getSearchClient(Client.class)
							.prepareIndex(indexName, DaoConstants.PERCOLATOR, query.getQueryId())
							.setSource(
									XContentFactory.jsonBuilder().startObject().field("query", query.getQueryBuilder())
											.endObject()).setRefresh(true).execute().actionGet();
				} catch (ElasticsearchException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			    return Status.OK_STATUS;
			  }
		};
		job.schedule();

	}

	protected void registerQueryIdWithInternalRegistry(String queryId, String path)
	{
		Map<String, List<String>> map = (Map<String, List<String>>) context.get(DaoConstants.QUERY_ID_REGISTRY);
		List<String> ids = null;
		if (map == null)
		{
			map = new HashMap<String, List<String>>(5);
			context.set(DaoConstants.QUERY_ID_REGISTRY, map);
		}
		if (map.containsKey(path))
		{
			ids = map.get(path);
			if (!ids.contains(queryId))
			{
				ids.add(queryId);
			}
		} else
		{
			ids = new Vector<String>(1);
			ids.add(queryId);
			map.put(path, ids);
		}
	}

	private E loadObjectFromHit(SearchHit hit, String indexName)
	{
		if (hit.getSource() != null)
		{
			return loadResourceFromString(hit.getId(), hit.getSourceAsString(), indexName);
		}
		return null;
	}

	private E loadResourceFromString(String id, String sourceAsString, String indexName)
	{
		URI uri = URI.createURI(getLocalDBURL() + "/" + indexName + "/" + id);
		Resource resource = connectionProvider.getEmfResourceSet().getResource(uri, true);
		System.out.println(sourceAsString);
		InputStream inputStream;
		try
		{

			if (resource.getContents().isEmpty())
			{
				inputStream = new ByteArrayInputStream(sourceAsString.getBytes(BTSConstants.ENCODING));
				final JSONLoad loader = new JSONLoad(inputStream, new HashMap<Object, Object>());
				loader.fillResource(resource);
			}
			return ((E) resource.getContents().get(0));
		} catch (UnsupportedEncodingException e)
		{
			e.printStackTrace();
		}
		return find((K) id, "/" + indexName + "/");
	}

	@Override
	public boolean objectIsLoaded(String dbPath, String objectId)
	{
		URI uri = URI.createURI(getLocalDBURL() + "/" + dbPath + "/" + objectId);
		Map map = ((ResourceSetImpl) connectionProvider.getEmfResourceSet()).getURIResourceMap();
		if (map == null)
		{
			return false;
		}
		return map.containsKey(uri);

	}

	@Override
	public List<E> findByQueryId(String searchId, String path,
			String objectState)
	{
		List<String> allDocs = new ArrayList<String>(0);
		View view;
		CouchDbClient client = connectionProvider.getDBClient(CouchDbClient.class, path);
		if (objectState != null
				&& objectState.equals(BTSConstants.OBJECT_STATE_ACITVE)) {
			searchId = getActiveSearchId(searchId);
		} else if (objectState != null
				&& objectState.equals(BTSConstants.OBJECT_STATE_TERMINATED)) {
			searchId = getTerminatedSearchId(searchId);
		}
		try
		{
			view = client.view(searchId);
			allDocs = view.includeDocs(true).query();
		} catch (NoDocumentException e)
		{
			e.printStackTrace();
			createView(path, path, searchId);
			view = client.view(searchId);
			allDocs = view.includeDocs(true).query();
		}

		ArrayList<E> results = new ArrayList<E>();
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("json", new JsResourceFactoryImpl());
		connectionProvider.getEmfResourceSet().getURIConverter().getURIHandlers().add(0, new CouchDBHandler());
		for (String jo : allDocs)
		{
			System.out.println(jo);
			if (true)
			{
				URI uri = URI.createURI(getLocalDBURL() + "/" + path + "/" + extractIdFromObjectString(jo));
				Resource resource = connectionProvider.getEmfResourceSet().getResource(uri, true);
				final JSONLoad loader = new JSONLoad(new ByteArrayInputStream(jo.getBytes()),
						new HashMap<Object, Object>());
				loader.fillResource(resource);
				results.add((E) resource.getContents().get(0));
			}
		}
		if (!results.isEmpty())
		{
			registerQueryIdWithInternalRegistry(searchId, path);
		}
		return results;
	}

	protected String getTerminatedSearchId(String searchId) {
		if (DaoConstants.VIEW_ALL_BTSANNOTATIONS.equals(searchId)) {
			return DaoConstants.VIEW_ALL_TERMINATED_BTSANNOTATIONS;
		} else if (DaoConstants.VIEW_ALL_BTSCONFIGURATIONS.equals(searchId)) {
			return DaoConstants.VIEW_ALL_TERMINATED_BTSCONFIGURATIONS;
		} else if (DaoConstants.VIEW_ALL_BTSIMAGESS.equals(searchId)) {
			return DaoConstants.VIEW_ALL_TERMINATED_BTSIMAGESS;
		} else if (DaoConstants.VIEW_ALL_BTSLISTENTRIES.equals(searchId)) {
			return DaoConstants.VIEW_ALL_TERMINATED_BTSLISTENTRIES;
		} else if (DaoConstants.VIEW_ALL_BTSPROJECTS.equals(searchId)) {
			return DaoConstants.VIEW_ALL_TERMINATED_BTSPROJECTS;
		} else if (DaoConstants.VIEW_ALL_BTSTCOBJECTS.equals(searchId)) {
			return DaoConstants.VIEW_ALL_TERMINATED_BTSTCOBJECTS;
		} else if (DaoConstants.VIEW_ALL_BTSTEXTCORPUS.equals(searchId)) {
			return DaoConstants.VIEW_ALL_TERMINATED_BTSTEXTCORPUS;
		} else if (DaoConstants.VIEW_ALL_BTSTEXTS.equals(searchId)) {
			return DaoConstants.VIEW_ALL_TERMINATED_BTSTEXTS;
		} else if (DaoConstants.VIEW_ALL_BTSTHSENTRIES.equals(searchId)) {
			return DaoConstants.VIEW_ALL_TERMINATED_BTSTHSENTRIES;
		} else if (DaoConstants.VIEW_ALL_BTSUSERGROUPS.equals(searchId)) {
			return DaoConstants.VIEW_ALL_TERMINATED_BTSUSERGROUPS;
		} else if (DaoConstants.VIEW_ALL_BTSUSERS.equals(searchId)) {
			return DaoConstants.VIEW_ALL_TERMINATED_BTSUSERS;
		}
		return searchId;
	}

	protected String getActiveSearchId(String searchId) {
		if (DaoConstants.VIEW_ALL_BTSANNOTATIONS.equals(searchId)) {
			return DaoConstants.VIEW_ALL_ACTIVE_BTSANNOTATIONS;
		} else if (DaoConstants.VIEW_ALL_BTSCONFIGURATIONS.equals(searchId)) {
			return DaoConstants.VIEW_ALL_ACTIVE_BTSCONFIGURATIONS;
		} else if (DaoConstants.VIEW_ALL_BTSIMAGESS.equals(searchId)) {
			return DaoConstants.VIEW_ALL_ACTIVE_BTSIMAGESS;
		} else if (DaoConstants.VIEW_ALL_BTSLISTENTRIES.equals(searchId)) {
			return DaoConstants.VIEW_ALL_ACTIVE_BTSLISTENTRIES;
		} else if (DaoConstants.VIEW_ALL_BTSPROJECTS.equals(searchId)) {
			return DaoConstants.VIEW_ALL_ACTIVE_BTSPROJECTS;
		} else if (DaoConstants.VIEW_ALL_BTSTCOBJECTS.equals(searchId)) {
			return DaoConstants.VIEW_ALL_ACTIVE_BTSTCOBJECTS;
		} else if (DaoConstants.VIEW_ALL_BTSTEXTCORPUS.equals(searchId)) {
			return DaoConstants.VIEW_ALL_ACTIVE_BTSTEXTCORPUS;
		} else if (DaoConstants.VIEW_ALL_BTSTEXTS.equals(searchId)) {
			return DaoConstants.VIEW_ALL_ACTIVE_BTSTEXTS;
		} else if (DaoConstants.VIEW_ALL_BTSTHSENTRIES.equals(searchId)) {
			return DaoConstants.VIEW_ALL_ACTIVE_BTSTHSENTRIES;
		} else if (DaoConstants.VIEW_ALL_BTSUSERGROUPS.equals(searchId)) {
			return DaoConstants.VIEW_ALL_ACTIVE_BTSUSERGROUPS;
		} else if (DaoConstants.VIEW_ALL_BTSUSERS.equals(searchId)) {
			return DaoConstants.VIEW_ALL_ACTIVE_BTSUSERS;
		}
		return searchId;
	}

	protected String getLocalDBURL()
	{
		return connectionProvider.getLocalDBURL();
	}

	public boolean isAuthorizedUser(String userName, String passWord)
	{
		CouchDbClient client = connectionProvider.getDBClient(CouchDbClient.class, DaoConstants.ADMIN, userName,
				passWord);
		try
		{
			Object o = client.find("test");
			if (o != null)
			{
				return true;
			}
		} catch (NoDocumentException e)
		{
			return true; // authentication
		}

		return false;

	}

}