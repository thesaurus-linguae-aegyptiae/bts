package org.bbaw.bts.core.services.impl.services;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.BTSRelation;
import org.bbaw.bts.btsmodel.BTSUser;
import org.bbaw.bts.btsmodel.BTSUserGroup;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.commons.BTSObjectSearchService;
import org.bbaw.bts.core.commons.filter.BTSFilter;
import org.bbaw.bts.core.dao.BTSUserDao;
import org.bbaw.bts.core.services.BTSUserService;
import org.bbaw.bts.core.services.impl.generic.GenericObjectServiceImpl;
import org.bbaw.bts.db.DBManager;
import org.bbaw.bts.searchModel.BTSQueryRequest;
import org.bbaw.bts.tempmodel.CacheTreeNode;
import org.eclipse.core.runtime.IProgressMonitor;
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
	
	@Inject
	private DBManager dbManager;

	@Override
	public BTSUser createNew()
	{
		BTSUser entity = BtsmodelFactory.eINSTANCE.createBTSUser();
		entity.setDBCollectionKey(BTSCoreConstants.ADMIN);

		super.setId(entity, entity.getDBCollectionKey());
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
	public BTSUser find(String key, IProgressMonitor monitor)
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
	public List<BTSUser> list(String objectState, IProgressMonitor monitor)
	{
		List<BTSUser> users = userDao.list(BTSCoreConstants.ADMIN, objectState);
		return users;
	}
	
	@Override
	public List<BTSUser> listChunks(int chunkSize,  String[] chunkIds, String dbCollectionName,
			String objectState, IProgressMonitor monitor) {
		List<BTSUser> users = userDao.listChunks(chunkSize, chunkIds,BTSCoreConstants.ADMIN, objectState);
		return users;
	}

	@Override
	public List<BTSUser> query(BTSQueryRequest query, String objectState,
			boolean registerQuery, IProgressMonitor monitor)
	{
		List<BTSUser> objects = userDao.query(query, BTSCoreConstants.ADMIN,
				BTSCoreConstants.ADMIN, objectState, registerQuery);
		return filter(objects);
	}

	@Override
	public List<BTSUser> query(BTSQueryRequest query, String objectState, IProgressMonitor monitor) {
		return query(query, objectState, true, monitor);
	}

	@Override
	public BTSUser createNewUser(String userName)
	{
		BTSUser entity = BtsmodelFactory.eINSTANCE.createBTSUser();
		entity.setDBCollectionKey(BTSCoreConstants.ADMIN);

		super.setId(entity, entity.getDBCollectionKey());
		entity.set_id(userName);
		entity.setUserName(userName);
		super.setRevision(entity);
		return entity;
	}

	@Override
	public List<BTSUser> list(String dbPath, String queryId, String objectState, IProgressMonitor monitor)
	{
		return filter(userDao.findByQueryId(queryId, dbPath, objectState));
	}

	@Override
	public boolean setAuthentication(String userName, String passWord)
	{
		if (!isValidAuthentication(userName, passWord))
		{
			return false;
		}
		ISecurePreferences secPrefs = SecurePreferencesFactory.getDefault().node("org.bbaw.bts.app");
		ISecurePreferences auth = secPrefs.node("auth");
		boolean success = false;
		try {
			auth.put("username", userName, false);
			auth.put("password", passWord, true);
			auth.flush();
			success = true;
			return true;
		} catch (StorageException e) {
			logger.error(e);
		} catch (IOException e) {
			logger.error(e);
		} catch (SecurityException e)
		{
			
		}
		if (!success)
		{
			try {
				auth.put("username", userName, false);
				auth.put("password", passWord, false);
				auth.flush();
				return true;
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
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

	@Override
	public boolean removeDatabaseUser(BTSUser user) {
		return userDao.removeDatabaseUser(user);
	}

	@Override
	public List<BTSObject> getUserOrphans(List<BTSFilter> btsFilters, List<BTSObject> rootEntries, IProgressMonitor monitor) {
		List<BTSUser> allEntries = list(BTSConstants.OBJECT_STATE_ACTIVE, monitor);
		List<BTSUser> allFilteredEntries = new Vector<BTSUser>();
		for (BTSUser e : allEntries)
		{
			if (isVisible(e, btsFilters))
			{
				allFilteredEntries.add(e);
			}
		}
		
		// load and cache root entries
		Set<String> allRootEntriesSet = new HashSet<String>(rootEntries.size());
		for (BTSObject e : rootEntries)
		{
			if (isVisible(e, btsFilters))
			{
				allRootEntriesSet.add(e.get_id());
			}
		}
		
		// init caches
		
		// potential root nodes
		Map<String, CacheTreeNode> roots = new HashMap<String, CacheTreeNode>();
		// all nodes
		Map<String, CacheTreeNode> allNodes = new HashMap<String, CacheTreeNode>();
		// nodes that await a holder, key = id of holder
		Map<String, List<CacheTreeNode>> awaitingHolder = new HashMap<String, List<CacheTreeNode>>();
		// nodes that provide hold to children, key = id of child
		Map<String, List<CacheTreeNode>> providingHold = new HashMap<String, List<CacheTreeNode>>();
		
		// iterate over all entries
		for (BTSUser e : allFilteredEntries)
		{
			if (isVisible(e, btsFilters))
			{
				CacheTreeNode tn = new CacheTreeNode(e.get_id(), e);
				allNodes.put(tn.getId(), tn);
				boolean held = false;
				List<CacheTreeNode> localHolders = providingHold.get(tn.getId());
				if (localHolders != null)
				{
					for (CacheTreeNode holder : localHolders)
					{
						holder.getChildren().add(tn);
						held = true;
					}
				}
				List<CacheTreeNode> localAwaiting = awaitingHolder.get(tn.getId());
				if (localAwaiting != null)
				{
					for (CacheTreeNode awaiting : localAwaiting)
					{
						tn.getChildren().add(awaiting);
						roots.remove(awaiting.getId());
					}
				}
				
				for (BTSRelation rel : e.getRelations())
				{
					if (BTSCoreConstants.BASIC_RELATIONS_PARTOF.equals(rel.getType()))
					{
						CacheTreeNode holder = allNodes.get(rel.getObjectId());
						if (holder != null)
						{
							holder.getChildren().add(tn);
							held = true;
						}
						else
						{
							addToMap(tn, rel.getObjectId(), awaitingHolder);
						}
					}
					else if (BTSCoreConstants.BASIC_RELATIONS_CONTAINS.equals(rel.getType()))
					{
						CacheTreeNode contained = allNodes.get(rel.getObjectId());
						if (contained != null)
						{
							tn.getChildren().add(contained);
							roots.remove(contained.getId());
						}
						else
						{
							addToMap(tn, rel.getObjectId(), providingHold);
						}
					}
				}
				if (!held)
				{
					roots.put(tn.getId(), tn);
				}
			}
		}
		List<BTSObject> orphans = new Vector<BTSObject>();
		for (CacheTreeNode tn : roots.values())
		{
			if (allRootEntriesSet != null && allRootEntriesSet.contains(tn.getId()))
			{
				// tn is rootnode and shown in viewer
			}
			else
			{
				orphans.add((BTSObject) tn.getObject());
			}
		}
		return orphans;
	}
	
	private void addToMap(CacheTreeNode tn,
			String key, Map<String, List<CacheTreeNode>> map) {
		List<CacheTreeNode> list = map.get(key);
		if (list == null)
		{
			list = new Vector<CacheTreeNode>(4);
			map.put(key, list);
		}
		list.add(tn);
	}
	private boolean isVisible(BTSObject e, List<BTSFilter> btsFilters) {
		if (btsFilters != null)
		{
			for (BTSFilter f : btsFilters)
			{
				if (!f.select(e))
				{
					return false;
				}
			}
			return true;
		}
		return true;
	}

	@Override
	public boolean authenticatedUserIsDBAdmin(String userName, String password) {
		return dbManager.checkUserIsDBAdmin(userName, password);
	}

	@Override
	public boolean isValidAuthentication(String userName, String passWord) {
		if (userDao.isAuthorizedUser(userName, passWord))
		{
			return true;
		}
		try {
			return remoteGeneralPurposeDao.isAuthorizedUser(userName, passWord);
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean checkAndChangeDBAdminPassword(String userName,
			String newPassword) {
		try {
			return dbManager.changeAuthenticationDBAdmin(userName, newPassword);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return false;
		}
	}

}
