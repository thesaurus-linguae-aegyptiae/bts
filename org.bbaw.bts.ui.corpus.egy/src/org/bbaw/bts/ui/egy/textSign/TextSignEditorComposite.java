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

import org.bbaw.bts.btsmodel.BTSGraphic;
import org.bbaw.bts.btsmodel.BTSSenctence;
import org.bbaw.bts.btsmodel.BTSSentenceItem;
import org.bbaw.bts.btsmodel.BTSText;
import org.bbaw.bts.btsmodel.BTSTextItems;
import org.bbaw.bts.btsmodel.BTSWord;
import org.bbaw.bts.core.corpus.controller.partController.BTSTextEditorController;
import org.bbaw.bts.ui.egy.textSign.support.CompartementImageFigure;
import org.bbaw.bts.ui.egy.textSign.support.WordFigure;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.FigureCanvas;
import org.eclipse.draw2d.FigureListener;
import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.ImageFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.MouseEvent;
import org.eclipse.draw2d.MouseListener;
import org.eclipse.draw2d.MouseMotionListener;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.e4.ui.services.internal.events.EventBroker;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.PaletteData;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class TextSignEditorComposite extends Composite
{

	@Inject
	private BTSTextEditorController textEditorController;
	@Inject
	private EventBroker eventBroker;
	private Figure selectedRectagle;

	private Composite parentComposite;
	private FlowLayout layout;
	private BTSText text;
	private Figure container;
	
	private GridLayout gridLayout;
	private RectangleFigure cursor;
	private Map<Object, BTSWord> figureMap;
	private Map<BTSWord, IFigure> wordMap;
	protected int selectedIndex;
	protected int curserIndex;
	private Adapter notifier;

	public TextSignEditorComposite(Composite parent, int style)
	{
		super(parent, style);
		this.parentComposite = parent;
		parent.setLayout(new FillLayout());
		createEditor();

	}

	private void createEditor()
	{
		this.setLayout(new FillLayout());
		notifier = new Adapter()
		{

			@Override
			public void setTarget(Notifier newTarget)
			{
				// TODO Auto-generated method stub

			}

			@Override
			public void notifyChanged(Notification notification)
			{
				System.out.println(notification);
				updateFigureFromWord(notification);

			}

			@Override
			public boolean isAdapterForType(Object type)
			{
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Notifier getTarget()
			{
				// TODO Auto-generated method stub
				return null;
			}
		};

		Display display = Display.getCurrent();
		Shell shell = display.getActiveShell();

		//		LightweightSystem lws = new LightweightSystem(shell);
		FigureCanvas canvas = new FigureCanvas(this);
		container = new Figure();
		container.setBorder(new LineBorder());
		container.setLayoutManager(layout = new FlowLayout());
		layout.setMajorAlignment(FlowLayout.ALIGN_TOPLEFT);

		container.addMouseMotionListener(new MouseMotionListener()
		{

			@Override
			public void mouseMoved(MouseEvent me)
			{
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseHover(MouseEvent me)
			{
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent me)
			{
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent me)
			{
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseDragged(MouseEvent me)
			{
				// TODO Auto-generated method stub

			}
		});
		//		container.addKeyListener(new KeyListener()
		//		{
		//
		//			@Override
		//			public void keyReleased(KeyEvent ke)
		//			{
		//				// TODO Auto-generated method stub
		//
		//			}
		//
		//			@Override
		//			public void keyPressed(KeyEvent ke)
		//			{
		//				if (ke.keycode == SWT.ARROW_LEFT)
		//				{
		//					for (int i = 0; i < container.getChildren().size(); i++)
		//					{
		//						Object child = container.getChildren().get(i);
		//						if (child.equals(cursor))
		//						{
		//							container.remove(cursor);
		//							container.add(cursor, i + 1);
		//							break;
		//						}
		//					}
		//				}
		//
		//			}
		//		});
		canvas.setContents(container);

		this.layout();
		parentComposite.layout();
	}

	protected void updateFigureFromWord(Notification notification)
	{
		BTSWord word = (BTSWord) notification.getNotifier();
		IFigure rect = (IFigure) wordMap.get(word);
		for (Object fig : rect.getChildren())
		{
			if (fig instanceof ImageFigure)
			{
				ImageFigure imf = (ImageFigure) fig;
				String mdc = transformWordToMdCString(word);
				try
				{
					imf.setImage(textEditorController.transformToSWT(textEditorController.getImageData(mdc)));
				} catch (MDCSyntaxError e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (fig instanceof Label)
			{
				Label l = (Label) fig;
				l.setText(word.getWChar());
			}
		}

	}

	public void setInput(BTSText text)
	{
		this.text = text;
		if (text != null)
		{
			loadText();
			container.setLayoutManager(layout);
			this.layout();
		}
	}

	private void loadText()
	{
		container.removeAll();
		cursor = new RectangleFigure();
		cursor.setSize(8, 90);
		container.add(cursor);
		figureMap = new HashMap<Object, BTSWord>();
		wordMap = new HashMap<BTSWord, IFigure>();
		for (BTSTextItems item : text.getTextContent().getTextItems())
		{
			if (item instanceof BTSSenctence)
			{
				BTSSenctence sentence = (BTSSenctence) item;

				//insert start Sentence
				for (BTSSentenceItem senItem : sentence.getSentenceItems())
				{
					if (senItem instanceof BTSWord)
					{
						BTSWord word = (BTSWord) senItem;
						appendWord(word);
					}
				}

			}
		}
		container.setLayoutManager(layout);

	}

	private void appendWord(BTSWord word)
	{
		org.eclipse.draw2d.Label label = new org.eclipse.draw2d.Label();
		label.setText(word.getWChar());
		final WordFigure rect = new WordFigure(label);
		rect.setBackgroundColor(ColorConstants.yellow);
		figureMap.put(rect, word);
		wordMap.put(word, rect);
		gridLayout = new GridLayout();
		gridLayout.numColumns = 1;
		gridLayout.makeColumnsEqualWidth = false;

		FlowLayout l = new FlowLayout();
		l.setHorizontal(false);
		l.setMajorAlignment(FlowLayout.ALIGN_BOTTOMRIGHT);

		l.setMinorSpacing(10);

		//		GridLayout ll = new GridLayout();
		//		ll.marginHeight = 4;
		//		ll.marginWidth = 4;
		//		ll.numColumns = 1;

		ToolbarLayout tl = new ToolbarLayout();
		tl.setHorizontal(false);
		tl.setSpacing(5);

		ImageFigure imageFigure = new CompartementImageFigure();
		String mdc = transformWordToMdCString(word);
		try
		{
			imageFigure.setImage(textEditorController.transformToSWT(textEditorController.getImageData(mdc)));
		} catch (MDCSyntaxError e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		rect.getAttributesCompartment().add(imageFigure);

		rect.setSize(90, 90);
		rect.addFigureListener(new FigureListener()
		{

			@Override
			public void figureMoved(IFigure source)
			{
				System.out.println(source);

			}
		});
		rect.addMouseListener(new MouseListener()
		{

			@Override
			public void mousePressed(MouseEvent me)
			{
				if (rect != selectedRectagle)
				{
					Figure oldSelection = selectedRectagle;
					selectedRectagle = rect;
					setSelected(rect);
					for (int i = 0; i < container.getChildren().size(); i++)
					{
						Object child = container.getChildren().get(i);
						if (child.equals(selectedRectagle))
						{
							if (curserIndex <= i)
							{
								selectedIndex = i - 1;
								container.remove(cursor);
								curserIndex = selectedIndex + 1;
								container.add(cursor, curserIndex);
							} else
							{
								selectedIndex = i;
								container.remove(cursor);
								curserIndex = selectedIndex + 1;
								container.add(cursor, curserIndex);
							}
							break;
						}

					}
				}
				System.out.println(me);

			}

			@Override
			public void mouseReleased(MouseEvent me)
			{
				System.out.println(me);

			}

			@Override
			public void mouseDoubleClicked(MouseEvent me)
			{
				System.out.println(me);

			}

		});
		rect.setLayoutManager(tl);

		container.add(rect);
		EObject o = word;
		word.eAdapters().add(notifier);

	}

	private void setSelected(Figure rect)
	{
		BTSWord word = figureMap.get(rect);
		eventBroker.send("egywordSelection", word);

	}

	
	

	private String transformWordToMdCString(BTSWord word)
	{
		String mdc = "";
		if (!word.getGraphics().isEmpty())
		{
			for (BTSGraphic graphic : word.getGraphics())
			{
				mdc += graphic.getCode();
			}
		}
		return mdc; //mdc;
	}

	public void setEventBroker(EventBroker eventBroker2)
	{
		this.eventBroker = eventBroker2;

	}
}
