package org.bbaw.bts.ui.egy.parts;

import java.awt.Dimension;
import java.awt.Frame;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import jsesh.editor.JMDCEditor;

import org.bbaw.bts.btsmodel.BTSAmbivalence;
import org.bbaw.bts.btsmodel.BTSCorpusObject;
import org.bbaw.bts.btsmodel.BTSGraphic;
import org.bbaw.bts.btsmodel.BTSLemmaCase;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.BTSSenctence;
import org.bbaw.bts.btsmodel.BTSSentenceItem;
import org.bbaw.bts.btsmodel.BTSText;
import org.bbaw.bts.btsmodel.BTSWord;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.core.corpus.controller.partController.BTSTextEditorController;
import org.bbaw.bts.corpus.text.egy.egyDsl.TextContent;
import org.bbaw.bts.corpus.text.egy.ui.internal.EgyDslActivator;
import org.bbaw.bts.ui.commons.text.BTSAnnotationAnnotation;
import org.bbaw.bts.ui.commons.text.BTSCommentAnnotation;
import org.bbaw.bts.ui.commons.text.BTSLemmaAnnotation;
import org.bbaw.bts.ui.commons.text.BTSModelAnnotation;
import org.bbaw.bts.ui.commons.text.BTSSubtextAnnotation;
import org.bbaw.bts.ui.commons.text.IBTSEditor;
import org.bbaw.bts.ui.commons.utils.BTSUIConstants;
import org.bbaw.bts.ui.egy.parts.egyTextEditor.AnnotationDrawingStrategy;
import org.bbaw.bts.ui.egy.parts.egyTextEditor.BTSTextXtextEditedResourceProvider;
import org.bbaw.bts.ui.egy.parts.egyTextEditor.CommentDrawingStrategy;
import org.bbaw.bts.ui.egy.parts.egyTextEditor.EgyLineNumberRulerColumn;
import org.bbaw.bts.ui.egy.parts.egyTextEditor.RubrumDrawingStrategy;
import org.bbaw.bts.ui.egy.parts.egyTextEditor.SubtextdrawingStrategy;
import org.bbaw.bts.ui.egy.parts.egyTextEditor.TextModelHelper;
import org.bbaw.bts.ui.egy.parts.egyTextEditor.model.AnnotationAnnotation;
import org.bbaw.bts.ui.egy.parts.egyTextEditor.model.CommentAnnotation;
import org.bbaw.bts.ui.egy.parts.egyTextEditor.model.LemmaAnnotation;
import org.bbaw.bts.ui.egy.parts.egyTextEditor.model.ModelAnnotation;
import org.bbaw.bts.ui.egy.parts.egyTextEditor.model.SubtextAnnotation;
import org.bbaw.bts.ui.egy.textSign.SignTextComposite;
import org.bbaw.bts.ui.font.BTSFontManager;
import org.eclipse.e4.core.commands.ECommandService;
import org.eclipse.e4.core.commands.EHandlerService;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.EventTopic;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.di.UISynchronize;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.services.EContextService;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.services.internal.events.EventBroker;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.Document;
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
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
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

import e4.test.helper.StaticAccess;

public class EgyTextEditorPart implements IBTSEditor, EventHandler
{

	@Inject
	private BTSFontManager fontManager;

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

	private static final String FONT_NAME = "FreeSans";
	private static final int SIZE = 10;

	private static final int EDITOR_PREFIX_LENGTH = 1;

	private static final Color COLOR_ANNOTATTION = new Color(
			Display.getDefault(), 0, 0, 0);

	private static final Color COLOR_COMMENT = new Color(Display.getDefault(),
			255, 182, 0);

	private static final Color COLOR_SUBTEXT = new Color(Display.getDefault(),
			10, 30, 255);

	private static final Color COLOR_LEMMA = new Color(Display.getDefault(),
			228, 255, 255);

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

	private BTSTextXtextEditedResourceProvider resourceProvider = new BTSTextXtextEditedResourceProvider();

	private EmbeddedEditor embeddedEditor;

	private Composite embeddedEditorComp;

	private EmbeddedEditorModelAccess embeddedEditorModelAccess;

	private Composite embeddedEditorParentComp;

	protected TextModelHelper textModelHelper = new TextModelHelper();

