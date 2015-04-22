package org.bbaw.bts.ui.main.wizards.newProject;

import org.bbaw.bts.btsmodel.BTSProject;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.btsmodel.BtsmodelPackage;
import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.validation.IValidator;
import org.eclipse.core.databinding.validation.ValidationStatus;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.EMFUpdateValueStrategy;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class ProjectConnectionPage extends WizardPage
{
	private Text txtConnectiontype;
	private Text text;

	private BTSProject project;
	private Text text_1;
	private Text textdbPath;

	/**
	 * Create the wizard.
	 * 
	 * @param project
	 */
	public ProjectConnectionPage(BTSProject project)
	{
		super("wizardPage");
		setTitle("Project Connection Settings");
		setDescription("If you have a connection to a central BTS Database, please enter the URL here.");
		this.project = project;
		if (project.getDbConnection() == null)
		{
			project.setDbConnection(BtsmodelFactory.eINSTANCE.createBTSDBConnection());
		}
	}

	/**
	 * Create contents of the wizard.
	 * 
	 * @param parent
	 */
	public void createControl(Composite parent)
	{
		Composite container = new Composite(parent, SWT.NULL);

		setControl(container);
		container.setLayout(new GridLayout(2, false));

		Label lblConntectionType = new Label(container, SWT.NONE);
		lblConntectionType.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblConntectionType.setText("Connection Type");

		txtConnectiontype = new Text(container, SWT.BORDER);
		txtConnectiontype.setText("connectionType");
		txtConnectiontype.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Label lblServerUrl = new Label(container, SWT.NONE);
		lblServerUrl.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblServerUrl.setText("Server URL");

		text = new Text(container, SWT.BORDER);
		text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Label lblDbPath = new Label(container, SWT.NONE);
		lblDbPath.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblDbPath.setText("DB Path");

		textdbPath = new Text(container, SWT.BORDER);
		textdbPath.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		initializeBindings();
	}

	private DataBindingContext initializeBindings()
	{
		EMFUpdateValueStrategy us = new EMFUpdateValueStrategy();
		us.setBeforeSetValidator(new IValidator()
		{

			@Override
			public IStatus validate(Object value)
			{
				if (value instanceof String)
				{
					if (value.toString().trim().length() > 0)
					{
						return ValidationStatus.ok();
					}
				}
				return ValidationStatus.error("Content must be at least one character");
			}
		});

		DataBindingContext bindingContext = new DataBindingContext();

		FeaturePath feature = FeaturePath.fromList(BtsmodelPackage.Literals.BTS_PROJECT__DB_CONNECTION,
				BtsmodelPackage.Literals.BTSDB_CONNECTION__TYPE);

		IObservableValue model = EMFProperties.value(feature).observe(project);
		Binding binding = bindingContext.bindValue(
				WidgetProperties.text(SWT.Modify).observeDelayed(400, txtConnectiontype), model, null, null);
		bindingContext.addValidationStatusProvider(binding);

		FeaturePath feature2 = FeaturePath.fromList(BtsmodelPackage.Literals.BTS_PROJECT__DB_CONNECTION,
				BtsmodelPackage.Literals.BTSDB_CONNECTION__MASTER_SERVER);
		IObservableValue model2 = EMFProperties.value(feature2).observe(project);
		Binding binding2 = bindingContext.bindValue(WidgetProperties.text(SWT.Modify).observeDelayed(400, text),
				model2, null, null);
		bindingContext.addValidationStatusProvider(binding2);

		FeaturePath feature3 = FeaturePath.fromList(BtsmodelPackage.Literals.BTS_PROJECT__DB_CONNECTION,
				BtsmodelPackage.Literals.BTSDB_CONNECTION__DB_PATH);
		IObservableValue model3 = EMFProperties.value(feature3).observe(project);
		Binding binding3 = bindingContext.bindValue(WidgetProperties.text(SWT.Modify).observeDelayed(400, textdbPath),
				model3, null, null);
		bindingContext.addValidationStatusProvider(binding3);

		return bindingContext;
	}
}
