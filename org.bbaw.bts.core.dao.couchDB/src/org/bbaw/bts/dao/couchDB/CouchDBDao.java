package org.bbaw.bts.dao.couchDB;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSComment;
import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.dao.DBConnectionProvider;
import org.bbaw.bts.core.dao.GenericDao;
import org.bbaw.bts.core.dao.util.DaoConstants;
import org.bbaw.bts.modelUtils.EmfModelHelper;
import org.bbaw.bts.searchModel.BTSQueryRequest;
import org.bbaw.bts.tempmodel.DBRevision;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Creatable;
import org.eclipse.e4.core.services.log.Logger;
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
import org.lightcouch.Params;
import org.lightcouch.Response;
import org.lightcouch.View;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

@Creatable
public abstract class CouchDBDao<E extends BTSDBBaseObject, K extends Serializable> implements GenericDao<E, K>
{

	protected Class<? extends BTSDBBaseObject> daoType;

	@Inject
	protected DBConnectionProvider connectionProvider;

	@Inject
	private IEclipseContext context;
	
	@Inject
	protected Logger logger;

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
	public E add(E entity, String path)
	{
		Map<String, String> options = new HashMap<String, String>();
		options.put(XMLResource.OPTION_ENCODING, BTSConstants.ENCODING); // set
																			// encoding
																			// to
		// UTF-8
		Resource resource = entity.eResource();
		// check if entity has resource, that is if it was newly created or not
		if (resource == null || resource.getURI() == null)
		{
			URI uri = URI.createURI(getLocalDBURL() + "/" + path + "/" + entity.get_id());
			logger.info("Resource was null, object was newly created and is persisted for the first time: " + uri.path());
			resource = connectionProvider.getEmfResourceSet().createResource(uri);
			resource.getContents().add(entity);
		}
		while (resource.getContents().size() > 1)
		{
			resource.getContents().remove(1);
		}

		try
		{
			resource.save(options);
		} catch (IOException e)
		{
			logger.error("error trying to save: " + entity, e);
//			throw new RuntimeException("Save Resource failed", e);
		}
		
		// FIXME was sollte das?
//		if (!resource.getContents().isEmpty())
//		{
//			return (E) resource.getContents().remove(0);
//		}
		return entity;
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
	public E update(E entity, String path)
	{
		try
		{
			entity.eResource().save(null);
		} catch (IOException e)
		{
			e.printStackTrace();
			throw new RuntimeException("Save Resource failed");
		}
		return entity;
	}

	@Override
	public void remove(E entity, String path)
	{
		if (entity == null) return;
		if (entity.get_rev() == null)
		{
			E entity2 = reload((K) entity.get_id(), path);
			if (entity2 != null)
			{
				entity = entity2;
			}
		}
		if (entity.eResource() != null)
		{
			try {
				entity.eResource().delete(null);
			} catch (IOException e) {
//				e.printStackTrace();
//				throw new RuntimeException("Delete Resource failed");
				E entity2 = reload((K) entity.get_id(), path);
				if (entity2 != null)
				{
					entity = entity2;
					try {
						entity.eResource().delete(null);
					} catch (IOException e1) {
						e.printStackTrace();
						throw new RuntimeException("Delete Resource failed");
					}
				}
			}
		}
		CouchDbClient dbClient = connectionProvider.getDBClient(
				CouchDbClient.class, path);
		if (entity.get_rev() != null)
		{
			try {
				dbClient.remove(entity.get_id(), entity.get_rev());
			} catch (Exception e) {
				E entity2 = reload((K) entity.get_id(), path);
				if (entity2 != null)
				{
					entity = entity2;
					dbClient.remove(entity.get_id(), entity.get_rev());
				}
			}
		}

	}
	public boolean remove(E entity, String path, String revision) {
		if (entity == null)
			return false;
		
		CouchDbClient dbClient = connectionProvider.getDBClient(
				CouchDbClient.class, path);
		Response resp = dbClient.remove(entity.get_id(), revision);

		resp = dbClient.purge(path, entity.get_id(), new String[]{revision});
		System.out.println("remove object revision: " + entity.get_id() + ", repsonse: " + resp);
		return true;
	}
	
	public void purge(E entity, String path) {
		if (entity == null)
			return;
		if (entity.get_rev() == null) {
			E entity2 = reload((K) entity.get_id(), path);
			if (entity2 != null) {
				entity = entity2;
			}
		}
		
		CouchDbClient dbClient = connectionProvider.getDBClient(
				CouchDbClient.class, path);
		String[] revs = new String[1];
		revs[0] = entity.get_rev();
		Response resp = dbClient.purge(path, entity.get_id(), revs);
		System.out.println("purged object : " + entity.get_id() + ", repsonse: " + resp);
		
//		HttpClient client = new DefaultHttpClient();
//		HttpPost post = new HttpPost(connectionProvider.getLocalDBURL() + "/"
//				+ path + "/_purge");
//
//		post.setHeader("Content-Type", "application/json");
//
//		try {
//
//			List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>(1);
//
//			String string = "{\"" + entity.get_id() + "\" : [\""
//					+ entity.get_rev() + "\"  ]}";
//			HttpEntity body = new ByteArrayEntity(string.getBytes("UTF-8"));
//			System.out.println(string);
//			// nameValuePairs.add(new BasicNameValuePair("i", "youremail"));
//			// nameValuePairs
//			// .add(new BasicNameValuePair("Passwd", "yourpassword"));
//			// nameValuePairs.add(new BasicNameValuePair("accountType",
//			// "GOOGLE"));
//			// nameValuePairs.add(new BasicNameValuePair("source",
//			// "Google-cURL-Example"));
//			// nameValuePairs.add(new BasicNameValuePair("service", "ac2dm"));
//
//			post.setEntity(body);
//			HttpResponse response = client.execute(post);
//			BufferedReader rd = new BufferedReader(new InputStreamReader(
//					response.getEntity().getContent()));
//
//			String line = "";
//			while ((line = rd.readLine()) != null) {
//				System.out.println(line);
//				if (line.startsWith("Auth=")) {
//					String key = line.substring(5);
//					// do something with the key
//				}
//
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

	}

	

	@SuppressWarnings("unchecked")
	@Override
	public E find(K key, String path)
	{
		URI uri = URI.createURI(getLocalDBURL() + "/" + path + "/" + key.toString());
		Resource resource = connectionProvider.getEmfResourceSet().getResource(uri, true);
		Map<String, String> options = new HashMap<String, String>();
		
		options.put(XMLResource.OPTION_ENCODING, BTSConstants.ENCODING);
		logger.info(uri.path());
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
				checkForConflicts((BTSDBBaseObject) o, path);
				return (E) o;
			}
		}
		return null;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public E find(K key, String path, String revision)
	{
		CouchDbClient dbClient = connectionProvider.getDBClient(
				CouchDbClient.class, path);
		InputStream stream = null;
		URI uri = null;
		if (revision == null)
		{
			uri = URI.createURI(getLocalDBURL() + "/" + path + "/" + key);
			stream = dbClient.find((String)key);
		}
		else
		{
			uri = URI.createURI(getLocalDBURL() + "/" + path + "/" + key + "?rev=" + revision);
			stream = dbClient.find((String)key, revision);
		}
		Resource tempResource = connectionProvider.getEmfResourceSet().createResource(uri);
		final JSONLoad loader = new JSONLoad(stream,
				new HashMap<Object, Object>());
		loader.fillResource(tempResource);
//		EObjectMapper objectMapper = new EObjectMapper();
//		Object o = objectMapper.from(stream, tempResource, null);
//		String content = CharStreams.toString(new InputStreamReader(stream, Charsets.UTF_8));
//		Closeables.closeQuietly(stream);
//		loadResourceFromString(key + revision, content, indexName)
//		EObject objects = loadObjectFromHit(hit, indexName)sFromInputStream(connectionProvider.getEmfResourceSet(), content);
		if (!tempResource.getContents().isEmpty())
		{
			Object o =  tempResource.getContents().iterator().next();
			if (o instanceof BTSDBBaseObject)
			{
				return (E)o;
			}
		}
		return null;
		
	}
	
	
	public void fillResource(Resource resource, String objectAsString) {
//		EObjectMapper objectMapper = getEObjectMapper();
//		InputStream stream = new ByteArrayInputStream(objectAsString.getBytes(StandardCharsets.UTF_8));
//		Object o = objectMapper.from(stream, resource, null);
		if (!resource.getContents().isEmpty())
		{
			return;
		}
		final JSONLoad loader = new JSONLoad(new ByteArrayInputStream(objectAsString.getBytes(StandardCharsets.UTF_8)),
				new HashMap<Object, Object>());
		loader.fillResource(resource);
		
	}

//	private EObjectMapper getEObjectMapper() {
//		EObjectMapper mapper = context.get(EObjectMapper.class);
//		if (mapper == null)
//		{
//			mapper = new EObjectMapper();
//			context.set(EObjectMapper.class, mapper);
//		}
//		return mapper;
//	}

