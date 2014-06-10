package org.bbaw.bts.ui.main.handlers;

import javax.inject.Named;

import org.bbaw.bts.btsmodel.BTSConfiguration;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.controller.generalController.BTSConfigurationController;
import org.bbaw.bts.ui.main.dialogs.NewConfigurationDialog;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.services.internal.events.EventBroker;
import org.eclipse.swt.widgets.Shell;

public class NewConfigurationHandler
{

	@Execute
	public void execute(@Named(IServiceConstants.ACTIVE_SHELL) final Shell shell,
			BTSConfigurationController configurationController, EventBroker eventBroker)
	{
		System.out.println("execute NewConfigurationHandler!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		final BTSConfiguration config = configurationController.createNew();

		NewConfigurationDialog dialog = new NewConfigurationDialog(shell, new BTSConfiguration[] { config });
		if (dialog.open() == dialog.OK)
		{
			System.out.println("Realm.runWithDefault in NewConfigurationHandler");
			configurationController.save(config);
			eventBroker.post("model_new/asyncEvent", config);
		}

	}

	@CanExecute
	public boolean canExecute(@Optional @Named(BTSCoreConstants.CORE_EXPRESSION_MAY_EDIT_CONFIG) Boolean mayEdit) {
		return (mayEdit != null && mayEdit.booleanValue());
	}

}