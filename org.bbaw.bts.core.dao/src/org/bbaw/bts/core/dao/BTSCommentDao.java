package org.bbaw.bts.core.dao;

import org.bbaw.bts.btsmodel.BTSComment;

public interface BTSCommentDao extends GenericDao<BTSComment, String>
{

	boolean removeBTSComment(BTSComment comment, String path);

}