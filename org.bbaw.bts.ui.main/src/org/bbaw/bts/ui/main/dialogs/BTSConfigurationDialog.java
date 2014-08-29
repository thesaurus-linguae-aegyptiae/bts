package org.bbaw.bts.ui.main.dialogs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PreDestroy;
import javax.inject.Inject;
import javax.inject.Named;

import org.bbaw.bts.btsmodel.BTSConfig;
import org.bbaw.bts.btsmodel.BTSConfigItem;
import org.bbaw.bts.btsmodel.BTSConfiguration;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.btsmodel.BtsmodelPackage;
import org.bbaw.bts.btsviewmodel.BtsviewmodelFactory;
import org.bbaw.bts.btsviewmodel.TreeNodeWrapper;
import org.bbaw.bts.commons.BTSPluginIDs;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.commons.staticAccess.StaticAccessController;
import org.bbaw.bts.core.controller.dialogControllers.BTSConfigurationDialogController;
import org.bbaw.bts.core.controller.generalController.BTSConfigurationController;
import org.bbaw.bts.core.controller.generalController.EditingDomainController;
import org.bbaw.bts.ui.commons.controldecoration.BackgroundControlDecorationSupport;
import org.bbaw.bts.ui.commons.utils.BTSUIConstants;
import org.bbaw.bts.ui.commons.validator.StringIsRegexPatternValidator;
import org.bbaw.bts.ui.commons.validator.StringNotEmptyValidator;
import org.bbaw.bts.ui.commons.widgets.TranslationEditorComposite;
import org.bbaw.bts.ui.main.dialogs.btsConfigDialog.provider.BTSObjectPivot;
import org.bbaw.bts.ui.main.handlers.NewConfigurationHandler;
import org.bbaw.bts.ui.main.objectTypeSelector.ObjectTypeSelectionTreeComposite;
import org.bbaw.bts.ui.main.objectTypeSelector.RelationSubjectObjectTypesSelectionComposite;
import org.bbaw.bts.ui.resources.BTSResourceProvider;
import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.ParameterizedCommand;
import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.e4.core.commands.ECommandService;
import org.eclipse.e4.core.commands.EHandlerService;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Creatable;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.EventTopic;
import org.eclipse.e4.ui.services.EContextService;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.services.internal.events.EventBroker;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.EMFUpdateValueStrategy;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.emf.databinding.edit.EMFEditProperties;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.ocl.examples.pivot.delegate.OCLDelegateDomain;
import org.eclipse.ocl.examples.xtext.essentialocl.EssentialOCLStandaloneSetup;
import org.eclipse.ocl.examples.xtext.essentialocl.ui.internal.EssentialOCLActivator;
import org.eclipse.ocl.examples.xtext.essentialocl.ui.model.BaseDocument;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditor;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorFactory;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorModelAccess;
import org.eclipse.xtext.ui.editor.embedded.IEditedResourceProvider;
import org.mihalis.opal.multiChoice.MultiChoice;

import com.google.inject.Injector;

@Creatable
public class BTSConfigurationDialog extends TitleAreaDialog {

	@Inject
	private BTSConfigurationController configurationController;

	@Inject
	private BTSConfigurationDialogController configDialogController;

	@Inject
	private ECommandService commandService;

	@Inject
	private EHandlerService handlerService;
	@Inject
	private EventBroker eventBroker;
	@Inject
	private EContextService contextService;
	@Inject
	private IEclipseContext context;
	@Inject
	@Optional
	@Named(IServiceConstants.ACTIVE_SELECTION)
	private BTSObject selectedCorpusObject;
	@Inject
	private EditingDomainController editingDomainController;

	@Inject
	private BTSResourceProvider resourceProvider;
	private Combo activeConfigCB;

	private Tree tree;

	private Composite mainConfigRight;

	private TreeViewer treeViewer;

	private StructuredSelection selection;

	private ArrayList<BTSConfiguration> configurations;

	private Text nameText_ConfigurationEdit;
	private Text providerText;

	private DataBindingContext configurationEditBindings;

	private IObservableValue value = new WritableValue();

	private SashForm sashForm;

	private Button okButton;
	private Text valueText_CIEdit;
	private Text typeText_CIEdit;
	private Text subtypeText_CIEdit;
	private TranslationEditorComposite labelText_CIEdit;
	private TranslationEditorComposite descText_CIEdit;
	private Text labelTextWidget_CIEdit;
	private Text regexText_CIEdit;

	private DataBindingContext configItemEditBindings;

	private BTSConfig selectedConfig;

	private Text newCIText_ConfigurationEdit;

	private Spinner sortSpinner_CIEdit;

	private Button ignoreBTN_CIEdit;

	private Button activateBTN_CIEdit;

	private Combo widgetCB_CIEdit;

	private Button allowMultiBTN_CIEdit;

	private Button requiredBTN_CIEdit;

	private Button showBTN_CIEdit;

	private Spinner hSpanSpinner_CIEdit;

	private MultiChoice<String> mcOwners;

	private MultiChoice<String> mcReferenced;

	private TreeNodeWrapper root;

	private Color BACKGROUND_COLOR;

	private Text newCGroupText_ConfigurationEdit;

	private ToolItem config_ToolUndo;

	private ToolItem config_ToolRedo;

	private Map<BTSConfig, EditingDomain> editingDomainMap = new HashMap<BTSConfig, EditingDomain>();

