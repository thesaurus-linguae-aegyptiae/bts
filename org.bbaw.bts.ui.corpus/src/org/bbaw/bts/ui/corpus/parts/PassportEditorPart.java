package org.bbaw.bts.ui.corpus.parts;

import java.util.EventObject;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;
import javax.inject.Named;

import org.bbaw.bts.btsmodel.BTSConfigItem;
import org.bbaw.bts.btsmodel.BTSCorpusObject;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.BTSPassport;
import org.bbaw.bts.btsmodel.BTSPassportEntry;
import org.bbaw.bts.btsmodel.BTSPassportEntryGroup;
import org.bbaw.bts.btsmodel.BTSRevision;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.btsmodel.BtsmodelPackage;
import org.bbaw.bts.commons.BTSPluginIDs;
import org.bbaw.bts.core.controller.generalController.BTSConfigurationController;
import org.bbaw.bts.core.controller.generalController.BTSUserController;
import org.bbaw.bts.core.controller.generalController.EditingDomainController;
import org.bbaw.bts.core.controller.generalController.PermissionsAndExpressionsEvaluationController;
import org.bbaw.bts.core.corpus.controller.partController.PassportEditorPartController;
import org.bbaw.bts.ui.commons.controldecoration.BackgroundControlDecorationSupport;
import org.bbaw.bts.ui.commons.converter.BTSConfigItemToStringConverter;
import org.bbaw.bts.ui.commons.converter.BTSStringToConfigItemConverter;
import org.bbaw.bts.ui.commons.utils.BTSUIConstants;
import org.bbaw.bts.ui.commons.validator.StringNotEmptyValidator;
import org.bbaw.bts.ui.corpus.parts.passportEditor.PassportEntryEditorComposite;
import org.bbaw.bts.ui.corpus.parts.passportEditor.PassportEntryGroupEditor;
import org.bbaw.bts.ui.resources.BTSResourceProvider;
import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.di.Persist;
import org.eclipse.e4.ui.di.UISynchronize;
import org.eclipse.e4.ui.model.application.ui.MDirtyable;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.databinding.EMFUpdateValueStrategy;
import org.eclipse.emf.databinding.edit.EMFEditProperties;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.databinding.viewers.ViewersObservables;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.ControlAdapter;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.ExpandBar;
import org.eclipse.swt.widgets.ExpandItem;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Text;

public class PassportEditorPart {
	private static final int DELAY = 400;
	@Inject
	private BTSConfigurationController configurationController;
	@Inject
	private PassportEditorPartController passportEditorController;
	@Inject
	private IEclipseContext context;
	@Inject
	private BTSResourceProvider resourceProvider;
	@Inject
	private MDirtyable dirty;
	@Inject
	private EditingDomainController editingDomainController;
	@Inject
	private EPartService partService;

	@Inject
	private BTSUserController userController;
	// get UISynchronize injected as field
	@Inject
	private UISynchronize sync;

	@Inject
	private PermissionsAndExpressionsEvaluationController evaluationController;
	private Text text;
	private Text txtAuthortextadmin;
	private Text txtDatetextadmin;
	private Text txtIdtextmain;
	private CTabFolder tabFolder;
	private Table historyTable_Admin;
	private Combo typeCMB_Main;
	private Combo subtypeCMB_Main;
	private Combo reviewCMB_Admin;
	private Combo visibilityCMB_Admin;

	private BTSCorpusObject corpusObject;
	private Composite mainComposite;
	private int selectionIndex;
	private boolean loaded;
	private Map<BTSConfigItem, PassportEntryEditorComposite> passportCategoryMap = new HashMap<BTSConfigItem, PassportEntryEditorComposite>();
	private EditingDomain editingDomain;
	private Set<Command> localCommandCacheSet = new HashSet<Command>();
	private int genericTabsReloadRequiredCounter;
	protected int paint;
	private CommandStackListener commandStackListener;
	private Spinner sortKey_Spin;
	private ComboViewer typeCMB_Main_viewer;
	private ComboViewer subtypeCMB_Main_viewer;
	private ComboViewer visibility_viewer;
	private ComboViewer reviewState_viewer;
	protected boolean loading;

