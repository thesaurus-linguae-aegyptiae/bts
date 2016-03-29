 
package org.bbaw.bts.ui.egy.parts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import javax.inject.Inject;
import javax.inject.Named;
import javax.annotation.PostConstruct;

import org.bbaw.bts.btsmodel.BTSIdentifiableItem;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.commons.BTSPluginIDs;
import org.bbaw.bts.core.corpus.controller.partController.EgyTextTranslationPartController;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAmbivalence;
import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject;
import org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaCase;
import org.bbaw.bts.corpus.btsCorpusModel.BTSSenctence;
import org.bbaw.bts.corpus.btsCorpusModel.BTSSentenceItem;
import org.bbaw.bts.corpus.btsCorpusModel.BTSText;
import org.bbaw.bts.ui.commons.corpus.events.BTSTextSelectionEvent;
import org.bbaw.bts.ui.commons.corpus.text.BTSModelAnnotation;
import org.bbaw.bts.ui.commons.corpus.text.BTSSubtextAnnotation;
import org.bbaw.bts.ui.commons.utils.BTSUIConstants;
import org.bbaw.bts.ui.egy.parts.egyTextEditor.CommentDrawingStrategy;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.custom.CaretEvent;
import org.eclipse.swt.custom.CaretListener;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.events.TypedEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.di.UISynchronize;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.services.internal.events.EventBroker;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IPainter;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.jface.text.source.AnnotationModel;
import org.eclipse.jface.text.source.AnnotationModelEvent;
import org.eclipse.jface.text.source.AnnotationPainter;
import org.eclipse.jface.text.source.IAnnotationAccess;
import org.eclipse.jface.text.source.IAnnotationModel;
import org.eclipse.jface.text.source.SourceViewer;
import org.eclipse.jface.text.source.AnnotationPainter.ITextStyleStrategy;

public class EgyTextTranslationPart {
	private static final String EDITOR_PREFIX = "";
	private BTSIdentifiableItem selectedTextItem;
	private BTSText text;
	private MPart part;
	private SourceViewer textViewer;
	
	@Inject
	private EgyTextTranslationPartController translationController;
	
	/** The sync. */
	@Inject
	private UISynchronize sync;

	/** The event broker. */
	@Inject
	private EventBroker eventBroker;
	
	/** The selection service. */
	@Inject
	private ESelectionService selectionService;
	
	private IAnnotationModel annotationModel;
	// boolean if object is loaded into gui
	private boolean loaded;

	// boolean if gui is constructed
	private boolean constructed;

	// boolean if selection is cached and can be loaded when gui becomes visible or constructed
	private boolean selectionCached;
	// FIXME integrate perferences!!!
	private String language = "de";
	
	/** The model annotation map. */
	private Map<String, BTSModelAnnotation> modelAnnotationMap = new HashMap<String, BTSModelAnnotation>();
	
	/** The painter. */
	private AnnotationPainter painter;
	
	/** The highlighted annotations. */
	private List<BTSModelAnnotation> highlightedAnnotations = new Vector<BTSModelAnnotation>(
			4);
	
	private BTSTextSelectionEvent btsTextEvent = null;
	private long lastSelectionTimeStamp = 0;

	@Inject
	public EgyTextTranslationPart(EPartService partService) {
		part = partService.findPart(BTSPluginIDs.PART_ID_EGY_TEXTTRANSLATION);
		
	}
	