	private ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(
			ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

	private ObjectTypeSelectionTreeComposite ownerTypeSelector;

	private ObjectTypeSelectionTreeComposite referencedTypeSelector;

	private ToolItem newConfig_Tool;

	private ToolItem config_ToolDelete;

	private Spinner hSpanSpinner_GroupIEdit;

	private EmbeddedEditorFactory embeddedEditorFactory;

	private EmbeddedEditor embeddedEditor;

	private EmbeddedEditorModelAccess embeddedEditorModelAccess;

	private ObjectTypeSelectionTreeComposite predicateSelector;

	private RelationSubjectObjectTypesSelectionComposite relationSubjectObjectTypesEditor;

	private TabFolder tabfolder;

	private int tabFolderSelectionIndex;


	/**
	 * Create the dialog.
	 * 
	 * @param parentShell
	 */
	public BTSConfigurationDialog() {
		super(new Shell());
		System.out.println("construct BTSConfigurationDialog");

	}

	/**
	 * Create contents of the dialog.
	 * 
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		// initializeDIs();
		Composite area = (Composite) super.createDialogArea(parent);
		Composite container = new Composite(area, SWT.NONE);
		container.setLayout(new FillLayout(SWT.HORIZONTAL));
		container.setLayoutData(new GridData(GridData.FILL_BOTH));

		sashForm = new SashForm(container, SWT.NONE);

		Composite mainCompLeft = new Composite(sashForm, SWT.NONE);
		GridLayout mainCompLeftGL = new GridLayout(1, false);
		mainCompLeftGL.horizontalSpacing = 1;
		mainCompLeft.setLayout(mainCompLeftGL);

		Composite compLeftTop = new Composite(mainCompLeft, SWT.NONE);
		compLeftTop.setLayout(new GridLayout(2, false));
		compLeftTop.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false,
				1, 1));

		ToolBar config_toolbar = new ToolBar(compLeftTop, SWT.FLAT | SWT.RIGHT);
		config_toolbar.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true,
				false, 2, 1));

		config_ToolUndo = new ToolItem(config_toolbar, SWT.NONE);
		config_ToolUndo.setText("Undo");
		config_ToolUndo.setImage(resourceProvider
.getImage(
				Display.getDefault(), BTSResourceProvider.IMG_UNDO));
		config_ToolUndo.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				org.eclipse.emf.common.command.Command command = getEditingDomain(
						selectedConfig).getCommandStack()
						.getMostRecentCommand();
				boolean refreshRequired = command instanceof DeleteCommand;
				getEditingDomain(selectedConfig).getCommandStack().undo();
				if (refreshRequired) {
					treeViewer.refresh();
				}

			}
		});

		config_ToolRedo = new ToolItem(config_toolbar, SWT.NONE);
		config_ToolRedo.setText("Redo");
		config_ToolRedo.setImage(resourceProvider.getImage(
				Display.getDefault(), BTSResourceProvider.IMG_REDO));
		config_ToolRedo.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				org.eclipse.emf.common.command.Command command = getEditingDomain(
						selectedConfig).getCommandStack()
						.getMostRecentCommand();
				boolean refreshRequired = command instanceof DeleteCommand;
				getEditingDomain(selectedConfig).getCommandStack().redo();
				if (refreshRequired) {
					treeViewer.refresh();
				}
			}
		});

		newConfig_Tool = new ToolItem(config_toolbar, SWT.NONE);
		newConfig_Tool.setText("Create New configuration");
		newConfig_Tool.setImage(resourceProvider.getImage(Display.getDefault(),
				BTSResourceProvider.IMG_CONFIGURATION_ADD));
		newConfig_Tool.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				System.out.println("Button new pressed");

				Command command = commandService
						.getCommand(BTSPluginIDs.CMD_ID_NEW_CONFIGURATION);

				// Activate Handler
				handlerService.activateHandler(
						BTSPluginIDs.CMD_ID_NEW_CONFIGURATION,
						new NewConfigurationHandler());

				ParameterizedCommand cmd = commandService.createCommand(
						BTSPluginIDs.CMD_ID_NEW_CONFIGURATION, null);
				command = commandService
						.getCommand(BTSPluginIDs.CMD_ID_NEW_CONFIGURATION);

				handlerService.executeHandler(cmd);
			}

		});
		config_ToolDelete = new ToolItem(config_toolbar, SWT.NONE);
		config_ToolDelete.setText("Delete");
		config_ToolDelete.setImage(resourceProvider.getImage(
				Display.getDefault(),
 BTSResourceProvider.IMG_DELETE));
		config_ToolDelete.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				BTSConfig parent = null;
				if (!(selectedConfig instanceof BTSConfiguration)) {
					parent = (BTSConfig) selectedConfig.eContainer();
				}
				org.eclipse.emf.common.command.Command command = DeleteCommand
						.create(getEditingDomain(selectedConfig),
								selectedConfig);
				getEditingDomain(selectedConfig).getCommandStack().execute(
						command);
				selectedConfig = parent;
				treeViewer.refresh();
				if (parent == null && root.getChildren().get(0) != null && root.getChildren().get(0) instanceof BTSConfig) {
					parent = (BTSConfig) root.getChildren().get(0);
				}
				if (parent != null) {
					treeViewer.setSelection(new StructuredSelection(parent));
				}

			}
		});


		Label activeConfigLB = new Label(compLeftTop, SWT.NONE);
		activeConfigLB.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
				false, 1, 1));
		activeConfigLB.setText("Currently active Configuration");

		activeConfigCB = new Combo(compLeftTop, SWT.NONE);
		activeConfigCB.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 1, 1));

		Label availableConfigsLB = new Label(compLeftTop, SWT.NONE);
		availableConfigsLB.setText("All available Configurations");
		availableConfigsLB.setLayoutData(new GridData(SWT.FILL, SWT.CENTER,
				true, false, 2, 1));

		Composite compLeftTree = new Composite(mainCompLeft, SWT.NONE);
		compLeftTree.setLayout(new FillLayout(SWT.HORIZONTAL));
		compLeftTree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true,
				1, 1));

		tree = new Tree(compLeftTree, SWT.BORDER);
		treeViewer = new TreeViewer(tree);

		mainConfigRight = new Composite(sashForm, SWT.NONE);
		mainConfigRight.setLayout(new FillLayout(SWT.HORIZONTAL));

		sashForm.setWeights(new int[] { 1, 1 });

		BACKGROUND_COLOR = mainConfigRight.getBackground();
		loadTree();
		return area;
	}

	protected EditingDomain getEditingDomain(BTSConfig editingObject) {
		return editingDomainController.getEditingDomain(editingObject);
	}

	private void loadTree() {
		ComposedAdapterFactory factory = new ComposedAdapterFactory(
				ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

		// BtsviewmodelAdapterFactory factory = new
		// BtsviewmodelAdapterFactory();
		AdapterFactoryLabelProvider labelProvider = new AdapterFactoryLabelProvider(
				factory);
		AdapterFactoryContentProvider contentProvider = new AdapterFactoryContentProvider(
				factory);
		treeViewer.setContentProvider(contentProvider);
		treeViewer.setLabelProvider(labelProvider);

		treeViewer.addSelectionChangedListener(new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				selection = (StructuredSelection) event.getSelection();
				handleTreeSelection(selection);

			}

		});
		treeViewer.setSorter(new ViewerSorter() {
		});
		// Create sample data
		configurations = new ArrayList<BTSConfiguration>();

		List<BTSConfiguration> list = configurationController
				.listConfigurations();
		root = BtsviewmodelFactory.eINSTANCE.createTreeNodeWrapper();
		if (list != null) {
			for (BTSConfiguration o : list) {
				TreeNodeWrapper child = BtsviewmodelFactory.eINSTANCE
						.createTreeNodeWrapper();
				child.setObject(o);
				child.setChildrenLoaded(true);
				root.getChildren().add(child);
				root.setChildrenLoaded(true);
				configurations.add(o);
			}
		}

		// Set the writeableList as input for the viewer
		treeViewer.setInput(root);

	}

	private void handleTreeSelection(StructuredSelection selection) {
		if (selection.getFirstElement() != null
				&& !selection.getFirstElement().equals(selectedConfig)) {
			saveOldSelection(selectedConfig);
		}
		if (tabfolder != null && !tabfolder.isDisposed())
		{
			tabFolderSelectionIndex = tabfolder.getSelectionIndex();
			tabfolder = null;
		}
		if (selection.getFirstElement() instanceof TreeNodeWrapper) {
			TreeNodeWrapper tn = (TreeNodeWrapper) selection.getFirstElement();
			if (tn.getObject() instanceof BTSConfiguration) {
				BTSConfiguration configuration = (BTSConfiguration) tn
						.getObject();
				selectedConfig = configuration;
				loadConfigurationEditor(configuration);
			}
		} else if (selection.getFirstElement() instanceof BTSConfiguration) {
			BTSConfiguration configuration = (BTSConfiguration) selection
					.getFirstElement();
			selectedConfig = configuration;
			loadConfigurationEditor(configuration);
		} else if (selection.getFirstElement() instanceof BTSConfigItem) {
			BTSConfigItem configItem = (BTSConfigItem) selection
					.getFirstElement();
			selectedConfig = configItem;
			if (BTSCoreConstants.PASSPORT.equals(configItem.getType())) {
				loadPassportEditor(configItem);
			} else if (BTSCoreConstants.CATEGORIES.equals(configItem.getType())) {
				loadPassportCategoriesEditor(configItem);
			} else if (BTSCoreConstants.PASSPORT_CATEGORY.equals(configItem
					.getType())) {
				loadPassportEntryGroupEditor(configItem);
			} else if (BTSCoreConstants.PASSPORT_ENTRY_GROUP.equals(configItem
					.getType())) {
				loadPassportEntryGroupEditor(configItem);
			} else if (BTSCoreConstants.PASSPORT_ENTRY_ITEM.equals(configItem
					.getType())) {
				loadPassportEntryItemEditor(configItem);
			} else if (BTSCoreConstants.RELATION.equals(configItem.getType())) {
				loadRelationEditor(configItem);
			} else {
				loadConfigItemEditor(configItem);
			}
		}
		if (tabfolder != null && !tabfolder.isDisposed())
		{
			tabfolder.setSelection(tabFolderSelectionIndex);
		}
	}

	private void loadRelationEditor(BTSConfigItem configItem) {
		mainConfigRight.dispose();
		mainConfigRight = null;
		mainConfigRight = new Composite(sashForm, SWT.NONE);
		mainConfigRight.setLayout(new FillLayout(SWT.HORIZONTAL));

		tabfolder = new TabFolder(mainConfigRight, SWT.NONE);

		{
			TabItem configtabItem = new TabItem(tabfolder, SWT.NONE);
			configtabItem.setText("Configuration");

			Composite configItemEditComp = new Composite(tabfolder, SWT.NONE);
			configItemEditComp.setLayout(new GridLayout(3, false));
			configtabItem.setControl(configItemEditComp);
			Label lblLabel_1 = new Label(configItemEditComp, SWT.NONE);
			lblLabel_1.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
					false, 1, 1));
			lblLabel_1.setText("Label");

			labelText_CIEdit = new TranslationEditorComposite(
					configItemEditComp, SWT.BORDER, false);
			labelText_CIEdit.setLayoutData(new GridData(SWT.FILL, SWT.CENTER,
					true, false, 2, 1));

			Label lblDescription = new Label(configItemEditComp, SWT.NONE);
			lblDescription.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER,
					false, false, 1, 1));
			lblDescription.setText("Description");

			descText_CIEdit = new TranslationEditorComposite(
					configItemEditComp, SWT.BORDER, false);
			descText_CIEdit.setLayoutData(new GridData(SWT.FILL, SWT.CENTER,
					true, false, 2, 1));

			Label lblValue = new Label(configItemEditComp, SWT.NONE);
			lblValue.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
					false, 1, 1));
			lblValue.setText("Value");

			valueText_CIEdit = new Text(configItemEditComp, SWT.BORDER);
			valueText_CIEdit.setLayoutData(new GridData(SWT.FILL, SWT.CENTER,
					true, false, 2, 1));

			Label lblType = new Label(configItemEditComp, SWT.NONE);
			lblType.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
					false, 1, 1));
			lblType.setText("Type");

			typeText_CIEdit = new Text(configItemEditComp, SWT.BORDER);
			typeText_CIEdit.setLayoutData(new GridData(SWT.FILL, SWT.CENTER,
					true, false, 2, 1));

			Label lblSubtype = new Label(configItemEditComp, SWT.NONE);
			lblSubtype.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
					false, 1, 1));
			lblSubtype.setText("Subtype");

			subtypeText_CIEdit = new Text(configItemEditComp, SWT.BORDER);
			subtypeText_CIEdit.setLayoutData(new GridData(SWT.FILL, SWT.CENTER,
					true, false, 2, 1));

			Label lblSortkey = new Label(configItemEditComp, SWT.NONE);
			lblSortkey.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
					false, 1, 1));
			lblSortkey.setText("SortKey");

			sortSpinner_CIEdit = new Spinner(configItemEditComp, SWT.BORDER);
			sortSpinner_CIEdit.setLayoutData(new GridData(SWT.FILL, SWT.CENTER,
					true, false, 2, 1));

			Label lblIgnore = new Label(configItemEditComp, SWT.NONE);
			lblIgnore.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
					false, 1, 1));
			lblIgnore.setText("Ignore");

			ignoreBTN_CIEdit = new Button(configItemEditComp, SWT.CHECK);
			ignoreBTN_CIEdit.setText("ignore");
			ignoreBTN_CIEdit.setLayoutData(new GridData(SWT.FILL, SWT.CENTER,
					true, false, 2, 1));

			Label newConfigItemLabel = new Label(configItemEditComp, SWT.NONE);
			newConfigItemLabel.setLayoutData(new GridData(SWT.RIGHT,
					SWT.CENTER, false, false, 1, 1));
			newConfigItemLabel.setText("New Sub-Relation");

			newCIText_ConfigurationEdit = new Text(configItemEditComp,
					SWT.BORDER);
			newCIText_ConfigurationEdit.setLayoutData(new GridData(SWT.FILL,
					SWT.CENTER, true, false, 1, 1));

			Button newCIBTN = new Button(configItemEditComp, SWT.PUSH);
			newCIBTN.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
					false, 1, 1));
			newCIBTN.setText("Add Sub-Relation");
			newCIBTN.addSelectionListener(new SelectionAdapter() {

				@Override
				public void widgetSelected(SelectionEvent e) {
					BTSConfigItem ci = configurationController
							.createNewConfigItem(newCIText_ConfigurationEdit
									.getText());
					ci.setType(BTSCoreConstants.RELATION);
					for (String s : ((BTSConfigItem) selectedConfig).getOwnerReferencedTypesStringList())
					{
						ci.getOwnerReferencedTypesStringList().add(s);
					}
					
					CompoundCommand compoundCommand = new CompoundCommand();
					org.eclipse.emf.common.command.Command command = AddCommand
							.create(getEditingDomain(selectedConfig),
									selectedConfig,
									BtsmodelPackage.Literals.BTS_CONFIG__CHILDREN,
									ci);
					compoundCommand.append(command);
					getEditingDomain(selectedConfig).getCommandStack().execute(
							compoundCommand);
					treeViewer.refresh(selectedConfig);

				}
			});

		}// end configuration tabitem
		{
			TabItem ownerstabItem = new TabItem(tabfolder, SWT.NONE);
			ownerstabItem.setText("Owner and Related Objects");

			Composite ownerEditComp = new Composite(tabfolder, SWT.NONE);
			ownerEditComp.setLayout(new GridLayout(1, false));
			ownerstabItem.setControl(ownerEditComp);
			
			context.set(Composite.class, ownerEditComp);
			context.set(BTSConfigItem.class, configItem);
			context.set(Integer.class, SWT.None);
			relationSubjectObjectTypesEditor = ContextInjectionFactory.make(RelationSubjectObjectTypesSelectionComposite.class, context);
			relationSubjectObjectTypesEditor.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

		}


		configItemEditBindings = initializeRelationEditBindings(configItem);

		value.setValue(configItem);
		sashForm.setWeights(new int[] { 1, 1 });
		sashForm.layout();
	}

	private DataBindingContext initializeRelationEditBindings(
			BTSConfigItem configItem) {
		if (configItemEditBindings != null) {
			configItemEditBindings.dispose();
		}
		EMFUpdateValueStrategy us = new EMFUpdateValueStrategy();
		us.setBeforeSetValidator(new StringNotEmptyValidator());

		DataBindingContext bindingContext = new DataBindingContext();

		EditingDomain editingDomain = getEditingDomain(configItem);
		labelText_CIEdit.load(configItem.getLabel(), editingDomain, true);

		descText_CIEdit.load(configItem.getDescription(), editingDomain, false);

		// value
		Binding binding = bindingContext.bindValue(
				WidgetProperties.text(SWT.Modify).observeDelayed(
						BTSUIConstants.DELAY, valueText_CIEdit),
				EMFEditProperties.value(editingDomain,
						BtsmodelPackage.Literals.BTS_CONFIG_ITEM__VALUE)
						.observe(configItem), us, null);

		bindingContext.addValidationStatusProvider(binding);

		BackgroundControlDecorationSupport.create(binding, SWT.TOP | SWT.LEFT);
		// type
		Binding binding2 = bindingContext.bindValue(
				WidgetProperties.text(SWT.Modify).observeDelayed(
						BTSUIConstants.DELAY, typeText_CIEdit),
				EMFEditProperties.value(editingDomain,
						BtsmodelPackage.Literals.BTS_CONFIG_ITEM__TYPE)
						.observe(configItem), us, null);

		// subtype
		Binding binding3 = bindingContext.bindValue(
				WidgetProperties.text(SWT.Modify).observeDelayed(
						BTSUIConstants.DELAY, subtypeText_CIEdit),
				EMFEditProperties.value(editingDomain,
						BtsmodelPackage.Literals.BTS_CONFIG_ITEM__SUBTYPE)
						.observe(configItem), us, null);

		// sortkey
		Binding binding4 = bindingContext.bindValue(
				WidgetProperties.selection().observeDelayed(400,
						sortSpinner_CIEdit),
				EMFEditProperties.value(editingDomain,
						BtsmodelPackage.Literals.BTS_CONFIG_ITEM__SORT_KEY)
						.observe(configItem), null, null);
		// ignore
		Binding binding5 = bindingContext.bindValue(
				WidgetProperties.selection()
						.observeDelayed(0, ignoreBTN_CIEdit),
				EMFEditProperties.value(editingDomain,
						BtsmodelPackage.Literals.BTS_CONFIG_ITEM__IGNORE)
						.observe(configItem), null, null);

		// owner types

		return bindingContext;
	}

	private void loadPassportEditor(BTSConfigItem configItem) {
		mainConfigRight.dispose();
		mainConfigRight = null;
		mainConfigRight = new Composite(sashForm, SWT.NONE);
		mainConfigRight.setLayout(new FillLayout(SWT.HORIZONTAL));

		Composite configItemEditComp = new Composite(mainConfigRight, SWT.NONE);
		configItemEditComp.setLayout(new GridLayout(3, false));

		Label lblLabel_1 = new Label(configItemEditComp, SWT.NONE);
		lblLabel_1.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
				false, 1, 1));
		lblLabel_1.setText("Label");

		labelText_CIEdit = new TranslationEditorComposite(configItemEditComp,
				SWT.BORDER, null, null, true);
		labelText_CIEdit.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 2, 1));

		Label lblDescription = new Label(configItemEditComp, SWT.NONE);
		lblDescription.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
				false, 1, 1));
		lblDescription.setText("Description");

		descText_CIEdit = new TranslationEditorComposite(configItemEditComp,
				SWT.BORDER, null, null, false);
		descText_CIEdit.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 2, 1));

		Label lblValue = new Label(configItemEditComp, SWT.NONE);
		lblValue.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
				false, 1, 1));
		lblValue.setText("Value");

		valueText_CIEdit = new Text(configItemEditComp, SWT.BORDER);
		valueText_CIEdit.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 2, 1));

		Label lblType = new Label(configItemEditComp, SWT.NONE);
		lblType.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false,
				1, 1));
		lblType.setText("Type");

		typeText_CIEdit = new Text(configItemEditComp, SWT.BORDER);
		typeText_CIEdit.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 2, 1));

		Label lblSubtype = new Label(configItemEditComp, SWT.NONE);
		lblSubtype.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
				false, 1, 1));
		lblSubtype.setText("Subtype");

		subtypeText_CIEdit = new Text(configItemEditComp, SWT.BORDER);
		subtypeText_CIEdit.setLayoutData(new GridData(SWT.FILL, SWT.CENTER,
				true, false, 2, 1));

		Label newConfigItemLabel = new Label(configItemEditComp, SWT.NONE);
		newConfigItemLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER,
				false, false, 1, 1));
		newConfigItemLabel.setText("New Passport Categories");

		newCIText_ConfigurationEdit = new Text(configItemEditComp, SWT.BORDER);
		newCIText_ConfigurationEdit.setLayoutData(new GridData(SWT.FILL,
				SWT.CENTER, true, false, 1, 1));

		Button newCIBTN = new Button(configItemEditComp, SWT.PUSH);
		newCIBTN.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false,
				1, 1));
		newCIBTN.setText("Add Category");
		newCIBTN.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				BTSConfigItem ci = configurationController
						.createNewConfigItem(newCIText_ConfigurationEdit
								.getText());
				ci.setType(BTSCoreConstants.PASSPORT_CATEGORY);
				for (String s : ((BTSConfigItem) selectedConfig).getOwnerReferencedTypesStringList())
				{
					ci.getOwnerReferencedTypesStringList().add(s);
				}
				CompoundCommand compoundCommand = new CompoundCommand();
				org.eclipse.emf.common.command.Command command = AddCommand
						.create(getEditingDomain(selectedConfig),
								selectedConfig,
								BtsmodelPackage.Literals.BTS_CONFIG__CHILDREN,
								ci);
				compoundCommand.append(command);
				getEditingDomain(selectedConfig).getCommandStack().execute(
						compoundCommand);
				treeViewer.refresh(selectedConfig);

			}
		});
		configItemEditBindings = initializePassportEditBindings(configItem);

		value.setValue(configItem);
		sashForm.setWeights(new int[] { 1, 1 });
		sashForm.layout();

	}

	private DataBindingContext initializePassportEditBindings(
			BTSConfigItem configItem) {
		if (configItemEditBindings != null) {
			configItemEditBindings.dispose();
		}
		EMFUpdateValueStrategy us = new EMFUpdateValueStrategy();
		us.setBeforeSetValidator(new StringNotEmptyValidator());

		DataBindingContext bindingContext = new DataBindingContext();
		EditingDomain editingDomain = getEditingDomain(configItem);
		labelText_CIEdit.load(configItem.getLabel(), editingDomain, true);

		descText_CIEdit.load(configItem.getDescription(), editingDomain, false);
		// value
		Binding binding = bindingContext.bindValue(
				WidgetProperties.text(SWT.Modify).observeDelayed(
						BTSUIConstants.DELAY, valueText_CIEdit),
				EMFEditProperties.value(editingDomain,
						BtsmodelPackage.Literals.BTS_CONFIG_ITEM__VALUE)
						.observe(configItem), us, null);

		// type
		Binding binding2 = bindingContext.bindValue(
				WidgetProperties.text(SWT.Modify).observeDelayed(
						BTSUIConstants.DELAY, typeText_CIEdit),
				EMFEditProperties.value(editingDomain,
						BtsmodelPackage.Literals.BTS_CONFIG_ITEM__TYPE)
						.observe(configItem), us, null);

		// subtype
		Binding binding3 = bindingContext.bindValue(
				WidgetProperties.text(SWT.Modify).observeDelayed(
						BTSUIConstants.DELAY, subtypeText_CIEdit),
				EMFEditProperties.value(editingDomain,
						BtsmodelPackage.Literals.BTS_CONFIG_ITEM__SUBTYPE)
						.observe(configItem), us, null);

		bindingContext.addValidationStatusProvider(binding);

		BackgroundControlDecorationSupport.create(binding, SWT.TOP | SWT.LEFT);
		return bindingContext;
	}

	private void saveOldSelection(BTSConfig selectedConfig2) {
		if (ownerTypeSelector != null && !ownerTypeSelector.isDisposed()) {
			ownerTypeSelector.save();
		}
		if (referencedTypeSelector != null
				&& !referencedTypeSelector.isDisposed()) {
			referencedTypeSelector.save();
		}
		if (predicateSelector != null && !predicateSelector.isDisposed()) {
			predicateSelector.save();
		}
		if (relationSubjectObjectTypesEditor != null && ! relationSubjectObjectTypesEditor.isDisposed())
		{
			relationSubjectObjectTypesEditor.save();
		}

	}

	private void loadConfigItemEditor(BTSConfigItem configItem) {
		mainConfigRight.dispose();
		mainConfigRight = null;
		mainConfigRight = new Composite(sashForm, SWT.NONE);
		mainConfigRight.setLayout(new FillLayout(SWT.HORIZONTAL));

		tabfolder = new TabFolder(mainConfigRight, SWT.NONE);

		{
			TabItem configtabItem = new TabItem(tabfolder, SWT.NONE);
			configtabItem.setText("Configuration");

			Composite configItemEditComp = new Composite(tabfolder, SWT.NONE);
			configItemEditComp.setLayout(new GridLayout(3, false));
			configtabItem.setControl(configItemEditComp);

			Label lblLabel_1 = new Label(configItemEditComp, SWT.NONE);
			lblLabel_1.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
					false, 1, 1));
			lblLabel_1.setText("Label");

			labelText_CIEdit = new TranslationEditorComposite(
					configItemEditComp, SWT.BORDER, true);
			labelText_CIEdit.setLayoutData(new GridData(SWT.FILL, SWT.CENTER,
					true, false, 2, 1));

			Label lblDescription = new Label(configItemEditComp, SWT.NONE);
			lblDescription.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER,
					false, false, 1, 1));
			lblDescription.setText("Description");

			descText_CIEdit = new TranslationEditorComposite(
					configItemEditComp, SWT.BORDER, true);
			descText_CIEdit.setLayoutData(new GridData(SWT.FILL, SWT.CENTER,
					true, false, 2, 1));

			Label lblValue = new Label(configItemEditComp, SWT.NONE);
			lblValue.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
					false, 1, 1));
			lblValue.setText("Value");

			valueText_CIEdit = new Text(configItemEditComp, SWT.BORDER);
			valueText_CIEdit.setLayoutData(new GridData(SWT.FILL, SWT.CENTER,
					true, false, 2, 1));

			Label lblType = new Label(configItemEditComp, SWT.NONE);
			lblType.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
					false, 1, 1));
			lblType.setText("Type");

			typeText_CIEdit = new Text(configItemEditComp, SWT.BORDER);
			typeText_CIEdit.setLayoutData(new GridData(SWT.FILL, SWT.CENTER,
					true, false, 2, 1));

			Label lblSubtype = new Label(configItemEditComp, SWT.NONE);
			lblSubtype.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
					false, 1, 1));
			lblSubtype.setText("Subtype");

			subtypeText_CIEdit = new Text(configItemEditComp, SWT.BORDER);
			subtypeText_CIEdit.setLayoutData(new GridData(SWT.FILL, SWT.CENTER,
					true, false, 2, 1));

			Label lblSortkey = new Label(configItemEditComp, SWT.NONE);
			lblSortkey.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
					false, 1, 1));
			lblSortkey.setText("SortKey");

			sortSpinner_CIEdit = new Spinner(configItemEditComp, SWT.BORDER);
			sortSpinner_CIEdit.setLayoutData(new GridData(SWT.FILL, SWT.CENTER,
					true, false, 2, 1));

			Label lblIgnore = new Label(configItemEditComp, SWT.NONE);
			lblIgnore.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
					false, 1, 1));
			lblIgnore.setText("Ignore");

			ignoreBTN_CIEdit = new Button(configItemEditComp, SWT.CHECK);
			ignoreBTN_CIEdit.setText("ignore");
			ignoreBTN_CIEdit.setLayoutData(new GridData(SWT.FILL, SWT.CENTER,
					true, false, 2, 1));

			Label newConfigItemLabel = new Label(configItemEditComp, SWT.NONE);
			newConfigItemLabel.setLayoutData(new GridData(SWT.RIGHT,
					SWT.CENTER, false, false, 1, 1));
			newConfigItemLabel.setText("New ConfigItem");

			newCIText_ConfigurationEdit = new Text(configItemEditComp,
					SWT.BORDER);
			newCIText_ConfigurationEdit.setLayoutData(new GridData(SWT.FILL,
					SWT.CENTER, true, false, 1, 1));

			Button newCIBTN = new Button(configItemEditComp, SWT.PUSH);
			newCIBTN.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
					false, 1, 1));
			newCIBTN.setText("New ConfigItem");
			newCIBTN.addSelectionListener(new SelectionAdapter() {

				@Override
				public void widgetSelected(SelectionEvent e) {

					BTSConfigItem ci = configurationController
							.createNewConfigItem(newCIText_ConfigurationEdit
									.getText());
					for (String s : ((BTSConfigItem) selectedConfig).getOwnerReferencedTypesStringList())
					{
						ci.getOwnerReferencedTypesStringList().add(s);
					}
					CompoundCommand compoundCommand = new CompoundCommand();
					org.eclipse.emf.common.command.Command command = AddCommand
							.create(getEditingDomain(selectedConfig),
									selectedConfig,
									BtsmodelPackage.Literals.BTS_CONFIG__CHILDREN,
									ci);
					compoundCommand.append(command);
					getEditingDomain(selectedConfig).getCommandStack().execute(
							compoundCommand);
					treeViewer.refresh(selectedConfig);

				}
			});
		}// end configuration tabitem
		{
			TabItem ownerstabItem = new TabItem(tabfolder, SWT.NONE);
			ownerstabItem.setText("Owner Objects");

			Composite ownerEditComp = new Composite(tabfolder, SWT.NONE);
			ownerEditComp.setLayout(new GridLayout(1, false));
			ownerstabItem.setControl(ownerEditComp);
			ownerTypeSelector = new ObjectTypeSelectionTreeComposite(
					configurationController, ownerEditComp, SWT.NONE);
			ownerTypeSelector.setPathInput(configItem,
					getEditingDomain(configItem), null, false);
		}
		{

			TabItem ownerstabItem = new TabItem(tabfolder, SWT.NONE);
			ownerstabItem.setText("OCL");
			EssentialOCLStandaloneSetup.doSetup();

			// inititae static access controller
			StaticAccessController sa = context
					.get(StaticAccessController.class);
			EssentialOCLActivator activator = EssentialOCLActivator
					.getInstance();
			Injector injector = activator
					.getInjector(EssentialOCLActivator.ORG_ECLIPSE_OCL_EXAMPLES_XTEXT_ESSENTIALOCL_ESSENTIALOCL);
			embeddedEditorFactory = injector
					.getInstance(EmbeddedEditorFactory.class);
			Composite ownerEditComp = new Composite(tabfolder, SWT.NONE);
			ownerEditComp.setLayout(new GridLayout(1, false));
			ownerstabItem.setControl(ownerEditComp);
			OCLDelegateDomain.initialize(configItem.eResource()
					.getResourceSet());
			// MetaModelManager mmm =
			// mmm.loadResource(configItem.eResource().getURI(), null, null);
			IEditedResourceProvider resourceProvider = new IEditedResourceProvider() {

				@Override
				public XtextResource createResource() {
					try {
						ResourceSet resourceSet = new ResourceSetImpl();
						Resource resource = resourceSet
								.createResource(URI
										.createURI("file://E:/AAEW/test/runtime-EclipseXtext/tt/btstest.essentialocl"));

						return (XtextResource) resource;
					} catch (Exception e) {
						return null;
					}
				}
			};

			embeddedEditor = embeddedEditorFactory.newEditor(resourceProvider)
					.showErrorAndWarningAnnotations().withParent(ownerEditComp);
			embeddedEditorModelAccess = embeddedEditor.createPartialEditor(
					"\r", "hallo", "\r", false);
			// TestPivot tp = new TestPivot();
			if (selectedCorpusObject != null) {
				BTSObjectPivot cp = new BTSObjectPivot(
						selectedCorpusObject);
				Map<String, EClassifier> map = new HashMap<String, EClassifier>();
				map.put("second", selectedCorpusObject.eClass());
				getEditorDocument().setContext(cp.getClassifierForContext(),
						map);
			}
			getEditorDocument().set("self");
			ownerEditComp.layout();
		}
		tabfolder.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				if (tabfolder.getSelectionIndex() == 2) {
					contextService
							.activateContext("org.eclipse.xtext.ui.embeddedTextEditorScope");
				}

			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub

			}
		});

		configItemEditBindings = initializeConfigItemEditBindings(configItem);

		value.setValue(configItem);
		sashForm.setWeights(new int[] { 1, 1 });
		sashForm.layout();
	}

	public BaseDocument getEditorDocument() {
		return (BaseDocument) embeddedEditor.getDocument();
	}

	private DataBindingContext initializeConfigItemEditBindings(
			BTSConfigItem configItem) {
		if (configItemEditBindings != null) {
			configItemEditBindings.dispose();
		}
		EMFUpdateValueStrategy us = new EMFUpdateValueStrategy();
		us.setBeforeSetValidator(new StringNotEmptyValidator());

		DataBindingContext bindingContext = new DataBindingContext();

		EditingDomain editingDomain = getEditingDomain(configItem);

		labelText_CIEdit.load(configItem.getLabel(), editingDomain, true);

		descText_CIEdit.load(configItem.getDescription(), editingDomain, false);
		// value
		Binding binding = bindingContext.bindValue(
				WidgetProperties.text(SWT.Modify).observeDelayed(
						BTSUIConstants.DELAY, valueText_CIEdit),
				EMFEditProperties.value(editingDomain,
						BtsmodelPackage.Literals.BTS_CONFIG_ITEM__VALUE)
						.observe(configItem), us, null);

		// type
		Binding binding2 = bindingContext.bindValue(
				WidgetProperties.text(SWT.Modify).observeDelayed(
						BTSUIConstants.DELAY, typeText_CIEdit),
				EMFEditProperties.value(editingDomain,
						BtsmodelPackage.Literals.BTS_CONFIG_ITEM__TYPE)
						.observe(configItem), us, null);

		// subtype
		Binding binding3 = bindingContext.bindValue(
				WidgetProperties.text(SWT.Modify).observeDelayed(
						BTSUIConstants.DELAY, subtypeText_CIEdit),
				EMFEditProperties.value(editingDomain,
						BtsmodelPackage.Literals.BTS_CONFIG_ITEM__SUBTYPE)
						.observe(configItem), us, null);

		// sortkey
		Binding binding4 = bindingContext.bindValue(
				WidgetProperties.selection().observeDelayed(400,
						sortSpinner_CIEdit),
				EMFEditProperties.value(editingDomain,
						BtsmodelPackage.Literals.BTS_CONFIG_ITEM__SORT_KEY)
						.observe(configItem), null, null);
		// ignore
		Binding binding5 = bindingContext.bindValue(WidgetProperties
				.selection().observeDelayed(0, ignoreBTN_CIEdit), EMFProperties
				.value(BtsmodelPackage.Literals.BTS_CONFIG_ITEM__IGNORE)
				.observe(configItem), null, null);
		bindingContext.addValidationStatusProvider(binding);

		BackgroundControlDecorationSupport.create(binding, SWT.TOP | SWT.LEFT);
		return bindingContext;
	}

	private void loadPassportEntryGroupEditor(BTSConfigItem configItem) {
		mainConfigRight.dispose();
		mainConfigRight = null;
		mainConfigRight = new Composite(sashForm, SWT.NONE);
		mainConfigRight.setLayout(new FillLayout(SWT.HORIZONTAL));

		tabfolder = new TabFolder(mainConfigRight, SWT.NONE);

		{
			TabItem configtabItem = new TabItem(tabfolder, SWT.NONE);
			configtabItem.setText("Configuration");

			Composite configItemEditComp = new Composite(tabfolder, SWT.NONE);
			configItemEditComp.setLayout(new GridLayout(3, false));
			configtabItem.setControl(configItemEditComp);

			Label lblLabel_1 = new Label(configItemEditComp, SWT.NONE);
			lblLabel_1.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
					false, 1, 1));
			lblLabel_1.setText("Label");

			labelText_CIEdit = new TranslationEditorComposite(
					configItemEditComp, SWT.BORDER, true);
			labelText_CIEdit.setLayoutData(new GridData(SWT.FILL, SWT.CENTER,
					true, false, 2, 1));

			Label lblDescription = new Label(configItemEditComp, SWT.NONE);
			lblDescription.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER,
					false, false, 1, 1));
			lblDescription.setText("Description");

			descText_CIEdit = new TranslationEditorComposite(
					configItemEditComp, SWT.BORDER, false);
			descText_CIEdit.setLayoutData(new GridData(SWT.FILL, SWT.CENTER,
					true, false, 2, 1));

			Label lblValue = new Label(configItemEditComp, SWT.NONE);
			lblValue.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
					false, 1, 1));
			lblValue.setText("Value");

			valueText_CIEdit = new Text(configItemEditComp, SWT.BORDER);
			valueText_CIEdit.setLayoutData(new GridData(SWT.FILL, SWT.CENTER,
					true, false, 2, 1));

			Label lblType = new Label(configItemEditComp, SWT.NONE);
			lblType.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
					false, 1, 1));
			lblType.setText("Type");

			typeText_CIEdit = new Text(configItemEditComp, SWT.BORDER);
			typeText_CIEdit.setLayoutData(new GridData(SWT.FILL, SWT.CENTER,
					true, false, 2, 1));

			Label lblSubtype = new Label(configItemEditComp, SWT.NONE);
			lblSubtype.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
					false, 1, 1));
			lblSubtype.setText("Subtype");

			subtypeText_CIEdit = new Text(configItemEditComp, SWT.BORDER);
			subtypeText_CIEdit.setLayoutData(new GridData(SWT.FILL, SWT.CENTER,
					true, false, 2, 1));

			Label lblSortkey = new Label(configItemEditComp, SWT.NONE);
			lblSortkey.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
					false, 1, 1));
			lblSortkey.setText("SortKey");

			sortSpinner_CIEdit = new Spinner(configItemEditComp, SWT.BORDER);
			sortSpinner_CIEdit.setLayoutData(new GridData(SWT.FILL, SWT.CENTER,
					true, false, 2, 1));

			Label lblIgnore = new Label(configItemEditComp, SWT.NONE);
			lblIgnore.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
					false, 1, 1));
			lblIgnore.setText("Ignore");

			ignoreBTN_CIEdit = new Button(configItemEditComp, SWT.CHECK);
			ignoreBTN_CIEdit.setText("ignore");
			ignoreBTN_CIEdit.setLayoutData(new GridData(SWT.FILL, SWT.CENTER,
					true, false, 2, 1));
			Label lblHorizontalSpan = new Label(configItemEditComp, SWT.NONE);
			lblHorizontalSpan.setText("Horizontal Span");
			lblHorizontalSpan.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER,
					false, false, 1, 1));
			hSpanSpinner_GroupIEdit = new Spinner(configItemEditComp,
					SWT.BORDER);
			hSpanSpinner_GroupIEdit.setMinimum(1);
			hSpanSpinner_GroupIEdit
					.setMaximum(BTSUIConstants.PASSPORT_COLUMN_NUMBER);
			hSpanSpinner_GroupIEdit.setLayoutData(new GridData(SWT.LEFT,
					SWT.CENTER, false, false, 1, 1));
			allowMultiBTN_CIEdit = new Button(configItemEditComp, SWT.CHECK);
			allowMultiBTN_CIEdit.setText("Allow multiple");
			Label newConfigGroupLabel = new Label(configItemEditComp, SWT.NONE);
			newConfigGroupLabel.setLayoutData(new GridData(SWT.RIGHT,
					SWT.CENTER, false, false, 1, 1));
			newConfigGroupLabel.setText("New Group");

			newCGroupText_ConfigurationEdit = new Text(configItemEditComp,
					SWT.BORDER);
			newCGroupText_ConfigurationEdit.setLayoutData(new GridData(
					SWT.FILL, SWT.CENTER, true, false, 1, 1));

			Button newCGroupBTN = new Button(configItemEditComp, SWT.PUSH);
			newCGroupBTN.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
					false, 1, 1));
			newCGroupBTN.setText("Add Group");
			newCGroupBTN.addSelectionListener(new SelectionAdapter() {

				@Override
				public void widgetSelected(SelectionEvent e) {
					BTSConfigItem ci = configurationController
							.createNewConfigItem(newCGroupText_ConfigurationEdit
									.getText());
					for (String s : ((BTSConfigItem) selectedConfig).getOwnerReferencedTypesStringList())
					{
						ci.getOwnerReferencedTypesStringList().add(s);
					}
					ci.setType(BTSCoreConstants.PASSPORT_ENTRY_GROUP);
					CompoundCommand compoundCommand = new CompoundCommand();
					org.eclipse.emf.common.command.Command command = AddCommand
							.create(getEditingDomain(selectedConfig),
									selectedConfig,
									BtsmodelPackage.Literals.BTS_CONFIG__CHILDREN,
									ci);
					compoundCommand.append(command);
					getEditingDomain(selectedConfig).getCommandStack().execute(
							compoundCommand);
					treeViewer.refresh(selectedConfig);
				}
			});

			

			Label newConfigItemLabel = new Label(configItemEditComp, SWT.NONE);
			newConfigItemLabel.setLayoutData(new GridData(SWT.RIGHT,
					SWT.CENTER, false, false, 1, 1));
			newConfigItemLabel.setText("New Item");

			newCIText_ConfigurationEdit = new Text(configItemEditComp,
					SWT.BORDER);
			newCIText_ConfigurationEdit.setLayoutData(new GridData(SWT.FILL,
					SWT.CENTER, true, false, 1, 1));

			Button newCIBTN = new Button(configItemEditComp, SWT.PUSH);
			newCIBTN.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
					false, 1, 1));
			newCIBTN.setText("Add Item");
			newCIBTN.addSelectionListener(new SelectionAdapter() {

				@Override
				public void widgetSelected(SelectionEvent e) {
					BTSConfigItem ci = configurationController
							.createNewConfigItem(newCIText_ConfigurationEdit
									.getText());
					ci.setType(BTSCoreConstants.PASSPORT_ENTRY_ITEM);
					for (String s : ((BTSConfigItem) selectedConfig).getOwnerReferencedTypesStringList())
					{
						ci.getOwnerReferencedTypesStringList().add(s);
					}
					CompoundCommand compoundCommand = new CompoundCommand();
					org.eclipse.emf.common.command.Command command = AddCommand
							.create(getEditingDomain(selectedConfig),
									selectedConfig,
									BtsmodelPackage.Literals.BTS_CONFIG__CHILDREN,
									ci);
					compoundCommand.append(command);
					getEditingDomain(selectedConfig).getCommandStack().execute(
							compoundCommand);
					treeViewer.refresh(selectedConfig);

				}
			});
		}// end configuration tabitem
		{
			TabItem ownerstabItem = new TabItem(tabfolder, SWT.NONE);
			ownerstabItem.setText("Owner Objects");

			Composite ownerEditComp = new Composite(tabfolder, SWT.NONE);
			ownerEditComp.setLayout(new GridLayout(1, false));
			ownerstabItem.setControl(ownerEditComp);
			ownerTypeSelector = new ObjectTypeSelectionTreeComposite(
					configurationController, ownerEditComp, SWT.NONE);
			ownerTypeSelector.setPathInput(configItem,
					getEditingDomain(configItem), null, false);
		}

		configItemEditBindings = initializePassportEntryGroupEditBindings(configItem);

		value.setValue(configItem);
		sashForm.setWeights(new int[] { 1, 1 });
		sashForm.layout();

	}

	private DataBindingContext initializePassportEntryGroupEditBindings(
			BTSConfigItem configItem) {
		if (configItemEditBindings != null) {
			configItemEditBindings.dispose();
		}
		EMFUpdateValueStrategy us = new EMFUpdateValueStrategy();
		us.setBeforeSetValidator(new StringNotEmptyValidator());
		if (configItem.getPassportEditorConfig() == null) {
			configItem.setPassportEditorConfig(BtsmodelFactory.eINSTANCE
					.createBTSPassportEditorConfig());
		}
		DataBindingContext bindingContext = new DataBindingContext();
		EditingDomain editingDomain = getEditingDomain(configItem);
		labelText_CIEdit.load(configItem.getLabel(), editingDomain, true);

		descText_CIEdit.load(configItem.getDescription(), editingDomain, false);
		// value
		Binding binding = bindingContext.bindValue(
				WidgetProperties.text(SWT.Modify).observeDelayed(
						BTSUIConstants.DELAY, valueText_CIEdit),
				EMFEditProperties.value(editingDomain,
						BtsmodelPackage.Literals.BTS_CONFIG_ITEM__VALUE)
						.observe(configItem), us, null);

		// type
		Binding binding2 = bindingContext.bindValue(
				WidgetProperties.text(SWT.Modify).observeDelayed(
						BTSUIConstants.DELAY, typeText_CIEdit),
				EMFEditProperties.value(editingDomain,
						BtsmodelPackage.Literals.BTS_CONFIG_ITEM__TYPE)
						.observe(configItem), us, null);

		// subtype
		Binding binding3 = bindingContext.bindValue(
				WidgetProperties.text(SWT.Modify).observeDelayed(
						BTSUIConstants.DELAY, subtypeText_CIEdit),
				EMFEditProperties.value(editingDomain,
						BtsmodelPackage.Literals.BTS_CONFIG_ITEM__SUBTYPE)
						.observe(configItem), us, null);

		// sortkey
		Binding binding4 = bindingContext.bindValue(
				WidgetProperties.selection().observeDelayed(400,
						sortSpinner_CIEdit),
				EMFEditProperties.value(editingDomain,
						BtsmodelPackage.Literals.BTS_CONFIG_ITEM__SORT_KEY)
						.observe(configItem), null, null);
		// ignore
		Binding binding5 = bindingContext.bindValue(WidgetProperties
				.selection().observeDelayed(0, ignoreBTN_CIEdit), EMFProperties
				.value(BtsmodelPackage.Literals.BTS_CONFIG_ITEM__IGNORE)
				.observe(configItem), null, null);
		bindingContext.addValidationStatusProvider(binding);

		// allow multiple
		FeaturePath feature2 = FeaturePath
				.fromList(
						BtsmodelPackage.Literals.BTS_CONFIG_ITEM__PASSPORT_EDITOR_CONFIG,
						BtsmodelPackage.Literals.BTS_PASSPORT_EDITOR_CONFIG__ALLOW_MULTIPLE);
		Binding binding7 = bindingContext.bindValue(
				WidgetProperties.selection().observeDelayed(0,
						allowMultiBTN_CIEdit),
				EMFEditProperties.value(editingDomain, feature2).observe(
						configItem), null, null);
		// h width
		FeaturePath feature4 = FeaturePath
				.fromList(
						BtsmodelPackage.Literals.BTS_CONFIG_ITEM__PASSPORT_EDITOR_CONFIG,
						BtsmodelPackage.Literals.BTS_PASSPORT_EDITOR_CONFIG__HORIZONTAL_WIDTH);
		Binding binding9 = bindingContext.bindValue(
				WidgetProperties.selection().observeDelayed(0,
						hSpanSpinner_GroupIEdit),
				EMFEditProperties.value(editingDomain, feature4).observe(
						configItem), null, null);

		BackgroundControlDecorationSupport.create(binding, SWT.TOP | SWT.LEFT);
		return bindingContext;
	}

	private void loadPassportCategoriesEditor(BTSConfigItem configItem) {
		mainConfigRight.dispose();
		mainConfigRight = null;
		mainConfigRight = new Composite(sashForm, SWT.NONE);
		mainConfigRight.setLayout(new FillLayout(SWT.HORIZONTAL));

		Composite configItemEditComp = new Composite(mainConfigRight, SWT.NONE);
		configItemEditComp.setLayout(new GridLayout(3, false));

		Label lblLabel_1 = new Label(configItemEditComp, SWT.NONE);
		lblLabel_1.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
				false, 1, 1));
		lblLabel_1.setText("Label");

		labelText_CIEdit = new TranslationEditorComposite(configItemEditComp,
				SWT.BORDER, null, null, true);
		labelText_CIEdit.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 2, 1));

		Label lblDescription = new Label(configItemEditComp, SWT.NONE);
		lblDescription.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
				false, 1, 1));
		lblDescription.setText("Description");

		descText_CIEdit = new TranslationEditorComposite(configItemEditComp,
				SWT.BORDER, null, null, false);
		descText_CIEdit.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 2, 1));

		Label lblValue = new Label(configItemEditComp, SWT.NONE);
		lblValue.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
				false, 1, 1));
		lblValue.setText("Value");

		valueText_CIEdit = new Text(configItemEditComp, SWT.BORDER);
		valueText_CIEdit.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 2, 1));

		Label lblType = new Label(configItemEditComp, SWT.NONE);
		lblType.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false,
				1, 1));
		lblType.setText("Type");

		typeText_CIEdit = new Text(configItemEditComp, SWT.BORDER);
		typeText_CIEdit.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 2, 1));

		Label lblSubtype = new Label(configItemEditComp, SWT.NONE);
		lblSubtype.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
				false, 1, 1));
		lblSubtype.setText("Subtype");

		subtypeText_CIEdit = new Text(configItemEditComp, SWT.BORDER);
		subtypeText_CIEdit.setLayoutData(new GridData(SWT.FILL, SWT.CENTER,
				true, false, 2, 1));

		Label lblSortkey = new Label(configItemEditComp, SWT.NONE);
		lblSortkey.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
				false, 1, 1));
		lblSortkey.setText("SortKey");

		sortSpinner_CIEdit = new Spinner(configItemEditComp, SWT.BORDER);
		sortSpinner_CIEdit.setLayoutData(new GridData(SWT.FILL, SWT.CENTER,
				true, false, 2, 1));

		Label lblIgnore = new Label(configItemEditComp, SWT.NONE);
		lblIgnore.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
				false, 1, 1));
		lblIgnore.setText("Ignore");

		ignoreBTN_CIEdit = new Button(configItemEditComp, SWT.CHECK);
		ignoreBTN_CIEdit.setText("ignore");
		ignoreBTN_CIEdit.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 2, 1));

		Label newConfigItemLabel = new Label(configItemEditComp, SWT.NONE);
		newConfigItemLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER,
				false, false, 1, 1));
		newConfigItemLabel.setText("New Category");

		newCIText_ConfigurationEdit = new Text(configItemEditComp, SWT.BORDER);
		newCIText_ConfigurationEdit.setLayoutData(new GridData(SWT.FILL,
				SWT.CENTER, true, false, 1, 1));

		Button newCIBTN = new Button(configItemEditComp, SWT.PUSH);
		newCIBTN.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false,
				1, 1));
		newCIBTN.setText("Add Category");
		newCIBTN.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				BTSConfigItem ci = configurationController
						.createNewConfigItem(newCIText_ConfigurationEdit
								.getText());
				ci.setType(BTSCoreConstants.PASSPORT_CATEGORY);
				for (String s : ((BTSConfigItem) selectedConfig).getOwnerReferencedTypesStringList())
				{
					ci.getOwnerReferencedTypesStringList().add(s);
				}
				CompoundCommand compoundCommand = new CompoundCommand();
				org.eclipse.emf.common.command.Command command = AddCommand
						.create(getEditingDomain(selectedConfig),
								selectedConfig,
								BtsmodelPackage.Literals.BTS_CONFIG__CHILDREN,
								ci);
				compoundCommand.append(command);
				getEditingDomain(selectedConfig).getCommandStack().execute(
						compoundCommand);
				treeViewer.refresh(selectedConfig);

			}
		});
		configItemEditBindings = initializePassportCategoriesEditBindings(configItem);

		value.setValue(configItem);
		sashForm.setWeights(new int[] { 1, 1 });
		sashForm.layout();
	}

	private DataBindingContext initializePassportCategoriesEditBindings(
			BTSConfigItem configItem) {
		if (configItemEditBindings != null) {
			configItemEditBindings.dispose();
		}
		EMFUpdateValueStrategy us = new EMFUpdateValueStrategy();
		us.setBeforeSetValidator(new StringNotEmptyValidator());

		DataBindingContext bindingContext = new DataBindingContext();
		EditingDomain editingDomain = getEditingDomain(configItem);
		labelText_CIEdit.load(configItem.getLabel(), editingDomain, true);

		descText_CIEdit.load(configItem.getDescription(), editingDomain, false);
		// value
		Binding binding = bindingContext.bindValue(
				WidgetProperties.text(SWT.Modify).observeDelayed(
						BTSUIConstants.DELAY, valueText_CIEdit),
				EMFEditProperties.value(editingDomain,
						BtsmodelPackage.Literals.BTS_CONFIG_ITEM__VALUE)
						.observe(configItem), us, null);

		// type
		Binding binding2 = bindingContext.bindValue(
				WidgetProperties.text(SWT.Modify).observeDelayed(
						BTSUIConstants.DELAY, typeText_CIEdit),
				EMFEditProperties.value(editingDomain,
						BtsmodelPackage.Literals.BTS_CONFIG_ITEM__TYPE)
						.observe(configItem), us, null);

		// subtype
		Binding binding3 = bindingContext.bindValue(
				WidgetProperties.text(SWT.Modify).observeDelayed(
						BTSUIConstants.DELAY, subtypeText_CIEdit),
				EMFEditProperties.value(editingDomain,
						BtsmodelPackage.Literals.BTS_CONFIG_ITEM__SUBTYPE)
						.observe(configItem), us, null);

		// sortkey
		Binding binding4 = bindingContext.bindValue(
				WidgetProperties.selection().observeDelayed(400,
						sortSpinner_CIEdit),
				EMFEditProperties.value(editingDomain,
						BtsmodelPackage.Literals.BTS_CONFIG_ITEM__SORT_KEY)
						.observe(configItem), null, null);
		// ignore
		Binding binding5 = bindingContext.bindValue(WidgetProperties
				.selection().observeDelayed(0, ignoreBTN_CIEdit), EMFProperties
				.value(BtsmodelPackage.Literals.BTS_CONFIG_ITEM__IGNORE)
				.observe(configItem), null, null);
		bindingContext.addValidationStatusProvider(binding);

		BackgroundControlDecorationSupport.create(binding, SWT.TOP | SWT.LEFT);
		return bindingContext;
	}

	private void loadPassportEntryItemEditor(final BTSConfigItem configItem) {
		mainConfigRight.dispose();
		mainConfigRight = null;
		mainConfigRight = new Composite(sashForm, SWT.NONE);
		mainConfigRight.setLayout(new FillLayout(SWT.HORIZONTAL));

		tabfolder = new TabFolder(mainConfigRight, SWT.NONE);
		{
			TabItem configtabItem = new TabItem(tabfolder, SWT.NONE);
			configtabItem.setText("Configuration");

			Composite configItemEditComp = new Composite(tabfolder, SWT.NONE);
			configItemEditComp.setLayout(new GridLayout(3, false));
			configtabItem.setControl(configItemEditComp);
			Label lblLabel_1 = new Label(configItemEditComp, SWT.NONE);
			lblLabel_1.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
					false, 1, 1));
			lblLabel_1.setText("Label");

			labelText_CIEdit = new TranslationEditorComposite(
					configItemEditComp, SWT.BORDER, false);
			labelText_CIEdit.setLayoutData(new GridData(SWT.FILL, SWT.CENTER,
					true, false, 2, 1));

			Label lblDescription = new Label(configItemEditComp, SWT.NONE);
			lblDescription.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER,
					false, false, 1, 1));
			lblDescription.setText("Description");

			descText_CIEdit = new TranslationEditorComposite(
					configItemEditComp, SWT.BORDER, false);
			descText_CIEdit.setLayoutData(new GridData(SWT.FILL, SWT.CENTER,
					true, false, 2, 1));

			Label lblValue = new Label(configItemEditComp, SWT.NONE);
			lblValue.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
					false, 1, 1));
			lblValue.setText("Value");

			valueText_CIEdit = new Text(configItemEditComp, SWT.BORDER);
			valueText_CIEdit.setLayoutData(new GridData(SWT.FILL, SWT.CENTER,
					true, false, 2, 1));

			Label lblType = new Label(configItemEditComp, SWT.NONE);
			lblType.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
					false, 1, 1));
			lblType.setText("Type");

			typeText_CIEdit = new Text(configItemEditComp, SWT.BORDER);
			typeText_CIEdit.setLayoutData(new GridData(SWT.FILL, SWT.CENTER,
					true, false, 2, 1));

			Label lblSubtype = new Label(configItemEditComp, SWT.NONE);
			lblSubtype.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
					false, 1, 1));
			lblSubtype.setText("Subtype");

			subtypeText_CIEdit = new Text(configItemEditComp, SWT.BORDER);
			subtypeText_CIEdit.setLayoutData(new GridData(SWT.FILL, SWT.CENTER,
					true, false, 2, 1));

			Label lblSortkey = new Label(configItemEditComp, SWT.NONE);
			lblSortkey.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
					false, 1, 1));
			lblSortkey.setText("SortKey");

			sortSpinner_CIEdit = new Spinner(configItemEditComp, SWT.BORDER);
			sortSpinner_CIEdit.setLayoutData(new GridData(SWT.FILL, SWT.CENTER,
					true, false, 2, 1));

			Label lblIgnore = new Label(configItemEditComp, SWT.NONE);
			lblIgnore.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
					false, 1, 1));
			lblIgnore.setText("Ignore");

			ignoreBTN_CIEdit = new Button(configItemEditComp, SWT.CHECK);
			ignoreBTN_CIEdit.setText("ignore");
			ignoreBTN_CIEdit.setLayoutData(new GridData(SWT.FILL, SWT.CENTER,
					true, false, 2, 1));


			final Group grpWidgetDescription = new Group(configItemEditComp,
					SWT.NONE);


			grpWidgetDescription.setText("Widget Description");
			grpWidgetDescription.setLayout(new GridLayout(4, false));
			grpWidgetDescription.setLayoutData(new GridData(SWT.FILL, SWT.FILL,
					true, true, 3, 2));

			Label lblWidgetType = new Label(grpWidgetDescription, SWT.NONE);
			lblWidgetType.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER,
					false, false, 1, 1));
			lblWidgetType.setText("Widget Type");

			widgetCB_CIEdit = new Combo(grpWidgetDescription, SWT.READ_ONLY);
			widgetCB_CIEdit.setLayoutData(new GridData(SWT.FILL, SWT.CENTER,
					true, false, 3, 1));
			widgetCB_CIEdit.setItems(BTSCoreConstants.WIDGET_TYPES);


			allowMultiBTN_CIEdit = new Button(grpWidgetDescription, SWT.CHECK);
			allowMultiBTN_CIEdit.setText("Allow multiple");

			requiredBTN_CIEdit = new Button(grpWidgetDescription, SWT.CHECK);
			requiredBTN_CIEdit.setText("Required");

			Label lblHorizontalSpan = new Label(grpWidgetDescription, SWT.NONE);
			lblHorizontalSpan.setText("Horizontal Span");

			hSpanSpinner_CIEdit = new Spinner(grpWidgetDescription, SWT.BORDER);
			hSpanSpinner_CIEdit.setMinimum(1);
			hSpanSpinner_CIEdit
					.setMaximum(BTSUIConstants.PASSPORT_COLUMN_NUMBER);

			Label lblRegex = new Label(grpWidgetDescription, SWT.NONE);
			lblRegex.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
					false, 1, 1));
			lblRegex.setText("Regex");

			regexText_CIEdit = new Text(grpWidgetDescription, SWT.BORDER);
			regexText_CIEdit.setLayoutData(new GridData(SWT.FILL, SWT.CENTER,
					true, false, 3, 1));
			grpWidgetDescription.layout();
		}// end configuration tabitem
		{
			TabItem ownerstabItem = new TabItem(tabfolder, SWT.NONE);
			ownerstabItem.setText("Owner and Related Objects");

			Composite ownerEditComp = new Composite(tabfolder, SWT.NONE);
			ownerEditComp.setLayout(new GridLayout(1, false));
			ownerstabItem.setControl(ownerEditComp);
			
			context.set(Composite.class, ownerEditComp);
			context.set(BTSConfigItem.class, configItem);
			context.set(Integer.class, SWT.None);
			relationSubjectObjectTypesEditor = ContextInjectionFactory.make(RelationSubjectObjectTypesSelectionComposite.class, context);
			relationSubjectObjectTypesEditor.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

		}
		configItemEditBindings = initializePassportEntryItemEditBindings(configItem);

		value.setValue(configItem);
		sashForm.setWeights(new int[] { 1, 1 });
		sashForm.layout();
	}

	private void loadReferencedObjectsTabItem(TabFolder tabfolder,
			TabItem referencedtabItem, BTSConfigItem configItem,
			String widgetType) {

		// purge old composite
		referencedtabItem.setControl(null);
		Composite referencedEditComp = new Composite(tabfolder, SWT.NONE);
		referencedEditComp.setLayout(new GridLayout(1, false));
		referencedtabItem.setControl(referencedEditComp);

		// first check and load standard widget types
		if (BTSCoreConstants.WIDGET_TYPE_TEXT.equals(widgetType)) {
			loadTextReferencedObjectsTabItem(tabfolder, referencedtabItem,
					configItem);
		} else if (BTSCoreConstants.WIDGET_TYPE_TEXT_SUGGEST.equals(widgetType)) {
			loadTextSuggestReferencedObjectsTabItem(tabfolder,
					referencedtabItem, configItem);
		} else if (BTSCoreConstants.WIDGET_TYPE_TEXT_FIELD.equals(widgetType)) {
			loadTextFieldReferencedObjectsTabItem(tabfolder, referencedtabItem,
					configItem);
		} else if (BTSCoreConstants.WIDGET_TYPE_SELECT_CONFIG
				.equals(widgetType)) {
			loadSelectConfigReferencedObjectsTabItem(tabfolder,
					referencedtabItem, configItem);
		} else if (BTSCoreConstants.WIDGET_TYPE_SELECT_INTEGER
				.equals(widgetType)) {
			loadSelectIntegerReferencedObjectsTabItem(tabfolder,
					referencedtabItem, configItem);
		} else if (BTSCoreConstants.WIDGET_TYPE_SELECT_THS.equals(widgetType)) {
			loadSelectTHSReferencedObjectsTabItem(tabfolder, referencedtabItem,
					configItem);
		} else if (BTSCoreConstants.WIDGET_TYPE_BOOLEAN.equals(widgetType)) {
			loadBooleanReferencedObjectsTabItem(tabfolder, referencedtabItem,
					configItem);
		} else if (BTSCoreConstants.WIDGET_TYPE_DATE.equals(widgetType)) {
			loadDateReferencedObjectsTabItem(tabfolder, referencedtabItem,
					configItem);
		} else if (BTSCoreConstants.WIDGET_TYPE_REFERENCE_EXTERNAL
				.equals(widgetType)) {
			loadReferenceReferencedObjectsTabItem(tabfolder, referencedtabItem,
					configItem);
		}

	}

	
	//FIXME update
//	private void loadRelationSelectReferencedObjectsTabItem(
//			TabFolder tabfolder, TabItem referencedtabItem,
//			BTSConfigItem configItem) {
//		Composite referencedEditComp = (Composite) referencedtabItem
//				.getControl();
//		referencedTypeSelector = new ObjectTypeSelectionTreeComposite(
//				configurationController, referencedEditComp, SWT.NONE);
//		if (configItem.getPassportEditorConfig() == null) {
//
//		} else {
//			if (configItem.getPassportEditorConfig().getReferencedTypesPath() == null) {
//				configItem.getPassportEditorConfig()
//						.setReferencedTypesPath(
//								BtsmodelFactory.eINSTANCE
//										.createBTSObjectTypePathRoot());
//			}
//			referencedTypeSelector.setPathInput(configItem
//					.getPassportEditorConfig().getReferencedTypesPath(),
//					getEditingDomain(configItem), configurationController
//							.getObjectTypesConfigItem());
//		}
//		Label relLabel = new Label(referencedEditComp, SWT.NONE);
//		relLabel.setText("Select Relations");
//		relLabel.setLayoutData(new GridData());
//		predicateSelector = new ObjectTypeSelectionTreeComposite(
//				configurationController, referencedEditComp, SWT.NONE);
//		if (configItem.getPassportEditorConfig() == null) {
//
//		} else {
//			if (configItem.getPassportEditorConfig().getPredicatePath() == null) {
//				configItem.getPassportEditorConfig()
//						.setPredicatePath(
//								BtsmodelFactory.eINSTANCE
//										.createBTSObjectTypePathRoot());
//			}
//			BTSConfigItem ci = configurationController.getRelationsConfigItem();
//			predicateSelector.setPathInput(configItem.getPassportEditorConfig()
//					.getPredicatePath(), getEditingDomain(configItem), ci);
//		}
//	}

	
	
	//FIXME update
//	private void loadRelationPreselectedReferencedObjectsTabItem(
//			TabFolder tabfolder, TabItem referencedtabItem,
//			BTSConfigItem configItem) {
//		Composite referencedEditComp = (Composite) referencedtabItem
//				.getControl();
//		referencedTypeSelector = new ObjectTypeSelectionTreeComposite(
//				configurationController, referencedEditComp, SWT.NONE);
//		if (configItem.getPassportEditorConfig() == null) {
//
//		} else {
//			if (configItem.getPassportEditorConfig().getReferencedTypesPath() == null) {
//				configItem.getPassportEditorConfig()
//						.setReferencedTypesPath(
//								BtsmodelFactory.eINSTANCE
//										.createBTSObjectTypePathRoot());
//			}
//			referencedTypeSelector.setPathInput(configItem
//					.getPassportEditorConfig().getReferencedTypesPath(),
//					getEditingDomain(configItem), configurationController
//							.getObjectTypesConfigItem());
//		}
//
//	}

	private void loadReferenceReferencedObjectsTabItem(TabFolder tabfolder,
			TabItem referencedtabItem, BTSConfigItem configItem) {
		// TODO Auto-generated method stub

	}

	private void loadDateReferencedObjectsTabItem(TabFolder tabfolder,
			TabItem referencedtabItem, BTSConfigItem configItem) {
		// TODO Auto-generated method stub

	}

	private void loadBooleanReferencedObjectsTabItem(TabFolder tabfolder,
			TabItem referencedtabItem, BTSConfigItem configItem) {
		// TODO Auto-generated method stub

	}

	private void loadSelectTHSReferencedObjectsTabItem(TabFolder tabfolder,
			TabItem referencedtabItem, BTSConfigItem configItem) {
		// TODO Auto-generated method stub

	}

	private void loadSelectIntegerReferencedObjectsTabItem(TabFolder tabfolder,
			TabItem referencedtabItem, BTSConfigItem configItem) {
		// TODO Auto-generated method stub

	}

	private void loadTextFieldReferencedObjectsTabItem(TabFolder tabfolder,
			TabItem referencedtabItem, BTSConfigItem configItem) {
		// TODO Auto-generated method stub

	}

	private void loadTextSuggestReferencedObjectsTabItem(TabFolder tabfolder,
			TabItem referencedtabItem, BTSConfigItem configItem) {
		// TODO Auto-generated method stub

	}

	private void loadTextReferencedObjectsTabItem(TabFolder tabfolder,
			TabItem referencedtabItem, BTSConfigItem configItem) {
		// TODO Auto-generated method stub

	}

	private void loadSelectConfigReferencedObjectsTabItem(TabFolder tabfolder,
			TabItem referencedtabItem, BTSConfigItem configItem) {
		Composite referencedEditComp = (Composite) referencedtabItem
				.getControl();
		referencedTypeSelector = new ObjectTypeSelectionTreeComposite(
				configurationController, referencedEditComp, SWT.NONE);
		if (configItem.getPassportEditorConfig() == null) {

		} 
		//FIXME update
//		else {
//			if (configItem.getPassportEditorConfig().getReferencedTypesPath() == null) {
//				configItem.getPassportEditorConfig()
//						.setReferencedTypesPath(
//								BtsmodelFactory.eINSTANCE
//										.createBTSObjectTypePathRoot());
//			}
//			referencedTypeSelector.setPathInput(configItem
//					.getPassportEditorConfig().getReferencedTypesPath(),
//					getEditingDomain(configItem), configurationController
//							.getActiveConfiguration());
//		}

	}

	private String[] getObjectTypes() {
		// TODO Auto-generated method stub
		return new String[] { "Annotation", "CorpusObject", "Image",
				"ListEntry", "Text", "TextCorpus" };
	}

	private DataBindingContext initializePassportEntryItemEditBindings(
			BTSConfigItem configItem) {
		if (configItemEditBindings != null) {
			configItemEditBindings.dispose();
		}
		EMFUpdateValueStrategy us = new EMFUpdateValueStrategy();
		us.setBeforeSetValidator(new StringNotEmptyValidator());

		DataBindingContext bindingContext = new DataBindingContext();

		EditingDomain editingDomain = getEditingDomain(configItem);
		labelText_CIEdit.load(configItem.getLabel(), editingDomain, true);

		descText_CIEdit.load(configItem.getDescription(), editingDomain, false);

		// value
		Binding binding = bindingContext.bindValue(
				WidgetProperties.text(SWT.Modify).observeDelayed(
						BTSUIConstants.DELAY, valueText_CIEdit),
				EMFEditProperties.value(editingDomain,
						BtsmodelPackage.Literals.BTS_CONFIG_ITEM__VALUE)
						.observe(configItem), us, null);

		bindingContext.addValidationStatusProvider(binding);

		BackgroundControlDecorationSupport.create(binding, SWT.TOP | SWT.LEFT);
		// type
		Binding binding2 = bindingContext.bindValue(
				WidgetProperties.text(SWT.Modify).observeDelayed(
						BTSUIConstants.DELAY, typeText_CIEdit),
				EMFEditProperties.value(editingDomain,
						BtsmodelPackage.Literals.BTS_CONFIG_ITEM__TYPE)
						.observe(configItem), us, null);

		// subtype
		Binding binding3 = bindingContext.bindValue(
				WidgetProperties.text(SWT.Modify).observeDelayed(
						BTSUIConstants.DELAY, subtypeText_CIEdit),
				EMFEditProperties.value(editingDomain,
						BtsmodelPackage.Literals.BTS_CONFIG_ITEM__SUBTYPE)
						.observe(configItem), us, null);

		// sortkey
		Binding binding4 = bindingContext.bindValue(
				WidgetProperties.selection().observeDelayed(400,
						sortSpinner_CIEdit),
				EMFEditProperties.value(editingDomain,
						BtsmodelPackage.Literals.BTS_CONFIG_ITEM__SORT_KEY)
						.observe(configItem), null, null);
		// ignore
		Binding binding5 = bindingContext.bindValue(
				WidgetProperties.selection()
						.observeDelayed(0, ignoreBTN_CIEdit),
				EMFEditProperties.value(editingDomain,
						BtsmodelPackage.Literals.BTS_CONFIG_ITEM__IGNORE)
						.observe(configItem), null, null);



		// allow multiple
		FeaturePath feature2 = FeaturePath
				.fromList(
						BtsmodelPackage.Literals.BTS_CONFIG_ITEM__PASSPORT_EDITOR_CONFIG,
						BtsmodelPackage.Literals.BTS_PASSPORT_EDITOR_CONFIG__ALLOW_MULTIPLE);
		Binding binding7 = bindingContext.bindValue(
				WidgetProperties.selection().observeDelayed(0,
						allowMultiBTN_CIEdit),
				EMFEditProperties.value(editingDomain, feature2).observe(
						configItem), null, null);

		// required
		FeaturePath feature3 = FeaturePath
				.fromList(
						BtsmodelPackage.Literals.BTS_CONFIG_ITEM__PASSPORT_EDITOR_CONFIG,
						BtsmodelPackage.Literals.BTS_PASSPORT_EDITOR_CONFIG__REQUIRED);
		Binding binding8 = bindingContext.bindValue(
				WidgetProperties.selection().observeDelayed(0,
						requiredBTN_CIEdit),
				EMFEditProperties.value(editingDomain, feature3).observe(
						configItem), null, null);
		// h width
		FeaturePath feature4 = FeaturePath
				.fromList(
						BtsmodelPackage.Literals.BTS_CONFIG_ITEM__PASSPORT_EDITOR_CONFIG,
						BtsmodelPackage.Literals.BTS_PASSPORT_EDITOR_CONFIG__HORIZONTAL_WIDTH);
		Binding binding9 = bindingContext.bindValue(
				WidgetProperties.selection().observeDelayed(0,
						hSpanSpinner_CIEdit),
				EMFEditProperties.value(editingDomain, feature4).observe(
						configItem), null, null);
		// regex
		EMFUpdateValueStrategy usReg = new EMFUpdateValueStrategy();
		usReg.setBeforeSetValidator(new StringIsRegexPatternValidator());
		FeaturePath feature5 = FeaturePath
				.fromList(
						BtsmodelPackage.Literals.BTS_CONFIG_ITEM__PASSPORT_EDITOR_CONFIG,
						BtsmodelPackage.Literals.BTS_PASSPORT_EDITOR_CONFIG__REGEX);
		Binding binding10 = bindingContext.bindValue(
				WidgetProperties.text(SWT.Modify).observeDelayed(
						BTSUIConstants.DELAY, regexText_CIEdit),
				EMFEditProperties.value(editingDomain, feature5).observe(
						configItem), usReg, null);
		BackgroundControlDecorationSupport
				.create(binding10, SWT.TOP | SWT.LEFT);
		bindingContext.addValidationStatusProvider(binding10);

		// widget type
		FeaturePath feature6 = FeaturePath
				.fromList(
						BtsmodelPackage.Literals.BTS_CONFIG_ITEM__PASSPORT_EDITOR_CONFIG,
						BtsmodelPackage.Literals.BTS_PASSPORT_EDITOR_CONFIG__WIDGET_TYPE);
		Binding binding11 = bindingContext.bindValue(
				WidgetProperties.selection().observeDelayed(
						BTSUIConstants.DELAY, widgetCB_CIEdit),
				EMFEditProperties.value(editingDomain, feature6).observe(
						configItem), null, null);

		// owner types

		return bindingContext;
	}

	private void loadConfigurationEditor(BTSConfiguration configuration) {
		mainConfigRight.dispose();
		mainConfigRight = null;
		mainConfigRight = new Composite(sashForm, SWT.NONE);
		mainConfigRight.setLayout(new FillLayout(SWT.HORIZONTAL));
		Composite configurationEditComp = new Composite(mainConfigRight,
				SWT.NONE);
		configurationEditComp.setLayout(new GridLayout(3, false));

		Label lblName = new Label(configurationEditComp, SWT.NONE);
		lblName.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false,
				1, 1));
		lblName.setText("Name");

		nameText_ConfigurationEdit = new Text(configurationEditComp, SWT.BORDER);
		nameText_ConfigurationEdit.setLayoutData(new GridData(SWT.FILL,
				SWT.CENTER, true, false, 2, 1));

		Label lblProvider = new Label(configurationEditComp, SWT.NONE);
		lblProvider.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
				false, 1, 1));
		lblProvider.setText("Provider");

		providerText = new Text(configurationEditComp, SWT.BORDER);
		providerText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 2, 1));

		Label newConfigItemLabel = new Label(configurationEditComp, SWT.NONE);
		newConfigItemLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER,
				false, false, 1, 1));
		newConfigItemLabel.setText("New ConfigItem");

		newCIText_ConfigurationEdit = new Text(configurationEditComp,
				SWT.BORDER);
		newCIText_ConfigurationEdit.setLayoutData(new GridData(SWT.FILL,
				SWT.CENTER, true, false, 1, 1));

		Button newCIBTN = new Button(configurationEditComp, SWT.PUSH);
		newCIBTN.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false,
				1, 1));
		newCIBTN.setText("New ConfigItem");
		newCIBTN.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {

				BTSConfigItem ci = configurationController
						.createNewConfigItem(newCIText_ConfigurationEdit
								.getText());
				ci.setValue(newCIText_ConfigurationEdit.getText());
				if (selectedConfig instanceof BTSConfigItem) {
					for (String s : ((BTSConfigItem) selectedConfig).getOwnerReferencedTypesStringList())
					{
						ci.getOwnerReferencedTypesStringList().add(s);
					}
				}
				CompoundCommand compoundCommand = new CompoundCommand();
				org.eclipse.emf.common.command.Command command = AddCommand
						.create(getEditingDomain(selectedConfig),
								selectedConfig,
								BtsmodelPackage.Literals.BTS_CONFIG__CHILDREN,
								ci);
				compoundCommand.append(command);
				getEditingDomain(selectedConfig).getCommandStack().execute(
						compoundCommand);
				treeViewer.refresh(selectedConfig);

			}
		});

		configurationEditBindings = initializeConfigurationEditBindings(configuration);

		value.setValue(configuration);
		sashForm.setWeights(new int[] { 1, 1 });
		sashForm.layout();
	}

	private DataBindingContext initializeConfigurationEditBindings(
			BTSConfiguration configuration) {
		if (configurationEditBindings != null) {
			configurationEditBindings.dispose();
		}
		EditingDomain editingDomain = getEditingDomain(configuration);
		DataBindingContext bindingContext = new DataBindingContext();
		EMFUpdateValueStrategy us = new EMFUpdateValueStrategy();
		us.setBeforeSetValidator(new StringNotEmptyValidator());
		IObservableValue model = EMFEditProperties.value(editingDomain,
				BtsmodelPackage.Literals.BTS_OBJECT__NAME).observe(
				configuration);
		Binding binding = bindingContext.bindValue(
				WidgetProperties.text(SWT.Modify).observeDelayed(
						BTSUIConstants.DELAY, nameText_ConfigurationEdit),
				model, us, null);
		BackgroundControlDecorationSupport.create(binding, SWT.TOP | SWT.LEFT);
		bindingContext.addValidationStatusProvider(binding);

		IObservableValue model2 = EMFEditProperties.value(editingDomain,
				BtsmodelPackage.Literals.BTS_CONFIGURATION__PROVIDER).observe(
				configuration);
		Binding binding2 = bindingContext.bindValue(
				WidgetProperties.text(SWT.Modify).observeDelayed(
						BTSUIConstants.DELAY, providerText), model2, us, null);

		bindingContext.addValidationStatusProvider(binding2);

		BackgroundControlDecorationSupport.create(binding, SWT.TOP | SWT.LEFT);
		return bindingContext;
	}

	/**
	 * Create contents of the button bar.
	 * 
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		okButton = createButton(parent, IDialogConstants.OK_ID,
				IDialogConstants.OK_LABEL, true);

		createButton(parent, IDialogConstants.CANCEL_ID,
				IDialogConstants.CANCEL_LABEL, false);
	}

	@Override
	protected void okPressed() {
		saveInput();
		super.okPressed();
	}

	private void saveInput() {
		System.out.println("saveInput");
		saveOldSelection(selectedConfig);
		for (Object o : root.getChildren()) {
			if (o instanceof BTSConfiguration) {
				configurationController.save((BTSConfiguration) o);
			} else if (o instanceof TreeNodeWrapper) {
				TreeNodeWrapper tn = (TreeNodeWrapper) o;
				configurationController.save((BTSConfiguration) tn.getObject());
			}
		}

	}

	private void setSelectedColor(Control control, boolean selection) {
		if (selection) {
			control.setForeground(control.getParent().getForeground());
			if (!((control instanceof Text) || (control instanceof Combo)
					|| (control instanceof MultiChoice<?>) || (control instanceof Spinner))) {
				control.setBackground(BACKGROUND_COLOR);
			}
		} else {
			control.setForeground(BTSUIConstants.VIEW_FOREGROUND_DESELECTED_COLOR);
			control.setBackground(BTSUIConstants.VIEW_BACKGROUND_DESELECTED_COLOR);

		}

		if (control instanceof Composite) {
			for (Control child : ((Composite) control).getChildren()) {
				setSelectedColor(child, selection);
			}
		}
	}

	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(1100, 650);
	}

	@Inject
	@Optional
	void eventReceivedNew(@EventTopic("model_new/*") BTSObject object) {
		if (object instanceof BTSConfiguration) {
			addObjectToInput((BTSConfiguration) object);
		}
	}

	private void addObjectToInput(final BTSConfiguration object) {
		TreeNodeWrapper tn = BtsviewmodelFactory.eINSTANCE
				.createTreeNodeWrapper();
		tn.setObject(object);
		root.getChildren().add(tn);
	}

	@PreDestroy
	public void preDestroy() {
		editingDomainMap = null;
	}

	private void purgeAll() {
		editingDomainMap.clear();
		selectedConfig = null;
		selection = null;
	}
	
	@Override
	protected boolean isResizable() {
		return true;
	}
}
