package org.bbaw.bts.ui.corpus.parts;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSCorpusObject;
import org.bbaw.bts.btsmodel.BTSPassport;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.beans.BeanProperties;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.core.databinding.validation.IValidator;
import org.eclipse.core.databinding.validation.ValidationStatus;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.EventTopic;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.emf.databinding.EMFUpdateValueStrategy;
import org.eclipse.jface.databinding.fieldassist.ControlDecorationSupport;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class PassportEditor
{
	public static final String ID = "org.bbaw.bts.test1.views.PassportEditor"; //$NON-NLS-1$
	private Text text_6;
	private Text text_7;
	private Text text_8;
	private Text text_9;
	private Text text_10;
	private Text text_11;
	private Label lblTitel;

	private BTSPassport passport;

	private Text textName;

	private Text provKey;

	private Text provCode;

	private Text provTerm;

	private Text provType;

	private Text bibliotText;
	private BTSCorpusObject object;
	private DataBindingContext m_bindingContext;
	private WritableValue value;

	public PassportEditor()
	{
	}

	/**
	 * Create contents of the view part.
	 * 
	 * @param parent
	 */
	@PostConstruct
	public void createPartControl(Composite parent)
	{
		Composite container = new Composite(parent, SWT.NONE);
		{
			Composite composite = new Composite(container, SWT.NONE);
			composite.setBounds(0, 0, 901, 314);

			Group grpName = new Group(composite, SWT.NONE);
			grpName.setText("Name");
			grpName.setBounds(10, 0, 482, 129);

			textName = new Text(grpName, SWT.BORDER);
			textName.setBounds(45, 32, 371, 19);

			lblTitel = new Label(grpName, SWT.NONE);
			lblTitel.setBounds(10, 35, 29, 13);
			lblTitel.setText("Titel");

			Label lblBibliographie = new Label(grpName, SWT.NONE);
			lblBibliographie.setBounds(10, 57, 70, 13);
			lblBibliographie.setText("Bibliographie");

			bibliotText = new Text(grpName, SWT.BORDER);
			bibliotText.setBounds(10, 76, 406, 43);

			Group grpProvenance = new Group(composite, SWT.NONE);
			grpProvenance.setText("Provenance");
			grpProvenance.setBounds(10, 135, 482, 80);

			Label lblType = new Label(grpProvenance, SWT.NONE);
			lblType.setBounds(10, 29, 29, 13);
			lblType.setText("Type");

			provType = new Text(grpProvenance, SWT.BORDER);
			provType.setBounds(53, 26, 76, 19);

			Label lblKey = new Label(grpProvenance, SWT.NONE);
			lblKey.setBounds(151, 26, 29, 13);
			lblKey.setText("Key");

			provKey = new Text(grpProvenance, SWT.BORDER);
			provKey.setBounds(202, 26, 76, 19);

			Label lblNewLabel = new Label(grpProvenance, SWT.NONE);
			lblNewLabel.setBounds(298, 26, 29, 13);
			lblNewLabel.setText("code");

			provCode = new Text(grpProvenance, SWT.BORDER);
			provCode.setBounds(333, 26, 76, 19);

			Label lblTerm = new Label(grpProvenance, SWT.NONE);
			lblTerm.setBounds(10, 51, 29, 13);
			lblTerm.setText("Term");

			provTerm = new Text(grpProvenance, SWT.BORDER);
			provTerm.setBounds(53, 51, 145, 19);

			Label lblHierarchy = new Label(grpProvenance, SWT.NONE);
			lblHierarchy.setBounds(212, 51, 49, 13);
			lblHierarchy.setText("Hierarchy");

			text_6 = new Text(grpProvenance, SWT.BORDER);
			text_6.setBounds(273, 51, 136, 19);

			Group grpDepiction = new Group(composite, SWT.NONE);
			grpDepiction.setText("Depiction");
			grpDepiction.setBounds(10, 221, 482, 80);

			Label label = new Label(grpDepiction, SWT.NONE);
			label.setText("Type");
			label.setBounds(10, 29, 29, 13);

			text_7 = new Text(grpDepiction, SWT.BORDER);
			text_7.setBounds(53, 26, 76, 19);

			Label label_1 = new Label(grpDepiction, SWT.NONE);
			label_1.setText("Key");
			label_1.setBounds(151, 26, 29, 13);

			text_8 = new Text(grpDepiction, SWT.BORDER);
			text_8.setBounds(202, 26, 76, 19);

			Label label_2 = new Label(grpDepiction, SWT.NONE);
			label_2.setText("code");
			label_2.setBounds(298, 26, 29, 13);

			text_9 = new Text(grpDepiction, SWT.BORDER);
			text_9.setBounds(333, 26, 76, 19);

			Label label_3 = new Label(grpDepiction, SWT.NONE);
			label_3.setText("Term");
			label_3.setBounds(10, 51, 29, 13);

			text_10 = new Text(grpDepiction, SWT.BORDER);
			text_10.setBounds(53, 51, 145, 19);

			Label label_4 = new Label(grpDepiction, SWT.NONE);
			label_4.setText("Hierarchy");
			label_4.setBounds(212, 51, 49, 13);

			text_11 = new Text(grpDepiction, SWT.BORDER);
			text_11.setBounds(273, 51, 136, 19);
		}
		value = new WritableValue();
		initDataBindings();

	}

	@Inject
	@Optional
	void eventReceived(@EventTopic("viewcommunication/*") ISelection selection)
	{
		Object o = ((StructuredSelection) selection).getFirstElement();
		// if (o instanceof BTSCorpusObject)
		// {
		// loadInput((BTSCorpusObject) o);
		// }
		System.out.println("Passport selection received");

	}

	private void loadInput(BTSCorpusObject o)
	{
		if (m_bindingContext != null)
		{
			m_bindingContext.updateModels();
		}
		object = o;
		passport = o.getPassport();

		if (passport == null)
		{
			o.setPassport(BtsmodelFactory.eINSTANCE.createBTSPassport());
		}

		bibliotText.setText(passport.getBibliography());
		value.setValue(o);
	}

	@Focus
	public void setFocus()
	{
		textName.setFocus();
	}

	protected DataBindingContext initDataBindings()
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
		Binding binding = bindingContext.bindValue(WidgetProperties.text(SWT.Modify).observeDelayed(400, textName),
				model, us, null);

		bindingContext.addValidationStatusProvider(binding);

		ControlDecorationSupport.create(binding, SWT.TOP | SWT.LEFT);

		// FeaturePath feature =
		// FeaturePath.fromList(CorpusPackage.Literals.PERSON__PHONE,
		// CorpusPackage.Literals.PHONE__NUMBER);
		// bindingContext.bindValue(WidgetProperties.text(SWT.Modify).observe(phoneNumber),
		// EMFProperties.value(feature).observe(person));
		return bindingContext;
	}
}
