package org.bbaw.bts.dao.couchDB.impl;

import java.util.List;

import org.bbaw.bts.btsmodel.BTSUserGroup;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.dao.BTSUserGroupDao;
import org.bbaw.bts.core.dao.util.DaoConstants;
import org.bbaw.bts.dao.couchDB.CouchDBDao;
import org.eclipse.e4.core.di.annotations.Creatable;

@Creatable
public class BTSUserGroupDaoImpl extends CouchDBDao<BTSUserGroup, String> implements BTSUserGroupDao
{

	@Override
	public boolean removeBTSUserGroup(BTSUserGroup userGroup, String path)
	{
		// TODO Auto-generated method stub
		super.remove(userGroup, path);
		return true;
	}

	@Override
	public List<BTSUserGroup> list(String path, String objectState)
	{
		String viewId = BTSConstants.VIEW_ALL_BTSUSERGROUPS;
		if (objectState != null
				&& objectState.equals(BTSConstants.OBJECT_STATE_ACTIVE)) {
			viewId = BTSConstants.VIEW_ALL_ACTIVE_BTSUSERGROUPS;
		} else if (objectState != null
				&& objectState.equals(BTSConstants.OBJECT_STATE_TERMINATED)) {
			viewId = BTSConstants.VIEW_ALL_TERMINATED_BTSUSERGROUPS;
		}
		List<String> allDocs = loadDocsFromView(viewId, path, path);
		List<BTSUserGroup> results = loadObjectsFromStrings(allDocs, path);
		if (!results.isEmpty())
		{
			registerQueryIdWithInternalRegistry(viewId, path);
		}
		return results;
//		List<String> allDocs = new ArrayList<String>();
//		View view;
//		CouchDbClient dbClient = connectionProvider.getDBClient(CouchDbClient.class, path);
//		try
//		{
//
//			view = dbClient.view(viewId);
//			allDocs = view.includeDocs(true).query();
//		} catch (NoDocumentException e)
//		{
//			e.printStackTrace();
//			createView(path, path, viewId);
//			view = dbClient.view(viewId);
//			allDocs = view.includeDocs(true).query();
//		}
//		ArrayList<BTSUserGroup> results = new ArrayList<BTSUserGroup>();
//		ResourceSet resourceSet = new ResourceSetImpl();
//		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("json", new JsResourceFactoryImpl());
//		resourceSet.getURIConverter().getURIHandlers().add(0, new CouchDBHandler());
//		for (String jo : allDocs)
//		{
//			URI uri = URI.createURI(getLocalDBURL() + "/" + path + "/" + extractIdFromObjectString(jo));
//			Resource resource = resourceSet.getResource(uri, true);
//			final JSONLoad loader = new JSONLoad(new ByteArrayInputStream(jo.getBytes()), new HashMap<Object, Object>());
//			loader.fillResource(resource);
//			results.add((BTSUserGroup) resource.getContents().get(0));
//		}
//		if (!results.isEmpty())
//		{
//			registerQueryIdWithInternalRegistry(viewId, path);
//		}
//		return results;
	}
}
