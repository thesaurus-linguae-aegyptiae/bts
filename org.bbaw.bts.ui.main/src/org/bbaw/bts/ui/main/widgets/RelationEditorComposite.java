package org.bbaw.bts.ui.main.widgets;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.bbaw.bts.btsmodel.BTSConfigItem;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.BTSRelation;
import org.bbaw.bts.btsmodel.BtsmodelPackage;
import org.bbaw.bts.commons.BTSPluginIDs;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.controller.generalController.BTSConfigurationController;
import org.bbaw.bts.core.controller.generalController.EditingDomainController;
import org.bbaw.bts.core.controller.generalController.GeneralBTSObjectController;
import org.bbaw.bts.ui.commons.converter.BTSConfigItemToStringConverter;
import org.bbaw.bts.ui.commons.converter.BTSStringToConfigItemConverter;
import org.bbaw.bts.ui.commons.utils.BTSUIConstants;
import org.bbaw.bts.ui.main.dialogs.SearchSelectObjectDialog;
import org.bbaw.bts.ui.resources.BTSResourceProvider;
import org.eclipse.core.commands.ParameterizedCommand;
import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.e4.core.commands.ECommandService;
import org.eclipse.e4.core.commands.EHandlerService;
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
import org.eclipse.jface.databinding.viewers.ViewersObservables;
import org.eclipse.jface.fieldassist.ContentProposalAdapter;
import org.eclipse.jface.fieldassist.ControlDecoration;
import org.eclipse.jface.fieldassist.FieldDecorationRegistry;
import org.eclipse.jface.fieldassist.IContentProposal;
import org.eclipse.jface.fieldassist.IContentProposalListener;
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

public class RelationEditorComposite extends Composite {
	@Inject
	@Optional
	private BTSConfigItem itemConfig;
	
	@Inject
	private IEclipseContext context;

	@Inject
	private EditingDomainController editingDomainController;

	@Inject
	private BTSRelation relation;

	@Inject
	private BTSConfigurationController configurationController;
	
	@Inject
	private ECommandService commandService;
	
	@Inject
	private EHandlerService handlerService;

	private ObjectSelectionProposalProvider itemProposalProvider;
	
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
	
	private Text text;

	private ContentProposalAdapter contentProposalAdapter;

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
	public RelationEditorComposite(Composite parent) {
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
		lblPredicate.setText("Relation");

		Combo combo = new Combo(this, SWT.READ_ONLY);
		combo.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1,
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
				.getRelationPathConfigItemProcessedClones(itemConfig2,
						corpusObject));

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
		bindingContext.bindValue(
				target_type_viewer,
				EMFEditProperties.value(getEditingDomain(),
						BtsmodelPackage.Literals.BTS_RELATION__TYPE).observe(
						relation), targetToModel, modelToTarget);

		// if (false) {
		// bindingContext.addValidationStatusProvider(binding);
		// BackgroundControlDecorationSupport.create(binding, SWT.TOP
		// | SWT.LEFT);
		// }

