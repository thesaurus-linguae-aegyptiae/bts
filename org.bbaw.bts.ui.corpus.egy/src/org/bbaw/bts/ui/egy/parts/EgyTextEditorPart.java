package org.bbaw.bts.ui.egy.parts;

import java.awt.Dimension;
import java.awt.Frame;
import java.util.EventObject;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import jsesh.editor.JMDCEditor;

import org.bbaw.bts.btsmodel.BTSComment;
import org.bbaw.bts.btsmodel.BTSIdentifiableItem;
import org.bbaw.bts.btsmodel.BTSInterTextReference;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.BTSReferencableItem;
import org.bbaw.bts.btsmodel.BTSRelation;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.btsviewmodel.BtsviewmodelPackage;
import org.bbaw.bts.commons.BTSPluginIDs;
import org.bbaw.bts.core.commons.staticAccess.StaticAccessController;
import org.bbaw.bts.core.controller.generalController.EditingDomainController;
import org.bbaw.bts.core.controller.generalController.PermissionsAndExpressionsEvaluationController;
import org.bbaw.bts.core.corpus.controller.partController.BTSTextEditorController;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAmbivalence;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAnnotation;
import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject;
import org.bbaw.bts.corpus.btsCorpusModel.BTSGraphic;
import org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaCase;
import org.bbaw.bts.corpus.btsCorpusModel.BTSSenctence;
import org.bbaw.bts.corpus.btsCorpusModel.BTSSentenceItem;
import org.bbaw.bts.corpus.btsCorpusModel.BTSText;
import org.bbaw.bts.corpus.btsCorpusModel.BTSWord;
import org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelFactory;
import org.bbaw.bts.corpus.text.egy.egyDsl.TextContent;
import org.bbaw.bts.corpus.text.egy.ui.internal.EgyDslActivator;
import org.bbaw.bts.searchModel.BTSModelUpdateNotification;
import org.bbaw.bts.ui.commons.corpus.events.BTSTextSelectionEvent;
import org.bbaw.bts.ui.commons.corpus.interfaces.IBTSEditor;
import org.bbaw.bts.ui.commons.corpus.text.BTSAnnotationAnnotation;
import org.bbaw.bts.ui.commons.corpus.text.BTSCommentAnnotation;
import org.bbaw.bts.ui.commons.corpus.text.BTSLemmaAnnotation;
import org.bbaw.bts.ui.commons.corpus.text.BTSModelAnnotation;
import org.bbaw.bts.ui.commons.corpus.text.BTSSubtextAnnotation;
import org.bbaw.bts.ui.commons.utils.BTSUIConstants;
import org.bbaw.bts.ui.commons.widgets.TranslationEditorComposite;
import org.bbaw.bts.ui.egy.parts.egyTextEditor.AnnotationDrawingStrategy;
import org.bbaw.bts.ui.egy.parts.egyTextEditor.AnnotationHighlightedDrawingStrategy;
import org.bbaw.bts.ui.egy.parts.egyTextEditor.BTSTextXtextEditedResourceProvider;
import org.bbaw.bts.ui.egy.parts.egyTextEditor.CommentDrawingStrategy;
import org.bbaw.bts.ui.egy.parts.egyTextEditor.CommentHighlightedDrawingStrategy;
import org.bbaw.bts.ui.egy.parts.egyTextEditor.EgyLineNumberRulerColumn;
import org.bbaw.bts.ui.egy.parts.egyTextEditor.RubrumDrawingStrategy;
import org.bbaw.bts.ui.egy.parts.egyTextEditor.SubtextHighlightedDrawingStrategy;
import org.bbaw.bts.ui.egy.parts.egyTextEditor.SubtextdrawingStrategy;
import org.bbaw.bts.ui.egy.parts.egyTextEditor.TextModelHelper;
import org.bbaw.bts.ui.egy.parts.egyTextEditor.model.AnnotationAnnotation;
import org.bbaw.bts.ui.egy.parts.egyTextEditor.model.CommentAnnotation;
import org.bbaw.bts.ui.egy.parts.egyTextEditor.model.InvisibleAnnotation;
import org.bbaw.bts.ui.egy.parts.egyTextEditor.model.LemmaAnnotation;
import org.bbaw.bts.ui.egy.parts.egyTextEditor.model.ModelAnnotation;
import org.bbaw.bts.ui.egy.parts.egyTextEditor.model.SubtextAnnotation;
import org.bbaw.bts.ui.egy.textSign.SignTextComposite;
import org.bbaw.bts.ui.font.BTSFontManager;
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
import org.eclipse.e4.core.services.log.Logger;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.di.Persist;
import org.eclipse.e4.ui.di.UISynchronize;
import org.eclipse.e4.ui.model.application.ui.MDirtyable;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.services.EContextService;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.services.internal.events.EventBroker;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.e4.ui.workbench.swt.modeling.EMenuService;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.DocumentEvent;
import org.eclipse.jface.text.IDocumentListener;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.jface.text.source.AnnotationModel;
import org.eclipse.jface.text.source.AnnotationPainter;
import org.eclipse.jface.text.source.AnnotationPainter.ITextStyleStrategy;
import org.eclipse.jface.text.source.CompositeRuler;
import org.eclipse.jface.text.source.IAnnotationAccess;
import org.eclipse.jface.text.source.IAnnotationModel;
import org.eclipse.jface.text.source.LineNumberRulerColumn;
import org.eclipse.jface.text.source.OverviewRuler;
import org.eclipse.jface.text.source.VerticalRuler;
import org.eclipse.jface.text.source.projection.ProjectionViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.custom.CaretEvent;
import org.eclipse.swt.custom.CaretListener;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.events.TypedEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Widget;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditor;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorFactory;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorModelAccess;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.eclipse.xtext.validation.Issue;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventHandler;

import com.google.inject.Injector;

public class EgyTextEditorPart implements IBTSEditor, EventHandler
{

	@Inject
	private BTSFontManager fontManager;
	@Inject
	private MDirtyable dirty;

	@Inject
	private BTSTextEditorController textEditorController;
	@Inject
	private ESelectionService selectionService;
	@Inject
	private UISynchronize sync;
	@Inject
	private EventBroker eventBroker;
	@Inject
	IEclipseContext context;
	@Inject
	private EContextService contextService;
	@Inject
	private ECommandService commandService;
	@Inject
	private EPartService partService;

	@Inject
	private EHandlerService handlerService;

	@Inject
	private EditingDomainController editingDomainController;

	@Inject
	private PermissionsAndExpressionsEvaluationController evaluationController;
	
	@Inject
	private EMenuService menuService;
	
	private static final String FONT_NAME = "FreeSans";
	private static final int SIZE = 10;

	private static final int EDITOR_PREFIX_LENGTH = 1;


	private static final int LINE_SPACE = 8;

	private BTSText text;
	private CTabItem tbtmBtseditor;
	private CTabFolder tabFolder;
	private StyledText plainTextEditor;
	private JMDCEditor jseshEditor;

	protected int counter;

	protected boolean loading;

	private VerticalRuler verticalRuler;

	private ProjectionViewer textViewer;

	private Document document;

	private IAnnotationModel annotationModel;

	protected int tabSelection;


	private SignTextComposite signTextEditor;