	@PostConstruct
	public void postConstruct(Composite parent) {
		parent.setLayout(new GridLayout(1, false));
		((GridLayout) parent.getLayout()).marginHeight = 0;
		((GridLayout) parent.getLayout()).marginWidth = 0;
		Composite composite_1 = new Composite(parent, SWT.NONE);
		composite_1.setLayout(new GridLayout(1, false));
		composite_1.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		((GridLayout) composite_1.getLayout()).marginHeight = 0;
		((GridLayout) composite_1.getLayout()).marginWidth = 0;
		textViewer = new SourceViewer(composite_1, null, SWT.BORDER | SWT.READ_ONLY | SWT.WRAP | SWT.V_SCROLL);
		StyledText styledText = textViewer.getTextWidget();
		styledText.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		textViewer.setDocument(new Document());
		annotationModel = textViewer.getAnnotationModel();
		
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
		painter = new AnnotationPainter(textViewer, annotationAccess);
		
		configureEditorDrawingStrategies(painter);
		textViewer.addTextPresentationListener(painter);
		textViewer.addPainter(painter);
		textViewer.getTextWidget()
		.addCaretListener(new CaretListener() {

			@Override
			public void caretMoved(CaretEvent event) {
				processTextSelection(event);
				// get char right of caret and show utf-8
				// code in status line
				if (event.caretOffset < textViewer.getTextWidget()
						.getText().length()) {
					String sign = textViewer
							.getTextWidget()
							.getText(event.caretOffset,
									event.caretOffset);
					if (sign != null && !"".equals(sign)) {
						int lineIndex = textViewer
								.getTextWidget()
								.getLineAtOffset(
										event.caretOffset);
						int offset = event.caretOffset
								- textViewer
										.getTextWidget()
										.getOffsetAtLine(
												lineIndex);
					}
				}
			}
		});
		textViewer.getTextWidget()
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
		constructed = true;
		if (selectionCached)
		{
			loadInput(text);
		} else
			eventBroker.post(BTSUIConstants.EVENT_EGY_TEXT_EDITOR_INPUT_REQUESTED+"translation_part", text);
			
	}
	
	/**
	 * Process text selection.
	 *
	 * @param event the event
	 */
	protected void processTextSelection(TypedEvent event) {
		BTSTextSelectionEvent btsEvent = new BTSTextSelectionEvent(event, text);
		btsEvent.data = text;
		
		if (btsTextEvent == null) {
			Job j = new Job("delay_selection_processing"){
				@Override
				protected IStatus run(IProgressMonitor monitor) {
					while (System.nanoTime() < lastSelectionTimeStamp + 350000000)
						try {
							Thread.sleep(100);
						} catch (InterruptedException e) {
							e.printStackTrace();
							return Status.CANCEL_STATUS;
						}
					
					final BTSTextSelectionEvent btsEvent = btsTextEvent;
					sync.asyncExec(new Runnable() {
						@Override
						public void run() {

							List<BTSModelAnnotation> annotations = getModelAnnotationAtSelection(
									btsEvent.x, btsEvent.y, btsEvent);							
							btsEvent.getTextAnnotations().addAll(annotations);
							processSelection(annotations, false, btsEvent);
//							selectionService.setSelection(btsEvent);
							
						}
					});
					btsTextEvent = null;
					return Status.OK_STATUS;
				}
			};
			j.schedule(400);
			this.btsTextEvent = btsEvent;
		} else 
			if (!(event instanceof CaretEvent) || (btsTextEvent.getOriginalEvent() instanceof CaretEvent))
				this.btsTextEvent = btsEvent;
		
		lastSelectionTimeStamp  = System.nanoTime();
	}
	
