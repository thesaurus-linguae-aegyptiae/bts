package org.bbaw.bts.core.services;

import org.bbaw.bts.btsmodel.BTSUser;

public interface BTSUserService extends GenericObjectService<BTSUser, String>
{

	BTSUser createNewUser(String userName);

	boolean setAuthentication(String userName, String passWord);

}
