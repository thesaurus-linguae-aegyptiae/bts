package org.bbaw.bts.core.dao;

import org.bbaw.bts.btsmodel.BTSUserGroup;

public interface BTSUserGroupDao extends GenericDao<BTSUserGroup, String> {
	
	boolean removeBTSUserGroup(BTSUserGroup userGroup);

}
