package org.bbaw.bts.core.services.impl.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.inject.Inject;

import org.bbaw.bts.btsviewmodel.StatusMessage;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.services.BTSStatusMessageService;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.EventTopic;

public class BTSStatusMessageServiceImpl implements BTSStatusMessageService {

	@Inject
	private IEclipseContext context;
	
	@Override
	public List<StatusMessage> listLastStatusMessages(int number) {
		return getMessageList();
	}

	@Inject
	@Optional
	void eventReceivedNew(@EventTopic("status_info/*") final StatusMessage object)
	{
		if (object != null && object instanceof StatusMessage)
		{
			 List<StatusMessage> messages = getMessageList();
			 if (!messages.contains(object))
			 {
				 messages.add(0, object);
				 checkListSize(messages);
			 }
		}
	}

	private void checkListSize(List<StatusMessage> messages) {
		if (messages != null && messages.size() > BTSCoreConstants.STATUS_MESSAGE_LIST_SIZE)
		{
			List<StatusMessage> toRemove = new ArrayList<StatusMessage>();
			for (int i = BTSCoreConstants.STATUS_MESSAGE_LIST_SIZE - 1; i < messages.size(); i++)
			{
				toRemove.add(messages.get(i));
			}
			messages.removeAll(toRemove);
		}
	}

	private List<StatusMessage> getMessageList() {
		Object o = context.get(BTSCoreConstants.STATUS_MESSAGE_LIST);
		if (o == null || !(o instanceof List<?>))
		{
			o = new Vector<StatusMessage>();
			context.set(BTSCoreConstants.STATUS_MESSAGE_LIST, o);
		}
		return (List<StatusMessage>) o;
	}
}
