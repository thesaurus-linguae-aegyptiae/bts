 
package org.bbaw.bts.ui.corpus.handlers;

import javax.inject.Named;

import org.bbaw.bts.btsmodel.AdministrativDataObject;
import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.btsmodel.BtsmodelPackage;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.controller.generalController.EditingDomainController;
import org.bbaw.bts.core.corpus.controller.generalController.CorpusCommandController;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

public class DeleteHandler {
	@Execute
	public void execute(
			@Optional @Named(IServiceConstants.ACTIVE_SELECTION) Object selection,
			EditingDomainController editingDomainController,
			CorpusCommandController commandController) {
		System.out.println("delete");
		if (selection instanceof EObject) {
			EditingDomain ed = editingDomainController.getEditingDomain((EObject)
										selection);
			if (false && ed != null) {
				Command command = SetCommand.create(ed, selection,
						BtsmodelPackage.ADMINISTRATIV_DATA_OBJECT__STATE,
						BTSConstants.OBJECT_STATE_TERMINATED);
				ed.getCommandStack().execute(command);

			}
			else {
				((AdministrativDataObject) selection)
						.setState(BTSConstants.OBJECT_STATE_TERMINATED);
			}
			//General Command Controller... save!
			commandController.save((BTSDBBaseObject) selection);
		}
	}
		
}