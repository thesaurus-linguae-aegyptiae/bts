package org.bbaw.bts.core.remote.dao.couchDB.impl;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.bbaw.bts.btsmodel.BTSIDReservationObject;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.remote.dao.RemoteBTSIDReservationObjectDao;
import org.lightcouch.CouchDbClient;
import org.lightcouch.NoDocumentException;
import org.lightcouch.View;

public class RemoteBTSIDReservationObjectDaoImpl extends RemoteCouchDBDao<BTSIDReservationObject, String> implements
		RemoteBTSIDReservationObjectDao {

	private static final Pattern VALUE_PATTERN = Pattern.compile("(\"value\":\")(\\d+)(\")");

	@Override
	public boolean save(String collectionName,
			List<BTSIDReservationObject> reserationObjects) {
		for (BTSIDReservationObject ro : reserationObjects)
		{
			add(ro, collectionName);
		}
		return true;
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
			allDocs = view.includeDocs(false).startKey(prefix + 0).reduce(true).query();
		} catch (NoDocumentException e)
		{
			e.printStackTrace();
			System.out.println("create view, view id: " + viewId);
			createView(collectionName, "/id_reservation/", viewId);
			view = dbClient.view(viewId);
			allDocs = view.includeDocs(false).startKey(prefix + 0).reduce(true).query();
			
		}
		System.out.println(allDocs);
		String result = allDocs.toString();
		Matcher m = VALUE_PATTERN.matcher(result);
		if (m.find())
		{
			return prefix+ m.group(2);
		}
		return null;
	}

}
