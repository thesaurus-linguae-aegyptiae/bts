 
package org.bbaw.bts.ui.main.handlers;

import javax.inject.Named;

import org.bbaw.bts.btsmodel.BTSUser;
import org.bbaw.bts.core.controller.generalController.BTSUserController;
import org.bbaw.bts.ui.main.dialogs.PasswordChangeDialog;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;

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

		if (dialog.open() == dialog.OK)
		{
		}
	}
		
}