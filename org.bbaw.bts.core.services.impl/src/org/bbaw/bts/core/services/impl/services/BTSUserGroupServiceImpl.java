package org.bbaw.bts.core.services.impl.services;

import java.util.List;
import java.util.Vector;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSUserGroup;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.core.services.BTSUserGroupService;
import org.bbaw.bts.core.services.impl.internal.ServiceConstants;
import org.bbaw.bts.dao.couchDB.BTSUserGroupDaoImpl;

public class BTSUserGroupServiceImpl extends GenericObjectServiceImpl<BTSUserGroup, String> implements
		BTSUserGroupService
{

	@Inject
	BTSUserGroupDaoImpl userGroupDao;

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
		userGroupDao.add(entity, entity.getProject() + ServiceConstants.ADMIN_SUFFIX);
		return false;
	}

	@Override
	public void update(BTSUserGroup entity)
	{
		userGroupDao.update(entity, entity.getProject() + ServiceConstants.ADMIN_SUFFIX);

	}

	@Override
	public void remove(BTSUserGroup entity)
	{
		userGroupDao.remove(entity, entity.getProject() + ServiceConstants.ADMIN_SUFFIX);

	}

	@Override
	public BTSUserGroup find(String key)
	{
		BTSUserGroup userGroup = null;
		userGroup = userGroupDao.find(key, main_project + ServiceConstants.ADMIN_SUFFIX);
		if (userGroup != null)
		{
			return userGroup;
		}
		for (String p : active_projects.split(ServiceConstants.SPLIT_PATTERN))
		{
			userGroup = userGroupDao.find(key, p + ServiceConstants.ADMIN_SUFFIX);
			if (userGroup != null)
			{
				return userGroup;
			}
		}
		return null;
	}

	@Override
	public List<BTSUserGroup> list()
	{
		List<BTSUserGroup> userGroups = new Vector<BTSUserGroup>();
		for (String p : active_projects.split(ServiceConstants.SPLIT_PATTERN))
		{
			userGroups.addAll(userGroupDao.list(p + ServiceConstants.ADMIN_SUFFIX));
		}
		return userGroups;
	}

}
