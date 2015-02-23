package org.bbaw.bts.core.services.impl.services;

import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.Vector;

import javax.inject.Inject;
import javax.inject.Named;
import javax.xml.bind.DatatypeConverter;

import org.apache.commons.codec.binary.Base32;
import org.apache.commons.net.util.Base64;
import org.bbaw.bts.btsmodel.BTSIDReservationObject;
import org.bbaw.bts.btsmodel.BTSProjectDBCollection;
import org.bbaw.bts.btsmodel.BTSUser;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.btsviewmodel.BtsviewmodelFactory;
import org.bbaw.bts.btsviewmodel.StatusMessage;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.commons.exceptions.BTSRemoteDBException;
import org.bbaw.bts.core.dao.BTSIDReservationObjectDao;
import org.bbaw.bts.core.remote.dao.RemoteBTSIDReservationObjectDao;
import org.bbaw.bts.core.services.BTSProjectService;
import org.bbaw.bts.core.services.IDService;
import org.eclipse.core.runtime.preferences.ConfigurationScope;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.services.events.IEventBroker;

public class IDServiceImpl implements IDService
{

	private static final String PATTERN = "(\\w{8})(\\w{4})(\\w{4})(\\w{4})(\\w{12})";
	private static final String GROUPS = "$1-$2-$3-$4-$5";
	private IEclipseContext eclipseCtx;
	private static Calendar now;
	private IEclipsePreferences prefs = ConfigurationScope.INSTANCE.getNode("org.bbaw.bts.app");
	private String btsUUID = prefs.get(BTSConstants.BTS_UUID, null);
	
	private BTSProjectService projectService;
	
	@Inject
	private IEclipseContext context;
	
	@Inject
	private BTSIDReservationObjectDao idReservationDAO;
	
	@Inject
	private RemoteBTSIDReservationObjectDao remoteIDReservationDAO;
	
	@Inject
	@Optional
	@Named(BTSCoreConstants.AUTHENTICATED_USER)
	private BTSUser authenticatedUser;
	
	@Inject
	private IEventBroker eventBroker;
	
	@Inject
	public IDServiceImpl(IEclipseContext eclipseCtx)
	{
		this.eclipseCtx = eclipseCtx;
		eclipseCtx.set(IDServiceImpl.class, this);
	}

	public String createId(String dbCollection)
	{
		Map<String, BTSProjectDBCollection> map = loadProjectDBCollectionMap();
		BTSProjectDBCollection coll = null;
		if (map != null && map.containsKey(dbCollection))
		{
			if (map.get(dbCollection).getProperty(BTSConstants.DB_COLLECTION_PROP_RESERVE_ID) != null
					&& map.get(dbCollection).getProperty(BTSConstants.DB_COLLECTION_PROP_RESERVE_ID).equals("true"))
			{
				coll = map.get(dbCollection);
				
			}
		}
		String id = null;
		if (coll != null)
		{
			id = findReservedId(coll);
		}
		if (id != null)
		{
			return id;
		}
		now = Calendar.getInstance();
		id = new Long(now.getTimeInMillis()).toString();
		BTSUser user = (BTSUser) eclipseCtx.get("currentUser");
		if (user != null)
		{
			id += user.get_id().substring(5, 15);
		}
		if (btsUUID != null && btsUUID.length() > 10)
		{
			id += btsUUID.substring(5, 10);
		}
		while (id.length() < 32)
		{
			id += new Long(now.getTimeInMillis()).toString();
		}
		String uuid = id.substring(0, 32).replaceAll(                                            
			   PATTERN,                            
			    GROUPS);                                                      
		// creating UUID      
		UUID uid = UUID.fromString(uuid);
		id = uid.randomUUID().toString();
		id = id.replace("-", "");
		
		// encode Base32 to reduce size
		Base32 base32 = new Base32();
		byte[] array = DatatypeConverter.parseHexBinary(id);
	    id = base32.encodeToString(array);
	    id = id.replace("-", "Q");
	    id = id.replace("_", "W");
	    id = id.replace("=", "");
//		System.out.println(id);
		return id;
	}

