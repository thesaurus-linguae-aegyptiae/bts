package org.bbaw.bts.ui.main.dialogs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSConfig;
import org.bbaw.bts.btsmodel.BTSConfigItem;
import org.bbaw.bts.btsmodel.BTSConfiguration;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.BtsmodelPackage;
import org.bbaw.bts.commons.BTSPluginIDs;
import org.bbaw.bts.core.controller.dialogControllers.BTSConfigurationDialogController;
import org.bbaw.bts.core.controller.generalController.BTSConfigurationController;
import org.bbaw.bts.ui.main.dialogs.btsConfigDialog.provider.BTSConfigurationTreeLabelProvider;
import org.bbaw.bts.ui.main.dialogs.btsConfigDialog.provider.TreeFactoryImpl2;
import org.bbaw.bts.ui.main.dialogs.btsConfigDialog.provider.TreeStructureAdvisorImpl;
import org.bbaw.bts.ui.main.handlers.NewConfigurationHandler;
import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.ParameterizedCommand;
import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.beans.BeanProperties;
import org.eclipse.core.databinding.observable.list.WritableList;
import org.eclipse.core.databinding.observable.map.IObservableMap;
import org.eclipse.core.databinding.observable.masterdetail.IObservableFactory;
import org.eclipse.core.databinding.observable.set.IObservableSet;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.core.databinding.validation.IValidator;
import org.eclipse.core.databinding.validation.ValidationStatus;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.e4.core.commands.ECommandService;
import org.eclipse.e4.core.commands.EHandlerService;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Creatable;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.EventTopic;
import org.eclipse.e4.ui.services.internal.events.EventBroker;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.EMFUpdateValueStrategy;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.emf.databinding.edit.EMFEditProperties;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.databinding.fieldassist.ControlDecorationSupport;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.databinding.viewers.ObservableListTreeContentProvider;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Tree;
import org.mihalis.opal.multiChoice.MultiChoice;
import org.mihalis.opal.multiChoice.MultiChoiceSelectionListener;

@Creatable
public class BTSConfigurationDialog extends TitleAreaDialog
{

	private static final int DELAY = 400;

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
	private EditingDomain editingDomain;

	private Command newConfigCommand;

	private Combo activeConfigCB;

	private Tree tree;

	private Composite mainConfigRight;

	private TreeViewer treeViewer;

	private WritableList input;
	private StructuredSelection selection;

	private ArrayList<BTSConfiguration> configurations;
	@Inject
	private IEclipseContext context;
	private Text nameText_ConfigurationEdit;
	private Text providerText;

	private DataBindingContext configurationEditBindings;

	private IObservableValue value = new WritableValue();

	private SashForm sashForm;

	private Button okButton;
	private Text valueText_CIEdit;
	private Text typeText_CIEdit;
	private Text subtypeText_CIEdit;
	private Text labelText_CIEdit;
	private Text descText_CIEdit;
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

	private String[] WIDGET_TYPES = new String[] { "text", "date", "combo", "reference" };

	/**
	 * Create the dialog.
	 * 
	 * @param parentShell
	 */
	public BTSConfigurationDialog()
	{
		super(new Shell());
		System.out.println("construct BTSConfigurationDialog");

	}

