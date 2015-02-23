package org.bbaw.bts.core.dao;

import java.util.List;

import org.bbaw.bts.btsmodel.BTSIDReservationObject;

public interface BTSIDReservationObjectDao {

	List<BTSIDReservationObject> listIDReservationObjects(
			String collectionName, String btsUUID, String prefix);

	boolean save(String collectionName,
			List<BTSIDReservationObject> reserationObjects);

	String findLastID(String collectionName, String prefix);


}
