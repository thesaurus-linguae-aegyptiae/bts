package org.bbaw.bts.ui.main.wizards.newProject;

import org.bbaw.bts.btsmodel.BTSProjectDBCollection;
import org.bbaw.bts.btsmodel.BtsmodelPackage;
import org.bbaw.bts.core.commons.staticAccess.StaticAccessController;
import org.bbaw.bts.core.controller.generalController.EditingDomainController;
import org.bbaw.bts.core.controller.generalController.PermissionsAndExpressionsEvaluationController;
import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.validation.IValidator;
import org.eclipse.core.databinding.validation.ValidationStatus;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.di.UISynchronize;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.EMFUpdateValueStrategy;
import org.eclipse.jface.databinding.fieldassist.ControlDecorationSupport;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class EditDBCollectionDialog extends TitleAreaDialog
{
	private Text text;
	private BTSProjectDBCollection collection;
	private Button btnSyncronizeCollection;
	private Button btnIndexCollectionFor;
	private IEclipseContext context;
	private UISynchronize sync;
	private PermissionsAndExpressionsEvaluationController permisionsController;
	private EditingDomainController editingDomainController;

	/**
	 * Create the dialog.
	 * 
	 * @param parentShell
	 */
	public EditDBCollectionDialog(Shell parentShell, BTSProjectDBCollection collection)
	{
		super(parentShell);
		this.collection = collection;
	}

	/**
	 * Create contents of the dialog.
	 * 
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent)
	{
		Composite area = (Composite) super.createDialogArea(parent);
		Composite container = new Composite(area, SWT.NONE);
		container.setLayout(new GridLayout(2, false));
		container.setLayoutData(new GridData(GridData.FILL_BOTH));

		Label lblDbCollectionName = new Label(container, SWT.NONE);
		lblDbCollectionName.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblDbCollectionName.setText("DB Collection Name");

		text = new Text(container, SWT.BORDER);
		text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		text.addModifyListener(new ModifyListener() {
			
			@Override
			public void modifyText(ModifyEvent e) {
				if (text.getText().trim().length() > 0)
				{
					final boolean enabled = btnSyncronizeCollection.isEnabled();
					final String dbColl = text.getText();
					Job j = new Job("check may sync"){
	
						@Override
						protected IStatus run(IProgressMonitor monitor) {
							final boolean may = permisionsController.authenticatedUserMaySyncDBColl(dbColl);
							
							if (may != enabled)
							{
								sync.asyncExec(new Runnable()
								{
									@Override
									public void run()
									{
										btnSyncronizeCollection.setEnabled(may);
									}
								});
							}
							return Status.OK_STATUS;
						}
						
					};
					j.schedule();
				}
			}
		});
		btnSyncronizeCollection = new Button(container, SWT.CHECK);
		btnSyncronizeCollection.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1));
		btnSyncronizeCollection.setText("Synchronize Collection");

		btnIndexCollectionFor = new Button(container, SWT.CHECK);
		btnIndexCollectionFor.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1));
		btnIndexCollectionFor.setText("Index Collection for Full Text Search");
		initializeBindings();

		return area;
	}

	private DataBindingContext initializeBindings()
	{
		EMFUpdateValueStrategy us = new EMFUpdateValueStrategy();
		context = StaticAccessController.getContext();
		sync = context.get(UISynchronize.class);
		editingDomainController = context.get(EditingDomainController.class);
		permisionsController = context.get(PermissionsAndExpressionsEvaluationController.class);
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

		IObservableValue model = EMFProperties.value(
				BtsmodelPackage.Literals.BTS_PROJECT_DB_COLLECTION__COLLECTION_NAME).observe(collection);
		Binding binding = bindingContext.bindValue(WidgetProperties.text(SWT.Modify).observeDelayed(400, text), model,
				us, null);
		bindingContext.addValidationStatusProvider(binding);
		ControlDecorationSupport.create(binding, SWT.TOP | SWT.LEFT);

		IObservableValue model2 = EMFProperties.value(BtsmodelPackage.Literals.BTS_PROJECT_DB_COLLECTION__SYNCHRONIZED)
				.observe(collection);
		Binding binding2 = bindingContext.bindValue(
				WidgetProperties.selection().observeDelayed(0, btnSyncronizeCollection), model2, null, null);
		bindingContext.addValidationStatusProvider(binding2);
		ControlDecorationSupport.create(binding2, SWT.TOP | SWT.LEFT);

		IObservableValue model3 = EMFProperties.value(BtsmodelPackage.Literals.BTS_PROJECT_DB_COLLECTION__INDEXED)
				.observe(collection);
		Binding binding3 = bindingContext.bindValue(
				WidgetProperties.selection().observeDelayed(0, btnIndexCollectionFor), model3, null, null);
		bindingContext.addValidationStatusProvider(binding3);
		ControlDecorationSupport.create(binding2, SWT.TOP | SWT.LEFT);

		btnSyncronizeCollection.setEnabled(permisionsController.authenticatedUserMaySyncDBColl(text.getText()));

		return bindingContext;
	}

	/**
	 * Create contents of the button bar.
	 * 
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent)
	{
		createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
		createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
	}

	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize()
	{
		return new Point(450, 300);
	}

}
