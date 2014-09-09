 
package org.bbaw.bts.ui.corpus.handlers;

import javax.inject.Named;

import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.services.internal.events.EventBroker;

public class RefreshViewerNodeHandler {
	@Execute
	public void execute(EventBroker eventBroker, @Named(IServiceConstants.ACTIVE_SELECTION) @Optional BTSCorpusObject selection) {
		eventBroker.post("view_refresh/children", selection);
	}
	
	
	@CanExecute
	public boolean canExecute() {
		
		return true;
	}
		
}