 
package org.bbaw.bts.ui.egy.parts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import javax.inject.Inject;
import javax.inject.Named;
import javax.annotation.PostConstruct;

import org.bbaw.bts.btsmodel.BTSIdentifiableItem;
import org.bbaw.bts.btsmodel.BTSInterTextReference;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.commons.BTSPluginIDs;
import org.bbaw.bts.core.commons.staticAccess.StaticAccessController;
import org.bbaw.bts.core.controller.generalController.EditingDomainController;
import org.bbaw.bts.core.controller.generalController.PermissionsAndExpressionsEvaluationController;
import org.bbaw.bts.core.corpus.controller.partController.LemmaEditorController;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAnnotation;
import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject;
import org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaEntry;
import org.bbaw.bts.corpus.btsCorpusModel.BTSSenctence;
import org.bbaw.bts.corpus.btsCorpusModel.BTSSentenceItem;
import org.bbaw.bts.corpus.btsCorpusModel.BTSText;
import org.bbaw.bts.corpus.btsCorpusModel.BTSTextContent;
import org.bbaw.bts.corpus.btsCorpusModel.BTSTextItems;
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
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;

import javax.annotation.PreDestroy;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
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
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.services.internal.events.EventBroker;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.DocumentEvent;
import org.eclipse.jface.text.IDocumentListener;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.jface.text.source.AnnotationModel;
import org.eclipse.jface.text.source.AnnotationPainter;
import org.eclipse.jface.text.source.IAnnotationAccess;
import org.eclipse.jface.text.source.IAnnotationModel;
import org.eclipse.jface.text.source.LineNumberRulerColumn;
import org.eclipse.jface.text.source.AnnotationPainter.ITextStyleStrategy;
import org.eclipse.swt.custom.CaretEvent;
import org.eclipse.swt.custom.CaretListener;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.events.TypedEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Group;
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

public class EgyLemmaEditorPart implements IBTSEditor, EventHandler {
	private static final int LINE_SPACE = 8;
	private static final int EDITOR_PREFIX_LENGTH = 1;

	@Inject
	private IEclipseContext context;

	@Inject
	private EventBroker eventBroker;

	@Inject
	private EPartService partService;

	@Inject
	protected LemmaEditorController lemmaEditorController;

	@Inject
	private MDirtyable dirty;
	
	@Inject
	private ESelectionService selectionService;
	
	@Inject
	private UISynchronize sync;
	
	private EmbeddedEditorFactory embeddedEditorFactory;

	private SignTextComposite signTextEditor;

	private BTSLemmaEntry selectedLemmaEntry;

	private MPart part;

	private List<BTSObject> relatingObjects;
	
	@Inject
	private Logger logger;

	private Map<EObject, List<ModelAnnotation>> relatingObjectsAnnotationMap;

	private Composite embeddedEditorComp;

	private Group grpTransliteration;

	private EmbeddedEditor embeddedEditor;
	
	private EmbeddedEditorModelAccess embeddedEditorModelAccess;

	private IAnnotationModel annotationModel;

	private Map relatingObjectsMap;

	private BTSTextXtextEditedResourceProvider xtextResourceProvider = new BTSTextXtextEditedResourceProvider();
	private Map<String, ModelAnnotation> modelAnnotationMap;
	private AnnotationPainter painter;
	private BTSTextContent textContent;
	private boolean loaded;
	protected TextModelHelper textModelHelper = new TextModelHelper();
	private List<ModelAnnotation> highlightedAnnotations = new Vector<ModelAnnotation>(4);
	protected String queryId;
	
	protected Object selectedTextItem;


	@Inject
	public EgyLemmaEditorPart() {
		
	}
	
	@PostConstruct
	public void postConstruct(Composite parent) {
		parent.setLayout(new GridLayout(1, false));
		
		
		// transliteration
		grpTransliteration = new Group(parent, SWT.NONE);
		grpTransliteration.setLayout(new GridLayout(1, false));
		grpTransliteration.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		grpTransliteration.setText("Transliteration");
		
		Label hintLabel = new Label(grpTransliteration, SWT.None);
		hintLabel.setText("Please use § at beginning and end of words of lemma (as in TextEditor).");
		hintLabel.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
		
		EgyDslActivator activator = EgyDslActivator.getInstance();
		Injector injector = activator
				.getInjector(EgyDslActivator.ORG_BBAW_BTS_CORPUS_TEXT_EGY_EGYDSL);
		embeddedEditorFactory = injector
				.getInstance(EmbeddedEditorFactory.class);
		
//		transliterationEditorComp = new Composite(grpTransliteration,
//				SWT.NONE | SWT.BORDER);
//		transliterationEditorComp.setLayout(new GridLayout());
//		// inititae static access controller
//		EgyDslActivator activator = EgyDslActivator.getInstance();
//		Injector injector = activator
//				.getInjector(EgyDslActivator.ORG_BBAW_BTS_CORPUS_TEXT_EGY_EGYDSL);
//		embeddedEditorFactory = injector
//				.getInstance(EmbeddedEditorFactory.class);
//		loadInputTranscription(null, relatingObjects);
//		
//		
		// sign - text
		Group grpSigntext = new Group(parent, SWT.NONE);
		grpSigntext.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		grpSigntext.setLayout(new GridLayout(1, false));
		grpSigntext.setText("Sign-Text");
		IEclipseContext child = context.createChild();
		child.set(Composite.class, grpSigntext);
		child.set(IBTSEditor.class, EgyLemmaEditorPart.this);
		signTextEditor = ContextInjectionFactory.make(
				SignTextComposite.class, child);
		signTextEditor.setEventBroker(eventBroker);
		signTextEditor.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {

			}
			
			@Override
			public void focusGained(FocusEvent e) {
				updateModelFromTranscription();
				loadSignText();
				
			}
		});
		grpSigntext.layout();
		
		
		// tranlation		
		Group grpTranslation = new Group(parent, SWT.NONE);
		grpTranslation.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		grpTranslation.setText("Translation");
		
		part = partService.findPart(BTSPluginIDs.PART_ID_EGY_LEMMAEDITOR);
		
