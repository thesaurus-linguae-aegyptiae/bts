package org.bbaw.bts.core.dao.corpus.couchdb.impl;

import java.util.List;

import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.dao.corpus.BTSAnnotationDao;
import org.bbaw.bts.core.dao.util.DaoConstants;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAnnotation;
import org.bbaw.bts.dao.couchDB.CouchDBDao;

public class BTSAnnotationDaoImpl extends CouchDBDao<BTSAnnotation, String> implements BTSAnnotationDao
{

	@Override
	public List<BTSAnnotation> list(String path, String objectState)
	{
		String view = DaoConstants.VIEW_ALL_BTSANNOTATIONS;
		if (objectState != null
				&& objectState.equals(BTSConstants.OBJECT_STATE_ACTIVE)) {
			view = DaoConstants.VIEW_ALL_ACTIVE_BTSANNOTATIONS;
		} else if (objectState != null
				&& objectState.equals(BTSConstants.OBJECT_STATE_TERMINATED)) {
			view = DaoConstants.VIEW_ALL_TERMINATED_BTSANNOTATIONS;
		}
		List<String> allDocs = loadDocsFromView(view, path, "corpus");
		List<BTSAnnotation> results = loadObjectsFromStrings(allDocs, path);
		if (!results.isEmpty())
		{
			registerQueryIdWithInternalRegistry(view, path);
		}
		return results;
	}

	@Override
	public boolean removeBTSAnnotation(BTSAnnotation annotation, String path)
	{

		// FIXME add logic and cache syncronisation
		super.remove(annotation, path);
		return true;
	}

}
