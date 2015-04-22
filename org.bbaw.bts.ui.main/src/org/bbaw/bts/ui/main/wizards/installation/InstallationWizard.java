package org.bbaw.bts.ui.main.wizards.installation;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.bbaw.bts.btsmodel.BTSUser;
import org.bbaw.bts.btsmodel.BTSUserGroup;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.commons.BTSPluginIDs;
import org.bbaw.bts.core.controller.dialogControllers.UserManagerController;
import org.bbaw.bts.core.controller.generalController.ApplicationStartupController;
import org.bbaw.bts.core.controller.generalController.BTSUserController;
import org.bbaw.bts.core.controller.generalController.EditingDomainController;
import org.bbaw.bts.ui.main.wizards.installation.support.Connection;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.preferences.ConfigurationScope;
import org.eclipse.core.runtime.preferences.DefaultScope;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.services.log.Logger;
import org.eclipse.e4.ui.di.UISynchronize;
import org.eclipse.equinox.security.storage.ISecurePreferences;
import org.eclipse.equinox.security.storage.SecurePreferencesFactory;
import org.eclipse.equinox.security.storage.StorageException;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.osgi.service.prefs.BackingStoreException;
import org.osgi.service.prefs.Preferences;

public class InstallationWizard extends Wizard {

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
	private boolean success;
	private UISynchronize sync;
	private String localUrl;
	private BTSUserController userController;
	private BTSUser validUser;

	public InstallationWizard(IEclipseContext context,
			ApplicationStartupController startupController, UISynchronize sync,
			BTSUserController userController) {
		this.context = context;
		this.startupController = startupController;
		this.preferences = DefaultScope.INSTANCE.getNode("org.bbaw.bts.app");
		this.logger = context.get(Logger.class);
		this.sync = sync;
		this.userController = userController;
		setWindowTitle("BTS Installation Wizard");
	}

	@Override
	public void addPages() {
		connectServerPage = new ConnectToServerPage(preferences.get(
				BTSPluginIDs.PREF_REMOTE_DB_URL, null));

		projectPage = new SelectProjectsPage(preferences.get(
				BTSPluginIDs.PREF_ACTIVE_PROJECTS, null), preferences.get(
				BTSPluginIDs.PREF_MAIN_PROJECT_KEY, null));

		dbPage = new DBInstallationSettingsPage(
				startupController.getDBInstallationDir(), preferences.get(
						BTSPluginIDs.PREF_LOCAL_DB_URL_PORT,
						BTSConstants.DEFAULT_LOCAL_DB_URL_PORT));
		userManagerController = context.get(UserManagerController.class);
		editingDomainController = context.get(EditingDomainController.class);
		createUserPage = new LocalCreateUserPage(userManagerController,
				editingDomainController);

		if (startupController.requiresDBInstallation()) {
			addPage(dbPage);
		}

		addPage(welcomePage);
		addPage(createUserPage);
		addPage(connectServerPage);
		addPage(projectPage);
		addPage(finishPage);
	}

	@Override
	public boolean performFinish() {
		success = true;
		logger.info("Installation wizard, start installation successful: "
				+ success);

		installBTS();

		logger.info("Installation wizard, installation successful: " + success);
		return success;
	}

