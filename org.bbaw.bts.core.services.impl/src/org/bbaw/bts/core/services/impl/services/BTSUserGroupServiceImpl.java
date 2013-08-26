package org.bbaw.bts.core.services.impl.services;

import java.util.List;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSUserGroup;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.core.services.BTSUserGroupService;
import org.bbaw.bts.dao.couchDB.BTSUserGroupDaoImpl;

public class BTSUserGroupServiceImpl extends
		GenericObjectServiceImpl<BTSUserGroup, String> implements
		BTSUserGroupService {

	@Inject
	BTSUserGroupDaoImpl userGroupDao;

	@Override
	public BTSUserGroup createNew() {
		BTSUserGroup entity = BtsmodelFactory.eINSTANCE.createBTSUserGroup();
		super.setId(entity);
		super.setRevision(entity);
		return entity;
	}

	@Override
	public boolean save(BTSUserGroup entity) {
		userGroupDao.add(entity);
		return false;
	}

	@Override
	public void update(BTSUserGroup entity) {
		userGroupDao.update(entity);

	}

	@Override
	public void remove(BTSUserGroup entity) {
		userGroupDao.remove(entity);

	}

	@Override
	public BTSUserGroup find(String key) {
		return userGroupDao.find(key);
	}

	@Override
	public List<BTSUserGroup> list() {
		return userGroupDao.list();
	}

}
