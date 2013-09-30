package org.bbaw.bts.core.controller.generalController;

import java.util.List;
import java.util.Vector;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSProject;
import org.bbaw.bts.core.services.BTSProjectService;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Creatable;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.Preference;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

@Creatable
public class ApplicationStartupController
{

	@Inject
	@Optional
	@Preference(value = "active_projects", nodePath = "org.bbaw.bts.app")
	String active_projects;

	@Inject
	@Optional
	@Preference(value = "main_project", nodePath = "org.bbaw.bts.app")
	String main_project;

	@Inject
	private BTSProjectService projectService;

	private List<BTSProject> projects;

	private List<String> activeProjects;

	protected boolean projectCreated;

	void applicationStartup(IEclipseContext context, BTSProjectService projectService)
	{
		System.out.println("start up");
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

			checkProjectsSelectionsSettings();

			// login
			// Login login = new Login();
			// login.login(context);
		} else
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
}