	private void installBTS() {
		// Job job = new Job("My Job") {
		// @Override
		// protected IStatus run(IProgressMonitor monitor) {
		// // set total number of work units
		// monitor.beginTask("Installation of Berlin Text System", 100);
		sync.syncExec(new Runnable() {
			@Override
			public void run() {
				finishPage.setJobLabel("Installation of Berlin Text System...");
				finishPage.setProgessWork(2);
			}
		});
		// load settings
		String location = dbPage.getDBInstallationDir();
		int port = dbPage.getDBLocalPort();
		if (port < 0) {
			try {
				port = new Integer(preferences.get(
						BTSPluginIDs.PREF_LOCAL_DB_URL_PORT,
						BTSConstants.DEFAULT_LOCAL_DB_URL_PORT));
			} catch (NumberFormatException e) {
				port = 9086;
			}

		}
		String localAdminName;
		String localAdminP;
		if (welcomePage.isConnectToServer()) {
			localAdminName = connectServerPage.getUserName();
			localAdminP = connectServerPage.getPassword();
		} else {
			localAdminName = createUserPage.getUser().getUserName();
			localAdminP = createUserPage.getUser().getPassword();
		}
		ISecurePreferences secPrefs = SecurePreferencesFactory.getDefault()
				.node("org.bbaw.bts.app");
		ISecurePreferences auth = secPrefs.node("auth");
		System.out.println("load password");
		boolean success = false;
		try {
			auth.put("username", localAdminName, false);
			auth.put("password", localAdminP, true);
			auth.flush();
			success = true;
		} catch (StorageException e) {
			logger.error(e);
		} catch (IOException e) {
			logger.error(e);
		} catch (SecurityException e) {

		}
		if (!success) {
			try {
				auth.put("username", localAdminName, false);
				auth.put("password", localAdminP, false);
				auth.flush();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		String mainProject = null;
		String prefixes = null;
		String serverURL = null;
		preferences = ConfigurationScope.INSTANCE
				.getNode("org.bbaw.bts.app");
		preferences.put(BTSPluginIDs.PREF_DB_DIR, location);
		preferences.put(BTSPluginIDs.PREF_LOCAL_DB_URL_PORT, new Integer(
				port).toString());

		localUrl = BTSConstants.DEFAULT_LOCAL_DB_URL_PROTOCOL + "://";
		localUrl += BTSConstants.DEFAULT_LOCAL_DB_URL_HOST + ":" + port;
		//
		preferences.put(BTSPluginIDs.PREF_LOCAL_DB_URL, localUrl);

		if (welcomePage.isConnectToServer()) {
			userController.setAuthenticatedUser(getUser());

			serverURL = connectServerPage.getServerURL();
			preferences.put(BTSPluginIDs.PREF_REMOTE_DB_URL, serverURL);

			mainProject = projectPage.getMainProject();
			prefixes = projectPage.getActiveProjectSelectionsAsString();

			if (mainProject == null || "".equals(mainProject)
					|| prefixes == null || "".equals(prefixes)) {
				projectPage.loadProjects();
			}
			mainProject = projectPage.getMainProject();
			prefixes = projectPage.getActiveProjectSelectionsAsString();
			// monitor.worked(2);
			// save new settings
			

			preferences.put(BTSPluginIDs.PREF_MAIN_PROJECT_KEY, mainProject);
			preferences.put(BTSPluginIDs.PREF_ACTIVE_PROJECTS, prefixes);

			// monitor.worked(2);

			
		}
		try {
			preferences.flush();
		} catch (BackingStoreException e) {
			logger.error(e);
		}
		// interact with user
		// monitor.worked(4);
		// monitor.subTask("Installing database...");
		sync.syncExec(new Runnable() {
			@Override
			public void run() {
				finishPage.setJobLabel("Installing database...");
				finishPage.setProgessWork(8);
			}
		});

		// install db
		if (!startupController.installDB(location, port, localAdminName,
				localAdminP)) {
			success = false;
			logger.error("Installation wizard, startupController.installDB suceccessful: "
					+ success);

		}
		// interact with user
		// monitor.worked(25);
		// monitor.subTask("Synchronizing projects from remote server...");
		sync.syncExec(new Runnable() {
			@Override
			public void run() {
				finishPage
						.setJobLabel("Synchronizing projects from remote server...");
				finishPage.setProgessWork(25);
			}
		});

		// start db
		boolean started = startupController.startDB(location, localUrl);
		if (started)
			System.out.println("started " + started);
		if (!started) {
			System.out.println("not started " + started);
			success = false;
			logger.error("Installation wizard, startupController.installDB suceccessful: "
					+ success);
		}

		// if (started == false);
		// {
		// success = false;
		// logger.error("Installation wizard, startupController.installDB suceccessful: "
		// + success);
		//
		// }

		// init or load projects
		if (welcomePage.isConnectToServer()) {
			try {

				if (!startupController.synchronizeRemoteProjects(mainProject,
						projectPage.getActiveProjectSelectionsAsStringList(),
						serverURL, localUrl)) {
					success = false;
					logger.info("Installation wizard, startupController.synchronizeRemoteProjects suceccessful: "
							+ success);
					setLocalProject(true);
					// monitor.worked(25);
				}
			} catch (Exception e) {
				success = false;
				logger.info("Installation wizard, startupController.synchronizeRemoteProjects suceccessful: "
						+ success);
				setLocalProject(true);
				logger.error(e);
			}
			logger.info("Installation wizard, startupController.synchronizeRemoteProjects suceccessful: "
					+ success);

			setAuthenticatedUser(localAdminName, localAdminP, mainProject);
		}

		else {
			// monitor.subTask("Initializing user...");
			sync.syncExec(new Runnable() {
				@Override
				public void run() {
					finishPage.setJobLabel("Initializing user...");
					finishPage.setProgessWork(25);
				}
			});
			// init user object
			BTSUser user = createUserPage.getUser();
			if (!startupController.initializeLocalUser(user.getUserName(),
					user.getPassword())) {
				success = false;
				logger.info("Installation wizard, startupController.initializeLocalUser suceccessful: "
						+ success);
			}
			logger.info("Installation wizard, startupController.initializeLocalUser suceccessful: "
					+ success);
			// monitor.worked(25);
			Set<BTSUser> users = new HashSet<BTSUser>(1);
			users.add(user);
			userManagerController.saveUsers(users);
			userController.setAuthenticatedUser(user);
			
			// user group
			BTSUserGroup usergroup = createUserPage.getUserGroup();
			Set<BTSUserGroup> usergroups = new HashSet<BTSUserGroup>(1);
			usergroups.add(usergroup);
			userManagerController.saveUserGroups(usergroups);
			setLocalProject(true);
			// monitor.worked(25);
			sync.syncExec(new Runnable() {
				@Override
				public void run() {
					finishPage.setJobLabel("Initializing user group...");
					finishPage.setProgessWork(25);
				}
			});
		}
		
		System.out.println("Called save");
		// return Status.OK_STATUS;
		// }
		// };
		// job.schedule();
		//
		// try {
		// job.join();
		// } catch (InterruptedException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

		sync.syncExec(new Runnable() {
			@Override
			public void run() {
				finishPage.setJobLabel("Finishing...");
				finishPage.setProgessWork(25);
			}
		});

	}

	private void setAuthenticatedUser(String userName, String passWord,
			String mainProject) {

		List<BTSUser> users = userController.listAll(userName, passWord);
		for (BTSUser u : users) {
			if (userName.equals(u.getUserName()) && (u.getProject() == null
					|| u.getProject().equals(mainProject))) { // FIXME password
																// checking
				// && equalsPassword(u,
				// passWord)) {
				validUser = u;
				logger.info("User found: " + u.get_id() + " userName: "
						+ u.getUserName());
				break;

			}
		}

		userController.setAuthenticatedUser(validUser);

	}

	@Override
	public IWizardPage getNextPage(IWizardPage page) {
		if (page instanceof WelcomePage) {
			if (((WelcomePage) page).isConnectToServer()) {
				return connectServerPage;
			} else {

				return createUserPage;

			}
		} else if (page instanceof LocalCreateUserPage) {
			return finishPage;
		} else if (page instanceof DBInstallationSettingsPage) {

		} else if (page instanceof ConnectToServerPage) {
			if (getRemoteConnection() != null) {
				return projectPage;
			} else {

				return connectServerPage;

			}
		} else if (page instanceof SelectProjectsPage) {
			return finishPage;
		} else if (page instanceof FinishInstallationPage) {
			return finishPage;
		}
		else
		{
			return welcomePage;
		}
		return super.getNextPage(page);
	}

	@Override
	public boolean canFinish() {
		if (welcomePage.isConnectToServer()) {
			return (connectServerPage.canFlipToNextPage() && projectPage.canFlipToNextPage());
		} else {
			return createUserPage.canFlipToNextPage();
		}

	}

	public ApplicationStartupController getStartupController() {
		return startupController;
	}

	public void setRemoteConnection(Connection connection) {
		this.remoteConnection = connection;

	}

	public Connection getRemoteConnection() {
		return this.remoteConnection;
	}

	public void setActiveProjects(
			List<String> activeProjectSelectionsAsStringList) {
		// TODO Auto-generated method stub

	}

	public void setMainProject(Object mainProject) {
		// TODO Auto-generated method stub

	}

	public boolean isLocalProject() {
		return localProject;
	}

	private void setLocalProject(boolean localProject) {
		this.localProject = localProject;
	}

	public BTSUser getUser() {
		if (createUserPage.getUser() != null) {
			return createUserPage.getUser();
		} else
			return validUser;
	}

	public String getLocalDBUrl() {
		return localUrl;
	}

}
