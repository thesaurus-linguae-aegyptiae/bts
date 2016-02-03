package org.bbaw.bts.ui.egy.parts;

import java.util.Collection;
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

import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.BTSTranslation;
import org.bbaw.bts.btsmodel.BTSTranslations;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.btsmodel.BtsmodelPackage;
import org.bbaw.bts.btsviewmodel.BtsviewmodelFactory;
import org.bbaw.bts.btsviewmodel.BtsviewmodelPackage;
import org.bbaw.bts.btsviewmodel.DBCollectionStatusInformation;
import org.bbaw.bts.btsviewmodel.TreeNodeWrapper;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.commons.BTSPluginIDs;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.controller.generalController.EditingDomainController;
import org.bbaw.bts.core.controller.generalController.PermissionsAndExpressionsEvaluationController;
import org.bbaw.bts.core.corpus.controller.partController.BTSTextEditorController;
import org.bbaw.bts.core.corpus.controller.partController.LemmaNavigatorController;
import org.bbaw.bts.core.corpus.controller.partController.LemmatizerPartController;
import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject;
import org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaEntry;
import org.bbaw.bts.corpus.btsCorpusModel.BTSText;
import org.bbaw.bts.corpus.btsCorpusModel.BTSWord;
import org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelPackage;
import org.bbaw.bts.searchModel.BTSQueryRequest;
import org.bbaw.bts.ui.commons.controldecoration.BackgroundControlDecorationSupport;
import org.bbaw.bts.ui.commons.corpus.events.BTSTextSelectionEvent;
import org.bbaw.bts.ui.commons.corpus.util.BTSEGYUIConstants;
import org.bbaw.bts.ui.commons.filter.BTSObjectNameViewerFilter;
import org.bbaw.bts.ui.commons.search.SearchViewer;
import org.bbaw.bts.ui.commons.utils.BTSUIConstants;
import org.bbaw.bts.ui.commons.validator.StringNotEmptyValidator;
import org.bbaw.bts.ui.commons.widgets.TranslationEditorComposite;
import org.bbaw.bts.ui.corpus.parts.lemma.BTSLemmaEntryNameTranslationViewerFilter;
import org.bbaw.bts.ui.egy.parts.lemmatizer.BTSEgyObjectByNameViewerSorter;
import org.bbaw.bts.ui.egy.parts.lemmatizer.BTSLemmatizerEgyObjectByNameViewerSorter;
import org.bbaw.bts.ui.main.dialogs.SearchSelectObjectDialog;
import org.bbaw.bts.ui.resources.BTSResourceProvider;
import org.eclipse.core.commands.ParameterizedCommand;
import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.e4.core.commands.ECommandService;
import org.eclipse.e4.core.commands.EHandlerService;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.EventTopic;
import org.eclipse.e4.core.di.extensions.Preference;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.di.Persist;
import org.eclipse.e4.ui.di.UISynchronize;
import org.eclipse.e4.ui.model.application.ui.MDirtyable;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.services.EMenuService;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.services.internal.events.EventBroker;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.EMFUpdateValueStrategy;
import org.eclipse.emf.databinding.edit.EMFEditProperties;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.DelegatingStyledCellLabelProvider;
import org.eclipse.jface.viewers.IBaseLabelProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.swt.custom.SashForm;
import org.mihalis.opal.promptSupport.PromptSupport;

public class EgyLemmatizerPart implements SearchViewer {
	@Inject
	private UISynchronize sync;
	@Inject
	private BTSTextEditorController textEditorController;
	@Inject
	private EPartService partService;
	@Inject
	private EventBroker eventBroker;
	@Inject
	private EditingDomainController editingDomainController;
	protected EditingDomain editingDomain;
	@Inject
	private PermissionsAndExpressionsEvaluationController evaluationController;

	@Inject
	private LemmatizerPartController lemmatizerController;

	@Inject
	private LemmaNavigatorController lemmaNavigatorController;

	@Inject
	private BTSResourceProvider resourceProvider;

	@Inject
	private MDirtyable dirty;

	@Inject
	private IEclipseContext context;

	@Inject
	private ECommandService commandService;

	@Inject
	private EHandlerService handlerService;

	@Inject
	@Preference(value = BTSEGYUIConstants.PREF_LEMMATIZER_FELXION_DEFAULT, nodePath = "org.bbaw.bts.ui.corpus.egy")
	private Integer defaultFlexion;

	@Inject
	@Preference(value = BTSEGYUIConstants.PREF_LEMMATIZER_AUTO_LEMMA_PROPOSAL_SELECTION, nodePath = "org.bbaw.bts.ui.corpus.egy")
	private Boolean autoLemmaProposalSelection;

	@Inject
	private EMenuService menuService;

	private BTSWord currentWord;
	private Text lemmaID_text;
	private Text flex_text;
	private boolean selfSelecting;
	private BTSLemmaEntry seletectedEntry;

	private MPart part;
	private TranslationEditorComposite wordTranslate_Editor;

	private Text textSelectedWord;
	private TreeViewer lemmaViewer;
	private ListViewer flexionViewer;
	private ListViewer translationViewer;

