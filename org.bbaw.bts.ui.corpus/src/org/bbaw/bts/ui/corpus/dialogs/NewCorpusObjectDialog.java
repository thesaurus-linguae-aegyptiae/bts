package org.bbaw.bts.ui.corpus.dialogs;

import java.util.List;
import java.util.Vector;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BtsmodelPackage;
import org.bbaw.bts.btsviewmodel.TreeNodeWrapper;
import org.bbaw.bts.core.commons.staticAccess.StaticAccessController;
import org.bbaw.bts.core.controller.generalController.EditingDomainController;
import org.bbaw.bts.core.controller.generalController.PermissionsAndExpressionsEvaluationController;
import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject;
import org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelPackage;
import org.bbaw.bts.ui.commons.controldecoration.BackgroundControlDecorationSupport;
import org.bbaw.bts.ui.commons.utils.BTSUIConstants;
import org.bbaw.bts.ui.commons.validator.StringNotEmptyValidator;
import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.beans.BeanProperties;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.core.databinding.validation.IValidator;
import org.eclipse.core.databinding.validation.ValidationStatus;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.di.UISynchronize;
import org.eclipse.emf.databinding.EMFUpdateValueStrategy;
import org.eclipse.emf.databinding.edit.EMFEditProperties;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.databinding.fieldassist.ControlDecorationSupport;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;

public class NewCorpusObjectDialog extends TitleAreaDialog
{
	private Text nameTxt;

	private DataBindingContext bindingContext;

	private BTSCorpusObject object;
	private Text corpusPrefixTxt;

	private EditingDomain editingDomain;

	private EditingDomainController editingDomainController;

	private IEclipseContext context;

	private Button btnCheckButton;

	protected boolean synchronize;

	private PermissionsAndExpressionsEvaluationController permisionsController;

	private UISynchronize sync;

	/**
	 * Create the dialog.
	 * 
	 * @param parentShell
	 */
	public NewCorpusObjectDialog(Shell parentShell, BTSCorpusObject[] objects)
	{
		super(parentShell);
		if (objects != null && objects.length > 0)
		{
			this.object = objects[0];
		}
	}

	/**
	 * @wbp.parser.constructor
	 */
	public NewCorpusObjectDialog(Shell parentShell, BTSCorpusObject object) {
		super(parentShell);
		this.object = object;
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
		container.setLayout(new GridLayout(3, false));
		container.setLayoutData(new GridData(GridData.FILL_BOTH));
		new Label(container, SWT.NONE);

		Label lblName = new Label(container, SWT.NONE);
		lblName.setText("Name*");

		nameTxt = new Text(container, SWT.BORDER);
		nameTxt.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(container, SWT.NONE);
		
		Label lblNewLabel = new Label(container, SWT.NONE);
		lblNewLabel.setText("Corpus Prefix*");
		
		corpusPrefixTxt = new Text(container, SWT.BORDER);
		corpusPrefixTxt.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		corpusPrefixTxt.addModifyListener(new ModifyListener() {
			
			@Override
			public void modifyText(ModifyEvent e) {
				if (corpusPrefixTxt.getText().trim().length() > 0)
				{
					final boolean enabled = btnCheckButton.isEnabled();
					final String dbColl = corpusPrefixTxt.getText();
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
										btnCheckButton.setEnabled(may);
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
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		
		btnCheckButton = new Button(container, SWT.CHECK);
		btnCheckButton.setText("Synchronize Corpus With Central Database");
		btnCheckButton.addSelectionListener(new SelectionAdapter() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				synchronize = btnCheckButton.getSelection();
				
			}
		});

		bindingContext = initializeBindings();
		
		return area;
	}

	private DataBindingContext initializeBindings()
	{
		context = StaticAccessController.getContext();
		sync = context.get(UISynchronize.class);
		editingDomainController = context.get(EditingDomainController.class);
		permisionsController = context.get(PermissionsAndExpressionsEvaluationController.class);
		editingDomain = editingDomainController.getEditingDomain(object);
		DataBindingContext bindingContext = new DataBindingContext();
		EMFUpdateValueStrategy us = new EMFUpdateValueStrategy();
		us.setBeforeSetValidator(new StringNotEmptyValidator());
		Binding binding = bindingContext.bindValue(
				WidgetProperties.text(SWT.Modify).observeDelayed(BTSUIConstants.DELAY, nameTxt),
				EMFEditProperties.value(editingDomain,
						BtsmodelPackage.Literals.BTS_OBJECT__NAME).observe(
						object), us, null);
		bindingContext.addValidationStatusProvider(binding);
		BackgroundControlDecorationSupport.create(binding, SWT.TOP | SWT.LEFT);
		
		
		Binding binding_pre = bindingContext.bindValue(
				WidgetProperties.text(SWT.Modify).observeDelayed(BTSUIConstants.DELAY, corpusPrefixTxt),
				EMFEditProperties.value(editingDomain,
						BtsCorpusModelPackage.Literals.BTS_CORPUS_OBJECT__CORPUS_PREFIX).observe(
						object), us, null);
		bindingContext.addValidationStatusProvider(binding_pre);
		BackgroundControlDecorationSupport.create(binding_pre, SWT.TOP | SWT.LEFT);

		btnCheckButton.setEnabled(permisionsController.authenticatedUserMaySyncDBColl(corpusPrefixTxt.getText()));
		
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
	
	public boolean isCorpusSynchronized()
	{
		return (synchronize);
	}

}
