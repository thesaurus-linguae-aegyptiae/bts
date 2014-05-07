package org.bbaw.bts.ui.main.wizards.installation;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.bbaw.bts.btsmodel.BTSUser;
import org.bbaw.bts.btsmodel.BTSUserGroup;
import org.bbaw.bts.commons.BTSPluginIDs;
import org.bbaw.bts.core.controller.dialogControllers.UserManagerController;
import org.bbaw.bts.core.controller.generalController.ApplicationStartupController;
import org.bbaw.bts.core.controller.generalController.EditingDomainController;
import org.bbaw.bts.ui.main.wizards.installation.support.Connection;
import org.eclipse.core.runtime.preferences.DefaultScope;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.services.log.Logger;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.osgi.service.prefs.BackingStoreException;
import org.osgi.service.prefs.Preferences;

public class InstallationWizard extends Wizard
{

	private WelcomePage welcomePage = new WelcomePage();
	private ConnectToServerPage connectServerPage;
	private SelectProjectsPage projectPage;
	private DBInstallationSettingsPage dbPage;
	private LocalCreateUserPage createUserPage;
	private ApplicationStartupController startupController;
	private IEclipseContext context;
	private Connection remoteConnection;
	private IEclipsePreferences preferences;
	private Logger logger;
	private boolean localProject;
	private FinishInstallationPage finishPage = new FinishInstallationPage();
	private UserManagerController userManagerController;
	private EditingDomainController editingDomainController;

	public InstallationWizard(IEclipseContext context, ApplicationStartupController startupController)
	{
		this.context = context;
		this.startupController = startupController;
		this.preferences = DefaultScope.INSTANCE.getNode("org.bbaw.bts.app");
		this.logger = context.get(Logger.class);
		setWindowTitle("BTS Installation Wizard");
	}

	@Override
	public void addPages()
	{
		connectServerPage = new ConnectToServerPage(preferences.get(BTSPluginIDs.PREF_REMOTE_DB_URL,
				"http://127.0.0.1:5985"));

		projectPage = new SelectProjectsPage(preferences.get(BTSPluginIDs.PREF_ACITVE_PROJECTS, null), preferences.get(
				BTSPluginIDs.PREF_MAIN_PROJECT_KEY, null));

		dbPage = new DBInstallationSettingsPage(startupController.getDBInstallationDir(), preferences.get(
				BTSPluginIDs.PREF_DB_PORT, null));
		userManagerController = context.get(UserManagerController.class);
		editingDomainController = context.get(EditingDomainController.class);
		createUserPage = new LocalCreateUserPage(userManagerController, editingDomainController);
		
		if (startupController.requiresDBInstallation())
		{
			addPage(dbPage);
		}

		addPage(welcomePage);
		addPage(createUserPage);
		addPage(connectServerPage);
		addPage(projectPage);
		addPage(finishPage);
	}

	@Override
	public boolean performFinish()
	{
		boolean success = true;
		//load settings
		String location =dbPage.getDBInstallationDir();
		int port = dbPage.getDBLocalPort();
		String localAdminName = connectServerPage.getUserName();
		String localAdminP = connectServerPage.getPassword();
		String serverURL = connectServerPage.getServerURL();

		String mainProject = projectPage.getMainProject();
		String prefixes = projectPage.getActiveProjectSelectionsAsString();
		
		// save new settings
		preferences.put(BTSPluginIDs.PREF_DB_DIR, location);
		preferences.put(BTSPluginIDs.PREF_DB_PORT, new Integer(port).toString());
		preferences.put(BTSPluginIDs.PREF_LOCAL_DB_URL, serverURL);
		preferences.put(BTSPluginIDs.PREF_MAIN_PROJECT_KEY, mainProject);
		preferences.put(BTSPluginIDs.PREF_ACITVE_PROJECTS, prefixes);

		try {
			preferences.flush();
		} catch (BackingStoreException e) {
			logger.info(e);
		}

		// install db
		if (!startupController.installDB(location, port, localAdminName, localAdminP))
		{
			success = false;
		}
		
		
		// init or load projects
		if (welcomePage.isConnectToServer())
		{
			if (!startupController.synchronizeRemoteProjects(mainProject, projectPage.getActiveProjectSelectionsAsStringList()))
			{
				success = false;
			}
		}
		else
		{
			// init user object
			BTSUser user = createUserPage.getUser();
			if (!startupController.initializeLocalUser(user.getUserName(), user.getPassword()))
			{
				success = false;
			}
			Set<BTSUser> users = new HashSet<BTSUser>(1);
			users.add(user);
			userManagerController.saveUsers(users);
			
			//user group
			BTSUserGroup usergroup = createUserPage.getUserGroup();
			Set<BTSUserGroup> usergroups = new HashSet<BTSUserGroup>(1);
			usergroups.add(usergroup);
			userManagerController.saveUserGroups(usergroups);
			setLocalProject(true);
		}
		
		
		return success;
	}

	@Override
	public IWizardPage getNextPage(IWizardPage page)
	{
		if (page instanceof WelcomePage)
		{
			if (((WelcomePage) page).isConnectToServer())
			{
				return connectServerPage;
			} else
			{

				return createUserPage;

			}
		}
		else if (page instanceof LocalCreateUserPage)
		{
			return finishPage;
		}
		else if (page instanceof DBInstallationSettingsPage)
		{
			
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

	public boolean isLocalProject() {
		return localProject;
	}

	private void setLocalProject(boolean localProject) {
		this.localProject = localProject;
	}

}
