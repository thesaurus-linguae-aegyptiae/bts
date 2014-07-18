package org.bbaw.bts.core.remote.dao.couchDB.impl;

import java.util.List;

import org.bbaw.bts.btsmodel.BTSUser;
import org.bbaw.bts.core.remote.dao.RemoteBTSUserDao;
import org.bbaw.bts.core.remote.dao.util.RemoteDaoConstants;
import org.eclipse.e4.core.di.annotations.Creatable;

@Creatable
public class RemoteBTSUserDaoImpl extends RemoteCouchDBDao<BTSUser, String> implements RemoteBTSUserDao
{

	@Override
	public boolean removeBTSUser(BTSUser btsUser, String path)
	{
		// TODO Auto-generated method stub
		super.remove(btsUser, path);
		return true;
	}

	@Override
	public List<BTSUser> list(String path)
	{
		List<String> allDocs = loadDocsFromView(RemoteDaoConstants.VIEW_ALL_BTSUSERS, path, path);
		List<BTSUser> results = loadObjectsFromStrings(allDocs, path);
		if (!results.isEmpty())
		{
			registerQueryIdWithInternalRegistry(RemoteDaoConstants.VIEW_ALL_BTSUSERS, path);
		}
		return results;
//		List<JsonObject> allDocs = connectionProvider.getDBClient(CouchDbClient.class, path)
//				.view(RemoteDaoConstants.VIEW_ALL_BTSUSERS).includeDocs(true).query(JsonObject.class);
//		ArrayList<BTSUser> results = new ArrayList<BTSUser>();
//		ResourceSet resourceSet = new ResourceSetImpl();
//		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("json", new JsResourceFactoryImpl());
//		resourceSet.getURIConverter().getURIHandlers().add(0, new CouchDBHandler());
//		for (JsonObject jo : allDocs)
//		{
//			System.out.println(jo.get(RemoteDaoConstants.ID_STRING).getAsString());
//			if (!jo.get(RemoteDaoConstants.ID_STRING).getAsString().startsWith("_"))
//			{
//				URI uri = URI.createURI(getRemoteDBURL() + path + jo.get(RemoteDaoConstants.ID_STRING).getAsString());
//				Resource resource = resourceSet.getResource(uri, true);
//				final JSONLoad loader = new JSONLoad(new ByteArrayInputStream(jo.toString().getBytes()),
//						new HashMap<Object, Object>());
//				loader.fillResource(resource);
//				results.add((BTSUser) resource.getContents().get(0));
//			}
//		}
//		if (!results.isEmpty())
//		{
//			registerQueryIdWithInternalRegistry(RemoteDaoConstants.VIEW_ALL_BTSUSERS, path);
//		}
//		return results;
	}
}