	private Composite btsEditorComp;

	private EmbeddedEditorFactory embeddedEditorFactory;

	private Injector injector;

	private BTSTextXtextEditedResourceProvider xtextResourceProvider = new BTSTextXtextEditedResourceProvider();

	private EmbeddedEditor embeddedEditor;

	private Composite embeddedEditorComp;

	private EmbeddedEditorModelAccess embeddedEditorModelAccess;

	private Composite embeddedEditorParentComp;

	protected TextModelHelper textModelHelper = new TextModelHelper();

	private AnnotationPainter painter;

	private CompositeRuler ruler;

	private OverviewRuler oruler;

	private boolean selfSelecting;

	private BTSSenctence selectedSentence;

	private BTSSentenceItem selectedSentenceItem;

	private Map<String, ModelAnnotation> modelAnnotationMap;

	private StyleRange selectionRange;

	protected Object selectedTextItem;

	private StyleRange[] preSelectionRanges;

	protected boolean isDocUpdating;
	private TranslationEditorComposite sentenceTranslate_Editor;
	private EditingDomain editingDomain;
	private CommandStackListener commandStackListener;
	private Set<Command> localCommandCacheSet = new HashSet<Command>();
	private Composite parent;
	private MPart part;
	private List<BTSObject> relatingObjects;
		
	@Inject
	private Logger logger;
	private List<ModelAnnotation> highlightedAnnotations = new Vector<ModelAnnotation>(4);
	private Map<EObject, List<ModelAnnotation>> relatingObjectsAnnotationMap;
	protected String queryId;
	private Map<String, List<BTSInterTextReference>> relatingObjectsMap;


	/**
	 * @param parent
	 */
	@PostConstruct
	public void createComposite(Composite parent)
	{
		this.parent = parent;
		parent.setLayout(new GridLayout());
		((GridLayout) parent.getLayout()).marginHeight = 0;
		((GridLayout) parent.getLayout()).marginWidth = 0;
		contextService
				.activateContext("org.eclipse.ui.contexts.dialogAndWindow");
		eventBroker.subscribe("event_text_selection/*", this);
		eventBroker.subscribe("event_relating_objects/*", this);
		
		System.out.println("EgyEditor postconstruct");

		SashForm sashForm = new SashForm(parent, SWT.VERTICAL);
		sashForm.setLayoutData(new GridData(GridData.FILL_BOTH));
		Composite composite = new Composite(sashForm, SWT.NONE);
		composite.setLayoutData(new GridData(GridData.FILL_BOTH));
		composite.setLayout(new GridLayout());
		((GridLayout) composite.getLayout()).marginHeight = 0;
		((GridLayout) composite.getLayout()).marginWidth = 0;
		{
			tabFolder = new CTabFolder(composite, SWT.BORDER | SWT.BOTTOM);
			tabFolder.setLayoutData(new GridData(GridData.FILL_BOTH));
			tabFolder.addSelectionListener(new SelectionAdapter()
			{


				@Override
				public void widgetSelected(SelectionEvent e)
				{
					int oldSelection = tabSelection;
					tabSelection = tabFolder.getSelectionIndex();
					if (tabSelection == oldSelection)
					{
						return;
					} else
					{
						//update model from old selection editor
						switch (oldSelection)
						{
							case 0:
							{
								updateModelFromTranscription();
								break;
							}
							case 1:
							{
								updateModelFromSignText();
								break;
							}
							case 2:
							{
								updateModelFromJSesh();
								break;
							}
						}

						// load updated model into selected editor
						switch (tabSelection)
						{
							case 0:
							{
								contextService
								.activateContext("org.eclipse.xtext.ui.embeddedTextEditorScope");
								loadInputTranscription(text, relatingObjects);
								break;
							}
							case 1:
							{
							
								loadInputSignText(text, relatingObjects, relatingObjectsMap);
								break;
							}
							case 2:
							{
								loadInputJSesh(text, relatingObjects);
								break;
							}
						}
					}

				}
			});

			tabFolder.setSelectionBackground(Display.getCurrent().getSystemColor(
					SWT.COLOR_TITLE_INACTIVE_BACKGROUND_GRADIENT));
			{
				CTabItem tbtmPlaintext2 = new CTabItem(tabFolder, SWT.NONE);
				tbtmPlaintext2.setText("Transliteration");
				{

					embeddedEditorParentComp = new Composite(tabFolder,
							SWT.NONE | SWT.BORDER);
					embeddedEditorParentComp.setLayout(new GridLayout());
					tbtmPlaintext2.setControl(embeddedEditorParentComp);
					// inititae static access controller
					StaticAccessController sa = context
							.get(StaticAccessController.class);
					EgyDslActivator activator = EgyDslActivator.getInstance();
					Injector injector = activator
							.getInjector(EgyDslActivator.ORG_BBAW_BTS_CORPUS_TEXT_EGY_EGYDSL);
					embeddedEditorFactory = injector
							.getInstance(EmbeddedEditorFactory.class);
					loadInputTranscription(null, relatingObjects);
					
				}
				CTabItem signTextTab = new CTabItem(tabFolder, SWT.NONE);
				signTextTab.setText("Sign-Text-Editor");
				{
					Composite plainTextComp = new Composite(tabFolder, SWT.NONE
							| SWT.BORDER);
					plainTextComp.setLayout(new GridLayout());
					signTextTab.setControl(plainTextComp);
					IEclipseContext child = context.createChild();
					child.set(Composite.class, plainTextComp);
					child.set(IBTSEditor.class, EgyTextEditorPart.this);
					signTextEditor = ContextInjectionFactory.make(
							SignTextComposite.class, child);
					signTextEditor.setEventBroker(eventBroker);
					plainTextComp.layout();
					plainTextComp.pack();
				}
				CTabItem tbtm5 = new CTabItem(tabFolder, SWT.NONE);
				tbtm5.setText("JseshEditor");
				{
					Composite plainTextComp = new Composite(tabFolder, SWT.NONE
							| SWT.BORDER);
					plainTextComp.setLayout(new GridLayout(2, false));
					tbtm5.setControl(plainTextComp);

					// Label l = new Label(plainTextComp, SWT.NONE);
					// l.setText("CodeBuffer");
					//
					// codeBufferText = new Text(plainTextComp, SWT.BORDER);
					// codeBufferText.addKeyListener(new KeyListener() {
					//
					// @Override
					// public void keyReleased(KeyEvent e) {
					// // TODO Auto-generated method stub
					//
					// }
					//
					// @Override
					// public void keyPressed(KeyEvent e) {
					// if (e.keyCode == SWT.CR) {
					// jseshEditor.insert(codeBufferText.getText());
					// jseshEditor.setMDCText(codeBufferText.getText());
					// codeBufferText.setText("");
					// }
					//
					// }
					// });
					Composite comEmbeded = new Composite(plainTextComp,
							SWT.EMBEDDED | SWT.NO_BACKGROUND | SWT.BORDER);
					comEmbeded.setLayoutData(new GridData(SWT.FILL, SWT.FILL,
							true, true, 2, 1));

					// comEmbeded.setLayout(new FillLayout());
					Frame frame = SWT_AWT.new_Frame(comEmbeded);

					jseshEditor = new JMDCEditor();
					jseshEditor.setMDCText("pt:p*t");
					// jseshEditor.setTextDirection(TextDirection.RIGHT_TO_LEFT);
					// jseshEditor.setTextOrientation(TextOrientation.VERTICAL);
					jseshEditor.setPreferredSize(new Dimension(500, 500));
					jseshEditor
							.addKeyListener(new java.awt.event.KeyListener() {

								@Override
								public void keyTyped(java.awt.event.KeyEvent e) {
									// TODO Auto-generated method stub

								}

								@Override
								public void keyReleased(
										java.awt.event.KeyEvent e) {
									Display.getDefault().asyncExec(
											new Runnable() {

												@Override
												public void run() {

												}
											});

								}

								@Override
								public void keyPressed(java.awt.event.KeyEvent e) {
									// TODO Auto-generated method stub

								}
							});
					// codeBufferText.setText(jseshEditor.getCodeBuffer());

					frame.add(jseshEditor);

					comEmbeded.layout();

					plainTextComp.layout();
					plainTextComp.pack();
				}
			}
		}
		tabFolder.setSelection(0);
		composite.layout();
		composite.pack();

		Group sentenceTranslateComp = new Group(sashForm, SWT.NONE);
		sentenceTranslateComp.setLayoutData(new GridData(GridData.FILL_BOTH));
		sentenceTranslateComp.setLayout(new GridLayout());
		sentenceTranslateComp.setText("Translation of Sentence");
		sentenceTranslate_Editor = new TranslationEditorComposite(
				sentenceTranslateComp, SWT.WRAP | SWT.MULTI | SWT.V_SCROLL
						| SWT.BORDER, null, null, false);
		sentenceTranslate_Editor.setLayoutData(new GridData(SWT.FILL, SWT.FILL,
				true, true));
		sentenceTranslateComp.layout();
		sashForm.setWeights(new int[] { 6, 1 });
		parent.layout();
		
		part = partService.findPart(BTSPluginIDs.PART_ID_EGY_TEXTEDITOR);

	}

