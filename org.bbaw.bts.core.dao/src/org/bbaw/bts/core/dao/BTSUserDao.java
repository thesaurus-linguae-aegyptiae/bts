package org.bbaw.bts.core.dao;

import org.bbaw.bts.btsmodel.BTSUser;

public interface BTSUserDao extends GenericDao<BTSUser, String>
{

	boolean removeBTSUser(BTSUser btsUser, String path);

}
