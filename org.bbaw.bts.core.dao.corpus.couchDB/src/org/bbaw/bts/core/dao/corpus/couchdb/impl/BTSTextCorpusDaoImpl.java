package org.bbaw.bts.core.dao.corpus.couchdb.impl;

import java.util.List;

import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.dao.corpus.BTSTextCorpusDao;
import org.bbaw.bts.core.dao.util.DaoConstants;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAnnotation;
import org.bbaw.bts.corpus.btsCorpusModel.BTSTextCorpus;
import org.bbaw.bts.dao.couchDB.CouchDBDao;

public class BTSTextCorpusDaoImpl extends CouchDBDao<BTSTextCorpus, String> implements BTSTextCorpusDao
{

	@Override
	public boolean removeBTSTextCorpus(BTSTextCorpus textCorpus, String path)
	{
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
		List<String> allDocs = loadDocsFromView(viewId, path, "corpus");
		List<BTSTextCorpus> results = loadObjectsFromStrings(allDocs, path);
		if (!results.isEmpty())
		{
			registerQueryIdWithInternalRegistry(viewId, path);
		}
		return results;
	}

	@Override
	public List<BTSTextCorpus> list(String dbPath, String staticQueryId,
			String objectState) {
		List<String> allDocs = loadDocsFromView(staticQueryId, dbPath, "corpus");
		List<BTSTextCorpus> results = loadObjectsFromStrings(allDocs, dbPath);
		if (!results.isEmpty())
		{
			registerQueryIdWithInternalRegistry(staticQueryId, dbPath);
		}
		return results;
	}

	
	
}
