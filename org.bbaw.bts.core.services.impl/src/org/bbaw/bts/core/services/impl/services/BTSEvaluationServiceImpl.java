package org.bbaw.bts.core.services.impl.services;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import javax.inject.Inject;
import javax.inject.Named;

import org.bbaw.bts.btsmodel.AdministrativDataObject;
import org.bbaw.bts.btsmodel.BTSAnnotation;
import org.bbaw.bts.btsmodel.BTSCorpusObject;
import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.btsmodel.BTSDBCollectionRoleDesc;
import org.bbaw.bts.btsmodel.BTSIdentifiableItem;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.BTSProject;
import org.bbaw.bts.btsmodel.BTSProjectDBCollection;
import org.bbaw.bts.btsmodel.BTSUser;
import org.bbaw.bts.btsmodel.BTSUserGroup;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.btsmodel.DBLease;
import org.bbaw.bts.btsviewmodel.TreeNodeWrapper;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.commons.BTSPluginIDs;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.commons.exceptions.BTSLockingException;
import org.bbaw.bts.core.dao.DBLeaseDao;
import org.bbaw.bts.core.dao.GeneralPurposeDao;
import org.bbaw.bts.core.dao.GenericDao;
import org.bbaw.bts.core.remote.dao.RemoteDBLeaseDao;
import org.bbaw.bts.core.services.BTSEvaluationService;
import org.bbaw.bts.core.services.BTSProjectService;
import org.bbaw.bts.core.services.PermissionsAndExpressionsEvaluationService;
import org.bbaw.bts.searchModel.BTSModelUpdateNotification;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.EventTopic;
import org.eclipse.e4.core.di.extensions.Preference;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.e4.core.services.log.Logger;

/** This Service is actively used to request information about the visibility or lock status of an object.
 * @author plutte
 *
 */
public class BTSEvaluationServiceImpl implements BTSEvaluationService
{

	protected static final String NOTIFICATION = "notification";

	@Inject
	@Optional
	@Named(BTSCoreConstants.AUTHENTICATED_USER)
	private BTSUser authenticatedUser;
	
	@Optional
	@Named(BTSCoreConstants.USERGROUPS_OF_AUTHENTICATED_USER)
	private List<BTSUserGroup> userGroups;

	private Map<String, BTSProjectDBCollection> dbCollectionCache;

	private BTSProjectService projectService;

	@Inject
	private Logger logger;

	@Inject
	private IEclipseContext context;

	@Inject
	protected DBLeaseDao dbLeaseDao;

	@Inject
	private RemoteDBLeaseDao remoteDBLeaseDao;

	@Inject
	private GeneralPurposeDao generalPurposeDao;
	
	@Inject
	private IEventBroker eventBroker;
	
	@Inject
	@Optional
	@Preference(value = BTSPluginIDs.PREF_LOCK_TTL, nodePath = "org.bbaw.bts.app")
	private String lock_ttl_string;
	
	private long lock_ttl = -1;

	private long renewal_dif =  BTSConstants.DEFAULT_LOCK_TTL;
	
	@Override
	public boolean filter(Object object)
	{
		if (object instanceof BTSDBBaseObject)
		{
			if ( isVisibleToUser((BTSDBBaseObject) object))
			{
				processIfLocked((BTSDBBaseObject) object);
				return true;
			}
		}
		if (object instanceof BTSIdentifiableItem)
		{
			logger.info("Object not visible, object id: " + ((BTSIdentifiableItem) object).get_id());
		}

		return false;
	}

	private void processIfLocked(BTSDBBaseObject object) {
		DBLease lease = findLockingMap().get(object.get_id());
		if (lease != null && checkAndProcessLeaseTTL(lease, object))
		{
			object.setLocked(true);
		}
		
	}

	private boolean checkAndProcessLeaseTTL(DBLease lease, BTSIdentifiableItem item) {
		if (lockIsAlive(lease))
		{
			return true;
		}
		else
		{
			removeLease(lease, item);
			return false;
		}
	}

