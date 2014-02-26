package org.bbaw.bts.ui.egy.textSign;

import java.awt.image.BufferedImage;
import java.awt.image.DirectColorModel;
import java.awt.image.IndexColorModel;
import java.awt.image.WritableRaster;
import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import jsesh.mdc.MDCSyntaxError;
import jsesh.mdcDisplayer.draw.MDCDrawingFacade;
import jsesh.mdcDisplayer.preferences.DrawingSpecification;
import jsesh.mdcDisplayer.preferences.DrawingSpecificationsImplementation;

import org.bbaw.bts.btsmodel.BTSAmbivalence;
import org.bbaw.bts.btsmodel.BTSAmbivalenceItem;
import org.bbaw.bts.btsmodel.BTSGraphic;
import org.bbaw.bts.btsmodel.BTSIdentifiableItem;
import org.bbaw.bts.btsmodel.BTSLemmaCase;
import org.bbaw.bts.btsmodel.BTSMarker;
import org.bbaw.bts.btsmodel.BTSSenctence;
import org.bbaw.bts.btsmodel.BTSSentenceItem;
import org.bbaw.bts.btsmodel.BTSText;
import org.bbaw.bts.btsmodel.BTSTextItems;
import org.bbaw.bts.btsmodel.BTSWord;
import org.bbaw.bts.core.corpus.controller.partController.BTSTextEditorController;
import org.bbaw.bts.ui.commons.text.IBTSEditor;
import org.bbaw.bts.ui.commons.utils.BTSUIConstants;
import org.bbaw.bts.ui.egy.textSign.support.AmbivalenceEndFigure;
import org.bbaw.bts.ui.egy.textSign.support.AmbivalenceStartFigure;
import org.bbaw.bts.ui.egy.textSign.support.CompartementImageFigure;
import org.bbaw.bts.ui.egy.textSign.support.ElementFigure;
import org.bbaw.bts.ui.egy.textSign.support.LineFigure;
import org.bbaw.bts.ui.egy.textSign.support.MarkerFigure;
import org.bbaw.bts.ui.egy.textSign.support.WordFigure;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.FigureCanvas;
import org.eclipse.draw2d.FigureListener;
import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.ImageFigure;
import org.eclipse.draw2d.KeyEvent;
import org.eclipse.draw2d.KeyListener;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.LightweightSystem;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.MouseEvent;
import org.eclipse.draw2d.MouseListener;
import org.eclipse.draw2d.MouseMotionListener;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.Viewport;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.e4.ui.services.internal.events.EventBroker;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.PaletteData;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;

public class SignTextComposite extends Composite implements IBTSEditor {

	private int max_line_length = 600;
	private static final Color COLOR_WORD_DESELECTED = ColorConstants.yellow;
	private static final Color COLOR_WORD_SELECTED = ColorConstants.green;

	private static final Color COLOR_MARKER_DESELECTED = ColorConstants.blue;
	private static final Color COLOR_MARKER_SELECTED = ColorConstants.green;

	private static final Color COLOR_SENTENCE_DESELECTED = ColorConstants.blue;
	private static final Color COLOR_SENTENCE_SELECTED = ColorConstants.green;

	private static final Color COLOR_AMBIVALENCE_DESELECTED = ColorConstants.blue;
	private static final Color COLOR_AMBIVALENCE_SELECTED = ColorConstants.green;

	private static final Color COLOR_CANVAS_BACKGROUND = ColorConstants.white;

	@Inject
	private BTSTextEditorController textEditorController;
	@Inject
	private EventBroker eventBroker;
	@Inject
	private IBTSEditor parentEditor;

	private ElementFigure selectedElement;

	private Composite parentComposite;
	private FlowLayout layout;
	private BTSText text;
	private Figure container;
	private DrawingSpecification drawingSpecifications = new DrawingSpecificationsImplementation();
	private Map<BTSIdentifiableItem, IFigure> wordMap;
	protected int selectedIndex;
	private Adapter notifier;
	private LineFigure currentLineFigure;
	private int lineIndex;
	private Map<Integer, LineFigure> lineMap = new HashMap<>();
	private MouseListener elementSelectionListener;
	private int cachedIndex;
	private MouseMotionListener mouseMotionListener;
	private KeyListener keyListener;
	private FigureCanvas canvas;
	private LightweightSystem lightWeightSystem;
	private int figureCounter;

	@Inject
	public SignTextComposite(Composite parent) {
		super(parent, SWT.NONE);
		this.parentComposite = parent;
		parent.setLayout(new FillLayout());
		this.setLayout(new FillLayout());
		createEditor();

	}

