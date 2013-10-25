package org.bbaw.bts.core.services.impl.services;

import java.util.List;

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
		userDao.add(entity, ServiceConstants.ADMIN);
		return false;
	}

	@Override
	public void update(BTSUser entity)
	{
		userDao.update(entity, ServiceConstants.ADMIN);

	}

	@Override
	public void remove(BTSUser entity)
	{
		userDao.remove(entity, ServiceConstants.ADMIN);

	}

	@Override
	public BTSUser find(String key)
	{
		BTSUser user = null;
		user = userDao.find(key, ServiceConstants.ADMIN);
		if (user != null)
		{
			return user;
		}
		return null;
	}

	@Override
	public List<BTSUser> list()
	{
		List<BTSUser> users = userDao.list(ServiceConstants.ADMIN);
		return filter(users);
	}

	@Override
	public List<BTSUser> query(BTSQueryRequest query)
	{
		List<BTSUser> objects = userDao.query(query, ServiceConstants.ADMIN, ServiceConstants.ADMIN);
		return filter(objects);
	}

	@Override
	public BTSUser createNewUser(String userName)
	{
		BTSUser entity = BtsmodelFactory.eINSTANCE.createBTSUser();
		super.setId(entity);
		entity.setUserName(userName);
		super.setRevision(entity);
		return entity;
	}

}