	private boolean lockIsAlive(DBLease lease) {
		Date now = getCurrentTimeStamp();
		if(now.getTime() - getLockTTL() <= 	lease.getTimeStamp().getTime())
		{
			return true;
		}
		return false;
	}

	private long getLockTTL() {
		if (lock_ttl < 0)
		{
			if (lock_ttl_string == null || "".equals(lock_ttl_string))
			{
				lock_ttl = BTSConstants.DEFAULT_LOCK_TTL;
			}
			else
			{
				try {
					lock_ttl = new Integer(lock_ttl_string).intValue();
				} catch (NumberFormatException e) {
					lock_ttl = BTSConstants.DEFAULT_LOCK_TTL;
				}
			}
			renewal_dif = lock_ttl / 3;
		}
		
		return lock_ttl;
	}

	@Override
	public void computeSelection(Object selection)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public <T extends BTSDBBaseObject> List<T> filter(List<T> objects) {
		if (objects == null) return null;
		List<T> filtered = new Vector<T>(objects.size());
		for (T o : objects)
		{
			if (isVisibleToUser(o))
			{
				filtered.add(o);
				processIfLocked(o);
			}
		}
		logger.info("Filtered objects size: " + filtered.size());
		return filtered;
	}

	public boolean isVisibleToUser(BTSDBBaseObject object)
	{
		if (object instanceof AdministrativDataObject)
		{
			AdministrativDataObject ao = (AdministrativDataObject) object;
			
			// return yes if object is open to unauthenticated public
			if (BTSCoreConstants.VISIBILITY_PUBLIC.equals(ao.getVisibility()))
			{
				return true;
			}
			else if (authenticatedUser == null) // if no user authenticated, it is not visible
			{
				return false;
			}
			
			// user is authenticated and object open to all authenticated users
			if (BTSCoreConstants.VISIBILITY_ALL_AUTHENTICATED.equals(ao.getVisibility()))
			{
				return true;
			}
			
			//user roles are editor or above for given collection
			if (userHasEditorRights(object))
			{
				return true;
			}
			
			//all other cases: true if user is a member of updaters or readers
			if (userIsReader(object))
			{
				return true;
			}
		}
		return false;
	}

	private boolean userHasEditorRights(BTSDBBaseObject object) {
		//find project of current object
		//see highest role user in dbcollection of object
		
		BTSProjectDBCollection dbColl = findDBProjectCollection(object);
		String role = highestRoleOfAuthenticatedUserInDBCollection(dbColl);
		return (BTSCoreConstants.USER_ROLE_ADMINS.equals(role)  
				||BTSCoreConstants.USER_ROLE_EDITORS.equals(role));
	}
	
	

	private BTSProjectDBCollection findDBProjectCollection(
			BTSDBBaseObject object) {
		String dbcoll = object.getDBCollectionKey();
		return findDBCollectionInCache(dbcoll);
	}

	private BTSProjectDBCollection findDBCollectionInCache(String dbcoll) {
		if (dbCollectionCache == null || dbCollectionCache.isEmpty())
		{
			loadDBCollectionCache();
		}
		return dbCollectionCache.get(dbcoll);
	}

	private void loadDBCollectionCache() {
		dbCollectionCache = new HashMap<String, BTSProjectDBCollection>();
		projectService = context.get(BTSProjectService.class);
		List<BTSProject> projects = projectService.list(BTSConstants.OBJECT_STATE_ACITVE);
		for (BTSProject project : projects)
		{
			for (BTSProjectDBCollection coll : project.getDbCollections())
			{
				dbCollectionCache.put(coll.getCollectionName(), coll);
			}
		}
	}

	private boolean userIsReader(BTSDBBaseObject object) {
		if (object == null) return false;
		
		// check updaters and readers
		return (authenticatedUserIsMember(object.getUpdaters()) || authenticatedUserIsMember(object.getReaders()));
	}
	
	
	
