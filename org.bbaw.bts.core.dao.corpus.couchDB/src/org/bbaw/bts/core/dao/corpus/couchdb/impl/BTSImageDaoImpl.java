package org.bbaw.bts.core.dao.corpus.couchdb.impl;

import java.util.List;

import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.dao.corpus.BTSImageDao;
import org.bbaw.bts.core.dao.util.DaoConstants;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAnnotation;
import org.bbaw.bts.corpus.btsCorpusModel.BTSImage;
import org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelFactory;
import org.bbaw.bts.dao.couchDB.CouchDBDao;

public class BTSImageDaoImpl extends AbstractCorpusObjectDaoImpl<BTSImage, String> implements BTSImageDao
{

	@Override
	public List<BTSImage> list(String path, String objectState)
	{
		String viewId = DaoConstants.VIEW_ALL_BTSIMAGESS;
		if (objectState != null
				&& objectState.equals(BTSConstants.OBJECT_STATE_ACTIVE)) {
			viewId = DaoConstants.VIEW_ALL_ACTIVE_BTSIMAGESS;
		} else if (objectState != null
				&& objectState.equals(BTSConstants.OBJECT_STATE_TERMINATED)) {
			viewId = DaoConstants.VIEW_ALL_TERMINATED_BTSIMAGESS;
		}
		List<String> allDocs = loadDocsFromView(viewId, path, "corpus");
		List<BTSImage> results = loadObjectsFromStrings(allDocs, path);
		if (!results.isEmpty())
		{
			registerQueryIdWithInternalRegistry(viewId, path);
		}
		return results;
	}

	@Override
	public boolean removeBTSImage(BTSImage btsImage, String path)
	{
		// TODO Auto-generated method stub
		super.remove(btsImage, path);
		return false;
	}

	@Override
	public List<BTSImage> list(String dbPath, String staticQueryId,
			String objectState) {
		List<String> allDocs = loadDocsFromView(staticQueryId, dbPath, "corpus");
		List<BTSImage> results = loadObjectsFromStrings(allDocs, dbPath);
		if (!results.isEmpty())
		{
			registerQueryIdWithInternalRegistry(staticQueryId, dbPath);
		}
		return results;
	}

	@Override
	protected BTSImage createObject() {
		return BtsCorpusModelFactory.eINSTANCE.createBTSImage();
	}

}
