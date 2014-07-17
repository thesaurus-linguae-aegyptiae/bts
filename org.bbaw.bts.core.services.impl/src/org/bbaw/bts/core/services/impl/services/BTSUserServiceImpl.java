package org.bbaw.bts.core.services.impl.services;

import java.io.IOException;
import java.util.List;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSUser;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.commons.BTSObjectSearchService;
import org.bbaw.bts.core.dao.BTSUserDao;
import org.bbaw.bts.core.services.BTSUserService;
import org.bbaw.bts.core.services.impl.generic.GenericObjectServiceImpl;
import org.bbaw.bts.searchModel.BTSQueryRequest;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.e4.core.di.extensions.Preference;
import org.eclipse.e4.core.services.log.Logger;
import org.eclipse.equinox.security.storage.ISecurePreferences;
import org.eclipse.equinox.security.storage.SecurePreferencesFactory;
import org.eclipse.equinox.security.storage.StorageException;
import org.osgi.service.prefs.BackingStoreException;

public class BTSUserServiceImpl extends GenericObjectServiceImpl<BTSUser, String> implements BTSUserService, BTSObjectSearchService
{
	@Inject
	@Preference(nodePath = "org.bbaw.bts.app")
	private IEclipsePreferences prefs;
	
	@Inject
	private BTSUserDao userDao;

	@Inject
	private Logger logger;

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
		super.addRevisionStatement(entity);

		userDao.add(entity, BTSCoreConstants.ADMIN);
		//FIXME update user password if changed
		// FIXME update user role memberships 
		// beides in _user Object!!!!!!!!!!
		return true;
	}

	@Override
	public void update(BTSUser entity)
	{
		userDao.update(entity, BTSCoreConstants.ADMIN);

	}

	@Override
	public void remove(BTSUser entity)
	{
		userDao.remove(entity, BTSCoreConstants.ADMIN);

	}

	@Override
	public BTSUser find(String key)
	{
		BTSUser user = null;
		user = userDao.find(key, BTSCoreConstants.ADMIN);
		if (user != null)
		{
			return user;
		}
		return null;
	}

	@Override
	public List<BTSUser> list(String objectState)
	{
		List<BTSUser> users = userDao.list(BTSCoreConstants.ADMIN, objectState);
		return users;
	}

	@Override
	public List<BTSUser> query(BTSQueryRequest query, String objectState,
			boolean registerQuery)
	{
		List<BTSUser> objects = userDao.query(query, BTSCoreConstants.ADMIN,
				BTSCoreConstants.ADMIN, objectState, registerQuery);
		return filter(objects);
	}

	@Override
	public List<BTSUser> query(BTSQueryRequest query, String objectState) {
		return query(query, objectState, true);
	}

	@Override
	public BTSUser createNewUser(String userName)
	{
		BTSUser entity = BtsmodelFactory.eINSTANCE.createBTSUser();
		super.setId(entity);
		entity.set_id(userName);
		entity.setUserName(userName);
		super.setRevision(entity);
		return entity;
	}

	@Override
	public List<BTSUser> list(String dbPath, String queryId, String objectState)
	{
		return filter(userDao.findByQueryId(queryId, dbPath, objectState));
	}

	@Override
	public boolean setAuthentication(String userName, String passWord)
	{
		if (!userDao.isAuthorizedUser(userName, passWord))
		{
			return false;
		}
		ISecurePreferences secPrefs = SecurePreferencesFactory.getDefault().node("org.bbaw.bts.app");
		ISecurePreferences auth = secPrefs.node("auth");
		try {
			auth.put("username", userName, false);
			auth.put("password", passWord, true);
			auth.flush();
			return true;
		} catch (StorageException e) {
			logger.error(e);
		} catch (IOException e) {
			logger.error(e);
		}

		return false;
	}

	@Override
	public void setRememberedUser(BTSUser user) {
		ISecurePreferences secPrefs = SecurePreferencesFactory.getDefault().node("org.bbaw.bts.app");
		ISecurePreferences rememberedMe = secPrefs.node("rememberedMe");
		if(user == null)
		{
			rememberedMe.remove("rememberedUsername");
			rememberedMe.remove("remembered");
		}
		else
		{
			ISecurePreferences auth = secPrefs.node("auth");
			try {
				String rememberedUsername = auth.get("username", null);
				String rememberedPass = auth.get("password", null);
				rememberedMe.put("rememberedUsername", rememberedUsername, false);
				rememberedMe.put("remembered",rememberedPass, true);
			} catch (StorageException e) {
				logger.error(e);
			}
		}
		try {
			rememberedMe.flush();
		} catch (IOException e) {
			logger.error(e);
		}

	}


	@Override
	public List<BTSUser> listAll(String objectState, String userName,
			String passWord) {
		List<BTSUser> users = userDao.list(BTSCoreConstants.ADMIN, objectState, userName, passWord);
		return users;
	}

	@Override
	public String getNameOfServedClass() {
		return "BTSUser";
	}

	@Override
	public <T> Class<T> getServedClass() {
		return (Class<T>) BTSUser.class;
	}
}
