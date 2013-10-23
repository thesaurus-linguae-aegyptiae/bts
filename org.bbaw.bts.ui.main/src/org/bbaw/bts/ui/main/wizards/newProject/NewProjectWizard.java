package org.bbaw.bts.ui.main.wizards.newProject;

import org.bbaw.bts.btsmodel.BTSProject;
import org.bbaw.bts.core.services.BTSProjectService;
import org.eclipse.jface.wizard.Wizard;

public class NewProjectWizard extends Wizard
{

	private BTSProject project;
	private BTSProjectService projectService;

	public NewProjectWizard(BTSProject project, BTSProjectService projectService)
	{
		setWindowTitle("New Wizard");
		this.project = project;
		this.projectService = projectService;
	}

	@Override
	public void addPages()
	{
		addPage(new ProjectNamePage(project));
		addPage(new ProjectConnectionPage(project));
		addPage(new ProjectCollectionPage(project));
	}

	@Override
	public boolean performFinish()
	{

		projectService.save(project);
		return true;
	}

}
