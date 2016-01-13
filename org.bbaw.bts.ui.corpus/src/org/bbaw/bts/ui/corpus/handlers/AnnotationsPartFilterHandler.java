 
package org.bbaw.bts.ui.corpus.handlers;

import javax.inject.Named;

import org.bbaw.bts.ui.commons.utils.BTSUIConstants;
import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.State;
import org.eclipse.e4.core.commands.ECommandService;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.model.application.commands.MCommand;
import org.eclipse.e4.ui.model.application.commands.MCommandParameter;
import org.eclipse.e4.ui.model.application.ui.menu.MHandledItem;
import org.eclipse.e4.ui.services.internal.events.EventBroker;
import org.eclipse.e4.ui.workbench.modeling.EModelService;

public class AnnotationsPartFilterHandler {
	@Execute
	public void execute(@Optional @Named("annotationsPartFilterParam") String param,
			EventBroker eventBroker,
			MHandledItem menuItem, EModelService serv) {
		MCommand command = menuItem.getCommand();
		System.out.println("menu item: "+menuItem.getElementId());
		System.out.println("command: "+command.getElementId());
		if (command != null)
			if ("org.bbaw.bts.ui.corpus.command.annotationsPart.paramFilter".equals(command.getElementId())) {
				System.out.println("Post toggle filter event");
				//for (String state : filterCommand.getStateIds())
				//	System.out.println("command state: "+state+" = "+filterCommand.getState(state));
				eventBroker.post(BTSUIConstants.EVENT_TEXT_RELATING_OBJECTS_TOGGLE_FILTER, param);
			}
		//Command filterCommand = commandService.getCommand("...");
		//State filterState = filterCommand.getState(param);
		// toggle
		//filterState.setValue(!(Boolean)filterState.getValue());
		
	}
		
}