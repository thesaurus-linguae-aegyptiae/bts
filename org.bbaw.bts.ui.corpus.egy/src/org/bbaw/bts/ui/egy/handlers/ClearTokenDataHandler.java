 
 
package org.bbaw.bts.ui.egy.handlers;

import javax.inject.Named;

import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.ui.corpus.egy.commons.BTSEGYConstants;
import org.eclipse.e4.core.contexts.Active;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.services.internal.events.EventBroker;

public class ClearTokenDataHandler {
	@Execute
	public void execute(EventBroker eventBroker, @Active MPart activePart) {
		String eventID = BTSEGYConstants.EVENT_CLEAR_TOKEN_DATA;
		if (activePart.getElementId().equals("org.bbaw.bts.ui.corpus.egy.part.lemmatizer"))
		{
			eventID = BTSEGYConstants.EVENT_CLEAR_TOKEN_DATA + "/lemmatizer";
		}
		else if (activePart.getElementId().equals("org.bbaw.bts.ui.corpus.egy.part.hierotw"))
		{
			eventID = BTSEGYConstants.EVENT_CLEAR_TOKEN_DATA + "/hierotw";
		}
		eventBroker.post(eventID,
				eventID);
	}
		

	
	
	@CanExecute
	public boolean canExecute(
			@Optional @Named(BTSCoreConstants.CORE_EXPRESSION_MAY_EDIT) Boolean mayEdit,
			@Optional @Named(BTSCoreConstants.CORE_EXPRESSION_MAY_TRANSCRIBE) Boolean mayTranscribe) {
		if ((mayEdit != null && mayEdit.booleanValue()) || (mayTranscribe != null && mayTranscribe.booleanValue()))
		{
			return true;
		}
		return false;
	}	
		
}