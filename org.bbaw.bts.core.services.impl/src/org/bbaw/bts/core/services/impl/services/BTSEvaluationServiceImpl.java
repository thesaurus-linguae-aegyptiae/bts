package org.bbaw.bts.core.services.impl.services;

import java.io.IOException;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.Vector;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.commons.net.ntp.NTPUDPClient;
import org.apache.commons.net.ntp.NtpV3Packet;
import org.apache.commons.net.ntp.TimeInfo;
import org.apache.commons.net.ntp.TimeStamp;
import org.bbaw.bts.btsmodel.AdministrativDataObject;
import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.btsmodel.BTSDBCollectionRoleDesc;
import org.bbaw.bts.btsmodel.BTSIdentifiableItem;
import org.bbaw.bts.btsmodel.BTSProject;
import org.bbaw.bts.btsmodel.BTSProjectDBCollection;
import org.bbaw.bts.btsmodel.BTSUser;
import org.bbaw.bts.btsmodel.BTSUserGroup;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.btsmodel.DBLease;
import org.bbaw.bts.btsviewmodel.BtsviewmodelFactory;
import org.bbaw.bts.btsviewmodel.StatusMessage;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.commons.BTSPluginIDs;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.commons.exceptions.BTSLockingException;
import org.bbaw.bts.core.dao.BTSUserDao;
import org.bbaw.bts.core.dao.DBLeaseDao;
import org.bbaw.bts.core.dao.GeneralPurposeDao;
import org.bbaw.bts.core.dao.GenericDao;
import org.bbaw.bts.core.remote.dao.RemoteDBLeaseDao;
import org.bbaw.bts.core.remote.dao.RemoteDBManager;
import org.bbaw.bts.core.services.BTSEvaluationService;
import org.bbaw.bts.core.services.BTSProjectService;
import org.bbaw.bts.core.services.BTSUserGroupService;
import org.bbaw.bts.db.DBManager;
import org.bbaw.bts.searchModel.BTSModelUpdateNotification;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.preferences.ConfigurationScope;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
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

	private static final long TIME_CHECK_INFERVAL = 3000000;

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

	private IEclipsePreferences prefs = ConfigurationScope.INSTANCE.getNode("org.bbaw.bts.app");

	private String btsUUID = prefs.get(BTSConstants.BTS_UUID, null);

	private Long systemClockDifferenceLong;

	@Inject
	@Optional
	@Preference(value = BTSPluginIDs.PREF_SYSTEM_CLOCK_DIFFERENCE, nodePath = "org.bbaw.bts.app")
	private String systemClockDifference;

	private Date lastTimeCheck;

	@Inject
	private BTSUserDao userDao;

	@Inject
	private DBManager dBManager;
	
	@Inject
	private RemoteDBManager remoteDBManager;

	
	private BTSUserGroupService userGroupService;
	
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
		if (lease != null && lease.getActive() &&  checkAndProcessLeaseTTL(lease, object))
		{
			object.setLocked(true);
		}
		
	}

	/** returns true if lease is alive. else false and lease is deleted.
	 * @param lease
	 * @param item
	 * @return
	 */
	private boolean checkAndProcessLeaseTTL(DBLease lease, BTSIdentifiableItem item) {
		if (lockIsAlive(lease))
		{
			return lease.getActive();
		}
		else
		{
			logger.info("checkAndProcessLeaseTTL, lease not alive, remove old lease: " + lease.get_id() + ", leased object id " + lease.getObjectId());
			removeLease(lease, item);
			return false;
		}
	}

	private boolean lockIsAlive(DBLease lease) {
		Date now = getCurrentTimeStamp();
		logger.info("Lease is alive. now: " + now + ", leaseTimestamp " + lease.getTimeStamp());
		if(now.getTime() - getLockTTL() <= 	lease.getTimeStamp().getTime())
		{
			logger.info("Lease is alive. false");
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
		int suppressed = 0;
		for (T o : objects)
		{
			if (isVisibleToUser(o))
			{
				filtered.add(o);
				processIfLocked(o);
			}
			else
			{
				suppressed++;
			}
		}
		logger.info("Filtered objects size: " + filtered.size());
		if (suppressed > 0)
		{
			StatusMessage m = BtsviewmodelFactory.eINSTANCE.createFilteredMessage(suppressed);
			eventBroker.post("status_info/filtered", m);
		}
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
		if (dbColl != null && "admin".equals(dbColl.getCollectionName()))
		{
			return authenticatedUserIsDBAdmin(true);
		}
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
		List<BTSProject> projects = projectService.list(BTSConstants.OBJECT_STATE_ACTIVE, null);
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
	public boolean userIsMember(BTSUser user, List<String> userList) {
		for (String userId : userList) {
			if (userId.equals(user.get_id())
					|| userId.equals(user.getUserName())) {
				return true;
			}
			List<BTSUserGroup> localGroups = getUserGroupsOfUser(user);
			if (localGroups != null && !localGroups.isEmpty()) {
				for (BTSUserGroup g : localGroups) {
					if (userId.equals(g.get_id()) || userId.equals(g.getName())) {
						return true;
					}
				}
			}

		}
		return false;
	}
	
	private List<BTSUserGroup> getUserGroupsOfUser(BTSUser user) {
		List<BTSUserGroup> groups = new Vector<BTSUserGroup>(4);

		if (userGroupService == null)
		{
			userGroupService = context.get(BTSUserGroupService.class);
		}
		if (user != null) {
			for (String id : user.getGroupIds()) {
				BTSUserGroup g = null;
				try {
					g = userGroupService.find(id, null);
				} catch (Exception e) {
					e.printStackTrace();
				}
				if (g != null && !groups.contains(g)) {
					groups.add(g);
				}
			}
		}
		return groups;
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
			locked = true;
		}
		else if (!lease.getActive())
		{
			lease.setUserId(authenticatedUser.get_id());
			lease.setBtsUUID(getBtsUUID());
			checkAndRenewLease(lease);
			saveLease(lease);
			locked = true;
		}
		else 
		{
			if(lockIsOwnedByAuthUser(lease)) // authenticated user leases already
			{
				checkAndRenewLease(lease);
				saveLease(lease);
				locked = true;
			}
			else // locked by other
			{
				if (lockIsAlive(lease)) // locked by other and lock alive
				{
					locked = false;
				}
				else // lock not alive, renew lock and use
				{
					lease.setUserId(authenticatedUser.get_id());
					lease.setBtsUUID(getBtsUUID());
					checkAndRenewLease(lease);
					saveLease(lease);
					locked = true;
				}
			}
		}
		if (locked)
		{
			updateItemLockStatus(item, true);
		}
		else
		{
			StatusMessage m = BtsviewmodelFactory.eINSTANCE.createLockedMessage(lease, lease.getUserId());
			eventBroker.post("status_info/filtered", m);
		}
		return locked;
	}

	private String getBtsUUID() {
		if (btsUUID == null)
		{
			btsUUID = prefs.get(BTSConstants.BTS_UUID, null);
		}
		return btsUUID;
	}

	private BTSUser getUser(String userId) {
		BTSUser user = userDao.find(userId, "admin");
		return user;
	}

	private void checkAndRenewLease(DBLease lease) {
		if (!lease.getActive() || getCurrentTimeStamp().getTime() - renewal_dif > lease.getTimeStamp().getTime())
		{
			lease.setTimeStamp(getCurrentTimeStamp());
			lease.setActive(true);
			addLeaseToMap(lease);
			
			
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
		final DBLease lease = prepareLease(item);
		addLeaseToMap(lease);

		Job job = new Job("Locking " + item.get_id())
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

	protected DBLease prepareLease(BTSIdentifiableItem item) {
		DBLease lease = null;
//		try {
//			lease = dbLeaseDao.find(item.get_id(), NOTIFICATION);
//		} catch (Exception e) {
//		}
		if (lease == null)
		{
			lease = BtsmodelFactory.eINSTANCE.createDBLease();
		}
		
		lease.setObjectId(item.get_id());
		lease.setUserId(authenticatedUser.get_id());
		lease.setTimeStamp(getCurrentTimeStamp());
		lease.setActive(true);
		lease.setBtsUUID(getBtsUUID());
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
		Date local = Calendar.getInstance(TimeZone.getTimeZone("UTC")).getTime();
		Long difference = getSystemClockDifference(local);
		long system = local.getTime();
		Date now = new Date(system + difference);
		return now;
	}

	private Long getSystemClockDifference(Date local) {
		if (lastTimeCheck == null || local.after(new Date(lastTimeCheck.getTime() + TIME_CHECK_INFERVAL)))
		{
			systemClockDifferenceLong = null;
			systemClockDifference = null;
		}
		if (systemClockDifferenceLong == null)
		{
			if (systemClockDifference == null && !"".equals(systemClockDifference))
			{
				systemClockDifference = checkAndCalculateClockDifference();
			}
			try {
				systemClockDifferenceLong = new Long(systemClockDifference);
			} catch (NumberFormatException e) {
				systemClockDifferenceLong = null;
				e.printStackTrace();
			}
		}
		return systemClockDifferenceLong;
	}

	private String checkAndCalculateClockDifference() {
		long ntp = 0;
		String servers = ConfigurationScope.INSTANCE
				.getNode("org.bbaw.bts.app").get("ntp_servers",
						BTSConstants.DEFAULT_NTP_SERVERS);
		logger.info("NTP servers: " + servers);
		if (servers == null) {
			return new Long(ntp).toString();
		}
		String[] serverArray = servers.split(BTSCoreConstants.SPLIT_PATTERN);
		NTPUDPClient client = new NTPUDPClient();
		// We want to timeout if a response takes longer than 7 seconds
		client.setDefaultTimeout(7000);
		TimeInfo info = null;
		try {
			client.open();
			for (String arg : serverArray) {
				InetAddress hostAddr = null;
				try {
					hostAddr = InetAddress.getByName(arg);
					logger.info("> " + hostAddr.getHostName() + "/"
							+ hostAddr.getHostAddress());
					info = client.getTime(hostAddr);
					break;
				} catch (IOException ioe) {
					logger.error(ioe, "Inaccessable host address: " + hostAddr);
				}
			}
		} catch (SocketException e) {
			logger.error(e);
		}
		client.close();

		if (info == null)
		{
			return new Long(ntp).toString();
		}
        NtpV3Packet message = info.getMessage();

		 // Transmit time is time reply sent by server (t3)
        TimeStamp xmitNtpTime = message.getTransmitTimeStamp();
        logger.info(" Transmit Timestamp:\t" + xmitNtpTime + "  " + xmitNtpTime.toDateString());

        info.computeDetails(); // compute offset/delay if not already done
        Long offsetValue = info.getOffset();
        Long delayValue = info.getDelay();
        String delay = (delayValue == null) ? "N/A" : delayValue.toString();
        String offset = (offsetValue == null) ? "N/A" : offsetValue.toString();

        logger.info(" Roundtrip delay(ms)=" + delay
                + ", clock offset(ms)=" + offset); // offset in ms
        ntp = xmitNtpTime.getTime();
		logger.info("NTP: " + ntp);
		Date d = Calendar.getInstance(TimeZone.getTimeZone("UTC")).getTime();
		lastTimeCheck = d;
		long system = d.getTime();
		long diff = ntp - system;
		logger.info("Difference NTP - system: " + diff);

		return new Long(diff).toString();
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
		List<DBLease> leases = dbLeaseDao.list(NOTIFICATION, BTSConstants.OBJECT_STATE_ACTIVE);
		logger.info("fill locking map, locking map size: " + leases.size());
		for (DBLease lease : leases)
		{
			if (lockIsOwnedByAuthUser(lease))
			{
				// assuming that locking map is filed when user first tries to acquire the first lock
				// all existing locks by given user and bts-UUID are outdated
				logger.info("fill locking map, remove old lease: " + lease.get_id() + ", leased object id " + lease.getObjectId());
				removeLease(lease, null);
			}
			else if (checkAndProcessLeaseTTL(lease, null))
			{
				map.put(lease.getObjectId(), lease);
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
		else if(lockIsOwnedByAuthUser(lease)) // authenticated user leases already
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
		lockingMap.put(lease.getObjectId(), lease);
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
		
		
		if (lockIsOwnedByAuthUser(lease))
		{

			deactivateLease(lease, (BTSIdentifiableItem) object);
		}
//		removeLease(lease, (BTSIdentifiableItem) object);

	}

	private void deactivateLease(final DBLease lease, final BTSIdentifiableItem item) {
		Job job = new Job("Deactivate " + lease.get_id())
		{

			@Override
			protected IStatus run(IProgressMonitor monitor) {
				
				try {
					lease.setActive(false);


					dbLeaseDao.add(lease, NOTIFICATION);
					logger.info("deactivateLease, leased object id: " + lease.getObjectId());
//					findLockingMap().remove(lease.getObjectId());

					if (item != null)
					{
						// set object locked = false
						updateItemLockStatus(item, false);
					}
				

				} catch (Exception e) {
					logger.error(e);
					return Status.CANCEL_STATUS;
				}
				return Status.OK_STATUS;
			}
			
		};
		job.schedule();
		
		
		
	}

	private void removeLease(final DBLease lease, final BTSIdentifiableItem item) {
		Job job = new Job("Locking " + lease.getObjectId())
		{

			@Override
			protected IStatus run(IProgressMonitor monitor) {

				try {
					dbLeaseDao.removeDBLease(lease, NOTIFICATION);
					logger.info("remove lease, lease id " + lease.get_id() + ", leased object id: " + lease.getObjectId());
				} catch (Exception e) {
					logger.error(e);
					return Status.CANCEL_STATUS;
				}
//				try {
//					remoteDBLeaseDao.remove(lease, NOTIFICATION);
//				} catch (Exception e) {
//					logger.error(e);
//				}
				// remove lease from lease map
				final Map<String, DBLease> lockingMap = findLockingMap();
				lockingMap.remove(lease.getObjectId());
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
			if (notification.isDeleted() || !lease.getActive())
			{
				final Map<String, DBLease> lockingMap = findLockingMap();
				lockingMap.put(lease.getObjectId(), lease);
				if (item != null)
				{
					updateItemLockStatus(item, false);
					// if object == ACTIVE_Selection -> trigger permissionEvalService to recalculate mayEdit-Settings
					eventBroker.post("locking_status_update/unlocked", item);
				}
			}
			else
			{
				DBLease cached = findLockingMap().get(lease.getObjectId());
				if (!lease.getActive() && item != null)
				{
					updateItemLockStatus(item, false);
					// if object == ACTIVE_Selection -> trigger permissionEvalService to recalculate mayEdit-Settings
					eventBroker.post("locking_status_update/unlocked", item);
					// lease already exists
					if (cached != null)
					{
						if (cached != lease)
						{
							System.out.println("Different Lock objects");
							cached.setActive(false);
						}
						updateItemLockStatus(item, false);
						// if object == ACTIVE_Selection -> trigger permissionEvalService to recalculate mayEdit-Settings
						eventBroker.post("locking_status_update/unlocked", item);
					}
				}
				
				// lease already exists
				if (cached != null)
				{
					if (cached != lease)
					{
						System.out.println("Different Lock objects");
					}
					if (cached.getUserId() != null && cached.getUserId().equals(lease.getUserId()))
					{
						checkAndProcessLeaseTTL(lease, item);
						updateItemLockStatus(item, true);
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
					
				}
				addLeaseToMap(lease);
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

	@Override
	public boolean authenticatedUserHasLock(Object object) {
		if (object == null)
			return false;
		if (!(object instanceof BTSIdentifiableItem))
			return false;
		// get locking map
		Map<String, DBLease> lockingMap = findLockingMap();

		// look up in map if lock exists
		DBLease lease = lockingMap.get(((BTSIdentifiableItem) object).get_id());
		if (lease == null) // no lease
		{
			return false;

		} else {
			return lockIsOwnedByAuthUser(lease);
		}
	}

	private boolean lockIsOwnedByAuthUser(DBLease lease) {
		if (lease.getBtsUUID() != null && lease.getBtsUUID().equals(getBtsUUID())
				&& authenticatedUser.get_id().equals(lease.getUserId())) {
			return true;
		}
		return false;
	}

	@Override
	public boolean authenticatedUserIsDBAdmin(boolean remoteDBAdmin) {
		boolean localAdmin = dBManager.checkUserIsDBAdmin(authenticatedUser.getUserName(), authenticatedUser.getPassword());
		if (remoteDBAdmin)
		{
			boolean remoteAdmin = remoteDBManager.checkUserIsDBAdmin(authenticatedUser.getUserName(), authenticatedUser.getPassword());
			return (localAdmin && remoteAdmin);
		}
		return localAdmin;
	}

	@Override
	public boolean authenticatedUserMaySyncDBColl(String dbCollectionName) {
		if (authenticatedUserIsDBAdmin(true))
		{
			return true;
		}
		return dbCollectionExists(dbCollectionName, true);
	}

	private boolean dbCollectionExists(String dbCollectionName, boolean dbCollectionExistsRemote) {
		if (dbCollectionExistsRemote)
		{
			return remoteDBManager.dbCollectionExists(dbCollectionName);
		}
		return dBManager.dbCollectionExists(dbCollectionName);
	}

	@Override
	public String highestRoleOfUserInDBCollection(BTSUser user,
			BTSProjectDBCollection projectDBCollection) {
		String role = BTSCoreConstants.USER_ROLE_GUESTS;
		if (projectDBCollection == null)
		{
			return role;
		}
		int level = 0;
		for (BTSDBCollectionRoleDesc r : projectDBCollection.getRoleDescriptions()) {
			switch (r.getRoleName()) {
			case BTSCoreConstants.USER_ROLE_ADMINS: {
				if (userIsMember(user, r.getUserNames())) {
					return BTSCoreConstants.USER_ROLE_ADMINS;
				}
				break;
			}
			case BTSCoreConstants.USER_ROLE_EDITORS: {
				if (userIsMember(user, r.getUserNames())) {
					role = BTSCoreConstants.USER_ROLE_EDITORS;
					level = 4;
				}
				break;
			}
			case BTSCoreConstants.USER_ROLE_RESEARCHERS: {
				if (level < 3 && userIsMember(user, r.getUserNames())) {
					role = BTSCoreConstants.USER_ROLE_RESEARCHERS;
					level = 3;
				}
				break;
			}
			case BTSCoreConstants.USER_ROLE_TRANSCRIBERS: {
				if (level < 2 && userIsMember(user, r.getUserNames())) {
					role = BTSCoreConstants.USER_ROLE_TRANSCRIBERS;
					level = 2;
				}
				break;
			}

			}
		}
		return role;
	}

	
}