	private AnnotationPainter painter;

	private CompositeRuler ruler;

	private OverviewRuler oruler;

	private boolean selfSelecting;

	private Text sentenceTranslate_text;

	private BTSSenctence selectedSentence;

	private BTSSentenceItem selectedSentenceItem;

	private Map<EObject, ModelAnnotation> modelAnnotationMap;

	private StyleRange selectionRange;

	protected Object selectedTextItem;

	private StyleRange[] preSelectionRanges;

	/**
	 * @param parent
	 */
	@PostConstruct
	public void createComposite(Composite parent)
	{
		parent.setLayout(new GridLayout());
		new Shell();
		contextService
				.activateContext("org.eclipse.ui.contexts.dialogAndWindow");
		eventBroker.subscribe("event_text_selection/*", this);
		System.out.println("EgyEditor postconstruct");

		SashForm sashForm = new SashForm(parent, SWT.VERTICAL);
		sashForm.setLayoutData(new GridData(GridData.FILL_BOTH));
		sashForm.setLayout(new GridLayout());
		Composite composite = new Composite(sashForm, SWT.NONE);
		composite.setLayoutData(new GridData(GridData.FILL_BOTH));
		composite.setLayout(new GridLayout());
		{
			tabFolder = new CTabFolder(composite, SWT.BORDER | SWT.BOTTOM);
			tabFolder.setLayoutData(new GridData(GridData.FILL_BOTH));
			tabFolder.setLayout(new GridLayout());
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
								loadInputTranscription(text);
								break;
							}
							case 1:
							{
							
								loadInputSignText(text);
								break;
							}
							case 2:
							{
								loadInputJSesh(text);
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
					StaticAccess sa = context.get(StaticAccess.class);
					EgyDslActivator activator = EgyDslActivator.getInstance();
					Injector injector = activator
							.getInjector(EgyDslActivator.ORG_BBAW_BTS_CORPUS_TEXT_EGY_EGYDSL);
					embeddedEditorFactory = injector
							.getInstance(EmbeddedEditorFactory.class);
					loadInputTranscription(null);
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
		sentenceTranslate_text = new Text(sentenceTranslateComp, SWT.WRAP
				| SWT.MULTI | SWT.V_SCROLL | SWT.BORDER);
		sentenceTranslate_text.setLayoutData(new GridData(SWT.FILL, SWT.FILL,
				true, true));
		sentenceTranslateComp.layout();
		sashForm.setWeights(new int[] { 6, 1 });
		parent.layout();
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

	protected void loadInputJSesh(BTSText text2)
	{
		String jseshMdc = textEditorController
				.transformTextToJSeshMdCString(text2);
		System.out.println(jseshMdc);
		jseshEditor.setMDCText("loadInputJSesh " + jseshMdc);

	}

	protected void loadInputTranscription(BTSText localtext)
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

		Button b = new Button(embeddedEditorComp, SWT.NONE);
		b.setText("Save");
		b.addSelectionListener(new SelectionListener() {


			@Override
			public void widgetSelected(SelectionEvent e) {
				save();

			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub

			}
		});
		Button b2 = new Button(embeddedEditorComp, SWT.NONE);
		b2.setText("Test");
		b2.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				System.out.println("hhhh");
				eventBroker.post("event_text_selection/next", e);

			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {

			}
		});
		Document doc = new Document();
		this.document = doc;

		IAnnotationModel model = new AnnotationModel();
		this.annotationModel = model;
		textEditorController.transformToDocument(text, doc, model);

		embeddedEditor = embeddedEditorFactory.newEditor(resourceProvider)
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
		IAnnotationModel am = embeddedEditor.getViewer().getAnnotationModel();

		loadAnnotations2Editor(am, model);

		configureEditorDrawingStrategies();
		embeddedEditorParentComp.layout();
		embeddedEditor.getViewer().getControl().setFocus();

		ruler = embeddedEditorFactory.getCpAnnotationRuler();
		ruler.setModel(am);
		ruler.update();
		ruler.relayout();

		oruler = embeddedEditorFactory.getOverViewRuler();
		oruler.addAnnotationType(BTSAnnotationAnnotation.TYPE);
		oruler.setAnnotationTypeLayer(BTSAnnotationAnnotation.TYPE, 3);
		oruler.setAnnotationTypeColor(BTSAnnotationAnnotation.TYPE,
				COLOR_ANNOTATTION);

