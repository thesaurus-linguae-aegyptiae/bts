 
package org.bbaw.bts.ui.egy.parts;

import java.util.EventObject;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

import javax.inject.Inject;
import javax.inject.Named;
import javax.annotation.PostConstruct;

import org.bbaw.bts.btsmodel.BTSIdentifiableItem;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.BTSTranslations;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.commons.BTSPluginIDs;
import org.bbaw.bts.core.controller.generalController.EditingDomainController;
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
import org.bbaw.bts.ui.commons.widgets.TranslationEditorComposite;
import org.bbaw.bts.ui.egy.parts.egyTextEditor.AnnotationDrawingStrategy;
import org.bbaw.bts.ui.egy.parts.egyTextEditor.AnnotationHighlightedDrawingStrategy;
import org.bbaw.bts.ui.egy.parts.egyTextEditor.BTSTextXtextEditedResourceProvider;
import org.bbaw.bts.ui.egy.parts.egyTextEditor.CommentDrawingStrategy;
import org.bbaw.bts.ui.egy.parts.egyTextEditor.CommentHighlightedDrawingStrategy;
import org.bbaw.bts.ui.egy.parts.egyTextEditor.RubrumDrawingStrategy;
import org.bbaw.bts.ui.egy.parts.egyTextEditor.SubtextHighlightedDrawingStrategy;
import org.bbaw.bts.ui.egy.parts.egyTextEditor.SubtextdrawingStrategy;
import org.bbaw.bts.ui.egy.parts.support.AbstractTextEditorLogic;
import org.bbaw.bts.ui.egy.textSign.SignTextComposite;
import org.eclipse.swt.widgets.Composite;

import javax.annotation.PreDestroy;

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
import org.eclipse.jface.text.source.IAnnotationAccess;
import org.eclipse.jface.text.source.IAnnotationModel;
import org.eclipse.jface.text.source.AnnotationPainter.ITextStyleStrategy;
import org.eclipse.swt.custom.CaretEvent;
import org.eclipse.swt.custom.CaretListener;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.events.TypedEvent;
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

public class EgyLemmaEditorPart extends AbstractTextEditorLogic implements IBTSEditor, EventHandler {
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
	private EContextService contextService;
	
	@Inject
	private Logger logger;

	private Map<EObject, List<BTSModelAnnotation>> relatingObjectsAnnotationMap;

	private Composite embeddedEditorComp;

	private Group grpTransliteration;

	private EmbeddedEditor embeddedEditor;
	
	private EmbeddedEditorModelAccess embeddedEditorModelAccess;

	private IAnnotationModel annotationModel;

	private Map relatingObjectsMap;

	private BTSTextXtextEditedResourceProvider xtextResourceProvider = new BTSTextXtextEditedResourceProvider();
	private Map<String, BTSModelAnnotation> modelAnnotationMap;
	private BTSTextContent textContent;
	private boolean loaded;
	private List<BTSModelAnnotation> highlightedAnnotations = new Vector<BTSModelAnnotation>(4);
	protected String queryId;
	
	protected Object selectedTextItem;
	@Inject
	private EditingDomainController editingDomainController;
	protected EditingDomain editingDomain;
	private CommandStackListener commandStackListener;
	private Set<Command> localCommandCacheSet = new HashSet<Command>();
	protected boolean loading;
	private TranslationEditorComposite lemmaTranslate_Editor;
	private boolean reload;
	private AnnotationPainter painter;


