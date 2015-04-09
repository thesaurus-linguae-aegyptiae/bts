package org.bbaw.bts.core.dao.corpus.couchdb.impl;

import java.util.List;
import java.util.Vector;
import java.util.regex.Matcher;

import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.dao.corpus.BTSLemmaEntryDao;
import org.bbaw.bts.core.dao.util.DaoConstants;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAnnotation;
import org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaEntry;
import org.bbaw.bts.corpus.btsCorpusModel.BTSText;
import org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelFactory;
import org.bbaw.bts.dao.couchDB.CouchDBDao;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

public class BTSLemmaEntryDaoImpl extends AbstractCorpusObjectDaoImpl<BTSLemmaEntry, String> implements BTSLemmaEntryDao
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
		List<BTSLemmaEntry> results = loadPartialObjectsFromStrings(allDocs, path);
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
		List<BTSLemmaEntry> results = loadPartialObjectsFromStrings(allDocs, dbPath);
		if (!results.isEmpty())
		{
			registerQueryIdWithInternalRegistry(staticQueryId, dbPath);
		}
		return results;
	}

	@Override
	protected BTSLemmaEntry createObject() {
		return BtsCorpusModelFactory.eINSTANCE.createBTSLemmaEntry();
	}
	
	
	@Override
	public List<BTSLemmaEntry> listChunks(int chunkSize, String[] chunkIds,
			String path, String objectState) {
		String viewId = "lemma/all_active_docs";
		if (objectState != null
				&& objectState.equals(BTSConstants.OBJECT_STATE_ACTIVE)) {
			viewId = DaoConstants.VIEW_ALL_ACTIVE_BTSLISTENTRIES;
		} else if (objectState != null
				&& objectState.equals(BTSConstants.OBJECT_STATE_TERMINATED)) {
			viewId = DaoConstants.VIEW_ALL_TERMINATED_BTSLISTENTRIES;
		}
		return super.listChunks(chunkSize, chunkIds, path, viewId, objectState);
	}
	
}
