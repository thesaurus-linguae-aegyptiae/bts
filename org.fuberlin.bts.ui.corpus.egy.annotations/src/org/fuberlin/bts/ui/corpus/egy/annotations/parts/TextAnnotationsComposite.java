package org.fuberlin.bts.ui.corpus.egy.annotations.parts;

import java.awt.image.BufferedImage;
import java.awt.image.DirectColorModel;
import java.awt.image.IndexColorModel;
import java.awt.image.WritableRaster;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import javax.inject.Inject;

import jsesh.mdc.MDCSyntaxError;
import jsesh.mdcDisplayer.draw.MDCDrawingFacade;
import jsesh.mdcDisplayer.preferences.DrawingSpecification;
import jsesh.mdcDisplayer.preferences.DrawingSpecificationsImplementation;

import org.bbaw.bts.btsmodel.BTSComment;
import org.bbaw.bts.btsmodel.BTSConfig;
import org.bbaw.bts.btsmodel.BTSConfigItem;
import org.bbaw.bts.btsmodel.BTSIdentifiableItem;
import org.bbaw.bts.btsmodel.BTSInterTextReference;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.BTSRelation;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.commons.corpus.BTSCorpusConstants;
import org.bbaw.bts.core.commons.corpus.CorpusUtils;
import org.bbaw.bts.core.controller.generalController.BTSConfigurationController;
import org.bbaw.bts.core.corpus.controller.generalController.PassportConfigurationController;
import org.bbaw.bts.core.corpus.controller.partController.AnnotationPartController;
import org.bbaw.bts.core.corpus.controller.partController.BTSTextEditorController;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAmbivalence;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAmbivalenceItem;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAnnotation;
import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject;
import org.bbaw.bts.corpus.btsCorpusModel.BTSGraphic;
import org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaCase;
import org.bbaw.bts.corpus.btsCorpusModel.BTSMarker;
import org.bbaw.bts.corpus.btsCorpusModel.BTSSenctence;
import org.bbaw.bts.corpus.btsCorpusModel.BTSSentenceItem;
import org.bbaw.bts.corpus.btsCorpusModel.BTSText;
import org.bbaw.bts.corpus.btsCorpusModel.BTSTextContent;
import org.bbaw.bts.corpus.btsCorpusModel.BTSTextItems;
import org.bbaw.bts.corpus.btsCorpusModel.BTSWord;
import org.bbaw.bts.searchModel.BTSModelUpdateNotification;
import org.bbaw.bts.ui.commons.corpus.events.BTSTextSelectionEvent;
import org.bbaw.bts.ui.commons.corpus.interfaces.IBTSEditor;
import org.bbaw.bts.ui.commons.corpus.text.BTSModelAnnotation;
import org.bbaw.bts.ui.commons.corpus.util.BTSEGYUIConstants;
import org.bbaw.bts.ui.commons.utils.BTSUIConstants;
import org.bbaw.bts.ui.corpus.util.AnnotationToolbarItemCreator;
import org.bbaw.bts.ui.egy.textSign.support.AmbivalenceEndFigure;
import org.bbaw.bts.ui.egy.textSign.support.AmbivalenceStartFigure;
import org.bbaw.bts.ui.egy.textSign.support.CompartementImageFigure;
import org.bbaw.bts.ui.egy.textSign.support.ElementFigure;
import org.bbaw.bts.ui.egy.textSign.support.LineFigure;
import org.bbaw.bts.ui.egy.textSign.support.MarkerFigure;
import org.bbaw.bts.ui.egy.textSign.support.TypedLabel;
import org.bbaw.bts.ui.egy.textSign.support.WordFigure;
import org.bbaw.bts.ui.resources.BTSResourceProvider;
import org.eclipse.core.internal.preferences.EclipsePreferences;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.preferences.ConfigurationScope;
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
import org.eclipse.draw2d.text.FlowPage;
import org.eclipse.draw2d.text.TextFlow;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.extensions.Preference;
import org.eclipse.e4.ui.di.UISynchronize;
import org.eclipse.e4.ui.services.internal.events.EventBroker;
import org.eclipse.e4.ui.workbench.UIEvents.Placeholder;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.ControlAdapter;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.events.TypedEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.PaletteData;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.fuberlin.bts.ui.corpus.egy.annotations.internal.Activator;
import org.fuberlin.bts.ui.corpus.egy.annotations.parts.textAnnoations.AnnotationFigure;
import org.fuberlin.bts.ui.corpus.egy.annotations.parts.textAnnoations.PlaceholderFigure;
import org.osgi.service.prefs.BackingStoreException;
import org.osgi.service.prefs.Preferences;



public class TextAnnotationsComposite extends Composite implements IBTSEditor {

	private static final Color COLOR_WORD_DESELECTED = ColorConstants.white;
	private static final Color COLOR_WORD_SELECTED = ColorConstants.yellow;

	private static final Color COLOR_MARKER_DESELECTED = BTSUIConstants.COLOR_BACKGROUND_DISABLED;
	private static final Color COLOR_MARKER_SELECTED = ColorConstants.yellow;

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
	@Preference(value = BTSEGYUIConstants.SIGN_TEXT_SHOW_LINE_WIDTH, nodePath = "org.bbaw.bts.ui.corpus.egy")
	private Integer max_line_length;
	

	@Inject
	@Preference(value = BTSEGYUIConstants.PREF_LEMMATIZER_FELXION_DEFAULT, nodePath = "org.bbaw.bts.ui.corpus.egy")
	private Integer defaultFlexion;
	
	@Inject
	@Preference(nodePath = "org.bbaw.bts.ui.corpus.egy")
	IEclipsePreferences preferences;
	
	@Inject
	@Preference(value = "SHOWALLPROPERTIES", nodePath = Activator.BUNDLE_ID)
	private Boolean showAllProperties;

	@Inject
	private IEclipseContext context;
	
	@Inject
	private PassportConfigurationController passportConfigurationController;
	
	private Integer showTransLangMask = 0;
	
