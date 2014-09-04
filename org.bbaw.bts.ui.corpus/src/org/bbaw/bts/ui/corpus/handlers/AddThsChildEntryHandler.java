 
package org.bbaw.bts.ui.corpus.handlers;

import javax.inject.Named;

import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.commons.BTSPluginIDs;
import org.bbaw.bts.core.corpus.controller.partController.ThsNavigatorController;
import org.bbaw.bts.corpus.btsCorpusModel.BTSThsEntry;
import org.eclipse.e4.core.contexts.Active;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.services.internal.events.EventBroker;

public class AddThsChildEntryHandler {
	@Execute
	public void execute(@Active MPart part,
			ThsNavigatorController thsController, EventBroker eventBroker) {
		BTSThsEntry entry = thsController.createNew();
		entry.setName("Thesaurus Child");
		eventBroker.post("model_ths_add/asyncEvent", entry);
		thsController.getRootEntries(null, null, null, null);
	}

	@CanExecute
	public boolean canExecute(
			@Active MPart part,
			@Named(IServiceConstants.ACTIVE_SELECTION) @Optional BTSObject selection) {
		if (selection != null && selection instanceof BTSThsEntry) {
			return part.getElementId().equals(
					BTSPluginIDs.PART_ID_THS_NAVIGATOR);
		}
		return false;
	}
		
}