	private String findReservedId(BTSProjectDBCollection coll) {
		
		if (authenticatedUser == null) return null;
		// auth user + BTS.uuid
		
		// idReservationDAO
		String prefix = "";
		if (coll.getProperty(BTSConstants.DB_COLLECTION_PROP_RESERVE_ID_PREFIX) != null)
		{
			prefix = coll.getProperty(BTSConstants.DB_COLLECTION_PROP_RESERVE_ID_PREFIX);
		}
		
		// max of reservedIds
		int max = BTSConstants.DB_COLLECTION_PROP_RESERVE_ID_MAX_DEFAULT;
		if (coll.getProperty(BTSConstants.DB_COLLECTION_PROP_RESERVE_ID_MAX) != null)
		{
			String m = coll.getProperty(BTSConstants.DB_COLLECTION_PROP_RESERVE_ID_MAX);
			try {
				max = new Integer(m);
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
		}
		
		// max of reservedIds
		int step = BTSConstants.DB_COLLECTION_PROP_RESERVE_ID_STEP_DEFAULT;
		if (coll.getProperty(BTSConstants.DB_COLLECTION_PROP_RESERVE_ID_STEP) != null)
		{
			String s = coll.getProperty(BTSConstants.DB_COLLECTION_PROP_RESERVE_ID_STEP);
			try {
				step = new Integer(s);
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
		}
		
		// force id reservation on central server
		boolean forceOnServer = BTSConstants.DB_COLLECTION_PROP_RESERVE_ID_FORCE_SERVER_DEFAULT;
		if (coll.getProperty(BTSConstants.DB_COLLECTION_PROP_RESERVE_ID_FORCE_SERVER) != null)
		{
			String s = coll.getProperty(BTSConstants.DB_COLLECTION_PROP_RESERVE_ID_FORCE_SERVER);
			try {
				forceOnServer = new Boolean(s);
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
		}
		
		String lastID = null;
		
		List<BTSIDReservationObject> reserationObjects = null;
		try {
			reserationObjects = idReservationDAO.listIDReservationObjects(coll.getCollectionName(), btsUUID, prefix);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		BTSIDReservationObject topReservation = null;
		if (reserationObjects != null && !reserationObjects.isEmpty())
		{
			// sort
			sortReservationObjects(reserationObjects, prefix);
			topReservation = getTopReservationObject(reserationObjects, prefix);
			lastID = calculateLastReservationObject(reserationObjects, prefix);
		}
		else
		{
			lastID = findLastIDInternal(coll.getCollectionName(), prefix, forceOnServer);
			if (lastID == null)
			{
				return null;
			}
			reserationObjects = makeReservationObjects(btsUUID, authenticatedUser.getUserName(), coll.getCollectionName(), prefix, step, max, lastID);
			if (saveIDReservationObjects(coll.getCollectionName(), reserationObjects, forceOnServer))
			{
				// sort
				sortReservationObjects(reserationObjects, prefix);
				topReservation = getTopReservationObject(reserationObjects, prefix);
				lastID = calculateLastReservationObject(reserationObjects, prefix);
			}
			else
			{
				return null; // not
			}
		}
		
		// check minimum of reservedIds
		int min = BTSConstants.DB_COLLECTION_PROP_RESERVE_ID_MIN_DEFAULT;
		if (coll.getProperty(BTSConstants.DB_COLLECTION_PROP_RESERVE_ID_MIN) != null)
		{
			String m = coll.getProperty(BTSConstants.DB_COLLECTION_PROP_RESERVE_ID_MIN);
			try {
				min = new Integer(m);
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
		}
		
		if (reserationObjects.size() <= min) //lg or equals because topreservationObjects has to be deduced form reservationObjects
		{
			reserationObjects = makeReservationObjects(btsUUID, authenticatedUser.getUserName(), coll.getCollectionName(), prefix, step, max - reserationObjects.size(), lastID);
			if (saveIDReservationObjects(coll.getCollectionName(), reserationObjects, forceOnServer))
			{
				// ok;
			}
		}

		
		// if reserve fails || reservedIds == 0 --> return null
		// (if reservedIds > 0) --> resturn reserved[0]
		
		if (topReservation != null) return topReservation.get_id();
		return null;
	}
	

	private boolean saveIDReservationObjects(String collectionName,
			List<BTSIDReservationObject> reserationObjects, boolean forceOnServer) {
		if (!forceOnServer)
		{
			return idReservationDAO.save(collectionName, reserationObjects);
		}
		else // force on server
		{
			try {
				return remoteIDReservationDAO.save(collectionName, reserationObjects);
			}catch (BTSRemoteDBException e) {
				e.printStackTrace();
				StatusMessage m = BtsviewmodelFactory.eINSTANCE.createRemoteDBConnnectionFailedMessage();
				eventBroker.post("status_info/error", m);
				return false;
			} 
			catch (Exception e) {
				StatusMessage m = BtsviewmodelFactory.eINSTANCE.createRemoteDBConnnectionFailedMessage();
				eventBroker.post("status_info/error", m);
				e.printStackTrace();
				return false;
			}
		}
	}

	private String findLastIDInternal(String collectionName, String prefix, boolean forceOnServer) {
		if (!forceOnServer)
		{
			return idReservationDAO.findLastID(collectionName, prefix);
		}
		else // force on server
		{
			try {
				return remoteIDReservationDAO.findLastID(collectionName, prefix);
			} catch (BTSRemoteDBException e) {
				e.printStackTrace();
				StatusMessage m = BtsviewmodelFactory.eINSTANCE.createRemoteDBConnnectionFailedMessage();
				eventBroker.post("status_info/error", m);
			} catch (Exception e) {
				e.printStackTrace();
				StatusMessage m = BtsviewmodelFactory.eINSTANCE.createRemoteDBConnnectionFailedMessage();
				eventBroker.post("status_info/error", m);
			}
			return null;
		}
	}

	private String calculateLastReservationObject(
			List<BTSIDReservationObject> reserationObjects, String prefix) {
		return reserationObjects.get(reserationObjects.size() - 1).get_id();
	}

	private List<BTSIDReservationObject> makeReservationObjects(
			String btsUUID2, String userName, String dbCollectionName, String prefix, int step, int amount,
			String lastID) {
		List<BTSIDReservationObject> result = new Vector<BTSIDReservationObject>(amount);
		for (int i = 0; i < amount; i++)
		{
			BTSIDReservationObject ro = BtsmodelFactory.eINSTANCE.createBTSIDReservationObject();
			ro.setBtsUUID(btsUUID2);
			ro.setDBCollectionKey(dbCollectionName);
			ro.getUpdaters().add(userName);
			lastID = buildId(lastID, prefix, step);
			ro.set_id(lastID);
			result.add(ro);
		}
		return result;
	}

	private String buildId(String lastID, String prefix, int step) {
		String suffix = lastID.substring(prefix.length(), lastID.length());
		int lastIDSuffix = new Integer(suffix);
		int newIDSuffix = lastIDSuffix + step;
		String newID = new String(prefix + new Integer(newIDSuffix).toString());
		return newID;
	}

	private BTSIDReservationObject getTopReservationObject(
			List<BTSIDReservationObject> reserationObjects, String prefix) {
		return reserationObjects.get(0);
	}

	private void sortReservationObjects(
			List<BTSIDReservationObject> reserationObjects, String prefix) {
		Collections.sort(reserationObjects, new BTSIDReservationObjectsComparator(prefix));
		
	}

	private Map<String, BTSProjectDBCollection> loadProjectDBCollectionMap() {
		if (projectService == null)
		{
			projectService = context.get(BTSProjectService.class);
		}
		return projectService.loadProjectDBCollectionMap();
	}
}