	private List<ElementFigure> selectedElements = new Vector<ElementFigure>();

	private Composite parentComposite;
	private FlowLayout layout;
	private Figure container;
	private DrawingSpecification drawingSpecifications = new DrawingSpecificationsImplementation();
	private Map<String, IFigure> wordMap;
	protected int selectedIndex;
	private Adapter notifier;
	private boolean notifyWords = true;
	private LineFigure sentenceLineFigure;
	private Map<String, List<LineFigure>> annotationslineMap = new HashMap<String, List<LineFigure>>();
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
	private Composite buttonComposite;
	private Button toBeginningButton;
	private Button toPreviousButton;
	private Label sentenceCount;
	private Text jumpSentenceTxt;
	private Button jumpButton;
	private Button nextButton;
	private Button toEndButton;
	private Composite editorComposite;
	private Label sentenceCountLabel;
	private ScrolledComposite scrolledEditorComposite;
	private int sentenceSeletionIndex;
	private Label sentenceOfLabel;
	private Label sentenceIndexLabel;
	private HashMap<BTSObject, PositionCache> annotationPositionMap;
	private Comparator annotationsByPositionLengthSorter;
	private Map<String, ElementFigure> annotationBaseFigureEndMap = new HashMap<String, ElementFigure>();
	private Map<String, ElementFigure>  annotationBaseFigureStartMap = new HashMap<String, ElementFigure>();
	private Map<LineFigure, Integer> lineFigureEndIndexMap = new HashMap<LineFigure, Integer>();
	private Map<String, ElementFigure> annotationFigureMap = new HashMap<>();
	private Map<String, Boolean> filterMap;
	protected boolean multiSelection;
	private EclipsePreferences annotationSettings;
	private Comparator annotationsGroupByConfigurationSortKeySorter;
	public Map<String, Integer> annotationTypeSortOrderMap;
	
	private static final String VERS_FRONTER_MARKER = "\uDB80\uDC81"; //mv
	private static final String VERS_BREAK_MARKER = "\uDB80\uDC80"; //v
	private static final String BROKEN_VERS_MARKER = "\uDB80\uDC82";
	private static final String DISPUTALBE_VERS_MARKER = "\u2E2E\uDB80\uDC80?";
	private static final String DELETED_VERS_MARKER = "{\uDB80\uDC80}";
	private static final String DESTROYED_VERS_MARKER = "[\uDB80\uDC80]";
	private static final String MISSING_VERS_MARKER = "\u2329\uDB80\uDC80\u232A";
	private static final int MAX_IMAGE_SIZE = 200;

	@Inject
	public TextAnnotationsComposite(Composite parent) {
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
		annotationsByPositionLengthSorter = new AnnotationsByPositionLengthSorter();
		annotationsGroupByConfigurationSortKeySorter = new AnnotationsGroupByConfigurationSortKeySorter();

		// load annotatin styling settings node
		Preferences rootNode = ConfigurationScope.INSTANCE.getNode("org.bbaw.bts.ui.corpus");
		annotationSettings = (EclipsePreferences) rootNode.node(BTSCorpusConstants.PREF_ANNOTATION_SETTINGS);
		
		this.setLayout(new GridLayout());
		((GridLayout) this.getLayout()).marginHeight = 0;
		((GridLayout) this.getLayout()).marginWidth = 0;
		
		buttonComposite = new Composite(this, SWT.NONE);
		buttonComposite.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false,
				false, 2, 1));
		buttonComposite.setLayout(new GridLayout(16, false));
