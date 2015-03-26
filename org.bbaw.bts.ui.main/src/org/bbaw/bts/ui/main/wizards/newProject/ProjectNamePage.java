package org.bbaw.bts.ui.main.wizards.newProject;

import org.bbaw.bts.btsmodel.BTSProject;
import org.bbaw.bts.btsmodel.BtsmodelPackage;
import org.bbaw.bts.ui.commons.controldecoration.BackgroundControlDecorationSupport;
import org.bbaw.bts.ui.commons.validator.StringRegexValidator;
import org.eclipse.core.databinding.AggregateValidationStatus;
import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.ChangeEvent;
import org.eclipse.core.databinding.observable.IChangeListener;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.validation.IValidator;
import org.eclipse.core.databinding.validation.ValidationStatus;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.EMFUpdateValueStrategy;
import org.eclipse.jface.databinding.fieldassist.ControlDecorationSupport;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class ProjectNamePage extends WizardPage
{
	private Text txtProjectnametext;
	private Text txtPrefixtext;

	private BTSProject project;
	private Text txtDescription;
	private Label errorLabelServer;
	private IObservableValue uiElement;

	/**
	 * Create the wizard.
	 * 
	 * @param project
	 */
	public ProjectNamePage(BTSProject project)
	{
		super("wizardPage");
		setTitle("Edit Project Name");
		setDescription("You can modify the name and description of the project.");
		this.project = project;
		if(project.eResource() == null)
		{
			setDescription("You can modify the name and description of the project. Project prefix may not be modified after initial creation.");
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

		Label lblProjectName = new Label(container, SWT.NONE);
		lblProjectName.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblProjectName.setText("Project Name");

		txtProjectnametext = new Text(container, SWT.BORDER);
		txtProjectnametext.setText("projectNameText");
		txtProjectnametext.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Label lblProjectPreffix = new Label(container, SWT.NONE);
		lblProjectPreffix.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblProjectPreffix.setText("Project Preffix");

		txtPrefixtext = new Text(container, SWT.BORDER);
		txtPrefixtext.setText("prefixText");
		txtPrefixtext.setToolTipText("Enter prefix containing only small characters and integers,\nno whitespace, no special characters!");
		txtPrefixtext.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Label lblDescription = new Label(container, SWT.NONE);
		lblDescription.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblDescription.setText("Description");

		txtDescription = new Text(container, SWT.BORDER | SWT.WRAP | SWT.MULTI);
		txtDescription.setText("description");
		txtDescription.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));

		errorLabelServer = new Label(container, SWT.NONE);
		errorLabelServer.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		errorLabelServer.setText("OK");
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

		final DataBindingContext bindingContext = new DataBindingContext();

		IObservableValue model = EMFProperties.value(BtsmodelPackage.Literals.BTS_OBJECT__NAME).observe(project);
		Binding binding = bindingContext.bindValue(
				WidgetProperties.text(SWT.Modify).observeDelayed(400, txtProjectnametext), model, us, null);
//		bindingContext.addValidationStatusProvider(binding);
		BackgroundControlDecorationSupport.create(binding, SWT.TOP | SWT.LEFT);

		EMFUpdateValueStrategy us_prefix = new EMFUpdateValueStrategy();
		us_prefix.setBeforeSetValidator(new StringRegexValidator("^[a-z0-9]+$"));
		IObservableValue model2 = EMFProperties.value(BtsmodelPackage.Literals.BTS_PROJECT__PREFIX).observe(project);
		Binding binding2 = bindingContext.bindValue(WidgetProperties.text(SWT.Modify)
				.observeDelayed(400, txtPrefixtext), model2, us_prefix, null);
		
//		bindingContext.addValidationStatusProvider(binding2);
		BackgroundControlDecorationSupport.create(binding2, SWT.TOP | SWT.LEFT);
		txtPrefixtext.setEnabled((project.eResource() == null));

		IObservableValue model3 = EMFProperties.value(BtsmodelPackage.Literals.BTS_PROJECT__DESCRIPTION).observe(
				project);
		Binding binding3 = bindingContext.bindValue(
				WidgetProperties.text(SWT.Modify).observeDelayed(400, txtDescription), model3, null, null);
		bindingContext.addValidationStatusProvider(binding3);
		ControlDecorationSupport.create(binding2, SWT.TOP | SWT.LEFT);

		//
		uiElement = SWTObservables.observeText(errorLabelServer);
		// This one listenes to all changes
		bindingContext.bindValue(uiElement, new AggregateValidationStatus(bindingContext.getBindings(),
				AggregateValidationStatus.MAX_SEVERITY), null, null);
		// Lets change the color of the field lastName
		uiElement.addChangeListener(new IChangeListener()
		{
			@Override
			public void handleChange(ChangeEvent event)
			{
				boolean allcomplete = true;
				for (Object o : bindingContext.getBindings())
				{
					Binding binding = (Binding) o;
					IStatus status = (IStatus) binding.getValidationStatus().getValue();

					if (!status.isOK())
					{
						allcomplete = false;
					}
				}
				setPageComplete(allcomplete);

			}
		});
		uiElement.setValue("");
		return bindingContext;
	}
}
