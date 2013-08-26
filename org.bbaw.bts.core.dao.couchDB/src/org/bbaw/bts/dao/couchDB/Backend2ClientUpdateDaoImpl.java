package org.bbaw.bts.dao.couchDB;

import java.util.List;
import java.util.Vector;

import javax.annotation.PreDestroy;

import org.bbaw.bts.btsmodel.BTSCorpusObject;
import org.bbaw.bts.core.commons.Backend2ClientUpdateListener;
import org.bbaw.bts.core.dao.Backend2ClientUpdateDao;
import org.bbaw.bts.core.dao.CorpusObjectDao;
import org.bbaw.bts.dao.couchDB.util.CouchDBConstants;
import org.lightcouch.Changes;
import org.lightcouch.ChangesResult;
import org.lightcouch.ChangesResult.Row;
import org.lightcouch.CouchDbInfo;

public class Backend2ClientUpdateDaoImpl implements Backend2ClientUpdateDao
{

	private CorpusObjectDaoImpl corpusObjectDao;

	private List<Backend2ClientUpdateListener> listeners = new Vector<Backend2ClientUpdateListener>(1);
	private String since;
	private Changes changes;

	private Runnable runnable;

	// public Backend2ClientUpdateDaoImpl()
	// {
	// System.out
	// .println("construct Backend2ClientUpdateDaoImpl ######################################################################");
	// }

	private void tryRunnable()
	{
		CouchDbInfo dbInfo = corpusObjectDao.dbClient.context().info();
		since = dbInfo.getUpdateSeq();
		// feed type continuous
		runnable = new Runnable()
		{
			public void run()
			{
				changes = corpusObjectDao.dbClient.changes().includeDocs(true).since(since)
						.heartBeat(CouchDBConstants.CHANGES_HEARTBEAT)

						.continuousChanges();
				while (changes.hasNext())
				{
					System.out.println("check for changes");
					ChangesResult.Row feed = changes.next();

					if (feed != null)
					{
						String docId = feed.getId();
						signalUpdate(feed, docId);
						System.out.println("found change");
					}

				}
			}

		};
		new Thread(runnable).start();

		System.out.println("schedule UIJob");
	}

	private void signalUpdate(Row feed, String docId)
	{
		System.out.println(feed);
		BTSCorpusObject object = null;
		try
		{
			object = corpusObjectDao.reload(docId);
		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (Backend2ClientUpdateListener l : listeners)
		{
			l.handleUpdate(object, docId);
		}

	}

	@Override
	public void addUpdateListener(Backend2ClientUpdateListener listener)
	{
		this.listeners.add(listener);

	}

	@Override
	public void runAndListenToUpdates(CorpusObjectDao corpusObjectDao)
	{
		this.corpusObjectDao = (CorpusObjectDaoImpl) corpusObjectDao;
		tryRunnable();

	}

	@Override
	public void removeUpdateListener(Backend2ClientUpdateListener listener)
	{
		this.listeners.remove(listener);

	}

	@Override
	public void stopListening()
	{
		changes.stop();
		try
		{
			runnable.wait();
		} catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@PreDestroy
	void unregisterListening()
	{
		changes.stop();
	}

	// public synchronized void setCorpusObjectDao(CorpusObjectDao
	// corpusObjectDao)
	// {
	// System.out.println("corpusObjectDao was set. Thank you DS!");
	// this.corpusObjectDao = (CorpusObjectDaoImpl) corpusObjectDao;
	// // I know I should not use the service here but just for demonstration
	// System.out.println(corpusObjectDao);
	// }
	//
	// // Method will be used by DS to unset the quote service
	// public synchronized void unsetCorpusObjectDao(CorpusObjectDao
	// corpusObjectDao)
	// {
	// System.out.println("corpusObjectDao was unset. Why did you do this to me?");
	// if (this.corpusObjectDao == corpusObjectDao)
	// {
	// this.corpusObjectDao = null;
	// }
	// }
}