	/**
	 * Create contents of the dialog.
	 * 
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent)
	{
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
		compLeftTop.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));

		Label availableConfigsLB = new Label(compLeftTop, SWT.NONE);
		availableConfigsLB.setText("All available Configurations");

		Button newConfigBTN = new Button(compLeftTop, SWT.NONE);
		newConfigBTN.setText("Create New configuration");
		newConfigBTN.addSelectionListener(new SelectionAdapter()
		{

			@Override
			public void widgetSelected(SelectionEvent e)
			{
				System.out.println("Button new pressed");

				Command command = commandService.getCommand(BTSPluginIDs.CMD_ID_NEW_CONFIGURATION);

				// Activate Handler
				handlerService.activateHandler(BTSPluginIDs.CMD_ID_NEW_CONFIGURATION, new NewConfigurationHandler());

				ParameterizedCommand cmd = commandService.createCommand(BTSPluginIDs.CMD_ID_NEW_CONFIGURATION, null);
				command = commandService.getCommand(BTSPluginIDs.CMD_ID_NEW_CONFIGURATION);

				handlerService.executeHandler(cmd);
			}

		});

		Label activeConfigLB = new Label(compLeftTop, SWT.NONE);
		activeConfigLB.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		activeConfigLB.setText("Currently active Configuration");

		activeConfigCB = new Combo(compLeftTop, SWT.NONE);
		activeConfigCB.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Composite compLeftTree = new Composite(mainCompLeft, SWT.NONE);
		compLeftTree.setLayout(new FillLayout(SWT.HORIZONTAL));
		compLeftTree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

		tree = new Tree(compLeftTree, SWT.BORDER);
		treeViewer = new TreeViewer(tree);

		mainConfigRight = new Composite(sashForm, SWT.NONE);
		mainConfigRight.setLayout(new FillLayout(SWT.HORIZONTAL));

		sashForm.setWeights(new int[] { 1, 1 });

		loadTree();
		return area;
	}

	private void loadTree()
	{
		ObservableListTreeContentProvider contentProvider = new ObservableListTreeContentProvider(
				(IObservableFactory) new TreeFactoryImpl2(), new TreeStructureAdvisorImpl());
		treeViewer.setContentProvider(contentProvider);
		IObservableSet knownElements = contentProvider.getKnownElements();

		IObservableMap[] attributeMaps = new IObservableMap[3];
		attributeMaps[0] = EMFEditProperties.value(editingDomain, BtsmodelPackage.Literals.BTS_CONFIGURATION__NAME)
				.observeDetail(knownElements);
		attributeMaps[1] = EMFEditProperties.value(editingDomain, BtsmodelPackage.Literals.BTS_CONFIG_ITEM__LABEL)
				.observeDetail(knownElements);
		attributeMaps[2] = EMFEditProperties.value(editingDomain, BtsmodelPackage.Literals.BTS_CONFIG_ITEM__VALUE)
				.observeDetail(knownElements);

		treeViewer.setLabelProvider(new BTSConfigurationTreeLabelProvider(attributeMaps));

		treeViewer.addSelectionChangedListener(new ISelectionChangedListener()
		{

			@Override
			public void selectionChanged(SelectionChangedEvent event)
			{
				selection = (StructuredSelection) event.getSelection();
				handleTreeSelection(selection);

			}

		});
		treeViewer.setSorter(new ViewerSorter()
		{
		});
		// Create sample data
		configurations = new ArrayList<BTSConfiguration>();

		List<BTSConfiguration> list = configurationController.listConfigurations();
		if (list != null) for (BTSConfiguration o : list)
		{
			configurations.add(o);
		}
		input = new WritableList(configurations, BTSConfiguration.class);
		// Set the writeableList as input for the viewer
		treeViewer.setInput(input);

	}

	private void handleTreeSelection(StructuredSelection selection)
	{
		if (selection.getFirstElement() instanceof BTSConfiguration)
		{
			BTSConfiguration configuration = (BTSConfiguration) selection.getFirstElement();
			selectedConfig = configuration;
			loadConfigurationEditor(configuration);
		} else if (selection.getFirstElement() instanceof BTSConfigItem)
		{
			BTSConfigItem configItem = (BTSConfigItem) selection.getFirstElement();
			selectedConfig = configItem;
			loadConfigItemEditor(configItem);
		}

	}

	private void loadConfigItemEditor(final BTSConfigItem configItem)
	{
		mainConfigRight.dispose();
		mainConfigRight = null;
		mainConfigRight = new Composite(sashForm, SWT.NONE);
		mainConfigRight.setLayout(new FillLayout(SWT.HORIZONTAL));

		Composite configItemEditComp = new Composite(mainConfigRight, SWT.NONE);
		configItemEditComp.setLayout(new GridLayout(3, false));

		Label lblLabel_1 = new Label(configItemEditComp, SWT.NONE);
		lblLabel_1.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblLabel_1.setText("Label");

		labelText_CIEdit = new Text(configItemEditComp, SWT.BORDER);
		labelText_CIEdit.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));

		Label lblDescription = new Label(configItemEditComp, SWT.NONE);
		lblDescription.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblDescription.setText("Description");

		descText_CIEdit = new Text(configItemEditComp, SWT.BORDER);
		descText_CIEdit.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));

		Label lblValue = new Label(configItemEditComp, SWT.NONE);
		lblValue.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblValue.setText("Value");

		valueText_CIEdit = new Text(configItemEditComp, SWT.BORDER);
		valueText_CIEdit.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));

		Label lblType = new Label(configItemEditComp, SWT.NONE);
		lblType.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblType.setText("Type");

		typeText_CIEdit = new Text(configItemEditComp, SWT.BORDER);
		typeText_CIEdit.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));

		Label lblSubtype = new Label(configItemEditComp, SWT.NONE);
		lblSubtype.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblSubtype.setText("Subtype");

		subtypeText_CIEdit = new Text(configItemEditComp, SWT.BORDER);
		subtypeText_CIEdit.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));

		Label lblSortkey = new Label(configItemEditComp, SWT.NONE);
		lblSortkey.setText("SortKey");

		sortSpinner_CIEdit = new Spinner(configItemEditComp, SWT.BORDER);
		sortSpinner_CIEdit.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));

		Label lblIgnore = new Label(configItemEditComp, SWT.NONE);
		lblIgnore.setText("Ignore");

		ignoreBTN_CIEdit = new Button(configItemEditComp, SWT.CHECK);
		ignoreBTN_CIEdit.setText("ignore");
		ignoreBTN_CIEdit.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));

		Label newConfigItemLabel = new Label(configItemEditComp, SWT.NONE);
		newConfigItemLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		newConfigItemLabel.setText("New ConfigItem");

		newCIText_ConfigurationEdit = new Text(configItemEditComp, SWT.BORDER);
		newCIText_ConfigurationEdit.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Button newCIBTN = new Button(configItemEditComp, SWT.PUSH);
		newCIBTN.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		newCIBTN.setText("New ConfigItem");
		newCIBTN.addSelectionListener(new SelectionAdapter()
		{

			@Override
			public void widgetSelected(SelectionEvent e)
			{
				BTSConfigItem ci = configurationController.createNewConfigItem();
				ci.setValue(newCIText_ConfigurationEdit.getText());
				selectedConfig.getChildren().add(ci);
				treeViewer.refresh();

			}
		});
		Label lblWidgetDefinition = new Label(configItemEditComp, SWT.NONE);
		lblWidgetDefinition.setText("Widget Definition");

		activateBTN_CIEdit = new Button(configItemEditComp, SWT.CHECK);
		activateBTN_CIEdit.setText("activate");
		activateBTN_CIEdit.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));

		Group grpWidgetDescription = new Group(configItemEditComp, SWT.NONE);
		grpWidgetDescription.setText("Widget Description");
		grpWidgetDescription.setLayout(new GridLayout(2, false));
		grpWidgetDescription.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 3, 2));

		Label lblWidgetType = new Label(grpWidgetDescription, SWT.NONE);
		lblWidgetType.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblWidgetType.setText("Widget Type");

		widgetCB_CIEdit = new Combo(grpWidgetDescription, SWT.NONE);
		widgetCB_CIEdit.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		widgetCB_CIEdit.setItems(WIDGET_TYPES);

		Label lblLabel = new Label(grpWidgetDescription, SWT.NONE);
		lblLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblLabel.setText("Label");

		labelTextWidget_CIEdit = new Text(grpWidgetDescription, SWT.BORDER);
		labelTextWidget_CIEdit.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Label lblMultiple = new Label(grpWidgetDescription, SWT.NONE);
		lblMultiple.setText("Multiple");

		allowMultiBTN_CIEdit = new Button(grpWidgetDescription, SWT.CHECK);
		allowMultiBTN_CIEdit.setText("allow multiple");

		Label lblRequired = new Label(grpWidgetDescription, SWT.NONE);
		lblRequired.setText("Required");

		requiredBTN_CIEdit = new Button(grpWidgetDescription, SWT.CHECK);
		requiredBTN_CIEdit.setText("required");

		Label lblShowWidget = new Label(grpWidgetDescription, SWT.NONE);
		lblShowWidget.setText("Show Widget");

		showBTN_CIEdit = new Button(grpWidgetDescription, SWT.CHECK);
		showBTN_CIEdit.setText("show");

		Label lblHorizontalSpan = new Label(grpWidgetDescription, SWT.NONE);
		lblHorizontalSpan.setText("Horizontal Span");

		hSpanSpinner_CIEdit = new Spinner(grpWidgetDescription, SWT.BORDER);

		Label lblRegex = new Label(grpWidgetDescription, SWT.NONE);
		lblRegex.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblRegex.setText("Regex");

		regexText_CIEdit = new Text(grpWidgetDescription, SWT.BORDER);
		regexText_CIEdit.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Label lblOwners = new Label(grpWidgetDescription, SWT.NONE);
		lblOwners.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblOwners.setText("Owner Types:");

		mcOwners = new MultiChoice<String>(grpWidgetDescription, SWT.None);
		mcOwners.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
		mcOwners.setSeparator("|");
		mcOwners.addAll(getObjectTypes());
		mcOwners.setSelectionListener(new MultiChoiceSelectionListener<String>(mcOwners)
		{

			@Override
			public void handle(MultiChoice<String> parent, String receiver, boolean selected, Shell popup)
			{
				if ("Select All".equals(receiver.toString()))
				{
					if (selected)
					{
						parent.deselectAll();
						parent.selectAll();
					} else
					{
						parent.deselectAll();
					}
					popup.setVisible(false);
				}
				configItem.getOwnerType().clear();
				configItem.getOwnerType().addAll(parent.getSelection());

			}
		});

		Label lblReferenced = new Label(grpWidgetDescription, SWT.NONE);
		lblReferenced.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblReferenced.setText("Referenced Types:");

		mcReferenced = new MultiChoice<String>(grpWidgetDescription, SWT.None);
		mcReferenced.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
		mcReferenced.setSeparator("|");
		mcReferenced.addAll(getObjectTypes());
		mcReferenced.setSelectionListener(new MultiChoiceSelectionListener<String>(mcReferenced)
		{

			@Override
			public void handle(MultiChoice<String> parent, String receiver, boolean selected, Shell popup)
			{
				if ("Select All".equals(receiver.toString()))
				{
					if (selected)
					{
						parent.deselectAll();
						parent.selectAll();
					} else
					{
						parent.deselectAll();
					}
					popup.setVisible(false);
				}
				configItem.getReferencedType().clear();
				configItem.getReferencedType().addAll(parent.getSelection());

			}
		});
		configItemEditBindings = initializeConfigItemEditBindings(configItem);

		value.setValue(configItem);
		sashForm.setWeights(new int[] { 1, 1 });
		sashForm.layout();
	}

	private String[] getObjectTypes()
	{
		// TODO Auto-generated method stub
		return new String[] { "Annotation", "CorpusObject", "Image", "ListEntry", "Text", "TextCorpus" };
	}

	private DataBindingContext initializeConfigItemEditBindings(BTSConfigItem configItem)
	{
		if (configItemEditBindings != null)
		{
			configItemEditBindings.dispose();
		}
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

		// value
		Binding binding = bindingContext.bindValue(
				WidgetProperties.text(SWT.Modify).observeDelayed(DELAY, valueText_CIEdit),
				EMFProperties.value(BtsmodelPackage.Literals.BTS_CONFIG_ITEM__VALUE).observe(configItem), us, null);

		// type
		Binding binding2 = bindingContext.bindValue(
				WidgetProperties.text(SWT.Modify).observeDelayed(DELAY, typeText_CIEdit),
				EMFProperties.value(BtsmodelPackage.Literals.BTS_CONFIG_ITEM__TYPE).observe(configItem), us, null);

		// subtype
		Binding binding3 = bindingContext.bindValue(
				WidgetProperties.text(SWT.Modify).observeDelayed(DELAY, subtypeText_CIEdit),
				EMFProperties.value(BtsmodelPackage.Literals.BTS_CONFIG_ITEM__SUBTYPE).observe(configItem), us, null);

		// sortkey
		Binding binding4 = bindingContext
				.bindValue(WidgetProperties.selection().observeDelayed(400, sortSpinner_CIEdit),
						EMFProperties.value(BtsmodelPackage.Literals.BTS_CONFIG_ITEM__SORT_KEY).observe(configItem),
						null, null);
		// ignore
		Binding binding5 = bindingContext.bindValue(WidgetProperties.selection().observeDelayed(0, ignoreBTN_CIEdit),
				EMFProperties.value(BtsmodelPackage.Literals.BTS_CONFIG_ITEM__IGNORE).observe(configItem), null, null);

		// show widget
		FeaturePath feature = FeaturePath.fromList(BtsmodelPackage.Literals.BTS_CONFIG_ITEM__PASSPORT_EDITOR_CONFIG,
				BtsmodelPackage.Literals.BTS_PASSPORT_EDITOR_CONFIG__SHOW_WIDGET);
		Binding binding6 = bindingContext.bindValue(WidgetProperties.selection().observeDelayed(0, activeConfigCB),
				EMFProperties.value(feature).observe(configItem), null, null);

		// allow multiple
		FeaturePath feature2 = FeaturePath.fromList(BtsmodelPackage.Literals.BTS_CONFIG_ITEM__PASSPORT_EDITOR_CONFIG,
				BtsmodelPackage.Literals.BTS_PASSPORT_EDITOR_CONFIG__ALLOW_MULTIPLE);
		Binding binding7 = bindingContext
				.bindValue(WidgetProperties.selection().observeDelayed(0, allowMultiBTN_CIEdit),
						EMFProperties.value(feature2).observe(configItem), null, null);

		// required
		FeaturePath feature3 = FeaturePath.fromList(BtsmodelPackage.Literals.BTS_CONFIG_ITEM__PASSPORT_EDITOR_CONFIG,
				BtsmodelPackage.Literals.BTS_PASSPORT_EDITOR_CONFIG__REQUIRED);
		Binding binding8 = bindingContext.bindValue(WidgetProperties.selection().observeDelayed(0, requiredBTN_CIEdit),
				EMFProperties.value(feature3).observe(configItem), null, null);
		// required
		FeaturePath feature4 = FeaturePath.fromList(BtsmodelPackage.Literals.BTS_CONFIG_ITEM__PASSPORT_EDITOR_CONFIG,
				BtsmodelPackage.Literals.BTS_PASSPORT_EDITOR_CONFIG__HORIZONTAL_WIDTH);
		Binding binding9 = bindingContext.bindValue(
				WidgetProperties.selection().observeDelayed(0, hSpanSpinner_CIEdit), EMFProperties.value(feature4)
						.observe(configItem), null, null);
		// regex
		FeaturePath feature5 = FeaturePath.fromList(BtsmodelPackage.Literals.BTS_CONFIG_ITEM__PASSPORT_EDITOR_CONFIG,
				BtsmodelPackage.Literals.BTS_PASSPORT_EDITOR_CONFIG__REGEX);
		Binding binding10 = bindingContext.bindValue(
				WidgetProperties.text(SWT.Modify).observeDelayed(DELAY, regexText_CIEdit), EMFProperties
						.value(feature5).observe(configItem), null, null);
		// widget type
		FeaturePath feature6 = FeaturePath.fromList(BtsmodelPackage.Literals.BTS_CONFIG_ITEM__PASSPORT_EDITOR_CONFIG,
				BtsmodelPackage.Literals.BTS_PASSPORT_EDITOR_CONFIG__WIDGET_TYPE);
		Binding binding11 = bindingContext.bindValue(WidgetProperties.selection()
				.observeDelayed(DELAY, widgetCB_CIEdit), EMFProperties.value(feature6).observe(configItem), null, null);

		// owner types
		Set<String> owners = new HashSet<String>();
		for (String s : configItem.getOwnerType())
		{
			owners.add(s);
		}
		mcOwners.setSelection(owners);

		bindingContext.addValidationStatusProvider(binding);

		ControlDecorationSupport.create(binding, SWT.TOP | SWT.LEFT);
		return bindingContext;
	}

	private void loadConfigurationEditor(BTSConfiguration configuration)
	{
		mainConfigRight.dispose();
		mainConfigRight = null;
		mainConfigRight = new Composite(sashForm, SWT.NONE);
		mainConfigRight.setLayout(new FillLayout(SWT.HORIZONTAL));
		Composite configurationEditComp = new Composite(mainConfigRight, SWT.NONE);
		configurationEditComp.setLayout(new GridLayout(3, false));

		Label lblName = new Label(configurationEditComp, SWT.NONE);
		lblName.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblName.setText("Name");

		nameText_ConfigurationEdit = new Text(configurationEditComp, SWT.BORDER);
		nameText_ConfigurationEdit.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));

		Label lblProvider = new Label(configurationEditComp, SWT.NONE);
		lblProvider.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblProvider.setText("Provider");

		providerText = new Text(configurationEditComp, SWT.BORDER);
		providerText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));

		Label newConfigItemLabel = new Label(configurationEditComp, SWT.NONE);
		newConfigItemLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		newConfigItemLabel.setText("New ConfigItem");

		newCIText_ConfigurationEdit = new Text(configurationEditComp, SWT.BORDER);
		newCIText_ConfigurationEdit.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Button newCIBTN = new Button(configurationEditComp, SWT.PUSH);
		newCIBTN.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		newCIBTN.setText("New ConfigItem");
		newCIBTN.addSelectionListener(new SelectionAdapter()
		{

			@Override
			public void widgetSelected(SelectionEvent e)
			{
				BTSConfigItem ci = configurationController.createNewConfigItem();
				ci.setValue(newCIText_ConfigurationEdit.getText());
				selectedConfig.getChildren().add(ci);
				treeViewer.refresh();

			}
		});

		configurationEditBindings = initializeConfigurationEditBindings();

		value.setValue(configuration);
		sashForm.setWeights(new int[] { 1, 1 });
		sashForm.layout();
	}

	private DataBindingContext initializeConfigurationEditBindings()
	{
		if (configurationEditBindings != null)
		{
			configurationEditBindings.dispose();
		}
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
		Binding binding = bindingContext.bindValue(
				WidgetProperties.text(SWT.Modify).observeDelayed(DELAY, nameText_ConfigurationEdit), model, us, null);

		IObservableValue model2 = BeanProperties.value("provider").observeDetail(value);
		Binding binding2 = bindingContext.bindValue(
				WidgetProperties.text(SWT.Modify).observeDelayed(DELAY, providerText), model2, us, null);

		bindingContext.addValidationStatusProvider(binding2);

		ControlDecorationSupport.create(binding, SWT.TOP | SWT.LEFT);
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
		okButton = createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);

		createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
	}

	@Override
	protected void okPressed()
	{
		saveInput();
		super.okPressed();
	}

	private void saveInput()
	{
		System.out.println("saveInput");
		for (Object o : input)
		{
			if (o instanceof BTSConfiguration)
			{
				configurationController.save((BTSConfiguration) o);
			}
		}

	}

	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize()
	{
		return new Point(1100, 650);
	}

	@Inject
	@Optional
	void eventReceivedNew(@EventTopic("model_new/*") BTSObject object)
	{
		if (object instanceof BTSConfiguration)
		{
			addObjectToInput((BTSConfiguration) object);
		}
	}

	private void addObjectToInput(final BTSConfiguration object)
	{
		input.getRealm().asyncExec(new Runnable()
		{
			public void run()
			{
				input.add(object);
			}
		});

	}
}
