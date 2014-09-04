 
package org.bbaw.bts.ui.corpus.handlers;

import org.bbaw.bts.commons.BTSPluginIDs;
import org.bbaw.bts.core.corpus.controller.partController.LemmaNavigatorController;
import org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaEntry;
import org.eclipse.e4.core.contexts.Active;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.services.internal.events.EventBroker;

public class AddNewRootLemmaHandler {
	@Execute
	public void execute(@Active MPart part,
			LemmaNavigatorController lemmaController, EventBroker eventBroker) {
		BTSLemmaEntry entry = lemmaController.createNew();
		entry.setName("Lemma Root");
		eventBroker.post("model_lemma_new_root/asyncEvent", entry);
	}

	@CanExecute
	public boolean canExecute(@Active MPart part) {
		return part.getElementId().equals(BTSPluginIDs.PART_ID_LEMMA_NAVIGATOR);
	}
		
}