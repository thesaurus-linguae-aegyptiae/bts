package org.bbaw.bts.dao.couchDB;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.bbaw.bts.btsmodel.BTSProject;
import org.bbaw.bts.core.dao.BTSProjectDao;
import org.bbaw.bts.dao.couchDB.util.CouchDBConstants;
import org.eclipse.e4.core.di.annotations.Creatable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipselabs.emfjson.couchdb.CouchDBHandler;
import org.eclipselabs.emfjson.internal.JSONLoad;
import org.eclipselabs.emfjson.resource.JsResourceFactoryImpl;
import org.lightcouch.NoDocumentException;
import org.lightcouch.View;

@Creatable
public class BTSProjectDaoImpl extends CouchDBDao<BTSProject, String> implements BTSProjectDao
{

	@Override
	public boolean removeBTSProject(BTSProject btsProject)
	{
		// TODO Auto-generated method stub
		super.remove(btsProject, CouchDBConstants.ADMIN);
		return true;
	}

	@Override
	public List<BTSProject> list(String path)
	{
		List<String> allDocs = new ArrayList<String>(0);
		View view;
		try
		{
			view = getCouchDBClient(path).view(CouchDBConstants.VIEW_ALL_BTSPROJECTS);
			allDocs = view.includeDocs(true).query();
		} catch (NoDocumentException e)
		{
			e.printStackTrace();
			createView(path, path, CouchDBConstants.VIEW_ALL_BTSPROJECTS);
			view = getCouchDBClient(path).view(CouchDBConstants.VIEW_ALL_BTSPROJECTS);
			allDocs = view.includeDocs(true).query();
		}

		ArrayList<BTSProject> results = new ArrayList<BTSProject>();
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("json", new JsResourceFactoryImpl());
		resourceSet.getURIConverter().getURIHandlers().add(0, new CouchDBHandler());
		for (String jo : allDocs)
		{
			System.out.println(jo);
			if (true)
			{
				URI uri = URI.createURI(local_db_url + CouchDBConstants.ADMIN + extractIdFromObjectString(jo));
				Resource resource = resourceSet.getResource(uri, true);
				final JSONLoad loader = new JSONLoad(new ByteArrayInputStream(jo.getBytes()),
						new HashMap<Object, Object>());
				loader.fillResource(resource);
				results.add((BTSProject) resource.getContents().get(0));
			}
		}
		return results;
	}

	@Override
	public void add(BTSProject entity, String path)
	{

		URI uri = URI.createURI(local_db_url + CouchDBConstants.ADMIN + entity.get_id());
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
	public void update(BTSProject entity, String path)
	{
		// FIXME implement Update
		URI uri = URI.createURI(local_db_url + CouchDBConstants.ADMIN + entity.get_id());
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
	public void remove(BTSProject entity, String path)
	{
		URI uri = URI.createURI(local_db_url + CouchDBConstants.ADMIN + entity.get_id());
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
	public BTSProject find(String key, String path)
	{
		URI uri = URI.createURI(local_db_url + CouchDBConstants.ADMIN + key.toString());
		Resource resource = resourceSet.getResource(uri, true);
		if (resource.getContents().size() > 0)
		{
			Object o = resource.getContents().get(0);
			if (o instanceof BTSProject)
			{
				return (BTSProject) o;
			}
		}
		return null;
	}
}
