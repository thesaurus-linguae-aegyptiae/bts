package org.bbaw.bts.core.services.impl.services;

import java.util.List;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSUser;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.core.dao.BTSUserDao;
import org.bbaw.bts.core.services.BTSUserService;
import org.bbaw.bts.core.services.impl.internal.ServiceConstants;
import org.bbaw.bts.searchModel.BTSQueryRequest;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.e4.core.di.extensions.Preference;
import org.osgi.service.prefs.BackingStoreException;

public class BTSUserServiceImpl extends GenericObjectServiceImpl<BTSUser, String> implements BTSUserService
{
	@Inject
	@Preference(nodePath = "org.bbaw.bts.app")
	private IEclipsePreferences prefs;
	
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
		super.addRevisionStatement(entity);

		userDao.add(entity, ServiceConstants.ADMIN);
		//FIXME update user password if changed
		// FIXME update user role memberships 
		// beides in _user Object!!!!!!!!!!
		return true;
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
	public List<BTSUser> list(String objectState)
	{
		List<BTSUser> users = userDao.list(ServiceConstants.ADMIN, objectState);
		return filter(users);
	}

	@Override
	public List<BTSUser> query(BTSQueryRequest query, String objectState,
			boolean registerQuery)
	{
		List<BTSUser> objects = userDao.query(query, ServiceConstants.ADMIN,
				ServiceConstants.ADMIN, objectState, registerQuery);
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
		prefs.put("username", userName);
		prefs.put("password", passWord);
		return true;
	}

	@Override
	public void setRememberedUser(BTSUser user) {
		if(user == null)
		{
			prefs.remove("rememberedUsername");
			prefs.remove("remembered");
		}
		else
		{
			prefs.put("rememberedUsername", user.getUserName());
			prefs.put("remembered", prefs.get("password", ""));
		}
		try {
			prefs.flush();
		} catch (BackingStoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// prefs.put("password", passWord);

	}
}
