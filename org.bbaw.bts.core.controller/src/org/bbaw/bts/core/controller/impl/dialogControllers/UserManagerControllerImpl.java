package org.bbaw.bts.core.controller.impl.dialogControllers;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSUser;
import org.bbaw.bts.btsmodel.BTSUserGroup;
import org.bbaw.bts.btsviewmodel.TreeNodeWrapper;
import org.bbaw.bts.core.controller.dialogControllers.UserManagerController;
import org.bbaw.bts.core.services.BTSUserGroupService;
import org.bbaw.bts.core.services.BTSUserService;
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

	@Override
	public List<BTSUserGroup> listUserGroups()
	{
		return usergroupService.list();
	}

	@Override
	public List<BTSUser> findGroupMembers(BTSUserGroup group, Map<String, BTSQueryResultAbstract> queryResultMap,
			ContentViewer viewer, TreeNodeWrapper parentHolder, EReference referenceName)
	{
		BTSQueryRequest query = new BTSQueryRequest();
		query.setQueryBuilder(QueryBuilders.termQuery("groupsIds", group.get_id()));
		query.setQueryId("groupsIds-" + group.get_id());
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
		List<BTSUser> children = userService.query(query);
		return children;
	}

	@Override
	public BTSUser createNewUser(String userName)
	{
		return userService.createNewUser(userName);
	}

}
