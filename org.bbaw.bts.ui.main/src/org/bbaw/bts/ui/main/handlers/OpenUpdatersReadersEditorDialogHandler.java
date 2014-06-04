package org.bbaw.bts.ui.main.handlers;

import javax.inject.Named;

import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.ui.main.dialogs.ObjectUpdaterReaderEditorDialog;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.swt.widgets.Shell;

public class OpenUpdatersReadersEditorDialogHandler {

	@Optional
	@Execute
	public void execute(
			@Named(IServiceConstants.ACTIVE_SHELL) final Shell shell,
			IEclipseContext context) {
		ObjectUpdaterReaderEditorDialog dialog = ContextInjectionFactory.make(
				ObjectUpdaterReaderEditorDialog.class, context);
		// context.set(UserManagementDialog.class, dialog);

		if (dialog.open() == dialog.OK) {
		}
	}

	@CanExecute
	public boolean canExecute(
			@Optional @Named(IServiceConstants.ACTIVE_SELECTION) BTSDBBaseObject selection,
			@Optional @Named(BTSCoreConstants.CORE_EXPRESSION_MAY_EDIT) Boolean mayEdit) {
		if (mayEdit != null && mayEdit.booleanValue())
		{
			return selection != null;
		}
		return false;
	}
}
