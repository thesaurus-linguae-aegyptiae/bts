package org.bbaw.bts.ui.main.handlers;

import org.bbaw.bts.core.controller.generalController.ApplicationStartupController;
import org.bbaw.bts.ui.main.wizards.installation.InstallationWizard;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.extensions.Preference;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;

public class TESTER
{
	@Execute
	public void execute(@Preference(nodePath = "org.bbaw.bts.dao") IEclipsePreferences prefs, IEclipseContext context,
			ApplicationStartupController startupController)
	{
		//		PartHolderDialog dialog = ContextInjectionFactory.make(PartHolderDialog.class, context);
		//		//		context.set(UserManagementDialog.class, dialog);
		//
		//		if (dialog.open() == dialog.OK)
		//		{
		//		}

		Wizard w = new InstallationWizard(context, startupController);
		WizardDialog dialog = new WizardDialog(new Shell(), w);
		if (dialog.open() == dialog.OK)
		{
			System.out.println("new project created.");

		}
	}

	@CanExecute
	public boolean canExecute()
	{
		// TODO Your code goes here
		return true;
	}

}