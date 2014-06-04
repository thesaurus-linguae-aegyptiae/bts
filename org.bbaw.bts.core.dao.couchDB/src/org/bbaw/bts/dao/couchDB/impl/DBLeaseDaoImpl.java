package org.bbaw.bts.dao.couchDB.impl;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.http.client.methods.HttpHead;
import org.bbaw.bts.btsmodel.DBLease;
import org.bbaw.bts.btsmodel.impl.DBLeaseImpl;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.dao.DBLeaseDao;
import org.bbaw.bts.core.dao.util.DaoConstants;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipselabs.emfjson.couchdb.CouchDBHandler;
import org.eclipselabs.emfjson.internal.JSONLoad;
import org.eclipselabs.emfjson.resource.JsResourceFactoryImpl;
import org.lightcouch.CouchDbClient;
import org.lightcouch.NoDocumentException;
import org.lightcouch.Response;
import org.lightcouch.View;

public class DBLeaseDaoImpl extends CouchDBDao<DBLease, String> implements DBLeaseDao
{

	@Override
	public boolean removeDBLease(DBLease lease, String path)
	{
		CouchDbClient dbClient = connectionProvider.getDBClient(
				CouchDbClient.class, path);
		Response resp = null;
		if (lease.get_rev() != null)
		{
			try {
				resp = dbClient.remove(lease.get_id(), lease.get_rev());
			} catch (Exception e) {
				DBLease entity2 = reload(lease.get_id(), path);
				if (entity2 != null)
				{
					lease = entity2;
					resp = dbClient.remove(lease.get_id(), lease.get_rev());
				}
			}
		}
		String rev = null;
		if (resp != null)
		{
			rev = resp.getRev();
		}
		else
		{
			rev = lease.get_rev();
		}
		dbClient.purge(path, lease.get_id(), new String[]{rev});
		return true;
	}

	@Override
	public List<DBLease> list(String path, String objectState)
	{
		String viewId = DaoConstants.VIEW_ALL_DBLEASES;
		if (objectState != null
				&& objectState.equals(BTSConstants.OBJECT_STATE_ACTIVE)) {
			viewId = DaoConstants.VIEW_ALL_DBLEASES;
		} 
		List<String> allDocs = new ArrayList<String>(0);
		View view;
		CouchDbClient dbClient = connectionProvider.getDBClient(CouchDbClient.class, path);
		try
		{
			view = dbClient.view(viewId);
			allDocs = view.includeDocs(true).query();
		} catch (NoDocumentException e)
		{
			System.out.println("create view with id: " + viewId);
			createView(path, path, viewId);
			view = dbClient.view(viewId);
			allDocs = view.includeDocs(true).query();
		}

		ArrayList<DBLease> results = new ArrayList<DBLease>();
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("json", new JsResourceFactoryImpl());
		resourceSet.getURIConverter().getURIHandlers().add(0, new CouchDBHandler());
		for (String jo : allDocs)
		{
			System.out.println(jo);
			if (true)
			{
				URI uri = URI.createURI(getLocalDBURL() + "/" + path + "/" + extractIdFromObjectString(jo));
				Resource resource = resourceSet.getResource(uri, true);
				final JSONLoad loader = new JSONLoad(new ByteArrayInputStream(jo.getBytes()),
						new HashMap<Object, Object>());
				loader.fillResource(resource);
				results.add((DBLease) resource.getContents().get(0));
			}
		}
		return results;
	}

	@Override
	public DBLease add(DBLease entity, String path)
	{
		CouchDbClient dbClient = connectionProvider.getDBClient(
				CouchDbClient.class, DaoConstants.NOTIFICATION);
		DBLease found = null;
		try {
			found = dbClient.find(DBLeaseImpl.class, entity.get_id());
		} catch (Exception e) {
		}
		if (found != null)
		{
			entity.set_rev(found.get_rev());
		}
		boolean conflict = false;
		if (entity.get_rev() == null )
		{
			Response re = dbClient.save(entity);
			entity.set_rev(re.getRev());

			System.out.println(re);
			return entity;
		}
		else
		{
//			entity.set_rev(found.get_rev());
			Response re;
			try {
				re = dbClient.update(entity);
				entity.set_rev(re.getRev());
				System.out.println(re);

			} catch (Exception e) {
				conflict = true;
				System.out.println(entity);
				e.printStackTrace();
			}
		}
		if (conflict && found == null) // update conflict due to previous deleted version 
		{
			HttpHead head = new HttpHead(dbClient.getDBUri() + entity.get_id());

//			HttpResponse response = dbClient.executeRequest(head);
//
//			String revision = response.getFirstHeader("ETAG").getValue();
//
////			HttpClientUtils.closeQuietly(response); // closes the response
//			Params params = null;
//			found = dbClient.find(DBLeaseImpl.class, entity.get_id(), params);

		}
		return entity;

//		
//		Map<String, String> options = new HashMap<String, String>();
//		options.put(XMLResource.OPTION_ENCODING, BTSConstants.ENCODING); // set
//																			// encoding
//																			// to
//		// UTF-8
//		Resource resource = entity.eResource();
//		// check if entity has resource, that is if it was newly created or not
//		if (resource == null)
//		{
//			URI uri = URI.createURI(getLocalDBURL() + "/" + DaoConstants.NOTIFICATION + "/" + entity.get_id());
//			logger.info("Resource was null, object was newly created and is persisted for the first time: " + uri.path());
//			resource = connectionProvider.getEmfResourceSet().createResource(uri);
//			resource.getContents().add(entity);
//		}
//		else
//		{
//			CouchDbClient dbClient = connectionProvider.getDBClient(
//					CouchDbClient.class, DaoConstants.NOTIFICATION);
//			Response re = dbClient.save(entity);
//			System.out.println(re);
//			return entity;
//		}
//		while (resource.getContents().size() > 1)
//		{
//			resource.getContents().remove(1);
//		}
//
//		try
//		{
//			resource.save(options);
//		} catch (IOException e)
//		{
//			logger.error("error trying to save: " + entity, e);
////			throw new RuntimeException("Save Resource failed", e);
//		}
//		if (!resource.getContents().isEmpty())
//		{
//			return (DBLease) resource.getContents().remove(0);
//		}
//		return entity;
	}

}
