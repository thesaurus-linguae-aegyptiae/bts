package org.bbaw.bts.core.controller.impl.generalController;

import java.util.List;
import java.util.Vector;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.BTSUser;
import org.bbaw.bts.btsmodel.BTSUserGroup;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.controller.generalController.BTSUserController;
import org.bbaw.bts.core.services.BTSUserGroupService;
import org.bbaw.bts.core.services.BTSUserService;
import org.bbaw.bts.searchModel.BTSQueryRequest;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.MApplication;

public class BTSUserControllerImpl implements BTSUserController {

	@Inject
	private BTSUserService userService;

	private IEclipseContext workbenchContext;

	@Inject
	private BTSUserGroupService userGroupService;

	@Inject
	public BTSUserControllerImpl(IEclipseContext ctx) {
		workbenchContext = ctx;
		MApplication application = ctx.get(MApplication.class);
		if (application != null && application.getContext() != null) {
			workbenchContext = application.getContext();
		}
		workbenchContext.declareModifiable(BTSCoreConstants.AUTHENTICATED_USER);
		workbenchContext
				.declareModifiable(BTSCoreConstants.USERGROUPS_OF_AUTHENTICATED_USER);
	}

	@Override
	public String getUserDisplayName(String userId) {
		BTSUser user = userService.find(userId);
		if (user != null) {
			return user.getName();
		}
		return userId;
	}

	@Override
	public boolean setAuthenticatedUser(BTSUser validUser) {
		workbenchContext.modify(BTSCoreConstants.AUTHENTICATED_USER, validUser);
		List<BTSUserGroup> groups = new Vector<BTSUserGroup>(4);

		if (validUser != null) {
			for (String id : validUser.getGroupIds()) {
				BTSUserGroup g = null;
				try {
					g = userGroupService.find(id);
				} catch (Exception e) {
					e.printStackTrace();
				}
				if (g != null && !groups.contains(g)) {
					groups.add(g);
				}
			}
		}
		workbenchContext.modify(
				BTSCoreConstants.USERGROUPS_OF_AUTHENTICATED_USER, groups);
		return validUser != null;

	}

	@Override
	public boolean setAuthentication(String userName, String passWord) {
		return userService.setAuthentication(userName, passWord);
	}

	@Override
	public List<BTSUser> query(BTSQueryRequest query) {
		return userService.query(query, BTSConstants.OBJECT_STATE_ACITVE);
	}

	@Override
	public BTSUser findUser(String id) {
		return userService.find(id);
	}

	@Override
	public BTSUserGroup findUserGroup(String id) {
		return userGroupService.find(id);
	}

	@Override
	public BTSObject findUserOrUserGroup(String id) {
		BTSObject o = userService.find(id);
		if (o == null) {
			o = userGroupService.find(id);
		}
		return o;
	}

	@Override
	public void setRememberedUser(BTSUser user) {
		userService.setRememberedUser(user);

	}

	@Override
	public List<BTSUser> listAll() {
		return userService.list(BTSConstants.OBJECT_STATE_ACITVE);
	}
	
	@Override
	public List<BTSUser> listAll(String userName, String passWord) {
		return userService.listAll(BTSConstants.OBJECT_STATE_ACITVE, userName, passWord);
	}


}