	public boolean authenticatedUserIsMember(List<String> userList) {
		for (String userId : userList) {
			if (userId.equals(authenticatedUser.get_id())
					|| userId.equals(authenticatedUser.getUserName())) {
				return true;
			}
			if (userGroups != null && !userGroups.isEmpty()) {
				for (BTSUserGroup g : userGroups) {
					if (userId.equals(g.get_id()) || userId.equals(g.getName())) {
						return true;
					}
				}
			}

		}
		return false;
	}
	
	public String highestRoleOfAuthenticatedUserInDBCollection(BTSProjectDBCollection c) {
		String role = BTSCoreConstants.USER_ROLE_GUESTS;
		if (c == null)
		{
			return role;
		}
		int level = 0;
		for (BTSDBCollectionRoleDesc r : c.getRoleDescriptions()) {
			switch (r.getRoleName()) {
			case BTSCoreConstants.USER_ROLE_ADMINS: {
				if (authenticatedUserIsMember(r.getUserNames())) {
					return BTSCoreConstants.USER_ROLE_ADMINS;
				}
				break;
			}
			case BTSCoreConstants.USER_ROLE_EDITORS: {
				if (authenticatedUserIsMember(r.getUserNames())) {
					role = BTSCoreConstants.USER_ROLE_EDITORS;
					level = 4;
				}
				break;
			}
			case BTSCoreConstants.USER_ROLE_RESEARCHERS: {
				if (level < 3 && authenticatedUserIsMember(r.getUserNames())) {
					role = BTSCoreConstants.USER_ROLE_RESEARCHERS;
					level = 3;
				}
				break;
			}
			case BTSCoreConstants.USER_ROLE_TRANSCRIBERS: {
				if (level < 2 && authenticatedUserIsMember(r.getUserNames())) {
					role = BTSCoreConstants.USER_ROLE_TRANSCRIBERS;
					level = 2;
				}
				break;
			}

			}
		}
		return role;
	}

	@Override
	public boolean acquireLockOptimistic(Object object) {
		if (!(object instanceof BTSIdentifiableItem))
		{
			logger.error("ERROR. Trying to acquire lock for an object that BTSIdentifiablemItem.");
			throw new BTSLockingException("ERROR. Trying to acquire lock for an object that BTSIdentifiablemItem.");
		}
		
		boolean locked = false;
		BTSIdentifiableItem item = (BTSIdentifiableItem) object;
		// get locking map
		Map<String, DBLease> lockingMap = findLockingMap();
		
		// look up in map if lock exists
		DBLease lease = lockingMap.get(item.get_id());
		if (lease == null) // no lease
		{
			// try to set lease in local and central database -> use separate thread!
			setLock(item);
			
		}
		else if(authenticatedUser.get_id().equals(lease.getUserId())) // authenticated user leases already
		{
			checkAndRenewLease(lease);
		}
		else if (checkAndProcessLeaseTTL(lease, item)) // locked
		{
			locked = true;
		}
		return locked;
	}

	private void checkAndRenewLease(DBLease lease) {
		if (getCurrentTimeStamp().getTime() - renewal_dif > lease.getTimeStamp().getTime())
		{
			lease.setTimeStamp(getCurrentTimeStamp());
			saveLease(lease);
		}
		
	}

	private void saveLease(final DBLease lease) {
		Job job = new Job("Locking " + lease.get_id())
		{

			@Override
			protected IStatus run(IProgressMonitor monitor) {
				
				try {
					dbLeaseDao.add(lease, NOTIFICATION);
				} catch (Exception e) {
					logger.error(e);
					return Status.CANCEL_STATUS;
				}
				return Status.OK_STATUS;
			}
			
		};
		job.schedule();
		
	}