	@Inject
	public PassportEditorPart() {
		// TODO Your code here
	}

	@PostConstruct
	public void postConstruct(Composite parent) {
		GridLayout gl_parent = new GridLayout(1, false);
		gl_parent.horizontalSpacing = 1;
		parent.setLayout(gl_parent);

		mainComposite = new Composite(parent, SWT.NONE);
		mainComposite.setLayout(new FillLayout(SWT.HORIZONTAL));
		GridData gd_composite = new GridData(SWT.FILL, SWT.FILL, true, true, 1,
				1);
		gd_composite.widthHint = 436;
		mainComposite.setLayoutData(gd_composite);

		tabFolder = new CTabFolder(mainComposite, SWT.BORDER);
		tabFolder.setSelectionBackground(Display.getCurrent().getSystemColor(
				SWT.COLOR_TITLE_INACTIVE_BACKGROUND_GRADIENT));
		tabFolder.setSimple(false);
		createMainTabItem(tabFolder);
		// createAdminTabItem(tabFolder);

		// createGenericTabItems(tabFolder);

		loaded = true;
		if (corpusObject != null) {
			loadInput(corpusObject);
		}
		partService.bringToTop(partService
				.findPart(BTSUIConstants.PART_ID_PASSPORT_EDITOR_PART));

	}

	private void createGenericTabItems(CTabFolder folder) {
		List<BTSConfigItem> configItems = configurationController
				.getPassportCategories(corpusObject);
		for (BTSConfigItem category : configItems) {
			BTSPassportEntry entryGroup = findMatchingEntryGroup(
					corpusObject.getPassport(), category);
			createTabItem(folder, category, corpusObject.getPassport(),
					entryGroup, null);
		}

	}

	private BTSPassportEntry findMatchingEntryGroup(BTSPassport passport,
			BTSConfigItem category) {
		Assert.isNotNull(passport);
		Assert.isNotNull(category);

		for (BTSPassportEntry group : passport.getChildren()) {
			if (!category.isIgnore() && group.getType() != null
					&& group.getType().equals(category.getValue())) {
				return group;
			}
		}
		BTSPassportEntryGroup defaultInput = BtsmodelFactory.eINSTANCE
				.createBTSPassportEntryGroup();
		defaultInput.setType(category.getValue());
		passport.getChildren().add(defaultInput);
		return defaultInput;
	}

	private void createTabItem(CTabFolder folder, BTSConfigItem category,
			BTSPassport btsPassport, BTSPassportEntry entryGroup,
			CTabItem tabItem) {

		ScrolledComposite composite;
		if (tabItem == null) {
			tabItem = new CTabItem(folder, SWT.NONE);
			tabItem.setData("cat", category);
			tabItem.setData("pass", btsPassport);
			tabItem.setData("entry", entryGroup);
			tabItem.setText(category.getValue());
			tabItem.setImage(resourceProvider.getImage(Display.getDefault(),
					BTSResourceProvider.IMG_CATEGORY));
			composite = new ScrolledComposite(folder, SWT.V_SCROLL
					| SWT.H_SCROLL | SWT.BORDER);
			FillLayout fillLayout = new FillLayout();
			fillLayout.type = SWT.VERTICAL;
			composite.setLayout(fillLayout);
			tabItem.setControl(composite);
		} else {
			Control c = tabItem.getControl();
			c.dispose();
			tabItem.setControl(null);

			composite = new ScrolledComposite(folder, SWT.V_SCROLL
					| SWT.H_SCROLL | SWT.BORDER);
			FillLayout fillLayout = new FillLayout();
			fillLayout.type = SWT.VERTICAL;
			composite.setLayout(fillLayout);
			tabItem.setControl(composite);
		}
		final ScrolledComposite scrollComposite = (ScrolledComposite) composite;
		final Composite mainComp = new Composite(scrollComposite, SWT.NONE);
		scrollComposite.setContent(mainComp);
		scrollComposite.setExpandVertical(true);
		scrollComposite.setExpandHorizontal(true);
		scrollComposite.addControlListener(new ControlAdapter() {
			@Override
			public void controlResized(ControlEvent e) {
				Rectangle r = scrollComposite.getClientArea();
				scrollComposite.setMinSize(mainComp.computeSize(r.width,
						SWT.DEFAULT));
			}
		});
		mainComp.setLayout(new GridLayout(
				BTSUIConstants.PASSPORT_COLUMN_NUMBER, true));
		((GridLayout) mainComp.getLayout()).marginWidth = 0;
		((GridLayout) mainComp.getLayout()).marginHeight = 0;
	}

