package org.bbaw.bts.dao.couchDB.impl;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.bbaw.bts.btsmodel.BTSTextCorpus;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.dao.BTSTextCorpusDao;
import org.bbaw.bts.core.dao.util.DaoConstants;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipselabs.emfjson.couchdb.CouchDBHandler;
import org.eclipselabs.emfjson.internal.JSONLoad;
import org.eclipselabs.emfjson.resource.JsResourceFactoryImpl;
import org.lightcouch.CouchDbClient;
import org.lightcouch.NoDocumentException;
import org.lightcouch.View;

public class BTSTextCorpusDaoImpl extends CouchDBDao<BTSTextCorpus, String> implements BTSTextCorpusDao
{

	@Override
	public boolean removeBTSTextCorpus(BTSTextCorpus textCorpus, String path)
	{
		// TODO Auto-generated method stub
		super.remove(textCorpus, path);
		return true;
	}

	@Override
	public List<BTSTextCorpus> list(String path, String objectState)
	{
		String viewId = DaoConstants.VIEW_ALL_BTSTEXTCORPUS;
		if (objectState != null
				&& objectState.equals(BTSConstants.OBJECT_STATE_ACTIVE)) {
			viewId = DaoConstants.VIEW_ALL_ACTIVE_BTSTEXTCORPUS;
		} else if (objectState != null
				&& objectState.equals(BTSConstants.OBJECT_STATE_TERMINATED)) {
			viewId = DaoConstants.VIEW_ALL_TERMINATED_BTSTEXTCORPUS;
		}
		List<String> allDocs = new ArrayList<String>();
		View view;
		CouchDbClient dbClient = connectionProvider.getDBClient(CouchDbClient.class, path);
		try
		{

			view = dbClient.view(viewId);
			allDocs = view.includeDocs(true).query();
		} catch (NoDocumentException e)
		{
			e.printStackTrace();
			createView(path, "corpus", viewId);
			view = dbClient.view(viewId);
			allDocs = view.includeDocs(true).query();
		}

		ArrayList<BTSTextCorpus> results = new ArrayList<BTSTextCorpus>();
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("json", new JsResourceFactoryImpl());
		resourceSet.getURIConverter().getURIHandlers().add(0, new CouchDBHandler());
		for (String jo : allDocs)
		{
			System.out.println(jo);
			if (true)
			{
				URI uri = URI.createURI(getLocalDBURL() + "/" + path + "/" + extractIdFromObjectString(jo));
				Resource resource = resourceSet.getResource(uri, true);
				final JSONLoad loader = new JSONLoad(new ByteArrayInputStream(jo.getBytes()),
						new HashMap<Object, Object>());
				loader.fillResource(resource);
				BTSTextCorpus tc = (BTSTextCorpus) resource.getContents().get(0);
				checkForConflicts(tc, path);
				results.add(tc);
			}
		}
		if (!results.isEmpty())
		{
			registerQueryIdWithInternalRegistry(viewId, path);
		}
		return results;
	}
}
