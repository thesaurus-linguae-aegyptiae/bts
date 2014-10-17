package org.bbaw.bts.core.controller.impl.generalController;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Calendar;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

import javax.inject.Inject;

import org.bbaw.bts.app.login.Login;
import org.bbaw.bts.btsmodel.BTSProject;
import org.bbaw.bts.btsmodel.BTSUser;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.commons.BTSPluginIDs;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.commons.staticAccess.StaticAccessController;
import org.bbaw.bts.core.controller.generalController.ApplicationStartupController;
import org.bbaw.bts.core.controller.generalController.BTSUserController;
import org.bbaw.bts.core.controller.generalController.ExtensionStartUpController;
import org.bbaw.bts.core.controller.generalController.ISplashScreenController;
import org.bbaw.bts.core.controller.generalController.PermissionsAndExpressionsEvaluationController;
import org.bbaw.bts.core.services.BTSProjectService;
import org.bbaw.bts.core.services.BTSUserService;
import org.bbaw.bts.core.services.Backend2ClientUpdateService;
import org.bbaw.bts.db.DBManager;
import org.bbaw.bts.ui.font.BTSFontManager;
import org.bbaw.bts.ui.main.wizards.installation.InstallationWizard;
import org.bbaw.bts.ui.main.wizards.newProject.NewProjectWizard;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.core.runtime.preferences.ConfigurationScope;
import org.eclipse.core.runtime.preferences.DefaultScope;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.e4.core.services.log.Logger;
import org.eclipse.e4.ui.di.UISynchronize;
import org.eclipse.e4.ui.workbench.IWorkbench;
import org.eclipse.e4.ui.workbench.UIEvents;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.equinox.p2.core.IProvisioningAgent;
import org.eclipse.equinox.p2.operations.ProvisioningJob;
import org.eclipse.equinox.p2.operations.ProvisioningSession;
import org.eclipse.equinox.p2.operations.Update;
import org.eclipse.equinox.p2.operations.UpdateOperation;
import org.eclipse.equinox.security.storage.ISecurePreferences;
import org.eclipse.equinox.security.storage.SecurePreferencesFactory;
import org.eclipse.equinox.security.storage.StorageException;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventHandler;
import org.osgi.service.prefs.BackingStoreException;

