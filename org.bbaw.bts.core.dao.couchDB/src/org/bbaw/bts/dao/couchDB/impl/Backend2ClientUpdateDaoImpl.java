package org.bbaw.bts.dao.couchDB.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import javax.annotation.PreDestroy;
import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.core.commons.Backend2ClientUpdateListener;
import org.bbaw.bts.core.dao.Backend2ClientUpdateDao;
import org.bbaw.bts.core.dao.CorpusObjectDao;
import org.bbaw.bts.core.dao.DBConnectionProvider;
import org.bbaw.bts.core.dao.GeneralPurposeDao;
import org.bbaw.bts.core.dao.util.DaoConstants;
import org.bbaw.bts.modelUtils.EmfModelHelper;
import org.bbaw.bts.searchModel.BTSModelUpdateNotification;
import org.eclipse.core.runtime.Assert;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.elasticsearch.ElasticsearchException;
import org.elasticsearch.action.percolate.PercolateRequestBuilder;
import org.elasticsearch.action.percolate.PercolateResponse;
import org.elasticsearch.action.percolate.PercolateResponse.Match;
import org.elasticsearch.client.Client;
import org.lightcouch.Changes;
import org.lightcouch.ChangesResult;
import org.lightcouch.ChangesResult.Row;
import org.lightcouch.CouchDbClient;
import org.lightcouch.CouchDbInfo;

public class Backend2ClientUpdateDaoImpl implements Backend2ClientUpdateDao
{

	@Inject
	private DBConnectionProvider connectionProvider;

	@Inject
	private IEclipseContext context;
	@Inject
	private GeneralPurposeDao generalPurposeDao;
	private List<Backend2ClientUpdateListener> listeners = new Vector<Backend2ClientUpdateListener>(1);
	private String since;
	private HashMap<String, Changes> changesMap = new HashMap<String, Changes>();

	private void tryRunnable(final String dbCollection)
	{
		final CouchDbClient client = connectionProvider.getDBClient(CouchDbClient.class, dbCollection);
		CouchDbInfo dbInfo = client.context().info();
		since = dbInfo.getUpdateSeq();
		// feed type continuous
		Runnable runnable = new Runnable()
		{
			public void run()
			{
				Changes changes = client.changes().includeDocs(true).since(since)
						.heartBeat(DaoConstants.CHANGES_HEARTBEAT)

						.continuousChanges();
				changesMap.put(dbCollection, changes);
				while (changes.hasNext())
				{
					// System.out.println("check for changes");
					ChangesResult.Row feed = changes.next();

					if (feed != null)
					{
						String docId = feed.getId();
						try
						{
							signalUpdate(feed, docId, dbCollection);
						} catch (Exception e)
						{
							e.printStackTrace();
						}
					}
				}
			}
		};
		new Thread(runnable).start();

	}

	private void signalUpdate(Row feed, String docId, String dbCollection)
	{
		BTSDBBaseObject object = null;
		BTSModelUpdateNotification notification = new BTSModelUpdateNotification();
		notification.setDbCollection(dbCollection);
		if (feed.isDeleted())
		{
			notification.setDeleted(true);
			if (true || generalPurposeDao.objectIsLoaded(dbCollection, docId))
			{
				notification.setLoaded(true);
				try
				{
					object = generalPurposeDao.reload(docId, dbCollection);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		} else
		// object not deleted
		{
			notification.setLoaded(true);

			if (true || generalPurposeDao.objectIsLoaded(dbCollection, docId))
			{
				notification.setLoaded(true);
				try
				{
					object = generalPurposeDao.reload(docId, dbCollection);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			} 
			if (object == null)
			{
				object = generalPurposeDao.find(docId, dbCollection);
			}
		}
		Assert.isNotNull(object);
		if (object != null) // object either loaded and deleted or not deleted
							// and loaded or notloaded
		{
			notification.setObject(object);
			for (Backend2ClientUpdateListener l : listeners)
			{
				l.handleUpdate(notification);
			}
		}

	}

	@Override
	public void addUpdateListener(Backend2ClientUpdateListener listener)
	{
		if (!this.listeners.contains(listener))
		{
			this.listeners.add(listener);
		}

	}

	@Override
	public void runAndListenToUpdates(CorpusObjectDao corpusObjectDao, final String dbCollection)
	{
		final CouchDbClient client = connectionProvider.getDBClient(CouchDbClient.class, dbCollection);
		CouchDbInfo dbInfo = client.context().info();
		since = dbInfo.getUpdateSeq();
		// feed type continuous
		Runnable runnable = new Runnable()
		{
			public void run()
			{
				Changes changes = client.changes().includeDocs(true).since(since)
						.heartBeat(DaoConstants.CHANGES_HEARTBEAT)

						.continuousChanges();
				changesMap.put(dbCollection, changes);
				while (changes.hasNext())
				{
					// System.out.println("check for changes");
					ChangesResult.Row feed = changes.next();

					if (feed != null)
					{
						String docId = feed.getId();
						try
						{
							signalUpdate(feed, docId, dbCollection);
						} catch (Exception e)
						{
							e.printStackTrace();
						}
					}
				}
			}
		};
		new Thread(runnable).start();
	}

	@Override
	public void removeUpdateListener(Backend2ClientUpdateListener listener)
	{
		this.listeners.remove(listener);

	}

	@Override
	public void stopListening()
	{
		for (String key : changesMap.keySet())
		{
			changesMap.get(key).stop();
		}

	}

	@PreDestroy
	void unregisterListening()
	{
		for (String key : changesMap.keySet())
		{
			changesMap.get(key).stop();
		}

	}

	@Override
	public List<String> fingQueryIds(Object object, String id, String dbCollection)
	{
		Client client = connectionProvider.getSearchClient(Client.class);
		String objectAsString = EmfModelHelper.modelToString(object);
		objectAsString = "{\r\n" + "\"doc\":" + objectAsString + "\r\n}";

//		System.out.println("dbCollection " + dbCollection
//				+ " doc string percolate: " + objectAsString);
		PercolateResponse response = null;
		try
		{
			Match m = null;
			PercolateRequestBuilder rqb = client.preparePercolate().setIndices(dbCollection).setDocumentType(dbCollection);
			rqb.setSource(objectAsString);
			response = rqb.execute().actionGet();
		} catch (ElasticsearchException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<String> queryIds = new Vector<String>(1);
		if (response != null)
		{
			for (Match m : response.getMatches())
			{
			queryIds.add(m.getId().toString());
			}
		}
		Map<String, List<String>> map = (Map<String, List<String>>) context.get(DaoConstants.QUERY_ID_REGISTRY);
		List<String> ids = null;
		if (map != null)
		{
			if (map.containsKey(dbCollection))
			{
				queryIds.addAll(map.get(dbCollection));
			}
		}
		return queryIds;
	}
}
