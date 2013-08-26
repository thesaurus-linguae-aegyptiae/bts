package org.bbaw.bts.ui.main.handlers;

import javax.inject.Inject;
import javax.inject.Named;

import org.bbaw.bts.core.controller.generalController.BTSConfigurationController;
import org.bbaw.bts.ui.main.dialogs.BTSConfigurationDialog;
import org.eclipse.e4.core.commands.ECommandService;
import org.eclipse.e4.core.commands.EHandlerService;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.services.internal.events.EventBroker;
import org.eclipse.swt.widgets.Shell;

public class EditConfigurationHandler
{
	@Inject
	EventBroker eventBroker;
	@Inject
	private BTSConfigurationController configurationController;
	@Inject
	private ECommandService commandService;
	@Inject
	private EHandlerService handlerService;

	@Execute
	public void execute(@Named(IServiceConstants.ACTIVE_SHELL) final Shell shell, IEclipseContext context)
	{

		BTSConfigurationDialog dialog = ContextInjectionFactory.make(BTSConfigurationDialog.class, context);
		context.set(BTSConfigurationDialog.class, dialog);

		if (dialog.open() == dialog.OK)
		{
		}
	}

	@CanExecute
	public boolean canExecute()
	{
		// TODO Your code goes here
		return true;
	}

}