	private ComposedAdapterFactory factory = new ComposedAdapterFactory(
			ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
	private ISelectionChangedListener lemmaSelectionListener;
	private Text lemmaName_text;

	// @Inject
	// @Optional
	// @Named(BTSCoreConstants.CORE_EXPRESSION_MAY_EDIT)
	private boolean userMayEdit;
	private BTSCorpusObject corpusObject;

	// boolean if object is loaded into gui
	private boolean loaded;

	// boolean if gui is constructed
	private boolean constructed;

	// boolean if selection is cached and can be loaded when gui becomes visible
	// or constructed
	private boolean selectionCached;
	private Table table;
	private BTSLemmaEntryNameTranslationViewerFilter lemmaViewerSearchFilter = new BTSLemmaEntryNameTranslationViewerFilter();
	private BTSLemmatizerEgyObjectByNameViewerSorter sorter;
	private DataBindingContext word_bindingContext;
	private BTSTextSelectionEvent lastEvent;
	private ModifyListener textSelectedWordModifyListener;
	private Label lblSearch;
	private Job searchjob;
	private Button activateButton;

	@Inject
	public EgyLemmatizerPart() {
		// TODO Your code here
	}

	@PostConstruct
	public void postConstruct(
			Composite parent,
			@Optional @Named(IServiceConstants.ACTIVE_SELECTION) Object selection) {
		Object o = context.get(BTSCoreConstants.CORE_EXPRESSION_MAY_EDIT);
		if (o instanceof Boolean)
		{
			userMayEdit = (Boolean)o; 
		}
		else
		{
			userMayEdit = false;
		}
		parent.setLayout(new GridLayout(1, false));
		((GridLayout) parent.getLayout()).marginHeight = 0;
		((GridLayout) parent.getLayout()).marginWidth = 0;
		if (partService != null) {
			Collection<MPart> parts = partService.getParts();

		}

		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(new GridLayout(3, false));
		((GridLayout) composite.getLayout()).marginHeight = 0;
		((GridLayout) composite.getLayout()).marginWidth = 0;
		composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1,
				1));
		
		activateButton = new Button(composite, SWT.TOGGLE);
		activateButton.setText("Activate");
		activateButton.setToolTipText("Activate Lemmatizing");