		oruler.addAnnotationType(BTSCommentAnnotation.TYPE);
		oruler.setAnnotationTypeLayer(BTSCommentAnnotation.TYPE, 2);
		oruler.setAnnotationTypeColor(BTSCommentAnnotation.TYPE, COLOR_COMMENT);

		oruler.addAnnotationType("org.eclipse.xtext.ui.editor.error");
		oruler.setAnnotationTypeLayer("org.eclipse.xtext.ui.editor.error", 10);
		oruler.setAnnotationTypeColor("org.eclipse.xtext.ui.editor.error",
				new Color(Display.getDefault(), new RGB(255, 0, 0)));

		oruler.addAnnotationType("org.eclipse.xtext.ui.editor.warning");
		oruler.setAnnotationTypeLayer("org.eclipse.xtext.ui.editor.warning", 1);
		oruler.setAnnotationTypeColor("org.eclipse.xtext.ui.editor.warning",
				new Color(Display.getDefault(), new RGB(235, 235, 10)));

		oruler.setModel(am);
		oruler.update();

		embeddedEditorParentComp.layout();
		embeddedEditor.getViewer().getTextWidget()
				.addCaretListener(new CaretListener() {


					@Override
					public void caretMoved(CaretEvent event) {
						System.out.println(event);
						ModelAnnotation annotation = getModelAnnotationAtCaretOffset(event.caretOffset);
						if (annotation != null
								&& annotation.getModelObject() != null
								&& annotation.getModelObject() instanceof BTSObject
								&& !annotation.getModelObject().equals(
										selectedTextItem)) {
							setSelection((BTSObject) annotation
									.getModelObject());
						}
					}
				});
		LineNumberRulerColumn lineNumberRulerColumn = new EgyLineNumberRulerColumn(
				LINE_SPACE);
		lineNumberRulerColumn.setModel(am);
		embeddedEditor.getViewer()
				.addVerticalRulerColumn(lineNumberRulerColumn);

	}

	private ModelAnnotation getModelAnnotationAtCaretOffset(int caretOffset) {
		Iterator it = embeddedEditor.getViewer().getAnnotationModel()
				.getAnnotationIterator();
		while (it.hasNext()) {
			Annotation a = (Annotation) it.next();
			if (a instanceof ModelAnnotation) {
				Position pos = embeddedEditor.getViewer().getAnnotationModel()
						.getPosition(a);
				if (pos.getOffset() <= caretOffset
						&& caretOffset <= pos.getOffset() + pos.getLength()) {
					return (ModelAnnotation) a;

				}
			}
		}
		return null;
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
		painter.setAnnotationTypeColor(LemmaAnnotation.TYPE, COLOR_LEMMA);
		painter.addAnnotationType(LemmaAnnotation.TYPE, LemmaAnnotation.TYPE);



		// comment
		CommentDrawingStrategy commentStrategy = new CommentDrawingStrategy();
		painter.addDrawingStrategy(CommentAnnotation.TYPE, commentStrategy);
		painter.setAnnotationTypeColor(CommentAnnotation.TYPE, COLOR_COMMENT);
		painter.addAnnotationType(CommentAnnotation.TYPE,
				CommentAnnotation.TYPE);

		// subtext
		SubtextdrawingStrategy subtextStrategy = new SubtextdrawingStrategy();
		painter.addDrawingStrategy(SubtextAnnotation.TYPE, subtextStrategy);
		painter.setAnnotationTypeColor(SubtextAnnotation.TYPE, COLOR_SUBTEXT);
		painter.addAnnotationType(SubtextAnnotation.TYPE,
				SubtextAnnotation.TYPE);
		
		// Annotation
		AnnotationDrawingStrategy annotationStrategy = new AnnotationDrawingStrategy();
		painter.addDrawingStrategy(AnnotationAnnotation.TYPE,
				annotationStrategy);
		painter.setAnnotationTypeColor(AnnotationAnnotation.TYPE,
				COLOR_ANNOTATTION);
		painter.addAnnotationType(AnnotationAnnotation.TYPE,
				AnnotationAnnotation.TYPE);

		// Annotation
		RubrumDrawingStrategy rubrumStrategy = new RubrumDrawingStrategy();
		painter.addDrawingStrategy(AnnotationAnnotation.TYPE_RUBRUM,
				rubrumStrategy);
		painter.setAnnotationTypeColor(AnnotationAnnotation.TYPE_RUBRUM,
				COLOR_ANNOTATTION);
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
			if (a instanceof BTSLemmaAnnotation) {
				if (((BTSLemmaAnnotation) a).getModel() instanceof BTSWord) {
					LemmaAnnotation ta = new LemmaAnnotation(
							embeddedEditor.getDocument(), issue,
							((BTSLemmaAnnotation) a).getModel());
					Position pos = model.getPosition((Annotation) a);
					Position pos2 = new Position(pos.getOffset()
							+ EDITOR_PREFIX_LENGTH, pos.getLength());
					editorModel.addAnnotation((Annotation) ta, pos2);
					modelAnnotationMap.put((EObject) ta.getModelObject(), ta);
				}
			} else if (a instanceof BTSAnnotationAnnotation) {
				if (((BTSAnnotationAnnotation) a).getType().equals(
						AnnotationAnnotation.TYPE_RUBRUM)) {
					AnnotationAnnotation ta = new AnnotationAnnotation(
							embeddedEditor.getDocument(),
							((BTSAnnotationAnnotation) a).getType(), issue,
							((BTSAnnotationAnnotation) a).getModel(),
							((BTSAnnotationAnnotation) a).getAnnotation());
					Position pos = model.getPosition((Annotation) a);
					Position pos2 = new Position(pos.getOffset()
							+ EDITOR_PREFIX_LENGTH, pos.getLength());
					editorModel.addAnnotation((Annotation) ta, pos2);
				}
				AnnotationAnnotation ta = new AnnotationAnnotation(
						embeddedEditor.getDocument(), issue,
						((BTSAnnotationAnnotation) a).getModel(),
						((BTSAnnotationAnnotation) a).getAnnotation());
				Position pos = model.getPosition((Annotation) a);
				Position pos2 = new Position(pos.getOffset()
						+ EDITOR_PREFIX_LENGTH, pos.getLength());
				editorModel.addAnnotation((Annotation) ta, pos2);

			} else if (a instanceof BTSCommentAnnotation) {
				CommentAnnotation ta = new CommentAnnotation(
						embeddedEditor.getDocument(), issue,
						((BTSCommentAnnotation) a).getModel(),
						((BTSCommentAnnotation) a).getComment());
				ta.setText("Comment Annotation --> here is a comment on this word.");
				Position pos = model.getPosition((Annotation) a);
				Position pos2 = new Position(pos.getOffset()
						+ EDITOR_PREFIX_LENGTH, pos.getLength());
				editorModel.addAnnotation((Annotation) ta, pos2);

			} else if (a instanceof BTSSubtextAnnotation) {
				SubtextAnnotation ta = new SubtextAnnotation(
						embeddedEditor.getDocument(), issue,
						((BTSSubtextAnnotation) a).getModel(),
						((BTSSubtextAnnotation) a).getSubtext());
				Position pos = model.getPosition((Annotation) a);
				Position pos2 = new Position(pos.getOffset()
						+ EDITOR_PREFIX_LENGTH, pos.getLength());
				editorModel.addAnnotation((Annotation) ta, pos2);

			} else if (a instanceof BTSModelAnnotation) {
				ModelAnnotation ta = new ModelAnnotation(
						embeddedEditor.getDocument(), issue,
						((BTSModelAnnotation) a).getModel());
				Position pos = model.getPosition((Annotation) a);
				Position pos2 = new Position(pos.getOffset(), pos.getLength());
				editorModel.addAnnotation((Annotation) ta, pos2);
				modelAnnotationMap.put((EObject) ta.getModelObject(), ta);
			}
		}

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
		// ohne über annotationmodel zu gehen!!!!!

	}

	@Inject
	void setSelection(@Optional @Named(IServiceConstants.ACTIVE_SELECTION) BTSObject selection)
	{
		if (selection != null && !selection.equals(selectedTextItem)) {
			selectedTextItem = selection;
			if (!selfSelecting) {
				if (selection == null) {
					/* implementation not shown */
				} else {
					if (selection instanceof BTSText) {
						loadInput((BTSCorpusObject) selection);
					} else {
						selfSelecting = false;
					}

				}
			}
			if (selection instanceof BTSWord) {
				setSentenceTranslation((BTSWord) selection);
			} else if (selection instanceof BTSSenctence) {
				setSentenceTranslation((BTSSenctence) selection);
			}
			// if (selection instanceof BTSSentenceItem) {
			// setSentenceItemSelection((BTSSentenceItem) selection);
			// FIXME direkt über editor, nicht über annotationmodel,
			// funktioniert daher nicht zuverlässig
			// }
		}
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
					null, COLOR_SUBTEXT);
			preSelectionRanges = embeddedEditor.getViewer().getTextWidget()
					.getStyleRanges(start, len);
			embeddedEditor.getViewer().getTextWidget()
					.setStyleRange(selectionRange);
		}
		
	}

	private ModelAnnotation getModelAnnotationAtModelObject(
			BTSSentenceItem selectedItem) {
		return modelAnnotationMap.get(selectedItem);
	}

	private void setSentenceItemDeselected(BTSSentenceItem oldSelectedItem) {
		// TODO Auto-generated method stub

	}

	private void setSentenceTranslation(BTSSenctence sentence) {
		if (sentence != null && !sentence.equals(selectedSentence)) {
			BTSSenctence oldSentence = selectedSentence;
			if (oldSentence != null) {
				if (oldSentence.getTranslation() == null) {
					oldSentence.setTranslation(BtsmodelFactory.eINSTANCE
							.createBTSTranslations());
				}
				if (!sentenceTranslate_text.getText().equals(
						oldSentence.getTranslation().getTranslation("en"))) {
					oldSentence.getTranslation().setTranslation(
							sentenceTranslate_text.getText(), "en");
				}
			}
			selectedSentence = sentence;
			if (selectedSentence.getTranslation() == null) {
				selectedSentence.setTranslation(BtsmodelFactory.eINSTANCE
						.createBTSTranslations());
			}
			if (selectedSentence.getTranslation().getTranslation("en") != null) {
				sentenceTranslate_text.setText(selectedSentence
						.getTranslation().getTranslation("en"));
			}
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
			if (!o.equals(text))
			{
				purgeCache();
			}
			this.text = (BTSText) o;

			switch (tabFolder.getSelectionIndex())
			{
				case 0:
				{
					loadInputTranscription(text);
					break;
				}
				case 1:
				{
					loadInputSignText(text);
					break;
				}
				case 2:
				{
					loadInputJSesh(text);
					break;
				}
			}

			//			plainTextEditor.setText(((BTSText) o).getCode());
		} else
		{
			// plainTextEditor.setText("");
		}

	}

	private void loadInputSignText(BTSText text2)
	{
		if (text2 == null || text2.getTextContent() == null
				|| text2.getTextContent().getTextItems().isEmpty())
			text2 = createMockUp(text2);
		signTextEditor.setInput(text2);

	}

	private BTSText createMockUp(BTSText text2) {
		if (text2 == null) {
			text2 = BtsmodelFactory.eINSTANCE.createBTSText();
		}
		if (text2.getTextContent() == null) {
			text2.setTextContent(BtsmodelFactory.eINSTANCE
					.createBTSTextContent());
		}
		BTSSenctence sentence = BtsmodelFactory.eINSTANCE.createBTSSenctence();

		for (int i = 0; i < 20; i++) {
			BTSWord w = BtsmodelFactory.eINSTANCE.createBTSWord();
			w.setWChar(i + "hh");
			BTSGraphic g = BtsmodelFactory.eINSTANCE.createBTSGraphic();
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
		modelAnnotationMap = new HashMap<EObject, ModelAnnotation>();
	}

	@Focus
	public void setFocus()
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
		//
	}

	public boolean save()
	{
		switch (tabFolder.getSelectionIndex())
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
		return textEditorController.save(this.text);
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
					if (workaround) {
						partService.activate(activePart);
					}
				}
			});

		}
	}

	@Override
	public void handleEvent(Event arg0) {
		// System.out.println(arg0);
		eventReceivedCaretEvents(arg0.getTopic());

	}

}
