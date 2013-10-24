package org.bbaw.bts.core.controller.impl.generalController;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Vector;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSProject;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.commons.BTSPluginIDs;
import org.bbaw.bts.core.commons.BTSUIConstants;
import org.bbaw.bts.core.commons.InternetAccessTester;
import org.bbaw.bts.core.controller.generalController.ApplicationStartupController;
import org.bbaw.bts.core.controller.generalController.ISplashScreenController;
import org.bbaw.bts.core.services.BTSProjectService;
import org.bbaw.bts.core.services.BTSUserService;
import org.bbaw.bts.core.services.Backend2ClientUpdateService;
import org.bbaw.bts.db.DBManager;
import org.bbaw.bts.ui.main.wizards.newProject.NewProjectWizard;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.runtime.preferences.DefaultScope;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.Preference;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.e4.ui.workbench.UIEvents;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventHandler;
import org.osgi.service.prefs.Preferences;

public class ApplicationStartupControllerImpl implements ApplicationStartupController
{

	private static final String YOUR_PLUGIN_ID = "org.bbaw.bts.app";

	@Inject
	@Optional
	@Preference(value = "active_projects", nodePath = "org.bbaw.bts.app")
	private String active_projects;

	@Inject
	@Optional
	@Preference(value = "main_project", nodePath = "org.bbaw.bts.app")
	private String main_project;

	@Inject
	@Optional
	@Preference(value = "first_startup", nodePath = "org.bbaw.bts.app")
	private String first_startup;

	@Inject
	@Preference(value = "remote_db_urls", nodePath = "org.bbaw.bts.app")
	protected String remote_db_urls;

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

	private List<BTSProject> projects;

	private List<String> activeProjects;

	protected boolean projectCreated;

	private IEclipseContext context;

	@Inject
	private ISplashScreenController splashController;

	@Inject
	@Preference(nodePath = "org.bbaw.bts.dao")
	private IEclipsePreferences prefs;

