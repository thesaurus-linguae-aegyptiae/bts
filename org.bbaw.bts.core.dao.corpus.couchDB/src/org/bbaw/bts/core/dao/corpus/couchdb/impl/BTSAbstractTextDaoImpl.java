package org.bbaw.bts.core.dao.corpus.couchdb.impl;

import java.util.List;

import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.dao.corpus.BTSAbstractTextDao;
import org.bbaw.bts.core.dao.util.DaoConstants;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAbstractText;
import org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelFactory;

public class BTSAbstractTextDaoImpl extends AbstractCorpusObjectDaoImpl<BTSAbstractText, String> implements BTSAbstractTextDao
{

	@Override
	public List<BTSAbstractText> list(String path, String objectState)
	{
		String view = DaoConstants.VIEW_ALL_BTSABSTRACTTEXTS;
		if (objectState != null
				&& objectState.equals(BTSConstants.OBJECT_STATE_ACTIVE)) {
			view = DaoConstants.VIEW_ALL_ACTIVE_BTSABSTRACTTEXTS;
		} else if (objectState != null
				&& objectState.equals(BTSConstants.OBJECT_STATE_TERMINATED)) {
			view = DaoConstants.VIEW_ALL_TERMINATED_BTSABSTRACTTEXTS;
		}
		List<String> allDocs = loadDocsFromView(view, path, "atext");
		List<BTSAbstractText> results = loadObjectsFromStrings(allDocs, path);
		if (!results.isEmpty())
		{
			registerQueryIdWithInternalRegistry(view, path);
		}
		return results;
	}

	@Override
	public boolean removeBTSAbstractText(BTSAbstractText abstractText, String path)
	{

		// FIXME add logic and cache syncronisation
		super.remove(abstractText, path);
		return true;
	}

	@Override
	public List<BTSAbstractText> list(String dbPath, String staticQueryId,
			String objectState) {
		List<String> allDocs = loadDocsFromView(staticQueryId, dbPath, "atext");
		List<BTSAbstractText> results = loadObjectsFromStrings(allDocs, dbPath);
		if (!results.isEmpty())
		{
			registerQueryIdWithInternalRegistry(staticQueryId, dbPath);
		}
		return results;
	}

	@Override
	public BTSAbstractText createObject() {
		return BtsCorpusModelFactory.eINSTANCE.createBTSAbstractText();
	}

}
