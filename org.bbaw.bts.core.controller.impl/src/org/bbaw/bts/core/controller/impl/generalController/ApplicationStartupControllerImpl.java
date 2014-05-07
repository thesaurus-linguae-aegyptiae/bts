package org.bbaw.bts.core.controller.impl.generalController;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

import javax.inject.Inject;

import org.bbaw.bts.app.login.Login;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.BTSProject;
import org.bbaw.bts.btsmodel.BTSUser;
import org.bbaw.bts.btsviewmodel.TreeNodeWrapper;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.commons.BTSPluginIDs;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.commons.InternetAccessTester;
import org.bbaw.bts.core.commons.staticAccess.StaticAccessController;
import org.bbaw.bts.core.controller.generalController.ApplicationStartupController;
import org.bbaw.bts.core.controller.generalController.BTSUserController;
import org.bbaw.bts.core.controller.generalController.ISplashScreenController;
import org.bbaw.bts.core.controller.generalController.PermissionsAndExpressionsEvaluationController;
import org.bbaw.bts.core.services.BTSProjectService;
import org.bbaw.bts.core.services.BTSUserService;
import org.bbaw.bts.core.services.Backend2ClientUpdateService;
import org.bbaw.bts.db.DBManager;
import org.bbaw.bts.searchModel.BTSQueryRequest;
import org.bbaw.bts.ui.font.BTSFontManager;
import org.bbaw.bts.ui.main.wizards.installation.InstallationWizard;
import org.bbaw.bts.ui.main.wizards.newProject.NewProjectWizard;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.preferences.DefaultScope;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.Preference;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.e4.core.services.log.Logger;
import org.eclipse.e4.ui.di.UISynchronize;
import org.eclipse.e4.ui.workbench.UIEvents;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.osgi.framework.internal.core.BundleURLConnection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.elasticsearch.index.query.QueryBuilders;
import org.osgi.framework.Bundle;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventHandler;
import org.osgi.service.prefs.BackingStoreException;
import org.osgi.service.prefs.Preferences;

