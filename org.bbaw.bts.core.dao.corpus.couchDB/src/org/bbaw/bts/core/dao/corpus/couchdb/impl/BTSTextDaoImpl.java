package org.bbaw.bts.core.dao.corpus.couchdb.impl;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.dao.corpus.BTSTextDao;
import org.bbaw.bts.core.dao.util.DaoConstants;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAnnotation;
import org.bbaw.bts.corpus.btsCorpusModel.BTSText;
import org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelFactory;
import org.bbaw.bts.dao.couchDB.CouchDBDao;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipselabs.emfjson.internal.JSONLoad;
import org.lightcouch.CouchDbClient;
import org.lightcouch.NoDocumentException;
import org.lightcouch.View;

public class BTSTextDaoImpl extends AbstractCorpusObjectDaoImpl<BTSText, String> implements BTSTextDao
{

	@Override
	public boolean removeBTSText(BTSText btsText, String path)
	{
		super.remove(btsText, path);
		return true;
	}

	@Override
	public List<BTSText> list(String path, String objectState)
	{
		String viewId = DaoConstants.VIEW_ALL_BTSTEXTS;
		if (objectState != null
				&& objectState.equals(BTSConstants.OBJECT_STATE_ACTIVE)) {
			viewId = DaoConstants.VIEW_ALL_ACTIVE_BTSTEXTS;
		} else if (objectState != null
				&& objectState.equals(BTSConstants.OBJECT_STATE_TERMINATED)) {
			viewId = DaoConstants.VIEW_ALL_TERMINATED_BTSTEXTS;
		}
		List<String> allDocs = loadDocsFromView(viewId, path, "project_corpus");
		List<BTSText> results = loadObjectsFromStrings(allDocs, path);
		if (!results.isEmpty())
		{
			registerQueryIdWithInternalRegistry(viewId, path);
		}
		return results;
	}
	
	@Override
	public BTSText loadObjectFromString(String id, String indexName, URI uri,
			String eclassString, String sourceAsString) {
		// TODO Auto-generated method stub
		return loadObjectFromStringNormally(id, indexName, uri, eclassString,
				sourceAsString);
	}

	@Override
	public List<BTSText> list(String dbPath, String staticQueryId,
			String objectState) {
		List<String> allDocs = loadDocsFromView(staticQueryId, dbPath, "corpus");
		List<BTSText> results = loadObjectsFromStrings(allDocs, dbPath);
		if (!results.isEmpty())
		{
			registerQueryIdWithInternalRegistry(staticQueryId, dbPath);
		}
		return results;
	}

	@Override
	protected BTSText createObject() {
		return BtsCorpusModelFactory.eINSTANCE.createBTSText();
	}

	@Override
	public List<BTSText> listChunks(int chunkSize, String[] chunkIds,
			String path, String objectState) {
		String viewId = DaoConstants.VIEW_ALL_BTSTEXTS;
		if (objectState != null
				&& objectState.equals(BTSConstants.OBJECT_STATE_ACTIVE)) {
			viewId = DaoConstants.VIEW_ALL_ACTIVE_BTSTEXTS;
		} else if (objectState != null
				&& objectState.equals(BTSConstants.OBJECT_STATE_TERMINATED)) {
			viewId = DaoConstants.VIEW_ALL_TERMINATED_BTSTEXTS;
		}
		return super.listChunks(chunkSize, chunkIds, path, viewId, objectState);
	}

	/* (non-Javadoc)
	 * @see org.bbaw.bts.core.dao.corpus.BTSTextDao#findReturnOnlyMetadata(java.lang.String, java.lang.String)
	 */
	@Override
	public BTSText findReturnOnlyMetadata(String key, String path) {
		URI uri = URI.createURI(getLocalDBURL() + "/" + path + "/" + key.toString());
		Map<URI, Resource> cache = ((ResourceSetImpl)connectionProvider.getEmfResourceSet()).getURIResourceMap();
		BTSText object = retrieveFromCache(uri, cache);
		if (object != null) return object;
		Resource resource = connectionProvider.getEmfResourceSet().createResource(uri);
		
		View view;
		String viewId = "project_corpus/all_active_btstexts_metadata";
		List<String> allDocs = new Vector<String>(1);
		CouchDbClient dbClient = connectionProvider.getDBClient(CouchDbClient.class, path);
		try
		{
			view = dbClient.view(viewId);
			allDocs = view.includeDocs(false).key(key).query();
		} catch (NoDocumentException e)
		{
			e.printStackTrace();
			System.out.println("create view, view id: " + viewId);
			createView(path, "project_corpus", viewId);
			view = dbClient.view(viewId);
			allDocs = view.includeDocs(false).key(key).query();
		}
		if (allDocs.isEmpty()) return null;
		
		InputStream stream;
		try {
			stream = new ByteArrayInputStream(allDocs.get(0).getBytes("UTF-8"));
			final JSONLoad loader = new JSONLoad(stream,
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
					return (BTSText) o;
				}
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		return null;
	}

	
}
