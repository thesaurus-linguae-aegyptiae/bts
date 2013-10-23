package org.bbaw.bts.ui.main.wizards.installation;

import org.bbaw.bts.core.controller.generalController.ApplicationStartupController;
import org.bbaw.bts.ui.main.wizards.installation.support.Connection;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;

public class InstallationWizard extends Wizard
{

	WelcomePage welcomePage = new WelcomePage();
	ConnectToServerPage connectServerPage = new ConnectToServerPage();
	SelectProjectsPage projectPage = new SelectProjectsPage();
	DBInstallationSettingsPage dbPage = new DBInstallationSettingsPage();
	LocalCreateUserPage createUserPage = new LocalCreateUserPage();
	private ApplicationStartupController startupController;
	private IEclipseContext context;
	private Connection remoteConnection;

	public InstallationWizard(IEclipseContext context, ApplicationStartupController startupController)
	{
		this.context = context;
		this.startupController = startupController;
		setWindowTitle("BTS Installation Wizard");
	}

	@Override
	public void addPages()
	{
		addPage(welcomePage);
		addPage(connectServerPage);
		addPage(projectPage);
		addPage(dbPage);
	}

	@Override
	public boolean performFinish()
	{
		return false;
	}

	@Override
	public IWizardPage getNextPage(IWizardPage page)
	{
		if (page instanceof WelcomePage)
		{
			if (((WelcomePage) page).isConnectToServer())
			{

			} else
			{

				addPage(createUserPage);
				return createUserPage;

			}
		}
		return super.getNextPage(page);
	}

	@Override
	public boolean canFinish()
	{
		// TODO Auto-generated method stub
		return super.canFinish();
	}

	public ApplicationStartupController getStartupController()
	{
		return startupController;
	}

	public void setRemoteConnection(Connection connection)
	{
		this.remoteConnection = connection;

	}

	public Connection getRemoteConnection()
	{
		return this.remoteConnection;
	}

}
