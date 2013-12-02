package org.bbaw.bts.dao.couchDB.impl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.bbaw.bts.core.commons.exceptions.BTSDBException;
import org.bbaw.bts.core.dao.DBConnectionProvider;
import org.bbaw.bts.core.dao.util.DaoConstants;
import org.bbaw.bts.core.dao.util.ScatteredCachingMapService;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.extensions.Preference;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipselabs.emfjson.couchdb.CouchDBHandler;
import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.lightcouch.CouchDbClient;
import org.lightcouch.CouchDbProperties;

// TODO integrate user authentication, authenticated_user, reload dbclient pool
// when user change
public class DBConnectionProviderImpl implements DBConnectionProvider
{
	@Inject
	private IEclipseContext context;

	@Inject
	@Preference(value = "local_db_url", nodePath = "org.bbaw.bts.app")
	private String local_db_url = "http://127.0.0.1:5985";

	@Inject
	@Preference(value = "username", nodePath = "org.bbaw.bts.app")
	private String username;

	@Inject
	@Preference(value = "password", nodePath = "org.bbaw.bts.app")
	private String password;

	private Client searchClient;
	private String protocol;
	private String host;
	private int port;

	@Override
	public <T> T getDBClient(Class<T> clazz, String path)
	{
		if (clazz != CouchDbClient.class)
		{
			throw new BTSDBException("No supported DBClient type: " + clazz.getName());
		}
		if (protocol == null)
		{
			initDBHost();
		}
		Map<String, CouchDbClient> clients = (Map<String, CouchDbClient>) context.get(DaoConstants.DB_CLIENT_POOL_MAP);
		if (clients == null)
		{
			clients = new HashMap<String, CouchDbClient>(10);
		}
		CouchDbClient dbClient = clients.get(path);
		if (dbClient == null)
		{
			CouchDbProperties properties = createDBProperties(path);
			dbClient = new CouchDbClient(properties);
			clients.put(path, dbClient);
		}
		return (T) dbClient;
	}

	private CouchDbProperties createDBProperties(String path)
	{
		CouchDbProperties properties = new CouchDbProperties().setDbName(path).setCreateDbIfNotExist(true)
				.setProtocol(protocol).setHost(host).setPort(port).setMaxConnections(100).setConnectionTimeout(0);
		if (username != null && !"".equals(username))
		{
			properties.setUsername(username);
		}
		if (password != null && !"".equals(password))
		{
			properties.setPassword(password);
		}
		return properties;
	}

	private void initDBHost()
	{
		if (local_db_url != null && local_db_url.trim().length() > 0)
		{
			try
			{
				URL url = new URL(local_db_url);
				protocol = url.getProtocol();
				host = url.getHost();
				port = url.getPort();
			} catch (MalformedURLException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("CouchDBDao initDBHost " + local_db_url);

	}

	@Override
	public <T> T getSearchClient(Class<T> clazz)
	{
		if (clazz == Client.class)
		{
			if (searchClient == null)
			{
				searchClient = new TransportClient().addTransportAddress(new InetSocketTransportAddress("localhost",
						9300));
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
		// ScatterCachingMap can only be set if EPartService is available
		if (((ResourceSetImpl) set).getURIResourceMap() == null)
		{
			try
			{
				Map<URI, Resource> uriResourceMap = ContextInjectionFactory.make(ScatteredCachingMapService.class,
						context);
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
		if (username != null && !"".equals(username))
		{
			return protocol + "://" + username + ":" + password + "@" + host + ":" + port;
		}
		return local_db_url;
	}

	@Override
	public <T> T getDBClient(Class<T> clazz, String path, String userName, String password)
	{
		if (clazz != CouchDbClient.class)
		{
			throw new BTSDBException("No supported DBClient type: " + clazz.getName());
		}
		if (protocol == null)
		{
			initDBHost();
		}
		Map<String, CouchDbClient> clients = (Map<String, CouchDbClient>) context.get(DaoConstants.DB_CLIENT_POOL_MAP);
		if (clients == null)
		{
			clients = new HashMap<String, CouchDbClient>(10);
		}
		CouchDbClient dbClient = clients.get(path);
		if (dbClient == null)
		{
			CouchDbProperties properties = new CouchDbProperties().setDbName(path).setCreateDbIfNotExist(true)
					.setProtocol(protocol).setHost(host).setPort(port).setMaxConnections(100).setConnectionTimeout(0)
					.setUsername(userName).setPassword(password);
			dbClient = new CouchDbClient(properties);
			clients.put(path, dbClient);
		}
		return (T) dbClient;
	}

}