	private void loadTabItem(CTabFolder folder, final BTSConfigItem category,
			BTSPassport btsPassport, BTSPassportEntry entryGroup,
			CTabItem tabItem) {
		ScrolledComposite composite;
		if (tabItem == null) {
			tabItem = new CTabItem(folder, SWT.NONE);
			tabItem.setData("cat", category);
			tabItem.setData("pass", btsPassport);
			tabItem.setData("entry", entryGroup);
			tabItem.setText(category.getValue());
			tabItem.setImage(resourceProvider.getImage(Display.getDefault(),
					BTSResourceProvider.IMG_CATEGORY));
			composite = new ScrolledComposite(folder, SWT.V_SCROLL
					| SWT.H_SCROLL | SWT.BORDER);
			FillLayout fillLayout = new FillLayout();
			fillLayout.type = SWT.VERTICAL;
			composite.setLayout(fillLayout);
			tabItem.setControl(composite);
		} else {
			Control c = tabItem.getControl();
			c.dispose();
			tabItem.setControl(null);

			composite = new ScrolledComposite(folder, SWT.V_SCROLL
					| SWT.H_SCROLL | SWT.BORDER);
			FillLayout fillLayout = new FillLayout();
			fillLayout.type = SWT.VERTICAL;
			composite.setLayout(fillLayout);
			tabItem.setControl(composite);
		}
		final ScrolledComposite scrollComposite = (ScrolledComposite) composite;
		final Composite mainComp = new Composite(scrollComposite, SWT.NONE);
		scrollComposite.setContent(mainComp);
		scrollComposite.setExpandVertical(true);
		scrollComposite.setExpandHorizontal(true);
		scrollComposite.addControlListener(new ControlAdapter() {
			@Override
			public void controlResized(ControlEvent e) {
				Rectangle r = scrollComposite.getClientArea();
				scrollComposite.setMinSize(mainComp.computeSize(r.width,
						SWT.DEFAULT));
			}
		});

		scrollComposite.addPaintListener(new PaintListener() {

			@Override
			public void paintControl(PaintEvent e) {
				System.out.println("paint event sc " + category.getValue()
						+ " counter " + paint++);

			}
		});
		mainComp.setLayout(new GridLayout(
				BTSUIConstants.PASSPORT_COLUMN_NUMBER, true));
		((GridLayout) mainComp.getLayout()).marginWidth = 0;
		((GridLayout) mainComp.getLayout()).marginHeight = 0;
		IEclipseContext child = context.createChild("category:"
				+ category.getValue());
		child.set(Composite.class, mainComp);
		child.set(BTSConfigItem.class, category);
		child.set(BTSPassport.class, btsPassport);
		child.set(EditingDomain.class, editingDomain);
		List<BTSPassportEntry> childEntryGroups = new Vector<BTSPassportEntry>(
				1);
		childEntryGroups.add(entryGroup);
		child.set(BTSUIConstants.PASSPORT_ENTRIES, childEntryGroups);
		child.set(BTSUIConstants.PASSPORT_TABITEM_MAIN_COMPOSITE,
				scrollComposite);
		child.set(BTSUIConstants.PASSPORT_ENTRY_PATH,
				new Vector<BTSPassportEntry>());
		child.set(BTSCorpusObject.class, corpusObject);
		child.set(BTSResourceProvider.class, resourceProvider);

		// scrollComposite.layout();

		PassportEntryGroupEditor categoryComposite = ContextInjectionFactory
				.make(PassportEntryGroupEditor.class, child);
		passportCategoryMap.put(category, categoryComposite);
	}

