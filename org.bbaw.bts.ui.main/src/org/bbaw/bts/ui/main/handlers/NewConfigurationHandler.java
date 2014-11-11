package org.bbaw.bts.ui.main.handlers;

import javax.inject.Named;

import org.bbaw.bts.btsmodel.BTSConfiguration;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.controller.generalController.BTSConfigurationController;
import org.bbaw.bts.ui.main.dialogs.ConflictsDialog;
import org.bbaw.bts.ui.main.dialogs.NewConfigurationDialog;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
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
			BTSConfigurationController configurationController, EventBroker eventBroker,
			IEclipseContext context)
	{

		NewConfigurationDialog dialog = new NewConfigurationDialog(shell);
		ContextInjectionFactory.inject(
				dialog, context);
		if (dialog.open() == dialog.OK)
		{
			System.out.println("Realm.runWithDefault in NewConfigurationHandler");
			final BTSConfiguration config = dialog.getConfiguration();
			configurationController.save(config);
			eventBroker.post("model_new/asyncEvent", config);
		}

	}

	@CanExecute
	public boolean canExecute(@Optional @Named(BTSCoreConstants.CORE_EXPRESSION_MAY_EDIT_CONFIG) Boolean mayEdit) {
		return (mayEdit != null && mayEdit.booleanValue());
	}

}