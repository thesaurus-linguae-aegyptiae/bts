package org.bbaw.bts.ui.egy.parts;

import grammaticalBase.model.text.ElementColor;
import grammaticalBase.model.text.ElementOccurrence;
import grammaticalBase.model.text.TextModel;
import grammaticalBase.model.text.WordOccurrence;
import grammaticalBase.textEditor.view.textView.JTextAsWordsEditorPanel;
import grammaticalBase.textEditor.view.textView.RamsesWordEditionListener;

import java.awt.Dimension;
import java.awt.Frame;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import jsesh.editor.JMDCEditor;

import org.bbaw.bts.btsmodel.BTSCorpusObject;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.BTSSentenceItems;
import org.bbaw.bts.btsmodel.BTSText;
import org.bbaw.bts.core.corpus.controller.partController.BTSTextEditorController;
import org.bbaw.bts.ui.egy.parts.support.BTSEgySourceViewerConfiguration;
import org.bbaw.bts.ui.egy.parts.support.BulletAnnotation;
import org.bbaw.bts.ui.egy.parts.support.BulletDrawingStrategy;
import org.bbaw.bts.ui.egy.textSign.TextSignEditorComposite;
import org.bbaw.bts.ui.font.BTSFontManager;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.EventTopic;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.di.UISynchronize;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.services.internal.events.EventBroker;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.ITextListener;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.TextEvent;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.jface.text.source.AnnotationModel;
import org.eclipse.jface.text.source.AnnotationPainter;
import org.eclipse.jface.text.source.CompositeRuler;
import org.eclipse.jface.text.source.IAnnotationAccess;
import org.eclipse.jface.text.source.IAnnotationModel;
import org.eclipse.jface.text.source.IAnnotationModelListener;
import org.eclipse.jface.text.source.LineNumberRulerColumn;
import org.eclipse.jface.text.source.OverviewRuler;
import org.eclipse.jface.text.source.SourceViewerConfiguration;
import org.eclipse.jface.text.source.VerticalRuler;
import org.eclipse.jface.text.source.projection.ProjectionViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Widget;
import org.eclipse.ui.texteditor.spelling.SpellingAnnotation;
import org.eclipse.ui.texteditor.spelling.SpellingProblem;