	@SuppressWarnings("unchecked")
	@Override
	public E find(URI uri)
	{
		Resource resource = connectionProvider.getEmfResourceSet().getResource(uri, true);
		Map<String, String> options = new HashMap<String, String>();
		
		options.put(XMLResource.OPTION_ENCODING, BTSConstants.ENCODING);
		logger.info(uri.path());
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
				//FIXME check for conflicts , get path from uri
//				checkForConflicts((BTSCorpusObject) o, path);
				return (E) o;
			}
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<E> list(String path, String objectState)
	{
		String view = BTSConstants.VIEW_ALL_DOCS;
		if (objectState != null
				&& objectState.equals(BTSConstants.OBJECT_STATE_ACTIVE)) {
			view = BTSConstants.VIEW_ALL_ACTIVE_DOCS;
		} else if (objectState != null
				&& objectState.equals(BTSConstants.OBJECT_STATE_TERMINATED)) {
			view = BTSConstants.VIEW_ALL_TERMINATED_DOCS;
		}
		return list(path, view, objectState);
	}
	
	@Override
	public List<E> list(String path, String staticQueryId,
			String objectState) {
		List<String> allDocs = connectionProvider.getDBClient(CouchDbClient.class, path).view(staticQueryId)
				.includeDocs(true).query();
		ArrayList<BTSDBBaseObject> results = new ArrayList<BTSDBBaseObject>();
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("json", new JsResourceFactoryImpl());
		connectionProvider.getEmfResourceSet().getURIConverter().getURIHandlers().add(0, new CouchDBHandler());
		for (String jo : allDocs)
		{
			String id = extractIdFromObjectString(jo);
			logger.info(id);
			if (!id.startsWith("_"))
			{
				URI uri = URI.createURI(getLocalDBURL() + path + id);
				Resource resource = connectionProvider.getEmfResourceSet().getResource(uri, true);
				fillResource(resource, jo);
				E o = (E) resource.getContents().get(0);
				if (o instanceof BTSDBBaseObject)
				{
					checkForConflicts((BTSDBBaseObject) o, path);
				}
				results.add(o);
			}
		}
		if (!results.isEmpty())
		{
			registerQueryIdWithInternalRegistry(BTSConstants.VIEW_ALL_DOCS, path);
		}
		return (List<E>) results;
	}
	
