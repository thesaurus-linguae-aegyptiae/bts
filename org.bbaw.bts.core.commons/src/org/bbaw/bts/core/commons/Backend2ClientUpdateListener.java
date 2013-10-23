package org.bbaw.bts.core.commons;

import org.bbaw.bts.searchModel.BTSModelUpdateNotification;

public interface Backend2ClientUpdateListener
{

	void handleUpdate(BTSModelUpdateNotification notification);
}