public class EgyptEditorPart
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
	private static final String FONT_NAME = "FreeSans";
	private static final int SIZE = 10;

	private StyledText styledText;
	private BTSText text;
	private Widget shell;
	private CTabItem tbtmBtseditor;
	private CTabFolder tabFolder;
	private StyledText plainTextEditor;
	private JTextAsWordsEditorPanel editorPanel;
	private Text codeBufferText;
	private JMDCEditor jseshEditor;

	protected int counter;

	protected boolean loading;

	private VerticalRuler verticalRuler;

	private ProjectionViewer textViewer;

	private Document document;

	private IAnnotationModel annotationModel;

	protected int tabSelection;

	private TextModel textModel;

	private Map<Object, BTSSentenceItems> ramsesTextModelMap;

	private TextSignEditorComposite signTextEditor;

	/**
	 * @param parent
	 */
	@PostConstruct
	public void createComposite(Composite parent)
	{
		parent.setLayout(new GridLayout());
		shell = new Shell();

		Composite composite = new Composite(parent, SWT.NONE);
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
								updateModelFromRamses();
								break;
							}
							case 3:
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
								loadInputRamses(text);
								break;
							}
							case 3:
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
				//				CTabItem tbtm0 = new CTabItem(tabFolder, SWT.NONE);
				//				tbtm0.setText("WrappedSourceViewer");
				//				{
				//					Composite plainTextComp = new Composite(tabFolder, SWT.NONE | SWT.BORDER);
				//					plainTextComp.setLayout(new GridLayout(2, false));
				//					tbtm0.setControl(plainTextComp);
				//
				//					WrappedSourceViewer wsv = new WrappedSourceViewer(plainTextComp);
				//					plainTextComp.layout();
				//					plainTextComp.pack();
				//				}
				CTabItem edTab = new CTabItem(tabFolder, SWT.NONE);
				edTab.setText("Transcription");

				{
					Composite btsEditorComp = new Composite(tabFolder, SWT.BORDER);
					btsEditorComp.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
					btsEditorComp.setLayout(new FillLayout());
					//					((FillLayout) btsEditorComp.getLayout()).
					edTab.setControl(btsEditorComp);
					//
					//					Button b = new Button(btsEditorComp, SWT.PUSH);
					//					b.setText("Save");
					//					b.addSelectionListener(new SelectionListener()
					//					{
					//
					//						@Override
					//						public void widgetSelected(SelectionEvent e)
					//						{
					//							save();
					//
					//						}
					//
					//						@Override
					//						public void widgetDefaultSelected(SelectionEvent e)
					//						{
					//							// TODO Auto-generated method stub
					//
					//						}
					//					});

					Document doc = new Document(
							"Hallo Welt asd asdf klaskdlfa sdlfk \n<hr />kasdlökfasödkf \nllllllllll");

					IAnnotationModel model = new AnnotationModel();

					model.connect(doc);
					Annotation annotation = new BulletAnnotation(1);
					Position position = new Position(2, 4);
					model.addAnnotation(annotation, position);

					CompositeRuler verticalRuler = new CompositeRuler(15);
					verticalRuler.setModel(model);
					OverviewRuler oRuler = new OverviewRuler(null, 10, null);
					oRuler.setModel(model);
					int styles = SWT.V_SCROLL | SWT.H_SCROLL | SWT.MULTI | SWT.BORDER | SWT.FULL_SELECTION;
					textViewer = new ProjectionViewer(btsEditorComp, verticalRuler, oRuler, true, styles);
					//					verticalRuler.createControl(btsEditorComp, textViewer);

					SourceViewerConfiguration configuration = new BTSEgySourceViewerConfiguration();
					textViewer.configure(configuration);
					IAnnotationAccess annotationAccess = new IAnnotationAccess()
					{
						public Object getType(Annotation annotation)
						{
							return annotation.getType();
						}

						public boolean isMultiLine(Annotation annotation)
						{
							return true;
						}

						public boolean isTemporary(Annotation annotation)
						{
							return true;
						}
					};

					AnnotationPainter painter = new AnnotationPainter(textViewer, annotationAccess);
					painter.addDrawingStrategy(BulletAnnotation.TYPE, new BulletDrawingStrategy());
					painter.addAnnotationType(BulletAnnotation.TYPE, BulletAnnotation.TYPE);
					painter.setAnnotationTypeColor(BulletAnnotation.TYPE, textViewer.getTextWidget().getForeground());

					textViewer.addTextListener(new ITextListener()
					{

						@Override
						public void textChanged(TextEvent event)
						{
							System.out.println(event);
							IAnnotationModel aModel = textViewer.getAnnotationModel();
							if (counter == 25)
							{
								StyleRange[] ranges = textViewer.getTextWidget().getStyleRanges();

								StyleRange r = new StyleRange(9, 10, new Color(Display.getDefault(), new RGB(100, 100,
										100)), new Color(Display.getDefault(), new RGB(255, 255, 100)));
								//								textViewer.getTextWidget().setStyleRange(r);
							}
							if (loading)
							{
								StyleRange[] ranges = textViewer.getTextWidget().getStyleRanges();
								StyleRange r = new StyleRange(3, 10, new Color(Display.getDefault(), new RGB(100, 100,
										100)), new Color(Display.getDefault(), new RGB(255, 255, 100)));
								//								textViewer.getTextWidget().setStyleRange(r);
								SpellingProblem spProblem = new SpellingProblem()
								{

									@Override
									public ICompletionProposal[] getProposals()
									{
										// TODO Auto-generated method stub
										return new ICompletionProposal[] {};
									}

									@Override
									public int getOffset()
									{
										// TODO Auto-generated method stub
										return 5;
									}

									@Override
									public String getMessage()
									{
										// TODO Auto-generated method stub
										return "Hallo Christoph";
									}

									@Override
									public int getLength()
									{
										// TODO Auto-generated method stub
										return 10;
									}
								};
								SpellingAnnotation spa = new SpellingAnnotation(spProblem);
								aModel.addAnnotation(spa, new Position(spa.getSpellingProblem().getOffset(), spa
										.getSpellingProblem().getLength()));
							}
							counter++;
							if (counter > 20)
							{
								loading = true;
							}
							if (counter > 22)
							{
								loading = false;
							}

						}
					});

					textViewer.setDocument(doc, model);
					textViewer.getAnnotationModel().addAnnotationModelListener(new IAnnotationModelListener()
					{

						@Override
						public void modelChanged(IAnnotationModel model)
						{
							System.out.println(model);

						}
					});
					//	
					//					textViewer.getControl().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
					verticalRuler.addDecorator(0, new LineNumberRulerColumn());
					verticalRuler.getControl().setBackground(new Color(Display.getCurrent(), new RGB(100, 100, 100)));
					btsEditorComp.layout();
					//					btsEditorComp.pack();

				}
				//				tbtmBtseditor = new CTabItem(tabFolder, SWT.NONE);
				//				tbtmBtseditor.setText("BTSEditor");
				//				{
				//
				//					Composite btsEditorComp = new Composite(tabFolder, SWT.NONE);
				//					btsEditorComp.setLayout(new GridLayout());
				//
				//					tbtmBtseditor.setControl(btsEditorComp);
				//
				//					styledText = new StyledText(btsEditorComp, SWT.BORDER | SWT.WRAP | SWT.V_SCROLL | SWT.MULTI);
				//					styledText.setLayoutData(new GridData(GridData.FILL_BOTH));
				//					Font font = null;
				//
				//					//					boolean isLoaded = Display.getCurrent().loadFont(
				//					//							"E:/AAEW/dev/ws_bts_v2/org.bbaw.bts.ui.font.egyFont/font/FreeSerif.ttf");
				//					//					if (isLoaded)
				//					//					{
				//					//						FontData[] fd = Display.getCurrent().getFontList(null, true);
				//					//						FontData fontdata = null;
				//					//						for (int i = 0; i < fd.length; i++)
				//					//						{
				//					//							if (fd[i].getName().equals("FreeSerif"))
				//					//							{
				//					//								fontdata = fd[i];
				//					//								break;
				//					//							}
				//					//						}
				//					//						if (fontdata != null)
				//					//						{
				//					//							fontdata.setHeight(8);
				//					//							font = new Font(Display.getCurrent(), fontdata);
				//					//						}
				//					//					}
				//					//					font = fontManager.getFont(FONT_NAME);
				//					System.out.println(font);
				//					//					if (font == null)
				//					//					{
				//					//						font = new Font(Display.getCurrent(), FONT_NAME, 12, SWT.NORMAL);
				//					//					}
				//					font = new Font(Display.getCurrent(), FONT_NAME, SIZE, SWT.NORMAL);
				//					styledText.setFont(font);
				//					styledText.setText("[&hDot;&aleph;,t-&ajin;]-m" + " &halfSqOn;s&hArc;&aleph;,w&sicChr;&halfSqOff;"
				//							+ " &hUs;r-n&tUs;r");
				//
				//					btsEditorComp.layout();
				//					btsEditorComp.pack();
				//				}

				CTabItem tbtmPlaintext2 = new CTabItem(tabFolder, SWT.NONE);
				tbtmPlaintext2.setText("Sign-Text-Editor");
				{
					Composite plainTextComp = new Composite(tabFolder, SWT.NONE | SWT.BORDER);
					plainTextComp.setLayout(new GridLayout());
					tbtmPlaintext2.setControl(plainTextComp);
					signTextEditor = new TextSignEditorComposite(plainTextComp, SWT.None);
					signTextEditor.setEventBroker(eventBroker);
					plainTextComp.layout();
					plainTextComp.pack();
				}
				CTabItem tbtmPlaintext = new CTabItem(tabFolder, SWT.NONE);
				tbtmPlaintext.setText("Ramses-Editor");
				{
					textModel = new TextModel();
					Composite plainTextComp = new Composite(tabFolder, SWT.NONE | SWT.BORDER);
					plainTextComp.setLayout(new GridLayout());
					tbtmPlaintext.setControl(plainTextComp);

					Composite comEmbeded = new Composite(plainTextComp, SWT.EMBEDDED | SWT.NO_BACKGROUND | SWT.BORDER);
					comEmbeded.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

					// comEmbeded.setLayout(new FillLayout());
					Frame frame = SWT_AWT.new_Frame(comEmbeded);

					// JButton jbutton = new JButton("Testbutton AWT");
					// frame.add(jbutton);
					// jbutton.doLayout();

					editorPanel = new JTextAsWordsEditorPanel();
					editorPanel.setPreferredSize(new Dimension(500, 500));

					//					editorPanel.addHighlight(2, 2);
					//					editorPanel.setCurrentLineComment("Hallo Welt");
					editorPanel.setElementColor(ElementColor.BLACK);
					frame.add(editorPanel);
					editorPanel.addRamsesWordEditionListener(new RamsesWordEditionListener()
					{

						@Override
						public void update()
						{
							notifyRamsesWordSelection(editorPanel.getSelectedText());

						}

						@Override
						public void readonlyViolation()
						{
							System.out.println();

						}
					});
					// JMDCEditor editor = new JMDCEditor();
					// editor.setMDCText("pt:p*t");
					// editor.setPreferredSize(new Dimension(500, 500));
					// frame.add(editor);
					//
					// JMDCField field = new JMDCField();
					// frame.add(field);

					// frame.doLayout();
					comEmbeded.layout();

					plainTextComp.layout();
					plainTextComp.pack();
				}

				CTabItem tbtm5 = new CTabItem(tabFolder, SWT.NONE);
				tbtm5.setText("JseshEditor");
				{
					Composite plainTextComp = new Composite(tabFolder, SWT.NONE | SWT.BORDER);
					plainTextComp.setLayout(new GridLayout(2, false));
					tbtm5.setControl(plainTextComp);

					Label l = new Label(plainTextComp, SWT.NONE);
					l.setText("CodeBuffer");

					codeBufferText = new Text(plainTextComp, SWT.BORDER);
					codeBufferText.addKeyListener(new KeyListener()
					{

						@Override
						public void keyReleased(KeyEvent e)
						{
							// TODO Auto-generated method stub

						}

						@Override
						public void keyPressed(KeyEvent e)
						{
							if (e.keyCode == SWT.CR)
							{
								jseshEditor.insert(codeBufferText.getText());
								jseshEditor.setMDCText(codeBufferText.getText());
								codeBufferText.setText("");
							}

						}
					});
					Composite comEmbeded = new Composite(plainTextComp, SWT.EMBEDDED | SWT.NO_BACKGROUND | SWT.BORDER);
					comEmbeded.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));

					// comEmbeded.setLayout(new FillLayout());
					Frame frame = SWT_AWT.new_Frame(comEmbeded);

					jseshEditor = new JMDCEditor();
					jseshEditor.setMDCText("pt:p*t");
					// jseshEditor.setTextDirection(TextDirection.RIGHT_TO_LEFT);
					// jseshEditor.setTextOrientation(TextOrientation.VERTICAL);
					jseshEditor.setPreferredSize(new Dimension(500, 500));
					jseshEditor.addKeyListener(new java.awt.event.KeyListener()
					{

						@Override
						public void keyTyped(java.awt.event.KeyEvent e)
						{
							// TODO Auto-generated method stub

						}

						@Override
						public void keyReleased(java.awt.event.KeyEvent e)
						{
							Display.getDefault().asyncExec(new Runnable()
							{

								@Override
								public void run()
								{
									codeBufferText.setText(jseshEditor.getCodeBuffer());
									System.out.println(jseshEditor.getCodeBuffer());

								}
							});

						}

						@Override
						public void keyPressed(java.awt.event.KeyEvent e)
						{
							// TODO Auto-generated method stub

						}
					});
					codeBufferText.setText(jseshEditor.getCodeBuffer());

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
	}

	protected void updateModelFromSignText()
	{
		// TODO Auto-generated method stub

	}

	protected void updateModelFromJSesh()
	{
		// TODO Auto-generated method stub

	}

	private void notifyRamsesWordSelection(final List<ElementOccurrence> selectedElements)
	{
		sync.asyncExec(new Runnable()
		{
			private ElementOccurrence selection;

			public void run()
			{
				if (selectedElements.size() == 1)
				{
					if (selection == null || !selection.equals(selectedElements.get(0)))
					{
						selection = selectedElements.get(0);
						System.out.println("EgyptEditor notify RamsesWordSelection " + selection);

						selectionService.setSelection(selection);
						eventBroker.send("egywordSelection", selection);
					}
				} else if (editorPanel.getCurrentWord() != null)
				{
					if (selection == null || !selection.equals(selectedElements.get(0)))
					{
						selection = editorPanel.getCurrentWord();
						System.out.println("EgyptEditor notify RamsesWordSelection " + selection);
						selectionService.setSelection(selection);
						eventBroker.send("egywordSelection", selection);
					}
				}
			}
		});
	}

	protected void updateModelFromRamses()
	{
		this.text = textEditorController.updateTextFromRamsesModel(text, textModel, ramsesTextModelMap);

	}

	protected void updateModelFromTranscription()
	{
		this.text = textEditorController.updateTextFromDocument(text, document, annotationModel, textViewer);

	}

	protected void loadInputJSesh(BTSText text2)
	{
		// TODO Auto-generated method stub

	}

	protected void loadInputRamses(BTSText text2)
	{

		if (ramsesTextModelMap == null)
		{
			ramsesTextModelMap = new HashMap<Object, BTSSentenceItems>();
		}
		textEditorController.transformToRamsesTextModel(text, textModel, ramsesTextModelMap);
		editorPanel.clear();
		editorPanel.setTextModel(textModel);

	}

	protected void loadInputTranscription(BTSText text)
	{
		Document doc = new Document();
		this.document = doc;

		IAnnotationModel model = new AnnotationModel();
		this.annotationModel = model;
		textEditorController.transformToDocument(text, doc, model);
		textViewer.setDocument(doc, model);
		verticalRuler.setModel(model);

	}

	@Inject
	@Optional
	void eventReceivedNew(@EventTopic("model_new/BTSWord*") Object object)
	{
		if (object instanceof WordOccurrence)
		{
			WordOccurrence word = (WordOccurrence) object;
			ElementOccurrence current = editorPanel.getCurrentWord();
			int index = textModel.indexOf(current);
			editorPanel.insert(word);
			editorPanel.setCursorPosition(index + 1);

		}
	}

	@Inject
	void setSelection(@Optional @Named(IServiceConstants.ACTIVE_SELECTION) BTSObject selection)
	{
		if (selection == null)
		{
			/* implementation not shown */
		} else
		{
			if (selection instanceof BTSText)
			{
				loadInput((BTSCorpusObject) selection);
			}
		}
	}

	private void loadInput(BTSCorpusObject o)
	{
		if (o instanceof BTSText)
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
					loadInputRamses(text);
					break;
				}
				case 3:
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
		signTextEditor.setInput(text2);

	}

	private void purgeCache()
	{
		textModel = new TextModel();

	}

	@Focus
	public void setFocus()
	{
		tabFolder.setFocus();
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
				updateModelFromRamses();
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

	public JTextAsWordsEditorPanel getRamsesTextEditorPanel()
	{
		return editorPanel;
	}
}
