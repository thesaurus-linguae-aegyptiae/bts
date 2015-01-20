 
package org.bbaw.bts.ui.main.handlers;

import javax.inject.Named;

import org.bbaw.bts.ui.main.dialogs.DBManagerDialog;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.swt.widgets.Shell;

public class OpenDBManagerDialog {
	@Optional
	@Execute
	public void execute(
			@Optional @Named(IServiceConstants.ACTIVE_SHELL) final Shell shell,
			IEclipseContext context,
			@Optional @Named("org.bbaw.bts.ui.main.commandparameter.dbManagerMessage") String message) {
		IEclipseContext child = context.createChild("DBManager");
		child.set("dbManagerMessage", message);
		if (shell == null)
		{
			child.set(Shell.class, new Shell());
		}
		else
		{
			child.set(Shell.class, shell);
		}
		DBManagerDialog dialog = ContextInjectionFactory.make(
				DBManagerDialog.class, child);
		// context.set(UserManagementDialog.class, dialog);

		if (dialog.open() == dialog.OK) {
		}
	}
	
	
	@CanExecute
	public boolean canExecute() {
		
		return true;
	}
		
}