		Label lblObject = new Label(this, SWT.NONE);
		lblObject.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
				false, 1, 1));
		lblObject.setText("Object");

		text = new Text(this, SWT.BORDER);
		text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		text.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (RelationEditorComposite.this.userMayEdit) {
					// make sure we have content proposal adapter for object selection
					if (contentProposalAdapter == null) {
						createContentProposalAdapter();
					}
				}
			}
		});

		if (relation.getObjectId() != null) {
			text.setText(generalObjectController.getDisplayName(relation
					.getObjectId()));
			text.setToolTipText(text.getText());

		}

		Label lblSearch = new Label(this, SWT.NONE);
		lblSearch.setImage(resourceProvider.getImage(Display.getDefault(),
				BTSResourceProvider.IMG_SEARCH));
		lblSearch.setToolTipText("Search Object");
		lblSearch.setLayoutData(new GridData(SWT.RIGHT, SWT.TOP, false, false,
				1, 1));
		((GridData) lblSearch.getLayoutData()).verticalIndent = 3;
		lblSearch.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseDown(MouseEvent e) {
				if (RelationEditorComposite.this.userMayEdit)
				{
				Label l = (Label) e.getSource();
				l.setBackground(BTSUIConstants.VIEW_BACKGROUND_LABEL_PRESSED);
				}
			}

			@Override
			public void mouseUp(MouseEvent e) {
				if (RelationEditorComposite.this.userMayEdit)
				{
				Label l = (Label) e.getSource();
				l.setBackground(l.getParent().getBackground());
				// open search dialog
				IEclipseContext child = context.createChild("searchselect");
				context.set(BTSConfigItem.class, itemConfig);

				SearchSelectObjectDialog dialog = ContextInjectionFactory.make(
						SearchSelectObjectDialog.class, child);
				if (dialog.open() == SearchSelectObjectDialog.OK) {
					BTSObject object = dialog.getObject();
					System.out.println(object.get_id());
					EditingDomain ed = getEditingDomain();
					Command command = SetCommand.create(ed,
							relation, BtsmodelPackage.eINSTANCE.getBTSRelation_ObjectId(),
							object.get_id());
					ed.getCommandStack().execute(command);
//					System.out.println("Relation with object id "
//							+ relation.getObjectId());
//					relation.setObjectId(object.get_id());
//					System.out.println("Relation with object id "
//							+ relation.getObjectId());
					text.setText(object.getName());
					text.setToolTipText(text.getText());

				}
				}
			}
		});
		
		Label lblOpenInDialog = new Label(this, SWT.NONE);
		lblOpenInDialog.setImage(resourceProvider.getImage(Display.getDefault(),
				BTSResourceProvider.IMG_PASSPORT));
		lblOpenInDialog.setToolTipText("Open Object in Passport Data Editor");
		lblOpenInDialog.setLayoutData(new GridData(SWT.RIGHT, SWT.TOP, false, false,
				1, 1));
		((GridData) lblOpenInDialog.getLayoutData()).verticalIndent = 3;
		lblOpenInDialog.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseDown(MouseEvent e) {
				
				Label l = (Label) e.getSource();
					l.setBackground(BTSUIConstants.VIEW_BACKGROUND_LABEL_PRESSED);
			}

			@Override
			public void mouseUp(MouseEvent e) {
				
				Label l = (Label) e.getSource();
				l.setBackground(l.getParent().getBackground());
				// open search dialog
				Map<String, String> map = new HashMap<>(1);
	              map.put("objectId", relation
	  					.getObjectId());
	
	              org.eclipse.core.commands.Command cmd = commandService.getCommand(BTSPluginIDs.CMD_ID_OPEN_OBJECT_METADATA);
	              ParameterizedCommand command = ParameterizedCommand.generateCommand(cmd, map);
	
	              handlerService.executeHandler(command); 
				
			}
		});
		
		loaded = true;
		setUserMayEditInteral(userMayEdit);
		layout();
	}

	/**
	 * Set up content proposal provider for object text field.
	 */
	private void createContentProposalAdapter() {
		char[] autoActivationCharacters = new char[] { '.', '#' };
		try {
			KeyStroke keyStroke = KeyStroke.getInstance("Ctrl+Space");
			contentProposalAdapter = new ContentProposalAdapter(
					text,
					new TextContentAdapter(),
					new ObjectSelectionProposalProvider(
							generalObjectController, itemConfig, corpusObject),
					keyStroke,
					autoActivationCharacters);
			contentProposalAdapter.setProposalAcceptanceStyle(ContentProposalAdapter.PROPOSAL_REPLACE);
			contentProposalAdapter.addContentProposalListener(new IContentProposalListener() {
				@Override
				public void proposalAccepted(IContentProposal proposal) {
					Command command = SetCommand.create(
							getEditingDomain(),
							relation,
							BtsmodelPackage.eINSTANCE.getBTSRelation_ObjectId(),
							proposal.getContent());
					getEditingDomain().getCommandStack().execute(
							command);
					text.setToolTipText(proposal.getLabel());
					text.setText(proposal.getLabel());
				}
			});
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
	}

	/**
	 * Have {@link EditingDomainController} determine the editing domain for the currently loaded {@link BTSObject}.
	 * @return the {@link EditingDomain} for the current object.
	 */
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
			text.setEditable(mayEdit);
			selectComboViewer.getCombo().setEnabled(mayEdit);
		}
		
	}
}
