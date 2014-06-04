package org.bbaw.bts.core.services;

import java.util.List;

import org.bbaw.bts.btsmodel.BTSUser;

public interface BTSUserService extends GenericObjectService<BTSUser, String>
{

	BTSUser createNewUser(String userName);

	boolean setAuthentication(String userName, String passWord);

	void setRememberedUser(BTSUser user);
	
	List<BTSUser> listAll(String objectState, String userName, String passWord);


}
