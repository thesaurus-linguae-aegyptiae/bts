package org.bbaw.bts.core.services.impl.services;

import javax.inject.Inject;

import org.bbaw.bts.core.commons.Backend2ClientUpdateListener;
import org.bbaw.bts.core.dao.Backend2ClientUpdateDao;
import org.bbaw.bts.core.dao.CorpusObjectDao;
import org.bbaw.bts.core.services.Backend2ClientUpdateService;
import org.eclipse.e4.ui.services.internal.events.EventBroker;

public class Backend2ClientUpdateServiceImpl implements Backend2ClientUpdateService, Backend2ClientUpdateListener
{

	@Inject
	private CorpusObjectDao corpusObjectDao;
	@Inject
	private Backend2ClientUpdateDao updateDao;
	@Inject
	private EventBroker eventBroker;

	@Override
	public void startService()
	{
		updateDao.addUpdateListener(this);
		updateDao.runAndListenToUpdates(corpusObjectDao);

	}

	@Override
	public void handleUpdate(Object object, String id)
	{
		System.out.println(object);
		eventBroker.send("model_update/syncEvent", object);
	}

}
