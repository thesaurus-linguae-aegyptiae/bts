package org.bbaw.bts.ui.main.handlers;

import javax.inject.Inject;

import org.bbaw.bts.core.controller.dialogControllers.CompareObjectsController;
import org.bbaw.bts.ui.main.dialogs.StatusMessageDialog;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Execute;

public class OpenStatusMessagesDialogHandler {
	@Execute
	public void execute(IEclipseContext context) {
		IEclipseContext child = context.createChild();
		Object o = context.get(CompareObjectsController.class);
		StatusMessageDialog dialog = ContextInjectionFactory.make(
				StatusMessageDialog.class, child);
		// context.set(UserManagementDialog.class, dialog);

		if (dialog.open() == dialog.OK) {
		}
	}
		
}