	protected void updateModelFromSignText()
	{
		// TODO Auto-generated method stub

	}

	protected void updateModelFromJSesh()
	{
		// TODO Auto-generated method stub

	}


	protected void updateModelFromTranscription()
	{
		if (text != null) {
			IAnnotationModel am = embeddedEditor.getViewer()
					.getAnnotationModel();
			IXtextDocument document = embeddedEditor.getDocument();

			EList<EObject> objects = document
					.readOnly(new IUnitOfWork<EList<EObject>, XtextResource>() {
						@Override
						public EList<EObject> exec(XtextResource state)
								throws Exception {
							return state.getContents();
						}
					});
			EObject eo = objects.get(0);
			if (eo instanceof TextContent) {
				textModelHelper.updateModelFromTextContent(text, eo, am);
			}
		}

	}

	protected void loadInputJSesh(BTSText text2, List<BTSObject> localRelatingObjects)
	{
		String jseshMdc = textEditorController
				.transformTextToJSeshMdCString(text2);
		System.out.println(jseshMdc);
		try {
			jseshEditor.setMDCText(jseshMdc);
		} catch (Exception e) {
			logger.error(e);
		}

	}

	protected void loadInputTranscription(BTSText localtext, List<BTSObject> localRelatingObjects)
	{
		text = localtext;
		if (embeddedEditorComp != null)
		{
			embeddedEditorComp.dispose();
			embeddedEditorComp = null;
		}
		embeddedEditorComp = new Composite(embeddedEditorParentComp, SWT.None);
		embeddedEditorComp.setLayout(new GridLayout());
		embeddedEditorComp.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				true));

		Document doc = new Document();
		this.document = doc;

		AnnotationModel tempAnnotationModel = new AnnotationModel();
//		this.annotationModel = model;
		textEditorController.transformToDocument(text, doc, tempAnnotationModel, localRelatingObjects, relatingObjectsMap);

		embeddedEditor = embeddedEditorFactory.newEditor(xtextResourceProvider)
				.showAnnotations(BTSAnnotationAnnotation.TYPE,
						BTSCommentAnnotation.TYPE,
						"org.eclipse.xtext.ui.editor.error",
						"org.eclipse.xtext.ui.editor.warning")
				.withParent(embeddedEditorComp);
		embeddedEditor.getViewer().getTextWidget().setLineSpacing(LINE_SPACE);
		
		// embeddedEditor.getViewer().getTextWidget().setFont(font);
		// keep the partialEditor as instance var to read / write the edited
		// text
		embeddedEditorModelAccess = embeddedEditor.createPartialEditor(
"\r",
				doc.get(), "\r", false);
		annotationModel = embeddedEditor.getViewer().getAnnotationModel();

		loadAnnotations2Editor(annotationModel, tempAnnotationModel);
