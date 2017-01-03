 
package org.fuberlin.bts.ui.corpus.egy.annotations.handlers;

import javax.inject.Named;

import org.bbaw.bts.ui.commons.utils.BTSUIConstants;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.model.application.commands.MCommand;
import org.eclipse.e4.ui.model.application.ui.menu.MHandledItem;
import org.eclipse.e4.ui.services.internal.events.EventBroker;

@SuppressWarnings("restriction")
public class AnnotationsPartFilterHandler {
	@Execute
	public void execute(@Optional @Named("annotationsPartFilterParam") String param,
			EventBroker eventBroker,
			MHandledItem menuItem) {
		MCommand command = menuItem.getCommand();
		if (command != null)
			if ("org.fuberlin.bts.ui.corpus.command.annotationsPart.paramFilter".equals(command.getElementId()))
				eventBroker.post(BTSUIConstants.EVENT_TEXT_RELATING_OBJECTS_TOGGLE_FILTER, param);
	}
		
}