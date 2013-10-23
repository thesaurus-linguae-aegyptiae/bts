package org.bbaw.bts.ui.main.wizards.installation;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

public class LocalCreateUserPage extends WizardPage
{

	/**
	 * Create the wizard.
	 */
	public LocalCreateUserPage()
	{
		super("wizardPage");
		setTitle("Create Local User");
		setDescription("You are about to install BTS locally. In order to secure your database you have to create a user with administration rights on your local database. DON'T LOOSE THIS USER ACCOUNT!");
	}

	/**
	 * Create contents of the wizard.
	 * 
	 * @param parent
	 */
	public void createControl(Composite parent)
	{
		Composite container = new Composite(parent, SWT.NULL);

		setControl(container);
		container.setLayout(new GridLayout(1, false));
	}

}
