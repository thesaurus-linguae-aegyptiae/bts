package org.bbaw.bts.dao.couchDB;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.core.dao.GenericDao;
import org.bbaw.bts.dao.couchDB.util.CouchDBConstants;
import org.eclipse.e4.core.di.annotations.Creatable;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.Preference;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipselabs.emfjson.couchdb.CouchDBHandler;
import org.eclipselabs.emfjson.internal.JSONLoad;
import org.eclipselabs.emfjson.resource.JsResourceFactoryImpl;
import org.lightcouch.CouchDbClient;
import org.lightcouch.CouchDbProperties;
import org.lightcouch.DesignDocument;

import com.google.gson.JsonObject;

@Creatable
public class CouchDBDao<E extends BTSDBBaseObject, K extends Serializable> implements GenericDao<E, K>
{

	protected Class<? extends BTSDBBaseObject> daoType;

	protected ResourceSet resourceSet;

	@Inject
	@Preference(value = "local_db_url", nodePath = "org.bbaw.bts.app")
	protected String local_db_url = "http://127.0.0.1:5985";

	protected String protocol;
	protected String host;
	protected int port;

	private Pattern idPattern = Pattern.compile(CouchDBConstants.ID_PATTERN);

	private String desingDocPath = getClass().getResource(CouchDBConstants.DESIGN_DOC_PATH).toString();

	@SuppressWarnings("unchecked")
	public CouchDBDao()
	{
		daoType = (Class<E>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
		resourceSet = new ResourceSetImpl();
		resourceSet.getURIConverter().getURIHandlers().add(0, new CouchDBHandler());

		// activate Caching
		Map<URI, Resource> uriResourceMap = new HashMap<URI, Resource>();
		((ResourceSetImpl) resourceSet).setURIResourceMap(uriResourceMap);

		initDBHost();
		System.out.println("CouchDBDao constructed");

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

	public CouchDbClient getCouchDBClient(String path)
	{
		if (protocol == null)
		{
			initDBHost();
		}
		CouchDbProperties properties = new CouchDbProperties().setDbName(path).setCreateDbIfNotExist(true)
				.setProtocol(protocol).setHost(host).setPort(port).setMaxConnections(100).setConnectionTimeout(0);
		return new CouchDbClient(properties);

	}

	@Override
	public void add(E entity, String path)
	{

		URI uri = URI.createURI(local_db_url + "/" + path + "/" + entity.get_id());
		System.out.println(uri);
		Resource resource = resourceSet.createResource(uri);
		resource.getContents().add(entity);

		try
		{
			resource.save(null);
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("Save Resource failed");
		}
	}

	@Override
	public void update(E entity, String path)
	{
		// FIXME implement Update
		URI uri = URI.createURI(local_db_url + path + entity.get_id());
		Resource resource = resourceSet.createResource(uri);
		resource.getContents().add(entity);

		try
		{
			resource.save(null);
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("Save Resource failed");
		}
	}

	@Override
	public void remove(E entity, String path)
	{
		URI uri = URI.createURI(local_db_url + path + entity.get_id());
		Resource resource = resourceSet.createResource(uri);
		resource.getContents().add(entity);

		try
		{
			resource.delete(null);
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("Delete Resource failed");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public E find(K key, String path)
	{
		URI uri = URI.createURI(local_db_url + path + key.toString());
		Resource resource = resourceSet.getResource(uri, true);
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
	public List<E> list(String path)
	{
		List<JsonObject> allDocs = getCouchDBClient(path).view(CouchDBConstants.VIEW_ALL_DOCS).includeDocs(true)
				.query(JsonObject.class);
		ArrayList<BTSDBBaseObject> results = new ArrayList<BTSDBBaseObject>();
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("json", new JsResourceFactoryImpl());
		resourceSet.getURIConverter().getURIHandlers().add(0, new CouchDBHandler());
		for (JsonObject jo : allDocs)
		{
			System.out.println(jo.get(CouchDBConstants.ID_STRING).getAsString());
			if (!jo.get(CouchDBConstants.ID_STRING).getAsString().startsWith("_"))
			{
				URI uri = URI.createURI(local_db_url + path + jo.get(CouchDBConstants.ID_STRING).getAsString());
				Resource resource = resourceSet.getResource(uri, true);
				final JSONLoad loader = new JSONLoad(new ByteArrayInputStream(jo.toString().getBytes()),
						new HashMap<Object, Object>());
				loader.fillResource(resource);
				results.add((BTSDBBaseObject) resource.getContents().get(0));
			}
		}
		return (List<E>) results;
	}

	public void setResourceSet(ResourceSet resourceSet)
	{
		this.resourceSet = resourceSet;
	}

	@Override
	public E reload(K key, String path)
	{
		URI uri = URI.createURI(local_db_url + path + key.toString());
		Resource resource = resourceSet.getResource(uri, true);
		resource.unload();
		try
		{
			resource.load(null);
		} catch (IOException e)
		{
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

	public void createView(String path, String sourcePath, String viewName)
	{
		System.out.println("path " + path + " viewName " + viewName);
		CouchDbClient dbClient = getCouchDBClient(path);
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

	@Inject
	@Optional
	public void trackUserSettings(@Preference(nodePath = "org.bbaw.bts.dao", value = "local_db_url") String local_db_url)
	{
		this.local_db_url = local_db_url;
		initDBHost();

	}
}