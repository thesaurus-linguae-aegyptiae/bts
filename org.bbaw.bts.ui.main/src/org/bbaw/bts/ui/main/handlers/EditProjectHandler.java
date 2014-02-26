package org.bbaw.bts.ui.main.handlers;

import javax.inject.Named;

import org.bbaw.bts.btsmodel.BTSProject;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.services.BTSProjectService;
import org.bbaw.bts.ui.main.wizards.newProject.NewProjectWizard;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;

public class EditProjectHandler
{

	@Execute
	public void execute(IEclipseContext context, BTSProjectService projectService,
			@Named(BTSCoreConstants.MAIN_PROJECT) @Optional BTSProject project)
	{

		NewProjectWizard wizard = new NewProjectWizard(project, projectService);
		WizardDialog dialog = new WizardDialog(new Shell(), wizard);
		if (dialog.open() == dialog.OK)
		{
			System.out.println("project edited.");

		}
	}

}