package org.bbaw.bts.ui.main.handlers;

import javax.inject.Named;

import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.ui.main.dialogs.BTSConfigurationDialog;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.swt.widgets.Shell;

public class EditConfigurationHandler
{

	@Optional
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
	public boolean canExecute(@Optional @Named(BTSCoreConstants.CORE_EXPRESSION_MAY_EDIT_CONFIG) Boolean mayEdit) {
		return (mayEdit != null && mayEdit.booleanValue());
	}

}