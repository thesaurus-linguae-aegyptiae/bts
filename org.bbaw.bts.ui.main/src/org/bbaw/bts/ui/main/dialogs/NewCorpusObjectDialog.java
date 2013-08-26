package org.bbaw.bts.ui.main.dialogs;

import org.bbaw.bts.btsmodel.BTSCorpusObject;
import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.beans.BeanProperties;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.core.databinding.validation.IValidator;
import org.eclipse.core.databinding.validation.ValidationStatus;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.databinding.EMFUpdateValueStrategy;
import org.eclipse.jface.databinding.fieldassist.ControlDecorationSupport;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class NewCorpusObjectDialog extends TitleAreaDialog
{
	private Text text;

	private DataBindingContext bindingContext;
	private WritableValue value;

	private BTSCorpusObject object;

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
	 * Create contents of the dialog.
	 * 
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent)
	{
		Composite area = (Composite) super.createDialogArea(parent);
		Composite container = new Composite(area, SWT.NONE);
		container.setLayout(new GridLayout(4, false));
		container.setLayoutData(new GridData(GridData.FILL_BOTH));
		new Label(container, SWT.NONE);

		Label lblName = new Label(container, SWT.NONE);
		lblName.setText("Name");
		new Label(container, SWT.NONE);

		text = new Text(container, SWT.BORDER);
		text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(container, SWT.NONE);

		Label lblType = new Label(container, SWT.NONE);
		lblType.setText("Type");
		new Label(container, SWT.NONE);

		Combo combo = new Combo(container, SWT.NONE);
		combo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(container, SWT.NONE);

		Label lblSubtype = new Label(container, SWT.NONE);
		lblSubtype.setText("Subtype");
		new Label(container, SWT.NONE);

		Combo combo_1 = new Combo(container, SWT.NONE);
		combo_1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		value = new WritableValue();
		bindingContext = initializeBindings();
		value.setValue(object);

		return area;
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
				return ValidationStatus.error("Not a number");
			}
		});

		DataBindingContext bindingContext = new DataBindingContext();
		IObservableValue model = BeanProperties.value("name").observeDetail(value);
		Binding binding = bindingContext.bindValue(WidgetProperties.text(SWT.Modify).observeDelayed(400, text), model,
				us, null);

		bindingContext.addValidationStatusProvider(binding);

		ControlDecorationSupport.create(binding, SWT.TOP | SWT.LEFT);

		// FeaturePath feature =
		// FeaturePath.fromList(CorpusPackage.Literals.PERSON__PHONE,
		// CorpusPackage.Literals.PHONE__NUMBER);
		// bindingContext.bindValue(WidgetProperties.text(SWT.Modify).observe(phoneNumber),
		// EMFProperties.value(feature).observe(person));
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
