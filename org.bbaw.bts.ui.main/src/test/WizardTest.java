package test;

import org.bbaw.bts.ui.main.wizards.installation.InstallationWizard;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;

public class WizardTest
{

	public static void main(String[] args)
	{
		Wizard w = new InstallationWizard();
		WizardDialog dialog = new WizardDialog(new Shell(), w);
		if (dialog.open() == dialog.OK)
		{
			System.out.println("new project created.");

		}

	}

}
