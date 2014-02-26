 
package org.bbaw.bts.ui.main.handlers;

import javax.inject.Named;

import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.controller.generalController.EditingDomainController;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.emf.edit.domain.EditingDomain;

public class UndoHandler {
	@Execute
	public void execute(EditingDomainController editingDomainController,
			@Named(IServiceConstants.ACTIVE_SELECTION) Object selection) {
		EditingDomain ed = editingDomainController.getEditingDomain(selection);
		if (ed != null) {
			ed.getCommandStack().undo();
		}
	}

	@CanExecute
	public boolean canExecute(
			@Optional @Named(BTSCoreConstants.CORE_EXPRESSION_CAN_UNDO) String canUndo,
			IEclipseContext context) {
		boolean can = (canUndo != null && canUndo.equals("true"));
		return can;
	}
}