	private void setLock(final BTSIdentifiableItem item) {
		Job job = new Job("Locking " + item.get_id())
		{

			@Override
			protected IStatus run(IProgressMonitor monitor) {
				
				DBLease lease = prepareLease(item);
				try {
					dbLeaseDao.add(lease, NOTIFICATION);
				} catch (Exception e) {
					logger.error(e);
					return Status.CANCEL_STATUS;
				}
				addLeaseToMap(lease);
				updateItemLockStatus(item, true);
				return Status.OK_STATUS;
			}
			
		};
		job.schedule();
		
	}

	protected DBLease prepareLease(BTSIdentifiableItem item) {
		DBLease lease = BtsmodelFactory.eINSTANCE.createDBLease();
		lease.set_id(item.get_id());
		lease.setObjectId(item.get_id());
		lease.setUserId(authenticatedUser.get_id());
		lease.setTimeStamp(getCurrentTimeStamp());
		if (item instanceof BTSDBBaseObject)
		{
			lease.setPath(((BTSDBBaseObject) item).getDBCollectionKey());
		}
		else
		{
			lease.setPath("admin");
		}
		return lease;
	}

	protected Date getCurrentTimeStamp() {
		return Calendar.getInstance().getTime();
	}

	private Map<String, DBLease> findLockingMap() {
		Object m = context.get(BTSCoreConstants.LOCKING_MAP_KEY);
		if (m != null && m instanceof Map<?,?>)
		{
			return (Map<String, DBLease>) m;
		}
		else
		{
			Map<String, DBLease> map = new HashMap<String, DBLease>();
			fillLockingMap(map);
			context.set(BTSCoreConstants.LOCKING_MAP_KEY, map);
			return map;
		}
	}

	/** lists all available leases form db and checks the leases if they are still alive.
	 * if yes -> put into map
	 * if no -> remove lease
	 * @param map map to fill
	 */
	private void fillLockingMap(Map<String, DBLease> map) {
		List<DBLease> leases = dbLeaseDao.list(NOTIFICATION, BTSConstants.OBJECT_STATE_ACITVE);
		for (DBLease lease : leases)
		{
			if (checkAndProcessLeaseTTL(lease, null))
			{
				map.put(lease.get_id(), lease);
			}
		}
		
	}

	@Override
	public boolean acquireLockStrict(Object object) {
		if (!(object instanceof BTSIdentifiableItem))
		{
			logger.error("ERROR. Trying to acquire lock for an object that BTSIdentifiablemItem.");
			throw new BTSLockingException("ERROR. Trying to acquire lock for an object that BTSIdentifiablemItem.");
		}
		
		boolean acquired = false;
		BTSIdentifiableItem item = (BTSIdentifiableItem) object;
		// get locking map
		Map<String, DBLease> lockingMap = findLockingMap();
		
		// look up in map if lock exists
		DBLease lease = lockingMap.get(item.get_id());
		if (lease == null) // no lease
		{
			// try to submit lock in central db
			acquired = setLockRemote(item);
		}
		else if(authenticatedUser.get_id().equals(lease.getUserId())) // authenticated user leases already
		{
			checkAndRenewLease(lease);
			acquired = true;
		}
		else // locked
		{
			acquired = checkAndProcessLeaseTTL(lease, item);
		}

		// return if successful
		return acquired;
	}

	private boolean setLockRemote(BTSIdentifiableItem item) {
		DBLease lease = prepareLease(item);
		try {
			remoteDBLeaseDao.add(lease, NOTIFICATION);
			dbLeaseDao.add(lease, NOTIFICATION);
		} catch (Exception e) {
			logger.info("Setting remote DBLease unsuccessful. Item id: " + item.get_id(), e);
			return false;
		}
		try {
			dbLeaseDao.add(lease, NOTIFICATION);
		} catch (Exception e) {
			logger.info("Setting local DBLease unsuccessful. Item id: " + item.get_id(), e);
			return false;
		}
		addLeaseToMap(lease);
		updateItemLockStatus(item, true);
		return true;
	}

