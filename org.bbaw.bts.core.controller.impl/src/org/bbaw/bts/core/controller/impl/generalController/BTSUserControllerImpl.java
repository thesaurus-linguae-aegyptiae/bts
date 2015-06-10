package org.bbaw.bts.core.controller.impl.generalController;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Vector;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.BTSProject;
import org.bbaw.bts.btsmodel.BTSUser;
import org.bbaw.bts.btsmodel.BTSUserGroup;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.controller.generalController.BTSUserController;
import org.bbaw.bts.core.services.BTSProjectService;
import org.bbaw.bts.core.services.BTSUserGroupService;
import org.bbaw.bts.core.services.BTSUserService;
import org.bbaw.bts.db.DBManager;
import org.bbaw.bts.searchModel.BTSQueryRequest;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.UISynchronize;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.workbench.IWorkbench;

public class BTSUserControllerImpl implements BTSUserController {

	@Inject
	private BTSUserService userService;

	private IEclipseContext workbenchContext;

	@Inject
	private BTSUserGroupService userGroupService;

	@Inject
	private BTSProjectService projectService;
	
	@Inject
	@Optional
	private IWorkbench workbench;
	
	@Inject
	private DBManager dbManager;
	
	@Inject
	private UISynchronize sync;
	
	@Inject
	private IEclipseContext context;


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
		return userService.getDisplayName(userId, null);
		
	}

	@Override
	public boolean setAuthenticatedUser(BTSUser validUser) {
		workbenchContext.modify(BTSCoreConstants.AUTHENTICATED_USER, validUser);
		List<BTSUserGroup> groups = new Vector<BTSUserGroup>(4);

		if (validUser != null) {
			for (String id : validUser.getGroupIds()) {
				BTSUserGroup g = null;
				try {
					g = userGroupService.find(id, null);
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
	public List<BTSUser> query(BTSQueryRequest query, IProgressMonitor monitor) {
		return userService.query(query, BTSConstants.OBJECT_STATE_ACTIVE, monitor);
	}

	@Override
	public BTSUser findUser(String id, IProgressMonitor monitor) {
		return userService.find(id, monitor);
	}

	@Override
	public BTSUserGroup findUserGroup(String id, IProgressMonitor monitor) {
		return userGroupService.find(id, monitor);
	}

	@Override
	public BTSObject findUserOrUserGroup(String id, IProgressMonitor monitor) {
		BTSObject o = userService.find(id, monitor);
		if (o == null) {
			o = userGroupService.find(id, monitor);
		}
		return o;
	}

	@Override
	public void setRememberedUser(BTSUser user) {
		userService.setRememberedUser(user);

	}

	@Override
	public List<BTSUser> listAll(IProgressMonitor monitor) {
		return userService.list(BTSConstants.OBJECT_STATE_ACTIVE, monitor);
	}
	
	@Override
	public List<BTSUser> listAll(String userName, String passWord) {
		return userService.listAll(BTSConstants.OBJECT_STATE_ACTIVE, userName, passWord);
	}

	@Override
	public boolean removeUserUserGroup(BTSObject object,
			List<BTSProject> projects) {
		object.setState(BTSConstants.OBJECT_STATE_TERMINATED);
		if (object instanceof BTSUser)
		{
			userService.save((BTSUser) object);
			userService.removeDatabaseUser((BTSUser) object);
		}
		else if (object instanceof BTSUserGroup)
		{
			userGroupService.save((BTSUserGroup) object);
		}
		projectService.removeUserUserGroupFromAuthorization(object, projects);
		return true;
	}

	@Override
	public boolean authenticatedUserIsDBAdmin(String userName, String passWord) {
		return userService.authenticatedUserIsDBAdmin(userName, passWord);
	}

	@Override
	public boolean isValidAuthentication(String userName, String passWord) {
		return userService.isValidAuthentication(userName, passWord);
	}

	@Override
	public boolean checkAndChangeDBAdminPassword(String userName,
			String newPassword) {
		return userService.checkAndChangeDBAdminPassword(userName, newPassword);
	}

	@Override
	public void makeUserLocalDBAdmin(String userName, String passWord) throws Exception {
		userService.makeUserLocalDBAdmin(userName, passWord);
		
	}

	@Override
	public void stopDBAndRestartApplication() {
		try {
			if (dbManager.optimizationRequired())
			{
				// ask user if optimize
				dbManager.optimize();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    try {
			dbManager.shutdown();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    sync.asyncExec(new Runnable() {

			@Override
			public void run() {
				if (workbench == null)
				{
					workbench = context.get(IWorkbench.class);
				}
				 workbench.restart();
			}
		});
		
	}

}