	private void processSelection(List<BTSModelAnnotation> annotations,
			boolean b, BTSTextSelectionEvent btsEvent) {
		List<BTSModelAnnotation> sentenceAnnotations = new Vector<BTSModelAnnotation>(
				annotations.size());
		if (!annotations.isEmpty())
		{
			for (BTSModelAnnotation ma : annotations) {
				 if (ma instanceof BTSModelAnnotation && ((BTSModelAnnotation)ma).getModel() instanceof BTSSenctence)
				{
					 sentenceAnnotations.add(ma);
				}
			}
		}
		List<BTSModelAnnotation> deHighlightedAnnotations = new Vector<BTSModelAnnotation>(
				highlightedAnnotations.size());
		List<BTSModelAnnotation> toBeHighlightedAnnotations = new Vector<BTSModelAnnotation>();
		// substract annotations that are already highlighted from those the selected annotations
		toBeHighlightedAnnotations.addAll(sentenceAnnotations);
		toBeHighlightedAnnotations.removeAll(highlightedAnnotations);
//		System.out.println("");
//		System.out.println("selected annos: " + relatingObjectsAnnotations.size());
//
//		System.out.println("tobe highligehted: " + toBeHighlightedAnnotations.size());
		
		// substract annotations the selected annotations those that are to be de-highlighted 
		deHighlightedAnnotations.addAll(highlightedAnnotations);
		deHighlightedAnnotations.removeAll(sentenceAnnotations);
//		System.out.println("tobe de-highligehted: " + deHighlightedAnnotations.size());

		boolean modelChanged = (!deHighlightedAnnotations.isEmpty() || !toBeHighlightedAnnotations.isEmpty());
		highlightAnnotations(deHighlightedAnnotations, false);
		highlightAnnotations(toBeHighlightedAnnotations, true);
		
		highlightedAnnotations.clear();
		highlightedAnnotations.addAll(sentenceAnnotations);
		if (modelChanged)
		{
			final AnnotationModelEvent ev = new AnnotationModelEvent(annotationModel);
			for (Annotation a : deHighlightedAnnotations)
			{
				if (a != null) ev.annotationChanged(a);
			}
			for (Annotation a : toBeHighlightedAnnotations)
			{
				if (a != null) ev.annotationChanged(a);
			}

			sync.asyncExec(new Runnable() {
				public void run() {
					// TODO this can be improved in order to reduce work load repainting large texts
					painter.modelChanged(ev);
					painter.paint(IPainter.INTERNAL);
					textViewer.getTextWidget().redraw();
				}
			});
		}
		
		// calculate event data
		if (!sentenceAnnotations.isEmpty()) {
			BTSSenctence sentence = (BTSSenctence) sentenceAnnotations.get(0).getModel();
			
			
			try {
				Annotation anno = sentenceAnnotations.get(0);
				final Position pos = annotationModel.getPosition(anno);
				if (pos != null)
				{
					sync.asyncExec(new Runnable() {
						@SuppressWarnings("restriction")
						public void run() {
							textViewer.revealRange(pos.getOffset(), pos.length);
						}
					});
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			if (modelChanged)
			{
//				btsEvent.getTextAnnotations().clear();
//				btsEvent.getTextAnnotations().addAll(highlightedAnnotations);
				// TODO: implement selection of multiple sentences!
				if (sentence != null)
					selectionService.setSelection(sentence);
			}
		}
	}

	/**
	 * Highlight annotations.
	 *
	 * @param relatingObjectsAnnotations the relating objects annotations
	 * @param highlighted the highlighted
	 */
	private void highlightAnnotations(
			List<BTSModelAnnotation> relatingObjectsAnnotations,
			boolean highlighted) {
		if (annotationModel == null) return;
		for (BTSModelAnnotation a : relatingObjectsAnnotations) {
			Position pos = annotationModel.getPosition(a);
			if (pos == null) return;
			StyleRange[] ranges = textViewer
					.getTextWidget()
					.getStyleRanges(pos.getOffset(), pos.getLength());
			Color color;
			if (highlighted)
			{
				color = BTSUIConstants.COLOR_SENTENCE;
			}
			else
			{
				color = BTSUIConstants.COLOR_WIHTE;
			}
			if (ranges != null && !(ranges.length == 0))
			{
				
				for (StyleRange sr : ranges)
				{
					sr.background = color;
					try {
						textViewer
						.getTextWidget().setStyleRange(sr);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
			else
			{
				StyleRange sr = new StyleRange(pos.getOffset(), pos.getLength(), BTSUIConstants.COLOR_BLACK, color);
				textViewer
				.getTextWidget().setStyleRange(sr);
			}
			textViewer.getTextWidget().update();
			a.setHighlighted(highlighted);
		}
	}

	/**
	 * Gets the model annotation at selection.
	 *
	 * @param start the start
	 * @param end the end
	 * @param btsEvent the bts event
	 * @return the model annotation at selection
	 */
	@SuppressWarnings("restriction")
	private List<BTSModelAnnotation> getModelAnnotationAtSelection(int start,
			int end, BTSTextSelectionEvent btsEvent) {
		Iterator it = textViewer.getAnnotationModel()
				.getAnnotationIterator();
		List<BTSModelAnnotation> annotations = new Vector<BTSModelAnnotation>(4);
		Map<Integer, List<BTSModelAnnotation>> annotationOffsetMap = new HashMap<Integer, List<BTSModelAnnotation>>(4);
		BTSSentenceItem startItem = null;
		int startItemOffeset = 0;
		BTSSentenceItem endItem = null;
		int endItemOffeset = 0;
		List<BTSSentenceItem> textItems = new Vector<BTSSentenceItem>();
		while (it.hasNext()) {
			Annotation a = (Annotation) it.next();
			if (a instanceof BTSModelAnnotation) {
				Position pos = textViewer.getAnnotationModel()
						.getPosition(a);
				// System.out.println("pos " + pos.getOffset() + " " +
				// pos.getOffset() + pos.getLength());
				if ((pos.getOffset() <= start && start < pos.getOffset()
						+ pos.getLength())
						|| (pos.getOffset() >= start && pos.getOffset() <= end)) {
					List<BTSModelAnnotation> list = annotationOffsetMap.get(pos.getOffset());
					if (list == null)
					{
						list = new ArrayList<BTSModelAnnotation>(2);
						annotationOffsetMap.put(pos.getOffset(), list);
					}
					list.add((BTSModelAnnotation) a);
					if (((BTSModelAnnotation) a).getModel() instanceof BTSSentenceItem) {
						BTSSentenceItem item = (BTSSentenceItem) ((BTSModelAnnotation) a)
								.getModel();
						textItems.add(item);
						
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
			List<BTSModelAnnotation> list = (List<BTSModelAnnotation>) annotationOffsetMap.get(i);
			annotations.addAll(list);
			
			// calculate the start and end item and startId and endId
			for (BTSModelAnnotation a : list) {
				if (((BTSModelAnnotation) a).getModel() instanceof BTSSentenceItem) {
					Position pos = textViewer.getAnnotationModel()
							.getPosition(a);
					BTSSentenceItem item = (BTSSentenceItem) ((BTSModelAnnotation) a)
							.getModel();
					
					if (startItem == null
							// move selection offset to right if within an Ambivalence
							|| (item.eContainer() instanceof BTSLemmaCase)) {
						startItem = item;
						startItemOffeset = pos.getOffset();
					}
					if (endItem == null
							// move selection end to right if not within an Ambivalence
							|| (!(item instanceof BTSAmbivalence) && pos.getOffset() + pos.getLength() > endItemOffeset)
							|| (item.eContainer() instanceof BTSLemmaCase)) {
						endItem = item;
						endItemOffeset = pos.getOffset() + pos.getLength();
					}
				}
			}
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

	private void configureEditorDrawingStrategies(AnnotationPainter painter2) {
		// Sentence
		ITextStyleStrategy strategy = new org.eclipse.jface.text.source.AnnotationPainter.HighlightingStrategy();
		painter2.addTextStyleStrategy(BTSModelAnnotation.TYPE + ".highlighted", strategy);
		painter2.setAnnotationTypeColor(BTSModelAnnotation.TYPE + ".highlighted",
				BTSUIConstants.COLOR_SENTENCE);
		painter2.addAnnotationType(BTSModelAnnotation.TYPE + ".highlighted", BTSModelAnnotation.TYPE);
		
		ITextStyleStrategy strategy2 = new org.eclipse.jface.text.source.AnnotationPainter.HighlightingStrategy();
		painter2.addTextStyleStrategy(BTSModelAnnotation.TYPE, strategy2);
		painter2.setAnnotationTypeColor(BTSModelAnnotation.TYPE,
				BTSUIConstants.COLOR_SENTENCE);
		painter2.addAnnotationType(BTSModelAnnotation.TYPE, BTSModelAnnotation.TYPE);
		
//		// comment
//				CommentDrawingStrategy commentStrategy = new CommentDrawingStrategy();
//				painter2.addDrawingStrategy(BTSModelAnnotation.TYPE, commentStrategy);
//				painter2.setAnnotationTypeColor(BTSModelAnnotation.TYPE,
//						BTSUIConstants.COLOR_SENTENCE);
//				painter2.addAnnotationType(BTSModelAnnotation.TYPE,
//						BTSModelAnnotation.TYPE);
		
	}

	/**
	 * Sets the selection.
	 *
	 * @param selection the new selection
	 */
	@Inject
	public void setSelection(
			@Optional @Named(IServiceConstants.ACTIVE_SELECTION) BTSIdentifiableItem selection) {
		if (selection == null) {
			// do nothing
			return;
		} else if (selection != null && !selection.equals(selectedTextItem)) {

			if (selection instanceof BTSCorpusObject) {
				
				if (constructed)
				{
					if (selection instanceof BTSText) {
						purgeCache();
						part.setLabel(((BTSObject) selection).getName());
						makePartActive(true);
						loadInput((BTSText) selection);
						this.text = (BTSText) selection;
	
					} else if (loaded){
						purgeCache();
						loadInput(null);
						if (part != null) {
							part.setLabel("TextTranslation");
						}
						text = null;
						loaded = false;
						makePartActive(false);
					}
				}
				else if (selection instanceof BTSText) {
					this.text = (BTSText) selection;
					selectionCached = true;
				}
			}
			else if (selection instanceof BTSSenctence)
			{
				setSelectionInternal((BTSSenctence)selection);
			}
			selectedTextItem = selection;
		}
	}

	private void setSelectionInternal(BTSSenctence selection) {
		BTSModelAnnotation a = modelAnnotationMap.get(selection.get_id());
		if (!highlightedAnnotations.contains(a) && annotationModel != null)
		{
			highlightAnnotations(highlightedAnnotations, false);
			highlightedAnnotations.clear();
			highlightedAnnotations.add(a);
			highlightAnnotations(highlightedAnnotations, true);
			Position pos = annotationModel.getPosition(a);
			if (pos != null)
				textViewer.revealRange(pos.getOffset(), pos.getLength());
		}
		
	}

	/**
	 * Sets the focus.
	 */
	@Focus
	public void setFocus() {
		if (!loaded && selectionCached) // not yet loaded but has cached selection
		{
			loadInput(text);
		}
	}
	
	private void loadInput(BTSText text) {
		if (text == null)
		{
			textViewer.getDocument().set("");
			loaded = false;
		}
		else
		{
			annotationModel = null;
			annotationModel = new AnnotationModel();
	 		AnnotationModel tempAnnotationModel = new AnnotationModel();

			String stringText = translationController.loadTranslation(text, language, tempAnnotationModel);
			IDocument document = new Document();
			document.set(stringText);
			loadAnnotations2Editor(annotationModel, tempAnnotationModel);

			textViewer.setDocument(document, annotationModel);
//			annotationModel.connect(document);
//			embeddedEditor.getViewer().addPainter(painter);
			painter.paint(IPainter.TEXT_CHANGE);
			painter.modelChanged(textViewer.getAnnotationModel());
			textViewer.getTextWidget().getParent().layout();
			loaded = true;
		}
	}
	
	@SuppressWarnings("rawtypes")
	private void loadAnnotations2Editor(IAnnotationModel editorModel,
			IAnnotationModel model) {
		modelAnnotationMap.clear();
		Iterator i = model.getAnnotationIterator();
		Issue issue;
		issue = new Issue.IssueImpl();
		while (i.hasNext()) {
			Object a = i.next();
			Position pos = model.getPosition((Annotation) a);
			loadSingleAnnotation2Editor(editorModel, (BTSModelAnnotation)a, pos, issue);
		}

	}
	
	/**
	 * Load single annotation2 editor.
	 *
	 * @param editorModel the editor model
	 * @param a the a
	 * @param pos the pos
	 * @param issue the issue
	 */
	@SuppressWarnings("restriction")
	protected void loadSingleAnnotation2Editor(IAnnotationModel editorModel,
			 BTSModelAnnotation a, Position pos, Issue issue) {
		if (a instanceof BTSModelAnnotation && ((BTSModelAnnotation)a).getModel() instanceof BTSSenctence) {

			// Position pos = model.getPosition((Annotation) a);
			Position pos2 = new Position(pos.getOffset() + EDITOR_PREFIX.length(), pos.getLength());
			editorModel.addAnnotation((Annotation) a, pos2);
			modelAnnotationMap.put(
					((BTSIdentifiableItem) a.getModel()).get_id(), a);
		}

	}

	private void purgeCache() {
		// TODO Auto-generated method stub
		
	}
	/**
	 * Make part active.
	 *
	 * @param activate the activate
	 */
	@SuppressWarnings("restriction")
	private void makePartActive(boolean activate) {
		if (activate)
		{
			textViewer.getTextWidget().setBackground(BTSUIConstants.COLOR_WIHTE);
		}
		else
		{
			textViewer.getTextWidget().setBackground(BTSUIConstants.COLOR_BACKGROUND_DISABLED);
		}
		
	}
	
	public String getLanguage()
	{
		return this.language;
	}
	
	public void setLanguage(String language)
	{
		if (this.language == null || !this.language.equals(language))
		{
			this.language = language;
			purgeCache();
			loadInput(text);
		}
	}
}