package org.bbaw.bts.core.services.impl.services;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.BTSProject;
import org.bbaw.bts.btsmodel.BTSProjectDBCollection;
import org.bbaw.bts.btsmodel.BTSUser;
import org.bbaw.bts.btsmodel.DBLease;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.commons.Backend2ClientUpdateListener;
import org.bbaw.bts.core.dao.Backend2ClientUpdateDao;
import org.bbaw.bts.core.dao.GeneralPurposeDao;
import org.bbaw.bts.core.services.BTSEvaluationService;
import org.bbaw.bts.core.services.Backend2ClientUpdateService;
import org.bbaw.bts.searchModel.BTSModelUpdateNotification;
import org.eclipse.core.runtime.preferences.ConfigurationScope;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.services.log.Logger;
import org.eclipse.e4.ui.services.internal.events.EventBroker;

public class Backend2ClientUpdateServiceImpl implements Backend2ClientUpdateService, Backend2ClientUpdateListener
{

	@Inject
	private GeneralPurposeDao generalPurposeDao;
	@Inject
	private Backend2ClientUpdateDao updateDao;
	@Inject
	private EventBroker eventBroker;
	@Inject
	private IEclipseContext context;
	@Inject
	private BTSEvaluationService evaluationService;
	
	@Inject
	private Logger logger;
	
	private IEclipsePreferences prefs = ConfigurationScope.INSTANCE.getNode("org.bbaw.bts.app");

	private String btsUUID = prefs.get(BTSConstants.BTS_UUID, null);
	
	@Inject
	@Optional
	@Named(BTSCoreConstants.AUTHENTICATED_USER)
	private BTSUser authenticatedUser;

	@Override
	public void handleUpdate(BTSModelUpdateNotification notification)
	{

		logger.info("Notify Listener about change: " + ", Changed object id: " + notification.getObject());
		if (notification.getObject() instanceof DBLease)
		{
				DBLease lease = (DBLease) notification.getObject();
				if (!(lease.getBtsUUID() != null && lease.getBtsUUID().equals(btsUUID)
						&& authenticatedUser.get_id().equals(lease.getUserId()))) {
					eventBroker.post("lease_update/async", notification);
				}
			
		} else
		{
			// filter
			if (evaluationService.filter(notification.getObject()))
			{
				// check percolator and views to identifiy which last querys
				// might match
				if (notification.isLoaded())
				{
					if (notification.getQueryIds() != null)
					{
						List<String> queryIds = updateDao.fingQueryIds(notification.getObject(),
								((BTSDBBaseObject) notification.getObject()).get_id(), notification.getDbCollection());
						notification.setQueryIds(queryIds);
						logger.info("Notify Listener about change. size of found queryIds: " + queryIds.size());
					}

				}
//				if (notification.getObject() != null && notification.getObject() instanceof BTSObject)
//				{
//					logger.info("Notify eventBroker about change. Object name: " + ((BTSObject) notification.getObject()).getName());
//				}
//				else
//				{
//					logger.info("Notify eventBroker about change. Object null or not BTSObject: " + (notification.getObject()));
//
//				}

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
			updateDao.runAndListenToUpdates(generalPurposeDao, collection.getCollectionName());
		}

	}

	@Override
	public void startListening2Updates(BTSProjectDBCollection collection) {
		updateDao.runAndListenToUpdates(generalPurposeDao, collection.getCollectionName());
		
	}

}
