package org.bbaw.bts.ui.main.handlers;

import org.bbaw.bts.ui.main.dialogs.StatusMessageDialog;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Execute;

public class OpenStatusMessagesDialogHandler {
	@Execute
	public void execute(IEclipseContext context) {
		IEclipseContext child = context.createChild();
		
		StatusMessageDialog dialog = new StatusMessageDialog();
				
		ContextInjectionFactory.inject(
						dialog, child);
		dialog.create();

		if (dialog.open() == dialog.OK) {
		}
	}
		
}