		activateButton.setLayoutData(new GridData(SWT.RIGHT, SWT.FILL, false,
				false, 1, 1));
		activateButton.setSelection(false);
		activateButton.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				setUserMayEditInteral(userMayEdit && activateButton.getSelection());
				System.out.println(activateButton.getSelection());
				
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				
			}
		});
		
		Label lblSelectedWord = new Label(composite, SWT.NONE);
		lblSelectedWord.setText("Selected Word");
		lblSelectedWord.setLayoutData(new GridData(SWT.RIGHT, SWT.FILL, false,
				false, 1, 1));

		textSelectedWord = new Text(composite, SWT.BORDER);
		textSelectedWord.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				false, 1, 1));
		textSelectedWordModifyListener = new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent e) {
				clearProposals();
				loadingLemmaProposals(currentWord);
			}
		};
		textSelectedWord.addModifyListener(textSelectedWordModifyListener);

		Composite composite_1 = new Composite(composite, SWT.NONE);
		composite_1.setLayout(new GridLayout(1, false));
		composite_1.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true,
				3, 1));
		((GridLayout) composite_1.getLayout()).marginHeight = 0;
		((GridLayout) composite_1.getLayout()).marginWidth = 0;

		SashForm lemmaSashForm = new SashForm(composite_1, SWT.NONE);
		lemmaSashForm.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				true, 1, 1));

		Group grpLemma = new Group(lemmaSashForm, SWT.NONE);
		grpLemma.setText("Lemma");
		grpLemma.setLayout(new GridLayout(4, false));
		((GridLayout) grpLemma.getLayout()).marginHeight = 0;
		((GridLayout) grpLemma.getLayout()).marginWidth = 0;

		lemmaID_text = new Text(grpLemma, SWT.BORDER);
		lemmaID_text
				.setToolTipText("WCN or Lemma ID. Enter ID of Lemma if it is not shown.");
		PromptSupport.setPrompt("WCN", lemmaID_text);
		lemmaID_text.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				false, 1, 1));
		lemmaID_text.setSize(122, 19);
		lemmaID_text.addKeyListener(new KeyListener() {

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent e) {
				if (e.keyCode == SWT.CR) {
					shiftCaret(BTSUIConstants.EVENT_TEXT_SELECTION_NEXT);
				}

			}
		});

		lemmaName_text = new Text(grpLemma, SWT.BORDER | SWT.SEARCH);
		lemmaName_text
				.setToolTipText("Lemma. Shows spelling of Lemmata.\nIn order to filter lemma proposals, \nenter search string and press RETURN.");
		PromptSupport.setPrompt("Lemma", lemmaName_text);
		lemmaName_text.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				false, 1, 1));
		lemmaName_text.setSize(122, 19);
		lemmaName_text.addKeyListener(new KeyListener() {

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent e) {
				if (e.keyCode == SWT.CR) {
					if (!lemmaName_text.getText().equals(
							lemmaViewerSearchFilter.getFilterString())) {
						lemmaViewerSearchFilter.setFilterString(lemmaName_text
								.getText().trim());
						lemmaViewer.refresh(false);
					}
				}

			}
		});
		lblSearch = new Label(grpLemma, SWT.NONE);
		lblSearch.setImage(resourceProvider.getImage(Display.getDefault(),
				BTSResourceProvider.IMG_SEARCH));
		lblSearch.setToolTipText("Search Object");
		lblSearch.setLayoutData(new GridData(SWT.RIGHT, SWT.TOP, false, false,
				1, 1));
		((GridData) lblSearch.getLayoutData()).verticalIndent = 3;
		lblSearch.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseDown(MouseEvent e) {
				lblSearch.setBackground(lblSearch.getParent().getBackground());
			}

			@Override
			public void mouseUp(MouseEvent e) {
				if (userMayEdit) {
					lblSearch
							.setBackground(BTSUIConstants.VIEW_BACKGROUND_LABEL_PRESSED);

					// run search command
					Map map = new HashMap(1);
					map.put("org.bbaw.bts.ui.main.commandparameter.viewerFilter",
							"reviewState=new,reviewState=awaiting-review awaiting-update,"
									+ "reviewState=reviewed,"
									+ "reviewState=published,reviewState=published-awaiting-review,"
									+ "reviewState=transformed_awaiting_update");
					
					String chars = lemmatizerController.processWordCharForLemmatizing(textSelectedWord.getText());
					if (chars != null)
					{
						map.put("org.bbaw.bts.ui.main.commandparameter.searchString", chars);
					}
					ParameterizedCommand cmd = commandService.createCommand(
							"org.bbaw.bts.ui.main.command.search", map);

					handlerService.executeHandler(cmd);
				}
			}
		});

		Label lblLemmaNav = new Label(grpLemma, SWT.NONE);
		lblLemmaNav.setImage(resourceProvider.getImage(Display.getDefault(),
				BTSResourceProvider.IMG_LEMMATA));
		lblLemmaNav.setToolTipText("Open Lemma Navigator");
		lblLemmaNav.setLayoutData(new GridData(SWT.RIGHT, SWT.TOP, false,
				false, 1, 1));
		((GridData) lblLemmaNav.getLayoutData()).verticalIndent = 3;
		lblLemmaNav.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseDown(MouseEvent e) {
				if (userMayEdit) {
					Label l = (Label) e.getSource();
					l.setBackground(BTSUIConstants.VIEW_BACKGROUND_LABEL_PRESSED);
				}
			}

			@Override
			public void mouseUp(MouseEvent e) {
				if (userMayEdit) {
					Label l = (Label) e.getSource();
					l.setBackground(l.getParent().getBackground());
					// open search dialog
					IEclipseContext child = context.createChild("searchselect");
					context.set(BTSConstants.OBJECT_TYPES_ARRAY,
							new String[] { BTSConstants.WLIST_ENTRY });

					SearchSelectObjectDialog dialog = ContextInjectionFactory
							.make(SearchSelectObjectDialog.class, child);
					if (dialog.open() == dialog.OK) {
						BTSObject object = dialog.getObject();
						System.out.println(object.get_id());
						// Command command = SetCommand.create(editingDomain,
						// entry,
						// BtsCorpusModelPackage.eINSTANCE.getBTSPassportEntry_Value(),
						// object.get_id());
						// editingDomain.getCommandStack().execute(command);
						if (object instanceof BTSLemmaEntry) {
							seletectedEntry = (BTSLemmaEntry) object;
							lemmaNavigatorController.checkAndFullyLoad(
									seletectedEntry, true);
							lemmaID_text.setText(seletectedEntry.get_id());
							lemmaName_text.setText(seletectedEntry.getName());
							loadTranslationProposals(seletectedEntry);
						}
					}
				}
			}
		});

		Composite lemma_composite = new Composite(grpLemma, SWT.NONE);
		lemma_composite.setLayout(new FillLayout(SWT.HORIZONTAL));
		lemma_composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				true, 4, 1));
		lemma_composite.setSize(64, 64);
		((FillLayout) lemma_composite.getLayout()).marginHeight = 0;
		((FillLayout) lemma_composite.getLayout()).marginWidth = 0;

		lemmaViewer = new TreeViewer(lemma_composite, SWT.BORDER | SWT.V_SCROLL);

		final AdapterFactoryLabelProvider.StyledLabelProvider labelProvider = new AdapterFactoryLabelProvider.StyledLabelProvider(
				factory, lemmaViewer);
		AdapterFactoryContentProvider contentProvider = new AdapterFactoryContentProvider(
				factory);

		// table = lemmaViewer.getTable();
		// table.setHeaderVisible(false);
		// table.setLinesVisible(false);
		// // table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true,
		// 1, 1));
		//
		// // Define one exmaple column Columns
		// TableViewerColumn viewerColumn;
		// viewerColumn = new TableViewerColumn(lemmaViewer, SWT.NONE);
		// viewerColumn.getColumn().setText("Lemma Proposals");
		// viewerColumn.getColumn().setWidth(800);
		// viewerColumn.getColumn().setMoveable(true);
		// // for simplification I use the standard labelprovider
		// viewerColumn.setLabelProvider(new ColumnLabelProvider() {
		// @Override
		// public String getText(Object element) {
		// return labelProvider.getText(element);
		// }
		//
		// @Override
		// public Color getBackground(Object element) {
		// return super.getBackground(element);
		// }
		//
		// });
		// // alternatively use relative size
		// // last parameter defines if the column is allowed
		// // to be resized
		// TableColumnLayout tableColumnLayout = new TableColumnLayout();
		// tableColumnLayout.setColumnData(viewerColumn.getColumn(),
		// new ColumnWeightData(400, 800, true));
		//

		lemmaViewer.setContentProvider(contentProvider);
		lemmaViewer.setLabelProvider(labelProvider);
		sorter = ContextInjectionFactory.make(
				BTSLemmatizerEgyObjectByNameViewerSorter.class, context);
		lemmaViewer.setSorter(sorter);
		lemmaSelectionListener = new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				StructuredSelection selection = (StructuredSelection) event
						.getSelection();
				// System.out.println(event.getSelection());
				if (selection.getFirstElement() != null
						&& selection.getFirstElement() instanceof TreeNodeWrapper) {
					TreeNodeWrapper tn = (TreeNodeWrapper) selection
							.getFirstElement();
					if (tn.getObject() != null) {
						BTSObject o = (BTSObject) tn.getObject();
						if (o instanceof BTSLemmaEntry) {
							seletectedEntry = (BTSLemmaEntry) o;
							lemmaNavigatorController.checkAndFullyLoad(
									seletectedEntry, false);
							lemmaID_text.setText(seletectedEntry.get_id());
							lemmaName_text.setText(seletectedEntry.getName());
							loadTranslationProposals(seletectedEntry);
						}
					}
					if (!tn.isChildrenLoaded() || tn.getChildren().isEmpty()) {
						tn.setChildrenLoaded(true);
						if (tn.getObject() instanceof BTSLemmaEntry)
							loadChildren(tn, false);
						if (!tn.getChildren().isEmpty()) {
							lemmaViewer.setExpandedState(tn, true);
						}
					}
				}
			}
		};
		lemmaViewer.addSelectionChangedListener(lemmaSelectionListener);
		lemmaViewer.addFilter(lemmaViewerSearchFilter);
		// register context menu on the table
		menuService.registerContextMenu(lemmaViewer.getControl(),
				BTSPluginIDs.POPMENU_LEMMATIZER_LEMMAPROPOSAL_MENU);

		SashForm flexSashForm = new SashForm(lemmaSashForm, SWT.NONE);
		flexSashForm.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 1, 1));

		// flexion
		Group grpFlexion = new Group(flexSashForm, SWT.NONE);
		grpFlexion.setText("Flexion");
		grpFlexion.setLayout(new GridLayout(1, false));
		((GridLayout) grpFlexion.getLayout()).marginHeight = 0;
		((GridLayout) grpFlexion.getLayout()).marginWidth = 0;

		flex_text = new Text(grpFlexion, SWT.BORDER | SWT.SEARCH);
		flex_text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false,
				1, 1));
		flex_text.setSize(166, 19);
		flex_text.addKeyListener(new KeyListener() {

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent e) {
				if (e.keyCode == SWT.CR) {
					shiftCaret(BTSUIConstants.EVENT_TEXT_SELECTION_NEXT);
				}

			}
		});

		flex_text.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void focusGained(FocusEvent e) {
				Job job = new Job("load input") {
					@Override
					protected IStatus run(IProgressMonitor monitor) {
						sync.asyncExec(new Runnable() {
							@Override
							public void run() {
								flex_text.setSelection(0, flex_text.getText()
										.length());
							}
						});
						return Status.OK_STATUS;
					}
				};

				// Start the Job
				job.schedule(50);

			}
		});

		Composite flex_composite = new Composite(grpFlexion, SWT.NONE);
		flex_composite.setLayout(new FillLayout(SWT.HORIZONTAL));
		flex_composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				true, 1, 1));
		flex_composite.setSize(64, 64);
		((FillLayout) flex_composite.getLayout()).marginHeight = 0;
		((FillLayout) flex_composite.getLayout()).marginWidth = 0;

		flexionViewer = new ListViewer(flex_composite, SWT.BORDER
				| SWT.V_SCROLL | SWT.H_SCROLL);
		AdapterFactoryLabelProvider.StyledLabelProvider labelProvider_flex = new AdapterFactoryLabelProvider.StyledLabelProvider(
				factory, flexionViewer);
		AdapterFactoryContentProvider contentProvider_flex = new AdapterFactoryContentProvider(
				factory);
		flexionViewer.setContentProvider(contentProvider_flex);
		flexionViewer.setLabelProvider(labelProvider_flex);

		// translations
		Group grpTranslation = new Group(flexSashForm, SWT.NONE);
		grpTranslation.setText("Translation");
		grpTranslation.setLayout(new GridLayout(1, false));
		((GridLayout) grpTranslation.getLayout()).marginHeight = 0;
		((GridLayout) grpTranslation.getLayout()).marginWidth = 0;
		grpTranslation.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				true, 1, 1));

		SashForm transSashForm = new SashForm(grpTranslation, SWT.VERTICAL);
		transSashForm.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				true, 1, 1));

		wordTranslate_Editor = new TranslationEditorComposite(transSashForm,
				SWT.WRAP | SWT.MULTI | SWT.V_SCROLL | SWT.BORDER, null, null,
				false);
		wordTranslate_Editor.setLayoutData(new GridData(SWT.FILL, SWT.FILL,
				true, true));
		wordTranslate_Editor.layout();
		wordTranslate_Editor
				.addLanguageSelectionListener(new SelectionAdapter() {

					@Override
					public void widgetSelected(SelectionEvent e) {
						// language selection in wordTranslation editor changes.
						// reload translation viewer.
						loadTranslationProposals(seletectedEntry);
					}
				});

		Composite trans_composite = new Composite(transSashForm, SWT.NONE);
		trans_composite.setLayout(new FillLayout(SWT.HORIZONTAL));
		trans_composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				true, 1, 1));
		trans_composite.setSize(64, 64);
		((FillLayout) trans_composite.getLayout()).marginHeight = 0;
		((FillLayout) trans_composite.getLayout()).marginWidth = 0;

		translationViewer = new ListViewer(trans_composite, SWT.BORDER
				| SWT.V_SCROLL | SWT.MULTI);
		translationViewer.setContentProvider(new ArrayContentProvider());
		translationViewer.setLabelProvider(new LabelProvider() {
			public Image getImage(Object element) {
				return null;
			}

			public String getText(Object element) {
				return ((String) element).trim();
			}
		});
		translationViewer
				.addSelectionChangedListener(new ISelectionChangedListener() {

					@Override
					public void selectionChanged(SelectionChangedEvent event) {
						StructuredSelection selection = (StructuredSelection) event
								.getSelection();
						List<String> list = selection.toList();
						String translation = "";
						if (list.size() == 1) {
							translation = (String) selection.getFirstElement();
						} else {
							for (String s : list) {
								translation += s + "; ";
							}
							if (translation.length() > 1) {
								translation = translation.substring(0,
										translation.length() - 2);
							}
						}
						wordTranslate_Editor.setTranslationText(translation
								.trim());
					}
				});
		translationViewer.setSorter(new BTSEgyObjectByNameViewerSorter());
		flexionViewer.setContentProvider(contentProvider_flex);
		flexionViewer.setLabelProvider(labelProvider_flex);
		flexSashForm.setWeights(new int[] { 1, 4 });
		lemmaSashForm.setWeights(new int[] { 1, 1 });
		transSashForm.setWeights(new int[] { 1, 2 });

		constructed = true;
		parent.layout();
		parent.pack();
		part = partService.findPart(BTSPluginIDs.PART_ID_LEMMATIZER);
		setUserMayEditInteral(userMayEdit && currentWord != null && activateButton.getSelection());

		if (selectionCached && selection instanceof BTSText) {
			setSelection((BTSText) selection);
		}
	}

	protected void loadChildren(final TreeNodeWrapper node, boolean b) {
		List<BTSLemmaEntry> children = lemmaNavigatorController
				.findChildrenOnlySubEntries(
						(BTSLemmaEntry) node.getObject(),
						null,
						lemmaViewer,
						node,
						BtsviewmodelPackage.Literals.TREE_NODE_WRAPPER__CHILDREN,
						null);
		final List<BTSLemmaEntry> filtered = filterLemmaProposals(children, null);
		// If you want to update the UI
		sync.asyncExec(new Runnable() {
			@Override
			public void run() {
				System.out.println("add children" + filtered.size());
				for (BTSObject o : filtered) {
					boolean found = false;
					for (TreeNodeWrapper childNode : node.getChildren()) {
						if (childNode.getObject() != null
								&& childNode.getObject().equals(o)) {
							found = true;
							break;
						}
					}
					if (!found) {
						TreeNodeWrapper tn = BtsviewmodelFactory.eINSTANCE
								.createTreeNodeWrapper();
						tn.setObject(o);
						tn.setParent(node);
						// grandChildren.add(tn);
						node.getChildren().add(tn);
					}
				}
				node.setChildrenLoaded(true);
				lemmaViewer.refresh(node);
				lemmaViewer.setExpandedState(node, true);
			}
		});

	}

	private void loadTranslationProposals(BTSLemmaEntry entry) {
		boolean clearingRequired = true;
		if (entry.getTranslations() != null) {
			BTSTranslation trans = entry.getTranslations().getBTSTranslation(
					wordTranslate_Editor.getLanguage());
			if (trans == null) {
				trans = entry.getTranslations().getBTSTranslation("de");
			}
			if (trans == null) {
				trans = entry.getTranslations().getBTSTranslation("en");
			}
			if (trans != null) {
				String[] subtranslations = trans.getValue().split(
						BTSCoreConstants.TRANSLATIONS_SUB_DELIMITER);
				clearingRequired = false;
				translationViewer.setInput(subtranslations);
				wordTranslate_Editor.setTranslationText(trans.getValue());
			}
		}
		if (clearingRequired) {
			// clear translations viewer
		}

	}

	@PreDestroy
	public void preDestroy() {
		// TODO Your code here
	}

	@Focus
	public void onFocus() {
		if (!loaded && selectionCached) // not yet loaded but has cached
										// selection
		{
			setSelectionInteral(currentWord);
		}
		evaluationController
				.activateDBCollectionContext(BTSPluginIDs.PREF_MAIN_CORPUS_KEY);
	}

	private void shiftCaret(String eventTopic) {
		System.out.println(eventTopic);
		saveWordData(currentWord);
		eventBroker.post(eventTopic, eventTopic);

	}

	@Inject
	void setSelection(
			@Optional @Named(IServiceConstants.ACTIVE_SELECTION) BTSCorpusObject selection) {
		if (selection == null)
			return;
		if (part == null) {
			part = partService.findPart(BTSPluginIDs.PART_ID_LEMMATIZER);
		}
		if (constructed) {
			if (!selfSelecting) {
				if (corpusObject == null || !selection.equals(corpusObject)) {
					if (selection instanceof BTSText
							|| selection instanceof BTSLemmaEntry) {
						clearAllInput();
						corpusObject = selection;
						currentWord = null;

						part.setLabel(selection.getName());
						editingDomain = getEditingdomain(selection);
//						setUserMayEdit(userMayEdit);
					} else if (corpusObject != null) {
						corpusObject = null;
						currentWord = null;
						part.setLabel("Lemmatizer");
						clearAllInput();
						loaded = false;
					}
				}
			} else {
				selfSelecting = false;
			}
		} else if (!selection.equals(corpusObject)) {
			if (selection instanceof BTSText
					|| selection instanceof BTSLemmaEntry) {
				corpusObject = selection;
				currentWord = null;
				part.setLabel(selection.getName());
				editingDomain = getEditingdomain(selection);
			} else if (corpusObject != null) {
				corpusObject = null;
				currentWord = null;
				part.setLabel("Lemmatizer");
				clearAllInput();
				loaded = false;
			}
		}
	}

	@Inject
	void setSelection(
			@Optional @Named(IServiceConstants.ACTIVE_SELECTION) BTSTextSelectionEvent selection) {
		if (selection == null)
			return;
		if (selection.equals(lastEvent))
			return;
		lastEvent = selection;
		if (constructed) {
			if (!selfSelecting) {
				if (selection == null) {
					/* implementation not shown */
				} else if (!selection.getSelectedItems().isEmpty()) {
					if (selection.getSelectedItems().get(0) instanceof BTSWord) {

						// make sure the right corpusObject is set
						if (selection.getParentObject() != null
								&& !selection.getParentObject().equals(
										corpusObject)) {
							setSelection((BTSCorpusObject) selection
									.getParentObject());
						}
						setSelectionInteral((BTSWord) selection
								.getSelectedItems().get(0));
						loaded = true;
					} else if (loaded) {
						saveWordData(currentWord);
						currentWord = null;
						clearAllInput();
						loaded = false;
						selectionCached = false;
					}
				}
			} else {
				selfSelecting = false;
			}
		} else if (selection != null && selection.getSelectedItems() != null
				&& !selection.getSelectedItems().isEmpty()
				&& selection.getSelectedItems().get(0) instanceof BTSWord) {
			if (selection.getParentObject() != null
					&& !selection.getParentObject().equals(corpusObject)) {
				setSelection((BTSCorpusObject) selection.getParentObject());
			}
			currentWord = (BTSWord) selection.getSelectedItems().get(0);
			selectionCached = true;
		}
	}

	@Inject
	@Optional
	void eventReceivedClearLemmatizerDataEvents(
			@EventTopic(BTSEGYUIConstants.EVENT_CLEAR_TOKEN_DATA + "/*") Object event) {
		if (event instanceof String && event != null
				&& ((String) event).endsWith("lemmatizer")) {

			sync.asyncExec(new Runnable() {
				@Override
				public void run() {
					removeLemmatizerData();
				}
			});
		}
	}

	private void removeLemmatizerData() {
		if (userMayEdit && currentWord != null && activateButton.getSelection()) {
			lemmaID_text.setText("");
			flex_text.setText("");
			CompoundCommand compoundCommand = new CompoundCommand();
			org.eclipse.emf.common.command.Command command = SetCommand.create(
					editingDomain, currentWord,
					BtsCorpusModelPackage.Literals.BTS_WORD__LKEY, null);
			compoundCommand.append(command);

			command = SetCommand.create(editingDomain, currentWord,
					BtsCorpusModelPackage.Literals.BTS_WORD__FLEX_CODE, null);
			compoundCommand.append(command);

			// remove all translations
			for (BTSTranslation trans : currentWord.getTranslation()
					.getTranslations()) {
				command = SetCommand.create(editingDomain, trans,
						BtsmodelPackage.Literals.BTS_TRANSLATION__VALUE, "");
				compoundCommand.append(command);
			}

			editingDomain.getCommandStack().execute(compoundCommand);
			wordTranslate_Editor.setTranslationText("");
			wordTranslate_Editor.save();
		}

	}

	private void setSelectionInteral(BTSWord selection) {
		if (selection == null) {
		} else {
			BTSWord oldWord = currentWord;
			if (oldWord != null) {
				saveWordData(oldWord);
			}
			currentWord = (BTSWord) selection;
			if (currentWord != null) {
				if (loadWordData(currentWord)) {
					// nothing
					clearProposals();

				} else if (part.isVisible()) {
					BTSTranslations translations = currentWord.getTranslation();
					if (translations == null) {
						translations = BtsmodelFactory.eINSTANCE
								.createBTSTranslations();
						currentWord.setTranslation(translations);
						setDirty(true);
					}
					wordTranslate_Editor.load(translations, editingDomain,
							false);
					lemmaViewerSearchFilter.setFilterString(null);
					loadingLemmaProposals(currentWord);
				}
//				setUserMayEdit(userMayEdit);

				// FIXME anpassen an LemmaEditor!!!
				// if (corpusObject == null)
				// {
				// corpusObject = (BTSText) findRecursivelyParent(currentWord);
				// }
			}
		}

	}

	private EObject findRecursivelyParent(EObject object) {
		if (object.eContainer() == null) {
			return object;
		} else {
			if (object.eContainer() instanceof BTSText) {
				return (BTSText) object.eContainer();
			} else {
				return findRecursivelyParent(object.eContainer());
			}
		}
	}

	private void clearProposals() {
		final TreeNodeWrapper lemmaRootNode = BtsviewmodelFactory.eINSTANCE
				.createTreeNodeWrapper();
		// If you want to update the UI
		sync.asyncExec(new Runnable() {
			@Override
			public void run() {
				lemmaViewer.setInput(lemmaRootNode);
				translationViewer.setInput(new String[] {});
			}
		});

	}

	private void clearAllInput() {
		final TreeNodeWrapper lemmaRootNode = BtsviewmodelFactory.eINSTANCE
				.createTreeNodeWrapper();
		// If you want to update the UI
		sync.asyncExec(new Runnable() {
			@Override
			public void run() {
				lemmaViewer.setInput(lemmaRootNode);
				translationViewer.setInput(new String[] {});
				lemmaID_text.setText("");
				lemmaName_text.setText("");
				lemmaViewerSearchFilter.setFilterString("");
				flex_text.setText("");
				if (word_bindingContext != null) {
					word_bindingContext.dispose();
				}
				word_bindingContext = new DataBindingContext();
				textSelectedWord
						.removeModifyListener(textSelectedWordModifyListener);
				textSelectedWord.setText("");
				textSelectedWord
						.addModifyListener(textSelectedWordModifyListener);

				loadTranslation(null);
			}
		});

	}

	
	private Runnable lemmaViewerLoadThread(final TreeNodeWrapper root, final String searchStr) {
		return new Runnable() {
			@Override
			public void run() {
				sorter.setLemmatizerWordChar(searchStr);
				lemmaViewer.setInput(root);
				lemmaViewer.refresh();
				lemmaViewer.expandAll();
				if (autoLemmaProposalSelection
						&& lemmaViewer.getTree().getItemCount() > 0) {
					TreeItem first = lemmaViewer.getTree().getItem(0);
					lemmaViewer.setSelection(new StructuredSelection(
							first.getData()));
				}
			}
		};
	}
	
	private void loadingLemmaProposals(final BTSWord word) {

		if (!userMayEdit || word == null || !activateButton.getSelection())
			return;
		// empty lemmaViewer
		final TreeNodeWrapper lemmaRootNode = BtsviewmodelFactory.eINSTANCE
				.createTreeNodeWrapper();
		// If you want to update the UI
		sync.asyncExec(new Runnable() {
			@Override
			public void run() {
				translationViewer.setInput(new String[] {});
				lemmaViewer.setInput(lemmaRootNode);
			}
		});

		if (searchjob != null) {
			searchjob.cancel();
			searchjob = null;
		}
		// fill lemmaViewer
		searchjob = new Job("load input") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				java.util.List<BTSLemmaEntry> entries = lemmatizerController
						.findLemmaProposals(word, monitor);
				if (monitor.isCanceled()) {
					return Status.CANCEL_STATUS;
				}
				final java.util.List<TreeNodeWrapper> nodes = lemmaNavigatorController
						.loadNodesWithChildren(
								entries.subList(0,
										Math.min(entries.size(), 120)),
								monitor, false);


				int counter = 0;
				for (final TreeNodeWrapper child : nodes) {
					child.setChildrenLoaded(true);
					loadChildren(child, false);
					// if (!child.getChildren().isEmpty())
					// {
					// sync.asyncExec(new Runnable() {
					// @Override
					// public void run() {
					// lemmaViewer.setExpandedState(child, true);
					// }
					// });
					// }
				}
				for (BTSLemmaEntry entry : entries) {
					counter++;
					try {
						lemmaNavigatorController
								.checkAndFullyLoad(entry, false);
					} catch (Exception e) {
						e.printStackTrace();
					}
					if (counter > 40 || monitor.isCanceled())
						break;

				}

				lemmaRootNode.getChildren().addAll(nodes);

				String wordChars = lemmatizerController.processWordCharForLemmatizing(word);
				sync.asyncExec(lemmaViewerLoadThread(lemmaRootNode, wordChars));
				
				return Status.OK_STATUS;
			}
		};

		// Start the Job
		searchjob.schedule();

	}

	private boolean loadWordData(BTSWord word) {
		boolean isLemmatized = true;
		if (word != null) {
			if (word_bindingContext != null) {
				word_bindingContext.dispose();
			}
			word_bindingContext = new DataBindingContext();
			if (word.getWChar() != null && !"".equals(word.getWChar())) {
				// textSelectedWord.setText(word.getWChar());

				// forename
				EMFUpdateValueStrategy word_us = new EMFUpdateValueStrategy();
				word_us.setBeforeSetValidator(new StringNotEmptyValidator(
						"WChar may not be emtpy!"));

				IObservableValue model_word = EMFEditProperties.value(
						editingDomain,
						BtsCorpusModelPackage.Literals.BTS_WORD__WCHAR)
						.observe(word);
				Binding binding_word = word_bindingContext.bindValue(
						WidgetProperties.text(SWT.Modify).observeDelayed(
								BTSUIConstants.DELAY, textSelectedWord),
						model_word, word_us, null);
				word_bindingContext.addValidationStatusProvider(binding_word);
				BackgroundControlDecorationSupport.create(binding_word, SWT.TOP
						| SWT.LEFT);

			} else {
				textSelectedWord.setText("");
				isLemmatized = false;
			}
			if (word.getLKey() != null && !"".equals(word.getLKey())) {
				lemmaID_text.setText(word.getLKey());
			} else {
				lemmaID_text.setText("");
				isLemmatized = false;
			}
			lemmaName_text.setText("");
			if (word.getFlexCode() != null && !"".equals(word.getFlexCode())) {
				flex_text.setText(word.getFlexCode());
				flex_text.setSelection(0, flex_text.getText().length());
			} else {
				flex_text.setText(defaultFlexion.toString());
				flex_text.setSelection(0, flex_text.getText().length());

				isLemmatized = false;
			}
			loadTranslation(word);
		}

		return isLemmatized;
	}

	private void loadTranslation(BTSWord word) {
		if (word == null) {
			wordTranslate_Editor.load(null, null, false);
			return;
		}
		BTSTranslations translations = word.getTranslation();
		if (translations == null) {
			translations = BtsmodelFactory.eINSTANCE.createBTSTranslations();
			word.setTranslation(translations);
			setDirty(true);
		}
		wordTranslate_Editor.load(translations, editingDomain, false);

	}

	private EditingDomain getEditingdomain(BTSCorpusObject text) {
		return editingDomainController.getEditingDomain(text);
	}

	private void setDirty(boolean isDirty) {
		if (isDirty)
			dirty.setDirty(isDirty);

	}

	private void saveWordData(BTSWord word) {
		if (userMayEdit && word != null && activateButton.getSelection()) {
			CompoundCommand compoundCommand = new CompoundCommand();
			boolean edited = false;
			if (editingDomain == null) {
				editingDomain = getEditingdomain(corpusObject);
			}
			if (!lemmaID_text.getText().equals(word.getLKey())) {
				if ("WCN".equals(lemmaID_text.getText())) {
					org.eclipse.emf.common.command.Command command = SetCommand
							.create(editingDomain,
									currentWord,
									BtsCorpusModelPackage.Literals.BTS_WORD__LKEY,
									null);
					compoundCommand.append(command);
				} else {
					org.eclipse.emf.common.command.Command command = SetCommand
							.create(editingDomain,
									currentWord,
									BtsCorpusModelPackage.Literals.BTS_WORD__LKEY,
									lemmaID_text.getText());
					compoundCommand.append(command);
				}
				edited = true;
			}
			// if word.lkey is set than flexion may equal default
			// if word.lkey unset, than default should not be written in flexion
			if (((word.getLKey() != null && word.getLKey().length() > 0)
					|| !flex_text.getText().equals(
							new Integer(defaultFlexion).toString()) || edited)
					&& !flex_text.getText().equals(word.getFlexCode())) {
				org.eclipse.emf.common.command.Command command = SetCommand
						.create(editingDomain,
								currentWord,
								BtsCorpusModelPackage.Literals.BTS_WORD__FLEX_CODE,
								flex_text.getText());
				compoundCommand.append(command);
			}
			if (!compoundCommand.getCommandList().isEmpty()) {
				editingDomain.getCommandStack().execute(compoundCommand);
			}
			wordTranslate_Editor.save();
		}

	}

	@Persist
	public boolean save() {
		if (!userMayEdit) return false;
		
		if (dirty.isDirty() && corpusObject instanceof BTSText) {
			if (currentWord != null)
				saveWordData(currentWord);
			textEditorController.save((BTSText) corpusObject);
		}
		dirty.setDirty(false);
		return true;

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public void search(final BTSQueryRequest query, String queryName,
			String viewerFilterString) {
		final TreeNodeWrapper lemmaRootNode = BtsviewmodelFactory.eINSTANCE
				.createTreeNodeWrapper();

		if (searchjob != null) {
			searchjob.cancel();
			searchjob = null;
		}
		// fill lemmaViewer
		searchjob = new Job("load input") {
			// // in new job, search
			@Override
			protected IStatus run(final IProgressMonitor monitor) {

				String tempSearchString = null;
				if (query.getAutocompletePrefix() != null) {
					tempSearchString = lemmatizerController
							.processWordCharForLemmatizing(query
									.getAutocompletePrefix());
				}
				final String searchString = tempSearchString;
				List<BTSLemmaEntry> obs;
				obs = lemmaNavigatorController
						.getSearchEntries(
								query,
								null,
								lemmaViewer,
								lemmaRootNode,
								BtsviewmodelPackage.Literals.TREE_NODE_WRAPPER__CHILDREN,
								monitor);
				List<BTSLemmaEntry> filtered = filterLemmaProposals(obs, searchString);

//				Set<BTSLemmaEntry> filteredSet = new HashSet<BTSLemmaEntry>(filtered.size());
//				filteredSet.addAll(filtered);
				
				if (monitor.isCanceled())
					return Status.CANCEL_STATUS;

				if (filtered != null && filtered.size() > 0) {
					List<TreeNodeWrapper> nodes = lemmaNavigatorController
							.loadNodesWithChildren(filtered, monitor, false);
					lemmaRootNode.getChildren().addAll(nodes);
				} else {
					TreeNodeWrapper emptyNode = BtsviewmodelFactory.eINSTANCE
							.createTreeNodeWrapper();
					emptyNode.setLabel("Nothing found that matches your query");
					lemmaRootNode.getChildren().add(emptyNode);
					//sync.asyncExec(lemmaViewerLoadThread(lemmaRootNode, searchString));
					//return Status.OK_STATUS;
				}
				if (monitor.isCanceled())
					return Status.CANCEL_STATUS;

//				int counter = 0;
//				for (final TreeNodeWrapper child : lemmaRootNode.getChildren()) {
//					if (monitor.isCanceled()) {
//						return Status.CANCEL_STATUS;
//					}
//					if (child.getObject() != null
//							&& child.getObject() instanceof BTSLemmaEntry) {
//						try {
//							lemmaNavigatorController.checkAndFullyLoad(
//									(BTSCorpusObject) child.getObject(), false);
//						} catch (Exception e) {
//							e.printStackTrace();
//						}
//					}
					
					
//					List<BTSLemmaEntry> children = lemmaNavigatorController
//							.findChildrenOnlySubEntries(
//									(BTSLemmaEntry) child.getObject(),
//									null,
//									lemmaViewer,
//									child,
//									BtsviewmodelPackage.Literals.TREE_NODE_WRAPPER__CHILDREN,
//									null);
//					final List<BTSLemmaEntry> filteredChildren = filterLemmaProposals(children);
//
//					counter++;
//					
//					if (counter > 40 || monitor.isCanceled())
//						break;
//
//					for (BTSObject o : filteredChildren) {
//						boolean found = false;
//						// break if o is in filtered
//						if (filteredSet.contains(o)) continue;
//						
//						if (counter > 40 || monitor.isCanceled())
//							break;
//
//						if (!found) {
//							TreeNodeWrapper tn = BtsviewmodelFactory.eINSTANCE
//									.createTreeNodeWrapper();
//							tn.setObject(o);
//							tn.setParent(child);
//							// grandChildren.add(tn);
//							child.getChildren().add(tn);
//						}
//					}
//					child.setChildrenLoaded(true);

//				}
				if (monitor.isCanceled())
					return Status.CANCEL_STATUS;

				// If you want to update the UI
				sync.asyncExec(lemmaViewerLoadThread(lemmaRootNode, searchString));

				// for (final TreeNodeWrapper child :
				// lemmaRootNode.getChildren())
				// {
				// if (monitor.isCanceled())
				// {
				// return Status.CANCEL_STATUS;
				// }
				//
				// child.setChildrenLoaded(true);
				// List<BTSLemmaEntry> children = lemmaNavigatorController
				// .findChildrenOnlySubEntries(
				// (BTSLemmaEntry) node.getObject(),
				// null,
				// lemmaViewer,
				// node,
				// BtsviewmodelPackage.Literals.TREE_NODE_WRAPPER__CHILDREN,
				// null);
				// final List<BTSLemmaEntry> filteredChildren =
				// filterLemmaProposals(children);
				// // If you want to update the UI
				// sync.asyncExec(new Runnable() {
				// @Override
				// public void run() {
				// System.out.println("add children" + filtered.size());
				// for (BTSObject o : filtered) {
				// boolean found = false;
				// for (TreeNodeWrapper childNode : node.getChildren())
				// {
				// if (childNode.getObject() != null &&
				// childNode.getObject().equals(o))
				// {
				// found = true;
				// break;
				// }
				// }
				// if (!found)
				// {
				// TreeNodeWrapper tn = BtsviewmodelFactory.eINSTANCE
				// .createTreeNodeWrapper();
				// tn.setObject(o);
				// tn.setParent(node);
				// // grandChildren.add(tn);
				// node.getChildren().add(tn);
				// }
				// }
				// node.setChildrenLoaded(true);
				// lemmaViewer.refresh(node);
				// lemmaViewer.setExpandedState(node, true);
				// }
				// });
				// counter++;
				// if (child.getObject() != null && child.getObject() instanceof
				// BTSLemmaEntry)
				// {
				// try {
				// lemmaNavigatorController.checkAndFullyLoad((BTSCorpusObject)
				// child.getObject(), false);
				// } catch (Exception e) {
				// e.printStackTrace();
				// }
				// }
				// if (monitor.isCanceled()) return Status.CANCEL_STATUS;
				//
				// if (counter > 40 || monitor.isCanceled())
				// break;
				// }

				return Status.OK_STATUS;
			}
		};

		// Start the Job
		searchjob.schedule();
		try {
			searchjob.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected List<BTSLemmaEntry> filterLemmaProposals(List<BTSLemmaEntry> obs, String searchString) {
		List<BTSLemmaEntry> filtered = lemmatizerController.sortAndFilterLemmaProposals(obs, searchString);
		return filtered.subList(0, Math.min(filtered.size() , 120));
		
	}

	@Inject
	@Optional
	public void setUserMayEdit(
			@Named(BTSCoreConstants.CORE_EXPRESSION_MAY_EDIT) final boolean userMayEdit) {
		if (userMayEdit != this.userMayEdit) {
			this.userMayEdit = userMayEdit;
			sync.asyncExec(new Runnable() {
				@Override
				public void run() {
					boolean active = false;
					if (activateButton != null)
					{
						active = activateButton.getSelection();
					}
					setUserMayEditInteral(userMayEdit && active);
				}
			});

		}
	}

	protected void setUserMayEditInteral(boolean mayEdit) {
		if (constructed) {
			lemmaID_text.setEditable(mayEdit);
			lemmaName_text.setEditable(mayEdit);
			flex_text.setEditable(mayEdit);
			wordTranslate_Editor.setEnabled(mayEdit);
			lemmaViewer.getTree().setEnabled(mayEdit);
			flexionViewer.getList().setEnabled(mayEdit);
			translationViewer.getList().setEnabled(mayEdit);
			textSelectedWord.setEnabled(mayEdit);
		}

	}

	public BTSLemmaEntry getSelectedLemmaProposal() {
		return seletectedEntry;
	}
}