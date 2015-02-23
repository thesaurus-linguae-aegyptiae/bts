package org.bbaw.bts.core.remote.dao;

import java.util.List;

import org.bbaw.bts.btsmodel.BTSIDReservationObject;

public interface RemoteBTSIDReservationObjectDao {

	boolean save(String collectionName,
			List<BTSIDReservationObject> reserationObjects);

	String findLastID(String collectionName, String prefix);

}
