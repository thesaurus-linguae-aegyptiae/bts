package org.bbaw.bts.core.services.impl.services;

import java.util.List;
import java.util.Vector;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSUser;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.core.dao.BTSUserDao;
import org.bbaw.bts.core.services.BTSUserService;
import org.bbaw.bts.core.services.impl.internal.ServiceConstants;
import org.bbaw.bts.searchModel.BTSQueryRequest;

public class BTSUserServiceImpl extends GenericObjectServiceImpl<BTSUser, String> implements BTSUserService
{

	@Inject
	private BTSUserDao userDao;

	@Override
	public BTSUser createNew()
	{
		BTSUser entity = BtsmodelFactory.eINSTANCE.createBTSUser();
		super.setId(entity);
		super.setRevision(entity);
		return entity;
	}

	@Override
	public boolean save(BTSUser entity)
	{
		userDao.add(entity, entity.getProject() + ServiceConstants.ADMIN_SUFFIX);
		return false;
	}

	@Override
	public void update(BTSUser entity)
	{
		userDao.update(entity, entity.getProject() + ServiceConstants.ADMIN_SUFFIX);

	}

	@Override
	public void remove(BTSUser entity)
	{
		userDao.remove(entity, entity.getProject() + ServiceConstants.ADMIN_SUFFIX);

	}

	@Override
	public BTSUser find(String key)
	{
		BTSUser user = null;
		user = userDao.find(key, main_project + ServiceConstants.ADMIN_SUFFIX);
		if (user != null)
		{
			return user;
		}
		for (String p : active_projects.split(ServiceConstants.SPLIT_PATTERN))
		{
			user = userDao.find(key, p + ServiceConstants.ADMIN_SUFFIX);
			if (user != null)
			{
				return user;
			}
		}
		return null;
	}

	@Override
	public List<BTSUser> list()
	{
		List<BTSUser> users = new Vector<BTSUser>();
		for (String p : active_projects.split(ServiceConstants.SPLIT_PATTERN))
		{
			users.addAll(userDao.list(p + ServiceConstants.ADMIN_SUFFIX));
		}
		return filter(users);
	}

	@Override
	public List<BTSUser> query(BTSQueryRequest query)
	{
		List<BTSUser> objects = new Vector<BTSUser>();
		for (String p : active_projects.split(ServiceConstants.SPLIT_PATTERN))
		{
			objects.addAll(userDao.query(query, p + ServiceConstants.ADMIN_SUFFIX, p + ServiceConstants.ADMIN_SUFFIX));
		}
		return filter(objects);
	}

}
