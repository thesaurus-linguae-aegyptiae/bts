 
package org.bbaw.bts.ui.corpus.handlers;

import javax.inject.Named;

import org.bbaw.bts.btsmodel.AdministrativDataObject;
import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.controller.generalController.EditingDomainController;
import org.bbaw.bts.core.corpus.controller.generalController.CorpusCommandController;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.emf.ecore.EObject;

public class RestoreDeletedHandler {
	@Execute
	public void execute(
			@Optional @Named(IServiceConstants.ACTIVE_SELECTION) Object selection,
			EditingDomainController editingDomainController,
			CorpusCommandController commandController) {
		System.out.println("restore");
		if (selection instanceof EObject) {
			((AdministrativDataObject) selection)
					.setState(BTSConstants.OBJECT_STATE_ACTIVE);
			// General Command Controller... save!
			commandController.save((BTSDBBaseObject) selection);

		}
	}
		
}