public class ApplicationStartupControllerImpl implements
		ApplicationStartupController {

	private static final String PLUGIN_ID = "org.bbaw.bts.app";



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

	// configurationscope preferences
	private IEclipsePreferences prefs = ConfigurationScope.INSTANCE.getNode(PLUGIN_ID);

	private String main_project_key;
	private String active_projects;
	private String first_startup;
	protected String remote_db_urls;
	protected String db_installation_dir;
	
	
	@Inject
	private BTSUserController userController;

//	@Inject
//	private BTSTextCorpusService textCorpusService;

	private String localDBUrl;

	@Override
	public void applicationStartup(final IEclipseContext context,
			final BTSProjectService projectService, IApplicationContext appContext) {
		this.context = context;
		logger.info("Logging - debug, debug enabled: " + logger.isDebugEnabled());
		logger.info("Logging - info, info enabled: " + logger.isInfoEnabled());
		logger.error("Logging - error");
		logger.warn("Logging - warn");
		logger.trace("Logging - trace");


		loadPreferences(context);
		
		//check and set application uuid
		if (prefs.get(BTSConstants.BTS_UUID, null) == null)
		{
			Calendar now = Calendar.getInstance();
			String uuid = new Long(now.getTimeInMillis()).toString();
			prefs.put(BTSConstants.BTS_UUID, uuid);
			try {
				prefs.flush();
			} catch (BackingStoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		// load font
		Font font = null;
		
		font = fontManager.getFont("BBAWLibertine");//"BBAWLibertine");
		logger.info("Font loadded - font: " + font);
		if (font != null && font.getFontData() != null && font.getFontData()[0] != null) {
			font.getFontData()[0].setHeight(12);
			JFaceResources.getFontRegistry().put(
					JFaceResources.DEFAULT_FONT,
					new FontData[] {  font.getFontData()[0] });
//			Font f = JFaceResources.getFontRegistry().get(
//					JFaceResources.DEFAULT_FONT);
//			 Font f2 = JFaceResources.getDefaultFont();
//			 Font f3 = JFaceResources.getFont("BBAWLibertine");
//			 System.out.println(f +"="+ f2 +"="+ f3 +"="+ font);
//			 for (Object s : JFaceResources.getFontRegistry().getKeySet())
//			 {
//				 System.out.println(s);
//			 }
		}
		
		System.out.println("Test sonderzeichen string: \uF0080 \uF0081 \uF0082 \u13379 \u13379a" );
//		else
//		{
//			font = JFaceResources.getFontRegistry().get("Times New Roman");
//			JFaceResources.getFontRegistry().put(
//					JFaceResources.DEFAULT_FONT,
//					new FontData[] {  font.getFontData()[0] });
//			Font f = JFaceResources.getFontRegistry().get(
//					JFaceResources.DEFAULT_FONT);
//			 Font f2 = JFaceResources.getDefaultFont();
//			 Font f3 = JFaceResources.getFont("BBAWLibertine");
//			 System.out.println(f +"="+ f2 +"="+ f3 +"="+ font);
//			 for (Object s : JFaceResources.getFontRegistry().getKeySet())
//			 {
//				 System.out.println(s);
//			 }
//		}
//		FontData[] fds = Display.getCurrent().getFontList(null, true);
//		{
//			for (FontData f : fds)
//			{
//				System.out.println(f.toString());
//				if (f.toString().startsWith("BBAWLibertine"))
//				{
//					JFaceResources.getFontRegistry().put(
//							JFaceResources.DEFAULT_FONT,
//							new FontData[] {  f });
//				}
//			}
//		}
		System.out.println(font);
		splashController.setSplashPluginId(PLUGIN_ID);
		splashController.setSplashImagePath("/" + "splash" + "/"
				+ "btsStart.jpg");
		splashController.open();
		splashController.setMessage("Starting Applikation ...");

		
		
		// The should be a better way to close the Splash
		eventBroker.subscribe(UIEvents.UILifeCycle.ACTIVATE,
				new EventHandler() {
					@Override
					public void handleEvent(Event event) {
						context
								.get(StaticAccessController.class);
						context
								.get(PermissionsAndExpressionsEvaluationController.class);
						IProvisioningAgent agent = context.get(IProvisioningAgent.class);
						IWorkbench workbench = context.get(IWorkbench.class);
						logger.info("IProvisioningAgent loaded: " + (agent != null) + ", IWorkbench loaded: " + (workbench != null));
						//automated software update
						//FIXME
// 						checkAndInstallSoftwareUpdates(agent, workbench);

						// extension specific startup routines
						ExtensionStartUpController[] conrollers = null;
						try {
							conrollers = loadExtensionStartUpControllers(context);
						} catch (CoreException e) {
							logger.error(e);
						}
						if (conrollers != null)
						{
							for (ExtensionStartUpController c : conrollers)
							{
								try {
									c.startup();
								} catch (Exception e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
						}
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
				logger.error(e);
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
								prefs.put("first_startup", "false");
								try {
									prefs.flush();
								} catch (BackingStoreException e) {
									logger.error(e);
								}
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
				boolean started = dbManager.startDatabase(db_installation_dir, null);
				logger.info("Database successfully started: " + started);
			} catch (Exception e2) {
				e2.printStackTrace();
			}

			//##############dev##################
//			rememberedUsername = "admin";
//			remembered = "admin";
			//##############dev##################
			// check for remembered
			
			boolean loggedIn = false;
			ISecurePreferences secPrefs = SecurePreferencesFactory.getDefault().node(PLUGIN_ID);
			ISecurePreferences rememberedMe = secPrefs.node("rememberedMe");
			
			String rememberedUsername = null;
			String rememberedPass = null;
			try {
				rememberedUsername = rememberedMe.get("rememberedUsername", null);
				rememberedPass  = rememberedMe.get("remembered", null);
			} catch (StorageException e1) {
				e1.printStackTrace();
			}
			if (rememberedUsername != null
					&& !"".equals(rememberedUsername)
					&& rememberedPass != null
					&& userService
							.setAuthentication(rememberedUsername, rememberedPass)) {
				logger.info("Last login from remember me service. Username: " + rememberedUsername);
				
				try {
					List<BTSUser> users = userController.listAll(rememberedUsername, rememberedPass);
					for (BTSUser u : users) {
						if (rememberedUsername.equals(u.getUserName())) { // FIXME
																			// password
																			// checking
							// && equalsPassword(u,
							// passWord)) {
							logger.info("Last login from remember me service. User found.");
							userController.setAuthentication(rememberedUsername, rememberedPass);
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
				sync.syncExec(new Runnable()
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

		
		
		try {
			splashController.setMessage("Prepare Database...");

			dbManager.prepareDB();
		} catch (URISyntaxException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			projects = projectService.list(BTSConstants.OBJECT_STATE_ACTIVE);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// check for projects
		// Preferences prefs =
		// ConfigurationScope.INSTANCE.getNode(PLUGIN_ID);
		// prefs.
		System.out.println("active: " + active_projects + " main: "
				+ main_project_key);
		if (active_projects == null || "".equals(active_projects)) // active_projects are set
		{
			active_projects = main_project_key;
		}
		
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

			context.declareModifiable(BTSCoreConstants.MAIN_PROJECT);
			for (BTSProject p : projects) {
				if (p.getPrefix().equals(main_project_key)) {
					context.set(BTSCoreConstants.MAIN_PROJECT, p);
					break;
				}
			}
//			// login
//			if (mainProjectSet) {
//				splashController.close();
//
//			}
			
			
//			checkCorpusSelectionSettings();
		}
		prefs.put(BTSPluginIDs.PREF_ACTIVE_PROJECTS, active_projects);
		try {
			prefs.flush();
		} catch (BackingStoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
		
		

		
		

		

		

	}

//	private void checkCorpusSelectionSettings() {
//		main_corpus_key = ConfigurationScope.INSTANCE.getNode(PLUGIN_ID).get(BTSPluginIDs.PREF_MAIN_CORPUS_KEY, null);
//		logger.info("checkCorpusSelectionSettings: main_project_key : " + main_project_key + ", main_corpus_key: " + main_corpus_key);
//		if (main_project_key == null || "".equals(main_project_key)) return;
//
//		if (main_corpus_key == null || "".equals(main_corpus_key)) return;
//		List<BTSTextCorpus> corpora = textCorpusService.list(BTSConstants.OBJECT_STATE_ACTIVE);
//		for (BTSTextCorpus cor : corpora)
//		{
//			if (main_project_key.equals(cor.getProject()) && main_corpus_key != null && main_corpus_key.equals(cor.getCorpusPrefix()))
//			{
//				BTSTextCorpus main_corpus = cor;
//				context.set(BTSPluginIDs.PREF_MAIN_CORPUS, main_corpus);
//				break;
//			}
//		}
//		
//	}

	private void loadPreferences(IEclipseContext context2) {
		if (prefs == null) return;

		IEclipsePreferences defaultPrefs = DefaultScope.INSTANCE.getNode("org.bbaw.bts.app");
		InstanceScope.INSTANCE.getNode("org.bbaw.bts.app");
	
		main_project_key = prefs.get(BTSPluginIDs.PREF_MAIN_PROJECT_KEY, defaultPrefs.get(BTSPluginIDs.PREF_MAIN_PROJECT_KEY, null));
		
		active_projects = prefs.get(BTSPluginIDs.PREF_ACTIVE_PROJECTS,defaultPrefs.get(BTSPluginIDs.PREF_ACTIVE_PROJECTS, null));

		first_startup = prefs.get("first_startup", defaultPrefs.get("first_startup", null));;
		remote_db_urls = prefs.get("remote_db_urls", defaultPrefs.get("remote_db_urls", null));

		db_installation_dir = prefs.get(BTSPluginIDs.PREF_DB_DIR, defaultPrefs.get(BTSPluginIDs.PREF_DB_DIR, null));
		
		prefs.get(BTSPluginIDs.PREF_MAIN_CORPUS_KEY, defaultPrefs.get(BTSPluginIDs.PREF_MAIN_CORPUS_KEY, null));
//		defaultPrefs.get(BTSPluginIDs.PREF_MAIN_CORPUS_KEY, null);
		
	}

	private void checkAndInstallSoftwareUpdates(final IProvisioningAgent agent, final IWorkbench workbench) {
		Job j = new Job("Update Job") {
		      private boolean doInstall = false;

		      @Override
		      protected IStatus run(final IProgressMonitor monitor) {

		        /* 1. Prepare update plumbing */

		        final ProvisioningSession session = new ProvisioningSession(agent);
		        final UpdateOperation operation = new UpdateOperation(session);

		        // create uri
		        String urlString = prefs.get(BTSPluginIDs.PREF_P2_UPDATE_SITE, BTSConstants.DEFAULT_PREF_P2_UPDATE_SITE);
		        logger.info("P2_UPDATE_SITE url " + urlString);
		        URI uri = null;
		        try {
		          uri = new URI(urlString);
		        } catch (final URISyntaxException e) {
		          return Status.CANCEL_STATUS;
		        }

		        // set location of artifact and metadata repo
		        operation.getProvisioningContext().setArtifactRepositories(new URI[] { uri });
		        operation.getProvisioningContext().setMetadataRepositories(new URI[] { uri });
		        /* 2. check for updates */


				SubMonitor sub = SubMonitor.convert(new NullProgressMonitor(), "Checking for application updates...", 200);
				IStatus status2 = operation.resolveModal(sub.newChild(100));
		        logger.info("P2 Update Status : " + status2.getCode());

		        // run update checks causing I/O
		        final IStatus status = operation.resolveModal(monitor);

		        logger.info("P2 Update Status : " + status.getCode());
		        // failed to find updates (inform user and exit)
		        if (status.getCode() == UpdateOperation.STATUS_NOTHING_TO_UPDATE) {
		          return Status.OK_STATUS;
		        }

		        /* 3. Ask if updates should be installed and run installation */

		        // found updates, ask user if to install?
		        if (status.isOK() && status.getSeverity() != IStatus.ERROR) {
		          sync.syncExec(new Runnable() {
		            @Override
		            public void run() {
		              String updates = "";
		              Update[] possibleUpdates = operation
		                  .getPossibleUpdates();
		              for (Update update : possibleUpdates) {
		                updates += update + "\n";
		              }
		              doInstall = MessageDialog.openQuestion(new Shell(),
		                  "Really install updates?", updates);
		            }
		          });
		        }

		        // start installation
		        if (doInstall) {
		          final ProvisioningJob provisioningJob = operation
		              .getProvisioningJob(monitor);
		          // updates cannot run from within Eclipse IDE!!!
		          if (provisioningJob == null) {
		            System.err
		                .println("Running update from within Eclipse IDE? This won't work!!!");
		            throw new NullPointerException();
		          }

		          // register a job change listener to track
		          // installation progress and notify user upon success
		          provisioningJob
		              .addJobChangeListener(new JobChangeAdapter() {
		                @Override
		                public void done(IJobChangeEvent event) {
		                  if (event.getResult().isOK()) {
		                    sync.syncExec(new Runnable() {

		                      @Override
		                      public void run() {
		                        boolean restart = MessageDialog
		                            .openQuestion(new Shell(),
		                                "Updates installed, restart?",
		                                "Updates have been installed successfully, do you want to restart?");
		                        if (restart) {
		                          workbench.restart();
		                        }
		                      }
		                    });

		                  }
		                  super.done(event);
		                }
		              });

		          provisioningJob.schedule();
		        }
		        return Status.OK_STATUS;
		      }
		    };
		    j.schedule();
		    try {
				j.join();
			} catch (InterruptedException e) {
				logger.error(e);
			}
		
	}

	protected boolean openInstallationWizard() {
		InstallationWizard installWizard = new InstallationWizard(context, ApplicationStartupControllerImpl.this, sync, userController);
		WizardDialog dialog = new WizardDialog(new Shell(SWT.NO_TRIM | SWT.ON_TOP), installWizard);
		if (dialog.open() == dialog.OK)
		{
			logger.info("InstallationWizard returned OK");
			localDBUrl = installWizard.getLocalDBUrl();
			dbManager.setLocalDBUrl(localDBUrl);
			context.set(BTSPluginIDs.PREF_LOCAL_DB_URL, localDBUrl);
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
		
		return true;
	}

	private void initialProjectCreation() {

		if (createInitialProject()) {
			
		}
	}

	private void checkProjectDBCollections(List<BTSProject> projects) {
		for (BTSProject project : projects) {
			if (project.getDbConnection() != null) {
				try {
					dbManager.prepareDBSynchronization(project);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			try {
				dbManager.prepareDBIndexing(project);
			} catch (URISyntaxException e) {
				e.printStackTrace();
			}
			backend2ClientUpdateService.startListening2Updates(project);
		}

	}

	private void checkProjectsSelectionsSettings() {
		if (activeProjects != null) {
			List<String> toAdd = new Vector<String>(4);
			for (String p : activeProjects) {
				if (!checkContains(projects, p)) {
					toAdd.add(p);
					if ("".equals(active_projects))
					{
						active_projects = p;
					}
					else
					{
						active_projects += "|" + p;
					}
				}
			}
			if (!toAdd.isEmpty())
			{
				activeProjects.addAll(toAdd);
			}
		}
		if (main_project_key != null && main_project_key.trim().length() > 0) {
			if (activeProjects == null)
			{
				activeProjects = new Vector<String>();
			}
			if (activeProjects != null && !activeProjects.contains(main_project_key)) {
				activeProjects.add(main_project_key);

			}
			if (checkContains(projects, main_project_key)) {


			} else {

			}

		}

	}

	private boolean createInitialProject() {
		projectCreated = false;
		final BTSProject project = projectService.createNew();
		final NewProjectWizard wizard = new NewProjectWizard(project,
				projectService);
		Realm.runWithDefault(SWTObservables.getRealm(Display.getDefault()),
				new Runnable() {
					public void run() {
						WizardDialog dialog = new WizardDialog(new Shell(SWT.NO_TRIM | SWT.ON_TOP),
								wizard);
						if (dialog.open() == dialog.OK) {
							logger.info("New project created with prefix: " + project.getPrefix());
							projectCreated = true;
						}
						else
						{
							logger.info("New project creation canceled");
							projectCreated = false;
						}
					}
				});
		// break up if no project created
		if (!projectCreated)
		{
			return false;
		}
		
		// continue with setting project settings
		main_project_key = project.getPrefix();
		if (activeProjects == null)
		{
			activeProjects = new Vector<String>();
		}
		if (!activeProjects.contains(main_project_key))
		{
			activeProjects.add(main_project_key);
		}
		
		if (active_projects == null || "".equals(active_projects))
		{
			active_projects = "";
			for (String s : activeProjects)
			{
				active_projects += s +"|";
			}
			active_projects = active_projects.substring(0, active_projects.length() -1);
		}
		else
		{
			String [] tempActPros = active_projects.split("\\|");
			Set<String> temp = new HashSet(tempActPros.length);
			String helper = "";
			for (String s : tempActPros)
			{
				temp.add(s);
				helper += s +"|";
			}
			for (String s : activeProjects)
			{
				if (!temp.contains(s))
				{
					helper += s +"|";
				}
			}
			active_projects = helper.substring(0, helper.length() -1);
		}
		
		try {
			projects = projectService
					.list(BTSConstants.OBJECT_STATE_ACTIVE);
		} catch (Exception e) {

		}
//		if (projects != null) {
//			checkProjectsSelectionsSettings();
//		}
		prefs.put(BTSPluginIDs.PREF_MAIN_PROJECT_KEY, main_project_key);
		prefs.put(BTSPluginIDs.PREF_ACTIVE_PROJECTS, active_projects);
		try {
			prefs.flush();
		} catch (BackingStoreException e) {
			logger.error(e);
		}
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
			logger.error(e);
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
			List<String> projecsToSync, String serverurl, String localDBUrl) throws Exception {
		dbManager.startDatabase(db_installation_dir, localDBUrl);
		return dbManager.synchronizeRemoteProjects(mainProject, projecsToSync, serverurl, localDBUrl);
		 
	}
	
	protected ExtensionStartUpController[] loadExtensionStartUpControllers(IEclipseContext context) throws CoreException
	{
		IConfigurationElement[] config = ((IExtensionRegistry) context.get(IExtensionRegistry.class.getName()))
				.getConfigurationElementsFor(BTSPluginIDs.EXTENSION_POINT_STARTUP_CONTROLLER);
		List<ExtensionStartUpController> controllers = new Vector<ExtensionStartUpController>(4);
		for (IConfigurationElement e : config)
		{
			final Object o = e.createExecutableExtension("class");
			if (o instanceof ExtensionStartUpController)
			{
				controllers.add((ExtensionStartUpController) o);
			}
		}
		if (!controllers.isEmpty())
		{
			return controllers.toArray(new ExtensionStartUpController[controllers.size()]);
		}
		return null;
	}
}
