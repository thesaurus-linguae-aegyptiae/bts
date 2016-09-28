package org.bbaw.bts.dao.couchDB.impl;

import static org.elasticsearch.node.NodeBuilder.nodeBuilder;

import java.lang.reflect.Type;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.DBLease;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.commons.BTSPluginIDs;
import org.bbaw.bts.core.commons.exceptions.BTSDBException;
import org.bbaw.bts.core.dao.DBConnectionProvider;
import org.bbaw.bts.core.dao.util.DaoConstants;
import org.bbaw.bts.core.dao.util.ScatteredCachingMapService;
import org.eclipse.core.runtime.preferences.ConfigurationScope;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.Preference;
import org.eclipse.e4.core.services.log.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.equinox.security.storage.ISecurePreferences;
import org.eclipse.equinox.security.storage.SecurePreferencesFactory;
import org.eclipse.equinox.security.storage.StorageException;
import org.eclipselabs.emfjson.couchdb.CouchDBHandler;
import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.ImmutableSettings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.lightcouch.CouchDbClient;
import org.lightcouch.CouchDbProperties;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

// TODO integrate user authentication, authenticated_user, reload dbclient pool
// when user change
public class DBConnectionProviderImpl implements DBConnectionProvider
{
	private static final String ELASTIC_SEARCH = "elasticsearch";

	@Inject
	private IEclipseContext context;

	
	@Inject
	@Preference(value = BTSPluginIDs.PREF_SEARCH_HTTP_ENABLED, nodePath = "org.bbaw.bts.app")
	private String search_http_enabled = BTSConstants.DEFAULT_SEARCH_HTTP_ENABLED;
	
//	@Inject
//	@Preference(value = BTSPluginIDs.PREF_LOCAL_DB_URL_PROTOCOL, nodePath = "org.bbaw.bts.app")
//	private String protocol = BTSConstants.DEFAULT_LOCAL_DB_URL_PROTOCOL;//"http";
//	@Inject
//	@Preference(value = BTSPluginIDs.PREF_LOCAL_DB_URL_HOST, nodePath = "org.bbaw.bts.app")
//	private String host = BTSConstants.DEFAULT_LOCAL_DB_URL_HOST;//"127.0.0.1";
//	@Inject
//	@Preference(value = BTSPluginIDs.PREF_LOCAL_DB_URL_PORT, nodePath = "org.bbaw.bts.app")
//	private String port = BTSConstants.DEFAULT_LOCAL_DB_URL_PORT;

	@Inject
	private Logger logger;

//	@Inject
//	@Preference(value = BTSPluginIDs.PREF_LOCAL_SEARCH_CLUSTER_NAME, nodePath = "org.bbaw.bts.app")
	private String esClustername = BTSConstants.DEFAULT_LOCAL_SEARCH_CLUSTER_NAME;

