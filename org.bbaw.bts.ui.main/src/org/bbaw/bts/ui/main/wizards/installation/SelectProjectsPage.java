package org.bbaw.bts.ui.main.wizards.installation;

import java.net.MalformedURLException;
import java.util.List;
import java.util.Vector;

import org.bbaw.bts.btsmodel.BTSProject;
import org.bbaw.bts.core.controller.generalController.ApplicationStartupController;
import org.bbaw.bts.ui.main.wizards.installation.support.BTSProjectLabelProvider;
import org.bbaw.bts.ui.main.wizards.installation.support.BTSProjectRemovableContentProvider;
import org.bbaw.bts.ui.main.wizards.newProject.viewSupport.ListContentProvider;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.mihalis.opal.itemSelector.DLItem;

import com.richclientgui.toolbox.duallists.DualListComposite;

public class SelectProjectsPage extends WizardPage
{

	private ApplicationStartupController startupController;
	private List<BTSProject> projects;
	private List<DLItem> items;
	private DualListComposite<BTSProject> duallistcomposite;
	private BTSProjectRemovableContentProvider chrosenProvider;
	private boolean loaded;
	private String main_project;
	private String active_projects;
	private ComboViewer comboViewer;
	private BTSProject selectedProject;

	/**
	 * Create the wizard.
	 * 
	 * @param active_projects
	 * @param main_project
	 */
	public SelectProjectsPage(String main_project, String active_projects)
	{
		super("wizardPage");
		this.main_project = main_project;
		this.active_projects = active_projects;
		setTitle("Select Projects to Load");
		setDescription("Your connection information is valid and you user login is correct. You can now select projects from the server which you want to load from the server.");
	}

	/**
	 * Create contents of the wizard.
	 * 
	 * @param parent
	 */
	public void createControl(Composite parent)
	{
		startupController = ((InstallationWizard) getWizard()).getStartupController();
		Composite container = new Composite(parent, SWT.NULL);

		setControl(container);
		container.setLayout(new GridLayout(1, false));

		Group grpYourMainWorking = new Group(container, SWT.NONE);
		grpYourMainWorking.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
		grpYourMainWorking.setText("Your main working project to which you contribute data");
		grpYourMainWorking.setLayout(new GridLayout(2, false));

		Label lblSelectYourMain = new Label(grpYourMainWorking, SWT.NONE);
		lblSelectYourMain.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblSelectYourMain.setText("Select your main working project");

		comboViewer = new ComboViewer(grpYourMainWorking, SWT.None);
		comboViewer.getControl().setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		ComposedAdapterFactory factory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		AdapterFactoryLabelProvider labelProvider = new AdapterFactoryLabelProvider(factory);
		comboViewer.setContentProvider(new ListContentProvider());
		comboViewer.setLabelProvider(labelProvider);
		comboViewer.addSelectionChangedListener(new ISelectionChangedListener()
		{

			@Override
			public void selectionChanged(SelectionChangedEvent event)
			{
				Object o = event.getSelection();
				IStructuredSelection sel = (IStructuredSelection) o;
				selectedProject = (BTSProject) sel.getFirstElement();
				if (selectedProject != null)
				{
					main_project = selectedProject.getPrefix();
				}

			}
		});

		Group grpFurtherProjectsFrom = new Group(container, SWT.NONE);
		grpFurtherProjectsFrom.setLayout(new GridLayout(1, false));
		grpFurtherProjectsFrom.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		grpFurtherProjectsFrom.setText("Further projects from which you want to load and read data");

		duallistcomposite = new DualListComposite<BTSProject>(grpFurtherProjectsFrom, SWT.NONE);
		duallistcomposite.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true, true));
		duallistcomposite.setBackground(grpFurtherProjectsFrom.getBackground());
	}

	private void loadListInput()
	{
		try
		{
			startupController.setRemoteDBConnection(((InstallationWizard) getWizard()).getRemoteConnection().getUrl(),
					((InstallationWizard) getWizard()).getRemoteConnection().getUser(),
					((InstallationWizard) getWizard()).getRemoteConnection().getPassword());
		} catch (MalformedURLException e1)
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try
		{
			projects = startupController.loadRemoteProjects();
			comboViewer.setInput(projects);
			List<BTSProject> availableProjects = new Vector<BTSProject>(1);

			List<BTSProject> chosenProjects = new Vector<BTSProject>(1);
			if (active_projects != null && active_projects.trim().length() > 0)
			{
				String[] pros = active_projects.split("\\|");

				for (BTSProject pp : projects)
				{

					boolean found = false;
					if (main_project != null && main_project.equals(pp.getPrefix()))
					{
						comboViewer.setSelection(new StructuredSelection(pp));
					}
					for (String p : pros)
					{
						if (p.equals(pp.getPrefix()))
						{
							chosenProjects.add(pp);
							found = true;
							break;
						}
					}
					if (!found)
					{
						availableProjects.add(pp);
					}
				}

			}

			duallistcomposite.setAvailableContentProvider(new BTSProjectRemovableContentProvider(availableProjects));
			duallistcomposite.setAvailableLabelProvider(new BTSProjectLabelProvider());
			chrosenProvider = new BTSProjectRemovableContentProvider(chosenProjects);
			duallistcomposite.setChosenContentProvider(chrosenProvider);
			duallistcomposite.setChosenLabelProvider(new BTSProjectLabelProvider());
		} catch (MalformedURLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loaded = true;

	}

	@Override
	public void setVisible(boolean visible)
	{
		// TODO Auto-generated method stub
		super.setVisible(visible);
		if (visible && !loaded)
		{
			loadListInput();
		} else if (!visible && loaded)
		{
			((InstallationWizard) getWizard()).setActiveProjects(getActiveProjectSelectionsAsStringList());
			((InstallationWizard) getWizard()).setMainProject(getMainProject());

		}
	}

	private String getMainProject()
	{
		return main_project;
	}

	private List<String> getActiveProjectSelectionsAsStringList()
	{
		List<String> prefixes = new Vector<String>();
		List<BTSProject> selections = chrosenProvider.getInputElements();
		for (BTSProject project : selections)
		{
			if (project.getPrefix() != null)
			{
				prefixes.add(project.getPrefix());
			}
		}
		return prefixes;
	}

}
