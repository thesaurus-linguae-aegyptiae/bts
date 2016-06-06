package org.bbaw.bts.ui.main.widgets;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.bbaw.bts.btsmodel.BTSConfig;
import org.bbaw.bts.btsmodel.BTSConfigItem;
import org.bbaw.bts.btsmodel.BTSExternalReference;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.BTSRelation;
import org.bbaw.bts.btsmodel.BtsmodelPackage;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.controller.generalController.BTSConfigurationController;
import org.bbaw.bts.core.controller.generalController.EditingDomainController;
import org.bbaw.bts.core.controller.generalController.GeneralBTSObjectController;
import org.bbaw.bts.ui.commons.converter.BTSConfigItemToStringConverter;
import org.bbaw.bts.ui.commons.converter.BTSStringToConfigItemConverter;
import org.bbaw.bts.ui.commons.utils.BTSUIConstants;
import org.bbaw.bts.ui.main.dialogs.SearchSelectObjectDialog;
import org.bbaw.bts.ui.resources.BTSResourceProvider;
import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.Preference;
import org.eclipse.e4.ui.di.UISynchronize;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.databinding.EMFUpdateValueStrategy;
import org.eclipse.emf.databinding.edit.EMFEditProperties;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.bindings.keys.KeyStroke;
import org.eclipse.jface.bindings.keys.ParseException;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.databinding.viewers.ViewersObservables;
import org.eclipse.jface.fieldassist.ContentProposalAdapter;
import org.eclipse.jface.fieldassist.ControlDecoration;
import org.eclipse.jface.fieldassist.FieldDecorationRegistry;
import org.eclipse.jface.fieldassist.IContentProposal;
import org.eclipse.jface.fieldassist.IContentProposalListener;
import org.eclipse.jface.fieldassist.IContentProposalProvider;
import org.eclipse.jface.fieldassist.TextContentAdapter;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class IdentifierEditorComposite extends Composite {
	@Inject
	@Optional
	private BTSConfigItem itemConfig;
	
	@Inject
	private IEclipseContext context;

	@Inject
	private EditingDomainController editingDomainController;

	@Inject
	private BTSExternalReference reference;

	@Inject
	private BTSConfigurationController configurationController;


	@Inject
	private BTSResourceProvider resourceProvider;
	
	@Inject
	@Optional
	@Preference(value = "locale_lang", nodePath = "org.bbaw.bts.app")
	private String lang;
	
	@Inject
	private BTSObject corpusObject;


	@Inject
	@Optional
	@Named(BTSCoreConstants.CORE_EXPRESSION_MAY_EDIT)
	protected boolean userMayEdit;
	
	// get UISynchronize injected as field
	@Inject
	private UISynchronize sync;
	
	private Text referenceText;
	
	private Text typeText;

	private boolean loaded;

	private ComboViewer selectComboViewer;

	@Inject
	private GeneralBTSObjectController generalObjectController;

	/**
	 * Create the composite.
	 * 
	 * @param parent
	 * @param style
	 */
	@Inject
	public IdentifierEditorComposite(Composite parent) {
		super(parent, SWT.BORDER);
		setLayout(new GridLayout(6, false));
		this.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, true, 1, 1));
		((GridLayout) this.getLayout()).marginWidth = 0;
		((GridLayout) this.getLayout()).marginHeight = 0;

		this.setBackground(parent.getBackground());
	}

	@PostConstruct
	public void postContstruct() {

		loadInput(itemConfig);

	}

	private void loadInput(BTSConfigItem itemConfig2) {

		Label lblPredicate = new Label(this, SWT.NONE);
		lblPredicate.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
				false, 1, 1));
		lblPredicate.setText("Provider");

		Combo combo = new Combo(this, SWT.READ_ONLY);
		combo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2,
				1));

		if (itemConfig2 != null && itemConfig2.getDescription() != null
				&& !itemConfig2.getDescription().getLanguages().isEmpty()) {
			final ControlDecoration deco = new ControlDecoration(combo,
					SWT.BOTTOM | SWT.LEFT);

			// re-use an existing image
			Image image = FieldDecorationRegistry
					.getDefault()
					.getFieldDecoration(FieldDecorationRegistry.DEC_INFORMATION)
					.getImage();
			// set description and image
			deco.setDescriptionText(itemConfig2.getDescription()
					.getTranslation(lang));
			deco.setImage(image);
		}
		selectComboViewer = new ComboViewer(combo);
		ComposedAdapterFactory factory = new ComposedAdapterFactory(
				ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		AdapterFactoryLabelProvider labelProvider = new AdapterFactoryLabelProvider(
				factory);
		AdapterFactoryContentProvider contentProvider = new AdapterFactoryContentProvider(
				factory);

		selectComboViewer.setContentProvider(contentProvider);
		selectComboViewer.setLabelProvider(labelProvider);
		selectComboViewer.setInput(configurationController
				.getIdentifiersProviderConfigItemProcessedClones(itemConfig2,
						corpusObject));

		


		Label lbltype = new Label(this, SWT.NONE);
		lbltype.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
				false, 1, 1));
		lbltype.setText("Type");
		typeText = new Text(this, SWT.BORDER);
		typeText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));

		Label lblObject = new Label(this, SWT.NONE);
		lblObject.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
				false, 1, 1));
		lblObject.setText("External ID");
		referenceText = new Text(this, SWT.BORDER);
		referenceText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 5, 1));
		

		
		

		DataBindingContext bindingContext = new DataBindingContext();

		EMFUpdateValueStrategy targetToModel = new EMFUpdateValueStrategy();
		targetToModel.setConverter(new BTSConfigItemToStringConverter());
		// if (itemConfig.getPassportEditorConfig().isRequired()) {
		// targetToModel.setBeforeSetValidator(new StringNotEmptyValidator());
		// }
		EMFUpdateValueStrategy modelToTarget = new EMFUpdateValueStrategy();
		modelToTarget.setConverter(new BTSStringToConfigItemConverter(
				selectComboViewer));
		IObservableValue target_type_viewer = ViewersObservables
				.observeSingleSelection(selectComboViewer);
		Binding binding = bindingContext.bindValue(
				target_type_viewer,
				EMFEditProperties.value(getEditingDomain(),
						BtsmodelPackage.Literals.BTS_EXTERNAL_REFERENCE__PROVIDER).observe(
								reference), targetToModel, modelToTarget);
		
		Binding bindingType = bindingContext.bindValue(
				WidgetProperties.text(SWT.Modify).observeDelayed(BTSUIConstants.DELAY, typeText),
				EMFEditProperties.value(getEditingDomain(),
						BtsmodelPackage.Literals.BTS_EXTERNAL_REFERENCE__TYPE).observe(
								reference), null, null);
		
		Binding binding2 = bindingContext.bindValue(
				WidgetProperties.text(SWT.Modify).observeDelayed(BTSUIConstants.DELAY, referenceText),
				EMFEditProperties.value(getEditingDomain(),
						BtsmodelPackage.Literals.BTS_EXTERNAL_REFERENCE__REFERENCE).observe(
								reference), null, null);

		// if (false) {
		// bindingContext.addValidationStatusProvider(binding);
		// BackgroundControlDecorationSupport.create(binding, SWT.TOP
		// | SWT.LEFT);
		// }
		loaded = true;
		setUserMayEditInteral(userMayEdit);
	}

	private EditingDomain getEditingDomain() {
		return editingDomainController.getEditingDomain(corpusObject);
	}

	

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
	@Inject
	@Optional
	public void setUserMayEdit(
			@Named(BTSCoreConstants.CORE_EXPRESSION_MAY_EDIT) final boolean userMayEdit) {
		if(userMayEdit != this.userMayEdit)
		{
			sync.asyncExec(new Runnable() {
				@Override
				public void run() {
					setUserMayEditInteral(userMayEdit);
				}
			});
		}
	}

	private void setUserMayEditInteral(boolean mayEdit) {
		this.userMayEdit = mayEdit;
		if (loaded && !this.isDisposed())
		{
			referenceText.setEditable(mayEdit);
			typeText.setEditable(mayEdit);
			selectComboViewer.getCombo().setEnabled(mayEdit);
		}
		
	}
}
