package org.bbaw.bts.core.remote.dao;

import org.bbaw.bts.btsmodel.BTSUser;

public interface RemoteBTSUserDao extends RemoteGenericDao<BTSUser, String>
{

	boolean removeBTSUser(BTSUser btsUser, String path);

}
