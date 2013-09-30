package org.bbaw.bts.core.services.impl.services;

import java.util.List;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSProject;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.core.dao.BTSProjectDao;
import org.bbaw.bts.core.services.BTSProjectService;
import org.bbaw.bts.core.services.impl.internal.ServiceConstants;

public class BTSProjectServiceImpl extends GenericObjectServiceImpl<BTSProject, String> implements BTSProjectService
{
	@Inject
	private BTSProjectDao projectDao;

	@Override
	public BTSProject createNew()
	{
		BTSProject entity = BtsmodelFactory.eINSTANCE.createBTSProject();
		super.setId(entity);
		super.setRevision(entity);
		return entity;
	}

	@Override
	public boolean save(BTSProject entity)
	{
		projectDao.add(entity, ServiceConstants.ADMIN);
		return false;
	}

	@Override
	public void update(BTSProject entity)
	{
		projectDao.update(entity, ServiceConstants.ADMIN);

	}

	@Override
	public void remove(BTSProject entity)
	{
		projectDao.remove(entity, ServiceConstants.ADMIN);

	}

	@Override
	public BTSProject find(String key)
	{
		return projectDao.find(key, ServiceConstants.ADMIN);
	}

	@Override
	public List<BTSProject> list()
	{
		return projectDao.list(ServiceConstants.ADMIN);
	}

}