//		eventBroker.subscribe("event_text_selection/*", this);
//		eventBroker.subscribe("event_relating_objects/*", this);
		loaded = true;
	}
	
	@Inject
	public void setSelection(
			@Optional @Named(IServiceConstants.ACTIVE_SELECTION) final BTSObject selection) {
		if (selection == null) {
			// do nothing
			return;
		} else if (loaded && selection != null && !selection.equals(selectedLemmaEntry)) {
			if (selection instanceof BTSCorpusObject) {
//				if (editingDomain != null) {
//					editingDomain.getCommandStack().removeCommandStackListener(
//							commandStackListener);
//				}
				// TODO save configurable this is autosave!!!
				save();
				purgeCache();

				if (selection instanceof BTSLemmaEntry) {
					Job job = new Job("load children")
					{

						@Override
						protected IStatus run(IProgressMonitor monitor)
						{
							relatingObjects = lemmaEditorController.getRelatingObjects((BTSLemmaEntry) selection);
//							relatingObjectsMap = lemmaEditorController.fillRelatingObjectsMap(relatingObjects);
//							queryId = "relations.objectId-" + text.get_id();
							return Status.OK_STATUS;
						}
					};
					// Start the Job
					job.schedule();
					try {
						job.join();
//						if (relatingObjects != null && !relatingObjects.isEmpty())
//						{
//							eventBroker.post(BTSUIConstants.EVENT_TEXT_RELATING_OBJECTS_LOADED, relatingObjects);
//						}
					} catch (InterruptedException e) {
						logger.error(e);
					}
					selectedLemmaEntry = (BTSLemmaEntry) selection;
					loadInput((BTSLemmaEntry) selection);
					part.setLabel(selection.getName());

				} else {
					loadInput(null);
					part.setLabel("LemmaEditor");

				}
			}
			if ((selection instanceof BTSLemmaEntry)) {
			}
		}
	}
	
	
	private void loadInput(final BTSLemmaEntry selection) {
		
		selectedLemmaEntry = selection;

		loadTransliteration();
		
		loadSignText();
		
		loadTranslation(selection, relatingObjects);
		
	}

	private void loadTransliteration() {
		if (selectedLemmaEntry == null)
		{
			if (embeddedEditor != null)
			{
				embeddedEditor.getViewer().setDocument(null);
			}
			return;
		}
		if (embeddedEditorComp != null)
		{
			embeddedEditorComp.dispose();
			embeddedEditorComp = null;
		}
		embeddedEditorComp = new Composite(grpTransliteration, SWT.BORDER);
		embeddedEditorComp.setLayout(new GridLayout());
		embeddedEditorComp.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				true));

		Document doc = new Document();
		AnnotationModel tempAnnotationModel = new AnnotationModel();
		loadTextContent();
		lemmaEditorController.transformToDocument(textContent, doc, tempAnnotationModel, relatingObjects, relatingObjectsMap);

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
		embeddedEditorModelAccess = embeddedEditor.createPartialEditor("\r",
				doc.get(), "\r", false);
		annotationModel = embeddedEditor.getViewer().getAnnotationModel();

		loadAnnotations2Editor(annotationModel, tempAnnotationModel);
//		annotationModel.connect(doc);
		configureEditorDrawingStrategies();
		grpTransliteration.layout();
		// embeddedEditor.getViewer().getControl().setFocus();

		

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
		embeddedEditor.getViewer().getTextWidget().addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