	private void addLeaseToMap(DBLease lease) {
		Map<String, DBLease> lockingMap = findLockingMap();
		lockingMap.put(lease.get_id(), lease);
	}

	@Override
	public void unlock(Object object) {
		
		if (!(object instanceof BTSIdentifiableItem))
		{
			// cannot be locked
			return;
		}
		final BTSIdentifiableItem item = (BTSIdentifiableItem) object;
		// look up all leases
		final Map<String, DBLease> lockingMap = findLockingMap();
		final DBLease lease = lockingMap.get(item.get_id());
		
		if (lease == null)
		{
			return;
		}
		
		
		// remove lease from local db
		// try to remove leases from central db
		removeLease(lease, (BTSIdentifiableItem) object);
		
	}

	private void removeLease(final DBLease lease, final BTSIdentifiableItem item) {
		Job job = new Job("Locking " + lease.get_id())
		{

			@Override
			protected IStatus run(IProgressMonitor monitor) {
				
				try {
					dbLeaseDao.remove(lease, NOTIFICATION);
				} catch (Exception e) {
					logger.error(e);
					return Status.CANCEL_STATUS;
				}
				try {
					remoteDBLeaseDao.remove(lease, NOTIFICATION);
				} catch (Exception e) {
					logger.error(e);
				}
				// remove lease from lease map
				final Map<String, DBLease> lockingMap = findLockingMap();
				lockingMap.remove(lease.get_id());
				if (item != null)
				{
					// set object locked = false
					updateItemLockStatus(item, false);
				}
				
				return Status.OK_STATUS;
			}
			
		};
		job.schedule();
		
	}

	private void updateItemLockStatus(BTSIdentifiableItem item, boolean locked) {
		if (item instanceof BTSDBBaseObject)
		{
			((BTSDBBaseObject) item).setLocked(locked);
		}
		
	}

	@Inject
	@Optional
	void eventReceivedLeaseUpdate(@EventTopic("lease_update/*") BTSModelUpdateNotification notification) {
		if (notification.getObject() instanceof DBLease) 
		{
			DBLease lease = (DBLease) notification.getObject();
			BTSIdentifiableItem item = findLockedItem(lease);
			if (notification.isDeleted())
			{
				try {
					dbLeaseDao.remove(lease, NOTIFICATION);
				} catch (Exception e) {
					logger.error(e);
				}
				try {
					remoteDBLeaseDao.remove(lease, NOTIFICATION);
				} catch (Exception e) {
					logger.error(e);
				}
				final Map<String, DBLease> lockingMap = findLockingMap();
				lockingMap.remove(lease.get_id());
				if (item != null)
				{
					updateItemLockStatus(item, false);
					// if object == ACTIVE_Selection -> trigger permissionEvalService to recalculate mayEdit-Settings
					eventBroker.post("locking_status_update/unlocked", item);
				}
			}
			else
			{
				DBLease cached = findLockingMap().get(lease.get_id());
				
				// lease already exists
				if (cached != null)
				{
					if (cached.getUserId() != null && cached.getUserId().equals(lease.getUserId()))
					{
						// nothing to do
					}
					else
					{
						throw new BTSLockingException("Lock error. Different users locked the same object.");
					}
				}
				else
				{
				// lease is new
					if (item != null && item instanceof BTSDBBaseObject)
					{
						((BTSDBBaseObject) item).setLocked(true);
						lease.setObject((BTSDBBaseObject) item);
						eventBroker.post("locking_status_update/locked", lease);
					}
					addLeaseToMap(lease);
				}
			}			
		}
	}

	private BTSIdentifiableItem findLockedItem(DBLease lease) {
		if (generalPurposeDao.objectIsLoaded(lease.getPath(), lease.getObjectId()))
		{
			Object object = generalPurposeDao.find(lease.getObjectId(), lease.getPath());
			if (object instanceof BTSDBBaseObject)
			{
				return generalPurposeDao.find(lease.getObjectId(), lease.getPath());
			}
		} 
		return null;
	}
}
