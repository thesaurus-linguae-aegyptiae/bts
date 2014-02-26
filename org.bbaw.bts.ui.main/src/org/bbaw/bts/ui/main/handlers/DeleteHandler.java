 
package org.bbaw.bts.ui.main.handlers;

import javax.inject.Named;

import org.bbaw.bts.core.controller.generalController.EditingDomainController;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

public class DeleteHandler {
	@Execute
	public void execute(
			@Optional @Named(IServiceConstants.ACTIVE_SELECTION) Object selection,
			EditingDomainController editingDomainController) {
		System.out.println("delete");
		if (selection instanceof EObject) {
			EditingDomain ed = editingDomainController
					.getEditingDomain((EObject) selection);
			if (ed != null) {
				Command command = DeleteCommand.create(ed, selection);
				ed.getCommandStack().execute(command);

			}
		}
	}
		
}