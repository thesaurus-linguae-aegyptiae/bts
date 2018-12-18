package org.bbaw.bts.ui.egy.textSign;

import java.awt.image.BufferedImage;
import java.awt.image.DirectColorModel;
import java.awt.image.IndexColorModel;
import java.awt.image.WritableRaster;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSIdentifiableItem;
import org.bbaw.bts.btsmodel.BTSInterTextReference;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.BTSRelation;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.corpus.controller.partController.BTSTextEditorController;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAmbivalence;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAmbivalenceItem;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAnnotation;
import org.bbaw.bts.corpus.btsCorpusModel.BTSGraphic;
import org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaCase;
import org.bbaw.bts.corpus.btsCorpusModel.BTSMarker;
import org.bbaw.bts.corpus.btsCorpusModel.BTSSenctence;
import org.bbaw.bts.corpus.btsCorpusModel.BTSSentenceItem;
import org.bbaw.bts.corpus.btsCorpusModel.BTSTextContent;
import org.bbaw.bts.corpus.btsCorpusModel.BTSTextItems;
import org.bbaw.bts.corpus.btsCorpusModel.BTSWord;
import org.bbaw.bts.searchModel.BTSModelUpdateNotification;
import org.bbaw.bts.ui.commons.corpus.events.BTSTextSelectionEvent;
import org.bbaw.bts.ui.commons.corpus.interfaces.IBTSEditor;
import org.bbaw.bts.ui.commons.corpus.util.BTSEGYUIConstants;
import org.bbaw.bts.ui.commons.utils.BTSUIConstants;
import org.bbaw.bts.ui.egy.textSign.support.AmbivalenceEndFigure;
import org.bbaw.bts.ui.egy.textSign.support.AmbivalenceStartFigure;
import org.bbaw.bts.ui.egy.textSign.support.CompartementImageFigure;
import org.bbaw.bts.ui.egy.textSign.support.ElementFigure;
import org.bbaw.bts.ui.egy.textSign.support.LineFigure;
import org.bbaw.bts.ui.egy.textSign.support.MarkerFigure;
import org.bbaw.bts.ui.egy.textSign.support.TypedLabel;
import org.bbaw.bts.ui.egy.textSign.support.WordFigure;
import org.bbaw.bts.ui.resources.BTSResourceProvider;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.FigureCanvas;
import org.eclipse.draw2d.FigureListener;
import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.ImageFigure;
import org.eclipse.draw2d.KeyEvent;
import org.eclipse.draw2d.KeyListener;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.MouseEvent;
import org.eclipse.draw2d.MouseListener;
import org.eclipse.draw2d.MouseMotionListener;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.Viewport;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.e4.core.di.extensions.Preference;
import org.eclipse.e4.ui.di.UISynchronize;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.TypedEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.PaletteData;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;

import jsesh.mdc.MDCSyntaxError;
import jsesh.mdcDisplayer.draw.MDCDrawingFacade;
import jsesh.mdcDisplayer.preferences.DrawingSpecification;
import jsesh.mdcDisplayer.preferences.DrawingSpecificationsImplementation;

public class SignTextComposite extends Composite implements IBTSEditor {

	private static final Color COLOR_WORD_DESELECTED = ColorConstants.white;
	private static final Color COLOR_WORD_SELECTED = ColorConstants.yellow;

	private static final Color COLOR_MARKER_DESELECTED = BTSUIConstants.COLOR_BACKGROUND_DISABLED;
	private static final Color COLOR_MARKER_SELECTED = ColorConstants.yellow;

//	private static final Color COLOR_SENTENCE_DESELECTED = ColorConstants.white;
//	private static final Color COLOR_SENTENCE_SELECTED = ColorConstants.yellow;
//
//	private static final Color COLOR_AMBIVALENCE_DESELECTED = ColorConstants.white;
//	private static final Color COLOR_AMBIVALENCE_SELECTED = ColorConstants.yellow;

	private static final Color COLOR_CANVAS_BACKGROUND = ColorConstants.white;

	@Inject
	private BTSTextEditorController textEditorController;
	@Inject
	private IBTSEditor parentEditor;
	@Inject
	private UISynchronize sync;
	@Inject
	private BTSResourceProvider resourceProvider;
	
	@Inject
	@Preference(value = BTSEGYUIConstants.SIGN_TEXT_SHOW_HIEROGLYPHS, nodePath = "org.bbaw.bts.ui.corpus.egy")
	private Boolean showHieroglyphs;
	
	@Inject
	@Preference(value = BTSEGYUIConstants.SIGN_TEXT_SHOW_FLEXION, nodePath = "org.bbaw.bts.ui.corpus.egy")
	private Boolean showFlexion;
	
	@Inject
	@Preference(value = BTSEGYUIConstants.SIGN_TEXT_SHOW_LEMMAID, nodePath = "org.bbaw.bts.ui.corpus.egy")
	private Boolean showLemmaId;
	
	@Inject
	@Preference(nodePath = "org.bbaw.bts.ui.corpus.egy")
	IEclipsePreferences preferences;

	private Integer showTransLangMask = 0;

	@Inject
	@Preference(value = BTSEGYUIConstants.SIGN_TEXT_SHOW_LINE_WIDTH, nodePath = "org.bbaw.bts.ui.corpus.egy")
	private Integer max_line_length;
	

	@Inject
	@Preference(value = BTSEGYUIConstants.PREF_LEMMATIZER_FELXION_DEFAULT, nodePath = "org.bbaw.bts.ui.corpus.egy")
	private Integer defaultFlexion;

	private ElementFigure selectedElement;

	private Composite parentComposite;
	private FlowLayout layout;
	private Figure container;
	private DrawingSpecification drawingSpecifications = new DrawingSpecificationsImplementation();
	private Map<String, IFigure> wordMap;
	protected int selectedIndex;
	private Adapter notifier;
	private boolean notifyWords = true;
	private LineFigure currentLineFigure;
	private int lineIndex = 1;
	private Map<Integer, LineFigure> lineMap = new HashMap<>();
	private MouseListener elementSelectionListener;
	private int cachedIndex;
	private MouseMotionListener mouseMotionListener;
	private KeyListener keyListener;
	private FigureCanvas canvas;
	private Map<String, List<BTSInterTextReference>> relatingObjectsMap;
	private List<BTSObject> continuingRelatingObjects;
	private HashMap<String, List<ElementFigure>> relatingObjectFigureMap;
	private BTSTextContent textContent;
	private BTSObject btsObject;
	private List<Image> imageList = new Vector<Image>(1000);
	private boolean enabled;
	private Font font = JFaceResources.getFontRegistry().get(JFaceResources.DEFAULT_FONT);

	private static final String VERS_FRONTER_MARKER = "\uDB80\uDC81"; //mv
	private static final String VERS_BREAK_MARKER = "\uDB80\uDC80"; //v
	private static final String BROKEN_VERS_MARKER = "\uDB80\uDC82";
	private static final String DISPUTALBE_VERS_MARKER = "\u2E2E\uDB80\uDC80?";
	private static final String DELETED_VERS_MARKER = "{\uDB80\uDC80}";
	private static final String DESTROYED_VERS_MARKER = "[\uDB80\uDC80]";
	private static final String MISSING_VERS_MARKER = "\u2329\uDB80\uDC80\u232A";
	private static final int MAX_IMAGE_SIZE = 200;

