package org.bbaw.bts.core.services.impl.services;

import java.util.List;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSUserGroup;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.core.dao.BTSUserGroupDao;
import org.bbaw.bts.core.services.BTSUserGroupService;
import org.bbaw.bts.core.services.impl.internal.ServiceConstants;
import org.bbaw.bts.searchModel.BTSQueryRequest;

public class BTSUserGroupServiceImpl extends GenericObjectServiceImpl<BTSUserGroup, String> implements
		BTSUserGroupService
{

	@Inject
	private BTSUserGroupDao userGroupDao;

	@Override
	public BTSUserGroup createNew()
	{
		BTSUserGroup entity = BtsmodelFactory.eINSTANCE.createBTSUserGroup();
		super.setId(entity);
		super.setRevision(entity);
		return entity;
	}

	@Override
	public boolean save(BTSUserGroup entity)
	{
		super.addRevisionStatement(entity);
		userGroupDao.add(entity, ServiceConstants.ADMIN);
		return true;
	}

	@Override
	public void update(BTSUserGroup entity)
	{
		userGroupDao.update(entity, ServiceConstants.ADMIN);

	}

	@Override
	public void remove(BTSUserGroup entity)
	{
		userGroupDao.remove(entity, ServiceConstants.ADMIN);

	}

	@Override
	public BTSUserGroup find(String key)
	{
		BTSUserGroup userGroup = null;
		userGroup = userGroupDao.find(key, ServiceConstants.ADMIN);
		if (userGroup != null)
		{
			return userGroup;
		}
		return null;
	}

	@Override
	public List<BTSUserGroup> list(String objectState)
	{
		List<BTSUserGroup> userGroups = userGroupDao.list(
				ServiceConstants.ADMIN, objectState);
		return userGroups;
	}

	@Override
	public List<BTSUserGroup> query(BTSQueryRequest query, String objectState)
	{
		return query(query, objectState, true);
	}

	@Override
	public List<BTSUserGroup> query(BTSQueryRequest query, String objectState,
			boolean registerQuery) {
		List<BTSUserGroup> objects = userGroupDao.query(query,
				ServiceConstants.ADMIN, ServiceConstants.ADMIN, objectState,
				registerQuery);
		return filter(objects);
	}
	@Override
	public List<BTSUserGroup> list(String dbPath, String queryId,
			String objectState)
	{
		return filter(userGroupDao.findByQueryId(queryId, dbPath, objectState));
	}
}
