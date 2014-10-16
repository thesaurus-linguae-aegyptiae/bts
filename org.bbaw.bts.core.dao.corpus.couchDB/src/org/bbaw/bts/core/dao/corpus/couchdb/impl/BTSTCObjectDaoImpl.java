package org.bbaw.bts.core.dao.corpus.couchdb.impl;

import java.util.List;

import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.dao.corpus.BTSTCObjectDao;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAnnotation;
import org.bbaw.bts.corpus.btsCorpusModel.BTSTCObject;
import org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelFactory;
import org.bbaw.bts.dao.couchDB.CouchDBDao;

public class BTSTCObjectDaoImpl extends AbstractCorpusObjectDaoImpl<BTSTCObject, String> implements BTSTCObjectDao
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
		String viewId = BTSConstants.VIEW_ALL_DOCS;
		if (objectState != null
				&& objectState.equals(BTSConstants.OBJECT_STATE_ACTIVE)) {
			viewId = BTSConstants.VIEW_ALL_ACTIVE_DOCS;
		} else if (objectState != null
				&& objectState.equals(BTSConstants.OBJECT_STATE_TERMINATED)) {
			viewId = BTSConstants.VIEW_ALL_TERMINATED_DOCS;
		}
		List<String> allDocs = loadDocsFromView(viewId, path, "corpus");
		List<BTSTCObject> results = loadObjectsFromStrings(allDocs, path);
		if (!results.isEmpty())
		{
			registerQueryIdWithInternalRegistry(viewId, path);
		}
		return results;
	}

	@Override
	public List<BTSTCObject> list(String dbPath, String staticQueryId,
			String objectState) {
		List<String> allDocs = loadDocsFromView(staticQueryId, dbPath, "corpus");
		List<BTSTCObject> results = loadObjectsFromStrings(allDocs, dbPath);
		if (!results.isEmpty())
		{
			registerQueryIdWithInternalRegistry(staticQueryId, dbPath);
		}
		return results;
	}

	@Override
	protected BTSTCObject createObject() {
		return BtsCorpusModelFactory.eINSTANCE.createBTSTCObject();
	}
}