	@Inject
	public SignTextComposite(Composite parent) {
		super(parent, SWT.NONE);
		this.parentComposite = parent;
		parent.setLayout(new FillLayout());
		this.setLayout(new FillLayout());
		createEditor();
	}
	
	/**
	 * (De)activates {@link BTSWord}-wise graphical update on model changes.
	 * BTWord objects currently on display in sign text editor get
	 * notified on changes in corresponding database objects. By default, such
	 * notifications lead to updates of the word's graphical representation.
	 * This can temporarily disabled when update is not desirable, e.g. before
	 * save operations. 
	 * @param value
	 */
	public void setNotifyWords(boolean value) {
		notifyWords = value;
	}

	private void createEditor() {
		this.setLayout(new FillLayout());

		notifier = new Adapter() {

			@Override
			public void setTarget(Notifier newTarget) {
				// TODO Auto-generated method stub

			}

			@Override
			public void notifyChanged(final Notification notification) {
			
				if (notifyWords) {
					System.out.println(" notifyChanged " + notification);
					
					sync.asyncExec(new Runnable()
					{
						public void run()
						{
							updateFigureFromWord(notification);
						}
					});
				}

			}

			@Override
			public boolean isAdapterForType(Object type) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Notifier getTarget() {
				// TODO Auto-generated method stub
				return null;
			}
		};

		
		canvas = new FigureCanvas(this);
		// lightWeightSystem = new LightweightSystem(canvas);
		canvas.setData("org.eclipse.e4.ui.css.CssClassName", "SignTextCanvas");
		canvas.setBackground(COLOR_CANVAS_BACKGROUND);
		canvas.setLayout(new FillLayout());
		container = new Figure();
//		container.setBorder(new LineBorder());

		layout = new FlowLayout();
		layout.setHorizontal(false);
		layout.setMajorAlignment(FlowLayout.ALIGN_TOPLEFT);
		layout.setMinorAlignment(FlowLayout.ALIGN_TOPLEFT);
		layout.setMinorSpacing(3);
		container.setLayoutManager(layout);
		container.setBackgroundColor(COLOR_CANVAS_BACKGROUND);

		elementSelectionListener = makeElementSelectionListener();

		mouseMotionListener = new MouseMotionListener() {

			@Override
			public void mouseMoved(MouseEvent me) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseHover(MouseEvent me) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent me) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent me) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseDragged(MouseEvent me) {
				// TODO Auto-generated method stub

			}
		};
		keyListener = new KeyListener() {

			@Override
			public void keyReleased(KeyEvent ke) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent ke) {
				if (ke.keycode == SWT.ARROW_RIGHT) {
					shiftSelection(1, true);
				}
				else if (ke.keycode == SWT.ARROW_LEFT) {
					shiftSelection(-1, false);
				} else if (ke.keycode == SWT.ARROW_DOWN) {
					shiftLineSelection(1);
				} else if (ke.keycode == SWT.ARROW_UP) {
					shiftLineSelection(-1);
				}
			}
		};
		container.setFocusTraversable(true);
		container.addMouseMotionListener(mouseMotionListener);
		container.addKeyListener(keyListener);

		canvas.setContents(container);
		
		this.layout();
		parentComposite.layout();

		max_line_length = canvas.getViewport().getBounds().width;

	}


	@Override
	public void addFocusListener(FocusListener listener) {
		super.addFocusListener(listener);
		canvas.addFocusListener(listener);
	}


	private void shiftLineSelection(int shift) {
		int newLineIndex = lineIndex + shift;
		newLineIndex = newLineIndex > -1 ? newLineIndex : 0;
		int currentIndex = 0;
		if (cachedIndex > 0) {
			currentIndex = cachedIndex;
		} else {
			currentIndex = currentLineFigure.getChildren().indexOf(
					selectedElement);
		}
		currentIndex = currentIndex > -1 ? currentIndex : 0;
		if (newLineIndex < container.getChildren().size()) {
			currentLineFigure = lineMap.get(newLineIndex);
			lineIndex = newLineIndex;
			if (currentIndex < currentLineFigure.getChildren().size()) {
//				ElementFigure figure = (ElementFigure) currentLineFigure
//						.getChildren().get(currentIndex);
				cachedIndex = -1;
				shiftSelection(currentIndex, true);

//				setSelectionInternal(figure);
			} else {
				cachedIndex = currentIndex;
				currentIndex = currentLineFigure.getChildren().size() - 1;
//				ElementFigure figure = (ElementFigure) currentLineFigure
//						.getChildren().get(currentIndex);
//				setSelectionInternal(figure);
				shiftSelection(currentIndex, true);

			}

		}

	}

	private void shiftSelection(int shift, boolean forward) {
		int currentIndex = currentLineFigure.getChildren().indexOf(
				selectedElement);
		int newIndex = currentIndex + shift;
		// Integer i = null;
		// System.out.println(i.toString());
		// System.out.println("currentIndex " + currentIndex + " shift " + shift
		// + " newIndex " + newIndex + " currentLine " + lineIndex);
		// check if current Selection at line end
		
		// refactored so that next figure is a WordFigure
		ElementFigure figure = findWordFigure(newIndex, forward);
		
		if (figure != null)
		{
			setSelectionInternal(figure);
		}
	}

	private ElementFigure findWordFigure(int newIndex, boolean forward) {
		ElementFigure figure = null;
		if (newIndex >= currentLineFigure.getChildren().size()) {
			if (lineIndex < container.getChildren().size() - 1) {
				lineIndex++;
				currentLineFigure = lineMap.get(lineIndex);
				newIndex = 0;
			}
		} else if (newIndex < 0) {
			if (lineIndex > 0) {
				lineIndex--;
				currentLineFigure = lineMap.get(lineIndex);
				newIndex = currentLineFigure.getChildren().size() - 1;
			} else if (lineIndex == 0)
			{
				currentLineFigure = lineMap.get(lineIndex);
				newIndex = currentLineFigure.getChildren().size() - 1;
			}
		}
		figure = findElementFigure(newIndex);
		while (!(figure instanceof WordFigure))
		{
			if (forward)
			{
				newIndex = newIndex + 1;
			}
			else
			{
				newIndex = newIndex - 1;
			}
			if (newIndex >= currentLineFigure.getChildren().size()) {
				if (lineIndex < container.getChildren().size() - 1) {
					lineIndex++;
					currentLineFigure = lineMap.get(lineIndex);
					newIndex = 0;
				}
				else
				{
					break;
				}
			} else if (newIndex < 0) {
				if (lineIndex > 1) {
					lineIndex--;
					if (lineIndex < 1)break;
					currentLineFigure = lineMap.get(lineIndex);
					newIndex = currentLineFigure.getChildren().size() - 1;
				}
				else
				{
					break;
				}
			}
			else
			{
				currentLineFigure = lineMap.get(lineIndex);
			}
			figure = findElementFigure(newIndex);
			if (figure == null) break;
		}
		if (figure == null)
		{
			return null;
		}
		else if (figure instanceof WordFigure)
		{
			return figure;
		}
		else if (ElementFigure.SENTENCE_END.equals(figure.getType()) && lineIndex == lineMap.size() - 1)
		{
			// if it is the very last figure!
			return figure;
		}
		return null;
	}

	private ElementFigure findElementFigure(int newIndex) {
		ElementFigure figure = null;

//		if (newIndex >= currentLineFigure.getChildren().size()) {
//			if (lineIndex < container.getChildren().size() - 1) {
//				lineIndex++;
//				currentLineFigure = lineMap.get(lineIndex);
//				figure = (ElementFigure) currentLineFigure
//						.getChildren().get(0);
//			}
//		} else if (newIndex < 0) {
//			if (lineIndex > 0) {
//				lineIndex--;
//				currentLineFigure = lineMap.get(lineIndex);
//				newIndex = currentLineFigure.getChildren().size() - 1;
//				figure = (ElementFigure) currentLineFigure
//						.getChildren().get(newIndex);
//			}
//		} else {
//			figure = (ElementFigure) currentLineFigure
//					.getChildren()
//					.get(newIndex);
//			
//		}
		try {
			figure = (ElementFigure) currentLineFigure
					.getChildren()
					.get(newIndex);
		} catch (ArrayIndexOutOfBoundsException e) {
			return null;
		}
		catch (IndexOutOfBoundsException e) {
			return null;
		}
		return figure;
	}

	private MouseListener makeElementSelectionListener() {
		MouseListener listener = new MouseListener() {

			@Override
			public void mousePressed(MouseEvent me) {
				if (me.getSource() instanceof ElementFigure) {
					ElementFigure figure = (ElementFigure) me.getSource();
					if (figure.getParent() instanceof LineFigure
							&& figure.getParent() != currentLineFigure) {
						lineIndex = container.getChildren().indexOf(
								figure.getParent());
					}
					setSelectionInternal(figure);
				}
				// System.out.println(me);

			}


			@Override
			public void mouseReleased(MouseEvent me) {
				// System.out.println(me);

			}

			@Override
			public void mouseDoubleClicked(MouseEvent me) {
				// System.out.println(me);

			}

		};
		return listener;
	}

	protected void updateFigureFromWord(Notification notification) {
		BTSWord word = null;
		if (notification.getNotifier() instanceof BTSWord) {
			word = (BTSWord) notification.getNotifier();
		} else if (notification.getNotifier() instanceof BTSGraphic) {
			word = (BTSWord) ((BTSGraphic) notification.getNotifier())
					.eContainer();
		}
		if (word != null) {
			IFigure rect = (IFigure) wordMap.get(word.get_id());
			refreshFigureFromModel(rect, word);
		}
	}

	public void setInput(BTSObject btsObject, BTSTextContent textContent, List<BTSObject> relatingObjects,
			IProgressMonitor monitor, Object localSelectedTextItem) {
		this.textContent = textContent;
		this.btsObject = btsObject;
		this.relatingObjectsMap =  textEditorController
				.fillRelatingObjectsMap(relatingObjects);
		if (textContent != null) {
			loadText();
			this.layout();
			if (localSelectedTextItem != null && localSelectedTextItem instanceof BTSWord)
			{
				IFigure figure = wordMap.get(((BTSIdentifiableItem) localSelectedTextItem).get_id());
				if (figure != null && figure instanceof ElementFigure)
				{
					setSelectionInternal((ElementFigure) figure);
					reveal(figure);
				}
			}
		}
		else {
			purgeAll();
			this.layout();
			parentComposite.layout();
		}
	}


	private void loadText() {
		purgeAll();
		max_line_length = canvas.getViewport().getBounds().width;
		System.out.println("maximum line length: "+max_line_length);
		continuingRelatingObjects = new Vector<BTSObject>();
		// canvas = new FigureCanvas(this);
		// canvas.setBackground(COLOR_CANVAS_BACKGROUND);
		// canvas.setLayout(new FillLayout());
		container = new Figure();
		container.setBorder(new LineBorder());

		layout = new FlowLayout();
		layout.setHorizontal(false);
		layout.setMajorAlignment(FlowLayout.ALIGN_TOPLEFT);
		layout.setMinorAlignment(FlowLayout.ALIGN_TOPLEFT);
		layout.setMinorSpacing(3);
		container.setLayoutManager(layout);
		container.setBackgroundColor(COLOR_CANVAS_BACKGROUND);

		container.setFocusTraversable(true);
		container.addMouseMotionListener(mouseMotionListener);
		container.addKeyListener(keyListener);

		// initialize translation languages mask
		showTransLangMask = 0;
		for (int i=0; i < BTSCoreConstants.LANGS.length; i++) {
			String lang = BTSCoreConstants.LANGS[i];
			String prefVal = BTSEGYUIConstants.SIGN_TEXT_SHOW_TRANSLATION_PREF_PREFIX + lang;
			if (preferences.getBoolean(prefVal, false)) {
				showTransLangMask |= 1<<i;
			}
		}

		wordMap = new HashMap<String, IFigure>();
		for (BTSTextItems item : textContent.getTextItems()) {
			if (item instanceof BTSSenctence) {
				BTSSenctence sentence = (BTSSenctence) item;

				// insert start Sentence
				ElementFigure sentenceStart = makeSentenceStartFigure(sentence);
				appendFigure(sentenceStart);
				for (BTSSentenceItem senItem : sentence.getSentenceItems()) {
					ElementFigure itemFigure = null;
					if (senItem instanceof BTSWord) {
						BTSWord word = (BTSWord) senItem;
						itemFigure = makeWordFigure(word);
						appendFigure(itemFigure);
					}
					else if (senItem instanceof BTSMarker) {
						BTSMarker marker = (BTSMarker) senItem;
						itemFigure = makeMarkerFigure(marker);
						appendFigure(itemFigure);

					}
					else if (senItem instanceof BTSAmbivalence) {
						BTSAmbivalence ambivalence = (BTSAmbivalence) senItem;
						itemFigure = makeAmbivalenceFigure(ambivalence);

					}
					
					if (itemFigure != null) {
						if (relatingObjectsMap != null && relatingObjectsMap.containsKey(senItem.get_id()))
						{
							List<BTSInterTextReference> list = relatingObjectsMap.get(senItem.get_id());
							processReferences(itemFigure, list, senItem);
						}
						if (!continuingRelatingObjects.isEmpty())
						{
							for (BTSObject o : continuingRelatingObjects)
							{
								itemFigure.addRelatingObject(o);
								processStylingAnnotations(itemFigure, o);
								updateRelatingObjectFigureMap(o.get_id(), itemFigure);
							}
							//add continuing relating objects to figure!
						}
					// process relating Objects
					}

				}
				ElementFigure sentenceEnd = makeSentenceEndFigure(sentence);
				appendFigure(sentenceEnd);

			}
		}
		lineIndex = 0;
		currentLineFigure = lineMap.get(lineIndex);
		// firstLine.add(cursor);
		// layout = new FlowLayout();
		// layout.setHorizontal(false);
		// layout.setMajorAlignment(FlowLayout.ALIGN_TOPLEFT);
		// layout.setMinorAlignment(FlowLayout.ALIGN_TOPLEFT);
		// layout.setMinorSpacing(3);
		canvas.setContents(container);
		// container.setLayoutManager(layout);
		
		System.out.println("max line length: "+max_line_length);
		for (FontData fd : JFaceResources.getFont("BBAWLibertine").getFontData()) {
			System.out.println(fd);
		}

		container.setFocusTraversable(true);
		this.layout();
		parentComposite.layout();
	}

	private void processReferences(ElementFigure itemFigure,
			List<BTSInterTextReference> list, BTSSentenceItem senItem) {
			// FIXME ende einer annotation berechnen!!!!!!!!
			for (BTSInterTextReference ref : list)
			{
				BTSObject relatingObject = null;
				if (ref.eContainer() != null && ref.eContainer() instanceof BTSRelation && ref.eContainer().eContainer() != null)
				{
					relatingObject = (BTSObject) ref.eContainer().eContainer();
				}
				else
				{
					continue;
				}
				if (ref.getBeginId() == null || ref.getEndId() == null || ref.getBeginId().equals(ref.getEndId()))
				{
					//1) ref referenziert nur ein Item
					itemFigure.addRelatingObject(relatingObject);
					processStylingAnnotations(itemFigure, relatingObject);
					updateRelatingObjectFigureMap(relatingObject.get_id(), itemFigure);

				}
				else if (ref.getBeginId().equals(senItem.get_id())) {
				// 2) ref ist start
				// annotation erzeugen
					itemFigure.addRelatingObject(relatingObject);
					processStylingAnnotations(itemFigure, relatingObject);
					continuingRelatingObjects.add(relatingObject);
					updateRelatingObjectFigureMap(relatingObject.get_id(), itemFigure);
				// annotation und start position cachen
				
				}
				else if (ref.getEndId().equals(senItem.get_id())){
				// 3) ref ist end
				// annotation aus cache holen - wie?
					itemFigure.addRelatingObject(relatingObject);
					processStylingAnnotations(itemFigure, relatingObject);
					continuingRelatingObjects.remove(relatingObject);
					updateRelatingObjectFigureMap(relatingObject.get_id(), itemFigure);
				}
			}
		
	}

	/** processes rubra and possible other annotations that concern styling of wordfigure.
	 * @param itemFigure
	 * @param relatingObject
	 */
	private void processStylingAnnotations(ElementFigure itemFigure,
			BTSObject relatingObject) {
		if (relatingObject instanceof BTSAnnotation && "rubrum".equals(relatingObject.getType()) 
				&& itemFigure instanceof WordFigure)
		{
			for (Object fig : itemFigure.getChildren()) {
				if (fig instanceof TypedLabel && ((TypedLabel)fig).getType() == TypedLabel.TRANSLITERATION) {
					 ((TypedLabel)fig).setForegroundColor(BTSUIConstants.COLOR_RUBRUM);
				}
			}
		}
		
	}

	private void updateRelatingObjectFigureMap(String relatingObjectID,
			ElementFigure itemFigure) {
		if (relatingObjectFigureMap == null)
		{
			relatingObjectFigureMap = new HashMap<String, List<ElementFigure>>();
		}
		List<ElementFigure> list = relatingObjectFigureMap.get(relatingObjectID);
		if (list == null)
		{
			list = new Vector<ElementFigure>(4);
			relatingObjectFigureMap.put(relatingObjectID, list);
		}
		if (!list.contains(itemFigure))
		{
			list.add(itemFigure);
		}
	}

	private ElementFigure makeAmbivalenceFigure(BTSAmbivalence ambivalence) {

		ElementFigure ambivalenceStart = makeAmbivalenceStartFigure(ambivalence);
		appendFigure(ambivalenceStart);

		for (BTSLemmaCase lemmaCase : ambivalence.getCases()) {
			ElementFigure caseFigure = makeCaseFigure(lemmaCase);
			appendFigure(caseFigure);

			for (BTSAmbivalenceItem amItem : lemmaCase.getScenario()) {
				ElementFigure itemFigure = null;
				if (amItem instanceof BTSWord) {
					BTSWord word = (BTSWord) amItem;
					itemFigure = makeWordFigure(word);
					// appendWord(word);
				} else if (amItem instanceof BTSMarker) {
					BTSMarker marker = (BTSMarker) amItem;
					itemFigure = makeMarkerFigure(marker);
					appendFigure(itemFigure);
				}
				if (itemFigure != null && amItem instanceof BTSSentenceItem) {
					BTSSentenceItem  senItem = (BTSSentenceItem) amItem;

					if (relatingObjectsMap != null && relatingObjectsMap.containsKey(senItem.get_id()))
					{
						List<BTSInterTextReference> list = relatingObjectsMap.get(senItem.get_id());
						processReferences(itemFigure, list, senItem);
					}
					if (!continuingRelatingObjects.isEmpty())
					{
						for (BTSObject o : continuingRelatingObjects)
						{
							itemFigure.addRelatingObject(o);
							processStylingAnnotations(itemFigure, o);
							updateRelatingObjectFigureMap(o.get_id(), itemFigure);
						}
						//add continuing relating objects to figure!
					}
				// process relating Objects
				}
			}

		}
		ElementFigure ambivalenceEnd = makeAmbivalenceEndFigure(ambivalence);
		appendFigure(ambivalenceEnd);

		return null;
	}

	private ElementFigure makeCaseFigure(BTSLemmaCase lemmaCase) {
		MarkerFigure fig = new MarkerFigure("case");
		// add name
		if (lemmaCase.getName() != null && !"".equals(lemmaCase.getName())) {
			org.eclipse.draw2d.Label l = new org.eclipse.draw2d.Label();
			l.setText(lemmaCase.getName());
			fig.add(l);
		}
		fig.setType(ElementFigure.LEMMA_CASE);
		fig.setModelObject(lemmaCase);
		fig.setSize(15, 90);
		fig.addMouseListener(elementSelectionListener);
		return fig;
	}

	private ElementFigure makeAmbivalenceEndFigure(BTSAmbivalence ambivalence) {
		AmbivalenceEndFigure fig = new AmbivalenceEndFigure("");

		fig.setType(ElementFigure.AMBIVALENCE_END);
		fig.setModelObject(ambivalence);
		fig.setSize(15, 90);
		fig.addMouseListener(elementSelectionListener);
		return fig;
	}

	private ElementFigure makeAmbivalenceStartFigure(BTSAmbivalence ambivalence) {
		AmbivalenceStartFigure fig = new AmbivalenceStartFigure("");

		fig.setType(ElementFigure.AMBIVALENCE_START);
		fig.setModelObject(ambivalence);
		fig.setSize(15, 90);
		fig.addMouseListener(elementSelectionListener);
		return fig;
	}

	private ElementFigure makeMarkerFigure(BTSMarker marker) {
		String mType = marker.getType();
		if (mType != null)
		{
			if (mType.equals(BTSConstants.TEXT_VERS_FRONTIER_MARKER)) {
				mType = VERS_FRONTER_MARKER;
			} else if (marker.getType().equals(
					BTSConstants.TEXT_VERS_BREAK_MARKER)) {
				mType = VERS_BREAK_MARKER;
			} else if (marker.getType().equals(
					BTSConstants.BROKEN_VERS_MARKER)) {
				mType = BROKEN_VERS_MARKER;
			}else if (marker.getType().equals(
					BTSConstants.DESTRUCTION_MARKER)) {
				mType = "destruction";
			}
			else if (marker.getType().equals(
					BTSConstants.DISPUTABLE_VERS_MARKER)) {
				mType = DISPUTALBE_VERS_MARKER;
			}else if (marker.getType().equals(
					BTSConstants.DESTROYED_VERS_MARKER)) {
				mType = DESTROYED_VERS_MARKER;
			}else if (marker.getType().equals(
					BTSConstants.DELETED_VERS_MARKER)) {
				mType = DELETED_VERS_MARKER;
			}else if (marker.getType().equals(
					BTSConstants.MISSING_VERS_MARKER)) {
				mType = MISSING_VERS_MARKER;
			}
			else if (marker.getType().equals(
					BTSConstants.DESTROYEDVERSMARKER)) {
				mType = (BTSConstants.DESTROYEDVERSMARKER_SIGN);
				
			}else if (marker.getType().equals(
					BTSConstants.DELETEDVERSMARKER)) {
				mType = (BTSConstants.DELETEDVERSMARKER_SIGN);
				
			}else if (marker.getType().equals(
					BTSConstants.DISPUTABLEVERSMARKER)) {
				mType = (BTSConstants.DISPUTABLEVERSMARKER_SIGN);
				
			}else if (marker.getType().equals(
					BTSConstants.RESTORATIONOVERRASURMARKER)) {
				mType = (BTSConstants.RESTORATIONOVERRASURMARKER_SIGN);
				
			}else if (marker.getType().equals(
					BTSConstants.ANCIENTEXPANDEDMARKER)) {
				mType = (BTSConstants.ANCIENTEXPANDEDMARKER_SIGN);
				
			}else if (marker.getType().equals(
					BTSConstants.RASURMARKER)) {
				mType = (BTSConstants.RASURMARKER_SIGN);
				
			}else if (marker.getType().equals(
					BTSConstants.EMENDATIONVERSMARKER)) {
				mType = (BTSConstants.EMENDATIONVERSMARKER_SIGN);
				
			}else if (marker.getType().equals(
					BTSConstants.DESTROYEDVERSFRONTIERMARKER)) {
				mType = (BTSConstants.DESTROYEDVERSFRONTIERMARKER_SIGN);
				
			}else if (marker.getType().equals(
					BTSConstants.PARTIALDESTROYEDVERSMARKER)) {
				mType = (BTSConstants.PARTIALDESTROYEDVERSMARKER_SIGN);
				
			}else if (marker.getType().equals(
					BTSConstants.PARTIALDESTROYEDDISPUTABLEVERSMARKER)) {
				mType = (BTSConstants.PARTIALDESTROYEDDISPUTABLEVERSMARKER_SIGN);
				
			}else if (marker.getType().equals(
					BTSConstants.DESTROYEDDISPUTABLEVERSFRONTIERMARKER)) {
				mType = (BTSConstants.DESTROYEDDISPUTABLEVERSFRONTIERMARKER_SIGN);
				
			}else if (marker.getType().equals(
					BTSConstants.DISPUTABLEDESTROYEDVERSMARKER)) {
				mType = (BTSConstants.DISPUTABLEDESTROYEDVERSMARKER_SIGN);
				
			}
			
			else if (marker.getType().equals(
					BTSConstants.DELETEDDISPUTABLEVERSMARKER)) {
				mType = (BTSConstants.DELETEDDISPUTABLEVERSMARKER_SIGN);
				
			}
			else if (marker.getType().equals(
					BTSConstants.MISSINGDISPUTABLEVERSMARKER)) {
				mType = (BTSConstants.MISSINGDISPUTABLEVERSMARKER_SIGN);
				
			}else if (marker.getType().equals(
					BTSConstants.DISPUTABLEDELETEDVERSMARKER)) {
				mType = (BTSConstants.DISPUTABLEDELETEDVERSMARKER_SIGN);
				
			}else if (marker.getType().equals(
					BTSConstants.PARTIALDESTROYEDDELETEDVERSMARKER)) {
				mType = (BTSConstants.PARTIALDESTROYEDDELETEDVERSMARKER_SIGN);
				
			}else if (marker.getType().equals(
					BTSConstants.DESTROYEDDELETEDVERSMARKER)) {
				mType = (BTSConstants.DESTROYEDDELETEDVERSMARKER_SIGN);
				
			}else if (marker.getType().equals(
					BTSConstants.DELETEDDESTROYEDVERSMARKER)) {
				mType = (BTSConstants.DELETEDDESTROYEDVERSMARKER_SIGN);
				
			}
		}
		else
		{
			mType = "##";
		}
		MarkerFigure fig = new MarkerFigure(mType);
		// add name
		if (marker.getName() != null && !"".equals(marker.getName())) {
			org.eclipse.draw2d.Label l = new org.eclipse.draw2d.Label();
			l.setText(marker.getName());
			fig.add(l);
		}
		fig.setType(ElementFigure.MARKER);
		fig.setModelObject(marker);
		fig.setSize(15, 90);
		fig.addMouseListener(elementSelectionListener);
		return fig;
	}

	private void purgeAll() {
		
		// dispose all images
		for (Image im : imageList)
			if (!im.isDisposed())
				im.dispose();
		imageList.clear();
		if (container != null) {
			container.removeAll();

		}
		container = null;
		// if (canvas != null) {
		// canvas.setContents(null);
		// canvas.dispose();
		// }
		// canvas = null;
		lineIndex = 0;
		cachedIndex = -1;
		if (wordMap != null) {
			wordMap.clear();
			lineMap.clear();
		}
		if (currentLineFigure != null) {
			currentLineFigure = null;
		}
		relatingObjectFigureMap = null;
	}

	/**
	 * For a {@link BTSWord}, determine which background color is to be used for rendering an unselected {@link WordFigure},
	 * based on whether a Lemma Key is present for the given Word, i.e. whether the word has already been lemmatized. 
	 * @param word {@link BTSWord} object
	 * @return {@link BTSUIConstants#COLOR_LEMMA} if lemmatized, {@link #COLOR_WORD_DESELECTED} otherwise
	 */
	private Color colorWordDeselected(BTSWord word) {
		return (word.getLKey() != null && !word.getLKey().isEmpty()) ? 
				BTSUIConstants.COLOR_LEMMA : COLOR_WORD_DESELECTED;
	}

	private ElementFigure makeWordFigure(BTSWord word) {
		TypedLabel label = new TypedLabel();
		label.setText(word.getWChar());
		label.setType(TypedLabel.TRANSLITERATION);

		final WordFigure rect = new WordFigure(label);
		rect.setBackgroundColor(colorWordDeselected(word));
		rect.setModelObject(word);
		rect.setType(ElementFigure.WORD);

		wordMap.put(word.get_id(), rect);
		// gridLayout = new GridLayout();
		// gridLayout.numColumns = 1;
		// gridLayout.makeColumnsEqualWidth = false;

		ToolbarLayout tl = new ToolbarLayout();
		tl.setHorizontal(false);
		tl.setSpacing(5);
		String mdc = transformWordToMdCString(word);

		if (showHieroglyphs)
		{
		ImageFigure imageFigure = new CompartementImageFigure();
		// System.out.println("mdc " + mdc);
			
		if (mdc != null && !"".equals(mdc) && imageList.size() < MAX_IMAGE_SIZE)
		{
			try {
				Image image = transformToSWT(getImageData(mdc));
				//			String path = "E:/dev_resources/icons_48/save.png"; //$NON-NLS-1$
				//
				// image = new Image(Display.getDefault(), path);
				imageFigure.setImage(image);
			} catch (MDCSyntaxError e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if (mdc != null && !"".equals(mdc))
		{
			rect.setMdc(mdc);
		}
		// rect.getAttributesCompartment().add(imageFigure);
		rect.setImageFigure(imageFigure);
		rect.add(imageFigure);
		}

		if (showLemmaId)
		{
			// add lemma key
			addLKeyToWordFigure(word, rect);
		}
		
		if (showFlexion)
		{
			// add flexion code
			addFCodeToWordFigure(word, rect);
		}

		for (int i=0; i<BTSCoreConstants.LANGS.length; i++) {
			String lang = BTSCoreConstants.LANGS[i];
			if ((showTransLangMask>>i & 1) == 1) {
				addTransToWordFigure(word, rect, lang);
			}
		}
		rect.setSize(rect.calculateWidth(), 290);
		rect.addFigureListener(new FigureListener() {

			@Override
			public void figureMoved(IFigure source) {

				// Integer n = null;
				// System.out.println(n.toString());

			}
		});
		rect.addMouseListener(elementSelectionListener);
		rect.setLayoutManager(tl);

		if (!word.eAdapters().contains(notifier)) {
			word.eAdapters().add(notifier);
		}
		return rect;
	}

	private void addTransToWordFigure(BTSWord word, WordFigure rect,
			String language) {
		TypedLabel l = new TypedLabel();
		l.setTranslationLang(language);
		if (word.getTranslation() != null) {
			String trans = word.getTranslation().getTranslationStrict(language);
			if (trans != null && !"".equals(trans)) {
				l.setText(language + ": " + trans);
			}
		}
		rect.add(l);
	}

	private void addFCodeToWordFigure(BTSWord word, WordFigure rect) {
		TypedLabel l = new TypedLabel();
		l.setType(TypedLabel.FLEXION);
		if (word.getFlexCode() != null && !"".equals(word.getFlexCode())) {
			l.setText(word.getFlexCode());
			l.setIcon(resourceProvider.getImage(Display.getCurrent(), BTSResourceProvider.IMG_FLEXION));
		}
		rect.add(l);
	}

	private void addLKeyToWordFigure(BTSWord word, WordFigure wordfigure) {
		// FIXME load lemma object and show lemma transliteration
		TypedLabel l = new TypedLabel();
		l.setType(TypedLabel.LEMMA);
		if (word.getLKey() != null && !"".equals(word.getLKey())) {
			l.setText(word.getLKey());
			l.setIcon(resourceProvider.getImage(Display.getCurrent(),
					BTSResourceProvider.IMG_LEMMA));
		}
		wordfigure.add(l);
	}

	private void appendFigure(ElementFigure figure) {
		if (currentLineFigure == null) {
			currentLineFigure = makeLineFigure();
		}
		int len = figure.calculateWidth() + 2;
				
		System.out.println("line leng " + (currentLineFigure.getSpaceLength() + len) + " max " + max_line_length); 
		if (figure.getType().equals(ElementFigure.SENTENCE_START)) {
			currentLineFigure = makeLineFigure();
			currentLineFigure.add(figure);
		} else if (figure.getType().equals(ElementFigure.SENTENCE_END)) {
			currentLineFigure.add(figure);
		} else if (currentLineFigure.getSpaceLength() + len <= max_line_length) {
			currentLineFigure.add(figure);
		} else   {
			currentLineFigure = makeLineFigure();
			currentLineFigure.add(figure);
		}
		// System.out.println("currentLineFigure children size "
		// + currentLineFigure.getChildren().size());
		// System.out.println("add figure "
		// + figureCounter);
	}

	private LineFigure makeLineFigure() {
		LineFigure fig = new LineFigure();
		fig.setSize(400, 190);
		lineMap.put(lineIndex++, fig);
		container.add(fig);
		ToolbarLayout l = new ToolbarLayout();
		l.setMinorAlignment(ToolbarLayout.ALIGN_CENTER);
		l.setStretchMinorAxis(false);
		l.setSpacing(2);
		l.setHorizontal(true);
		fig.setLayoutManager(l);
		return fig;
	}

	private ElementFigure makeSentenceStartFigure(BTSSenctence sentence) {
		MarkerFigure fig = new MarkerFigure(" § ");
		fig.setModelObject(sentence);
		fig.setType(ElementFigure.SENTENCE_START);
		fig.setSize(15, 90);
		fig.addMouseListener(elementSelectionListener);
		return fig;
	}

	private ElementFigure makeSentenceEndFigure(BTSSenctence sentence) {
		MarkerFigure fig = new MarkerFigure(" § ");
		fig.setModelObject(sentence);
		fig.setType(ElementFigure.SENTENCE_END);
		fig.setSize(15, 90);
		fig.addMouseListener(elementSelectionListener);
		return fig;
	}


	private void setDeselected(ElementFigure figure, int eventType) {
		if (figure != null) {
			if (figure instanceof WordFigure) {
				figure.setBackgroundColor(
						eventType == 1 ? BTSUIConstants.COLOR_LEMMA :  
						colorWordDeselected((BTSWord)figure.getModelObject()));
			} else if (figure instanceof MarkerFigure) {
				figure.setBackgroundColor(COLOR_MARKER_DESELECTED);
			}else if (figure instanceof AmbivalenceStartFigure || figure instanceof AmbivalenceEndFigure) {
				figure.setBackgroundColor(BTSUIConstants.VIEW_FOREGROUND_DESELECTED_COLOR);
			}
			figure.repaint();
		}

	}


	private void setSelectionInternal(ElementFigure figure) {
		setSelectionInternal(figure, 0);
	}


	private void setSelectionInternal(ElementFigure figure, int eventType) {
		System.out.println("figure width: "+figure.calculateWidth());
		if (figure.getParent() instanceof LineFigure) {
			if (figure.getParent() != currentLineFigure) {
				currentLineFigure = (LineFigure) figure.getParent();
			}
		}
		if (figure != selectedElement) {
			ElementFigure oldSelection = selectedElement;
			setDeselected(oldSelection, eventType);
			selectedElement = figure;
			try {
				reveal(selectedElement);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		if (figure instanceof WordFigure) {
			// check if mdc image is loaded
			WordFigure wordFigure = (WordFigure)figure;
			if (wordFigure.getMdc() != null)
			{
				try {
					Image image = transformToSWT(getImageData(wordFigure.getMdc()));
					wordFigure.getImageFigure().setImage(image);
				} catch (MDCSyntaxError e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				wordFigure.setMdc(null);
			}
			figure.setBackgroundColor(COLOR_WORD_SELECTED);
		} else if (figure instanceof MarkerFigure) {
			figure.setBackgroundColor(COLOR_MARKER_SELECTED);
		}else if (figure instanceof AmbivalenceStartFigure || figure instanceof AmbivalenceEndFigure) {
			figure.setBackgroundColor(COLOR_MARKER_SELECTED);
		}
		figure.repaint();
		// else if (figure instanceof WordFigure) {
		// figure.setBackgroundColor(COLOR_WORD_SELECTED);
		// }

		if (parentEditor != null) {
			Event e = new Event();
			e.widget = this;
			BTSTextSelectionEvent event = new BTSTextSelectionEvent(e,
					btsObject);
			event.type = eventType;
			event.data = textContent.eContainer();
			event.addRelatingObjects(((ElementFigure)figure).getRelatingObjects());
			event.addSelectedItem((BTSIdentifiableItem) figure.getModelObject());
			event.addInterTextReferences(((ElementFigure)figure).getInterTextReferences());
			parentEditor.setEditorSelection(event);
		}
	}


	public void reveal(IFigure target) {
		Viewport port = canvas.getViewport();
		Rectangle exposeRegion = target.getBounds().getCopy();
		target = target.getParent();
		while (target != null && target != port) {
			target.translateToParent(exposeRegion);
			target = target.getParent();
		}
		exposeRegion.expand(5, 5);

		Dimension viewportSize = port.getClientArea().getSize();

		Point topLeft = exposeRegion.getTopLeft();
		Point bottomRight = exposeRegion.getBottomRight().translate(
				viewportSize.getNegated());
		Point finalLocation = new Point();
		if (viewportSize.width < exposeRegion.width)
			finalLocation.x = Math.min(bottomRight.x,
					Math.max(topLeft.x, port.getViewLocation().x));
		else
			finalLocation.x = Math.min(topLeft.x,
					Math.max(bottomRight.x, port.getViewLocation().x));

		if (viewportSize.height < exposeRegion.height)
			finalLocation.y = Math.min(bottomRight.y,
					Math.max(topLeft.y, port.getViewLocation().y));
		else
			finalLocation.y = Math.min(topLeft.y,
					Math.max(bottomRight.y, port.getViewLocation().y));

		canvas.scrollSmoothTo(finalLocation.x, finalLocation.y);
	}


	private Image transformToSWT(BufferedImage bufferedImage) {
		Image image = null;
		if (bufferedImage.getColorModel() instanceof DirectColorModel) {
			DirectColorModel colorModel = (DirectColorModel) bufferedImage
					.getColorModel();
			PaletteData palette = new PaletteData(colorModel.getRedMask(),
					colorModel.getGreenMask(), colorModel.getBlueMask());
			ImageData data = new ImageData(bufferedImage.getWidth(),
					bufferedImage.getHeight(), colorModel.getPixelSize(),
					palette);
			for (int y = 0; y < data.height; y++) {
				for (int x = 0; x < data.width; x++) {
					int rgb = bufferedImage.getRGB(x, y);
					int pixel = palette.getPixel(new RGB((rgb >> 16) & 0xFF,
							(rgb >> 8) & 0xFF, rgb & 0xFF));
					data.setPixel(x, y, pixel);
					if (colorModel.hasAlpha()) {
						data.setAlpha(x, y, (rgb >> 24) & 0xFF);
					}
				}
			}
			image = new Image(Display.getCurrent(), data);
		} else if (bufferedImage.getColorModel() instanceof IndexColorModel) {
			IndexColorModel colorModel = (IndexColorModel) bufferedImage
					.getColorModel();
			int size = colorModel.getMapSize();
			byte[] reds = new byte[size];
			byte[] greens = new byte[size];
			byte[] blues = new byte[size];
			colorModel.getReds(reds);
			colorModel.getGreens(greens);
			colorModel.getBlues(blues);
			RGB[] rgbs = new RGB[size];
			for (int i = 0; i < rgbs.length; i++) {
				rgbs[i] = new RGB(reds[i] & 0xFF, greens[i] & 0xFF,
						blues[i] & 0xFF);
			}
			PaletteData palette = new PaletteData(rgbs);
			ImageData data = new ImageData(bufferedImage.getWidth(),
					bufferedImage.getHeight(), colorModel.getPixelSize(),
					palette);
			data.transparentPixel = colorModel.getTransparentPixel();
			WritableRaster raster = bufferedImage.getRaster();
			int[] pixelArray = new int[1];
			for (int y = 0; y < data.height; y++) {
				for (int x = 0; x < data.width; x++) {
					raster.getPixel(x, y, pixelArray);
					data.setPixel(x, y, pixelArray[0]);
				}
			}
			image = new Image(Display.getCurrent(), data);
		}
		imageList .add(image);
		return image;

	}


	private BufferedImage getImageData(String topItemList)
			throws MDCSyntaxError {
		BufferedImage result;
		{
			MDCDrawingFacade facade = new MDCDrawingFacade();
			facade.setDrawingSpecifications(drawingSpecifications);
			facade.setMaxSize(5000, 45);
			facade.setCadratHeight(30);
			result = facade.createImage(topItemList);
		}
		return result;
	}


	private String transformWordToMdCString(BTSWord word) {
		String mdc = "";
		// if (!word.getGraphics().isEmpty()) {
		// for (BTSGraphic graphic : word.getGraphics()) {
		// mdc += graphic.getCode();
		// }
		// }
		mdc = textEditorController.transformWordToMdCString(word, -1);
		return mdc; // mdc;
	}


	public void setTextSelectionEvent(String event) {
		int currentIndex = currentLineFigure.getChildren().indexOf(
				selectedElement);
		refreshFigureFromModel(selectedElement, null);
		if (event.equals(BTSUIConstants.EVENT_TEXT_SELECTION_ALL_START)) {

			lineIndex = 0;
			shiftLineSelection(-1);
//			int currentIndex = currentLineFigure.getChildren().indexOf(
//					selectedElement);
			shiftSelection(-currentIndex, true);
		} else if (event.equals(BTSUIConstants.EVENT_TEXT_SELECTION_LINE_START)) {
//			int currentIndex = currentLineFigure.getChildren().indexOf(
//					selectedElement);
			shiftSelection(-currentIndex, true);
		} else if (event.equals(BTSUIConstants.EVENT_TEXT_SELECTION_PREVIOUS)) {
			shiftSelection(-1, false);

		} else if (event.equals(BTSUIConstants.EVENT_TEXT_SELECTION_NEXT)) {
			shiftSelection(1, true);
		} else if (event.equals(BTSUIConstants.EVENT_TEXT_SELECTION_LINE_END)) {
//			int currentIndex = currentLineFigure.getChildren().indexOf(
//					selectedElement);
			int shift = currentLineFigure.getChildren().size() - currentIndex
					- 1;
			shiftSelection(shift, false);
		} else if (event.equals(BTSUIConstants.EVENT_TEXT_SELECTION_ALL_END)) {
			int lshift = container.getChildren().size() - lineIndex - 1;
			shiftLineSelection(lshift);
			currentIndex = currentLineFigure.getChildren().indexOf(
					selectedElement);
//			int currentIndex = currentLineFigure.getChildren().indexOf(
//					selectedElement);
			int shift = currentLineFigure.getChildren().size() - currentIndex
					- 1;
			shiftSelection(shift, false);
		}
		else if (event.equals(BTSUIConstants.EVENT_TEXT_SELECTION_NEXT_UNLEMMATIZED)) {
			ElementFigure figure = findUnprocessedWordFigure(currentIndex +1, 0);
			if (figure != null)
				setSelectionInternal(figure, 1);
		}
		else if (event.equals(BTSUIConstants.EVENT_TEXT_SELECTION_NEXT_UNHIEROGLYPHED)) {
			ElementFigure figure = findUnprocessedWordFigure(currentIndex +1, 1);
			if (figure != null)
				setSelectionInternal(figure, 1);
		}
		else if (event.equals(BTSUIConstants.EVENT_TEXT_SELECTION_NEXT_UNFLEXIONED)) {
			ElementFigure figure = findUnprocessedWordFigure(currentIndex +1, 2);
			if (figure != null)
				setSelectionInternal(figure, 1);
		}
	}


	private ElementFigure findUnprocessedWordFigure(int newIndex, int type) {
		ElementFigure figure = null;
		if (newIndex >= currentLineFigure.getChildren().size()) {
			if (lineIndex < container.getChildren().size() - 1) {
				lineIndex++;
				currentLineFigure = lineMap.get(lineIndex);
				newIndex = 0;
			}
		} else if (newIndex < 0) {
			if (lineIndex > 0) {
				lineIndex--;
				currentLineFigure = lineMap.get(lineIndex);
				newIndex = currentLineFigure.getChildren().size() - 1;
			}
		}
		figure = findElementFigure(newIndex);
		while (!unprocessedWord(figure, type))
		{
			newIndex = newIndex + 1;
			if (newIndex >= currentLineFigure.getChildren().size()) {
				if (lineIndex < container.getChildren().size() - 1) {
					lineIndex++;
					currentLineFigure = lineMap.get(lineIndex);
					newIndex = 0;
				}
				else
				{
					break;
				}
			} else if (newIndex < 0) {
				if (lineIndex > 1) {
					lineIndex--;
					if (lineIndex < 1)break;
					currentLineFigure = lineMap.get(lineIndex);
					newIndex = currentLineFigure.getChildren().size() - 1;
				}
				else
				{
					break;
				}
			}
			else
			{
				currentLineFigure = lineMap.get(lineIndex);
			}
			figure = findElementFigure(newIndex);
			if (figure == null) break;
		}
		if (figure == null) return null;
		else if (figure instanceof WordFigure)
		{
			return figure;
		}
		else if (ElementFigure.SENTENCE_END.equals(figure.getType()) && lineIndex == lineMap.size() - 1)
		{
			// if it is the very last figure!
			return figure;
		}
		return null;
	}


	private boolean unprocessedWord(ElementFigure figure, int type ) {
		if (figure instanceof WordFigure)
		{
			Object o = ((WordFigure)figure).getModelObject();
			if (o instanceof BTSWord)
			{
				BTSWord w = (BTSWord) o;
				if (type == 0)
				{
					return (w.getLKey() == null || w.getLKey().trim().length() == 0);
				}
				else if (type == 1)
				{
					return (w.getGraphics() == null || w.getGraphics().isEmpty());
				}
				else if (type == 2)
				{
					if (w.getFlexCode() == null || w.getFlexCode().trim().length() == 0)
					{
						return true;
					}
					Integer i = null;
					try {
						i = new Integer(w.getFlexCode());
					} catch (NumberFormatException e) {
					}
					if (i != null && i.intValue() == defaultFlexion)
					{
						return true;
					}
					return false;
				}
			}
		}
		return false;
	}


	private void refreshFigureFromModel(IFigure figure, BTSWord word) {
		if (figure instanceof WordFigure)
		{
			WordFigure wf = (WordFigure) figure;
			Object o = wf.getModelObject();
			if (word == null && o instanceof BTSWord)
			{
				word = (BTSWord) o;
			}
			boolean lset = false;
			boolean fset = false;
			for (Object fig : wf.getChildren()) {
				if (fig instanceof ImageFigure) {
					ImageFigure imf = (ImageFigure) fig;
					String mdc = transformWordToMdCString(word);
					try {
						if (imf.getImage() != null)
							if (!imf.getImage().isDisposed())
								imf.getImage().dispose();
						imf.setImage(transformToSWT(getImageData(mdc)));
					} catch (MDCSyntaxError e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				else if (fig instanceof TypedLabel) {
					TypedLabel l = (TypedLabel) fig;
					switch (l.getType()) {
						case TypedLabel.LEMMA :
							l.setText(word.getLKey());
							lset = true;
							break;
						case TypedLabel.FLEXION :
							l.setText(word.getFlexCode());
							fset = true;
							break;
						case TypedLabel.TRANSLITERATION :
							l.setText(word.getWChar());
							break;
						case TypedLabel.TRANSLATION :
							if (word.getTranslation() != null) {
								String lang = l.getTranslationLang();
								String trans = word.getTranslation().getTranslationStrict(lang);
								l.setText(lang + ":" + (trans != null ? trans : ""));
							}
							break;
					}
				}
				
			}
			if (showLemmaId && !lset && word.getLKey() != null && !"".equals(word.getLKey()))
			{
				addLKeyToWordFigure(word, wf);
			}
			if (showFlexion && !fset && word.getFlexCode() != null && !"".equals(word.getFlexCode()))
			{
				addFCodeToWordFigure(word, wf);
			}
			//FIXME add hieroglyphs
		}
		
	}


	@Override
	public boolean setFocus() {

		// loadText();
		// canvas.layout();
		return true;
	}


	public void addRelatingObjectNotification(
			BTSModelUpdateNotification notification) {
		if (notification.getObject() instanceof BTSObject && relatingObjectFigureMap != null)
		{
			BTSObject object = (BTSObject) notification.getObject();
			List<ElementFigure> figures = relatingObjectFigureMap.get(object.get_id());
			// remove old annotations
			if (figures != null) {
				for (ElementFigure fig : figures)
				{
					fig.getRelatingObjects().remove(object);
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
							&& rel.getObjectId().equals(btsObject.get_id())) {
						for (BTSInterTextReference ref : rel.getParts()) {
								if (ref.getBeginId() != null)  {
									ElementFigure fig = (ElementFigure) wordMap.get(ref.getBeginId());
									if (fig == null) continue;
									fig.addRelatingObject(object);
									processStylingAnnotations(fig, object);
									updateRelatingObjectFigureMap(object.get_id(), fig);
									
									// TODO add relating object to all figures between begin and end figure!
									if (ref.getEndId() != null && ! ref.getEndId().equals(ref.getBeginId()))  {
										ElementFigure figEnd = (ElementFigure) wordMap.get(ref.getEndId());
										if (figEnd != null) {
											figEnd.addRelatingObject(object);
											processStylingAnnotations(fig, object);
											updateRelatingObjectFigureMap(object.get_id(), figEnd);
										}
									} 
								} 
						}
					}
				}
			}
		}
	}

	public void clearContent() {
		canvas.redraw();
	}


	@Override
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	@Override
	public void setEditorSelection(Object selection) {
		// TODO Auto-generated method stub
		
	}

}
