package org.bbaw.bts.core.controller.generalController;

import java.util.List;

import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.BTSUser;
import org.bbaw.bts.btsmodel.BTSUserGroup;
import org.bbaw.bts.searchModel.BTSQueryRequest;

public interface BTSUserController {

	String getUserDisplayName(String userId);

	boolean setAuthenticatedUser(BTSUser validUser);

	boolean setAuthentication(String userName, String passWord);

	List<BTSUser> query(BTSQueryRequest query);

	BTSUser findUser(String id);

	BTSUserGroup findUserGroup(String id);

	BTSObject findUserOrUserGroup(String id);

	void setRememberedUser(BTSUser validUser);

}