	@Override
	public List<DBRevision> listAvailableRevisions(K key, String path) {
		CouchDbClient dbClient = connectionProvider.getDBClient(
				CouchDbClient.class, path);
		Params params = new Params();
		params.addParam("revs_info", "true");
		List<DBRevision> revisions = new Vector<DBRevision>();
		JsonObject jsonObject = dbClient.find(JsonObject.class, (String) key,
				params);
		for (JsonElement rev : jsonObject.getAsJsonArray("_revs_info")) {
			JsonElement rev_info = rev.getAsJsonObject().get("rev");
			String docRev = rev_info.getAsString();
			JsonElement rev_av = rev.getAsJsonObject().get("status");
			String rev_av_str = rev_av.getAsString();
			DBRevision r = new DBRevision();
			r.setRevision(docRev);
			if ("available".equals(rev_av_str))
			{
				r.setLocation(DBRevision.LOCAL);
			}
			else
			{
				r.setLocation(DBRevision.NOT_AVAILABLE);
			}
			revisions.add(r);
		}
		return revisions;
	}

	@Override
	public E reload(K key, String path)
	{
		URI uri = URI.createURI(getLocalDBURL() + "/" + path + "/" + key.toString());
//		Resource resource = connectionProvider.getEmfResourceSet().getResource(uri, true);
//		URI uri = URI.createURI(getLocalDBURL() + "/" + dbPath + "/" + objectId);
		Map map = ((ResourceSetImpl) connectionProvider.getEmfResourceSet()).getURIResourceMap();
		if (map.containsKey(uri))
		{
			Resource resource = (Resource) map.get(uri);
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
					checkForConflicts((BTSDBBaseObject) eObject, path);
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
	
	public void reloadConflicts(E entity)
	{
		entity.getConflictingRevs().clear();
		checkForConflicts(entity, entity.getDBCollectionKey());
	}

	protected void checkForConflicts(BTSDBBaseObject object, String path) {
		if (object == null) return;
		CouchDbClient dbClient = connectionProvider.getDBClient(
				CouchDbClient.class, path != null ? path : object.getDBCollectionKey());
		List<String> conflicts = dbClient.listConflictingRevs(path, object.get_id());
		object.getConflictingRevs().addAll(conflicts);
	}

	public void createView(String path, String sourcePath, String viewName)
	{
		logger.info("path " + path + " viewName " + viewName);
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
			logger.info(m.group(2));
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
			if (BTSConstants.OBJECT_STATE_ACTIVE.equals(objectState)) {
				response = connectionProvider
						.getSearchClient(Client.class)
						.prepareSearch(indexName)
						.setTypes(indexType)
						.setSearchType(SearchType.QUERY_AND_FETCH)
						.setQuery(query.getQueryBuilder())
						// Query
						.setPostFilter(
								FilterBuilders.termFilter("state",
										BTSConstants.OBJECT_STATE_ACTIVE))
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
			logger.info("Query result size: " + result.size());
			for (SearchHit hit : response.getHits())
			{
				try {
					Object o = loadObjectFromHit(hit, indexName);
					if (o instanceof BTSDBBaseObject)
					{
						checkForConflicts((BTSDBBaseObject) o,indexName);
					}
					result.add((E) o);
				} catch (Exception e) {
					logger.info("Query exception", e);
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
			logger.info("Query result size: " + result.size());
			for (SearchHit hit : response.getHits()) {
				try {
					Object o = loadObjectFromHit(hit, indexName);
					if (o instanceof BTSDBBaseObject)
					{
						checkForConflicts((BTSDBBaseObject) o, indexName);
					}
					result.add((E) o);
				} catch (Exception e) {
					logger.info("Query exception", e);
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
		fillResource(resource, sourceAsString);
		if (!resource.getContents().isEmpty())
		{
			return ((E) resource.getContents().get(0));
		}
		logger.info(sourceAsString);
//		InputStream inputStream;
//		try
//		{
//
//			if (resource.getContents().isEmpty())
//			{
//				inputStream = new ByteArrayInputStream(sourceAsString.getBytes(BTSConstants.ENCODING));
//				final JSONLoad loader = new JSONLoad(inputStream, new HashMap<Object, Object>());
//				loader.fillResource(resource);
//			}
//			return ((E) resource.getContents().get(0));
//		} catch (UnsupportedEncodingException e)
//		{
//			e.printStackTrace();
//		}
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
		View view;
		CouchDbClient client = connectionProvider.getDBClient(CouchDbClient.class, path);
		if (objectState != null
				&& objectState.equals(BTSConstants.OBJECT_STATE_ACTIVE)) {
			searchId = getActiveSearchId(searchId);
		} else if (objectState != null
				&& objectState.equals(BTSConstants.OBJECT_STATE_TERMINATED)) {
			searchId = getTerminatedSearchId(searchId);
		}
		List<String> allDocs = loadDocsFromView(searchId, path, path);
		List<E> results = loadObjectsFromStrings(allDocs, path);
//		try
//		{
//			view = client.view(searchId);
//			allDocs = view.includeDocs(true).query();
//		} catch (NoDocumentException e)
//		{
//			e.printStackTrace();
//			createView(path, path, searchId);
//			view = client.view(searchId);
//			allDocs = view.includeDocs(true).query();
//		}
//
//		ArrayList<E> results = new ArrayList<E>();
//		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("json", new JsResourceFactoryImpl());
//		connectionProvider.getEmfResourceSet().getURIConverter().getURIHandlers().add(0, new CouchDBHandler());
//		for (String jo : allDocs)
//		{
//			logger.info(jo);
//			if (true)
//			{
//				URI uri = URI.createURI(getLocalDBURL() + "/" + path + "/" + extractIdFromObjectString(jo));
//				Resource resource = connectionProvider.getEmfResourceSet().getResource(uri, true);
//				fillResource(resource, jo);
//				if (!resource.getContents().isEmpty()) {
//					E o = (E) resource.getContents().get(0);
//					if (o instanceof BTSDBBaseObject) {
//						checkForConflicts((BTSDBBaseObject) o, path);
//					}
//					results.add(o);
//				}
//			}
//		}
		if (!results.isEmpty())
		{
			registerQueryIdWithInternalRegistry(searchId, path);
		}
		return results;
	}
	
	protected List<String> loadDocsFromView(String viewId, String path, String sourcePath) {
		View view;
		List<String> allDocs = new Vector<String>();
		CouchDbClient dbClient = connectionProvider.getDBClient(CouchDbClient.class, path);
		try
		{

			view = dbClient.view(viewId);
			allDocs = view.includeDocs(true).query();
		} catch (NoDocumentException e)
		{
			e.printStackTrace();
			System.out.println("create view, view id: " + viewId);
			createView(path, sourcePath, viewId);
			view = dbClient.view(viewId);
			allDocs = view.includeDocs(true).query();
		}
		return allDocs;
	}
	
	protected List<E> loadObjectsFromStrings(
			List<String> allDocs, String path) {
		List<E> results = new Vector<E>(allDocs.size());
		for (String jo : allDocs)
		{
			System.out.println(jo);
			
				try {
					URI uri = URI.createURI(getLocalDBURL() + "/" + path + "/" + extractIdFromObjectString(jo));
					// FIXME
//				Resource resource = connectionProvider.getEmfResourceSet().createResource(uri);
					Resource resource = connectionProvider.getEmfResourceSet().getResource(uri, true);
					fillResource(resource, jo);

					if (!resource.getContents().isEmpty())
					{
						E o = (E) resource.getContents().get(0);
						checkForConflicts(o, path);
						results.add(o);
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
		
		return results;
	}




	protected String getTerminatedSearchId(String searchId) {
		if (DaoConstants.VIEW_ALL_BTSANNOTATIONS.equals(searchId)) {
			return DaoConstants.VIEW_ALL_TERMINATED_BTSANNOTATIONS;
		} else if (BTSConstants.VIEW_ALL_BTSCONFIGURATIONS.equals(searchId)) {
			return BTSConstants.VIEW_ALL_TERMINATED_BTSCONFIGURATIONS;
		} else if (DaoConstants.VIEW_ALL_BTSIMAGESS.equals(searchId)) {
			return DaoConstants.VIEW_ALL_TERMINATED_BTSIMAGESS;
		} else if (DaoConstants.VIEW_ALL_BTSLISTENTRIES.equals(searchId)) {
			return DaoConstants.VIEW_ALL_TERMINATED_BTSLISTENTRIES;
		} else if (BTSConstants.VIEW_ALL_BTSPROJECTS.equals(searchId)) {
			return BTSConstants.VIEW_ALL_TERMINATED_BTSPROJECTS;
		} else if (BTSConstants.VIEW_ALL_BTSTCOBJECTS.equals(searchId)) {
			return DaoConstants.VIEW_ALL_TERMINATED_BTSTCOBJECTS;
		} else if (DaoConstants.VIEW_ALL_BTSTEXTCORPUS.equals(searchId)) {
			return DaoConstants.VIEW_ALL_TERMINATED_BTSTEXTCORPUS;
		} else if (DaoConstants.VIEW_ALL_BTSTEXTS.equals(searchId)) {
			return DaoConstants.VIEW_ALL_TERMINATED_BTSTEXTS;
		} else if (DaoConstants.VIEW_ALL_BTSTHSENTRIES.equals(searchId)) {
			return DaoConstants.VIEW_ALL_TERMINATED_BTSTHSENTRIES;
		} else if (BTSConstants.VIEW_ALL_BTSUSERGROUPS.equals(searchId)) {
			return BTSConstants.VIEW_ALL_TERMINATED_BTSUSERGROUPS;
		} else if (BTSConstants.VIEW_ALL_BTSUSERS.equals(searchId)) {
			return BTSConstants.VIEW_ALL_TERMINATED_BTSUSERS;
		}
		return searchId;
	}

	protected String getActiveSearchId(String searchId) {
		if (DaoConstants.VIEW_ALL_BTSANNOTATIONS.equals(searchId)) {
			return DaoConstants.VIEW_ALL_ACTIVE_BTSANNOTATIONS;
		} else if (BTSConstants.VIEW_ALL_BTSCONFIGURATIONS.equals(searchId)) {
			return BTSConstants.VIEW_ALL_ACTIVE_BTSCONFIGURATIONS;
		} else if (DaoConstants.VIEW_ALL_BTSIMAGESS.equals(searchId)) {
			return DaoConstants.VIEW_ALL_ACTIVE_BTSIMAGESS;
		} else if (DaoConstants.VIEW_ALL_BTSLISTENTRIES.equals(searchId)) {
			return DaoConstants.VIEW_ALL_ACTIVE_BTSLISTENTRIES;
		} else if (BTSConstants.VIEW_ALL_BTSPROJECTS.equals(searchId)) {
			return BTSConstants.VIEW_ALL_ACTIVE_BTSPROJECTS;
		} else if (BTSConstants.VIEW_ALL_BTSTCOBJECTS.equals(searchId)) {
			return DaoConstants.VIEW_ALL_ACTIVE_BTSTCOBJECTS;
		} else if (DaoConstants.VIEW_ALL_BTSTEXTCORPUS.equals(searchId)) {
			return DaoConstants.VIEW_ALL_ACTIVE_BTSTEXTCORPUS;
		} else if (DaoConstants.VIEW_ALL_BTSTEXTS.equals(searchId)) {
			return DaoConstants.VIEW_ALL_ACTIVE_BTSTEXTS;
		} else if (DaoConstants.VIEW_ALL_BTSTHSENTRIES.equals(searchId)) {
			return DaoConstants.VIEW_ALL_ACTIVE_BTSTHSENTRIES;
		} else if (BTSConstants.VIEW_ALL_BTSUSERGROUPS.equals(searchId)) {
			return BTSConstants.VIEW_ALL_ACTIVE_BTSUSERGROUPS;
		} else if (BTSConstants.VIEW_ALL_BTSUSERS.equals(searchId)) {
			return BTSConstants.VIEW_ALL_ACTIVE_BTSUSERS;
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

	public E setDeleted(E entity, String path, boolean deleted) {
		if (entity == null)
			return entity;
		entity.set_deleted(deleted);
		Map<String, String> options = new HashMap<String, String>();
		options.put(XMLResource.OPTION_ENCODING, BTSConstants.ENCODING); // set
																			// encoding
																			// to
		// UTF-8
		Resource resource = entity.eResource();
		// check if entity has resource, that is if it was newly created or not
		if (resource == null) {
			URI uri = URI.createURI(getLocalDBURL() + "/" + path + "/"
					+ entity.get_id());
			logger.info("Resource was null, object was newly created and is persisted for the first time: "
					+ uri.path());
			resource = connectionProvider.getEmfResourceSet().createResource(
					uri);
			resource.getContents().add(entity);
		}
		while (resource.getContents().size() > 1) {
			resource.getContents().remove(1);
		}

		try {
			resource.save(options);
		} catch (IOException e) {
			logger.error("error trying to save: " + entity, e);
			// throw new RuntimeException("Save Resource failed", e);
		}
		if (!resource.getContents().isEmpty())
		{
			return (E) resource.getContents().get(0);
		}
		return entity;
	}
	

	
}