//				updateModelFromTranscription();
//				loadSignText();
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				System.out.println("focus gained");
				
			}
		});
		if (selectedLemmaEntry != null) {
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
		
	}

	protected void updateModelFromTranscription()
	{
		if (selectedLemmaEntry != null) {
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
				textContent = textModelHelper.updateModelFromTextContent(textContent, eo, am);
				selectedLemmaEntry.getWords().clear();
				List<BTSSentenceItem> items = new Vector<BTSSentenceItem>();
				for (BTSTextItems sen : textContent.getTextItems())
				{
					if (sen instanceof BTSSenctence)
					{
						items.addAll(((BTSSenctence) sen).getSentenceItems());
						
					}
				}
				for (BTSSentenceItem item : items)
				{
					if (item instanceof BTSWord)
					{
						selectedLemmaEntry.getWords().add((BTSWord) item);
					}
				}
			}
		}

	}
	
	protected void processTextSelection(TypedEvent event) {
		BTSTextSelectionEvent btsEvent = new BTSTextSelectionEvent(event);
//		System.out.println("Textselection x y : " + btsEvent.x + " " + btsEvent.y);
		btsEvent.data = selectedLemmaEntry;
		List<ModelAnnotation> annotations = getModelAnnotationAtSelection(btsEvent.x, btsEvent.y, btsEvent);
		btsEvent.getTextAnnotations().addAll(annotations);
		processSelection(annotations, false, btsEvent);
		selectionService.setSelection(btsEvent);
		
	}
	
	protected void processEditorSelection(Object item) {
		TypedEvent event = new TypedEvent(item);
		BTSTextSelectionEvent btsEvent = new BTSTextSelectionEvent(event);
//		System.out.println("Textselection x y : " + btsEvent.x + " " + btsEvent.y);
		btsEvent.data = selectedLemmaEntry;
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
//				if (ma.getModelObject() instanceof BTSWord) {
//					setSentenceTranslation((BTSWord) ma.getModelObject());
//				} else if (ma.getModelObject() instanceof BTSSenctence) {
//					setSentenceTranslation((BTSSenctence) ma.getModelObject());
//				}
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
						if (startItem == null || pos.getOffset() > startItemOffeset)
						{
							startItem = item;
							startItemOffeset = pos.getOffset();
						}
						if (endItem == null || pos.getOffset() + pos.getLength() < endItemOffeset)
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
	protected void setDirtyInternal() {
		if (selectedLemmaEntry != null && !dirty.isDirty()) {
			dirty.setDirty(true);
		}
		
	}

	private void loadSignText() {
		
		loadTextContent();
		signTextEditor.setInput(selectedLemmaEntry, textContent, relatingObjects, relatingObjectsMap);
		
	}

	private void loadTextContent() {
		if(selectedLemmaEntry == null) return;
		if (textContent == null)
		{
			textContent = BtsCorpusModelFactory.eINSTANCE.createBTSTextContent();
		}
		BTSSenctence sentence = null;
		if (!textContent.getTextItems().isEmpty())
		{
			sentence = (BTSSenctence) textContent.getTextItems().get(0);
		}
		else
		{
			sentence = BtsCorpusModelFactory.eINSTANCE.createBTSSenctence();
			textContent.getTextItems().add(sentence);
		}
		if (!selectedLemmaEntry.getWords().isEmpty())
		{
			sentence.getSentenceItems().clear();
			sentence.getSentenceItems().addAll(selectedLemmaEntry.getWords());
		}
		else if (sentence.getSentenceItems().isEmpty())
		{
			BTSWord w = BtsCorpusModelFactory.eINSTANCE.createBTSWord();
			w.setWChar("");
			sentence.getSentenceItems().add(w);
		}
//		textContent.getTextItems().add(sentence);
		
	}

	private void loadTranslation(BTSLemmaEntry selection, List<BTSObject> relatingObjects2) {
		// TODO Auto-generated method stub
		
	}

	private void purgeCache() {
		modelAnnotationMap = new HashMap<String, ModelAnnotation>();
		relatingObjectsAnnotationMap = new HashMap<EObject, List<ModelAnnotation>>();
//		localCommandCacheSet.clear();
		textContent = null;
		if (relatingObjectsMap != null)
		{
			relatingObjectsMap.clear();
		}
		
	}

	@PreDestroy
	public void preDestroy() {
		
	}
	
	
	@Focus
	public void onFocus() {

		

	}
	
	
	@Persist
	public boolean save() {
		if (selectedLemmaEntry != null && dirty.isDirty())
		{
			updateModelFromTranscription();
			boolean success = lemmaEditorController.save(this.selectedLemmaEntry);
			dirty.setDirty(!success);
			return success;
		}
		return true;
	}

	@Override
	public void setEditorSelection(Object selection) {
		// TODO Auto-generated method stub
		
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

	@Inject
	@Optional
	void eventReceivedCaretEvents(
			@EventTopic("event_text_selection/*") final Object event) {
		System.out.println("lemma editor event received: " + event);
		if (selectedLemmaEntry !=null && event instanceof String && event != null) {
//			setTextSelectionEvent((String) event);
			
			sync.asyncExec(new Runnable() {
				public void run() {
					signTextEditor.setTextSelectionEvent((String) event);
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
//		if (notification.getQueryIds() != null){
//			for (String id : notification.getQueryIds())
//			{
//				if (id.equals(queryId))
//				{
//					processModelUpdate(notification, id);
//				}
//			}
//		}
		
		
	}
}