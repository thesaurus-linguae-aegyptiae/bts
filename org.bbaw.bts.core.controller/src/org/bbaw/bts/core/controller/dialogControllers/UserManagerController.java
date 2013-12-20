package org.bbaw.bts.core.controller.dialogControllers;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.bbaw.bts.btsmodel.BTSUser;
import org.bbaw.bts.btsmodel.BTSUserGroup;
import org.bbaw.bts.btsviewmodel.TreeNodeWrapper;
import org.bbaw.bts.searchModel.BTSQueryResultAbstract;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.jface.viewers.ContentViewer;

public interface UserManagerController
{

	List<BTSUserGroup> listUserGroups();

	List<BTSUser> listUsers();

	List<BTSUser> findGroupMembers(BTSUserGroup group, Map<String, BTSQueryResultAbstract> queryResultMap,
			ContentViewer viewer, TreeNodeWrapper parentHolder, EReference referenceName);

	BTSUser createNewUser(String userName);

	BTSUserGroup createNewUserGroup();

	boolean saveUsers(Set<BTSUser> dirtyUsers);

	boolean saveUserGroups(Set<BTSUserGroup> dirtyUserGroups);

}
