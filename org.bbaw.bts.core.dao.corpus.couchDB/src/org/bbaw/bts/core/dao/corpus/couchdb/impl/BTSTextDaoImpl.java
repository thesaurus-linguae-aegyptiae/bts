package org.bbaw.bts.core.dao.corpus.couchdb.impl;

import java.util.List;

import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.dao.corpus.BTSTextDao;
import org.bbaw.bts.core.dao.util.DaoConstants;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAnnotation;
import org.bbaw.bts.corpus.btsCorpusModel.BTSText;
import org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelFactory;
import org.bbaw.bts.dao.couchDB.CouchDBDao;

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
		List<String> allDocs = loadDocsFromView(viewId, path, "corpus");
		List<BTSText> results = loadObjectsFromStrings(allDocs, path);
		if (!results.isEmpty())
		{
			registerQueryIdWithInternalRegistry(viewId, path);
		}
		return results;
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
}