public class ApplicationStartupControllerImpl implements
		ApplicationStartupController {

	private static final String YOUR_PLUGIN_ID = "org.bbaw.bts.app";

	@Inject
	@Optional
	@Preference(value = "active_projects", nodePath = "org.bbaw.bts.app")
	private String active_projects;

	@Inject
	@Optional
	@Preference(value = "main_project_key", nodePath = "org.bbaw.bts.app")
	private String main_project;

	@Inject
	@Optional
	@Preference(value = "first_startup", nodePath = "org.bbaw.bts.app")
	private String first_startup;

	@Inject
	@Optional
	@Preference(value = "rememberedUsername", nodePath = "org.bbaw.bts.app")
	private String rememberedUsername;

	@Inject
	@Optional
	@Preference(value = "remembered", nodePath = "org.bbaw.bts.app")
	private String remembered;

	@Inject
	@Preference(value = "remote_db_urls", nodePath = "org.bbaw.bts.app")
	protected String remote_db_urls;
	
	@Inject
	@Preference(value = BTSPluginIDs.PREF_DB_DIR, nodePath = "org.bbaw.bts.app")
	protected String db_installation_dir;

	@Inject
	private BTSProjectService projectService;

	@Inject
	private DBManager dbManager;

	@Inject
	private Backend2ClientUpdateService backend2ClientUpdateService;

	@Inject
	private BTSUserService userService;

	@Inject
	private IEventBroker eventBroker;
	
	@Inject
	private BTSFontManager fontManager;
	
	@Inject
	private Logger logger;
	
	@Inject
	private UISynchronize sync;

	private List<BTSProject> projects;

	private List<String> activeProjects;

	protected boolean projectCreated;

	private IEclipseContext context;

	@Inject
	private ISplashScreenController splashController;



	@Inject
	@Preference(nodePath = "org.bbaw.bts.dao")
	private IEclipsePreferences prefs;

	@Inject
	private BTSUserController userController;


	@Override
	public void applicationStartup(final IEclipseContext context,
			BTSProjectService projectService, IApplicationContext appContext) {
		this.context = context;
		
		//automated software update
		//FIXME automated update!

		// load font
		Font font = null;
		
		font = fontManager.getFont("FreeSerif");
		logger.debug("Font loadded - font: " + font);
		if (font != null && font.getFontData() != null && font.getFontData()[0] != null) {
			font.getFontData()[0].setHeight(12);
			JFaceResources.getFontRegistry().put(
					JFaceResources.DEFAULT_FONT,
					new FontData[] {  font.getFontData()[0] });
			Font f = JFaceResources.getFontRegistry().get(
					JFaceResources.DEFAULT_FONT);
			// Font f2 = JFaceResources.getDefaultFont();
		}
		

//		// FIXME make dynamic
//		boolean isLoaded = Display
//				.getCurrent()
//				.loadFont(
//						"E:/AAEW/dev/ws_bts_v2/org.bbaw.bts.ui.font.egyFont/font/FreeSerif.ttf");
//		if (true) {
//			FontData[] fd = Display.getCurrent().getFontList(null, true);
//			FontData fontdata = null;
//			for (int i = 0; i < fd.length; i++) {
//				if (fd[i].getName().equals("FreeSerif")) {
//					fontdata = fd[i];
//					break;
//				}
//			}
//			if (fontdata != null) {
//				fontdata.setHeight(12);
//				JFaceResources.getFontRegistry().put(
//						JFaceResources.DEFAULT_FONT,
//						new FontData[] { fontdata });
//				Font f = JFaceResources.getFontRegistry().get(
//						JFaceResources.DEFAULT_FONT);
//				// Font f2 = JFaceResources.getDefaultFont();
//			}
//		}

		boolean dbPrepared = false;
		boolean mainProjectSet = false;
		splashController.setSplashPluginId(YOUR_PLUGIN_ID);
		splashController.setSplashImagePath("/" + "splash" + "/"
				+ "btsStart.jpg");
		splashController.open();
		splashController.setMessage("Starting Applikation ...");

		// The should be a better way to close the Splash
		// see https://bugs.eclipse.org/bugs/show_bug.cgi?id=376821
		eventBroker.subscribe(UIEvents.UILifeCycle.ACTIVATE,
				new EventHandler() {
					@Override
					public void handleEvent(Event event) {
						// inititae static access controller
						StaticAccessController sa = context
								.get(StaticAccessController.class);
						PermissionsAndExpressionsEvaluationController permissionController = context
								.get(PermissionsAndExpressionsEvaluationController.class);
						splashController.close();
						eventBroker.unsubscribe(this);
					}
				});

		logger.info("db_installation_dir " + db_installation_dir);

		if (db_installation_dir == null || "".equals(db_installation_dir))
		{
			String btsInsallationDir = BTSConstants.getInstallationDir();
			logger.info("btsInsallationDir " + btsInsallationDir);

			db_installation_dir = BTSConstants.getDBInstallationDir(btsInsallationDir);
			prefs.put(BTSPluginIDs.PREF_DB_DIR, db_installation_dir);
			try {
				prefs.flush();
			} catch (BackingStoreException e) {
				logger.info(e);
			}
		}

		if (first_startup == null || first_startup.equals("true")
				|| !dbManager.databaseIsInstalled(db_installation_dir)) {
			logger.info("Application very first startup");

			Display.getDefault().syncExec(new Runnable() {
				  public void run() {
					// needs to init realm
						Realm.runWithDefault(SWTObservables.getRealm(Display.getDefault()), new Runnable() {
							public void run() {
								boolean success = openInstallationWizard();
								if (!success)
								{
									System.exit(0);
								}

							}
						});
				  }
				}); 			
//				
//			boolean authenticationLoaded = false;
//			if (InternetAccessTester.accessToURLExists(null)) {
//				
//			} 
//			else
//			{
//				logger.info("No Internet Access available");
//			}
//			
//			
//

		} else
		// subsequent start
		{
			logger.info("Application subsequent startup");
			// start db
			try {
				boolean started = dbManager.startDatabase(db_installation_dir);
				logger.info("Database successfully started: " + started);
			} catch (Exception e2) {
				e2.printStackTrace();
			}

			//##############dev##################
//			rememberedUsername = "admin";
//			remembered = "admin";
			//##############dev##################
			
			boolean loggedIn = false;
			if (rememberedUsername != null
					&& !"".equals(rememberedUsername)
					&& remembered != null
					&& userService
							.setAuthentication(rememberedUsername, remembered)) {
				logger.info("Last login from remember me service. Username: " + rememberedUsername);

				// remebemered
//				BTSQueryRequest query = new BTSQueryRequest();
//				query.setQueryBuilder(QueryBuilders.boolQuery().must(
//						QueryBuilders.termQuery("userName", rememberedUsername)));
				
				try {
					List<BTSUser> users = userController.listAll();
					for (BTSUser u : users) {
						if (rememberedUsername.equals(u.getUserName())) { // FIXME
																			// password
																			// checking
							// && equalsPassword(u,
							// passWord)) {
							logger.info("Last login from remember me service. User found.");

							userController.setAuthenticatedUser(u);
							loggedIn = true;
							break;
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			} 
			if (!loggedIn){
				sync.asyncExec(new Runnable()
				{
					@Override
					public void run()
					{
						Login login = ContextInjectionFactory.make(Login.class, context);
						login.login(context, userController);

					}

				});

			}
		}

		
		
		
		
		
		
		
		
		
	
		
		// Konzept:
		// erster login bzw. keine db installiert:
		// / als allererstes checken, ob db installiert

		// wenn keine db installiert: prüfen, ob online

		//
		// dann erst db installieren
		// dann db starten
		
		// dann mit server synchronisieren, d.h. replicatoren erstellen für
		// project erstellen
		// fragen, welche projekte geholt werden sollen
		// dann für alel zuholenden projekte replikatoren erstellen
		// gui laden
		// splash schließen

		// wenn lokal erstellt werden soll:
		// neuen Benutzer anlegen: username und password
		// beides in couchdb.ini als admin eintragen
		// db installieren
		// db starten
		// gui laden
		// initial config wizard anzeigen
		// gui laden
		// splash schließen

		// server urls - ja, richtig, plural! - in properties
		// schreiben!!!!!!!!!!!!!
		// letzten nutzer in properties schreiben

		// wenn nicht erststart:
		// splash zeigen
		// letzten nutzer ggfs. in login laden, kein passwort, ggfs. passwort
		// speichern (mit sich selbst verschlüsseln)
		// wenn online und server gesetzt: login, gegen server validieren: Login
		// zeigt auswahl aller vorhandenen server urls
		// falls nicht passt, kann eine neue eingegeben werden
		// im fall einer neuen url: wie oben
		// prüfen, ob user in couchdb.ini als lokaler admin gesetzt
		// user in _users aktualisieren

		// wenn nicht online: login nur gegen lokale benutzer
		// erklären, dass nur benutzer erlaubt sind, die sich schon mal
		// eingelogt haben
		// db starten
		// login gegen lokale db
		// replication prüfen
		// elasticsearch...
		// gui starten
		// splash schließen
		//
		//
		
		

		
		

		

		try {
			splashController.setMessage("Prepare Database...");

			dbPrepared = dbManager.prepareDB();
		} catch (URISyntaxException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			projects = projectService.list(BTSConstants.OBJECT_STATE_ACITVE);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// check for projects
		// Preferences prefs =
		// ConfigurationScope.INSTANCE.getNode("org.bbaw.bts.app");
		// prefs.
		System.out.println("active: " + active_projects + " main: "
				+ main_project);
		if (active_projects != null) // active_projects are set
		{
			activeProjects = new Vector<String>();
			for (String p : active_projects.split("\\|")) {
				activeProjects.add(p);
			}
		}

		if (projects != null && !projects.isEmpty()) {

			splashController.setMessage("Check Project Settings ...");

			checkProjectsSelectionsSettings();
			splashController.setMessage("Check Database Settings ...");

			checkProjectDBCollections(projects);

			for (BTSProject p : projects) {
				if (p.getPrefix().equals(main_project)) {
					context.set(BTSCoreConstants.MAIN_PROJECT, p);
					mainProjectSet = true;
					break;
				}
			}
			// login
			if (mainProjectSet) {
				splashController.close();

			}
		}

	}

	protected boolean openInstallationWizard() {
		InstallationWizard installWizard = new InstallationWizard(context, ApplicationStartupControllerImpl.this);
		WizardDialog dialog = new WizardDialog(new Shell(SWT.NO_TRIM | SWT.ON_TOP), installWizard);
		if (dialog.open() == dialog.OK)
		{
			logger.info("InstallationWizard opened");
		}
		else
		{
			logger.info("InstallationWizard canceled");
			return false;
		}
		if (installWizard.isLocalProject())
		{
			initialProjectCreation();
			return true;
		}
		return false;
	}

	private void initialProjectCreation() {

		if (createInitialProject()) {
			try {
				projects = projectService
						.list(BTSConstants.OBJECT_STATE_ACITVE);
			} catch (Exception e) {

			}
			if (projects != null) {
				checkProjectsSelectionsSettings();
			}
		}
	}

	private void checkProjectDBCollections(List<BTSProject> projects) {
		for (BTSProject project : projects) {
			if (project.getDbConnection() != null) {
				try {
					dbManager.prepareDBSynchronization(project);
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			try {
				dbManager.prepareDBIndexing(project);
			} catch (URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			backend2ClientUpdateService.startListening2Updates(project);
		}

	}

	private void checkProjectsSelectionsSettings() {
		if (activeProjects != null) {
			for (String p : activeProjects) {
				if (checkContains(projects, p)) {

				}
			}
		}
		if (main_project != null && main_project.trim().length() > 0) {
			if (!activeProjects.contains(main_project)) {

			}
			if (checkContains(projects, main_project)) {


			} else {

			}

		}

	}

	private boolean createInitialProject() {
		projectCreated = false;
		BTSProject project = projectService.createNew();
		final NewProjectWizard wizard = new NewProjectWizard(project,
				projectService);
		Realm.runWithDefault(SWTObservables.getRealm(Display.getDefault()),
				new Runnable() {
					public void run() {
						WizardDialog dialog = new WizardDialog(new Shell(SWT.NO_TRIM | SWT.ON_TOP),
								wizard);
						if (dialog.open() == dialog.OK) {
							System.out.println("new project created.");
							projectCreated = true;

						}
					}
				});
		return projectCreated;

	}

	private boolean checkContains(List<BTSProject> projs, String project) {
		for (BTSProject p : projs) {
			if (p.getPrefix() != null && p.getPrefix().equals(project)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean checkDBConnection(String urlString, String username,
			String password) throws MalformedURLException {
		return dbManager.checkConnection(urlString, username, password);
	}

	@Override
	public void setRemoteDBConnection(String url, String user, String password)
			throws MalformedURLException {
		prefs.put(BTSPluginIDs.PREF_REMOTE_DB_URL, url);
		prefs.put(BTSPluginIDs.PREF_AUTHENTICATED_USER, user);
		prefs.put(BTSPluginIDs.PREF_AUTHENTICATED_USER_PASSWORD, password);
	}

	@Override
	public List<BTSProject> loadRemoteProjects() throws MalformedURLException {
		return projectService.listRemoteProjects();
	}

	@Override
	public String getDBInstallationDir() {
		return db_installation_dir;
	}

	@Override
	public boolean installDB(String dbInstallationDir, int localPort, String localAdminName, String localAdminpassword) {
		logger.info("Location " + dbInstallationDir);
		boolean success = false;
		try {
			success = dbManager.installDatabase(dbInstallationDir, localPort, localAdminName, localAdminpassword);
		} catch (Exception e) {
			logger.info(e);
			return false;
		}
		logger.info("Data base installed successfully: " + success + ", at: " + dbInstallationDir);
		return success;
	}

	@Override
	public boolean requiresDBInstallation() {
		return !dbManager.databaseIsInstalled(db_installation_dir);
	}

	@Override
	public boolean initializeLocalUser(String localAdminName,
			String localAdminPassword) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean synchronizeRemoteProjects(String mainProject,
			List<String> projecsToSync) {
		
		return false;
	}
}
