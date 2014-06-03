 
package org.bbaw.bts.ui.main.handlers;

import javax.inject.Named;

import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.core.controller.dialogControllers.CompareObjectsController;
import org.bbaw.bts.ui.main.dialogs.ConflictsDialog;
import org.bbaw.bts.ui.main.dialogs.ObjectUpdaterReaderEditorDialog;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.swt.widgets.Shell;

public class OpenConflictsDialog {
	@Execute
	public void execute(@Optional @Named(IServiceConstants.ACTIVE_SELECTION) Object selection,
			@Named(IServiceConstants.ACTIVE_SHELL) final Shell shell,
			IEclipseContext context) {
		IEclipseContext child = context.createChild();
		Object o = context.get(CompareObjectsController.class);
		child.set("compareObject", selection);
		ConflictsDialog dialog = ContextInjectionFactory.make(
				ConflictsDialog.class, child);
		// context.set(UserManagementDialog.class, dialog);

		if (dialog.open() == dialog.OK) {
		}
	}
	
	
	@CanExecute
	public boolean canExecute(@Optional @Named(IServiceConstants.ACTIVE_SELECTION) Object selection) {
		if (selection instanceof BTSDBBaseObject)
		{
			if (!((BTSDBBaseObject)selection).getConflictingRevs().isEmpty())
			{
				return true;
			}
		}
		return false;
	}
		
}