	@Inject
	public EgyLemmaEditorPart(EPartService partService) {
		part = partService.findPart(BTSPluginIDs.PART_ID_EGY_LEMMAEDITOR);

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
		
		if (embeddedEditorComp != null)
		{
			embeddedEditorComp.dispose();
			embeddedEditorComp = null;
		}
		embeddedEditorComp = new Composite(grpTransliteration, SWT.BORDER);
		embeddedEditorComp.setLayout(new GridLayout());
		embeddedEditorComp.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				true));


		embeddedEditor = embeddedEditorFactory.newEditor(xtextResourceProvider)
				.showAnnotations(BTSAnnotationAnnotation.TYPE,
						BTSCommentAnnotation.TYPE,
						"org.eclipse.xtext.ui.editor.error",
						"org.eclipse.xtext.ui.editor.warning")
				.withParent(embeddedEditorComp);
		embeddedEditor.getViewer().getTextWidget().setLineSpacing(LINE_SPACE);
		embeddedEditorModelAccess = embeddedEditor.createPartialEditor("\r",
				"§§", "\r", false);
		// embeddedEditor.getViewer().getTextWidget().setFont(font);
		// keep the partialEditor as instance var to read / write the edited
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
				
			}
		});
		embeddedEditor.getViewer().getTextWidget().addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				updateModelFromTranscription();
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				contextService
				.activateContext("org.eclipse.xtext.ui.embeddedTextEditorScope");
				loadTextContent(selectedLemmaEntry);
				loadTransliteration(selectedLemmaEntry);
			}
		});
		
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
				loadTextContent(selectedLemmaEntry);
				loadSignText(selectedLemmaEntry);
				
			}
		});
		grpSigntext.layout();
		
		
		// tranlation		
		Group grpTranslation = new Group(parent, SWT.NONE);
		grpTranslation.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		grpTranslation.setText("Translation");
		grpTranslation.setLayout(new GridLayout(1, false));

		lemmaTranslate_Editor = new TranslationEditorComposite(
				grpTranslation, SWT.WRAP | SWT.MULTI | SWT.V_SCROLL
						| SWT.BORDER, null, null, false);
		lemmaTranslate_Editor.setLayoutData(new GridData(SWT.FILL, SWT.FILL,
				true, true));
		lemmaTranslate_Editor.layout();
		
