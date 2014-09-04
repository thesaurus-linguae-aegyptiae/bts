 
package org.bbaw.bts.ui.corpus.handlers;

import javax.inject.Named;

import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.commons.BTSPluginIDs;
import org.bbaw.bts.core.corpus.controller.partController.LemmaNavigatorController;
import org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaEntry;
import org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaSubentry;
import org.eclipse.e4.core.contexts.Active;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.services.internal.events.EventBroker;

public class AddNewLemmaSubEntryHandler {
	@Execute
	public void execute(@Active MPart part,
			LemmaNavigatorController lemmaController, EventBroker eventBroker) {
		BTSLemmaEntry entry = lemmaController.createNew();
		entry.setName("Lemma Subentry");
		eventBroker.post("model_lemma_add/asyncEvent", entry);
	}

	@CanExecute
	public boolean canExecute(
			@Active MPart part,
			@Named(IServiceConstants.ACTIVE_SELECTION) @Optional BTSObject selection) {
		if (selection != null && selection instanceof BTSLemmaEntry) {
			return part.getElementId().equals(
					BTSPluginIDs.PART_ID_LEMMA_NAVIGATOR);
		}
		return false;
	}
		
}