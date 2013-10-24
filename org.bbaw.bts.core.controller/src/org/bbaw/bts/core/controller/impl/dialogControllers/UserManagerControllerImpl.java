package org.bbaw.bts.core.controller.impl.dialogControllers;

import java.util.List;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSUserGroup;
import org.bbaw.bts.core.controller.dialogControllers.UserManagerController;
import org.bbaw.bts.core.services.BTSUserGroupService;
import org.bbaw.bts.core.services.BTSUserService;

public class UserManagerControllerImpl implements UserManagerController
{

	@Inject
	private BTSUserGroupService usergroupService;

	@Inject
	private BTSUserService userService;

	@Override
	public List<BTSUserGroup> listUserGroups()
	{
		return usergroupService.list();
	}

}
