package org.bbaw.bts.ui.main.wizards.installation;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

import org.bbaw.bts.btsmodel.BTSProject;
import org.bbaw.bts.core.controller.generalController.ApplicationStartupController;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.mihalis.opal.itemSelector.DLItem;
import org.mihalis.opal.itemSelector.DualList;

public class SelectProjectsPage extends WizardPage
{

	private ApplicationStartupController startupController;

	/**
	 * Create the wizard.
	 */
	public SelectProjectsPage()
	{
		super("wizardPage");
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

		Combo comboMainProject = new Combo(grpYourMainWorking, SWT.NONE);
		comboMainProject.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Group grpFurtherProjectsFrom = new Group(container, SWT.NONE);
		grpFurtherProjectsFrom.setLayout(new GridLayout(1, false));
		grpFurtherProjectsFrom.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		grpFurtherProjectsFrom.setText("Further projects from which you want to load and read data");

		DualList dualList = new DualList(grpFurtherProjectsFrom, SWT.NONE);
		dualList.addSelectionListener(new SelectionListener()
		{

			@Override
			public void widgetSelected(final SelectionEvent e)
			{
				System.out.println("Selection Listener called");

			}

			@Override
			public void widgetDefaultSelected(final SelectionEvent e)
			{

			}
		});

		dualList.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true, true));
		loadListInput();

	}

	private void loadListInput()
	{
		try
		{
			List<BTSProject> projects = startupController.loadRemoteProjects(((InstallationWizard) getWizard())
					.getRemoteConnection().getUrl(),
					((InstallationWizard) getWizard()).getRemoteConnection().getUser(),
					((InstallationWizard) getWizard()).getRemoteConnection().getPassword());
		} catch (MalformedURLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private List createItems()
	{
		final List<DLItem> list = new ArrayList<DLItem>();

		list.add(new DLItem("Austria", createImage(shell, "austria")));

		return list;
	}

}
