package org.bbaw.bts.ui.main.wizards.installation;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.ProgressBar;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Label;
import org.eclipse.wb.swt.SWTResourceManager;

public class FinishInstallationPage extends WizardPage {

	private ProgressBar progressBar;
	private Label jobLabel;

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
		container.setLayout(new GridLayout(2, false));
		
		Label lblNewLabel = new Label(container, SWT.NONE);
		lblNewLabel.setText("Installation Progress");

		progressBar = new ProgressBar(container, SWT.SMOOTH);
		progressBar.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		setControl(container);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		
		Label lblNewLabel_1 = new Label(container, SWT.NONE);
		lblNewLabel_1.setText("Currently:");
		
		jobLabel = new Label(container, SWT.NONE);
		jobLabel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		jobLabel.setText("Installation...");
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		
		Label lblStepsYouHave = new Label(container, SWT.NONE);
		lblStepsYouHave.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 2, 1));
		lblStepsYouHave.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		lblStepsYouHave.setText("Steps you have to allow (On Windows)");
		
		Label lblNewLabel_2 = new Label(container, SWT.NONE);
		lblNewLabel_2.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1));
		lblNewLabel_2.setText("1. You will be asked if Install.exe should be excecuted: Please allow the execution of Install.exe.");
		
		Label lblNewLabel_3 = new Label(container, SWT.NONE);
		lblNewLabel_3.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1));
		lblNewLabel_3.setText("2. Next you might be asked if the installation of the software was successful: Please click YES.");
	}
	
	void setJobLabel(String message)
	{
		jobLabel.setText(message);
	}

	void setProgessWork(int work)
	{
		progressBar.setSelection(progressBar.getSelection() + work);
	}
}
