 
package org.bbaw.bts.ui.main.handlers;

import javax.inject.Named;

import org.bbaw.bts.btsmodel.BTSUser;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.controller.generalController.BTSUserController;
import org.bbaw.bts.ui.main.dialogs.PasswordChangeDialog;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.swt.SWT;

public class OpenChangePasswordDialogHandler {
	@Execute
	public void execute(IEclipseContext context,
			@Optional @Named("userId") String userId, BTSUserController userController) {
		IEclipseContext child = context.createChild("changePassword");

		if (userId != null)
		{
			BTSUser user = userController.findUser(userId, null);
			child.set(BTSUser.class, user);
		}
		PasswordChangeDialog dialog = ContextInjectionFactory.make(PasswordChangeDialog.class, child);
		//		context.set(UserManagementDialog.class, dialog);

		if (dialog.open() == SWT.OK)
		{
		}
	}

	@CanExecute
	public boolean canExecute(
			@Optional @Named(BTSCoreConstants.CORE_EXPRESSION_MAY_EDIT_USERS) Boolean mayEdit) {
		return (mayEdit != null && mayEdit.booleanValue());
	}
}