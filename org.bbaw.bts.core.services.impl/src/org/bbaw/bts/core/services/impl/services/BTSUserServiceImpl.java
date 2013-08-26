package org.bbaw.bts.core.services.impl.services;

import java.util.List;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSUser;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.core.services.BTSUserService;
import org.bbaw.bts.dao.couchDB.BTSUserDaoImpl;

public class BTSUserServiceImpl extends
		GenericObjectServiceImpl<BTSUser, String> implements BTSUserService {

	@Inject
	BTSUserDaoImpl userDao;

	@Override
	public BTSUser createNew() {
		BTSUser entity = BtsmodelFactory.eINSTANCE.createBTSUser();
		super.setId(entity);
		super.setRevision(entity);
		return entity;
	}

	@Override
	public boolean save(BTSUser entity) {
		userDao.add(entity);
		return false;
	}

	@Override
	public void update(BTSUser entity) {
		userDao.update(entity);

	}

	@Override
	public void remove(BTSUser entity) {
		userDao.remove(entity);

	}

	@Override
	public BTSUser find(String key) {
		return userDao.find(key);
	}

	@Override
	public List<BTSUser> list() {
		return userDao.list();
	}

}
