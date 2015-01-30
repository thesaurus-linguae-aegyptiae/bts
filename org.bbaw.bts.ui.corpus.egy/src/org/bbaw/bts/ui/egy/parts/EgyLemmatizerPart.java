package org.bbaw.bts.ui.egy.parts;

import java.util.Collection;
import java.util.List;
import java.util.Vector;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;
import javax.inject.Named;

import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.BTSTranslation;
import org.bbaw.bts.btsmodel.BTSTranslations;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.btsviewmodel.BtsviewmodelFactory;
import org.bbaw.bts.btsviewmodel.BtsviewmodelPackage;
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
import org.bbaw.bts.ui.commons.corpus.events.BTSTextSelectionEvent;
import org.bbaw.bts.ui.commons.search.SearchViewer;
import org.bbaw.bts.ui.commons.utils.BTSUIConstants;
import org.bbaw.bts.ui.commons.widgets.TranslationEditorComposite;
import org.bbaw.bts.ui.egy.parts.lemmatizer.BTSEgyObjectByNameViewerSorter;
import org.bbaw.bts.ui.main.dialogs.SearchSelectObjectDialog;
import org.bbaw.bts.ui.resources.BTSResourceProvider;
import org.eclipse.core.commands.ParameterizedCommand;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.e4.core.commands.ECommandService;
import org.eclipse.e4.core.commands.EHandlerService;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.di.Persist;
import org.eclipse.e4.ui.di.UISynchronize;
import org.eclipse.e4.ui.model.application.ui.MDirtyable;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.services.internal.events.EventBroker;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.DelegatingStyledCellLabelProvider;
import org.eclipse.jface.viewers.IBaseLabelProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;
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

	private BTSWord currentWord;
	private Text lemmaID_text;
	private Text flex_text;
	private boolean selfSelecting;
	private BTSLemmaEntry seletectedEntry;

	private Text transl_text;
	private boolean constructed;
	private MPart part;
	private TranslationEditorComposite wordTranslate_Editor;

	private Text textSelectedWord;
	private ListViewer lemmaViewer;
	private ListViewer flexionViewer;
	private ListViewer translationViewer;

	private ComposedAdapterFactory factory = new ComposedAdapterFactory(
			ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
	private ISelectionChangedListener lemmaSelectionListener;
	private Text lemmaName_text;

//	@Inject
//	@Optional
//	@Named(BTSCoreConstants.CORE_EXPRESSION_MAY_EDIT)
	private Boolean userMayEdit = new Boolean(false);

	@Inject
	public EgyLemmatizerPart() {
		// TODO Your code here
	}

	@PostConstruct
	public void postConstruct(Composite parent) {
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

		Label lblSelectedWord = new Label(composite, SWT.NONE);
		lblSelectedWord.setText("Selected Word");
		lblSelectedWord.setLayoutData(new GridData(SWT.RIGHT, SWT.FILL, false,
				false, 1, 1));

		textSelectedWord = new Text(composite, SWT.READ_ONLY | SWT.BORDER);
		textSelectedWord.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				false, 2, 1));

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
		lemmaID_text.setToolTipText("WCN or Lemma ID. Enter ID of Lemma if it is not shown.");
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
		lemmaName_text.setToolTipText("Lemma. Shows spelling of Lemmads.");
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
					// TODO search!
				}

			}
		});
		Label lblSearch = new Label(grpLemma, SWT.NONE);
		lblSearch.setImage(resourceProvider.getImage(Display.getDefault(),
				BTSResourceProvider.IMG_SEARCH));
		lblSearch.setToolTipText("Search Object");
		lblSearch.setLayoutData(new GridData(SWT.RIGHT, SWT.TOP, false, false,
				1, 1));
		((GridData) lblSearch.getLayoutData()).verticalIndent = 3;
		lblSearch.addMouseListener(new MouseAdapter() {

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
					// run search command
					ParameterizedCommand cmd = commandService.createCommand(
							"org.bbaw.bts.ui.main.command.search", null);

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
							lemmaNavigatorController.checkAndFullyLoad(seletectedEntry, true);
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

		lemmaViewer = new ListViewer(lemma_composite, SWT.BORDER | SWT.V_SCROLL
				| SWT.H_SCROLL);

		AdapterFactoryLabelProvider.StyledLabelProvider labelProvider = new AdapterFactoryLabelProvider.StyledLabelProvider(
				factory, lemmaViewer);
		AdapterFactoryContentProvider contentProvider = new AdapterFactoryContentProvider(
				factory);
		lemmaViewer.setContentProvider(contentProvider);
		lemmaViewer.setLabelProvider(labelProvider);

		// treeViewer.setSorter(new BTSObjectByNameViewerSorter());
		lemmaSelectionListener = new ISelectionChangedListener() {


			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				StructuredSelection selection = (StructuredSelection) event
						.getSelection();
//				System.out.println(event.getSelection());
				if (selection.getFirstElement() != null
						&& selection.getFirstElement() instanceof TreeNodeWrapper) {
					TreeNodeWrapper tn = (TreeNodeWrapper) selection
							.getFirstElement();
					if (tn.getObject() != null) {
						BTSObject o = (BTSObject) tn.getObject();
						if (o instanceof BTSLemmaEntry) {
							seletectedEntry = (BTSLemmaEntry) o;
							lemmaNavigatorController.checkAndFullyLoad(seletectedEntry, false);
							lemmaID_text.setText(seletectedEntry.get_id());
							lemmaName_text.setText(seletectedEntry.getName());
							loadTranslationProposals(seletectedEntry);
						}
					}
				}
			}
		};
		lemmaViewer.addSelectionChangedListener(lemmaSelectionListener);

		SashForm flexSashForm = new SashForm(lemmaSashForm, SWT.NONE);
		flexSashForm.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 1, 1));

		// flexion
		Group grpFlexion = new Group(flexSashForm, SWT.NONE);
		grpFlexion.setText("Flexion");
		grpFlexion.setLayout(new GridLayout(1, false));
		((GridLayout) grpFlexion.getLayout()).marginHeight = 0;
		((GridLayout) grpFlexion.getLayout()).marginWidth = 0;

		flex_text = new Text(grpFlexion, SWT.BORDER);
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
		wordTranslate_Editor.addLanguageSelectionListener(new SelectionAdapter(){

			@Override
			public void widgetSelected(SelectionEvent e) {
				// language selection in wordTranslation editor changes.
				//reload translation viewer.
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
				| SWT.V_SCROLL);
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
						if (selection.getFirstElement() != null
								&& selection.getFirstElement() instanceof String) {
							String translation = (String) selection
									.getFirstElement();
							wordTranslate_Editor.setTranslationText(translation
									.trim());
						}
					}
				});
		translationViewer.setSorter(new BTSEgyObjectByNameViewerSorter());
		flexionViewer.setContentProvider(contentProvider_flex);
		flexionViewer.setLabelProvider(labelProvider_flex);
		flexSashForm.setWeights(new int[] { 1, 2 });
		lemmaSashForm.setWeights(new int[] { 2, 3 });
		transSashForm.setWeights(new int[] { 1, 2 });
		
		constructed = true;
		parent.layout();
		parent.pack();
		part = partService.findPart(BTSPluginIDs.PART_ID_LEMMATIZER);
		setUserMayEditInteral(userMayEdit && currentWord != null);

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
		evaluationController
				.activateDBCollectionContext(BTSPluginIDs.PREF_MAIN_CORPUS_KEY);
	}

	private void shiftCaret(String eventTopic) {
		System.out.println(eventTopic);
		saveWordData(currentWord);
		eventBroker.post(eventTopic, currentWord);

	}

	@Inject
	void setSelection(
			@Optional @Named(IServiceConstants.ACTIVE_SELECTION) BTSText selection) {
		if (constructed) {
			if (!selfSelecting) {
				if (selection instanceof BTSCorpusObject) {
					if (selection instanceof BTSText) {
						part.setLabel(selection.getName());
						editingDomain = getEditingdomain(selection);
						setUserMayEdit(userMayEdit);
					} else {
						part.setLabel("Lemmatizer");
					}
				}
			} else {
				selfSelecting = false;
			}
		}
	}

	@Inject
	void setSelection(
			@Optional @Named(IServiceConstants.ACTIVE_SELECTION) BTSTextSelectionEvent selection) {
		if (constructed) {
			if (!selfSelecting) {
				if (selection == null) {
					/* implementation not shown */
				} else if (!selection.getSelectedItems().isEmpty()) {
					if (selection.getSelectedItems().get(0) instanceof BTSWord) {
						setSelectionInteral((BTSWord) selection
								.getSelectedItems().get(0));
					} else if (currentWord != null)
					{
						saveWordData(currentWord);
						currentWord = null;
						clearProposals();
						// FIXME clear gui
					}
				}
			} else {
				selfSelecting = false;
			}
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

				} else if (part.isVisible()){
					loadingLemmaProposals(currentWord);
				}
				setUserMayEdit(userMayEdit);
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
				translationViewer.setInput(new String[]{});
			}
		});

	}

	private void loadingLemmaProposals(final BTSWord word) {
		// empty lemmaViewer
		final TreeNodeWrapper lemmaRootNode = BtsviewmodelFactory.eINSTANCE
				.createTreeNodeWrapper();
		// If you want to update the UI
		sync.asyncExec(new Runnable() {
			@Override
			public void run() {
				lemmaViewer.setInput(lemmaRootNode);
			}
		});

		// fill lemmaViewer
		Job job = new Job("load input") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				java.util.List<BTSLemmaEntry> entries = lemmatizerController
						.findLemmaProposals(word, monitor);
				if (monitor.isCanceled()) {
					return Status.CANCEL_STATUS;
				}
				final java.util.List<TreeNodeWrapper> nodes = lemmaNavigatorController
						.loadNodes(
								entries.subList(0,
										Math.min(entries.size(), 80)),
								monitor, false);
				sync.asyncExec(new Runnable() {
					@Override
					public void run() {
						lemmaRootNode.getChildren().addAll(nodes);
					}
				});
				int counter = 0;
				for (BTSLemmaEntry entry : entries) {
					counter++;
					try {
						lemmaNavigatorController.checkAndFullyLoad(entry, false);
					} catch (Exception e) {
						e.printStackTrace();
					}
					if (counter > 40 || monitor.isCanceled())
						break;

				}

				return Status.OK_STATUS;
			}
		};

		// Start the Job
		job.schedule();

	}

	private boolean loadWordData(BTSWord word) {
		boolean isLemmatized = true;
		if (word != null) {

			if (word.getWChar() != null && !"".equals(word.getWChar())) {
				textSelectedWord.setText(word.getWChar());
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
			} else {
				flex_text.setText("");
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

	private EditingDomain getEditingdomain(BTSText text) {
		return editingDomainController.getEditingDomain(text);
	}

	private void setDirty(boolean isDirty) {
		if (isDirty)
			dirty.setDirty(isDirty);

	}

	private void saveWordData(BTSWord word) {
		if (userMayEdit &&  word != null) {
			if (!lemmaID_text.getText().equals(word.getLKey())) {
				if("WCN".equals(lemmaID_text.getText()))
				{
					word.setLKey(null);
				}
				else
				{
					word.setLKey(lemmaID_text.getText());
				}
			}
			if (!flex_text.getText().equals(word.getFlexCode())) {
				word.setFlexCode(flex_text.getText());
			}
		}

	}

	@Persist
	public boolean save() {
		// FIXME save
		dirty.setDirty(false);
		return true;

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public void search(final BTSQueryRequest query, String queryName) {
		final TreeNodeWrapper lemmaRootNode = BtsviewmodelFactory.eINSTANCE
				.createTreeNodeWrapper();
		// fill lemmaViewer
		Job job = new Job("load input") {
			// // in new job, search
			@Override
			protected IStatus run(IProgressMonitor monitor) {

				List<BTSLemmaEntry> obs;
				obs = lemmaNavigatorController
						.getSearchEntries(
								query,
								null,
								lemmaViewer,
								lemmaRootNode,
								BtsviewmodelPackage.Literals.TREE_NODE_WRAPPER__CHILDREN,
								monitor);
				if (obs != null && obs.size() > 0) {
					List<TreeNodeWrapper> nodes = lemmaNavigatorController
							.loadNodes(obs, monitor, false);
					lemmaRootNode.getChildren().addAll(nodes);
				} else {
					TreeNodeWrapper emptyNode = BtsviewmodelFactory.eINSTANCE
							.createTreeNodeWrapper();
					emptyNode.setLabel("Nothing found that matches your query");
					lemmaRootNode.getChildren().add(emptyNode);
				}
				// If you want to update the UI
				sync.asyncExec(new Runnable() {
					@Override
					public void run() {
						lemmaViewer.setInput(lemmaRootNode);
					}
				});
				return Status.OK_STATUS;
			}
		};

		// Start the Job
		job.schedule();

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
	
	protected void setUserMayEditInteral(boolean mayEdit) {
		if (constructed)
		{
			this.userMayEdit = mayEdit;
			lemmaID_text.setEditable(mayEdit);
			lemmaName_text.setEditable(mayEdit);
			flex_text.setEditable(mayEdit);
			wordTranslate_Editor.setEnabled(mayEdit);
			lemmaViewer.getList().setEnabled(mayEdit);
			flexionViewer.getList().setEnabled(mayEdit);
			translationViewer.getList().setEnabled(mayEdit);
		}
		
	}
}