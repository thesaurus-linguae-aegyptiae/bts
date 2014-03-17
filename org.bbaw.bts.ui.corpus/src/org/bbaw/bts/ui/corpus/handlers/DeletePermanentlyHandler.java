 
package org.bbaw.bts.ui.corpus.handlers;

import javax.inject.Named;

import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.core.corpus.controller.generalController.CorpusCommandController;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.services.IServiceConstants;

public class DeletePermanentlyHandler {
	@Execute
	public void execute(
			@Optional @Named(IServiceConstants.ACTIVE_SELECTION) Object selection,
			CorpusCommandController commandController) {
		if (selection instanceof BTSDBBaseObject) {
			commandController.deleteFromDB((BTSDBBaseObject) selection);
		}
	}
		
}