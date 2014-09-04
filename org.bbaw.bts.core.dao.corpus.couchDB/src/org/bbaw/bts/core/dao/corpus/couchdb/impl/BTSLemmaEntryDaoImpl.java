package org.bbaw.bts.core.dao.corpus.couchdb.impl;

import java.util.List;

import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.dao.corpus.BTSLemmaEntryDao;
import org.bbaw.bts.core.dao.util.DaoConstants;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAnnotation;
import org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaEntry;
import org.bbaw.bts.dao.couchDB.CouchDBDao;

public class BTSLemmaEntryDaoImpl extends CouchDBDao<BTSLemmaEntry, String> implements BTSLemmaEntryDao
{

	@Override
	public boolean removeBTSListEntry(BTSLemmaEntry listEntry, String path)
	{
		super.remove(listEntry, path);
		return true;
	}

	@Override
	public List<BTSLemmaEntry> list(String path, String objectState)
	{
		String viewId = DaoConstants.VIEW_ALL_BTSLISTENTRIES;
		if (objectState != null
				&& objectState.equals(BTSConstants.OBJECT_STATE_ACTIVE)) {
			viewId = DaoConstants.VIEW_ALL_ACTIVE_BTSLISTENTRIES;
		} else if (objectState != null
				&& objectState.equals(BTSConstants.OBJECT_STATE_TERMINATED)) {
			viewId = DaoConstants.VIEW_ALL_TERMINATED_BTSLISTENTRIES;
		}
		List<String> allDocs = loadDocsFromView(viewId, path, "lemma");
		List<BTSLemmaEntry> results = loadObjectsFromStrings(allDocs, path);
		if (!results.isEmpty())
		{
			registerQueryIdWithInternalRegistry(viewId, path);
		}
		return results;
	}

	@Override
	public List<BTSLemmaEntry> list(String dbPath, String staticQueryId,
			String objectState) {
		List<String> allDocs = loadDocsFromView(staticQueryId, dbPath, "lemma");
		List<BTSLemmaEntry> results = loadObjectsFromStrings(allDocs, dbPath);
		if (!results.isEmpty())
		{
			registerQueryIdWithInternalRegistry(staticQueryId, dbPath);
		}
		return results;
	}
}
