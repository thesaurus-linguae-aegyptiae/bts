 
package org.bbaw.bts.ui.egy.handlers;

import javax.inject.Named;

import org.bbaw.bts.ui.commons.utils.BTSUIConstants;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.services.internal.events.EventBroker;

public class HTWShortcutHandler {
	@Execute
	public void execute(
			@Named("org.bbaw.bts.ui.corpus.egy.commandparameter.htw.shortcut") String param,
			EventBroker eventBroker) {
		System.out.println("htw param " + param);
		eventBroker.post(BTSUIConstants.EVENT_HTW_SHORTCUT, param);
	}
		
}