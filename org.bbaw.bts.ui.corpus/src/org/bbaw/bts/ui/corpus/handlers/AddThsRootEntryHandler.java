 
package org.bbaw.bts.ui.corpus.handlers;

import org.bbaw.bts.commons.BTSPluginIDs;
import org.bbaw.bts.core.corpus.controller.partController.ThsNavigatorController;
import org.bbaw.bts.corpus.btsCorpusModel.BTSThsEntry;
import org.eclipse.e4.core.contexts.Active;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.services.internal.events.EventBroker;

public class AddThsRootEntryHandler {
	@Execute
	public void execute(@Active MPart part,
			ThsNavigatorController thsController, EventBroker eventBroker) {
		BTSThsEntry entry = thsController.createNew();
		entry.setName("Thesaurus Root");
		eventBroker.post("model_ths_new_root/asyncEvent", entry);
	}

	@CanExecute
	public boolean canExecute(@Active MPart part) {
		return part.getElementId().equals(BTSPluginIDs.PART_ID_THS_NAVIGATOR);
	}
		
}