//		annotationModel.connect(doc);
		configureEditorDrawingStrategies();
		embeddedEditorParentComp.layout();
		// embeddedEditor.getViewer().getControl().setFocus();

		ruler = embeddedEditorFactory.getCpAnnotationRuler();
		ruler.setModel(annotationModel);
		ruler.update();
		ruler.relayout();

		oruler = embeddedEditorFactory.getOverViewRuler();
		oruler.addAnnotationType(AnnotationAnnotation.TYPE);
		oruler.setAnnotationTypeLayer(AnnotationAnnotation.TYPE, 3);
		oruler.setAnnotationTypeColor(AnnotationAnnotation.TYPE,
				BTSUIConstants.COLOR_ANNOTATTION);
		oruler.addAnnotationType(AnnotationAnnotation.TYPE_HIGHLIGHTED);
		oruler.setAnnotationTypeLayer(AnnotationAnnotation.TYPE_HIGHLIGHTED, 5);
		oruler.setAnnotationTypeColor(AnnotationAnnotation.TYPE_HIGHLIGHTED,
				BTSUIConstants.COLOR_ANNOTATTION);
		oruler.addAnnotationType(AnnotationAnnotation.TYPE_RUBRUM);
		oruler.setAnnotationTypeLayer(AnnotationAnnotation.TYPE_RUBRUM, 3);
		oruler.setAnnotationTypeColor(AnnotationAnnotation.TYPE_RUBRUM,
				BTSUIConstants.COLOR_RUBRUM);

		oruler.addAnnotationType(CommentAnnotation.TYPE);
		oruler.setAnnotationTypeLayer(CommentAnnotation.TYPE, 2);
		oruler.setAnnotationTypeColor(CommentAnnotation.TYPE,
				BTSUIConstants.COLOR_COMMENT);
		oruler.addAnnotationType(CommentAnnotation.TYPE_HIGHLIGHTED);
		oruler.setAnnotationTypeLayer(CommentAnnotation.TYPE_HIGHLIGHTED, 4);
		oruler.setAnnotationTypeColor(CommentAnnotation.TYPE_HIGHLIGHTED,
				BTSUIConstants.COLOR_COMMENT);

		oruler.addAnnotationType("org.eclipse.xtext.ui.editor.error");
		oruler.setAnnotationTypeLayer("org.eclipse.xtext.ui.editor.error", 30);
		oruler.setAnnotationTypeColor("org.eclipse.xtext.ui.editor.error",
				new Color(Display.getDefault(), new RGB(255, 0, 0)));

		oruler.addAnnotationType("org.eclipse.xtext.ui.editor.warning");
		oruler.setAnnotationTypeLayer("org.eclipse.xtext.ui.editor.warning", 10);
		oruler.setAnnotationTypeColor("org.eclipse.xtext.ui.editor.warning",
				new Color(Display.getDefault(), new RGB(235, 235, 10)));

		oruler.setModel(annotationModel);
		oruler.update();

		embeddedEditorParentComp.layout();
		embeddedEditor.getViewer().getTextWidget()
				.addCaretListener(new CaretListener() {

					@Override
					public void caretMoved(CaretEvent event) {
						processTextSelection(event);

					}
				});
		embeddedEditor.getViewer().getTextWidget().addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent event) {
				processTextSelection(event);

				
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		LineNumberRulerColumn lineNumberRulerColumn = new EgyLineNumberRulerColumn(
				LINE_SPACE);
		lineNumberRulerColumn.setModel(annotationModel);
		embeddedEditor.getViewer()
				.addVerticalRulerColumn(lineNumberRulerColumn);
		if (text != null) {
			embeddedEditor.getDocument().addDocumentListener(
					new IDocumentListener() {

					@Override
					public void documentChanged(DocumentEvent event) {
							setDirtyInternal();

					}

					@Override
					public void documentAboutToBeChanged(DocumentEvent event) {
						// TODO Auto-generated method stub

					}
				});
		}
//		menuService.registerContextMenu(
//				embeddedEditor.getViewer().getTextWidget(),
//				BTSPluginIDs.POPMENU_EGY_TEXT_EDITOR_XTEXT_MENU);
//		Object mm = embeddedEditor.getViewer().getTextWidget().getMenu();
//		System.out.println(mm);

	}

	protected void processTextSelection(TypedEvent event) {
		BTSTextSelectionEvent btsEvent = new BTSTextSelectionEvent(event);
//		System.out.println("Textselection x y : " + btsEvent.x + " " + btsEvent.y);
		btsEvent.data = text;
		List<ModelAnnotation> annotations = getModelAnnotationAtSelection(btsEvent.x, btsEvent.y, btsEvent);
		btsEvent.getTextAnnotations().addAll(annotations);
		processSelection(annotations, false, btsEvent);
		selectionService.setSelection(btsEvent);
		
	}
	
	protected void processEditorSelection(Object item) {
		TypedEvent event = new TypedEvent(item);
		BTSTextSelectionEvent btsEvent = new BTSTextSelectionEvent(event);
//		System.out.println("Textselection x y : " + btsEvent.x + " " + btsEvent.y);
		btsEvent.data = text;
		List<ModelAnnotation> annotations = getModelAnnotationAtSelection(btsEvent.x, btsEvent.y, btsEvent);
		btsEvent.getTextAnnotations().addAll(annotations);
		processSelection(annotations, false, btsEvent);
		selectionService.setSelection(btsEvent);
		
	}

	protected void processSelection(List<ModelAnnotation> annotations, boolean postSelection, BTSTextSelectionEvent btsEvent) {
		List<ModelAnnotation> relatingObjectsAnnotations = new Vector<ModelAnnotation>(annotations.size());
		for (ModelAnnotation ma : annotations) {
			if (ma != null && ma instanceof LemmaAnnotation && ma.getModelObject() != null
					&& ma.getModelObject() instanceof BTSObject
					&& !ma.getModelObject().equals(selectedTextItem))
			{
				if (ma.getModelObject() instanceof BTSWord) {
					setSentenceTranslation((BTSWord) ma.getModelObject());
				} else if (ma.getModelObject() instanceof BTSSenctence) {
					setSentenceTranslation((BTSSenctence) ma.getModelObject());
				}
			} 
			else if (ma instanceof AnnotationAnnotation) {
				relatingObjectsAnnotations.add(ma);
				if (btsEvent != null)
				{
					btsEvent.getInterTextReferences().add(ma.getInterTextReference());
				}
			} else if (ma instanceof CommentAnnotation) {
				relatingObjectsAnnotations.add(ma);
				if (btsEvent != null)
				{
					btsEvent.getInterTextReferences().add(ma.getInterTextReference());
				}
			} else if (ma instanceof SubtextAnnotation) {
				relatingObjectsAnnotations.add(ma);
				if (btsEvent != null)
				{
					btsEvent.getInterTextReferences().add(ma.getInterTextReference());
				}
			} 
			
		}
		List<ModelAnnotation> deHighlightedAnnotations = new Vector<ModelAnnotation>(highlightedAnnotations.size());

		deHighlightedAnnotations.addAll(highlightedAnnotations);
		deHighlightedAnnotations.removeAll(relatingObjectsAnnotations);
		highlightAnnotations(deHighlightedAnnotations, false);

		if (!relatingObjectsAnnotations.isEmpty())
		{

			highlightAnnotations(relatingObjectsAnnotations, true);
			
			List<BTSObject> relSelObjects = new Vector<BTSObject>(annotations.size());
			for (ModelAnnotation a : relatingObjectsAnnotations)
			{
				if (a instanceof AnnotationAnnotation)
				{
					relSelObjects.add((BTSObject) ((AnnotationAnnotation) a).getAnnotation());
				} else if (a instanceof CommentAnnotation)
				{
					relSelObjects.add((BTSObject) ((CommentAnnotation) a).getComment());
				}else if (a instanceof SubtextAnnotation)
				{
					relSelObjects.add((BTSObject) ((SubtextAnnotation) a).getSubtext());
				}
			}
			if (btsEvent != null)
			{
				btsEvent.setRelatingObjects(relSelObjects);
			}
//			if (postSelection){
//				eventBroker.post(
//					BTSUIConstants.EVENT_TEXT_RELATING_OBJECTS_SELECTED,
//					relSelObjects);
//			}
			highlightedAnnotations.addAll(relatingObjectsAnnotations);
		}
//		else if (postSelection)
//		{
//			eventBroker.post(
//					BTSUIConstants.EVENT_TEXT_RELATING_OBJECTS_SELECTED,
//					null);
//		}
		painter.modelChanged(annotationModel);
	}

	private void highlightAnnotations(
		List<ModelAnnotation> relatingObjectsAnnotations, boolean highlighted) {
		for (ModelAnnotation a : relatingObjectsAnnotations)
		{
			a.setHighlighted(highlighted);
		}
	}

	protected void setDirtyInternal() {
		if (text != null && !dirty.isDirty()) {
			dirty.setDirty(true);
		}

	}

	private List<ModelAnnotation> getModelAnnotationAtSelection(int start, int end, BTSTextSelectionEvent btsEvent) {
		Iterator it = embeddedEditor.getViewer().getAnnotationModel()
				.getAnnotationIterator();
		List<ModelAnnotation> annotations = new Vector<ModelAnnotation>(4);
		BTSSentenceItem startItem = null;
		int startItemOffeset = 0;
		BTSSentenceItem endItem = null;
		int endItemOffeset = 0;
		List<BTSSentenceItem> textItems = new Vector<BTSSentenceItem>();
		while (it.hasNext()) {
			Annotation a = (Annotation) it.next();
			if (a instanceof ModelAnnotation) {
				Position pos = embeddedEditor.getViewer().getAnnotationModel()
						.getPosition(a);
//				System.out.println("pos " + pos.getOffset() + " " +  pos.getOffset() + pos.getLength());
				if ((pos.getOffset() <= start
						&& start < pos.getOffset() + pos.getLength()) || (pos.getOffset() >= start && pos.getOffset() <= end)) {
					annotations.add((ModelAnnotation) a);
					if (((ModelAnnotation)a).getModelObject() instanceof BTSSentenceItem)
					{
						BTSSentenceItem item = (BTSSentenceItem) ((ModelAnnotation)a).getModelObject();
						textItems.add(item);
						if (startItem == null || pos.getOffset() < startItemOffeset)
						{
							startItem = item;
							startItemOffeset = pos.getOffset();
						}
						if (endItem == null || pos.getOffset() + pos.getLength() > endItemOffeset)
						{
							endItem = item;
							endItemOffeset = pos.getOffset() + pos.getLength();
						}
					}

				}
//				else if (pos.getOffset() >= start && pos.getOffset() <= end) {
//					annotations.add((ModelAnnotation) a);
//
//				}
			}
		}
		if (btsEvent != null)
		{
			if (startItem != null)
			{
				btsEvent.setStartId(startItem.get_id());
			}
			if (endItem != null)
			{
				btsEvent.setEndId(endItem.get_id());
			}
			btsEvent.getSelectedItems().addAll(textItems);
		}
		return annotations;
	}

	private void configureEditorDrawingStrategies() {
		IAnnotationAccess annotationAccess = new IAnnotationAccess() {
			public Object getType(Annotation annotation) {
				return annotation.getType();
			}

			public boolean isMultiLine(Annotation annotation) {
				return true;
			}

			public boolean isTemporary(Annotation annotation) {
				return true;
			}
		};

		painter = new AnnotationPainter(
				embeddedEditor.getViewer(),
				annotationAccess);

		
		//Lemma
		ITextStyleStrategy strategy = new org.eclipse.jface.text.source.AnnotationPainter.HighlightingStrategy();
		painter.addTextStyleStrategy(LemmaAnnotation.TYPE, strategy);
		painter.setAnnotationTypeColor(LemmaAnnotation.TYPE,
				BTSUIConstants.COLOR_LEMMA);
		painter.addAnnotationType(LemmaAnnotation.TYPE, LemmaAnnotation.TYPE);



		// comment
		CommentDrawingStrategy commentStrategy = new CommentDrawingStrategy();
		painter.addDrawingStrategy(CommentAnnotation.TYPE, commentStrategy);
		painter.setAnnotationTypeColor(CommentAnnotation.TYPE,
				BTSUIConstants.COLOR_COMMENT);
		painter.addAnnotationType(CommentAnnotation.TYPE,
				CommentAnnotation.TYPE);
		
		// comment highlighted
		CommentHighlightedDrawingStrategy commenthighStrategy = new CommentHighlightedDrawingStrategy();
		painter.addDrawingStrategy(CommentAnnotation.TYPE_HIGHLIGHTED, commenthighStrategy);
		painter.setAnnotationTypeColor(CommentAnnotation.TYPE_HIGHLIGHTED,
				BTSUIConstants.COLOR_COMMENT);
		painter.addAnnotationType(CommentAnnotation.TYPE_HIGHLIGHTED,
				CommentAnnotation.TYPE_HIGHLIGHTED);

		// subtext
		SubtextdrawingStrategy subtextStrategy = new SubtextdrawingStrategy();
		painter.addDrawingStrategy(SubtextAnnotation.TYPE, subtextStrategy);
		painter.setAnnotationTypeColor(SubtextAnnotation.TYPE,
				BTSUIConstants.COLOR_SUBTEXT);
		painter.addAnnotationType(SubtextAnnotation.TYPE,
				SubtextAnnotation.TYPE);
		
		// subtext
		SubtextHighlightedDrawingStrategy subtexthighStrategy = new SubtextHighlightedDrawingStrategy();
		painter.addDrawingStrategy(SubtextAnnotation.TYPE_HIGHLIGHTED, subtexthighStrategy);
		painter.setAnnotationTypeColor(SubtextAnnotation.TYPE_HIGHLIGHTED,
				BTSUIConstants.COLOR_SUBTEXT);
		painter.addAnnotationType(SubtextAnnotation.TYPE_HIGHLIGHTED,
				SubtextAnnotation.TYPE_HIGHLIGHTED);
		
		// Annotation
		AnnotationDrawingStrategy annotationStrategy = new AnnotationDrawingStrategy();
		painter.addDrawingStrategy(AnnotationAnnotation.TYPE,
				annotationStrategy);
		painter.setAnnotationTypeColor(AnnotationAnnotation.TYPE,
				BTSUIConstants.COLOR_ANNOTATTION);
		painter.addAnnotationType(AnnotationAnnotation.TYPE,
				AnnotationAnnotation.TYPE);
		
		// Annotation highlighted
		AnnotationHighlightedDrawingStrategy annotationHighlightedStrategy = new AnnotationHighlightedDrawingStrategy();
		painter.addDrawingStrategy(AnnotationAnnotation.TYPE_HIGHLIGHTED,
				annotationHighlightedStrategy);
		painter.setAnnotationTypeColor(AnnotationAnnotation.TYPE_HIGHLIGHTED,
				BTSUIConstants.COLOR_ANNOTATTION);
		painter.addAnnotationType(AnnotationAnnotation.TYPE_HIGHLIGHTED,
				AnnotationAnnotation.TYPE_HIGHLIGHTED);

		// Annotation
		RubrumDrawingStrategy rubrumStrategy = new RubrumDrawingStrategy();
		painter.addTextStyleStrategy(AnnotationAnnotation.TYPE_RUBRUM,
				rubrumStrategy);
		painter.setAnnotationTypeColor(AnnotationAnnotation.TYPE_RUBRUM,
				BTSUIConstants.COLOR_RUBRUM);
		painter.addAnnotationType(AnnotationAnnotation.TYPE_RUBRUM,
				AnnotationAnnotation.TYPE_RUBRUM);

		embeddedEditor.getViewer().addTextPresentationListener(painter);
		embeddedEditor.getViewer().addPainter(painter);
		painter.modelChanged(embeddedEditor.getViewer().getAnnotationModel());

	}

	private void loadAnnotations2Editor(IAnnotationModel editorModel,
			IAnnotationModel model) {
		Iterator i = model.getAnnotationIterator();
		Issue issue;
		issue = new Issue.IssueImpl();
		while (i.hasNext()) {
			Object a = i.next();
			Position pos = model.getPosition((Annotation) a);
			loadSingleAnnotation2Editor(editorModel, a, pos, issue);
			
		}

	}

	private void loadSingleAnnotation2Editor(IAnnotationModel editorModel,
			Object a, Position pos, Issue issue) {
		if (a instanceof BTSLemmaAnnotation) {
			if (((BTSLemmaAnnotation) a).getModel() instanceof BTSWord) {
				LemmaAnnotation ta = new LemmaAnnotation(
						embeddedEditor.getDocument(), issue,
						((BTSLemmaAnnotation) a).getModel());
				
				Position pos2 = new Position(pos.getOffset()
						+ EDITOR_PREFIX_LENGTH, pos.getLength());
				editorModel.addAnnotation((Annotation) ta, pos2);
				modelAnnotationMap.put(((BTSIdentifiableItem) ta.getModelObject()).get_id(), ta);
			}
		} else if (a instanceof BTSAnnotationAnnotation) {
			if (((BTSAnnotationAnnotation) a).getRelatingObject() != null 
					&& ((BTSAnnotationAnnotation) a).getRelatingObject().getType() != null
					&& ((BTSAnnotationAnnotation) a).getRelatingObject().getType().equalsIgnoreCase("rubrum")) {
				AnnotationAnnotation ta = new AnnotationAnnotation(
						embeddedEditor.getDocument(),
						AnnotationAnnotation.TYPE_RUBRUM, issue,
						((BTSAnnotationAnnotation) a).getModel(),
						(BTSAnnotation) ((BTSAnnotationAnnotation) a).getRelatingObject());
				ta.setInterTextReference(((BTSModelAnnotation) a).getInterTextRefernce());

//				Position pos = model.getPosition((Annotation) a);
				Position pos2 = new Position(pos.getOffset()
						+ EDITOR_PREFIX_LENGTH, pos.getLength());
				editorModel.addAnnotation((Annotation) ta, pos2);
				addToRelatingObjectAnnotationMap((EObject) ta.getAnnotation(), ta);
			}
			AnnotationAnnotation ta = new AnnotationAnnotation(
					embeddedEditor.getDocument(), issue,
					((BTSAnnotationAnnotation) a).getModel(),
					(BTSAnnotation) ((BTSAnnotationAnnotation) a).getRelatingObject());
//			Position pos = model.getPosition((Annotation) a);
			ta.setInterTextReference(((BTSModelAnnotation) a).getInterTextRefernce());

			Position pos2 = new Position(pos.getOffset()
					+ EDITOR_PREFIX_LENGTH, pos.getLength());
			editorModel.addAnnotation((Annotation) ta, pos2);
			addToRelatingObjectAnnotationMap((EObject) ta.getAnnotation(), ta);


		} else if (a instanceof BTSCommentAnnotation) {
			CommentAnnotation ta = new CommentAnnotation(
					embeddedEditor.getDocument(), issue,
					((BTSCommentAnnotation) a).getModel(),
					((BTSCommentAnnotation) a).getComment());
			ta.setInterTextReference(((BTSModelAnnotation) a).getInterTextRefernce());


			Position pos2 = new Position(pos.getOffset()
					+ EDITOR_PREFIX_LENGTH, pos.getLength());
			editorModel.addAnnotation((Annotation) ta, pos2);
			addToRelatingObjectAnnotationMap((EObject) ta.getComment(), ta);


		} else if (a instanceof BTSSubtextAnnotation) {
			SubtextAnnotation ta = new SubtextAnnotation(
					embeddedEditor.getDocument(), issue,
					((BTSSubtextAnnotation) a).getModel(),
					(BTSText) ((BTSSubtextAnnotation) a).getRelatingObject());
			ta.setInterTextReference(((BTSModelAnnotation) a).getInterTextRefernce());


//			Position pos = model.getPosition((Annotation) a);
			Position pos2 = new Position(pos.getOffset()
					+ EDITOR_PREFIX_LENGTH, pos.getLength());
			editorModel.addAnnotation((Annotation) ta, pos2);
			addToRelatingObjectAnnotationMap((EObject) ta.getSubtext(), ta);


		} else if (a instanceof BTSModelAnnotation) {
			ModelAnnotation ta = new InvisibleAnnotation(
					embeddedEditor.getDocument(), issue,
					((BTSModelAnnotation) a).getModel());
			ta.setInterTextReference(((BTSModelAnnotation) a).getInterTextRefernce());


//			Position pos = model.getPosition((Annotation) a);
			Position pos2 = new Position(pos.getOffset(), pos.getLength());
			editorModel.addAnnotation((Annotation) ta, pos2);
			modelAnnotationMap.put(((BTSIdentifiableItem) ta.getModelObject()).get_id(), ta);
		}
		
	}

	private void addToRelatingObjectAnnotationMap(EObject object,
			ModelAnnotation ma) {
		List<ModelAnnotation> l = relatingObjectsAnnotationMap.get(object);
		if (l == null)
		{
			l = new Vector<ModelAnnotation>(2);
			relatingObjectsAnnotationMap.put(object, l);
		}
		l.add(ma);
	}

	@Inject
	@Optional
	void eventReceivedNew(@EventTopic("model_new/BTSWord*") Object object)
	{
	}

	@Inject
	@Optional
	void eventReceivedCaretEvents(
			@EventTopic("event_text_selection/*") Object event) {
		if (event instanceof String && event != null) {
			switch (tabFolder.getSelectionIndex()) {
			case 0: {
				setTextSelectionEvent((String) event);
				break;
			}
			case 1: // signtextEditor
			{
				signTextEditor.setTextSelectionEvent((String) event);
				break;
			}
			}

		}
	}

	private void setTextSelectionEvent(String event) {
		if (event.equals(BTSUIConstants.EVENT_TEXT_SELECTION_ALL_START)) {

		} else if (event.equals(BTSUIConstants.EVENT_TEXT_SELECTION_LINE_START)) {

		} else if (event.equals(BTSUIConstants.EVENT_TEXT_SELECTION_PREVIOUS)) {
			shiftSelection(-1);

		} else if (event.equals(BTSUIConstants.EVENT_TEXT_SELECTION_NEXT)) {
			shiftSelection(1);
		} else if (event.equals(BTSUIConstants.EVENT_TEXT_SELECTION_LINE_END)) {

		} else if (event.equals(BTSUIConstants.EVENT_TEXT_SELECTION_ALL_END)) {

		}

	}

	private void shiftSelection(int i) {
		int caret = embeddedEditor.getViewer().getTextWidget().getCaretOffset();
		// ohne �ber annotationmodel zu gehen!!!!!

	}

	@Inject
	public void setSelection(
			@Optional @Named(IServiceConstants.ACTIVE_SELECTION) BTSObject selection) {
		if (selection == null || parent == null || parent.isDisposed()) {
			// do nothing
			return;
		} else if (selection != null && !selection.equals(selectedTextItem)) {
			if (selection instanceof BTSCorpusObject) {
				purgeCache();
				if (editingDomain != null) {
					editingDomain.getCommandStack().removeCommandStackListener(
							commandStackListener);
				}
				// TODO save configurable this is autosave!!!
				save();
				if (selection instanceof BTSText) {
					loadInput((BTSCorpusObject) selection);
					part.setLabel(selection.getName());

				} else {
					loadInput(null);
					part.setLabel("EgyTextEditor");

				}
			}
			if ((selection instanceof BTSText)) {
				selfSelecting = false;
			}

			selectedTextItem = selection;
			if (editingDomain != null) {
				editingDomain.getCommandStack().removeCommandStackListener(
						commandStackListener);
			}
			editingDomain = editingDomainController
					.getEditingDomain(selectedTextItem);
			editingDomain.getCommandStack().addCommandStackListener(
					getCommandStackListener());
			if (!selfSelecting) {
				if (selection == null) {
					/* implementation not shown */
				} else {

				}
			}
			if (selection instanceof BTSWord) {
				setSentenceTranslation((BTSWord) selection);
			} else if (selection instanceof BTSSenctence) {
				setSentenceTranslation((BTSSenctence) selection);
			}
			// if (selection instanceof BTSSentenceItem) {
			// setSentenceItemSelection((BTSSentenceItem) selection);
			// FIXME direkt �ber editor, nicht �ber annotationmodel,
			// funktioniert daher nicht zuverl�ssig
			// }
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
								setDirtyInternal();
							}
						} else {
							// undo executed
							if (localCommandCacheSet.remove(mostRecentCommand)
									&& localCommandCacheSet.isEmpty()) {
								dirty.setDirty(false);
							} else if (!dirty.isDirty()) {
								setDirtyInternal();
							}
						}
					}

				}
			};
		}
		return commandStackListener;
	}

	private void setSentenceItemSelection(BTSSentenceItem sentenceItem) {
		if (sentenceItem != null) {
			if (!sentenceItem.equals(selectedSentenceItem)) {
				BTSSentenceItem oldSelectedItem = selectedSentenceItem;
				setSentenceItemDeselected(oldSelectedItem);
				selectedSentenceItem = sentenceItem;
				setSentenceItemSelected(selectedSentenceItem);
			}
		}

	}

	private void setSentenceItemSelected(BTSSentenceItem selectedItem) {
		if (selectionRange != null) {
		embeddedEditor.getViewer().getTextWidget()
				.replaceStyleRanges(selectionRange.start,
							selectionRange.length, preSelectionRanges);
		}
		ModelAnnotation annotation = getModelAnnotationAtModelObject(selectedItem);
		if (annotation != null) {
			Position pos = embeddedEditor.getViewer().getAnnotationModel()
					.getPosition(annotation);
			int start = pos.getOffset() - 1;
			int len = pos.getLength();
			selectionRange = new StyleRange(start, len,
 null,
					BTSUIConstants.COLOR_SUBTEXT);
			preSelectionRanges = embeddedEditor.getViewer().getTextWidget()
					.getStyleRanges(start, len);
			embeddedEditor.getViewer().getTextWidget()
					.setStyleRange(selectionRange);
		}
		
	}

	private ModelAnnotation getModelAnnotationAtModelObject(
			BTSSentenceItem selectedItem) {
		return modelAnnotationMap.get(selectedItem.get_id());
	}

	private void setSentenceItemDeselected(BTSSentenceItem oldSelectedItem) {
		// TODO Auto-generated method stub

	}

	private void setSentenceTranslation(BTSSenctence sentence) {
		if (sentence != null && !sentence.equals(selectedSentence)) {
			BTSSenctence oldSentence = selectedSentence;
			selectedSentence = sentence;
			if (selectedSentence.getTranslation() == null) {
				selectedSentence.setTranslation(BtsmodelFactory.eINSTANCE
						.createBTSTranslations());
			}
			sentenceTranslate_Editor.load(selectedSentence.getTranslation(),
					editingDomain, false);
		}

	}

	private void setSentenceTranslation(BTSWord word) {
		if (word != null) {
			BTSSenctence sentence = null;
			if (word.eContainer() instanceof BTSSenctence) {
				sentence = (BTSSenctence) word.eContainer();
			} else if (word.eContainer() instanceof BTSLemmaCase) {
				EObject container = word.eContainer();
				if (word.eContainer() instanceof BTSAmbivalence) {
					EObject containerParent = container.eContainer();
					if (containerParent.eContainer() instanceof BTSSenctence) {
						sentence = (BTSSenctence) containerParent.eContainer();
					}
				}
			}
			setSentenceTranslation(sentence);
		}

	}

	private void loadInput(BTSCorpusObject o)
	{
		if (tabFolder != null && o instanceof BTSText)
		{

			this.text = (BTSText) o;
			Job job = new Job("load children")
			{

				@Override
				protected IStatus run(IProgressMonitor monitor)
				{
					relatingObjects = textEditorController.getRelatingObjects(text);
					relatingObjectsMap = textEditorController.fillRelatingObjectsMap(relatingObjects);
					queryId = "relations.objectId-" + text.get_id();
					return Status.OK_STATUS;
				}
			};
			// Start the Job
			job.schedule();
			try {
				job.join();
				if (relatingObjects != null && !relatingObjects.isEmpty())
				{
					eventBroker.post(BTSUIConstants.EVENT_TEXT_RELATING_OBJECTS_LOADED, relatingObjects);
				}
			} catch (InterruptedException e) {
				logger.error(e);
			}

			switch (tabFolder.getSelectionIndex())
			{
				case 0:
				{
					loadInputTranscription(text, relatingObjects);
					break;
				}
				case 1:
				{
					loadInputSignText(text, relatingObjects, relatingObjectsMap);
					break;
				}
				case 2:
				{
					loadInputJSesh(text, relatingObjects);
					break;
				}
			}

			//			plainTextEditor.setText(((BTSText) o).getCode());
		} else if (tabFolder != null && o == null)
		{
				purgeCache();
			this.text = null;
			relatingObjects = null;
			switch (tabFolder.getSelectionIndex()) {
			case 0: {
				loadInputTranscription(text, relatingObjects);
				break;
			}
			case 1: {
				loadInputSignText(text, relatingObjects, relatingObjectsMap);
				break;
			}
			case 2: {
				loadInputJSesh(text, relatingObjects);
				break;
			}
			}
		}

	}

	private void loadInputSignText(BTSText text2, List<BTSObject> localRelatingObjects, Map<String, List<BTSInterTextReference>> relatingObjectsMap2)
	{
		// if (text2 == null || text2.getTextContent() == null
		// || text2.getTextContent().getTextItems().isEmpty())
		// text2 = createMockUp(text2);
		signTextEditor.setInput(text2, localRelatingObjects, relatingObjectsMap2);

	}

	private BTSText createMockUp(BTSText text2) {
		if (text2 == null) {
			text2 = BtsCorpusModelFactory.eINSTANCE.createBTSText();
		}
		if (text2.getTextContent() == null) {
			text2.setTextContent(BtsCorpusModelFactory.eINSTANCE
					.createBTSTextContent());
		}
		BTSSenctence sentence = BtsCorpusModelFactory.eINSTANCE.createBTSSenctence();

		for (int i = 0; i < 20; i++) {
			BTSWord w = BtsCorpusModelFactory.eINSTANCE.createBTSWord();
			w.setWChar(i + "hh");
			BTSGraphic g = BtsCorpusModelFactory.eINSTANCE.createBTSGraphic();
			g.setCode("n-s-t");
			w.getGraphics().add(g);
			sentence.getSentenceItems().add(w);
		}
		text2.getTextContent().getTextItems().add(sentence);

		return text2;
	}

	private void purgeCache()
	{

		selectedSentence = null;
		modelAnnotationMap = new HashMap<String, ModelAnnotation>();
		relatingObjectsAnnotationMap = new HashMap<EObject, List<ModelAnnotation>>();
		localCommandCacheSet.clear();
		if (relatingObjectsMap != null)
		{
			relatingObjectsMap.clear();
		}
	}

	@Focus
	public void setFocus()
	{
		if (tabFolder != null)
		{
		switch (tabFolder.getSelectionIndex()) {
		case 0: {
			embeddedEditor.getViewer().getControl().setFocus();
			break;
		}
		case 1: {
			signTextEditor.setFocus();
			break;
		}
		case 2: {
			break;
		}
		}
		evaluationController
				.activateDBCollectionContext(BTSPluginIDs.PREF_MAIN_CORPUS_KEY);
		}
	}

	@Persist
	public boolean save()
	{
		if (text != null && dirty.isDirty())
		{
			localCommandCacheSet.clear();
			switch (tabFolder.getSelectionIndex())
			{
			case 0: {
				updateModelFromTranscription();
				break;
			}
			case 1: {
				updateModelFromSignText();
				break;
			}
			case 2: {
				updateModelFromJSesh();
				break;
			}
			}
			boolean success = textEditorController.save(this.text);
			dirty.setDirty(!success);
			return success;
		}
		return true;
	}

	@Override
	public void setEditorSelection(final Object selection) {
		if (selection != null) {
			selfSelecting = true;
			sync.asyncExec(new Runnable() {
				public void run() {
					// workaround because selection service requires iniating
					// part to be the active part
					// see some bug of e4
					MPart p = partService
							.findPart("org.bbaw.bts.ui.corpus.egy.part.textEditor");
					MPart activePart = partService.getActivePart();
					boolean workaround = false;
					if (!activePart.equals(p)) {
						workaround = true;
						partService.activate(p);
					}
					selectionService.setSelection(selection);
//					processEditorSelection(selection);
					if (workaround) {
						partService.activate(activePart);
					}
				}
			});

		}
	}

	@Override
	public void handleEvent(Event event) {
		// System.out.println(arg0);
		if (event.getTopic().startsWith("event_text_selection/"))
		{
			eventReceivedCaretEvents(event.getTopic());
			return;
		}
		switch(event.getTopic())
		{
		case "event_text_relating_objects/loaded" :
		{
			break;
		}
		case "event_relating_objects/selected" :
		{
			eventReceivedRelatingObjectsLoadedEvents(event.getProperty("org.eclipse.e4.data"));
			break;
		}
		}
		

	}
	@Inject
	@Optional
	void eventReceivedRelatingObjectsLoadedEvents(
			@EventTopic("event_relating_objects/*") Object event) {

		if (event != null && event instanceof List) {
			List<ModelAnnotation> annotations = new Vector<ModelAnnotation>(((List)event).size());
			for (Object o : (List)event)
			{
				if (o instanceof BTSObject)
				{
					List<ModelAnnotation> a = relatingObjectsAnnotationMap.get(o);
					if (a != null)
					{
						annotations.addAll(a);
					}
				}
			}
			if (!annotations.isEmpty())
			{
				processSelection(annotations, false, null);
			}
		}
	}
	
	@Inject
	@Optional
	void eventReceivedUpdates(@EventTopic("model_update/*") BTSModelUpdateNotification notification)
	{
		logger.info("EgyTextEditorPart eventReceivedUpdates. object: " + notification);
		if (notification.getQueryIds() != null){
			for (String id : notification.getQueryIds())
			{
				if (id.equals(queryId))
				{
					processModelUpdate(notification, id);
				}
			}
		}
		
		
	}

	private void processModelUpdate(BTSModelUpdateNotification notification,
			String id) {
		if (relatingObjects != null && !relatingObjects.contains(notification.getObject()))
		{
			relatingObjects.add((BTSObject) notification.getObject());
		}
		else
		{
		}
		switch (tabFolder.getSelectionIndex())
		{
			case 0:
			{
				addAnnotationToTranscription(notification);
				break;
			}
			case 1:
			{
				addAnnotationToSignText(notification);
				break;
			}
			case 2:
			{
//				addAnnotationToJSesh(notification);
				break;
			}
		}
		
	}

	private void addAnnotationToSignText(BTSModelUpdateNotification notification) {
		signTextEditor.addRelatingObjectNotification(notification);
		
	}

	private void addAnnotationToTranscription(
			BTSModelUpdateNotification notification) {
		List<ModelAnnotation> mas = relatingObjectsAnnotationMap
				.get(notification.getObject());
		BTSObject object = (BTSObject) notification.getObject();
		// remove old annotations
		if (mas != null) {
			for (ModelAnnotation ma : mas)
			{
				annotationModel.removeAnnotation(ma);
			}
		}
			
		// relObject ist neu
		for (BTSRelation rel : object.getRelations()) {
			if (rel.getObjectId() != null
					&& rel.getObjectId().equals(text.get_id())) {
				for (BTSInterTextReference ref : rel.getParts()) {
						Position pos = null;
						if (ref.getBeginId() != null
								&& ref.getBeginId().equals(ref.getEndId())) {
							ModelAnnotation ma1 = modelAnnotationMap.get(ref
									.getBeginId());
							pos = annotationModel.getPosition(ma1);
						} else {
							ModelAnnotation ma1 = modelAnnotationMap.get(ref
									.getBeginId());
							ModelAnnotation ma2 = modelAnnotationMap.get(ref
									.getEndId());
							pos = annotationModel.getPosition(ma1);
							Position pos2 = annotationModel.getPosition(ma2);
							pos.setLength((pos2.getOffset() - pos.getOffset())
									+ pos2.getLength());
						}
						Issue issue;
						issue = new Issue.IssueImpl();
						Annotation annotation = makeAnnotation(object, issue,
								ref);
						if (annotation != null && pos != null)
						{
							annotationModel.addAnnotation(annotation, pos);
						}
//					}
				}
			}
		}

		painter.modelChanged(annotationModel);
	}

	private Annotation makeAnnotation(BTSObject object, Issue issue, BTSInterTextReference ref) {
		ModelAnnotation ta = null;
		if (object instanceof BTSAnnotation) {
			if (((BTSAnnotation) object).getType() != null && ((BTSAnnotation) object).getType().equalsIgnoreCase(
					"rubrum")) {
				ta = new AnnotationAnnotation(
						embeddedEditor.getDocument(),
						AnnotationAnnotation.TYPE_RUBRUM, issue,
						object,
						(BTSAnnotation) object);
			ta.setInterTextReference(ref);
				addToRelatingObjectAnnotationMap(object, ta);
			}
			ta = new AnnotationAnnotation(
					embeddedEditor.getDocument(),
					AnnotationAnnotation.TYPE, issue,
					object,
					(BTSAnnotation) object);
			ta.setInterTextReference(ref);
			addToRelatingObjectAnnotationMap(object, ta);


		} else if (object instanceof BTSComment) {
			ta = new CommentAnnotation(
					embeddedEditor.getDocument(), issue,
					object,
					(BTSComment) object);
			ta.setInterTextReference(ref);


			ta.setText("Comment Annotation --> here is a comment on this word.");
			addToRelatingObjectAnnotationMap(object, ta);


		} else if (object instanceof BTSText) {
			if (((BTSText) object).getType().equalsIgnoreCase(
					"subtext")) {
			ta = new SubtextAnnotation(
					embeddedEditor.getDocument(), issue,
					object,
					(BTSText) object);
			ta.setInterTextReference(ref);
			addToRelatingObjectAnnotationMap(object, ta);
			}
		}
		return ta;
	}
}
