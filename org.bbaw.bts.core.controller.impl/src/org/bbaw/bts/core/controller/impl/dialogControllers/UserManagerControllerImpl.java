package org.bbaw.bts.core.controller.impl.dialogControllers;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.BTSProject;
import org.bbaw.bts.btsmodel.BTSUser;
import org.bbaw.bts.btsmodel.BTSUserGroup;
import org.bbaw.bts.btsviewmodel.TreeNodeWrapper;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.commons.comparator.BTSObjectByNameComparator;
import org.bbaw.bts.core.commons.filter.BTSFilter;
import org.bbaw.bts.core.controller.dialogControllers.UserManagerController;
import org.bbaw.bts.core.dao.util.BTSQueryRequest;
import org.bbaw.bts.core.services.BTSUserGroupService;
import org.bbaw.bts.core.services.BTSUserService;
import org.bbaw.bts.core.services.GeneralBTSObjectService;
import org.bbaw.bts.searchModel.BTSQueryResultAbstract;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.jface.viewers.ContentViewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.elasticsearch.index.query.QueryBuilders;

public class UserManagerControllerImpl implements UserManagerController
{

	private static final Comparator<BTSObject> sorter = new BTSObjectByNameComparator();

	@Inject
	private BTSUserGroupService usergroupService;

	@Inject
	private BTSUserService userService;

	@Inject
	private GeneralBTSObjectService objectService;

	@Override
	public List<BTSUserGroup> listUserGroups(IProgressMonitor monitor)
	{
		return usergroupService.list(BTSConstants.OBJECT_STATE_ACTIVE, monitor);
	}

	@Override
	public List<BTSUser> findGroupMembers(BTSUserGroup group, Map<String, BTSQueryResultAbstract> queryResultMap,
			ContentViewer viewer, TreeNodeWrapper parentHolder, EReference referenceName, IProgressMonitor monitor)
	{
		BTSQueryRequest query = new BTSQueryRequest();
		query.setQueryBuilder(QueryBuilders.matchQuery("groupIds", group.get_id()));
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
				BTSConstants.OBJECT_STATE_ACTIVE, monitor);
		sortEntries(children);
		return children;
	}

	private void sortEntries(List<BTSUser> list) {
		Collections.sort(list, UserManagerControllerImpl.sorter);
		
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
	public List<BTSUser> listUsers(IProgressMonitor monitor)
	{
		List<BTSUser> users = userService.list(BTSConstants.OBJECT_STATE_ACTIVE, monitor);
		sortEntries(users);
		return users;
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

	@Override
	public List<BTSObject> listTerminatedUsersUserGroups(IProgressMonitor monitor) {
		List<BTSObject> terminatedObjects = new Vector<BTSObject>();
		terminatedObjects.addAll(userService.list(BTSConstants.OBJECT_STATE_TERMINATED, monitor));
		terminatedObjects.addAll(usergroupService.list(BTSConstants.OBJECT_STATE_TERMINATED, monitor));
		return terminatedObjects;
	}

	@Override
	public List<BTSObject> getUserUserGroupOrphans(ViewerFilter[] filters, IProgressMonitor monitor) {
		List<BTSFilter> btsFilters = null;
		if (filters.length > 0)
		{
			btsFilters = new Vector<BTSFilter>(filters.length);
			for (ViewerFilter f : filters)
			{
				if (f instanceof BTSFilter)
				{
					btsFilters.add((BTSFilter) f);
				}
			}
		}
		List<BTSObject> orphans = new Vector<BTSObject>();
		List<BTSObject> userGroups = new Vector<BTSObject>();
		userGroups.addAll(usergroupService.list(BTSConstants.OBJECT_STATE_ACTIVE, monitor));
		orphans.addAll(userService.getUserOrphans(btsFilters, userGroups, monitor)); 
		return orphans;
	}

	

}