//		eventBroker.subscribe("event_text_selection/*", this);
//		eventBroker.subscribe("event_relating_objects/*", this);
		loaded = true;
		
		// if selection is cached, load it.
		if (selectedLemmaEntry != null)
		{
			loadInput(selectedLemmaEntry);
		}
	}
	
	@Inject
	public void setSelection(
			@Optional @Named(IServiceConstants.ACTIVE_SELECTION) final BTSObject selection) {
		if (selection == null) {
			// do nothing
			return;
		} else if (selection != null && !selection.equals(selectedLemmaEntry)) {
			if (selection instanceof BTSCorpusObject) {
//				if (editingDomain != null) {
//					editingDomain.getCommandStack().removeCommandStackListener(
//							commandStackListener);
//				}
				// manage part title
				if (selection instanceof BTSLemmaEntry)
				{
					part.setLabel(selection.getName());
				} else {
					part.setLabel("LemmaEditor");

				}

				// TODO save configurable this is autosave!!!
				if (loaded)
				{
					//save old
					if (selectedLemmaEntry != null)
					{
					save();
					purgeCache();
					}
					if (selection instanceof BTSLemmaEntry) {
						
						selectedLemmaEntry = (BTSLemmaEntry) selection;
						editingDomain = getEditingDomain(selectedLemmaEntry);
						editingDomain.getCommandStack().addCommandStackListener(
								getCommandStackListener());
						loadInput((BTSLemmaEntry) selection);
					}
					else
					{
						loadInput(null);
						selectedLemmaEntry = null;
					}
				}
				// if not loaded cache selection
				else if (selection instanceof BTSLemmaEntry)
				{
					selectedLemmaEntry = (BTSLemmaEntry) selection;

				}
			}
		}
	}
	
	
	private void loadInput(final BTSLemmaEntry selection) {
		
		loading = true;
		if (selection != null)
		{
			Job job = new Job("load children")
			{
	
				@Override
				protected IStatus run(IProgressMonitor monitor)
				{
					relatingObjects = lemmaEditorController.getRelatingObjects((BTSLemmaEntry) selection);
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
		}
		loadTextContent(selection);

		loadTransliteration(selection);
		
		loadSignText(selection);
		
		loadTranslation(selection);
		loading = false;
	}

	private void loadTransliteration(BTSLemmaEntry lemma) {
//		if (lemma == null)
//		{
//			if (embeddedEditor != null)
//			{
//				embeddedEditorModelAccess.updateModel("\r",
//						"", "\r");
////				embeddedEditor.getViewer().setDocument(null);
//			}
//			return;
//		}
		modelAnnotationMap = new HashMap<String, BTSModelAnnotation>();
		relatingObjectsAnnotationMap = new HashMap<EObject, List<BTSModelAnnotation>>();
		Document doc = new Document();
		AnnotationModel tempAnnotationModel = new AnnotationModel();
		lemmaEditorController.transformToDocument(textContent, doc, tempAnnotationModel, relatingObjects, relatingObjectsMap);

		embeddedEditorModelAccess.updateModel("\r",
				doc.get(), "\r");
		annotationModel = embeddedEditor.getViewer().getAnnotationModel();

		loadAnnotations2Editor(annotationModel, tempAnnotationModel);
		if (selectedLemmaEntry != null) {
			embeddedEditor.getDocument().addDocumentListener(
					new IDocumentListener() {

					@Override
					public void documentChanged(DocumentEvent event) {
						if (!loading)
						{
							setDirtyInternal();
						}

					}

					@Override
					public void documentAboutToBeChanged(DocumentEvent event) {

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
				textContent = lemmaEditorController.updateModelFromTextContent(textContent, eo, am);
				
			}
		}

	}
	
	protected void processTextSelection(TypedEvent event) {
		BTSTextSelectionEvent btsEvent = new BTSTextSelectionEvent(event);
//		System.out.println("Textselection x y : " + btsEvent.x + " " + btsEvent.y);
		btsEvent.data = selectedLemmaEntry;
		List<BTSModelAnnotation> annotations = getModelAnnotationAtSelection(btsEvent.x, btsEvent.y, btsEvent);
		btsEvent.getTextAnnotations().addAll(annotations);
		processSelection(annotations, false, btsEvent);
		selectionService.setSelection(btsEvent);
		
	}
	
	protected void processEditorSelection(Object item) {
		TypedEvent event = new TypedEvent(item);
		BTSTextSelectionEvent btsEvent = new BTSTextSelectionEvent(event);
//		System.out.println("Textselection x y : " + btsEvent.x + " " + btsEvent.y);
		btsEvent.data = selectedLemmaEntry;
		List<BTSModelAnnotation> annotations = getModelAnnotationAtSelection(btsEvent.x, btsEvent.y, btsEvent);
		btsEvent.getTextAnnotations().addAll(annotations);
		processSelection(annotations, false, btsEvent);
		selectionService.setSelection(btsEvent);
		
	}
	
	protected void processSelection(List<BTSModelAnnotation> annotations, boolean postSelection, BTSTextSelectionEvent btsEvent) {
		List<BTSModelAnnotation> relatingObjectsAnnotations = new Vector<BTSModelAnnotation>(annotations.size());
		for (BTSModelAnnotation ma : annotations) {
			if (ma != null && ma instanceof BTSLemmaAnnotation
					&& ma.getModel() != null
					&& ma.getModel() instanceof BTSObject
					&& !ma.getModel().equals(selectedTextItem)) {
//				if (ma.getModel() instanceof BTSWord) {
//					setSentenceTranslation((BTSWord) ma.getModel());
//				} else if (ma.getModel() instanceof BTSSenctence) {
//					setSentenceTranslation((BTSSenctence) ma.getModel());
//				}
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
		List<BTSModelAnnotation> deHighlightedAnnotations = new Vector<BTSModelAnnotation>(highlightedAnnotations.size());

		deHighlightedAnnotations.addAll(highlightedAnnotations);
		deHighlightedAnnotations.removeAll(relatingObjectsAnnotations);
		highlightAnnotations(deHighlightedAnnotations, false);

		if (!relatingObjectsAnnotations.isEmpty())
		{

			highlightAnnotations(relatingObjectsAnnotations, true);
			
			List<BTSObject> relSelObjects = new Vector<BTSObject>(annotations.size());
			for (BTSModelAnnotation a : relatingObjectsAnnotations)
			{
				if (a instanceof BTSAnnotationAnnotation)
				{
					relSelObjects.add((BTSObject) ((BTSAnnotationAnnotation) a).getRelatingObject());
				} else if (a instanceof BTSCommentAnnotation)
				{
					relSelObjects.add((BTSObject) ((BTSCommentAnnotation) a).getRelatingObject());
				}else if (a instanceof BTSSubtextAnnotation)
				{
					relSelObjects.add((BTSObject) ((BTSSubtextAnnotation) a).getRelatingObject());
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
			List<BTSModelAnnotation> relatingObjectsAnnotations, boolean highlighted) {
			for (BTSModelAnnotation a : relatingObjectsAnnotations)
			{
				a.setHighlighted(highlighted);
			}
		}
	private List<BTSModelAnnotation> getModelAnnotationAtSelection(int start, int end, BTSTextSelectionEvent btsEvent) {
		Iterator it = embeddedEditor.getViewer().getAnnotationModel()
				.getAnnotationIterator();
		List<BTSModelAnnotation> annotations = new Vector<BTSModelAnnotation>(4);
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
//				System.out.println("pos " + pos.getOffset() + " " +  pos.getOffset() + pos.getLength());
				if ((pos.getOffset() <= start
						&& start < pos.getOffset() + pos.getLength()) || (pos.getOffset() >= start && pos.getOffset() <= end)) {
					annotations.add((BTSModelAnnotation) a);
					if (((BTSModelAnnotation)a).getModel() instanceof BTSSentenceItem)
					{
						BTSSentenceItem item = (BTSSentenceItem) ((BTSModelAnnotation)a).getModel();
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
//					annotations.add((BTSModelAnnotation) a);
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
			loadSingleAnnotation2Editor(editorModel, (BTSModelAnnotation) a, pos, issue);
			
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
		if (l == null)
		{
			l = new Vector<BTSModelAnnotation>(2);
			relatingObjectsAnnotationMap.put(object, l);
		}
		l.add(ma);
	}
	protected void setDirtyInternal() {
		if (selectedLemmaEntry != null && !dirty.isDirty()) {
			dirty.setDirty(true);
		}
		
	}

	private void loadSignText(BTSLemmaEntry lemma) {
		signTextEditor.setInput(lemma, textContent, relatingObjects, relatingObjectsMap);
	}

	private void loadTextContent(BTSLemmaEntry lemma) {
		if(lemma == null) return;
		if (textContent == null)
		{
			textContent = BtsCorpusModelFactory.eINSTANCE.createBTSTextContent();
		}
		BTSSenctence sentence = null;
		if (textContent.getTextItems().isEmpty())
		{
			sentence = BtsCorpusModelFactory.eINSTANCE.createBTSSenctence();
			textContent.getTextItems().add(sentence);
			if (!lemma.getWords().isEmpty())
			{
				sentence.getSentenceItems().clear();
				sentence.getSentenceItems().addAll(lemma.getWords());
			}
			else if (sentence.getSentenceItems().isEmpty())
			{
				BTSWord w = BtsCorpusModelFactory.eINSTANCE.createBTSWord();
				w.setWChar("");
				sentence.getSentenceItems().add(w);
			}
		}
	}

	private void loadTranslation(BTSLemmaEntry selection) {
		if (selection == null)
		{
			lemmaTranslate_Editor.load(null,
					null, false);
			return;
		}
		BTSTranslations translations = selection.getTranslations();
		if (translations == null)
		{
			translations = BtsmodelFactory.eINSTANCE.createBTSTranslations();
			selection.setTranslations(translations);
			dirty.setDirty(true);
		}
		lemmaTranslate_Editor.load(translations,
				editingDomain, false);
		
	}

	private void purgeCache() {

//		localCommandCacheSet.clear();
		textContent = null;
		if (relatingObjectsMap != null)
		{
			relatingObjectsMap.clear();
		}
		localCommandCacheSet.clear();
		if (editingDomain != null) {
			// remove commandstacklistener from old selection
			editingDomain.getCommandStack().removeCommandStackListener(
					commandStackListener);
		}
		editingDomain = null;
	}

	@PreDestroy
	public void preDestroy() {
		
	}
	
	
	@Focus
	public void onFocus() {

		

	}
	
	
	@Persist
	public boolean save() {
		if (selectedLemmaEntry != null)
		{
			// update lemma words because loading lemma words into textcontent leads to the removel of lemma words form lemma
			// due to containment of words
//			updateModelFromTranscription();
			if (textContent != null && !textContent.getTextItems().isEmpty())
			{
				List<BTSSentenceItem> items = new Vector<BTSSentenceItem>();
				for (BTSTextItems sen : textContent.getTextItems())
				{
					if (sen instanceof BTSSenctence)
					{
						items.addAll(((BTSSenctence) sen).getSentenceItems());
						
					}
				}
				selectedLemmaEntry.getWords().clear();
				for (BTSSentenceItem item : items)
				{
					if (item instanceof BTSWord)
					{
						selectedLemmaEntry.getWords().add((BTSWord) item);
					}
				}
				textContent.getTextItems().clear();
			}
			// if dirty, persist
			if (dirty.isDirty())
			{
				lemmaTranslate_Editor.save();
				boolean success = lemmaEditorController.save(this.selectedLemmaEntry);
				logger.debug("Save LemmaEntry successful: " + success);
				dirty.setDirty(!success);
				return success;
			}
		}
		return true;
	}

	@Override
	public void setEditorSelection(final Object selection) {
		if (selection != null) {
			sync.asyncExec(new Runnable() {

				public void run() {
					// workaround because selection service requires iniating
					// part to be the active part
					// see some bug of e4
					MPart p = partService
							.findPart(BTSPluginIDs.PART_ID_EGY_LEMMAEDITOR);
					MPart activePart = partService.getActivePart();
					boolean workaround = false;
					if (!activePart.equals(p)) {
						workaround = true;
						partService.activate(p);
					}
					if (selection instanceof BTSTextSelectionEvent && ((BTSTextSelectionEvent)selection).data instanceof EObject)
					{
						// remove listener from old editingDomain
						if (editingDomain != null)
						{
						editingDomain.getCommandStack().removeCommandStackListener(
								commandStackListener);
						}
						// get selected item, add listener to domain
						if (!((BTSTextSelectionEvent)selection).getSelectedItems().isEmpty())
						{
							editingDomain = getEditingDomain((EObject)  ((BTSTextSelectionEvent)selection).getSelectedItems().get(0));
							editingDomain.getCommandStack().addCommandStackListener(
									getCommandStackListener());
						}
						
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
						} else {
							// undo executed
							if (localCommandCacheSet.remove(mostRecentCommand)
									&& localCommandCacheSet.isEmpty()) {
								dirty.setDirty(false);
							} else if (!dirty.isDirty()) {
								dirty.setDirty(true);
							}
						}
					}

				}
			};
		}
		return commandStackListener;
	}

	private EditingDomain getEditingDomain(EObject editingObject) {
		return editingDomainController.getEditingDomain(editingObject);
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
			List<BTSModelAnnotation> annotations = new Vector<BTSModelAnnotation>(((List)event).size());
			for (Object o : (List)event)
			{
				if (o instanceof BTSObject)
				{
					List<BTSModelAnnotation> a = relatingObjectsAnnotationMap.get(o);
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