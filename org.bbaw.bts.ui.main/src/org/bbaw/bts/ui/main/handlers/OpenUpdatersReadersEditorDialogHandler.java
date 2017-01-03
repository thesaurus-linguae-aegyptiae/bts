package org.bbaw.bts.ui.main.handlers;

import javax.inject.Inject;
import javax.inject.Named;

import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.controller.generalController.PermissionsAndExpressionsEvaluationController;
import org.bbaw.bts.ui.main.dialogs.ObjectUpdaterReaderEditorDialog;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.swt.widgets.Shell;

public class OpenUpdatersReadersEditorDialogHandler {

	@Inject
	private PermissionsAndExpressionsEvaluationController permissionsController;
	
	@Optional
	@Execute
	public void execute(
			@Named(IServiceConstants.ACTIVE_SHELL) final Shell shell,
			@Named(IServiceConstants.ACTIVE_SELECTION) final BTSDBBaseObject selection,
			IEclipseContext context) {
		IEclipseContext childContext = context.createChild("Edit Updaters/Readers Context");
		childContext.set(BTSCoreConstants.CORE_EXPRESSION_MAY_EDIT, 
				new Boolean(permissionsController.userMayEditObject(
						permissionsController.getAuthenticatedUser(), selection)));
		ObjectUpdaterReaderEditorDialog dialog = ContextInjectionFactory.make(
				ObjectUpdaterReaderEditorDialog.class, childContext);
		childContext.set(ObjectUpdaterReaderEditorDialog.class, dialog);
		dialog.open();
	}

	@CanExecute
	public boolean canExecute(
			@Optional @Named(IServiceConstants.ACTIVE_SELECTION) BTSDBBaseObject selection) {
		if (selection != null) {
			return permissionsController.userMayEditObject(permissionsController.getAuthenticatedUser(), selection);
		}
		return false;
	}
}
