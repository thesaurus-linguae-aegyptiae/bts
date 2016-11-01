package org.bbaw.bts.dao.couchDB;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
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
import org.bbaw.bts.btsmodel.BTSIDReservationObject;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.commons.exceptions.BTSDBException;
import org.bbaw.bts.core.dao.DBConnectionProvider;
import org.bbaw.bts.core.dao.GenericDao;
import org.bbaw.bts.core.dao.util.BTSQueryRequest;
import org.bbaw.bts.core.dao.util.DaoConstants;
import org.bbaw.bts.modelUtils.EmfModelHelper;
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
import org.elasticsearch.action.admin.indices.exists.indices.IndicesExistsRequest;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.search.SearchRequestBuilder;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.action.search.SearchType;
import org.elasticsearch.client.Client;
import org.elasticsearch.common.xcontent.XContentFactory;
import org.elasticsearch.index.query.FilterBuilders;
import org.elasticsearch.search.SearchHit;
import org.lightcouch.CouchDbClient;
import org.lightcouch.DesignDocument;
import org.lightcouch.NoDocumentException;
import org.lightcouch.Page;
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

	protected Pattern idPattern = Pattern.compile(DaoConstants.ID_PATTERN);
	
	protected Pattern namePattern = Pattern.compile(DaoConstants.NAME_PATTERN);

	protected Pattern visibilityPattern = Pattern.compile(DaoConstants.VISIBILITY_PATTERN);
	
	protected Pattern readersPattern = Pattern.compile(DaoConstants.READERS_PATTERN);

	protected Pattern updatersPattern = Pattern.compile(DaoConstants.UPDATERS_PATTERN);
	
	protected Pattern memberPattern = Pattern.compile(DaoConstants.MEMBER_PATTERN);

	protected Pattern revisionStatePattern = Pattern.compile(DaoConstants.REVISIONSTATE_PATTERN);

	protected Pattern eclassPattern = Pattern.compile(DaoConstants.ECLASS_PATTERN);
	
	protected Pattern typePattern = Pattern.compile(DaoConstants.TYPE_PATTERN);

	protected Pattern subtypePattern = Pattern.compile(DaoConstants.SUBTYPE_PATTERN);
	
	protected Pattern sortKeyPattern = Pattern.compile(DaoConstants.SORTKEY_PATTERN);

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
		if (resource == null)
		{
			URI uri = URI.createURI(getLocalDBURL() + "/" + path + "/" + entity.get_id());
			logger.info("Resource was null, object was newly created and is persisted for the first time: " + uri.path());
			resource = connectionProvider.getEmfResourceSet().createResource(uri);
			resource.getContents().add(entity);
			Map<URI, Resource> cache = ((ResourceSetImpl) connectionProvider.getEmfResourceSet()).getURIResourceMap();
			addEntityToCache(uri, cache, entity);
		}
		else if (resource.getURI() == null)
		{
			URI uri = URI.createURI(getLocalDBURL() + "/" + path + "/" + entity.get_id());
			resource.setURI(uri);
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
		Map<URI, Resource> cache = ((ResourceSetImpl)connectionProvider.getEmfResourceSet()).getURIResourceMap();
		E object = retrieveFromCache(uri, cache);
		if (object != null) return object;
		Resource resource = connectionProvider.getEmfResourceSet().createResource(uri);
		
		CouchDbClient client = connectionProvider.getDBClient(CouchDbClient.class, path);
		InputStream sourceStream = null;
		//logger.info(uri.path());
		try {
			sourceStream = client.find((String)key);
		} catch (NoDocumentException e) {
			logger.error(e, "Failed to loadFully object with path: " + uri.toString());
		}
		
		final JSONLoad loader = new JSONLoad(sourceStream,
				new HashMap<Object, Object>(), connectionProvider.getEmfResourceSet());
		loader.fillResource(resource);
		
		if (resource.getContents().size() > 0)
		{
			Object o = resource.getContents().get(0);
			if (o instanceof BTSDBBaseObject)
			{
				if (((BTSDBBaseObject) o).getDBCollectionKey() == null)
				{
					((BTSDBBaseObject) o).setDBCollectionKey(path);
				}
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
				new HashMap<Object, Object>(), connectionProvider.getEmfResourceSet());
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
				if (((BTSDBBaseObject) o).getDBCollectionKey() == null)
				{
					((BTSDBBaseObject) o).setDBCollectionKey(path);
				}
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
				new HashMap<Object, Object>(), connectionProvider.getEmfResourceSet());
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
		Map<URI, Resource> cache = ((ResourceSetImpl)connectionProvider.getEmfResourceSet()).getURIResourceMap();
		E object = retrieveFromCache(uri, cache);
		if (object != null) return object;
		
		Resource resource = connectionProvider.getEmfResourceSet().createResource(uri);
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
					checkForConflicts((E) o, path);
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
				// if empty return old
				if (tempResource.getContents().isEmpty()) return (E) eObject;
				
				EObject copyEObject = tempResource.getContents().get(0);
				if (copyEObject instanceof BTSDBBaseObject) {

					eObject = EmfModelHelper.mergeChanges(eObject, copyEObject);
					checkForConflicts( (E) eObject, path);
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

	@Override
	public void checkForConflicts(E object, String path) {
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

	protected String extractIdFromObjectString(String objectString)
	{
		Matcher m = idPattern.matcher(objectString);
		String s = null;
		if (m.find())
		{
			s= m.group(2);
		}
		return s;
	}
	
	protected String extractNameFromObjectString(String objectString)
	{
		Matcher m = namePattern.matcher(objectString);
		if (m.find())
		{
			return m.group(2);
		}
		return null;
	}
	
	protected String extractEClassFromObjectString(String objectString)
	{
		Matcher m = eclassPattern.matcher(objectString);
		if (m.find())
		{
			return m.group(2);
		}
		return null;
	}

	protected String extractVisibilityFromObjectString(String objectString) {
		Matcher m = visibilityPattern.matcher(objectString);
		if (m.find())
		{
			return m.group(2);
		}
		return null;
	}
	
	protected String extractTypeFromObjectString(String objectString) {
		Matcher m = typePattern.matcher(objectString);
		if (m.find())
		{
			return m.group(2);
		}
		return null;
	}
	
	protected String extractSubTypeFromObjectString(String objectString) {
		Matcher m = subtypePattern.matcher(objectString);
		if (m.find())
		{
			return m.group(2);
		}
		return null;
	}
	
	protected String extractSortKeyFromObjectString(String objectString)
	{
		Matcher m = sortKeyPattern.matcher(objectString);
		if (m.find())
		{
			return m.group(2);
		}
		return null;
	}

	protected List<String> extractReadersFromObjectString(String objectString) {
		Matcher m = readersPattern.matcher(objectString);
		if (m.find())
		{
			List<String> rs = new Vector<String>(4);
			String r = m.group(3);
			m = memberPattern.matcher(r);
			while (m.find())
			{
				String rr = m.group(2);
				rs.add(rr);
			}
			return rs;
		}
		return null;
	}
	
	protected String extractRevisionSateFromObjectString(String objectString) {
		Matcher m = revisionStatePattern.matcher(objectString);
		if (m.find())
		{
			return m.group(2);
		}
		return null;
	}
	
	protected List<String> extractUpdatersFromObjectString(String objectString) {
		Matcher m = updatersPattern.matcher(objectString);
		if (m.find())
		{
			List<String> rs = new Vector<String>(4);
			String r = m.group(3);
			m = memberPattern.matcher(r);
			while (m.find())
			{
				String rr = m.group(2);
				rs.add(rr);
			}
			return rs;
		}
		return null;
	}

	
	@Override
	public List<E> query(BTSQueryRequest query, String indexName,
			String indexType, String objectState, boolean registerQuery) {
		
		// check if index exists
		boolean hasIndex = connectionProvider.getSearchClient(Client.class).admin().indices().exists(new IndicesExistsRequest(indexName)).actionGet()
				.isExists();
		if (!hasIndex)
		{
			return new Vector<E>(0);
		}
		// check for ID Query
		if (query.isIdQuery())
		{
			List<E> result = new Vector<E>();
			E o = find((K) query.getSearchString(), indexName);
			result.add(o);
			return result;
		}
		
		// normal query
		SearchResponse response;
		SearchRequestBuilder srq;
		if (query.getSearchRequestBuilder() == null) {
			
			// connectionProvider.getSearchClient(Client.class).admin().cluster().prepareHealth().setWaitForGreenStatus().execute().actionGet();

			srq = connectionProvider.getSearchClient(Client.class)
					.prepareSearch(indexName)
					// .setTypes(indexType)
					.setSearchType(SearchType.QUERY_AND_FETCH)
					.setQuery(query.getQueryBuilder());
			// Query

			// filter object state active or terminated
			if (BTSConstants.OBJECT_STATE_ACTIVE.equals(objectState)) {
				 srq.setPostFilter(
				 FilterBuilders.termFilter("state",
				 BTSConstants.OBJECT_STATE_ACTIVE));
			} else if (BTSConstants.OBJECT_STATE_TERMINATED.equals(objectState)) {
				srq.setPostFilter(FilterBuilders.termFilter("state",
						BTSConstants.OBJECT_STATE_TERMINATED));
			} else {
				// nothing
			}

			
			
//			//execute query
//			response = srq.setFrom(0).setSize(1000).setExplain(true).execute()
//					.actionGet();
//
//			List<E> result = loadResultFromSearchResponse(response, indexName);
//			if (registerQuery) {
//				registerQueryWithPercolator(query, indexName, indexType);
//			}
//			return result;
		} else {
			
			srq = query.getSearchRequestBuilder()
					.setIndices(indexName)
//					.setTypes(indexType)
					.setSearchType(SearchType.QUERY_AND_FETCH);
			
		}
		
		// responsefields
		if (query.getResponseFields() != null
				&& query.getResponseFields().length > 0) {
			srq = srq.addFields(query.getResponseFields());
		}
		else
		{
			srq = srq.addFields("eClass");
			srq.setFetchSource(true);
		}
					
		//execute query
		response = srq.setFrom(0)
				.setSize(1000)
				.setExplain(true)
				.execute()
				.actionGet();
		List<E> result = loadResultFromSearchResponse(response, indexName);
		
		if (registerQuery) {
			try {
				registerQueryWithPercolator(query, indexName, indexType);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return result;
	}

	private List<E> loadResultFromSearchResponse(SearchResponse response, String indexName) {
		List<E> result = new Vector<E>();
		Map<URI, Resource> cache = ((ResourceSetImpl)connectionProvider.getEmfResourceSet()).getURIResourceMap();
		for (SearchHit hit : response.getHits()) {
			try {
				E o = null;
				URI uri = URI.createURI(getLocalDBURL() + "/" + indexName + "/" + hit.getId());
				o = retrieveFromCache(uri, cache);
				if (o != null)
				{
					checkAndLoadFullyFromHit(o, hit, uri, indexName);
				}
				else
				{
					o = loadObjectFromHit(hit, uri, indexName);
					if (o != null)
					{
						addEntityToCache(uri, cache, o);
					}
				}
				if (o == null)
				{
					o = find(uri);
					if (o != null)
					{
						addEntityToCache(uri, cache, o);
					}
				}
				
				//FIXME lazy check for conflicts
//				if (o instanceof BTSDBBaseObject) {
//					checkForConflicts((BTSDBBaseObject) o, indexName);
//				}
				result.add((E) o);
			} catch (Exception e) {
				logger.warn("Query exception "+e.getMessage(), e);
			}
		}
		if (!result.isEmpty())
			logger.info("Query indexName "+ indexName + " result size: " + result.size());
		return result;
	}

	private void checkAndLoadFullyFromHit(E o, SearchHit hit, URI uri,
			String indexName) {
		// object not fully loaded and and object in hit as source string
		if (o.get_rev() == null && hit.getSource() != null)
		{
			E e = loadObjectFromHit(hit, uri, indexName);
			o = EmfModelHelper.mergeChanges(o, e);
		}
	}

	protected E retrieveFromCache(URI uri, Map<URI, Resource> cache) {
		Resource resource = cache.get(uri);
		if (resource != null && !resource.getContents().isEmpty())
		{
			return (E) resource.getContents().get(0);
		}
		return null;
	}
	protected void addEntityToCache(URI uri, Map<URI, Resource> cache, E entity) {
		if (cache == null || uri == null || entity == null) return;
		Resource resource = entity.eResource();
		if (resource == null)
		{
			resource = connectionProvider.getEmfResourceSet().createResource(uri);
			resource.getContents().add(entity);
		}
		cache.put(uri, resource);
	}
	
	protected void registerQueryWithPercolator(final BTSQueryRequest query, final String indexName, String indexType)
	{
		// register query with percolator
		// Index the query = register it in the percolator
//		
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

	protected E loadObjectFromHit(SearchHit hit, URI uri, String indexName)
	{
		if (hit.getSource() != null)
		{
			String eclass = null;
			if (hit.getFields().containsKey("eClass"))
			{
				eclass = hit.getFields().get("eClass").getValue();
			}
			return loadObjectFromString(hit.getId(), indexName, uri, eclass, hit.getSourceAsString());
		}
		return null;
	}

	
	public E loadObjectFromString(String id, String indexName, URI uri, String eclassString, String sourceAsString)
	{
		return loadObjectFromStringNormally(id, indexName, uri, eclassString, sourceAsString);
	}
	
	@Override
	public final E loadObjectFromStringNormally(String id, String indexName, URI uri,
			String eclassString, String sourceAsString) {
		Resource resource;
//		try {
//			resource = connectionProvider.getEmfResourceSet().getResource(uri, true);
//		} catch (Exception e1) {
//			logger.info(e1);
//		} finally {
//			resource = connectionProvider.getEmfResourceSet().createResource(uri);
//		}
		resource = connectionProvider.getEmfResourceSet().createResource(uri);
		fillResource(resource, sourceAsString);
		if (!resource.getContents().isEmpty())
		{
			E e = ((E) resource.getContents().get(0));
			if (e.getDBCollectionKey() == null)
			{
				e.setDBCollectionKey(indexName);
			}
//			checkForConflicts(e, indexName);
			return e;
		}
		logger.info(sourceAsString);
		return find((K) id, indexName);
	}

	@Override
	public boolean objectIsLoaded(String path, K key)
	{
		URI uri = URI.createURI(getLocalDBURL() + "/" + path + "/" + key);
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
	protected List<String> loadDocsFromView(String viewId, String path,
			String sourcePath, String startKey, String endKey) {
		View view;

		List<String> allDocs = new Vector<String>();
		CouchDbClient dbClient = connectionProvider.getDBClient(CouchDbClient.class, path);
		try
		{
			view = dbClient.view(viewId);
			allDocs = view.includeDocs(false).startKey(startKey).endKey(endKey).query();
		} catch (NoDocumentException e)
		{
			e.printStackTrace();
			System.out.println("create view, view  id: " + viewId);
			createView(path, sourcePath, viewId);
			view = dbClient.view(viewId);
			allDocs = view.includeDocs(false).startKey(startKey).endKey(endKey).query();
		}
		return allDocs;
	}
	
	protected List<String> loadDocsFromView(String viewId, String path, String sourcePath) {
		View view;
		List<String> allDocs = new Vector<String>();
		CouchDbClient dbClient = connectionProvider.getDBClient(CouchDbClient.class, path);
		try
		{
			view = dbClient.view(viewId);
			allDocs = view.includeDocs(false).query();
		} catch (NoDocumentException e)
		{
			e.printStackTrace();
			System.out.println("create view, view id: " + viewId);
			createView(path, sourcePath, viewId);
			view = dbClient.view(viewId);
			allDocs = view.includeDocs(false).query();
		}
		return allDocs;
	}
	
	protected InputStream loadViewIntoInputStream(String viewId, String path, String sourcePath) {
		View view;
		CouchDbClient dbClient = connectionProvider.getDBClient(CouchDbClient.class, path);
		InputStream inStream = null;
		try
		{
			view = dbClient.view(viewId);

		} catch (NoDocumentException e)
		{
			e.printStackTrace();
			System.out.println("create view, view id: " + viewId);
			createView(path, sourcePath, viewId);
			view = dbClient.view(viewId);
		}
		inStream = view.includeDocs(false).queryForStream();
		return inStream;
	}
	
	
	@Override
	public List<E> listChunks(int chunkSize, String[] chunkIds,
			String path, String objectState) {
		return listChunks(chunkSize, chunkIds, path, null, objectState);
	}
	
	public List<E> listChunks(int chunkSize, String[] chunkIds,
			String path, String queryId,String objectState) {
		if (chunkIds == null) {
			chunkIds = new String[3];
		}
		if (queryId == null) {
			if (objectState != null
					&& objectState.equals(BTSConstants.OBJECT_STATE_ACTIVE)) {
				queryId = BTSConstants.VIEW_ALL_ACTIVE_DOCS;
			} else if (objectState != null
					&& objectState.equals(BTSConstants.OBJECT_STATE_TERMINATED)) {
				queryId = BTSConstants.VIEW_ALL_TERMINATED_DOCS;
			} else {
				queryId = BTSConstants.VIEW_ALL_DOCS;
			}
		}
		Page<String> page = null;
		try {
			page = connectionProvider.getDBClient(CouchDbClient.class, path).view(queryId)
					.includeDocs(true).queryPage(chunkSize, chunkIds[1], String.class);
		} catch (Exception e) {
			createView(path, path, queryId);
			page = connectionProvider.getDBClient(CouchDbClient.class, path).view(queryId)
					.includeDocs(true).queryPage(chunkSize, chunkIds[1], String.class);
			e.printStackTrace();
		}
		List<String> allDocs =page.getResultList();
		chunkIds[2] = page.getNextParam();
		chunkIds[0] = page.getPreviousParam();
		ArrayList<E> results = new ArrayList<E>();
		Map<URI, Resource> cache = ((ResourceSetImpl)connectionProvider.getEmfResourceSet()).getURIResourceMap();

		for (String jo : allDocs)
		{
			String id = extractIdFromObjectString(jo);
			if (!id.startsWith("_"))
			{
				URI uri = URI.createURI(getLocalDBURL()+ "/" + path+ "/" + id);
				E o = retrieveFromCache(uri, cache);
				if (o == null)
				{
					o = loadObjectFromString(id, path, uri, extractEClassFromObjectString(jo), jo);
				}
				results.add(o);
			}
		}
		
		return (List<E>) results;
	}
	protected List<E> loadObjectsFromStrings(
			List<String> allDocs, String path) {
		List<E> results = new Vector<E>(allDocs.size());
		Map<URI, Resource> cache = ((ResourceSetImpl)connectionProvider.getEmfResourceSet()).getURIResourceMap();
		for (String jo : allDocs)
		{
				try {
					String id = extractIdFromObjectString(jo);
					URI uri = URI.createURI(getLocalDBURL() + "/" + path + "/" + id);
					E o = retrieveFromCache(uri, cache);
					if (o == null)
					{
						o = loadObjectFromString(id, path, uri, extractEClassFromObjectString(jo), jo);
					}

					if (o != null)
					{
						addEntityToCache(uri, cache, o);
						results.add(o);
					}
				} catch (Exception e) {
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
		
		try
		{
			CouchDbClient client = connectionProvider.getDBClient(CouchDbClient.class, "admin", userName,
					passWord);
			Object o = client.find("test");
			if (o != null)
			{
				return true;
			}
		} catch (NoDocumentException e)
		{
			return true; // authentication
		}
		catch (org.lightcouch.CouchDbException e) {
			
			// if authentication has changed and db connection pool is still based upon old authentication
			// purge pool
			CouchDbClient client = connectionProvider.getDBClient(CouchDbClient.class, "admin", userName,
					passWord);
			connectionProvider.purgeDBConnectionPool();
			client = connectionProvider.getDBClient(CouchDbClient.class, "admin", userName,
					passWord);
			try
			{
				Object o = client.find("test");
				if (o != null)
				{
					return true;
				}
			} catch (NoDocumentException ee)
			{
				return true; // authentication
			}
		}catch (Exception e)
		{
			return false; // no authentication
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
	
	@Override
	public E loadFully(E entity, boolean checkForConflicts) {
		
		if (entity.getDBCollectionKey() == null)
		{
			throw new BTSDBException("DBCollectionKey may not be null. Unable to fully load object!");
		}
		CouchDbClient client = connectionProvider.getDBClient(CouchDbClient.class, entity.getDBCollectionKey());
		InputStream sourceStream = null;
		try {
			sourceStream = client.find(entity.get_id());
		} catch (NoDocumentException e) {
			logger.error(e, "Failed to loadFully object with path: " + entity.getDBCollectionKey() + "/" + entity.get_id());
			return entity;
		}
		URI uri = URI.createURI(getLocalDBURL() + "/temp/"
				+ entity.get_id());
		Resource resource = connectionProvider.getEmfResourceSet().createResource(
				uri);
		final JSONLoad loader = new JSONLoad(sourceStream,
				new HashMap<Object, Object>(), connectionProvider.getEmfResourceSet());
		loader.fillResource(resource);
		E source = null;
		if (!resource.getContents().isEmpty())
		{
			source = (E) resource.getContents().get(0);
		}
		if (source != null && !(source instanceof BTSIDReservationObject)) {
			entity = EmfModelHelper.mergeChanges(entity, source);
//			if (entity.get_id().equals("IBQDJYpzXIU3KUTNqZEDsSLP8AE")) // FIXME remove anno
//			{
//				System.out.println("HI");
//			}
			if(checkForConflicts)
			{
				checkForConflicts((E) entity,entity.getDBCollectionKey());
			}
			return (E) entity;
		}
		return entity;
	}
	
	@Override
	public String findAsJsonString(K key, String path) {
		return findAsJsonString(key, path, null);
	}

	@Override
	public String findAsJsonString(K key, String path, String revision) {
		CouchDbClient client = connectionProvider.getDBClient(CouchDbClient.class, path);
		//logger.info(uri.path());
		try {
			InputStream inputStream;
			if (revision != null)
			{
				inputStream = client.find((String)key, revision);
			}
			else
			{
				inputStream = client.find((String)key);
			}
			BufferedReader in = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
			String json = "";
			String str;
			while ((str = in.readLine()) != null) {
	        	json += str;
	        }
			return json;
		} catch (NoDocumentException e) {
			logger.error(e, "Failed to load json string of object with path: " + (String)key);
		} catch (UnsupportedEncodingException e) {
			logger.error(e, "Failed to load json string of object with path: " + (String)key);
		} catch (IOException e) {
			logger.error(e, "Failed to load json string of object with path: " + (String)key);
		}
		return null;
	}
}