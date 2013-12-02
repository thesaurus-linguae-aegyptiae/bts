package org.bbaw.bts.core.remote.dao;

import org.bbaw.bts.btsmodel.BTSUserGroup;

public interface RemoteBTSUserGroupDao extends RemoteGenericDao<BTSUserGroup, String>
{

	boolean removeBTSUserGroup(BTSUserGroup userGroup, String path);

}
