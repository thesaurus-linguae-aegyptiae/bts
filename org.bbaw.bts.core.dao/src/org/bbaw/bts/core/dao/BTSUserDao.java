package org.bbaw.bts.core.dao;

import java.util.List;

import org.bbaw.bts.btsmodel.BTSUser;

public interface BTSUserDao extends GenericDao<BTSUser, String>
{

	boolean removeBTSUser(BTSUser btsUser, String path);

	List<BTSUser> list(String admin, String objectState, String userName,
			String passWord);

}