//		((GridLayout) buttonComposite.getLayout()).marginWidth = 0;
//		((GridLayout) buttonComposite.getLayout()).marginHeight = 0;
		
		sentenceCountLabel = new Label(buttonComposite, SWT.NONE);
		sentenceCountLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false,
				false, 2, 1));
		sentenceCountLabel.setText("Sentence: ");
		
		sentenceIndexLabel = new Label(buttonComposite, SWT.NONE);
		sentenceIndexLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false,
				false, 1, 1));
		sentenceIndexLabel.setText("??");
		
		sentenceOfLabel = new Label(buttonComposite, SWT.NONE);
		sentenceOfLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false,
				false, 1, 1));
		sentenceOfLabel.setText(" of ");
		
		sentenceCount = new Label(buttonComposite, SWT.NONE);
		sentenceCount.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false,
				false, 1, 1));
		sentenceCount.setText("??");
		
		
		toBeginningButton = new Button(buttonComposite, SWT.PUSH);
		toBeginningButton.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false,
				false, 1, 1));
		toBeginningButton.setText(" |< ");
		toBeginningButton.addSelectionListener(new SelectionAdapter() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				sentenceSeletionIndex = 0;
				loadSentence(sentenceSeletionIndex);
				enableDisableSelectionButtons();
			}

			
		});
		
		toPreviousButton = new Button(buttonComposite, SWT.PUSH);
		toPreviousButton.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false,
				false, 1, 1));
		toPreviousButton.setText(" < ");
		toPreviousButton.addSelectionListener(new SelectionAdapter() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				sentenceSeletionIndex = sentenceSeletionIndex - 1;
				loadSentence(sentenceSeletionIndex);
				enableDisableSelectionButtons();
			}
		});

		jumpSentenceTxt = new Text(buttonComposite, SWT.BORDER);
		jumpSentenceTxt.setMessage(" Enter sentence no ");
		jumpSentenceTxt.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 5, 1));
		jumpSentenceTxt.addKeyListener(new 
				org.eclipse.swt.events.KeyListener() {

			@Override
			public void keyPressed(org.eclipse.swt.events.KeyEvent e) {
				if (e.keyCode == SWT.CR || e.keyCode == SWT.KEYPAD_CR) {
					String s = jumpSentenceTxt.getText();
					Integer i = new Integer(s);
					int jumpIndex = i;
					if (i >= textContent.getTextItems().size())
					{
						sentenceSeletionIndex = textContent.getTextItems().size() -1;
					}
					else if (i < 0)
					{
						sentenceSeletionIndex = 0;
					}
					else
					{
						sentenceSeletionIndex = i -1;
					}
					loadSentence(sentenceSeletionIndex);
					enableDisableSelectionButtons();
				}
				
			}

			@Override
			public void keyReleased(org.eclipse.swt.events.KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		jumpButton = new Button(buttonComposite, SWT.PUSH);
		jumpButton.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false,
				false, 2, 1));
		jumpButton.setText(" Jump ");
		jumpButton.addSelectionListener(new SelectionAdapter() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				String s = jumpSentenceTxt.getText();
				Integer i = new Integer(s);
				int jumpIndex = i;
				if (i >= textContent.getTextItems().size())
				{
					sentenceSeletionIndex = textContent.getTextItems().size() -1;
				}
				else if (i < 0)
				{
					sentenceSeletionIndex = 0;
				}
				else
				{
					sentenceSeletionIndex = i -1;
				}
				loadSentence(sentenceSeletionIndex);
				enableDisableSelectionButtons();
			}
		});
		
		nextButton = new Button(buttonComposite, SWT.PUSH);
		nextButton.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false,
				false, 1, 1));
		nextButton.setText(" > ");
		nextButton.addSelectionListener(new SelectionAdapter() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				sentenceSeletionIndex = sentenceSeletionIndex + 1;
				loadSentence(sentenceSeletionIndex);
				enableDisableSelectionButtons();
			}
		});
		
		toEndButton = new Button(buttonComposite, SWT.PUSH);
		toEndButton.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false,
				false, 1, 1));
		toEndButton.setText(" >| ");
		toEndButton.addSelectionListener(new SelectionAdapter() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				sentenceSeletionIndex = textContent.getTextItems().size() - 1;
				loadSentence(sentenceSeletionIndex);
				enableDisableSelectionButtons();
			}
		});
		
		
		scrolledEditorComposite = new ScrolledComposite(this, SWT.V_SCROLL | SWT.H_SCROLL | SWT.BORDER);
		scrolledEditorComposite.setMinSize(1, 1);
		scrolledEditorComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

	    // Expand both horizontally and vertically
		scrolledEditorComposite.setExpandHorizontal(true);
		scrolledEditorComposite.setExpandVertical(true);
		
		editorComposite = new Composite(scrolledEditorComposite, SWT.NONE);
		editorComposite.setLayout(new FillLayout());
		scrolledEditorComposite.setContent(editorComposite);
		scrolledEditorComposite.addControlListener(new ControlAdapter() {
		      public void controlResized(ControlEvent e) {
		    	  org.eclipse.swt.graphics.Rectangle r = scrolledEditorComposite.getClientArea();
		        scrolledEditorComposite.setMinSize(1,1);
		      }
		    });
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
		canvas = new FigureCanvas(editorComposite);

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
				if (ke.keycode == SWT.CONTROL) {
					multiSelection = false;
				}

			}

			@Override
			public void keyPressed(KeyEvent ke) {
				if (ke.keycode == SWT.ARROW_RIGHT) {
					shiftSelection(1, true);
				}
				else if (ke.keycode == SWT.ARROW_LEFT) {
					shiftSelection(-1, false);
				}else if (ke.keycode == SWT.CONTROL) {
					multiSelection = true;
				}
				// annotations selection
//				else if (ke.keycode == SWT.ARROW_DOWN) {
//					shiftLineSelection(1);
//				} else if (ke.keycode == SWT.ARROW_UP) {
//					shiftLineSelection(-1);
//				}

			}
		};
		container.setFocusTraversable(true);
		container.addMouseMotionListener(mouseMotionListener);
		container.addKeyListener(keyListener);

		canvas.setContents(container);
		Double d = (canvas.getViewport().getBounds().width ) * 1.35;
		max_line_length = d.intValue();

	}
	
	private void enableDisableSelectionButtons() {
		toBeginningButton.setEnabled(sentenceSeletionIndex != 0);
		toPreviousButton.setEnabled(sentenceSeletionIndex != 0);
		toEndButton.setEnabled(sentenceSeletionIndex < textContent.getTextItems().size() -1);
		nextButton.setEnabled(sentenceSeletionIndex < textContent.getTextItems().size() -1);
	}
	
	@Override
	public void addFocusListener(FocusListener listener) {
		super.addFocusListener(listener);
		canvas.addFocusListener(listener);
	}



	private void shiftSelection(int shift, boolean forward) {
		int currentIndex = getCurrentIndex();
		
		int newIndex = currentIndex + shift;
		
		// refactored so that next figure is a WordFigure
		ElementFigure figure = findWordFigure(newIndex, forward);
		
		if (figure != null)
		{
			setSelectionInternal(figure);
			sendSelectionToParentEditor(0, figure);
		}
	}

	/**
	 * @return
	 */
	private int getCurrentIndex() {
		if (!selectedElements.isEmpty())
		{
			ElementFigure first = selectedElements.get(0);
			int currentIndex = sentenceLineFigure.getChildren().indexOf(first);
			return currentIndex;
		}
		return 0;
	}



	/**
	 * @param selectedElementsInternals
	 * @param eventType 
	 */
	private void sendSelectionToParentEditor(int eventType, ElementFigure... selectedElementsInternals) {
		if (parentEditor != null) {
			
			Event e = new Event();
			e.widget = this;
			TypedEvent ev = new TypedEvent(e);
			BTSTextSelectionEvent event = new BTSTextSelectionEvent(ev, btsObject);
			event.type = eventType;
			event.data = textContent.eContainer();
			int firstIndex = - 1;
			int endIndex = -1;
			ElementFigure firstFigure = null;
			ElementFigure lastFigure = null;
			for (ElementFigure el : selectedElementsInternals)
			{
				if (el instanceof AnnotationFigure)
				{
					event.getRelatingObjects().add((BTSObject) el.getModelObject());
				}
				else
				{
					event.getRelatingObjects().addAll(((ElementFigure)el).getRelatingObjects());
				}
				BTSIdentifiableItem item = (BTSIdentifiableItem) el.getModelObject();
				event.getSelectedItems().add(item);
	
				if (item instanceof BTSSentenceItem)
				{
					event.setEndId(item.get_id());
					event.setStartId(item.get_id());
				}
				
				event.getInterTextReferences().addAll(((ElementFigure)el).getInterTextReferences());
				
				if (sentenceLineFigure.getChildren().contains(el))
				{
					int i = sentenceLineFigure.getChildren().indexOf(el);
					if (firstIndex < 0 || firstIndex > i)
					{
						firstIndex = i;
						firstFigure = el;
					}
					if (endIndex < 0 || endIndex < i)
					{
						endIndex = i;
						lastFigure = el;
					}
				}
				
			}
			
			// find first and last and set endId and startId
			if (firstFigure != null && lastFigure != null)
			{
				event.setEndId(((BTSIdentifiableItem) lastFigure.getModelObject()).get_id());
				event.setStartId(((BTSIdentifiableItem) firstFigure.getModelObject()).get_id());
			}
			
			
			parentEditor.setEditorSelection(event);
		}
		
	}



	private ElementFigure findWordFigure(int newIndex, boolean forward) {
		ElementFigure figure = null;
		if (newIndex >= sentenceLineFigure.getChildren().size()) {
			// move sentence selection 
		} else if (newIndex < 0) {
//			move sentence selection
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
			if (newIndex >= sentenceLineFigure.getChildren().size()) {
				// move sentence selection 

			} else if (newIndex < 0) {
				// move sentence selection 

			}
			else
			{
				// move sentence selection 
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
		else if (ElementFigure.SENTENCE_END.equals(figure.getType()))
		{
			// if it is the very last figure!
			return figure;
		}
		return null;
	}

	private ElementFigure findElementFigure(int newIndex) {
		ElementFigure figure = null;

		try {
			figure = (ElementFigure) sentenceLineFigure
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
					if (multiSelection)
					{
						if (selectedElements.contains(figure))
						{
							selectedElements.remove(figure);
							ElementFigure[] selectedArray = selectedElements.toArray(new ElementFigure[selectedElements.size()]);
							setSelectionInternal(selectedArray);
							sendSelectionToParentEditor(0, selectedArray);
						}
						else
						{
							selectedElements.add(figure);
							ElementFigure[] selectedArray = selectedElements.toArray(new ElementFigure[selectedElements.size() +1]);
							selectedArray[selectedArray.length - 1] = figure;
							setSelectionInternal(selectedArray);
							sendSelectionToParentEditor(0, selectedArray);
						}
					}
					else
					{
						setSelectionInternal(figure);
						sendSelectionToParentEditor(0, figure);
					}
				}
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
			List<ElementFigure> els = new ArrayList<ElementFigure>();
			els.add((ElementFigure) rect);
			refreshFigureFromModel(els, word);
		}
	}

	public void setInput(BTSObject btsObject, BTSTextContent textContent, List<BTSObject> relatingObjects,
			IProgressMonitor monitor, Object localSelectedTextItem) {
		this.textContent = textContent;
		this.btsObject = btsObject;
		this.relatingObjectsMap =  textEditorController
				.fillRelatingObjectsMap(relatingObjects);
		if (textContent != null) {
			
			// get number of sentence // set label
			setSentenceNumberLabel(textContent.getTextItems().size());
			
			// load first sentence
			sentenceSeletionIndex = 0;
			loadSentence(sentenceSeletionIndex);
			this.layout();
			
			// set word selection
//			if (localSelectedTextItem != null && localSelectedTextItem instanceof BTSWord)
//			{
//				IFigure figure = wordMap.get(((BTSIdentifiableItem) localSelectedTextItem).get_id());
//				if (figure != null && figure instanceof ElementFigure)
//				{
//					setSelectionInternal((ElementFigure) figure);
//					reveal(figure);
//				}
//			}
		}
		else {
			purgeAll();
			this.layout();
			parentComposite.layout();
		}
	}


	private void setSentenceNumberLabel(int size) {
		sentenceCount.setText(size + "");
		
	}
	public void reloadCurrentSentence()
	{
		if (textContent != null)loadSentence(sentenceSeletionIndex);
	}


	private void loadSentence(int selectedSentence) {
		purgeAll();
		annotationTypeSortOrderMap = loadAnnotationTypeSortOrderMap();
		
		sentenceIndexLabel.setText(selectedSentence + 1 + "");
		// initialize translation languages mask
		showTransLangMask = 0;
		for (int i=0; i < BTSCoreConstants.LANGS.length; i++) {
			String lang = BTSCoreConstants.LANGS[i];
			String prefVal = BTSEGYUIConstants.SIGN_TEXT_SHOW_TRANSLATION_PREF_PREFIX + lang;
			if (preferences.getBoolean(prefVal, false)) {
				showTransLangMask |= 1<<i;
			}
		}
		continuingRelatingObjects = new Vector<BTSObject>();

		container = new Figure();

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



		wordMap = new HashMap<String, IFigure>();
		BTSTextItems item = textContent.getTextItems().get(selectedSentence);
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
					// appendWord(word);
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
		
		// loadAnnotationFigures
		loadAnnotationFigures();
		
		canvas.setContents(container);
		container.setFocusTraversable(true);
		scrolledEditorComposite.setMinSize(1, 1);
		enableDisableSelectionButtons();
	}

	/**
	 * @return
	 */
	private Map<String, Integer> loadAnnotationTypeSortOrderMap() {
		BTSConfigItem annotationsTypeConfigItem = passportConfigurationController.getObjectTypeConfigItemProcessedClones(BTSConstants.ANNOTATION, null);
		annotationTypeSortOrderMap = new HashMap<>();
		int sortKey = 0;
		for (BTSConfig c : annotationsTypeConfigItem.getChildren())
		{
			if (c instanceof BTSConfigItem)
			{
				BTSConfigItem typeConfigItem = (BTSConfigItem)c;
				String typePath = CorpusUtils.getTypeIdentifier(BTSConstants.ANNOTATION, typeConfigItem, null);
				if (typeConfigItem.getSortKey() != 0)
				{
					sortKey = typeConfigItem.getSortKey() * 100;
					annotationTypeSortOrderMap.put(typePath, sortKey);
				}
				else
				{
					sortKey = sortKey + 100;
					annotationTypeSortOrderMap.put(typePath, sortKey);
				}
				for (BTSConfig cc : typeConfigItem.getChildren())
				{
					if (cc instanceof BTSConfigItem)
					{
						BTSConfigItem subtypeConfigItem = (BTSConfigItem)cc;
						String subtypePath = CorpusUtils.getTypeIdentifier(BTSConstants.ANNOTATION, typeConfigItem, subtypeConfigItem);
						if (subtypeConfigItem.getSortKey() != 0)
						{
							sortKey = sortKey + subtypeConfigItem.getSortKey();
							annotationTypeSortOrderMap.put(subtypePath, sortKey);
						}
						else
						{
							sortKey = sortKey + 1;
							annotationTypeSortOrderMap.put(typePath, sortKey);
						}
					}
				}
			}
		}
		annotationTypeSortOrderMap.put(BTSConstants.ANNOTATION, sortKey + 10000);
		annotationTypeSortOrderMap.put(CorpusUtils.SUBTEXT_TYPE, sortKey + 20000);
		annotationTypeSortOrderMap.put(BTSConstants.COMMENT, sortKey + 30000);

		return annotationTypeSortOrderMap;
	}



	private void loadAnnotationFigures() {
		// group annotations by types
		// filter annotations by type and subtypes
		//--> go over all annotations in annotationPositionmap and filter and then group
		
		// nothing to show
		if (annotationPositionMap == null || annotationPositionMap.isEmpty()) return;

		List<BTSObject> annotations = new Vector<>();
		
		for (BTSObject object : annotationPositionMap.keySet())
		{
			if (isRelatedObjVisible(object))
			{
				// group
				annotations.add(object);
				
			}
		}
		
		// sort groups according to sortkeys in config for types and subtypes
		Map<String, List<BTSObject>> annotationsGroups = new HashMap<String, List<BTSObject>>();
		for (BTSObject o : annotations)
		{
			List<BTSObject> groupAnnos;
			String expandedObjectType = processExpandedObjectType(o);
			if (annotationsGroups.containsKey(expandedObjectType))
			{
				groupAnnos = annotationsGroups.get(expandedObjectType);
			}
			else
			{
				groupAnnos = new Vector<BTSObject>();
				annotationsGroups.put(expandedObjectType, groupAnnos);
			}
			groupAnnos.add(o);
		}
			
		
		// TODO sort groups according to sortkey in config!!!
		List<String> sortedGroupKeys = new Vector<>(annotationsGroups.size());
		for (String key : annotationsGroups.keySet())
		{
			sortedGroupKeys.add(key);
		}

		Collections.sort(sortedGroupKeys, annotationsGroupByConfigurationSortKeySorter);
		
		// iterate over groups
		for (String key : sortedGroupKeys)
		{
			List<BTSObject> annos = annotationsGroups.get(key);
			
			// each lineFigure/group
			// create annotationfigures for each annotation in lineFigure/group
			LineFigure lineFigure;
			// sort annotations according to beginning position and shortness
			Collections.sort(annos, annotationsByPositionLengthSorter);
			
			for (BTSObject o : annos)
			{
				lineFigure = determineLineFigureForAnnotationFigure(o, key);
				
				// lookup last object in line and pass to annotation maker for correct 
				// placeholder setting
				if (!lineFigure.getChildren().isEmpty()
						&& lineFigure.getChildren().get(lineFigure.getChildren().size()-1) instanceof AnnotationFigure)
				{
					makeAnnotationFigure(o, lineFigure, (AnnotationFigure) lineFigure.getChildren().get(lineFigure.getChildren().size()-1));
				}
				else
				{
					makeAnnotationFigure(o, lineFigure, null);
				}
			}
				
		}
		
		
	}




	/**
	 * @param o
	 * @return
	 */
	private String processExpandedObjectType(BTSObject o) {
		return CorpusUtils.getTypeIdentifier(o);
	}



	/**
	 * @param annotationGroupKey 
	 * @param o
	 * @return
	 */
	private LineFigure determineLineFigureForAnnotationFigure(BTSObject annotationOrComment,
			String annotationGroupKey) {
		ElementFigure startFigure = annotationBaseFigureStartMap.get(annotationOrComment.get_id());
		ElementFigure endFigure = annotationBaseFigureEndMap.get(annotationOrComment.get_id());
		int currentEndFigureIndex = sentenceLineFigure.getChildren().indexOf(endFigure);
		int currentStartFigureIndex = sentenceLineFigure.getChildren().indexOf(startFigure);
		
		LineFigure lineFigure = null;
		if (!annotationslineMap.containsKey(annotationGroupKey))
		{
			// no linefigure for this group key yet
			// make new line and return this new and empty line
			lineFigure = makeAnnotationsLineFigure(annotationGroupKey);
		}
		else
		{
			List<LineFigure> groupLines = annotationslineMap.get(annotationGroupKey);
			if (groupLines.isEmpty())
			{
				// no linefigure for this group key yet
				// make new line and return this new and empty line
				lineFigure = makeAnnotationsLineFigure(annotationGroupKey);
			}
			else {
				// linefigure exist
				
				// check cached last end figure index against current
				//check in cache lowest last end figure index
				int lowestEnd = -1;
				for (LineFigure lf : groupLines)
				{
					if (lowestEnd < 0 || lowestEnd > lineFigureEndIndexMap.get(lf))
					{
						lowestEnd = lineFigureEndIndexMap.get(lf);
						lineFigure = lf;
					}
				}
				
				if (lineFigure != null && lowestEnd >= 0 && lowestEnd < currentStartFigureIndex)
				{
				// if lowest last end figure index < this startfigure, 
				// return linefigure and cache new last end figure
					// cache endFigure index for this line figure

				}
				else
				{
					// else
					// no suitable linefigure,
					// create new line figure, cache end figure and return
					lineFigure = makeAnnotationsLineFigure(annotationGroupKey);
				}
				
			}
		}
		// cache endFigure index for this line figure
		lineFigureEndIndexMap.put(lineFigure, currentEndFigureIndex);
		return lineFigure;
	}



	private AnnotationFigure makeAnnotationFigure(BTSObject object, LineFigure lineFigure,
			AnnotationFigure predecessor) {
		AnnotationFigure fig = new AnnotationFigure(object);
		ToolbarLayout layout = new ToolbarLayout();
		layout.setMinorAlignment(ToolbarLayout.ALIGN_CENTER);
		layout.setStretchMinorAxis(false);
		layout.setSpacing(0);
		layout.setHorizontal(false);
		fig.setLayoutManager(layout);
		// add name
		org.eclipse.draw2d.Label l = new org.eclipse.draw2d.Label();
		String label = object.getName();
		if (label == null || "".equals(label))
		{
			label = object.getType();
		}
		if (label == null || "".equals(label))
		{
			label = "No Label";
		}
		l.setText(label);
		fig.add(l);
		
		if (showAllProperties) addAllPropertiesToFigure(fig, object);
		
		fig.setModelObject(object);
		fig.addMouseListener(elementSelectionListener);

		ElementFigure startFigure = annotationBaseFigureStartMap.get(object.get_id());
		ElementFigure endFigure = annotationBaseFigureEndMap.get(object.get_id());

		ElementFigure predecessorEndFigure = null;
		if (predecessor != null)
		{
			BTSObject predO = (BTSObject) predecessor.getModelObject();
			predecessorEndFigure = annotationBaseFigureEndMap.get(predO.get_id());
		}
		// if necessary add placeholder
		PlaceholderFigure palceholder = new PlaceholderFigure(startFigure, predecessorEndFigure);
		lineFigure.add(palceholder);

		
		fig.setStartFigure(startFigure);
		fig.setEndFigure(endFigure);
		
		// set background color
		determineAndSetBackgroundColor(fig, object);
		lineFigure.add(fig);
		
		annotationFigureMap.put(object.get_id(), fig);
		return fig;
		
	}



	/**
	 * @param fig
	 * @param object
	 */
	private void addAllPropertiesToFigure(AnnotationFigure fig, BTSObject object) {
		// add name

		String label = null;
		if (object instanceof BTSCorpusObject)
		{
			label = passportConfigurationController.getAllPassportDataAsString((BTSCorpusObject) object);
		}
		else if (object instanceof BTSComment)
		{
			label = ((BTSComment)object).getComment();
		}
		if (label != null && !"".equals(label))
		{
			System.out.println(label);
			TextFlow content = new TextFlow(label +"----------------------------------------------------");
			FlowPage fp = new FlowPage();
			fp.add(content);
			fig.add(fp);
		}
	}



	/**
	 * @param fig
	 * @param object
	 */
	private void determineAndSetBackgroundColor(AnnotationFigure fig, BTSObject object) {
		// read values from the instance scope
		String colorString = null;
		String expandedType = processExpandedObjectType(object);
		try {
			for (String childNode : annotationSettings.childrenNames())
			{
				Preferences typeNode = annotationSettings.node(childNode);
				String settingsTypePath = AnnotationToolbarItemCreator.getAnnotationTypePath((EclipsePreferences) typeNode);
				if (!settingsTypePath.equals(expandedType)) continue;
				
				colorString = typeNode.get(BTSCorpusConstants.PREF_COLOR, null);
				
				break;
			}
		} catch (BackingStoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Color color = null;
		if (colorString != null)
		{
			color = BTSUIConstants.getColor(colorString);
		}
		else
		{
			if (object instanceof BTSComment)
			{
				color = BTSUIConstants.COLOR_COMMENT;
			}else if (object instanceof BTSText)
			{
				color = BTSUIConstants.COLOR_SUBTEXT;
			}else if (object instanceof BTSAnnotation)
			{
				if (CorpusUtils.ANNOTATION_RUBRUM_TYPE.equals(object.getType()))
				{
					color = BTSUIConstants.COLOR_RUBRUM;
				}
				else
				{
					color = BTSUIConstants.COLOR_ANNOTATTION;
				}
			}
		}
		if (color != null)
		{
			fig.setBaseBackgroundColor(color);
		}
		
	}



	private boolean isRelatedObjVisible(BTSObject o) {
		//String key = "org.bbaw.bts.ui.corpus.part.annotations.viewmenu.show.";
		if (filterMap == null) return true;

		String key = "";
		if (o instanceof BTSCorpusObject) {
			if (o instanceof BTSText) {
				if (o.getType() != null)
					if (BTSConstants.ANNOTATION_SUBTEXT.equalsIgnoreCase(o.getType()))
						key += "subtext"; 
			} else if (o instanceof BTSAnnotation)
				key = CorpusUtils.getTypeIdentifier(o);
		} else if (o instanceof BTSComment)
			key += BTSConstants.COMMENT;
		return filterMap.containsKey(key) ? filterMap.get(key) : true;
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
					updateAnnotationsPostionMap(relatingObject, itemFigure, itemFigure);
					annotationBaseFigureStartMap.put(relatingObject.get_id(), itemFigure);
					annotationBaseFigureEndMap.put(relatingObject.get_id(), itemFigure);
				}
				else if (ref.getBeginId().equals(senItem.get_id())) {
				// 2) ref ist start
				// annotation erzeugen
					itemFigure.addRelatingObject(relatingObject);
					processStylingAnnotations(itemFigure, relatingObject);
					continuingRelatingObjects.add(relatingObject);
					updateRelatingObjectFigureMap(relatingObject.get_id(), itemFigure);
					updateAnnotationsPostionMap(relatingObject, itemFigure, null);
					annotationBaseFigureStartMap.put(relatingObject.get_id(), itemFigure);
				
				}
				else if (ref.getEndId().equals(senItem.get_id())){
				// 3) ref ist end
				// annotation aus cache holen - wie?
					itemFigure.addRelatingObject(relatingObject);
					processStylingAnnotations(itemFigure, relatingObject);
					continuingRelatingObjects.remove(relatingObject);
					updateRelatingObjectFigureMap(relatingObject.get_id(), itemFigure);
					updateAnnotationsPostionMap(relatingObject, null, itemFigure);
					annotationBaseFigureEndMap.put(relatingObject.get_id(), itemFigure);

				}
			}
		
	}

	private void updateAnnotationsPostionMap(BTSObject relatingObject, ElementFigure beginFigure, 
			ElementFigure endFigure) {
		if (annotationPositionMap == null)
		{
			annotationPositionMap = new HashMap<BTSObject, PositionCache>();
		}
		PositionCache cache = annotationPositionMap.get(relatingObject);
		if (cache == null)
		{
			cache = new PositionCache();
			annotationPositionMap.put(relatingObject, cache);
		}
		if (beginFigure != null && cache.getStart() == 0)
		{
			cache.setStart(beginFigure.getBounds().x);
		}
		if (endFigure != null && cache.getEnd() == 0)
		{
			cache.setEnd(endFigure.getBounds().x + endFigure.getBounds().width);
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
				if (fig instanceof TypedLabel && ((TypedLabel)fig).getType() == TypedLabel.TRANSLITATION) {
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
		cachedIndex = -1;
		if (wordMap != null) {
			wordMap.clear();
			annotationslineMap.clear();
		}
		if (sentenceLineFigure != null) {
			sentenceLineFigure = null;
		}
		relatingObjectFigureMap = null;
		annotationPositionMap = null;
		
		annotationBaseFigureEndMap.clear();
		annotationBaseFigureStartMap.clear();
		lineFigureEndIndexMap.clear();
		annotationslineMap.clear();
		annotationFigureMap.clear();
		
		// selected elements
		selectedElements.clear();
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
		label.setType(TypedLabel.TRANSLITATION);

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
		rect.setSize(90, 290);
		rect.addFigureListener(new FigureListener() {

			@Override
			public void figureMoved(IFigure source) {

				// Integer n = null;
				// System.out.println(n.toString());

			}
		});
		rect.addMouseListener(elementSelectionListener);
		rect.setLayoutManager(tl);
		appendFigure(rect);

		if (!word.eAdapters().contains(notifier)) {
			word.eAdapters().add(notifier);
		}
		return rect;
	}

	private void addTransToWordFigure(BTSWord word, WordFigure rect,
			String language) {
		TypedLabel l = new TypedLabel();
		l.setTranslationLang(language);
		if (word.getTranslation() != null 
				&& word.getTranslation().getTranslation(language) != null 
				&& !"".equals(word.getTranslation().getTranslation(language))) {
			l.setText(language + ": " + word.getTranslation().getTranslation(language));
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
		if (sentenceLineFigure == null) {
			sentenceLineFigure = makeLineFigure();
		}
		
		sentenceLineFigure.add(figure);
	}

	private LineFigure makeLineFigure() {
		LineFigure fig = new LineFigure();
		fig.setSize(400, 190);
		container.add(fig);
		ToolbarLayout l = new ToolbarLayout();
		l.setMinorAlignment(ToolbarLayout.ALIGN_CENTER);
		l.setStretchMinorAxis(false);
		l.setSpacing(2);
		l.setHorizontal(true);
		fig.setLayoutManager(l);
		return fig;
	}
	private LineFigure makeAnnotationsLineFigure(String key) {
		LineFigure fig = new LineFigure();
		fig.setSize(400, 190);
		List<LineFigure> lineList;
		if (annotationslineMap.containsKey(key))
		{
			lineList = annotationslineMap.get(key);
		}
		else
		{
			lineList = new Vector<>(1);
			annotationslineMap.put(key, lineList);
		}
		lineList.add(fig);
		container.add(fig);
		ToolbarLayout l = new ToolbarLayout();
		l.setMinorAlignment(ToolbarLayout.ALIGN_CENTER);
		l.setStretchMinorAxis(false);
		l.setSpacing(0);
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



	


	private void setSelectionInternal(ElementFigure... figures) {
		setSelectionInternal(0, figures);
	}

	private void setSelectionInternal(int eventType, ElementFigure... figures) {
		List<ElementFigure> toDeselect = new ArrayList<>();
		List<ElementFigure> toSelect = new ArrayList<>();
		toDeselect.addAll(selectedElements);
		for (ElementFigure ef : figures)
		{
			if (ef == null) continue;
			if (ef.getParent() instanceof LineFigure) {
				if (ef.getParent() != sentenceLineFigure) {
					sentenceLineFigure = (LineFigure) ef.getParent();
				}
			}
			if (!selectedElements.contains(ef)) {
				toSelect.add(ef);
			}
			else
			{
				toDeselect.remove(ef);
				toSelect.add(ef);
			}
		}
		// deselect olrd
		for (ElementFigure ef : toDeselect)
		{
			setSingleFigureDeselected(ef, 0);
		}
		for (ElementFigure ef : toSelect)
		{
			setSingleFigureSelected(ef);
		}
		selectedElements.clear();
		selectedElements.addAll(toSelect);
		
		// FIXME sort
		try {
			reveal(selectedElements.get(0));
		} catch (Exception e) {
		}
		

		
	}

	void setSingleFigureSelected(ElementFigure figure)
	{
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
			
		}else if (figure instanceof AnnotationFigure) {
			figure.setBackgroundColor(COLOR_MARKER_SELECTED);
			
		}
//		figure.repaint();
		// else if (figure instanceof WordFigure) {
		// figure.setBackgroundColor(COLOR_WORD_SELECTED);
		// }
	}
	private void setSingleFigureDeselected(ElementFigure figure, int eventType) {
		if (figure != null) {
			if (figure instanceof WordFigure) {
				figure.setBackgroundColor(
						eventType == 1 ? BTSUIConstants.COLOR_LEMMA :  
						colorWordDeselected((BTSWord)figure.getModelObject()));
			} else if (figure instanceof MarkerFigure) {
				figure.setBackgroundColor(COLOR_MARKER_DESELECTED);
			}else if (figure instanceof AmbivalenceStartFigure || figure instanceof AmbivalenceEndFigure) {
				figure.setBackgroundColor(BTSUIConstants.VIEW_FOREGROUND_DESELECTED_COLOR);
			}else if (figure instanceof AnnotationFigure) {
				((AnnotationFigure)figure).setBackgroundColor(((AnnotationFigure) figure).getBaseBackgroundcolor());
			}
//			figure.repaint();
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

	public void setEventBroker(EventBroker eventBroker2) {
		// TODO
	}

	@Override
	public void setEditorSelection(Object selection) {
		// TODO Auto-generated method stub

	}

	public void setTextSelectionEvent(String event) {
		int currentIndex = getCurrentIndex();
		refreshFigureFromModel(selectedElements, null);
		if (event.equals(BTSUIConstants.EVENT_TEXT_SELECTION_ALL_START)) {

//			shiftLineSelection(-1);
//			int currentIndex = sentenceLineFigure.getChildren().indexOf(
//					selectedElement);
			shiftSelection(-currentIndex, true);
		} else if (event.equals(BTSUIConstants.EVENT_TEXT_SELECTION_LINE_START)) {
//			int currentIndex = sentenceLineFigure.getChildren().indexOf(
//					selectedElement);
			shiftSelection(-currentIndex, true);
		} else if (event.equals(BTSUIConstants.EVENT_TEXT_SELECTION_PREVIOUS)) {
			shiftSelection(-1, false);

		} else if (event.equals(BTSUIConstants.EVENT_TEXT_SELECTION_NEXT)) {
			shiftSelection(1, true);
		} else if (event.equals(BTSUIConstants.EVENT_TEXT_SELECTION_LINE_END)) {
//			int currentIndex = sentenceLineFigure.getChildren().indexOf(
//					selectedElement);
			int shift = sentenceLineFigure.getChildren().size() - currentIndex
					- 1;
			shiftSelection(shift, false);
		} else if (event.equals(BTSUIConstants.EVENT_TEXT_SELECTION_ALL_END)) {

//			move sentence selection
			//			shiftLineSelection(lshift);
			currentIndex = getCurrentIndex();
//			int currentIndex = sentenceLineFigure.getChildren().indexOf(
//					selectedElement);
			int shift = sentenceLineFigure.getChildren().size() - currentIndex
					- 1;
			shiftSelection(shift, false);
		}
		

	}

	

	
	

	private void refreshFigureFromModel(List<ElementFigure> selectedElementsInternals, BTSWord word) {
		for (ElementFigure element : selectedElementsInternals)
		{
			if (element instanceof WordFigure)
			{
				WordFigure wf = (WordFigure) element;
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
							case TypedLabel.TRANSLITATION :
								l.setText(word.getWChar());
								break;
							case TypedLabel.TRANSLATION :
								if (word.getTranslation() != null) {
									String lang = l.getTranslationLang();
									String trans = word.getTranslation().getTranslation(lang);
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
								
	//						}
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
		if (this.enabled != enabled)
		{
			this.enabled = enabled;
		}
	}

	private class PositionCache{
		private int start;
		private int end;
		public int getStart() {
			return start;
		}
		public void setStart(int start) {
			this.start = start;
		}
		public int getEnd() {
			return end;
		}
		public void setEnd(int end) {
			this.end = end;
		}
	}
	
	private class AnnotationsByPositionLengthSorter implements Comparator<BTSObject>{

		@Override
		public int compare(BTSObject a1, BTSObject a2) {
			PositionCache pc1 = annotationPositionMap.get(a1);
			PositionCache pc2 = annotationPositionMap.get(a2);
			
			// if a position is null than sort behind
			// if both start positions are equal, sort the shorter one first
			if (pc1 == null) return 1;
			else if (pc2 == null) return -1;
			if (pc1.getStart() < pc2.getStart()) return -1;
			else if (pc1.getStart() > pc2.getStart()) return 1;
			else return pc1.getEnd()-pc2.getEnd();
		}
		
	}
	
	
	private class AnnotationsGroupByConfigurationSortKeySorter implements Comparator<String>{

		@Override
		public int compare(String a1, String a2) {
			Integer i1 = annotationTypeSortOrderMap.get(a1);
			Integer i2 = annotationTypeSortOrderMap.get(a2);
			
			// if a position is null than sort behind
			// if both start positions are equal, sort the shorter one first
			if (i1 == null) return 1;
			else if (i2 == null) return -1;
			return i1 - i2;
		}
		
	}
	/**
	 * @param annotations
	 * @param b
	 */
	public void setSelectedAnnotations(List<BTSObject> annotations, boolean selected) {
		sync.asyncExec(new Runnable() {
			public void run() {
				List<ElementFigure> toSelect = new ArrayList<>(annotations.size());
				for (BTSObject o : annotations)
				{
					AnnotationFigure annoFig = (AnnotationFigure) annotationFigureMap.get(o.get_id());
					toSelect.add(annoFig);
				}
				setSelectionInternal(toSelect.toArray(new ElementFigure[toSelect.size()]));
			}

		});
		
	}



	/**
	 * @param filters
	 */
	public void setFilters(Map<String, Boolean> filters) {
		this.filterMap = filters;
		if (textContent != null)loadSentence(sentenceSeletionIndex);
		
	}



	/**
	 * @param relatingObjects
	 */
	public void updateRelatingObjects(List<BTSObject> relatingObjects) {
		sync.asyncExec(new Runnable()
		{
			public void run()
			{
				relatingObjectsMap =  textEditorController
						.fillRelatingObjectsMap(relatingObjects);
				loadSentence(sentenceSeletionIndex);
				layout();	
			}
		});
			
		
	}
}
