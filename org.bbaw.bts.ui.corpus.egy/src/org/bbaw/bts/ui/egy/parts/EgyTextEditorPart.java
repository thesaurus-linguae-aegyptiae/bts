package org.bbaw.bts.ui.egy.parts;

import java.awt.Dimension;
import java.awt.Frame;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.util.ArrayList;
import java.util.Collections;
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
import org.bbaw.bts.btsmodel.BTSRelation;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.btsviewmodel.BtsviewmodelFactory;
import org.bbaw.bts.btsviewmodel.StatusMessage;
import org.bbaw.bts.commons.BTSConstants;
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
import org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaEntry;
import org.bbaw.bts.corpus.btsCorpusModel.BTSSenctence;
import org.bbaw.bts.corpus.btsCorpusModel.BTSSentenceItem;
import org.bbaw.bts.corpus.btsCorpusModel.BTSText;
import org.bbaw.bts.corpus.btsCorpusModel.BTSWord;
import org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelFactory;
import org.bbaw.bts.corpus.text.egy.egyDsl.TextContent;
import org.bbaw.bts.corpus.text.egy.ui.custom.BTSE4ToGuiceXtextSourceViewerProvider;
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
import org.bbaw.bts.ui.egy.parts.egyTextEditor.BTSTextXtextEditedResourceProvider;
import org.bbaw.bts.ui.egy.parts.egyTextEditor.EgyLineNumberRulerColumn;
import org.bbaw.bts.ui.egy.parts.support.AbstractTextEditorLogic;
import org.bbaw.bts.ui.egy.textSign.SignTextComposite;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
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
import org.eclipse.jface.text.source.CompositeRuler;
import org.eclipse.jface.text.source.IAnnotationAccess;
import org.eclipse.jface.text.source.IAnnotationModel;
import org.eclipse.jface.text.source.OverviewRuler;
import org.eclipse.swt.SWT;
import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.custom.CaretEvent;
import org.eclipse.swt.custom.CaretListener;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.custom.StyleRange;
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
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextSourceViewer;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditor;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorFactory;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorModelAccess;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.eclipse.xtext.validation.Issue;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventHandler;

import com.google.inject.Injector;

public class EgyTextEditorPart extends AbstractTextEditorLogic implements IBTSEditor, EventHandler {


	

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
	private EPartService partService;

	@Inject
	private EditingDomainController editingDomainController;

	@Inject
	private PermissionsAndExpressionsEvaluationController evaluationController;

	private static final int EDITOR_PREFIX_LENGTH = 1;

	private static final int LINE_SPACE = 8;

	private BTSText text;
	private CTabFolder tabFolder;
	private JMDCEditor jseshEditor;

	protected int counter;

	protected boolean loading;

	private Document document;

	private IAnnotationModel annotationModel;

	protected int tabSelection;

	private SignTextComposite signTextEditor;

	private EmbeddedEditorFactory embeddedEditorFactory;

	private Injector injector;

	private BTSTextXtextEditedResourceProvider xtextResourceProvider = new BTSTextXtextEditedResourceProvider();

	private EmbeddedEditor embeddedEditor;

	private Composite embeddedEditorComp;

	private EmbeddedEditorModelAccess embeddedEditorModelAccess;

	private Composite embeddedEditorParentComp;

	private AnnotationPainter painter;

	private CompositeRuler ruler;

	private OverviewRuler oruler;

	private boolean selfSelecting;

	private BTSSenctence selectedSentence;

	private BTSSentenceItem selectedSentenceItem;

	private Map<String, BTSModelAnnotation> modelAnnotationMap;

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
	private List<BTSModelAnnotation> highlightedAnnotations = new Vector<BTSModelAnnotation>(
			4);
	private Map<EObject, List<BTSModelAnnotation>> relatingObjectsAnnotationMap;
	protected String queryId;
	private Map<String, List<BTSInterTextReference>> relatingObjectsMap;
	private CharsetDecoder charsetDecoder;
	private EgyLineNumberRulerColumn lineNumberRulerColumn;

	private HashMap<String, List<Object>> lemmaAnnotationMap;

	private Job processLemmaAnnotionsJob;

	
	@Inject
	public EgyTextEditorPart(EPartService partService) {
		part = partService.findPart(BTSPluginIDs.PART_ID_EGY_TEXTEDITOR);

	}