	@Override
	public void applicationStartup(IEclipseContext context, BTSProjectService projectService,
			IApplicationContext appContext)
	{
		this.context = context;

		boolean dbPrepared = false;
		boolean mainProjectSet = false;
		splashController.setSplashPluginId(YOUR_PLUGIN_ID);
		splashController.setSplashImagePath("/" + "splash" + "/" + "btsStart.jpg");
		splashController.open();
		splashController.setMessage("Starting Applikation ...");

		// The should be a better way to close the Splash
		// see https://bugs.eclipse.org/bugs/show_bug.cgi?id=376821
		eventBroker.subscribe(UIEvents.UILifeCycle.ACTIVATE, new EventHandler()
		{
			@Override
			public void handleEvent(Event event)
			{
				splashController.close();
				eventBroker.unsubscribe(this);
			}
		});

		if (first_startup == null || first_startup.equals("true") || !dbManager.databaseIsInstalled())
		{
			if (InternetAccessTester.accessToURLExists(null))
			{
				// intial install dialog
				// wenn ja: möglichkeit bieten, daten vom server zu laden
				// wenn nein: hinweisen, dass vom server laden nciht möglich
				// hinweis: es kann auch lokal verwendet werden

				// wenn daten vom server: login via server, Login muss server adresse entgegen nehmen
				// login erfolgreich: akutellen Benutzer in couchdb.ini als admin eintragen

			} else
			//no internet connection available
			{

			}

			//Install db
			{
				dbManager.installDatabase("database/directory");
			}

			//if(boolean loadfromserver)

		} else
		// subsequent start
		{

		}

		//database installed

		//Konzept:
		// erster login bzw. keine db installiert:
		/// als allererstes checken, ob db installiert

		// wenn keine db installiert: prüfen, ob online

		// 
		// dann erst db installieren
		// dann db starten
		// dann mit server synchronisieren, d.h. replicatoren erstellen für project erstellen
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

		// server urls - ja, richtig, plural! - in properties schreiben!!!!!!!!!!!!!
		// letzten nutzer in properties schreiben

		// wenn nicht erststart:
		// splash zeigen
		// letzten nutzer ggfs. in login laden, kein passwort, ggfs. passwort speichern (mit sich selbst verschlüsseln)
		// wenn online und server gesetzt: login, gegen server validieren: Login zeigt auswahl aller vorhandenen server urls
		// falls nicht passt, kann eine neue eingegeben werden
		// im fall einer neuen url: wie oben
		// prüfen, ob user in couchdb.ini als lokaler admin gesetzt
		// user in _users aktualisieren

		// wenn nicht online: login nur gegen lokale benutzer
		// erklären, dass nur benutzer erlaubt sind, die sich schon mal eingelogt haben
		// db starten
		// login gegen lokale db
		// replication prüfen
		// elasticsearch...
		// gui starten
		// splash schließen
		//
		//

		try
		{
			splashController.setMessage("Prepare Database...");

			dbPrepared = dbManager.prepareDB();
		} catch (URISyntaxException e1)
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("start up yyy");
		try
		{
			projects = projectService.list();
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		// check for projects
		// Preferences prefs =
		// ConfigurationScope.INSTANCE.getNode("org.bbaw.bts.app");
		// prefs.
		System.out.println("active: " + active_projects + " main: " + main_project);
		if (active_projects != null) // active_projects are set
		{
			activeProjects = new Vector<String>();
			for (String p : active_projects.split("\\|"))
			{
				activeProjects.add(p);
			}
		}
		if (projects != null && !projects.isEmpty())
		{

			splashController.setMessage("Check Project Settings ...");

			checkProjectsSelectionsSettings();
			splashController.setMessage("Check Database Settings ...");

			checkProjectDBCollections(projects);

			for (BTSProject p : projects)
			{
				if (p.getPrefix().equals(main_project))
				{
					context.set(BTSUIConstants.MAIN_PROJECT, p);
					mainProjectSet = true;
					break;
				}
			}
			// login
			if (mainProjectSet)
			{
				splashController.close();

				// Login login = ContextInjectionFactory.make(Login.class,
				// context);
				// login.login(context, userService);
			}
		}

	}

	private void initialProjectCreation()
	{

		if (createInitialProject())
		{
			try
			{
				projects = projectService.list();
			} catch (Exception e)
			{

			}
			if (projects != null)
			{
				checkProjectsSelectionsSettings();
			}
		}
	}

	private void checkProjectDBCollections(List<BTSProject> projects)
	{
		for (BTSProject project : projects)
		{
			if (project.getDbConnection() != null)
			{
				try
				{
					dbManager.prepareDBSynchronization(project);
				} catch (MalformedURLException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			try
			{
				dbManager.prepareDBIndexing(project);
			} catch (URISyntaxException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			backend2ClientUpdateService.startListening2Updates(project);
		}

	}

	private void checkProjectsSelectionsSettings()
	{
		if (activeProjects != null)
		{
			for (String p : activeProjects)
			{
				if (checkContains(projects, p))
				{

				}
			}
		}
		if (main_project != null && main_project.trim().length() > 0)
		{
			if (!activeProjects.contains(main_project))
			{

			}
			if (checkContains(projects, main_project))
			{

			} else
			{

			}

		}

	}

	private boolean createInitialProject()
	{
		projectCreated = false;
		BTSProject project = projectService.createNew();
		final NewProjectWizard wizard = new NewProjectWizard(project, projectService);
		Realm.runWithDefault(SWTObservables.getRealm(Display.getDefault()), new Runnable()
		{
			public void run()
			{
				WizardDialog dialog = new WizardDialog(new Shell(), wizard);
				if (dialog.open() == dialog.OK)
				{
					System.out.println("new project created.");
					projectCreated = true;

				}
			}
		});
		return projectCreated;

	}

	private boolean checkContains(List<BTSProject> projs, String project)
	{
		for (BTSProject p : projs)
		{
			if (p.getPrefix() != null && p.getPrefix().equals(project))
			{
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean checkDBConnection(String urlString, String username, String password) throws MalformedURLException
	{
		return dbManager.checkConnection(urlString, username, password);
	}

	@Override
	public void setRemoteDBConnection(String url, String user, String password) throws MalformedURLException
	{
		prefs.put(BTSPluginIDs.PREF_REMOTE_DB_URL, url);
		prefs.put(BTSPluginIDs.PREF_AUTHENTICATED_USER, user);
		prefs.put(BTSPluginIDs.PREF_AUTHENTICATED_USER_PASSWORD, password);
	}

	@Override
	public List<BTSProject> loadRemoteProjects() throws MalformedURLException
	{
		return projectService.listRemoteProjects();
	}

	@Override
	public String getDBInstallationDir()
	{
		Preferences preferences = DefaultScope.INSTANCE.getNode("org.bbaw.bts.app");
		Preferences installtionPrefs = preferences.node(BTSPluginIDs.PREF_NODE_INSTALLATION);
		String dir = installtionPrefs.get(BTSPluginIDs.PREF_DB_DIR, null);
		if (dir == null || dir.startsWith("./") || dir.startsWith(".\\"))
		{
			dir = BTSConstants.BTS_HOME + BTSConstants.FS + dir.substring(2, dir.length());
			System.out.println(dir);

		}
		return dir;
	}
}
