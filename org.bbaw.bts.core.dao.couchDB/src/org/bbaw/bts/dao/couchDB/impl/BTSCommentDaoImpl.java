package org.bbaw.bts.dao.couchDB.impl;

import org.bbaw.bts.btsmodel.BTSComment;
import org.bbaw.bts.core.dao.BTSCommentDao;

public class BTSCommentDaoImpl extends CouchDBDao<BTSComment, String> implements BTSCommentDao
{

	@Override
	public boolean removeBTSComment(BTSComment comment, String path)
	{
		super.remove(comment, path);
		return true;
	}

}
