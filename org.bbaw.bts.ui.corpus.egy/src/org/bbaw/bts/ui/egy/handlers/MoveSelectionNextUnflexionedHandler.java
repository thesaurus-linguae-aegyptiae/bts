 
package org.bbaw.bts.ui.egy.handlers;

import org.bbaw.bts.ui.commons.utils.BTSUIConstants;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.services.internal.events.EventBroker;

public class MoveSelectionNextUnflexionedHandler {
	@Execute
	public void execute(EventBroker eventBroker) {
		eventBroker.post(BTSUIConstants.EVENT_TEXT_SELECTION_NEXT_UNFLEXIONED,
				BTSUIConstants.EVENT_TEXT_SELECTION_NEXT_UNFLEXIONED);
	}
		
}