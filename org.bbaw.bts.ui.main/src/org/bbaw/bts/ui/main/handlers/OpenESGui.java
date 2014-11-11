 
package org.bbaw.bts.ui.main.handlers;

import javax.inject.Inject;

import org.bbaw.bts.core.controller.generalController.DBAdminController;
import org.bbaw.bts.core.controller.generalController.PermissionsAndExpressionsEvaluationController;
import org.bbaw.bts.ui.commons.utils.OpenExternalBrowser;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.CanExecute;

public class OpenESGui {
	@Inject
	private DBAdminController dbAdminController;
	
	@Inject
	private PermissionsAndExpressionsEvaluationController permissionController;
	
	@Execute
	public void execute() {
		String url = "http://www.gridshore.nl/esgui/#/dashboard";
		if (url != null)
		{
			OpenExternalBrowser.openURL(url);
		}
	}
	
	
	@CanExecute
	public boolean canExecute() {
		return permissionController.authenticatedUserIsDBAdmin(false);
	}
		
}