	@Override
	public <T> T getDBClient(Class<T> clazz, String path)
	{
		if (clazz != CouchDbClient.class)
		{
			throw new BTSDBException("No supported DBClient type: " + clazz.getName());
		}
		Map<String, CouchDbClient> clients = (Map<String, CouchDbClient>) context.get(DaoConstants.DB_CLIENT_POOL_MAP);
		if (clients == null)
		{
			clients = new HashMap<String, CouchDbClient>(10);
			context.set(DaoConstants.DB_CLIENT_POOL_MAP, clients);
		}
		CouchDbClient dbClient = clients.get(path);
//		if (dbClient != null)
//		{
//			ISecurePreferences secPrefs = SecurePreferencesFactory.getDefault().node("org.bbaw.bts.app");
//			ISecurePreferences auth = secPrefs.node("auth");
//			String username = null;
//			String password = null;
//			try {
//				username = auth.get("username", null);
//				password = auth.get("password", null);
//			} catch (StorageException e) {
//				logger.error(e);
//			}
//			if (username != null && password != null)
//			{
//				System.out.println(dbClient.getBaseUri());
//				System.out.println(dbClient.getDBUri());
//				if (dbClient.getDBUri().getAuthority() != null || !dbClient.getDBUri().getAuthority().contains(username +":" + password))
//				{
//					dbClient = null;
//				}
//			}
//		}
		if (dbClient == null)
		{
			CouchDbProperties properties = null;
			try {
				properties = createDBProperties(path);
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.out.println("getDBClient protocol " + properties.getProtocol() + " username " + properties.getUsername());
			try {
				dbClient = new CouchDbClient(properties);
			} catch (Exception e) {
				logger.error("getDBClient protocol: " + properties.getProtocol() 
						+ " port: " + properties.getPort() 
						+ "  host: " + properties.getHost() 
						+ "  dbname: " + properties.getDbName() 
						+ " path " + path
						+ " username " + properties.getUsername()
						+ " p not null: " + (properties.getPassword() != null));
				e.printStackTrace();
			}
			registerGSONBuilder(dbClient);
			clients.put(path, dbClient);
		}
		return (T) dbClient;
	}

	private void registerGSONBuilder(CouchDbClient dbClient) {
		GsonBuilder gsonBuilder = new GsonBuilder();

		gsonBuilder.registerTypeAdapter(EObject.class, new JsonSerializer<EObject>() {

			@Override
			public JsonElement serialize(EObject arg0, Type arg1,
					JsonSerializationContext arg2) {
				System.out.println(arg0 + ", arg1 " + arg1);
				return null;
			}
		});
				
		gsonBuilder.registerTypeAdapter(EObject.class, new JsonDeserializer<EObject>() {

			@Override
			public EObject deserialize(JsonElement arg0, Type arg1,
					JsonDeserializationContext arg2) throws JsonParseException {
				System.out.println(arg0 + ", arg1 " + arg1);

				return null;
			}
		});
		

		gsonBuilder.registerTypeAdapter(DBLease.class, new JsonSerializer<DBLease>() {

			@Override
			public JsonElement serialize(DBLease arg0, Type arg1,
					JsonSerializationContext arg2) {
				System.out.println(arg0 + ", arg1 " + arg1);
				return null;
			}
		});
				
		gsonBuilder.registerTypeAdapter(DBLease.class, new JsonDeserializer<DBLease>() {

			@Override
			public DBLease deserialize(JsonElement arg0, Type arg1,
					JsonDeserializationContext arg2) throws JsonParseException {
				System.out.println(arg0 + ", arg1 " + arg1);

				return null;
			}
		});
		
		gsonBuilder.registerTypeAdapter(Date.class, new JsonSerializer<Date>() {
		    public JsonElement serialize(Date src, Type typeOfSrc, 
		    JsonSerializationContext context) {
		        return new JsonPrimitive(src.toString());
		    }
		});
				
		gsonBuilder.registerTypeAdapter(Date.class, new JsonDeserializer<Date>() {
		    public Date deserialize(JsonElement json, Type typeOfT, 
		    JsonDeserializationContext context) throws JsonParseException {
		        return new Date(json.getAsJsonPrimitive().getAsString());
		    }
		});


//		dbClient.setGsonBuilder(gsonBuilder);
		
	}

	private CouchDbProperties createDBProperties(String path) throws MalformedURLException
	{

		String localDBUrl = getInternalLocalDBURL();
		ISecurePreferences secPrefs = SecurePreferencesFactory.getDefault().node("org.bbaw.bts.app");
		ISecurePreferences auth = secPrefs.node("auth");
		String username = null;
		String password = null;
		try {
			username = auth.get("username", null);
			password = auth.get("password", null);
		} catch (StorageException e) {
			logger.error(e);
		}
		URL url = new URL(localDBUrl + "/");

		logger.info("CouchDbProperties createDBProperties: " + localDBUrl);
		CouchDbProperties properties = new CouchDbProperties().setDbName(path).setCreateDbIfNotExist(true)
				.setProtocol(url.getProtocol()).setHost(url.getHost()).setPort(url.getPort());
		if (username != null && password != null)
		{
			properties.setUsername(username).setPassword(password);
		}
		properties.setMaxConnections(100).setConnectionTimeout(0);
		
		
	
		return properties;
	}

	private String getInternalLocalDBURL() {
		String url = (String) context.get(BTSPluginIDs.PREF_LOCAL_DB_URL);
		if (url == null)
		{
			url = ConfigurationScope.INSTANCE.getNode("org.bbaw.bts.app").get(BTSPluginIDs.PREF_LOCAL_DB_URL, null);
		}
		if (url == null)
		{
			IEclipsePreferences preferences = ConfigurationScope.INSTANCE.getNode("org.bbaw.bts.app");
			String host = preferences.get(
					BTSPluginIDs.PREF_LOCAL_DB_URL_HOST, BTSConstants.DEFAULT_LOCAL_DB_URL_HOST);
			String protocol = preferences.get(
					BTSPluginIDs.PREF_LOCAL_DB_URL_PROTOCOL, BTSConstants.DEFAULT_LOCAL_DB_URL_PROTOCOL);
			String port = preferences.get(
					BTSPluginIDs.PREF_LOCAL_DB_URL_PORT, BTSConstants.DEFAULT_LOCAL_DB_URL_PORT);
			url = protocol + "://" + host;
			if (port != null)
			{
				url += ":"+ port;
			}
		}
		ISecurePreferences secPrefs = SecurePreferencesFactory.getDefault().node("org.bbaw.bts.app");
		ISecurePreferences auth = secPrefs.node("auth");
		String username = null;
		String password = null;
		try {
			username = auth.get("username", null);
			password = auth.get("password", null);
		} catch (StorageException e) {
			logger.error(e);
		}
		if (username != null && password != null)
		{
			URL u = null;
			try {
				u = new URL(url);
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			url = u.getProtocol() + "://" + username + ":" + password + "@" + u.getHost();
			if (u.getPort() > 0)
			{
				url += ":"+ u.getPort();
			}
		}
		
		return url;
	}

	

//	private void initDBHost()
//	{
//		local_db_url = (String) context.get(BTSPluginIDs.PREF_LOCAL_DB_URL);
//		System.out.println("CouchDBDao initDBHost " + local_db_url);
//		if (local_db_url != null && local_db_url.trim().length() > 0)
//		{
//			try
//			{
//				URL url = new URL(local_db_url);
//				protocol = url.getProtocol();
//				host = url.getHost();
//				port = new Integer(url.getPort()).toString();
//				System.out.println("CouchDBDao initDBHost from url, protocol " + protocol + ", host " + host + ", port " + port);
//				String userInfo = url.getUserInfo();
//				if (userInfo != null && userInfo.contains(":"))
//				{
//					username = userInfo.split(":")[0];
//					password = userInfo.split(":")[1];
//				}
//			} catch (MalformedURLException e)
//			{
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		else
//		{
//			IEclipsePreferences preferences = ConfigurationScope.INSTANCE.getNode("org.bbaw.bts.app");
//			host = preferences.get(
//					BTSPluginIDs.PREF_LOCAL_DB_URL_HOST, BTSConstants.DEFAULT_LOCAL_DB_URL_HOST);
//			protocol = preferences.get(
//					BTSPluginIDs.PREF_LOCAL_DB_URL_PROTOCOL, BTSConstants.DEFAULT_LOCAL_DB_URL_PROTOCOL);
//			port = preferences.get(
//					BTSPluginIDs.PREF_LOCAL_DB_URL_PORT, BTSConstants.DEFAULT_LOCAL_DB_URL_PORT);
//			
//			System.out.println("CouchDBDao initDBHost form separate settings, protocol " + protocol + ", host " + host + ", port " + port);
//
//			ISecurePreferences secPrefs = SecurePreferencesFactory.getDefault().node("org.bbaw.bts.app");
//			ISecurePreferences auth = secPrefs.node("auth");
//			try {
//				username = auth.get("username", null);
//				password = auth.get("password", null);
//			} catch (StorageException e) {
//				logger.error(e);
//			}
//		}
//		
//
//	}

	@Override
	public <T> T getSearchClient(Class<T> clazz)
	{
		if (clazz == Client.class)
		{
			Client searchClient = context.get(Client.class);
			if (searchClient == null)
			{
				//transport client
//				Settings settings = ImmutableSettings.settingsBuilder()
////				        .put("path.home",System.getProperty("user.home")+"/elasticSearch")
//				        .put("number_of_shards",1)
//				        .put("number_of_replicas",0)
//				        .build();
//
//				searchClient = new TransportClient(settings).addTransportAddress(new InetSocketTransportAddress("localhost",
//						9300));
				
				//node client
				IEclipsePreferences preferences = ConfigurationScope.INSTANCE.getNode("org.bbaw.bts.app");
				String dbdir = preferences.get(BTSPluginIDs.PREF_DB_DIR, BTSConstants.getDBInstallationDir(null));
				ImmutableSettings.Builder elasticsearchSettings = ImmutableSettings.settingsBuilder()
//		                .put("http.enabled", ("true".equals(search_http_enabled)))
						//FIXME make dynamic
		                .put("http.enabled", true)

		                .put("cluster.name", esClustername)
		                .put("path.home", dbdir + BTSConstants.FS + esClustername)
		                .put("path.data", dbdir + BTSConstants.FS + esClustername)
		                .put("number_of_shards",1)
				        .put("number_of_replicas",0)
				        .put("index.number_of_shards",1)
				        .put("index.number_of_replicas",0)
				        .put("node.name",esClustername + "BTS1")
				        .put("index.routing.allocation.disable_allocation", "false")
				        .put("cluster.routing.allocation.enable", "all")
				        .put("mappings._default_.date_detection", "0");

				boolean useTransportClient = preferences.getBoolean(BTSPluginIDs.PREF_SEARCH_CLIENT_SOCKETTRANSPORT, false);
				
				if (useTransportClient)
				{
					searchClient = new TransportClient()
                        .addTransportAddress(new InetSocketTransportAddress(
                        		preferences.get(BTSPluginIDs.PREF_SEARCH_CLIENT_SOCKETTRANSPORT_HOST, "localhost"),
                        		preferences.getInt(BTSPluginIDs.PREF_SEARCH_CLIENT_SOCKETTRANSPORT_PORT, 9300)))
                        .addTransportAddress(new InetSocketTransportAddress(
                        		preferences.get(BTSPluginIDs.PREF_SEARCH_CLIENT_SOCKETTRANSPORT_HOST2, "localhost"),
                        		preferences.getInt(BTSPluginIDs.PREF_SEARCH_CLIENT_SOCKETTRANSPORT_PORT2, 9301)));
				
				}
				else
				{
					searchClient = nodeBuilder()
		                .local(true)
		                .settings(elasticsearchSettings.build())
		                .clusterName(esClustername)
		                .node().client();
				}
				context.set(Client.class, searchClient);
			}
			return (T) searchClient;

		}
		return null;
	}

	@Override
	public ResourceSet getEmfResourceSet()
	{
		ResourceSet set = (ResourceSet) context.get(DaoConstants.RESOURCE_SET);
		if (set == null)
		{
			set = new ResourceSetImpl();
			set.getURIConverter().getURIHandlers().add(0, new CouchDBHandler());
		}
		if (((ResourceSetImpl) set).getURIResourceMap() == null)
		{
			try
			{
				Map<URI, Resource> uriResourceMap;
				context.set(ResourceSet.class, set);
//				uriResourceMap = ContextInjectionFactory.make(ScatteredCachingMapService.class,
//						context);
				uriResourceMap = new HashMap<URI, Resource>();
				((ResourceSetImpl) set).setURIResourceMap(uriResourceMap);
				context.set(DaoConstants.RESOURCE_SET, set);
			} catch (Exception e)
			{
				e.printStackTrace();
			}
		}
		return set;
	}

	@Override
	public String getLocalDBURL()
	{
		//FIXME dyn.
//		if (username != null && !"".equals(username))
//		{
//			if (protocol == null || host == null || port == null || password == null)
//			{
//				initDBHost();
//			}
//			return protocol + "://" + username + ":" + password + "@" + host + ":" + port;
//		}
//		if (local_db_url == null)
//		{
//			if (protocol == null || host == null || port == null)
//			{
//				initDBHost();
//			}
//			return protocol + "://" + host + ":" + port;
//		}
//		return local_db_url;
		
		return getInternalLocalDBURL();
	}

	@Override
	public <T> T getDBClient(Class<T> clazz, String path, String username, String password)
	{
		if (clazz != CouchDbClient.class)
		{
			throw new BTSDBException("No supported DBClient type: " + clazz.getName());
		}
		
		Map<String, CouchDbClient> clients = (Map<String, CouchDbClient>) context.get(DaoConstants.DB_CLIENT_POOL_MAP);
		if (clients == null)
		{
			clients = new HashMap<String, CouchDbClient>(10);
			context.set(DaoConstants.DB_CLIENT_POOL_MAP, clients);
		}
		CouchDbClient dbClient = clients.get(path);
		if (dbClient == null)
		{
			CouchDbProperties properties = null;
			try {
				properties = createDBProperties(path);
				properties.setUsername(username).setPassword(password);
				dbClient = new CouchDbClient(properties);
				registerGSONBuilder(dbClient);

				clients.put(path, dbClient);
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
			
		}
		return (T) dbClient;
	}

	@Override
	public <T> T getDBClient(Class<T> clazz, String localDBUrl,
			String path) throws MalformedURLException {
		if (clazz != CouchDbClient.class)
		{
			throw new BTSDBException("No supported DBClient type: " + clazz.getName());
		}
		Map<String, CouchDbClient> clients = (Map<String, CouchDbClient>) context.get(DaoConstants.DB_CLIENT_POOL_MAP);
		if (clients == null)
		{
			clients = new HashMap<String, CouchDbClient>(10);
			context.set(DaoConstants.DB_CLIENT_POOL_MAP, clients);
		}
		CouchDbClient dbClient = clients.get(path);
		if (dbClient == null)
		{
		URL url = new URL(localDBUrl);
		logger.info("getDBClient " + url + ", localDBURL as String " + localDBUrl);
		CouchDbProperties properties = new CouchDbProperties().setDbName(path).setCreateDbIfNotExist(true)
				.setProtocol(url.getProtocol()).setHost(url.getHost()).setPort(url.getPort()).setMaxConnections(100).setConnectionTimeout(0);
		String userInfo = url.getUserInfo();
		if (userInfo != null && userInfo.contains(":"))
		{
			String user = userInfo.split(":")[0];
			String p = userInfo.split(":")[1];
			properties.setUsername(user);
			properties.setPassword(p);
		}
		dbClient = new CouchDbClient(properties);
		registerGSONBuilder(dbClient);
		clients.put(path, dbClient);
		}

		return (T) dbClient;
	}
	
	@Inject
	@Optional
	public void trackUsernameSettings(
			@Preference(nodePath = "org.bbaw.bts.app/auth", value = "username") String username) {
		System.out.println("New username: " + username);
	}
	
	@Inject
	@Optional
	public void trackPasswordSettings(
			@Preference(nodePath = "org.bbaw.bts.app", value = "password") String password) {
		System.out.println("New protocol: " + password);
	}
	
	@Inject
	@Optional
	public void trackPortSettings(
			@Preference(nodePath = "org.bbaw.bts.app", value = BTSConstants.DEFAULT_LOCAL_DB_URL_PORT) String port) {
		System.out.println("New port: " + port);
	}
	
	@Inject
	@Optional
	public void trackHostSettings(
			@Preference(nodePath = "org.bbaw.bts.app", value = BTSConstants.DEFAULT_LOCAL_DB_URL_HOST) String host) {
		System.out.println("New host: " + host);
	}
	
	@Inject
	@Optional
	public void trackProtocolSettings(
			@Preference(nodePath = "org.bbaw.bts.app", value = BTSConstants.DEFAULT_LOCAL_DB_URL_PROTOCOL) String protocol) {
		System.out.println("New protocol: " + protocol);
	}

	@Override
	public void purgeDBConnectionPool() {
		Map<String, CouchDbClient> clients = (Map<String, CouchDbClient>) context.get(DaoConstants.DB_CLIENT_POOL_MAP);
		if (clients == null)
		{
			return;
		}
		clients.clear();
		
	}

	
}