	private void createMainTabItem(CTabFolder folder) {
		CTabItem tbtmMain = new CTabItem(folder, SWT.NONE);
		tbtmMain.setText("Main");

		final ScrolledComposite scrollComposite = new ScrolledComposite(folder,
				SWT.V_SCROLL | SWT.H_SCROLL | SWT.BORDER);
		final Composite compTBTM_Main = new Composite(scrollComposite, SWT.NONE);
		tbtmMain.setControl(scrollComposite);
		scrollComposite.setContent(compTBTM_Main);
		scrollComposite.setExpandVertical(true);
		scrollComposite.setExpandHorizontal(true);
		scrollComposite.addControlListener(new ControlAdapter() {
			@Override
			public void controlResized(ControlEvent e) {
				Rectangle r = scrollComposite.getClientArea();
				scrollComposite.setMinSize(compTBTM_Main.computeSize(r.width,
						SWT.DEFAULT));
			}
		});

		compTBTM_Main.setLayout(new GridLayout(8, false));
		((GridLayout) compTBTM_Main.getLayout()).marginWidth = 0;
		((GridLayout) compTBTM_Main.getLayout()).marginHeight = 0;

		Label lblName = new Label(compTBTM_Main, SWT.NONE);
		lblName.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false,
				1, 1));
		lblName.setText("Name");

		text = new Text(compTBTM_Main, SWT.BORDER);
		text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 7, 1));

		Label lblType = new Label(compTBTM_Main, SWT.NONE);
		lblType.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false,
				1, 1));
		lblType.setText("Type");

		typeCMB_Main = new Combo(compTBTM_Main, SWT.READ_ONLY);
		typeCMB_Main.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 3, 1));
		typeCMB_Main_viewer = new ComboViewer(typeCMB_Main);
		ComposedAdapterFactory factory = new ComposedAdapterFactory(
				ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		AdapterFactoryLabelProvider labelProvider = new AdapterFactoryLabelProvider(
				factory);
		AdapterFactoryContentProvider contentProvider = new AdapterFactoryContentProvider(
				factory);

		typeCMB_Main_viewer.setContentProvider(contentProvider);
		typeCMB_Main_viewer.setLabelProvider(labelProvider);
		typeCMB_Main_viewer.setInput(configurationController
				.getObjectTypeConfigItemProcessedClones(corpusObject));
		typeCMB_Main_viewer
				.addSelectionChangedListener(new ISelectionChangedListener() {

					@Override
					public void selectionChanged(SelectionChangedEvent event) {
						if (!loading) {
						Job job = new Job("My Job") {
							@Override
							protected IStatus run(IProgressMonitor monitor) {
								// do something long running
								// ...

								// If you want to update the UI
								sync.asyncExec(new Runnable() {
									@Override
									public void run() {
										subtypeCMB_Main_viewer
												.setInput(configurationController
														.getObjectSubtypeConfigItemProcessedClones(corpusObject));
										subtypeCMB_Main_viewer.refresh();
									}
								});
								return Status.OK_STATUS;
							}
						};

						// Start the Job
						job.schedule(450);
						}
						// problem is: emf sets selection of viewer in secondary
						// thread
						// this causes listener to notice selection
						// and start unwanted reload on subtype viewer
						// therefore first selection is suppressed as loading
						loading = false;

					}
				});

		Label lblSubtype = new Label(compTBTM_Main, SWT.NONE);
		lblSubtype.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
				false, 1, 1));
		lblSubtype.setText("Subtype");

		subtypeCMB_Main = new Combo(compTBTM_Main, SWT.NONE | SWT.READ_ONLY);
		subtypeCMB_Main.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 3, 1));
		subtypeCMB_Main_viewer = new ComboViewer(subtypeCMB_Main);

		AdapterFactoryLabelProvider labelProvider2 = new AdapterFactoryLabelProvider(
				factory);
		AdapterFactoryContentProvider contentProvider2 = new AdapterFactoryContentProvider(
				factory);

		subtypeCMB_Main_viewer.setContentProvider(contentProvider2);
		subtypeCMB_Main_viewer.setLabelProvider(labelProvider2);
		subtypeCMB_Main_viewer.setInput(configurationController
				.getObjectSubtypeConfigItemProcessedClones(corpusObject));

		Label lblSortkey = new Label(compTBTM_Main, SWT.NONE);
		lblSortkey.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
				false, 1, 1));
		lblSortkey.setText("SortKey");

		sortKey_Spin = new Spinner(compTBTM_Main, SWT.BORDER);
		sortKey_Spin.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
				false, 1, 1));
		sortKey_Spin.setMinimum(0);

		// Label lblCode = new Label(compTBTM_Main, SWT.NONE);
		// lblCode.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
		// false,
		// 1, 1));
		// lblCode.setText("Code");
		//
		// txtCodetextmain = new Text(compTBTM_Main, SWT.BORDER);
		// txtCodetextmain.setLayoutData(new GridData(SWT.FILL, SWT.CENTER,
		// true,
		// false, 1, 1));

		Label lblId = new Label(compTBTM_Main, SWT.NONE);
		lblId.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false,
				1, 1));
		lblId.setText("ID");

		txtIdtextmain = new Text(compTBTM_Main, SWT.BORDER | SWT.READ_ONLY);
		txtIdtextmain.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 5, 1));

		Label lblAuthor = new Label(compTBTM_Main, SWT.NONE);
		lblAuthor.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
				false, 1, 1));
		lblAuthor.setText("Author");

		txtAuthortextadmin = new Text(compTBTM_Main, SWT.BORDER | SWT.READ_ONLY);
		txtAuthortextadmin.setText("authorText_Admin");
		txtAuthortextadmin.setLayoutData(new GridData(SWT.FILL, SWT.CENTER,
				true, false, 3, 1));

		Label lblDate = new Label(compTBTM_Main, SWT.NONE);
		lblDate.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false,
				1, 1));
		lblDate.setText("Date");

		txtDatetextadmin = new Text(compTBTM_Main, SWT.BORDER | SWT.READ_ONLY);
		txtDatetextadmin.setText("2014-01-22");
		txtDatetextadmin.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 3, 1));

		Label lblVisibility = new Label(compTBTM_Main, SWT.NONE);
		lblVisibility.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
				false, 1, 1));
		lblVisibility.setText("Visibility");

		visibilityCMB_Admin = new Combo(compTBTM_Main, SWT.READ_ONLY);
		visibilityCMB_Admin.setLayoutData(new GridData(SWT.FILL, SWT.CENTER,
				true, false, 3, 1));
		visibility_viewer = new ComboViewer(visibilityCMB_Admin);
		AdapterFactoryLabelProvider labelProvider_vis = new AdapterFactoryLabelProvider(
				factory);
		AdapterFactoryContentProvider contentProvider_vis = new AdapterFactoryContentProvider(
				factory);

		visibility_viewer.setContentProvider(contentProvider_vis);
		visibility_viewer.setLabelProvider(labelProvider_vis);
		visibility_viewer.setInput(configurationController
				.getVisibilityConfigItemProcessedClones(corpusObject));

		Label lblRevisionState = new Label(compTBTM_Main, SWT.NONE);
		lblRevisionState.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER,
				false, false, 1, 1));
		lblRevisionState.setText("Review State");

		reviewCMB_Admin = new Combo(compTBTM_Main, SWT.READ_ONLY);
		reviewCMB_Admin.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 3, 1));
		reviewState_viewer = new ComboViewer(reviewCMB_Admin);

		AdapterFactoryLabelProvider labelProvider_rev = new AdapterFactoryLabelProvider(
				factory);
		AdapterFactoryContentProvider contentProvider_rev = new AdapterFactoryContentProvider(
				factory);

		reviewState_viewer.setContentProvider(contentProvider_rev);
		reviewState_viewer.setLabelProvider(labelProvider_rev);
		reviewState_viewer.setInput(configurationController
				.getReviewStateConfigItemProcessedClones(corpusObject));

		ExpandBar expandBar = new ExpandBar(compTBTM_Main, SWT.NONE);
		expandBar.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 8,
				1));
		expandBar.setLayout(new GridLayout(1, false));

		ExpandItem xpndtmHistory = new ExpandItem(expandBar, SWT.NONE);
		xpndtmHistory.setExpanded(false);
		xpndtmHistory.setText("History");

		Composite historyComp_Admin = new Composite(expandBar, SWT.NONE);
		historyComp_Admin.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				true, 1, 1));
		historyComp_Admin.setLayout(new GridLayout(1, false));
		xpndtmHistory.setControl(historyComp_Admin);


		historyTable_Admin = new Table(historyComp_Admin, SWT.BORDER
				| SWT.FULL_SELECTION);
		historyTable_Admin.setLayoutData(new GridData(SWT.FILL, SWT.FILL,
 true,
				true, 1, 1));
		historyTable_Admin.setHeaderVisible(true);
		historyTable_Admin.setLinesVisible(true);
		xpndtmHistory.setHeight(xpndtmHistory.getControl().computeSize(
				SWT.DEFAULT, SWT.DEFAULT).y);

	}

	@Inject
	void setSelection(
			@Optional @Named(IServiceConstants.ACTIVE_SELECTION) BTSObject selection) {
		if (selection == null) {
			/* implementation not shown */
		} else {
			if (selection instanceof BTSCorpusObject) {
				if (selection != null && !selection.equals(corpusObject)) {
					System.out.println("old selection " + corpusObject);
					// TODO make save configurable this is autosave!!!
					save();
					corpusObject = (BTSCorpusObject) selection;
					if (loaded) {
						loadInput(corpusObject);
					}
				}
			}
			System.out.println("Passport selection received");
		}
	}

	private void loadInput(BTSCorpusObject object) {

		purgeAll();
		if (object.getPassport() == null) {
			object.setPassport(BtsmodelFactory.eINSTANCE.createBTSPassport());
			setDirty(true);
		}

		// FIXME get global editing domain!!!!!!!!!
		editingDomain = editingDomainController.getEditingDomain(object);
		// stacklistener should be removed when deselection object, just double
		// check to ensure commandstack is not added twice
		editingDomain.getCommandStack().removeCommandStackListener(
				commandStackListener);
		editingDomain.getCommandStack().addCommandStackListener(
				getCommandStackListener());

		tabFolder = new CTabFolder(mainComposite, SWT.BORDER);
		tabFolder.setSelectionBackground(Display.getCurrent().getSystemColor(
				SWT.COLOR_TITLE_INACTIVE_BACKGROUND_GRADIENT));
		tabFolder.setSimple(false);
		createMainTabItem(tabFolder);

		initializeDatabindingMain(object);
		// createAdminTabItem(tabFolder);
		// initializeDatabindingAdmin(object);
		createGenericTabItems(tabFolder);
		mainComposite.layout();

		tabFolder.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				CTabItem ti = tabFolder.getSelection();
				if (ti.getData("entry") != null) {
					Integer counter = (Integer) ti.getData("reloaded");
					if (counter == null
							|| counter < genericTabsReloadRequiredCounter) {
						reloadGenericTabItem(ti);
						ti.setData("reloaded", genericTabsReloadRequiredCounter);
					}
				}

			}

		});
		if (tabFolder.getItemCount() > selectionIndex) {
			tabFolder.setSelection(selectionIndex);
			CTabItem ti = tabFolder.getItem(selectionIndex);
			reloadGenericTabItem(ti);
		} else {
			tabFolder.setSelection(0);
			CTabItem ti = tabFolder.getItem(0);
			reloadGenericTabItem(ti);
		}

	}

	private CommandStackListener getCommandStackListener() {
		if (commandStackListener == null) {
			commandStackListener = new CommandStackListener() {

				@Override
				public void commandStackChanged(EventObject event) {
					Command mostRecentCommand = editingDomain.getCommandStack()
							.getMostRecentCommand();
					if (mostRecentCommand != null) {
						if (mostRecentCommand.equals(editingDomain
								.getCommandStack().getUndoCommand())) {
							// normal command or redo executed
							localCommandCacheSet.add(mostRecentCommand);
							if (localCommandCacheSet.isEmpty()) {
								dirty.setDirty(false);
							} else if (!dirty.isDirty()) {
								dirty.setDirty(true);
							}
							// if redo, check if reload required
							checkAndReload(mostRecentCommand);
						} else {
							// undo executed
							if (localCommandCacheSet.remove(mostRecentCommand)
									&& localCommandCacheSet.isEmpty()) {
								dirty.setDirty(false);
							} else if (!dirty.isDirty()) {
								dirty.setDirty(true);
							}
							checkAndReload(mostRecentCommand);
						}
					}

				}
			};
		}
		return commandStackListener;
	}

	private void checkAndReload(Command command) {
		if (command instanceof DeleteCommand
				|| command instanceof CompoundCommand
				|| command instanceof AddCommand
				|| command instanceof RemoveCommand) {
			CTabItem tabItem = tabFolder.getSelection();
			reloadGenericTabItem(tabItem);
			genericTabsReloadRequiredCounter++;
			tabItem.setData("reloaded", genericTabsReloadRequiredCounter);

		}

	}

	private void reloadGenericTabItem(CTabItem tabItem) {
		BTSConfigItem category = (BTSConfigItem) tabItem.getData("cat");
		BTSPassport btsPassport = (BTSPassport) tabItem.getData("pass");
		BTSPassportEntryGroup entryGroup = (BTSPassportEntryGroup) tabItem
				.getData("entry");
		if (category == null || btsPassport == null || entryGroup == null) {
			return;
		}
		loadTabItem(tabFolder, category, btsPassport, entryGroup, tabItem);
		ScrolledComposite sc = (ScrolledComposite) tabItem.getControl();
		Point p = sc.getSize();
		sc.setSize(p.x, p.y + 1);

	}

	private void setDirty(boolean dirty) {
		this.dirty.setDirty(dirty);

	}

	private void purgeAll() {
		if (tabFolder != null) {
			selectionIndex = tabFolder.getSelectionIndex() > 0 ? tabFolder
					.getSelectionIndex() : 0;
			tabFolder.dispose();
			tabFolder = null;

		}
		passportCategoryMap.clear();
		localCommandCacheSet.clear();
		if (editingDomain != null) {
			// remove commandstacklistener from old selection
			editingDomain.getCommandStack().removeCommandStackListener(
					commandStackListener);
		}
		editingDomain = null;
	}

	private DataBindingContext initializeDatabindingMain(BTSCorpusObject object) {

		loading = true;
		EMFUpdateValueStrategy us = new EMFUpdateValueStrategy();
		us.setBeforeSetValidator(new StringNotEmptyValidator());

		DataBindingContext bindingContext = new DataBindingContext();

		// name
		Binding binding = bindingContext.bindValue(
				WidgetProperties.text(SWT.Modify).observeDelayed(DELAY, text),
				EMFEditProperties.value(editingDomain,
						BtsmodelPackage.Literals.BTS_OBJECT__NAME).observe(
						object), us, null);

		bindingContext.addValidationStatusProvider(binding);

		BackgroundControlDecorationSupport.create(binding, SWT.TOP | SWT.LEFT);

		// type
		EMFUpdateValueStrategy targetToModel = new EMFUpdateValueStrategy();
		targetToModel.setConverter(new BTSConfigItemToStringConverter());
		EMFUpdateValueStrategy modelToTarget = new EMFUpdateValueStrategy();
		modelToTarget.setConverter(new BTSStringToConfigItemConverter(
				typeCMB_Main_viewer));
		IObservableValue target_type_viewer = ViewersObservables
				.observeSingleSelection(typeCMB_Main_viewer);
		Binding binding2 = bindingContext.bindValue(
				target_type_viewer,
				EMFEditProperties.value(editingDomain,
						BtsmodelPackage.Literals.BTS_OBJECT__TYPE).observe(
						object), targetToModel, modelToTarget);

		// // subtype
		EMFUpdateValueStrategy targetToModel2 = new EMFUpdateValueStrategy();
		targetToModel2.setConverter(new BTSConfigItemToStringConverter());
		EMFUpdateValueStrategy modelToTarget2 = new EMFUpdateValueStrategy();
		modelToTarget2.setConverter(new BTSStringToConfigItemConverter(
				subtypeCMB_Main_viewer));
		IObservableValue target_subtype_viewer = ViewersObservables
				.observeSingleSelection(subtypeCMB_Main_viewer);
		Binding binding_subtype = bindingContext.bindValue(
				target_subtype_viewer,
				EMFEditProperties.value(editingDomain,
						BtsmodelPackage.Literals.BTS_OBJECT__SUBTYPE).observe(
						object), targetToModel2, modelToTarget2);

		// id
		Binding binding3 = bindingContext.bindValue(
				WidgetProperties.text(SWT.Modify).observeDelayed(0,
						txtIdtextmain),
				EMFEditProperties.value(editingDomain,
						BtsmodelPackage.Literals.BTS_IDENTIFIABLE_ITEM__ID)
						.observe(object), null, null);

		// sortkey
		Binding binding4 = bindingContext.bindValue(
				WidgetProperties.selection().observeDelayed(0, sortKey_Spin),
				EMFEditProperties.value(editingDomain,
						BtsmodelPackage.Literals.BTS_OBJECT__SORT_KEY).observe(
						object), null, null);

		// visibility
		EMFUpdateValueStrategy targetToModel_vis = new EMFUpdateValueStrategy();
		targetToModel_vis.setConverter(new BTSConfigItemToStringConverter());
		EMFUpdateValueStrategy modelToTarget_vis = new EMFUpdateValueStrategy();
		modelToTarget_vis.setConverter(new BTSStringToConfigItemConverter(
				visibility_viewer));
		IObservableValue target_vis_viewer = ViewersObservables
				.observeSingleSelection(visibility_viewer);
		Binding binding_vis = bindingContext
				.bindValue(
						target_vis_viewer,
						EMFEditProperties
								.value(editingDomain,
										BtsmodelPackage.Literals.ADMINISTRATIV_DATA_OBJECT__VISIBILITY)
								.observe(object), targetToModel_vis,
						modelToTarget_vis);



		// review status
		EMFUpdateValueStrategy targetToModel_rev = new EMFUpdateValueStrategy();
		targetToModel_rev.setConverter(new BTSConfigItemToStringConverter());
		EMFUpdateValueStrategy modelToTarget_rev = new EMFUpdateValueStrategy();
		modelToTarget_rev.setConverter(new BTSStringToConfigItemConverter(
				reviewState_viewer));
		IObservableValue target_rev_viewer = ViewersObservables
				.observeSingleSelection(reviewState_viewer);
		Binding binding_rev = bindingContext
				.bindValue(
						target_rev_viewer,
						EMFEditProperties
								.value(editingDomain,
										BtsmodelPackage.Literals.ADMINISTRATIV_DATA_OBJECT__REVISION_STATE)
								.observe(object), targetToModel_rev,
						modelToTarget_rev);

		// review and creator
		if (!object.getRevisions().isEmpty()) {
		BTSRevision first_revision = object.getRevisions().get(0);
		if (first_revision != null) {
				txtAuthortextadmin.setText(userController
						.getUserDisplayName(first_revision.getUserId()));
			txtDatetextadmin
					.setText(configurationController
							.getDisplayPresentationOfDate(first_revision
									.getTimeStamp()));
		}
		}
		return null;
	}

	@PreDestroy
	public void preDestroy() {
		// TODO Your code here
	}

	@Focus
	public void onFocus() {
		tabFolder.setFocus();

		if (tabFolder.getItemCount() >= selectionIndex) {
			tabFolder.setSelection(selectionIndex);
		} else {
			tabFolder.setSelection(0);
		}
		evaluationController
				.activateDBCollectionContext(BTSPluginIDs.PREF_MAIN_CORPUS);
	}

	@Persist
	public boolean save() {
		if (dirty.isDirty()) {

			boolean success = passportEditorController.save(corpusObject);
			dirty.setDirty(!success);
			if (success) {
				localCommandCacheSet.clear();
			}
			return success;
		}
		return true;
	}
}