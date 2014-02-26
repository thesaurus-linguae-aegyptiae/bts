package test;

import org.bbaw.bts.ui.main.objectTypeSelector.ObjectTypeSelectionTreeComposite;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;

public class WizardTest
{

	public static void main(String[] args)
	{
		// Wizard w = new InstallationWizard();
		// WizardDialog dialog = new WizardDialog(new Shell(), w);
		Composite t = new ObjectTypeSelectionTreeComposite(new Shell(),
				SWT.BORDER);
		// if (dialog.open() == dialog.OK)
		// {
		// System.out.println("new project created.");
		//
		// }

	}

}
