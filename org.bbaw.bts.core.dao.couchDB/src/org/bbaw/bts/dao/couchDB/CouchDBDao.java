package org.bbaw.bts.dao.couchDB;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.core.dao.GenericDao;
import org.bbaw.bts.dao.couchDB.util.CouchDBConstants;
import org.eclipse.e4.core.di.annotations.Creatable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipselabs.emfjson.couchdb.CouchDBHandler;
import org.eclipselabs.emfjson.internal.JSONLoad;
import org.eclipselabs.emfjson.resource.JsResourceFactoryImpl;
import org.lightcouch.CouchDbClient;
import org.lightcouch.CouchDbProperties;

import com.google.gson.JsonObject;

@Creatable
public class CouchDBDao<E extends BTSDBBaseObject, K extends Serializable> implements GenericDao<E, K>
{

	protected Class<? extends BTSDBBaseObject> daoType;

	protected ResourceSet resourceSet;

	protected CouchDbClient dbClient;

	@SuppressWarnings("unchecked")
	public CouchDBDao()
	{
		daoType = (Class<E>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
		resourceSet = new ResourceSetImpl();
		resourceSet.getURIConverter().getURIHandlers().add(0, new CouchDBHandler());
		initDB();
	}

	public void initDB()
	{
		CouchDbProperties properties = new CouchDbProperties().setDbName("aew").setCreateDbIfNotExist(true)
				.setProtocol("http").setHost("127.0.0.1").setPort(5985)

				.setMaxConnections(100).setConnectionTimeout(0);

		dbClient = new CouchDbClient(properties);

	}

	@Override
	public void add(E entity)
	{

		URI uri = URI.createURI(CouchDBConstants.BASEURL + CouchDBConstants.BASE_DB + entity.get_id());
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
	public void update(E entity)
	{
		// FIXME implement Update
		URI uri = URI.createURI(CouchDBConstants.BASEURL + CouchDBConstants.BASE_DB + entity.get_id());
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
	public void remove(E entity)
	{
		URI uri = URI.createURI(CouchDBConstants.BASEURL + CouchDBConstants.BASE_DB + entity.get_id());
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
	public E find(K key)
	{
		URI uri = URI.createURI(CouchDBConstants.BASEURL + CouchDBConstants.BASE_DB + key.toString());
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
	public List<E> list()
	{
		List<JsonObject> allDocs = dbClient.view(CouchDBConstants.VIEW_ALL_DOCS).includeDocs(true)
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
				URI uri = URI.createURI(CouchDBConstants.BASEURL + CouchDBConstants.BASE_DB
						+ jo.get(CouchDBConstants.ID_STRING).getAsString());
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

	public void setDbClient(CouchDbClient dbClient)
	{
		this.dbClient = dbClient;
	}

	@Override
	public E reload(K key)
	{
		URI uri = URI.createURI(CouchDBConstants.BASEURL + CouchDBConstants.BASE_DB + key.toString());
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

}