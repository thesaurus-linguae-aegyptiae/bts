package org.bbaw.bts.ui.main.wizards.installation;

import java.util.List;

import org.bbaw.bts.commons.BTSPluginIDs;
import org.bbaw.bts.core.controller.generalController.ApplicationStartupController;
import org.bbaw.bts.ui.main.wizards.installation.support.Connection;
import org.eclipse.core.runtime.preferences.DefaultScope;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.osgi.service.prefs.Preferences;

public class InstallationWizard extends Wizard
{

	WelcomePage welcomePage = new WelcomePage();
	ConnectToServerPage connectServerPage;
	SelectProjectsPage projectPage;
	DBInstallationSettingsPage dbPage;
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

		Preferences preferences = DefaultScope.INSTANCE.getNode("org.bbaw.bts.app");
		connectServerPage = new ConnectToServerPage(preferences.get(BTSPluginIDs.PREF_REMOTE_DB_URL,
				"http://127.0.0.1:5985"));

		projectPage = new SelectProjectsPage(preferences.get(BTSPluginIDs.PREF_ACITVE_PROJECTS, null), preferences.get(
				BTSPluginIDs.PREF_MAIN_PROJECT, null));

		dbPage = new DBInstallationSettingsPage(startupController.getDBInstallationDir(), preferences.get(
				BTSPluginIDs.PREF_DB_PORT, null));
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

	public void setActiveProjects(List<String> activeProjectSelectionsAsStringList)
	{
		// TODO Auto-generated method stub

	}

	public void setMainProject(Object mainProject)
	{
		// TODO Auto-generated method stub

	}

}
