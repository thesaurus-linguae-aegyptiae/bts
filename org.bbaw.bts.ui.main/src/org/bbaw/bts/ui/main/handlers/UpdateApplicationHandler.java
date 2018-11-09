 
package org.bbaw.bts.ui.main.handlers;

import org.bbaw.bts.core.controller.generalController.ApplicationUpdateController;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;


public class UpdateApplicationHandler {

		@CanExecute
		public boolean canExecute(ApplicationUpdateController updateController) {
			return updateController.isUpdateAvailable();
		}
	
		@Execute
		public void execute(ApplicationUpdateController updateController) {
			updateController.askForConfirmationAndInstall();
		}

} 