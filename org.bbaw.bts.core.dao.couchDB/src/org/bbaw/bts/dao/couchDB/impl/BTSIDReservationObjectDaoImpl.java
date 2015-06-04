package org.bbaw.bts.dao.couchDB.impl;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.bbaw.bts.btsmodel.BTSIDReservationObject;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.dao.BTSIDReservationObjectDao;
import org.bbaw.bts.dao.couchDB.CouchDBDao;
import org.lightcouch.CouchDbClient;
import org.lightcouch.NoDocumentException;
import org.lightcouch.View;

public class BTSIDReservationObjectDaoImpl extends CouchDBDao<BTSIDReservationObject, String> implements BTSIDReservationObjectDao {

	
	private static final Pattern VALUE_PATTERN = Pattern.compile("(\"value\":\")(\\d+)(\")");
	@Override
	public List<BTSIDReservationObject> listIDReservationObjects(
			String path, String btsUUID, String prefix) {
		String viewId = BTSConstants.VIEW_ID_RESERVATION_OBJECTS;
		
		List<String> allDocs = loadDocsFromView(viewId, path, "id_reservation", btsUUID, btsUUID);
		List<BTSIDReservationObject> results = loadObjectsFromStrings(allDocs, path);
		
		// filter oder mit params im view!
		return results;
	}

	

	@Override
	public boolean save(String collectionName,
			List<BTSIDReservationObject> reserationObjects) {
		Set<BTSIDReservationObject> objects = new HashSet<BTSIDReservationObject>(reserationObjects.size());
		objects.addAll(reserationObjects);
		return addMultiple(objects, collectionName);
	}

	@Override
	public String findLastID(String collectionName, String prefix) {
		String viewId = BTSConstants.VIEW_ID_LAST_ID;
		View view;

		CouchDbClient dbClient = connectionProvider.getDBClient(CouchDbClient.class, collectionName);
		List<String> allDocs;
		try
		{
			view = dbClient.view(viewId);
			allDocs = view.includeDocs(false).startKey(prefix + 0).reduce(false).query();
		} catch (NoDocumentException e)
		{
			System.out.println("create view, view id: " + viewId);
			createView(collectionName, "id_reservation", viewId);
			view = dbClient.view(viewId);
			allDocs = view.includeDocs(false).startKey(prefix + 0).reduce(false).query();
			
		}
		List<Integer> ids = new Vector<Integer>(allDocs.size());
		for (String doc : allDocs)
		{
			Matcher m = VALUE_PATTERN.matcher(doc);
			if (m.find())
			{
				try {
					Integer i = new Integer(m.group(2));
					ids.add(i);
				} catch (NumberFormatException e) {
				}
			}
		}
		Collections.sort(ids);
		
		String lastID = prefix+ ids.get(ids.size() -1);
		System.out.println("last Id: " + lastID);

		
		return lastID;
	}

}
