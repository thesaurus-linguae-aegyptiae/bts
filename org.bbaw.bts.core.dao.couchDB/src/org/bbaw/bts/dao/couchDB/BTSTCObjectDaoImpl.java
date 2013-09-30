package org.bbaw.bts.dao.couchDB;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.bbaw.bts.btsmodel.BTSTCObject;
import org.bbaw.bts.core.dao.BTSTCObjectDao;
import org.bbaw.bts.dao.couchDB.util.CouchDBConstants;
import org.eclipse.e4.core.di.annotations.Creatable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipselabs.emfjson.couchdb.CouchDBHandler;
import org.eclipselabs.emfjson.internal.JSONLoad;
import org.eclipselabs.emfjson.resource.JsResourceFactoryImpl;

import com.google.gson.JsonObject;

@Creatable
public class BTSTCObjectDaoImpl extends CouchDBDao<BTSTCObject, String> implements BTSTCObjectDao
{

	@Override
	public boolean removeBTSTCObject(BTSTCObject tcObject, String path)
	{
		// TODO Auto-generated method stub
		super.remove(tcObject, path);
		return true;
	}

	@Override
	public List<BTSTCObject> list(String path)
	{
		List<JsonObject> allDocs = getCouchDBClient(path).view(CouchDBConstants.VIEW_ALL_DOCS).includeDocs(true)
				.query(JsonObject.class);
		ArrayList<BTSTCObject> results = new ArrayList<BTSTCObject>();
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
				if (resource.getContents().get(0) instanceof BTSTCObject)
				{
					results.add((BTSTCObject) resource.getContents().get(0));
				}
			}
		}
		return results;
	}
}