	/**
	 * @param parent
	 */
	@SuppressWarnings("restriction")
	@PostConstruct
	public void createComposite(Composite parent) {
		this.parent = parent;
		parent.setLayout(new GridLayout());
		((GridLayout) parent.getLayout()).marginHeight = 0;
		((GridLayout) parent.getLayout()).marginWidth = 0;
		contextService
				.activateContext("org.eclipse.ui.contexts.dialogAndWindow");
		// eventBroker.subscribe("event_text_selection/*", this);
		// eventBroker.subscribe("event_relating_objects/*", this);

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
			tabFolder.addSelectionListener(new SelectionAdapter() {

				@Override
				public void widgetSelected(SelectionEvent e) {
					int oldSelection = tabSelection;
					tabSelection = tabFolder.getSelectionIndex();
					if (tabSelection == oldSelection) {
						return;
					} else {
						// update model from old selection editor
						switch (oldSelection) {
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

						// load updated model into selected editor
						switch (tabSelection) {
						case 0: {
							contextService
									.activateContext("org.eclipse.xtext.ui.embeddedTextEditorScope");
							loadInputTranscription(text, relatingObjects);
							break;
						}
						case 1: {

							loadInputSignText(text, relatingObjects,
									relatingObjectsMap);
							break;
						}
						case 2: {
							loadInputJSesh(text, relatingObjects);
							break;
						}
						}
					}

				}
			});

			tabFolder.setSelectionBackground(Display.getCurrent()
					.getSystemColor(
							SWT.COLOR_TITLE_INACTIVE_BACKGROUND_GRADIENT));
			{
				CTabItem tbtmPlaintext2 = new CTabItem(tabFolder, SWT.NONE);
				tbtmPlaintext2.setText("Transliteration");
				{

					embeddedEditorParentComp = new Composite(tabFolder,
							SWT.NONE | SWT.BORDER);
					embeddedEditorParentComp.setLayout(new GridLayout());
					tbtmPlaintext2.setControl(embeddedEditorParentComp);

					embeddedEditorComp = new Composite(
							embeddedEditorParentComp, SWT.None);
					embeddedEditorComp.setLayout(new GridLayout());
					embeddedEditorComp.setLayoutData(new GridData(SWT.FILL,
							SWT.FILL, true, true));

					context.get(StaticAccessController.class);
					EgyDslActivator activator = EgyDslActivator.getInstance();

					injector = activator
							.getInjector(EgyDslActivator.ORG_BBAW_BTS_CORPUS_TEXT_EGY_EGYDSL);
					embeddedEditorFactory = injector
							.getInstance(EmbeddedEditorFactory.class);

					embeddedEditor = embeddedEditorFactory
							.newEditor(xtextResourceProvider)
							.showAnnotations(BTSAnnotationAnnotation.TYPE,
									BTSCommentAnnotation.TYPE,
									"org.eclipse.xtext.ui.editor.error",
									"org.eclipse.xtext.ui.editor.warning")
							.withParent(embeddedEditorComp);
					
					embeddedEditorModelAccess = embeddedEditor
							.createPartialEditor("", "§§", "", false);
					embeddedEditor.getViewer().getTextWidget()
							.setLineSpacing(LINE_SPACE);

					// embeddedEditor.getViewer().getTextWidget().setFont(font);
					// keep the partialEditor as instance var to read / write
					// the edited
					// text
					

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
					painter = new AnnotationPainter(embeddedEditor.getViewer(),
							annotationAccess);
					configureEditorDrawingStrategies(painter);
					embeddedEditor.getViewer().addTextPresentationListener(painter);
					embeddedEditor.getViewer().addPainter(painter);
					
					embeddedEditorParentComp.layout();
					configureEditorRuler();

					context.set(XtextSourceViewer.class, embeddedEditor.getViewer());
					BTSE4ToGuiceXtextSourceViewerProvider.setContext(context);
					
					embeddedEditor.getViewer().getTextWidget()
							.addCaretListener(new CaretListener() {

								@Override
								public void caretMoved(CaretEvent event) {
									processTextSelection(event);
									// get char right of caret and show utf-8
									// code in status line
									if (event.caretOffset < embeddedEditor
											.getViewer().getTextWidget()
											.getText().length()) {
										String sign = embeddedEditor
												.getViewer()
												.getTextWidget()
												.getText(event.caretOffset,
														event.caretOffset);
										if (sign != null && !"".equals(sign)) {
											int lineIndex = embeddedEditor
													.getViewer()
													.getTextWidget()
													.getLineAtOffset(
															event.caretOffset);
											int offset = event.caretOffset
													- embeddedEditor
															.getViewer()
															.getTextWidget()
															.getOffsetAtLine(
																	lineIndex);
											showCurrentSignUnicode(sign,
													lineIndex, offset);
										}
									}
								}
							});
					embeddedEditor.getViewer().getTextWidget()
							.addSelectionListener(new SelectionListener() {

								@Override
								public void widgetSelected(SelectionEvent event) {
									processTextSelection(event);
								}

								@Override
								public void widgetDefaultSelected(
										SelectionEvent e) {
									// TODO Auto-generated method stub

								}
							});
					loadInputTranscription(null, relatingObjects);

					embeddedEditor.getDocument().addDocumentListener(
							new IDocumentListener() {

								@Override
								public void documentChanged(DocumentEvent event) {
									if (!loading) {
										setDirtyInternal();
									}

								}

								@Override
								public void documentAboutToBeChanged(
										DocumentEvent event) {
									// TODO Auto-generated method stub

								}
							});

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

	}

	@SuppressWarnings("restriction")
	private void configureEditorRuler() {
		ruler = embeddedEditorFactory.getCpAnnotationRuler();

		oruler = embeddedEditorFactory.getOverViewRuler();
		oruler.addAnnotationType(BTSAnnotationAnnotation.TYPE);
		oruler.setAnnotationTypeLayer(BTSAnnotationAnnotation.TYPE, 3);
		oruler.setAnnotationTypeColor(BTSAnnotationAnnotation.TYPE,
				BTSUIConstants.COLOR_ANNOTATTION);
		oruler.addAnnotationType(BTSAnnotationAnnotation.TYPE_HIGHLIGHTED);
		oruler.setAnnotationTypeLayer(BTSAnnotationAnnotation.TYPE_HIGHLIGHTED, 5);
		oruler.setAnnotationTypeColor(BTSAnnotationAnnotation.TYPE_HIGHLIGHTED,
				BTSUIConstants.COLOR_ANNOTATTION);
		oruler.addAnnotationType(BTSAnnotationAnnotation.TYPE_RUBRUM);
		oruler.setAnnotationTypeLayer(BTSAnnotationAnnotation.TYPE_RUBRUM, 3);
		oruler.setAnnotationTypeColor(BTSAnnotationAnnotation.TYPE_RUBRUM,
				BTSUIConstants.COLOR_RUBRUM);

		oruler.addAnnotationType(BTSCommentAnnotation.TYPE);
		oruler.setAnnotationTypeLayer(BTSCommentAnnotation.TYPE, 2);
		oruler.setAnnotationTypeColor(BTSCommentAnnotation.TYPE,
				BTSUIConstants.COLOR_COMMENT);
		oruler.addAnnotationType(BTSCommentAnnotation.TYPE_HIGHLIGHTED);
		oruler.setAnnotationTypeLayer(BTSCommentAnnotation.TYPE_HIGHLIGHTED, 4);
		oruler.setAnnotationTypeColor(BTSCommentAnnotation.TYPE_HIGHLIGHTED,
				BTSUIConstants.COLOR_COMMENT);

		oruler.addAnnotationType("org.eclipse.xtext.ui.editor.error");
		oruler.setAnnotationTypeLayer("org.eclipse.xtext.ui.editor.error", 30);
		oruler.setAnnotationTypeColor("org.eclipse.xtext.ui.editor.error",
				new Color(Display.getDefault(), new RGB(255, 0, 0)));

		oruler.addAnnotationType("org.eclipse.xtext.ui.editor.warning");
		oruler.setAnnotationTypeLayer("org.eclipse.xtext.ui.editor.warning", 10);
		oruler.setAnnotationTypeColor("org.eclipse.xtext.ui.editor.warning",
				new Color(Display.getDefault(), new RGB(235, 235, 10)));

		lineNumberRulerColumn = new EgyLineNumberRulerColumn(LINE_SPACE);
		lineNumberRulerColumn.setModel(annotationModel);
		embeddedEditor.getViewer()
				.addVerticalRulerColumn(lineNumberRulerColumn);
	}

	protected void updateModelFromSignText() {
		// TODO Auto-generated method stub

	}

	protected void updateModelFromJSesh() {
		// TODO Auto-generated method stub

	}

	@SuppressWarnings("restriction")
	protected void updateModelFromTranscription() {
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
				text.setTextContent(textEditorController
						.updateModelFromTextContent(text.getTextContent(), eo,
								am));
			}
		}

	}

	protected void loadInputJSesh(BTSText text2,
			List<BTSObject> localRelatingObjects) {
		String jseshMdc = textEditorController
				.transformTextToJSeshMdCString(text2);
		System.out.println(jseshMdc);
		try {
			jseshEditor.setMDCText(jseshMdc);
		} catch (Exception e) {
			logger.error(e);
		}

	}

	protected void loadInputTranscription(BTSText localtext,
			List<BTSObject> localRelatingObjects) {
		text = localtext;
		loading = true;
		lemmaAnnotationMap = new HashMap<String, List<Object>>();
		annotationModel = embeddedEditor.getViewer().getAnnotationModel();

		if (this.document == null) {
			this.document = new Document();
		}
		else
		{
			try {
				annotationModel.disconnect(document);
			} catch (Exception e) {
			}
		}
		
		
		
		// remove old annotations
		List<Annotation> toRemove = new Vector<Annotation>();
//		Iterator i = annotationModel.getAnnotationIterator();
//		while (i.hasNext()) {
//			toRemove.add((Annotation) i.next());
//		}
//		for (Annotation a : toRemove)
//		{
//			annotationModel.removeAnnotation(a);
//		}

		AnnotationModel tempAnnotationModel = new AnnotationModel();
		if (localtext == null) {
			document.set("§§");
			if (relatingObjectsMap != null) {
				relatingObjectsMap.clear();
			}
		} else {
			if (localtext.getTextContent() == null) {
				localtext.setTextContent(BtsCorpusModelFactory.eINSTANCE
						.createBTSTextContent());
			}
			textEditorController.transformToDocument(
					localtext.getTextContent(), document, tempAnnotationModel,
					localRelatingObjects, relatingObjectsMap, lemmaAnnotationMap);
		}

		embeddedEditorModelAccess.updateModel("\r", document.get(), "\r");
//		annotationModel.connect(document);

		loadAnnotations2Editor(annotationModel, tempAnnotationModel);
		
		painter.modelChanged(embeddedEditor.getViewer().getAnnotationModel());
		embeddedEditorParentComp.layout();

		// connect ruler to annotationModel
		ruler.setModel(annotationModel);
		ruler.update();
		ruler.relayout();

		// connect overview ruler to annotationModel
		oruler.setModel(annotationModel);
		oruler.update();

		// FIXME with monitor and cancel if ...
		processLemmaAnnotions(lemmaAnnotationMap);

		loading = false;
	}
	
	private void processLemmaAnnotions(
			final HashMap<String, List<Object>> localLemmaAnnotationMap) {
		// FIXME cache map with text object
		// clear this cache on new selection
		// create command and handler that allows to execute this processing on user demand!
//		processLemmaAnnotionsJob = new Job("Process Lemma Annotation") {
//			
//			@Override
//			protected IStatus run(IProgressMonitor monitor) {
//				for (String lemmaId : localLemmaAnnotationMap.keySet())
//				{
//					if (monitor.isCanceled()) return Status.CANCEL_STATUS;
//					
//					List<Object> list = localLemmaAnnotationMap.get(lemmaId);
//					if (list != null && !list.isEmpty())
//					{
//						BTSLemmaEntry lemma = null;
//						try {
//							lemma = textEditorController.findLemmaEntry(lemmaId, monitor);
//						} catch (Exception e) {
//							e.printStackTrace();
//						}
//						if (lemma != null)
//						{
//							for (Object annotation : list)
//							{
//								if (monitor.isCanceled()) return Status.CANCEL_STATUS;
//								
//								if (annotation instanceof BTSModelAnnotation)
//								{
//									((BTSModelAnnotation) annotation).setRelatingObject(lemma);
//								}
//							}
//						}
//					}
//				}
//				lemmaAnnotationMap = null;
//
//				return Status.OK_STATUS;
//			}
//		};
//		
//		processLemmaAnnotionsJob.schedule();		

	}

	protected void showCurrentSignUnicode(String sign, int lineIndex,
			int caretOffset) {
		StatusMessage sm = BtsviewmodelFactory.eINSTANCE.createInfoMessage();
		charsetDecoder = Charset.forName(BTSConstants.ENCODING).newDecoder();
		byte[] b = sign.getBytes(Charset.forName(BTSConstants.ENCODING));
		ByteBuffer in = ByteBuffer.wrap(b);
		CharBuffer out;
		String codes = "";
		try {
			out = charsetDecoder.decode(in);
			for (int i = 0; i < out.array().length; i++) {
				String str = Integer.toHexString(out.array()[i]).toUpperCase();
				switch (str.length()) {
				case 1:
					str = "000" + str;
					break;
				case 2:
					str = "00" + str;
					break;
				case 3:
					str = "0" + str;
					break;
				default:
					str = str.substring(0, 4);
				}
				codes += "U+" + str + " ";
			}
		} catch (CharacterCodingException e) {
			e.printStackTrace();
		}
		lineIndex = lineIndex +1;
		sm.setMessage("Line: " + lineIndex + ", Column: " + caretOffset
				+ ", UTF-8: " + codes.trim());
		eventBroker.post("status_info/current_text_code", sm);

	}

	protected void processTextSelection(TypedEvent event) {
		BTSTextSelectionEvent btsEvent = new BTSTextSelectionEvent(event);
		// System.out.println("Textselection x y : " + btsEvent.x + " " +
		// btsEvent.y);
		btsEvent.data = text;
		List<BTSModelAnnotation> annotations = getModelAnnotationAtSelection(
				btsEvent.x, btsEvent.y, btsEvent);
		btsEvent.getTextAnnotations().addAll(annotations);
		processSelection(annotations, false, btsEvent);
		selectionService.setSelection(btsEvent);

	}

	protected void processEditorSelection(Object item) {
		TypedEvent event = new TypedEvent(item);
		BTSTextSelectionEvent btsEvent = new BTSTextSelectionEvent(event);
		// System.out.println("Textselection x y : " + btsEvent.x + " " +
		// btsEvent.y);
		btsEvent.data = text;
		List<BTSModelAnnotation> annotations = getModelAnnotationAtSelection(
				btsEvent.x, btsEvent.y, btsEvent);
		btsEvent.getTextAnnotations().addAll(annotations);
		processSelection(annotations, false, btsEvent);
		selectionService.setSelection(btsEvent);

	}

	protected void processSelection(List<BTSModelAnnotation> annotations,
			boolean postSelection, BTSTextSelectionEvent btsEvent) {
		List<BTSModelAnnotation> relatingObjectsAnnotations = new Vector<BTSModelAnnotation>(
				annotations.size());
		for (BTSModelAnnotation ma : annotations) {
			if (ma != null && ma instanceof BTSLemmaAnnotation
					&& ma.getModel() != null
					&& ma.getModel() instanceof BTSObject
					&& !ma.getModel().equals(selectedTextItem)) {
				if (ma.getModel() instanceof BTSWord) {
					setSentenceTranslation((BTSWord) ma.getModel());
				} else if (ma.getModel() instanceof BTSSenctence) {
					setSentenceTranslation((BTSSenctence) ma.getModel());
				}
			} else if (ma instanceof BTSAnnotationAnnotation) {
				relatingObjectsAnnotations.add(ma);
				if (btsEvent != null) {
					btsEvent.getInterTextReferences().add(
							ma.getInterTextReference());
				}
			} else if (ma instanceof BTSCommentAnnotation) {
				relatingObjectsAnnotations.add(ma);
				if (btsEvent != null) {
					btsEvent.getInterTextReferences().add(
							ma.getInterTextReference());
				}
			} else if (ma instanceof BTSSubtextAnnotation) {
				relatingObjectsAnnotations.add(ma);
				if (btsEvent != null) {
					btsEvent.getInterTextReferences().add(
							ma.getInterTextReference());
				}
			}

		}
		List<BTSModelAnnotation> deHighlightedAnnotations = new Vector<BTSModelAnnotation>(
				highlightedAnnotations.size());

		deHighlightedAnnotations.addAll(highlightedAnnotations);
		deHighlightedAnnotations.removeAll(relatingObjectsAnnotations);
		highlightAnnotations(deHighlightedAnnotations, false);

		if (!relatingObjectsAnnotations.isEmpty()) {

			highlightAnnotations(relatingObjectsAnnotations, true);

			List<BTSObject> relSelObjects = new Vector<BTSObject>(
					annotations.size());
			for (BTSModelAnnotation a : relatingObjectsAnnotations) {
				if (a instanceof BTSAnnotationAnnotation) {
					relSelObjects.add((BTSObject) ((BTSAnnotationAnnotation) a)
							.getRelatingObject());
				} else if (a instanceof BTSCommentAnnotation) {
					relSelObjects.add((BTSObject) ((BTSCommentAnnotation) a)
							.getComment());
				} else if (a instanceof BTSSubtextAnnotation) {
					relSelObjects.add((BTSObject) ((BTSSubtextAnnotation) a)
							.getRelatingObject());
				}
			}
			if (btsEvent != null) {
				btsEvent.setRelatingObjects(relSelObjects);
			}
			// if (postSelection){
			// eventBroker.post(
			// BTSUIConstants.EVENT_TEXT_RELATING_OBJECTS_SELECTED,
			// relSelObjects);
			// }
			highlightedAnnotations.addAll(relatingObjectsAnnotations);
			
			try {
				Annotation anno = relatingObjectsAnnotations.get(0);
				final Position pos = annotationModel.getPosition(anno);
				if (pos != null)
				{
					sync.asyncExec(new Runnable() {
						public void run() {
							embeddedEditor.getViewer().revealRange(pos.getOffset(), pos.length);
						}
					});
				}
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// else if (postSelection)
		// {
		// eventBroker.post(
		// BTSUIConstants.EVENT_TEXT_RELATING_OBJECTS_SELECTED,
		// null);
		// }
		painter.modelChanged(annotationModel);
	}

	private void highlightAnnotations(
			List<BTSModelAnnotation> relatingObjectsAnnotations,
			boolean highlighted) {
		for (BTSModelAnnotation a : relatingObjectsAnnotations) {
			a.setHighlighted(highlighted);
		}
	}

	protected void setDirtyInternal() {
		if (text != null && !dirty.isDirty()) {
			dirty.setDirty(true);
		}

	}

	private List<BTSModelAnnotation> getModelAnnotationAtSelection(int start,
			int end, BTSTextSelectionEvent btsEvent) {
		Iterator it = embeddedEditor.getViewer().getAnnotationModel()
				.getAnnotationIterator();
		List<BTSModelAnnotation> annotations = new Vector<BTSModelAnnotation>(4);
		Map<Integer, Annotation> annotationOffsetMap = new HashMap<Integer, Annotation>(4);
		BTSSentenceItem startItem = null;
		int startItemOffeset = 0;
		BTSSentenceItem endItem = null;
		int endItemOffeset = 0;
		List<BTSSentenceItem> textItems = new Vector<BTSSentenceItem>();
		while (it.hasNext()) {
			Annotation a = (Annotation) it.next();
			if (a instanceof BTSModelAnnotation) {
				Position pos = embeddedEditor.getViewer().getAnnotationModel()
						.getPosition(a);
				// System.out.println("pos " + pos.getOffset() + " " +
				// pos.getOffset() + pos.getLength());
				if ((pos.getOffset() <= start && start < pos.getOffset()
						+ pos.getLength())
						|| (pos.getOffset() >= start && pos.getOffset() <= end)) {
					annotationOffsetMap.put(pos.getOffset(), a);
					if (((BTSModelAnnotation) a).getModel() instanceof BTSSentenceItem) {
						BTSSentenceItem item = (BTSSentenceItem) ((BTSModelAnnotation) a)
								.getModel();
						textItems.add(item);
						if (startItem == null
								|| pos.getOffset() < startItemOffeset) {
							startItem = item;
							startItemOffeset = pos.getOffset();
						}
						if (endItem == null
								|| pos.getOffset() + pos.getLength() > endItemOffeset) {
							endItem = item;
							endItemOffeset = pos.getOffset() + pos.getLength();
						}
					}

				}
				// else if (pos.getOffset() >= start && pos.getOffset() <= end)
				// {
				// annotations.add((ModelAnnotation) a);
				//
				// }
			}
		}
		
		// sort keys and add annotations to annotationslist according to the order of their offset
		List<Integer> offsets = new ArrayList<Integer>(annotationOffsetMap.size());
		offsets.addAll(annotationOffsetMap.keySet());
		Collections.sort(offsets);
		for (Integer i : offsets)
		{
			annotations.add((BTSModelAnnotation) annotationOffsetMap.get(i));
		}

		
		if (btsEvent != null) {
			if (startItem != null) {
				btsEvent.setStartId(startItem.get_id());
			}
			if (endItem != null) {
				btsEvent.setEndId(endItem.get_id());
			}
			btsEvent.getSelectedItems().addAll(textItems);
		}
		return annotations;
	}

	

	private void loadAnnotations2Editor(IAnnotationModel editorModel,
			IAnnotationModel model) {
		Iterator i = model.getAnnotationIterator();
		Issue issue;
		issue = new Issue.IssueImpl();
		while (i.hasNext()) {
			Object a = i.next();
			if (a instanceof BTSAnnotationAnnotation)
			{
				System.out.println(((BTSAnnotationAnnotation) a).getType());
			}
			Position pos = model.getPosition((Annotation) a);
			loadSingleAnnotation2Editor(editorModel, (BTSModelAnnotation)a, pos, issue);

		}

	}

	@SuppressWarnings("restriction")
	protected void loadSingleAnnotation2Editor(IAnnotationModel editorModel,
			 BTSModelAnnotation a, Position pos, Issue issue) {
		if (a instanceof BTSLemmaAnnotation) {
			if (((BTSLemmaAnnotation) a).getModel() instanceof BTSWord) {
				Position pos2 = new Position(pos.getOffset()
						+ EDITOR_PREFIX_LENGTH, pos.getLength());
				editorModel.addAnnotation((Annotation) a, pos2);
				modelAnnotationMap.put(
						((BTSIdentifiableItem) a.getModel()).get_id(),
						a);
			}
		} else if (a instanceof BTSAnnotationAnnotation) {
			if (((BTSAnnotationAnnotation) a).getRelatingObject() != null
					&& ((BTSAnnotationAnnotation) a).getRelatingObject()
							.getType() != null
					&& ((BTSAnnotationAnnotation) a).getRelatingObject()
							.getType().equalsIgnoreCase("rubrum")) {

				// Position pos = model.getPosition((Annotation) a);
				Position pos2 = new Position(pos.getOffset()
						+ EDITOR_PREFIX_LENGTH, pos.getLength());
				editorModel.addAnnotation((Annotation) a, pos2);
				addToRelatingObjectAnnotationMap((EObject) a.getRelatingObject(),
						a);
			}
			// Position pos = model.getPosition((Annotation) a);

			Position pos2 = new Position(
					pos.getOffset() + EDITOR_PREFIX_LENGTH, pos.getLength());
			editorModel.addAnnotation((Annotation) a, pos2);
			addToRelatingObjectAnnotationMap((EObject) a.getRelatingObject(), a);

		} else if (a instanceof BTSCommentAnnotation) {
			Position pos2 = new Position(
					pos.getOffset() + EDITOR_PREFIX_LENGTH, pos.getLength());
			editorModel.addAnnotation((Annotation) a, pos2);
			addToRelatingObjectAnnotationMap((EObject) a.getRelatingObject(), a);

		} else if (a instanceof BTSSubtextAnnotation) {

			Position pos2 = new Position(
					pos.getOffset() + EDITOR_PREFIX_LENGTH, pos.getLength());
			editorModel.addAnnotation((Annotation) a, pos2);
			addToRelatingObjectAnnotationMap((EObject) a.getRelatingObject(), a);

		} else if (a instanceof BTSModelAnnotation) {

			// Position pos = model.getPosition((Annotation) a);
			Position pos2 = new Position(pos.getOffset(), pos.getLength());
			editorModel.addAnnotation((Annotation) a, pos2);
			modelAnnotationMap.put(
					((BTSIdentifiableItem) a.getModel()).get_id(), a);
		}

	}

	private void addToRelatingObjectAnnotationMap(EObject object,
			BTSModelAnnotation ma) {
		List<BTSModelAnnotation> l = relatingObjectsAnnotationMap.get(object);
		if (l == null) {
			l = new Vector<BTSModelAnnotation>(2);
			relatingObjectsAnnotationMap.put(object, l);
		}
		l.add(ma);
	}

	@Inject
	@Optional
	void eventReceivedNew(@EventTopic("model_new/BTSWord*") Object object) {
	}

	@Inject
	@Optional
	void eventReceivedCaretEvents(
			@EventTopic("event_text_selection/*") final Object event) {
		if (text != null && event instanceof String && event != null) {
			switch (tabFolder.getSelectionIndex()) {
			case 0: {
				setTextSelectionEvent((String) event);
				break;
			}
			case 1: // signtextEditor
			{
				sync.asyncExec(new Runnable() {
					public void run() {
						signTextEditor.setTextSelectionEvent((String) event);
					}
				});
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
//		embeddedEditor.getViewer().getTextWidget().getCaretOffset();

	}

	@Inject
	public void setSelection(
			@Optional @Named(IServiceConstants.ACTIVE_SELECTION) BTSObject selection) {
		if (selection == null || parent == null || parent.isDisposed()) {
			// do nothing
			return;
		} else if (selection != null && !selection.equals(selectedTextItem)) {

			if (selection instanceof BTSCorpusObject) {
				
				// if a background job is running to process lemma annotations
				// for earlier input object: kill the job
				if (processLemmaAnnotionsJob != null)
				{
					processLemmaAnnotionsJob.cancel();
					processLemmaAnnotionsJob = null;
				}
				// TODO save configurable this is autosave!!!
				if (text != null) {
					if (editingDomain != null) {
						editingDomain.getCommandStack()
								.removeCommandStackListener(
										commandStackListener);
					}
					save();
				}
				if (selection instanceof BTSText) {
					purgeCache();
					loadInput((BTSCorpusObject) selection);
					part.setLabel(selection.getName());
					makePartActive(true);
					bringPartToFront(true);

				} else {
					purgeCache();
					loadInput(null);
					if (part != null) {
						part.setLabel("EgyTextEditor");
					}
					text = null;
					makePartActive(false);
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

	private void makePartActive(boolean activate) {
		embeddedEditor.getViewer().setEditable(activate);
		embeddedEditor.getViewer().getTextWidget().setEnabled(activate);
		signTextEditor.setEnabled(activate);
		jseshEditor.setEnabled(activate);
		sentenceTranslate_Editor.setEnabled(activate);
		tabFolder.setEnabled(activate);
		if (activate)
		{
			embeddedEditor.getViewer().getTextWidget().setBackground(BTSUIConstants.COLOR_WIHTE);
			signTextEditor.setBackground(BTSUIConstants.COLOR_WIHTE);
		}
		else
		{
			embeddedEditor.getViewer().getTextWidget().setBackground(BTSUIConstants.COLOR_BACKGROUND_DISABLED);
			signTextEditor.setBackground(BTSUIConstants.COLOR_BACKGROUND_DISABLED);
		}
		
	}

	private void bringPartToFront(boolean b) {
		partService.bringToTop(part);
		
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
			embeddedEditor
					.getViewer()
					.getTextWidget()
					.replaceStyleRanges(selectionRange.start,
							selectionRange.length, preSelectionRanges);
		}
		BTSModelAnnotation annotation = getModelAnnotationAtModelObject(selectedItem);
		if (annotation != null) {
			Position pos = embeddedEditor.getViewer().getAnnotationModel()
					.getPosition(annotation);
			int start = pos.getOffset() - 1;
			int len = pos.getLength();
			selectionRange = new StyleRange(start, len, null,
					BTSUIConstants.COLOR_SUBTEXT);
			preSelectionRanges = embeddedEditor.getViewer().getTextWidget()
					.getStyleRanges(start, len);
			embeddedEditor.getViewer().getTextWidget()
					.setStyleRange(selectionRange);
		}

	}

	private BTSModelAnnotation getModelAnnotationAtModelObject(
			BTSSentenceItem selectedItem) {
		return modelAnnotationMap.get(selectedItem.get_id());
	}

	private void setSentenceItemDeselected(BTSSentenceItem oldSelectedItem) {
		// TODO Auto-generated method stub

	}

	private void setSentenceTranslation(BTSSenctence sentence) {
		if (sentence != null && !sentence.equals(selectedSentence)) {
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

	private void loadInput(BTSCorpusObject o) {
		if (tabFolder != null && o instanceof BTSText) {

			this.text = (BTSText) o;
			Job job = new Job("load children") {

				@Override
				protected IStatus run(IProgressMonitor monitor) {
					relatingObjects = textEditorController
							.getRelatingObjects(text, monitor);
					for (BTSObject o : relatingObjects)
					{
						if (o instanceof BTSCorpusObject)
						{
							textEditorController.checkAndFullyLoad((BTSCorpusObject) o);
						}
					}
					relatingObjectsMap = textEditorController
							.fillRelatingObjectsMap(relatingObjects);
					queryId = "relations.objectId-" + text.get_id();
					return Status.OK_STATUS;
				}
			};
			// Start the Job
			job.schedule();
			try {
				job.join();
				if (relatingObjects != null && !relatingObjects.isEmpty()) {
					eventBroker.post(
							BTSUIConstants.EVENT_TEXT_RELATING_OBJECTS_LOADED,
							relatingObjects);
				}
			} catch (InterruptedException e) {
				logger.error(e);
			}

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

			// plainTextEditor.setText(((BTSText) o).getCode());
		} else if (tabFolder != null && o == null) {
			purgeCache();
			this.text = null;
			relatingObjects = null;
			switch (tabFolder.getSelectionIndex()) {
			case 0: {
				loadInputTranscription(null, relatingObjects);
				break;
			}
			case 1: {
				loadInputSignText(null, relatingObjects, relatingObjectsMap);
				break;
			}
			case 2: {
				loadInputJSesh(null, relatingObjects);
				break;
			}
			}
		}

	}

	private void loadInputSignText(BTSText localText,
			List<BTSObject> localRelatingObjects,
			Map<String, List<BTSInterTextReference>> relatingObjectsMap2) {
		// if (text2 == null || text2.getTextContent() == null
		// || text2.getTextContent().getTextItems().isEmpty())
		// text2 = createMockUp(text2);
		if (localText != null) {
			signTextEditor.setInput(localText, localText.getTextContent(),
					localRelatingObjects, relatingObjectsMap2);
		} else {
			signTextEditor.setInput(null, null, localRelatingObjects,
					relatingObjectsMap2);
		}
	}

	private BTSText createMockUp(BTSText text2) {
		if (text2 == null) {
			text2 = BtsCorpusModelFactory.eINSTANCE.createBTSText();
		}
		if (text2.getTextContent() == null) {
			text2.setTextContent(BtsCorpusModelFactory.eINSTANCE
					.createBTSTextContent());
		}
		BTSSenctence sentence = BtsCorpusModelFactory.eINSTANCE
				.createBTSSenctence();

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

	private void purgeCache() {

		selectedSentence = null;
		modelAnnotationMap = new HashMap<String, BTSModelAnnotation>();
		relatingObjectsAnnotationMap = new HashMap<EObject, List<BTSModelAnnotation>>();
		localCommandCacheSet.clear();
		if (editingDomain != null) {
			// remove commandstacklistener from old selection
			editingDomain.getCommandStack().removeCommandStackListener(
					commandStackListener);
		}
		if (relatingObjectsMap != null) {
			relatingObjectsMap.clear();
		}
	}

	@Focus
	public void setFocus() {
		if (tabFolder != null && text != null) {
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

		}
		evaluationController
				.activateDBCollectionContext(BTSPluginIDs.PREF_MAIN_CORPUS_KEY);
	}

	@Persist
	public boolean save() {
		if (text != null && dirty.isDirty()) {
			localCommandCacheSet.clear();
			switch (tabFolder.getSelectionIndex()) {
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
			sentenceTranslate_Editor.save();
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
					if (selection instanceof BTSTextSelectionEvent
							&& ((BTSTextSelectionEvent) selection).data instanceof EObject) {
						// remove listener from old editingDomain
						if (editingDomain != null) {
							editingDomain.getCommandStack()
									.removeCommandStackListener(
											commandStackListener);
						}
						// get selected item, add listener to domain
						if (!((BTSTextSelectionEvent) selection)
								.getSelectedItems().isEmpty()) {
							editingDomain = getEditingDomain((EObject) ((BTSTextSelectionEvent) selection)
									.getSelectedItems().get(0));
							editingDomain.getCommandStack()
									.addCommandStackListener(
											getCommandStackListener());
						}

					}
					selectionService.setSelection(selection);
					// processEditorSelection(selection);
					if (workaround) {
						partService.activate(activePart);
					}
				}
			});

		}
	}

	private EditingDomain getEditingDomain(EObject editingObject) {
		return editingDomainController.getEditingDomain(editingObject);
	}

	@Override
	public void handleEvent(Event event) {
		// System.out.println(arg0);
		if (event.getTopic().startsWith("event_text_selection/")) {
			eventReceivedCaretEvents(event.getTopic());
			return;
		}
		switch (event.getTopic()) {
		case "event_text_relating_objects/loaded": {
			break;
		}
		case "event_relating_objects/selected": {
			eventReceivedRelatingObjectsLoadedEvents(event
					.getProperty("org.eclipse.e4.data"));
			break;
		}
		}

	}

	@Inject
	@Optional
	void eventReceivedRelatingObjectsLoadedEvents(
			@EventTopic("event_relating_objects/*") Object event) {

		if (event != null && event instanceof List) {
			List<BTSModelAnnotation> annotations = new Vector<BTSModelAnnotation>(
					((List) event).size());
			for (Object o : (List) event) {
				if (o instanceof BTSObject) {
					List<BTSModelAnnotation> a = relatingObjectsAnnotationMap
							.get(o);
					if (a != null) {
						annotations.addAll(a);
					}
				}
			}
			if (!annotations.isEmpty()) {
				processSelection(annotations, false, null);
			}
		}
	}

	@Inject
	@Optional
	void eventReceivedUpdates(
			@EventTopic("model_update/*") BTSModelUpdateNotification notification) {
		logger.info("EgyTextEditorPart eventReceivedUpdates. object: "
				+ notification);
		if (notification.getQueryIds() != null) {
			for (String id : notification.getQueryIds()) {
				if (id.equals(queryId)) {
					processModelUpdate(notification, id);
				}
			}
		}

	}

	private void processModelUpdate(BTSModelUpdateNotification notification,
			String id) {
		if (relatingObjects != null
				&& !relatingObjects.contains(notification.getObject())) {
			relatingObjects.add((BTSObject) notification.getObject());
		} else {
		}
		switch (tabFolder.getSelectionIndex()) {
		case 0: {
			addAnnotationToTranscription(notification);
			break;
		}
		case 1: {
			addAnnotationToSignText(notification);
			break;
		}
		case 2: {
			// addAnnotationToJSesh(notification);
			break;
		}
		}

	}

	private void addAnnotationToSignText(BTSModelUpdateNotification notification) {
		signTextEditor.addRelatingObjectNotification(notification);

	}

	private void addAnnotationToTranscription(
			BTSModelUpdateNotification notification) {
		List<BTSModelAnnotation> mas = relatingObjectsAnnotationMap
				.get(notification.getObject());
		BTSObject object = (BTSObject) notification.getObject();
		// remove old annotations
		if (mas != null) {
			for (BTSModelAnnotation ma : mas) {
				annotationModel.removeAnnotation(ma);
			}
		}
		if (BTSConstants.OBJECT_STATE_TERMINATED.equals(object.getState()))
		{
			// remove, do nothing
		}
		else
		{

			// relObject ist neu
			for (BTSRelation rel : object.getRelations()) {
				if (rel.getObjectId() != null
						&& rel.getObjectId().equals(text.get_id())) {
					for (BTSInterTextReference ref : rel.getParts()) {
						Position pos = null;
						if (ref.getBeginId() != null
								&& ref.getBeginId().equals(ref.getEndId())) {
							BTSModelAnnotation ma1 = modelAnnotationMap.get(ref
									.getBeginId());
							pos = annotationModel.getPosition(ma1);
						} else {
							BTSModelAnnotation ma1 = modelAnnotationMap.get(ref
									.getBeginId());
							BTSModelAnnotation ma2 = modelAnnotationMap.get(ref
									.getEndId());
							pos = annotationModel.getPosition(ma1);
							Position pos2 = annotationModel.getPosition(ma2);
							pos.setLength((pos2.getOffset() - pos.getOffset())
									+ pos2.getLength());
						}
						Issue issue;
						issue = new Issue.IssueImpl();
						Annotation annotation = makeAnnotation(object, issue, ref);
						if (annotation != null && pos != null) {
							// add 1 for sentence sign length
							annotationModel.addAnnotation(annotation, new Position(pos.getOffset() + 1, pos.getLength()));
						}
						// }
					}
				}
			}
		}

		painter.modelChanged(annotationModel);
	}

	private Annotation makeAnnotation(BTSObject object, Issue issue,
			BTSInterTextReference ref) {
		BTSModelAnnotation ta = null;
		if (object instanceof BTSAnnotation) {
			if (((BTSAnnotation) object).getType() != null
					&& ((BTSAnnotation) object).getType().equalsIgnoreCase(
							"rubrum")) {
				ta = new BTSAnnotationAnnotation(embeddedEditor.getDocument(),
						BTSAnnotationAnnotation.TYPE_RUBRUM, issue, object,
						(BTSAnnotation) object);
				ta.setInterTextReference(ref);
				addToRelatingObjectAnnotationMap(object, ta);
			}
			else
			{
			ta = new BTSAnnotationAnnotation(embeddedEditor.getDocument(),
					BTSAnnotationAnnotation.TYPE, issue, object,
					(BTSAnnotation) object);
			ta.setInterTextReference(ref);
			addToRelatingObjectAnnotationMap(object, ta);
			}

		} else if (object instanceof BTSComment) {
			ta = new BTSCommentAnnotation(BTSCommentAnnotation.TYPE, embeddedEditor.getDocument(), issue,
					object, (BTSComment) object);
			ta.setInterTextReference(ref);

			ta.setText("Comment Annotation --> here is a comment on this word.");
			addToRelatingObjectAnnotationMap(object, ta);

		} else if (object instanceof BTSText) {
			if (((BTSText) object).getType().equalsIgnoreCase("subtext")) {
				ta = new BTSSubtextAnnotation(BTSSubtextAnnotation.TYPE, embeddedEditor.getDocument(), issue,
						object, (BTSText) object);
				ta.setInterTextReference(ref);
				addToRelatingObjectAnnotationMap(object, ta);
			}
		}
		return ta;
	}
}