	private void createEditor() {
		this.setLayout(new FillLayout());

		notifier = new Adapter() {

			@Override
			public void setTarget(Notifier newTarget) {
				// TODO Auto-generated method stub

			}

			@Override
			public void notifyChanged(Notification notification) {
				System.out.println(" notifyChanged " + notification);
				updateFigureFromWord(notification);

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

		canvas.setBackground(COLOR_CANVAS_BACKGROUND);
		canvas.setLayout(new FillLayout());
		container = new Figure();
		container.setBorder(new LineBorder());

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
					shiftSelection(1);
				}
 else if (ke.keycode == SWT.ARROW_LEFT) {
					shiftSelection(-1);
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
				ElementFigure figure = (ElementFigure) currentLineFigure
						.getChildren().get(currentIndex);
				cachedIndex = -1;
				setSelectionInternal(figure);
			} else {
				cachedIndex = currentIndex;
				currentIndex = currentLineFigure.getChildren().size() - 1;
				ElementFigure figure = (ElementFigure) currentLineFigure
						.getChildren().get(currentIndex);
				setSelectionInternal(figure);
			}

		}

	}

	private void shiftSelection(int shift) {
		int currentIndex = currentLineFigure.getChildren().indexOf(
				selectedElement);
		int newIndex = currentIndex + shift;
		// Integer i = null;
		// System.out.println(i.toString());
		// System.out.println("currentIndex " + currentIndex + " shift " + shift
		// + " newIndex " + newIndex + " currentLine " + lineIndex);
		// check if current Selection at line end
		if (newIndex >= currentLineFigure.getChildren().size()) {
			if (lineIndex < container.getChildren().size() - 1) {
				lineIndex++;
				currentLineFigure = lineMap.get(lineIndex);
				ElementFigure figure = (ElementFigure) currentLineFigure
						.getChildren().get(0);
				setSelectionInternal(figure);
			}
		} else if (newIndex < 0) {
			if (lineIndex > 0) {
				lineIndex--;
				currentLineFigure = lineMap.get(lineIndex);
				newIndex = currentLineFigure.getChildren().size() - 1;
				ElementFigure figure = (ElementFigure) currentLineFigure
						.getChildren().get(newIndex);
				setSelectionInternal(figure);
			}
		} else {
			ElementFigure figure = (ElementFigure) currentLineFigure
					.getChildren()
					.get(newIndex);
			setSelectionInternal(figure);
		}

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
		IFigure rect = (IFigure) wordMap.get(word);
		if (rect != null) {
		for (Object fig : rect.getChildren()) {
			if (fig instanceof ImageFigure) {
				ImageFigure imf = (ImageFigure) fig;
				String mdc = transformWordToMdCString(word);
				try {
					imf.setImage(transformToSWT(getImageData(mdc)));
				} catch (MDCSyntaxError e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (fig instanceof Label) {
				Label l = (Label) fig;
				l.setText(word.getWChar());
			}
		}
		}
		}
	}

	public void setInput(BTSText text) {
		this.text = text;
		if (text != null) {
			loadText();
			this.layout();
		}
 else {
			purgeAll();
			this.layout();
			parentComposite.layout();
		}
	}

	private void loadText() {
		purgeAll();
		max_line_length = canvas.getViewport().getBounds().width / 2;
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



		wordMap = new HashMap<BTSIdentifiableItem, IFigure>();
		for (BTSTextItems item : text.getTextContent().getTextItems()) {
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

		container.setFocusTraversable(true);
		this.layout();
		parentComposite.layout();
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
		MarkerFigure fig = new MarkerFigure(marker.getType());
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
		if (container != null) {
			container.removeAll();

		}
		figureCounter = 0;
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

	}

	private ElementFigure makeWordFigure(BTSWord word) {
		org.eclipse.draw2d.Label label = new org.eclipse.draw2d.Label();
		label.setText(word.getWChar());
		final WordFigure rect = new WordFigure(label);
		rect.setBackgroundColor(COLOR_WORD_DESELECTED);
		rect.setModelObject(word);
		rect.setType(ElementFigure.WORD);

		wordMap.put(word, rect);
		// gridLayout = new GridLayout();
		// gridLayout.numColumns = 1;
		// gridLayout.makeColumnsEqualWidth = false;

		ToolbarLayout tl = new ToolbarLayout();
		tl.setHorizontal(false);
		tl.setSpacing(5);

		ImageFigure imageFigure = new CompartementImageFigure();
		String mdc = transformWordToMdCString(word);
		// System.out.println("mdc " + mdc);
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

		// rect.getAttributesCompartment().add(imageFigure);

		rect.add(imageFigure);

		// add lemma key
		// FIXME load lemma object and show lemma transliteration
		if (word.getLKey() != null && !"".equals(word.getLKey())) {
			org.eclipse.draw2d.Label l = new org.eclipse.draw2d.Label();
			l.setText(word.getLKey());
			rect.add(l);
		}

		// add flexion code
		if (word.getFlexCode() != null && !"".equals(word.getFlexCode())) {
			org.eclipse.draw2d.Label l = new org.eclipse.draw2d.Label();
			l.setText(word.getFlexCode());
			rect.add(l);
		}

		rect.setSize(90, 290);
		rect.addFigureListener(new FigureListener() {

			int figureMoveCounter = 0;
			@Override
			public void figureMoved(IFigure source) {
				figureMoveCounter++;
				// System.out.println("FigureListener counter "
				// + figureMoveCounter + " all figures: " + figureCounter
				// + " source " + source);

				// Integer n = null;
				// System.out.println(n.toString());

			}
		});
		rect.addMouseListener(elementSelectionListener);
		rect.setLayoutManager(tl);
		appendFigure(rect);

		word.eAdapters().add(notifier);
		return rect;
	}

	private void appendFigure(ElementFigure figure) {
		figureCounter++;
		if (currentLineFigure == null) {
			currentLineFigure = makeLineFigure();
		}
		int len = figure.getLength();
		if (currentLineFigure.getSpaceLength() + len <= max_line_length) {
			currentLineFigure.add(figure);
		} else if (figure.getType().equals(ElementFigure.SENTENCE_START)) {
			currentLineFigure.add(figure);
		} else {
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
		MarkerFigure fig = new MarkerFigure("§");
		fig.setModelObject(sentence);
		fig.setType(ElementFigure.SENTENCE_START);
		fig.setSize(15, 90);
		fig.addMouseListener(elementSelectionListener);
		return fig;
	}

	private ElementFigure makeSentenceEndFigure(BTSSenctence sentence) {
		MarkerFigure fig = new MarkerFigure("§");
		fig.setModelObject(sentence);
		fig.setType(ElementFigure.SENTENCE_END);
		fig.setSize(15, 90);
		fig.addMouseListener(elementSelectionListener);
		return fig;
	}

	// private void appendWord(BTSWord word) {
	// LineFigure lineFigure = getCurrentLineFigure();
	// org.eclipse.draw2d.Label label = new org.eclipse.draw2d.Label();
	// label.setText(word.getWChar());
	// final WordFigure rect = new WordFigure(label);
	// rect.setBackgroundColor(ColorConstants.yellow);
	// wordMap.put(word, rect);
	// gridLayout = new GridLayout();
	// gridLayout.numColumns = 1;
	// gridLayout.makeColumnsEqualWidth = false;
	//
	// FlowLayout l = new FlowLayout();
	// l.setHorizontal(false);
	// l.setMajorAlignment(FlowLayout.ALIGN_BOTTOMRIGHT);
	//
	// l.setMinorSpacing(10);
	//
	// // GridLayout ll = new GridLayout();
	// // ll.marginHeight = 4;
	// // ll.marginWidth = 4;
	// // ll.numColumns = 1;
	//
	// ToolbarLayout tl = new ToolbarLayout();
	// tl.setHorizontal(false);
	// tl.setSpacing(5);
	//
	// ImageFigure imageFigure = new CompartementImageFigure();
	// String mdc = transformWordToMdCString(word);
	// try {
	// imageFigure.setImage(transformToSWT(getImageData(mdc)));
	// } catch (MDCSyntaxError e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	//
	// rect.getAttributesCompartment().add(imageFigure);
	//
	// rect.setSize(90, 90);
	// rect.addFigureListener(new FigureListener() {
	//
	// @Override
	// public void figureMoved(IFigure source) {
	// System.out.println(source);
	//
	// }
	// });
	// rect.addMouseListener(new MouseListener() {
	//
	// @Override
	// public void mousePressed(MouseEvent me) {
	// if (rect != selectedElement) {
	// ElementFigure oldSelection = selectedElement;
	// selectedElement = rect;
	// setSelected(rect);
	// for (int i = 0; i < container.getChildren().size(); i++) {
	// Object child = container.getChildren().get(i);
	// if (child.equals(selectedElement)) {
	// if (curserIndex <= i) {
	// selectedIndex = i - 1;
	// container.remove(cursor);
	// curserIndex = selectedIndex + 1;
	// container.add(cursor, curserIndex);
	// } else {
	// selectedIndex = i;
	// container.remove(cursor);
	// curserIndex = selectedIndex + 1;
	// container.add(cursor, curserIndex);
	// }
	// break;
	// }
	//
	// }
	// }
	// System.out.println(me);
	//
	// }
	//
	// @Override
	// public void mouseReleased(MouseEvent me) {
	// System.out.println(me);
	//
	// }
	//
	// @Override
	// public void mouseDoubleClicked(MouseEvent me) {
	// System.out.println(me);
	//
	// }
	//
	// });
	// rect.setLayoutManager(tl);
	//
	// lineFigure.add(rect);
	// EObject o = word;
	// word.eAdapters().add(notifier);
	//
	// }

	private LineFigure getCurrentLineFigure() {
		if (currentLineFigure == null) {
			currentLineFigure = new LineFigure();
			currentLineFigure.setSize(400, 90);
			container.add(currentLineFigure);
			lineMap.put(lineIndex++, currentLineFigure);

		}
 else if (currentLineFigure.getChildren().size() > 8) {
			currentLineFigure = new LineFigure();
			currentLineFigure.setSize(400, 90);
			container.add(currentLineFigure);
			lineMap.put(lineIndex++, currentLineFigure);
		}
		return currentLineFigure;
	}

	private void setDeselected(ElementFigure figure) {
		if (figure != null) {
			if (figure instanceof WordFigure) {
				figure.setBackgroundColor(COLOR_WORD_DESELECTED);
			} else if (figure instanceof MarkerFigure) {
				figure.setBackgroundColor(COLOR_MARKER_DESELECTED);
			}
			figure.repaint();
		}

	}

	private void setSelectionInternal(ElementFigure figure) {
		if (figure.getParent() instanceof LineFigure) {
			if (figure.getParent() != currentLineFigure) {
				currentLineFigure = (LineFigure) figure.getParent();
			}
		}
		if (figure != selectedElement) {
			ElementFigure oldSelection = selectedElement;
			setDeselected(oldSelection);
			selectedElement = figure;
			reveal(selectedElement);

		}
		if (figure instanceof WordFigure) {
			figure.setBackgroundColor(COLOR_WORD_SELECTED);
		} else if (figure instanceof MarkerFigure) {
			figure.setBackgroundColor(COLOR_MARKER_SELECTED);
		}
		figure.repaint();
		// else if (figure instanceof WordFigure) {
		// figure.setBackgroundColor(COLOR_WORD_SELECTED);
		// }

		if (parentEditor != null) {
			parentEditor.setEditorSelection((figure).getModelObject());
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
			return new Image(Display.getCurrent(), data);
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
			return new Image(Display.getCurrent(), data);
		}
		return null;

	}

	private BufferedImage getImageData(String topItemList)
			throws MDCSyntaxError {
		BufferedImage result;
		{
			MDCDrawingFacade facade = new MDCDrawingFacade();
			facade.setDrawingSpecifications(drawingSpecifications);
			facade.setMaxSize(200, 45);
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
		this.eventBroker = eventBroker2;

	}

	@Override
	public void setEditorSelection(Object selection) {
		// TODO Auto-generated method stub

	}

	public void setTextSelectionEvent(String event) {
		if (event.equals(BTSUIConstants.EVENT_TEXT_SELECTION_ALL_START)) {

			lineIndex = 0;
			shiftLineSelection(-1);
			int currentIndex = currentLineFigure.getChildren().indexOf(
					selectedElement);
			shiftSelection(-currentIndex);
		} else if (event.equals(BTSUIConstants.EVENT_TEXT_SELECTION_LINE_START)) {
			int currentIndex = currentLineFigure.getChildren().indexOf(
					selectedElement);
			shiftSelection(-currentIndex);
		} else if (event.equals(BTSUIConstants.EVENT_TEXT_SELECTION_PREVIOUS)) {
			shiftSelection(-1);

		} else if (event.equals(BTSUIConstants.EVENT_TEXT_SELECTION_NEXT)) {
			shiftSelection(1);
		} else if (event.equals(BTSUIConstants.EVENT_TEXT_SELECTION_LINE_END)) {
			int currentIndex = currentLineFigure.getChildren().indexOf(
					selectedElement);
			int shift = currentLineFigure.getChildren().size() - currentIndex
					- 1;
			shiftSelection(shift);
		} else if (event.equals(BTSUIConstants.EVENT_TEXT_SELECTION_ALL_END)) {
			int lshift = container.getChildren().size() - lineIndex - 1;
			shiftLineSelection(lshift);
			int currentIndex = currentLineFigure.getChildren().indexOf(
					selectedElement);
			int shift = currentLineFigure.getChildren().size() - currentIndex
					- 1;
			shiftSelection(shift);
		}

	}

	@Override
	public boolean setFocus() {

		// loadText();
		// canvas.layout();
		return true;
	}

}
