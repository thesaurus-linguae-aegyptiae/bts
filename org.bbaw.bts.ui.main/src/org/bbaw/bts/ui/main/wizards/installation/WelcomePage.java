package org.bbaw.bts.ui.main.wizards.installation;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.wb.swt.SWTResourceManager;

public class WelcomePage extends WizardPage
{

	boolean connectToServer = false;
	boolean set = false;
	private Button btnYesIHave;
	private Button btnNo;

	/**
	 * Create the wizard.
	 */
	public WelcomePage()
	{
		super("welcomePage");
		setTitle("Welcome to the Berlin Text System Installation");
		setDescription("This wizard will guide you through the installation process step by step.");
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

		Label lblDoYouHave = new Label(container, SWT.NONE);
		lblDoYouHave.setFont(SWTResourceManager.getFont("Tahoma", 10, SWT.BOLD));
		lblDoYouHave.setText("Do you have a BTS Server URL?");

		Label lblInOtherWords = new Label(container, SWT.WRAP);
		lblInOtherWords
				.setText("In other words: Are you member of a research project that uses BTS for collaborative work");

		Label lblAndWhichHas = new Label(container, SWT.NONE);
		lblAndWhichHas.setText(" and which has a shared server? Do you have the internet address of the server?");
		new Label(container, SWT.NONE);

		Group grpYes = new Group(container, SWT.NONE);
		grpYes.setLayout(new GridLayout(3, false));
		grpYes.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		grpYes.setText("Yes");

		btnYesIHave = new Button(grpYes, SWT.RADIO);
		btnYesIHave.setFont(SWTResourceManager.getFont("Tahoma", 8, SWT.BOLD));
		btnYesIHave.setText("Yes, I have the URL");
		btnYesIHave.addSelectionListener(new SelectionListener()
		{

			@Override
			public void widgetSelected(SelectionEvent e)
			{
				connectToServer = !connectToServer;
				btnYesIHave.setSelection(connectToServer);
				btnNo.setSelection(!connectToServer);
				setPageComplete(true);

			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e)
			{
				// TODO Auto-generated method stub

			}
		});
		new Label(grpYes, SWT.NONE);

		Label lblThisInstallationProcess = new Label(grpYes, SWT.NONE);
		lblThisInstallationProcess.setText("This installation process will help you to get your shared research data");
		new Label(grpYes, SWT.NONE);
		new Label(grpYes, SWT.NONE);

		Label lblFromYourProjects = new Label(grpYes, SWT.NONE);
		lblFromYourProjects.setText(" from your project's server.");

		Group grpNo = new Group(container, SWT.NONE);
		grpNo.setLayout(new GridLayout(3, false));
		grpNo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		grpNo.setText("No");

		btnNo = new Button(grpNo, SWT.RADIO);
		btnNo.setFont(SWTResourceManager.getFont("Tahoma", 8, SWT.BOLD));
		btnNo.setText("No");
		btnNo.addSelectionListener(new SelectionListener()
		{

			@Override
			public void widgetSelected(SelectionEvent e)
			{
				connectToServer = !connectToServer;
				btnYesIHave.setSelection(connectToServer);
				btnNo.setSelection(!connectToServer);
				setPageComplete(true);
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e)
			{
				// TODO Auto-generated method stub

			}
		});
		new Label(grpNo, SWT.NONE);

		Label lblIfYouAre = new Label(grpNo, SWT.NONE);
		lblIfYouAre.setText("If you are a single user or don't have a server for collaborative work ");
		new Label(grpNo, SWT.NONE);
		new Label(grpNo, SWT.NONE);

		Label lblOrIfYou = new Label(grpNo, SWT.NONE);
		lblOrIfYou.setText("or if you just want to install a test version or a local version.");
		new Label(grpNo, SWT.NONE);
		new Label(grpNo, SWT.NONE);

		Label lblBtsCanRun = new Label(grpNo, SWT.NONE);
		lblBtsCanRun.setText("BTS can run locally without any limitations other than collaboration.");
	}

	/**
	 * @return the connectToServer
	 */
	public boolean isConnectToServer()
	{
		return connectToServer;
	}

	/**
	 * @param connectToServer
	 *            the connectToServer to set
	 */
	public void setConnectToServer(boolean connectToServer)
	{
		this.connectToServer = connectToServer;
	}

}
