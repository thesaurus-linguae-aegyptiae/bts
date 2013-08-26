package org.bbaw.bts.dao.couchDB;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.bbaw.bts.btsmodel.BTSTextCorpus;
import org.bbaw.bts.core.dao.BTSTextCorpusDao;
import org.bbaw.bts.dao.couchDB.util.CouchDBConstants;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipselabs.emfjson.couchdb.CouchDBHandler;
import org.eclipselabs.emfjson.internal.JSONLoad;
import org.eclipselabs.emfjson.resource.JsResourceFactoryImpl;

import com.google.gson.JsonObject;

public class BTSTextCorpusDaoImpl extends CouchDBDao<BTSTextCorpus, String> implements BTSTextCorpusDao
{

	@Override
	public boolean removeBTSTextCorpus(BTSTextCorpus textCorpus)
	{
		// TODO Auto-generated method stub
		super.remove(textCorpus);
		return true;
	}

	@Override
	public List<BTSTextCorpus> list()
	{
		List<JsonObject> allDocs = dbClient.view(CouchDBConstants.VIEW_ALL_BTSTEXTCORPUS).includeDocs(true)
				.query(JsonObject.class);
		ArrayList<BTSTextCorpus> results = new ArrayList<BTSTextCorpus>();
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
				results.add((BTSTextCorpus) resource.getContents().get(0));
			}
		}
		return results;
	}
}
