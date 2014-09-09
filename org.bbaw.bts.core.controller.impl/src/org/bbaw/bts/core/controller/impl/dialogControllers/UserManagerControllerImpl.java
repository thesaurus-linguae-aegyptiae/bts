package org.bbaw.bts.core.controller.impl.dialogControllers;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.BTSProject;
import org.bbaw.bts.btsmodel.BTSUser;
import org.bbaw.bts.btsmodel.BTSUserGroup;
import org.bbaw.bts.btsviewmodel.TreeNodeWrapper;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.controller.dialogControllers.UserManagerController;
import org.bbaw.bts.core.services.BTSUserGroupService;
import org.bbaw.bts.core.services.BTSUserService;
import org.bbaw.bts.core.services.GeneralBTSObjectService;
import org.bbaw.bts.searchModel.BTSQueryRequest;
import org.bbaw.bts.searchModel.BTSQueryResultAbstract;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.jface.viewers.ContentViewer;
import org.elasticsearch.index.query.QueryBuilders;

public class UserManagerControllerImpl implements UserManagerController
{

	@Inject
	private BTSUserGroupService usergroupService;

	@Inject
	private BTSUserService userService;

	@Inject
	private GeneralBTSObjectService objectService;

	@Override
	public List<BTSUserGroup> listUserGroups()
	{
		return usergroupService.list(BTSConstants.OBJECT_STATE_ACTIVE);
	}

	@Override
	public List<BTSUser> findGroupMembers(BTSUserGroup group, Map<String, BTSQueryResultAbstract> queryResultMap,
			ContentViewer viewer, TreeNodeWrapper parentHolder, EReference referenceName)
	{
		BTSQueryRequest query = new BTSQueryRequest();
		query.setQueryBuilder(QueryBuilders.termQuery("groupIds", group.get_id()));
		query.setQueryId("groupIds-" + group.get_id());
		System.out.println(query.getQueryId());
		if (queryResultMap != null)
		{
			BTSQueryResultAbstract qra = new BTSQueryResultAbstract();
			qra.setViewer(viewer);
			qra.setParentEObject(parentHolder);
			qra.setReferenceName(referenceName);
			qra.setQueryId(query.getQueryId());
			queryResultMap.put(query.getQueryId(), qra);
		}
		List<BTSUser> children = userService.query(query,
				BTSConstants.OBJECT_STATE_ACTIVE);
		return children;
	}

	@Override
	public BTSUser createNewUser(String userName)
	{
		return userService.createNewUser(userName);
	}

	@Override
	public BTSUserGroup createNewUserGroup()
	{
		return usergroupService.createNew();
	}

	@Override
	public boolean saveUsers(Set<BTSUser> dirtyUsers)
	{
		return userService.saveMultiple(dirtyUsers);
	}

	@Override
	public boolean saveUserGroups(Set<BTSUserGroup> dirtyUserGroups)
	{
		return usergroupService.saveMultiple(dirtyUserGroups);

	}

	@Override
	public List<BTSUser> listUsers()
	{
		return userService.list(BTSConstants.OBJECT_STATE_ACTIVE);
	}

	@Override
	public boolean saveDBBaseObject(BTSDBBaseObject dbBaseObject) {
		return objectService.save((BTSDBBaseObject) dbBaseObject);
//		if (dbBaseObject instanceof BTSObject) {
//			
//		} else if (dbBaseObject instanceof BTSUser) {
//			return userService.save((BTSUser) dbBaseObject);
//		} else if (dbBaseObject instanceof BTSUserGroup) {
//			return usergroupService.save((BTSUserGroup) dbBaseObject);
//		}
	}

	

}
