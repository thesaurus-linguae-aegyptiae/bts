package org.bbaw.bts.core.services.impl.services;

import java.util.List;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.btsmodel.BTSProject;
import org.bbaw.bts.btsmodel.BTSProjectDBCollection;
import org.bbaw.bts.btsmodel.DBLease;
import org.bbaw.bts.core.commons.Backend2ClientUpdateListener;
import org.bbaw.bts.core.dao.Backend2ClientUpdateDao;
import org.bbaw.bts.core.dao.CorpusObjectDao;
import org.bbaw.bts.core.services.BTSEvaluationService;
import org.bbaw.bts.core.services.Backend2ClientUpdateService;
import org.bbaw.bts.searchModel.BTSModelUpdateNotification;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.services.internal.events.EventBroker;

public class Backend2ClientUpdateServiceImpl implements Backend2ClientUpdateService, Backend2ClientUpdateListener
{

	@Inject
	private CorpusObjectDao corpusObjectDao;
	@Inject
	private Backend2ClientUpdateDao updateDao;
	@Inject
	private EventBroker eventBroker;
	@Inject
	private IEclipseContext context;
	@Inject
	private BTSEvaluationService evaluationService;

	@Override
	public void handleUpdate(BTSModelUpdateNotification notification)
	{

		System.out.println(notification.getObject());
		if (notification.getObject() instanceof DBLease)
		{
			eventBroker.post("lease_update/async", notification);
		} else
		{
			// filter
			if (evaluationService.filter(notification.getObject()))
			{
				// check percolator and views to identifiy which last querys
				// might match
				if (notification.isLoaded())
				{
					List<String> queryIds = updateDao.fingQueryIds(notification.getObject(),
							((BTSDBBaseObject) notification.getObject()).get_id(), notification.getDbCollection());
					notification.setQueryIds(queryIds);
				}
				eventBroker.post("model_update/async", notification);

			}
		}

	}

	@Override
	public void startListening2Updates(BTSProject project)
	{
		updateDao.addUpdateListener(this);
		for (BTSProjectDBCollection collection : project.getDbCollections())
		{
			if (collection.isSynchronized())
			{
				updateDao.runAndListenToUpdates(corpusObjectDao, collection.getCollectionName());
			}
		}

	}

}
