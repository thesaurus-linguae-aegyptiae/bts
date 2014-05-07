package org.bbaw.bts.ui.main.wizards.installation;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

public class FinishInstallationPage extends WizardPage {

	/**
	 * Create the wizard.
	 */
	public FinishInstallationPage() {
		super("wizardPage");
		setTitle("Finish Installation of BTS");
		setDescription("Click Finish finalize the installation of BTS.");
	}

	/**
	 * Create contents of the wizard.
	 * @param parent
	 */
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);

		setControl(container);
	}

}
