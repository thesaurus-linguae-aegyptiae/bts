package org.bbaw.bts.core.dao.corpus.couchdb.impl;

import java.util.List;

import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.dao.corpus.BTSTCObjectDao;
import org.bbaw.bts.core.dao.util.DaoConstants;
import org.bbaw.bts.corpus.btsCorpusModel.BTSTCObject;
import org.bbaw.bts.dao.couchDB.CouchDBDao;

public class BTSTCObjectDaoImpl extends CouchDBDao<BTSTCObject, String> implements BTSTCObjectDao
{

	@Override
	public boolean removeBTSTCObject(BTSTCObject tcObject, String path)
	{
		super.remove(tcObject, path);
		return true;
	}

	@Override
	public List<BTSTCObject> list(String path, String objectState)
	{
		String viewId = DaoConstants.VIEW_ALL_DOCS;
		if (objectState != null
				&& objectState.equals(BTSConstants.OBJECT_STATE_ACTIVE)) {
			viewId = DaoConstants.VIEW_ALL_ACTIVE_DOCS;
		} else if (objectState != null
				&& objectState.equals(BTSConstants.OBJECT_STATE_TERMINATED)) {
			viewId = DaoConstants.VIEW_ALL_TERMINATED_DOCS;
		}
		List<String> allDocs = loadDocsFromView(viewId, path, "corpus");
		List<BTSTCObject> results = loadObjectsFromStrings(allDocs, path);
		if (!results.isEmpty())
		{
			registerQueryIdWithInternalRegistry(viewId, path);
		}
		return results;
	}
}
