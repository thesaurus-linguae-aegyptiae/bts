package org.bbaw.bts.ui.main.parts;

import grammaticalBase.lexiconEditor.view.JLexicalEditor;
import grammaticalBase.model.light.LightSpelling;
import grammaticalBase.model.text.ElementColor;
import grammaticalBase.model.text.ElementOccurrence;
import grammaticalBase.model.text.TextModel;
import grammaticalBase.model.text.WordOccurrence;
import grammaticalBase.syntaxEditor.ui.syntagmAttributeEditor.JSyntagmEditor;
import grammaticalBase.textEditor.view.textView.JTextAsWordsEditorPanel;

import java.awt.Dimension;
import java.awt.Frame;
import java.io.UnsupportedEncodingException;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import jsesh.editor.JMDCEditor;

import org.bbaw.bts.btsmodel.BTSCorpusObject;
import org.bbaw.bts.btsmodel.BTSText;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.EventTopic;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Widget;

public class EgyptEditorPart
{

	private StyledText styledText;
	private Text text;
	private Widget shell;
	private CTabItem tbtmBtseditor;
	private CTabFolder tabFolder;
	private StyledText plainTextEditor;
	private TextModel textModel;
	private JTextAsWordsEditorPanel editorPanel;
	private Text codeBufferText;
	private JMDCEditor jseshEditor;

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

			tabFolder.setSelectionBackground(Display.getCurrent().getSystemColor(
					SWT.COLOR_TITLE_INACTIVE_BACKGROUND_GRADIENT));
			{
				tbtmBtseditor = new CTabItem(tabFolder, SWT.NONE);
				tbtmBtseditor.setText("BTSEditor");
				{

					Composite btsEditorComp = new Composite(tabFolder, SWT.NONE);
					btsEditorComp.setLayout(new GridLayout());
					Group sGroup = new Group(btsEditorComp, SWT.NONE);
					sGroup.setLayout(new RowLayout());

					Button btnSuche = new Button(sGroup, SWT.NONE);
					btnSuche.setText("Eingeben");
					btnSuche.addSelectionListener(new SelectionListener()
					{

						@Override
						public void widgetSelected(SelectionEvent e)
						{
							styledText.insert(transformUnicode(text.getText()));

						}

						private String transformUnicode(String text)
						{

							try
							{
								byte[] utf8 = text.getBytes("UTF-8");

								return new String(utf8, "UTF-8");
							} catch (UnsupportedEncodingException e)
							{
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							return "(" + text + ")";
						}

						@Override
						public void widgetDefaultSelected(SelectionEvent e)
						{
							// TODO Auto-generated method stub

						}
					});

					Button btnFunktion = new Button(sGroup, SWT.NONE);
					btnFunktion.setText("Funktion");

					btnFunktion.addSelectionListener(new SelectionListener()
					{

						@Override
						public void widgetSelected(SelectionEvent e)
						{
							styledText.insert(transformUnicode(text.getText()));

						}

						private String transformUnicode(String text)
						{

							return ("\\u" + text).substring(1);
						}

						@Override
						public void widgetDefaultSelected(SelectionEvent e)
						{
							// TODO Auto-generated method stub

						}
					});
					Button btnNeu = new Button(sGroup, SWT.NONE);
					btnNeu.setText("Neu");

					text = new Text(sGroup, SWT.BORDER);
					text.addKeyListener(new KeyListener()
					{

						@Override
						public void keyReleased(KeyEvent e)
						{
							// TODO Auto-generated method stub

						}

						@Override
						public void keyPressed(KeyEvent e)
						{
							Integer i = null;
							// System.out.println(i.toString());

						}
					});

					tbtmBtseditor.setControl(btsEditorComp);

					styledText = new StyledText(btsEditorComp, SWT.BORDER | SWT.WRAP | SWT.V_SCROLL | SWT.MULTI);
					styledText.setLayoutData(new GridData(GridData.FILL_BOTH));
					Font font = new Font(new Shell().getDisplay(), "New Athena Unicode", 12, SWT.NORMAL);
					styledText.setFont(font);
					styledText.setText("[&hDot;&aleph;,t-&ajin;]-m" + " &halfSqOn;s&hArc;&aleph;,w&sicChr;&halfSqOff;"
							+ " &hUs;r-n&tUs;r");

					btsEditorComp.layout();
					btsEditorComp.pack();
				}
				CTabItem tbtmPlaintext = new CTabItem(tabFolder, SWT.NONE);
				tbtmPlaintext.setText("RamsesTextEditor");
				{
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

					textModel = new TextModel();
					WordOccurrence modelElement = new WordOccurrence();
					LightSpelling ls = new LightSpelling();
					ls.setMdC("pt:p*t");
					ls.setEncodedOrderingTranslitteration("Hallo Welt");
					modelElement.setSpelling(ls);
					textModel.add(modelElement);

					WordOccurrence modelElement2 = new WordOccurrence();
					LightSpelling ls2 = new LightSpelling();
					ls2.setMdC("pt:p*t");
					ls2.setEncodedOrderingTranslitteration("Hallo Welt");
					modelElement2.setSpelling(ls2);
					textModel.add(modelElement2);

					WordOccurrence modelElement3 = new WordOccurrence();
					LightSpelling ls3 = new LightSpelling();
					ls3.setMdC("pt:p*t");
					ls3.setEncodedOrderingTranslitteration("Hallo Welt");
					modelElement3.setSpelling(ls3);
					textModel.add(modelElement3);

					editorPanel.setTextModel(textModel);

					editorPanel.addHighlight(2, 2);
					editorPanel.setCurrentLineComment("Hallo Welt");
					editorPanel.setElementColor(ElementColor.BLACK);
					frame.add(editorPanel);

					// JMDCEditor editor = new JMDCEditor();
					// editor.setMDCText("pt:p*t");
					// editor.setPreferredSize(new Dimension(500, 500));
					// frame.add(editor);
					//
					// JMDCField field = new JMDCField();
					// frame.add(field);

					// frame.doLayout();
					comEmbeded.layout();
					// plainTextEditor = new StyledText(plainTextComp,
					// SWT.BORDER | SWT.WRAP | SWT.V_SCROLL | SWT.MULTI);
					// plainTextEditor.setLayoutData(new
					// GridData(GridData.FILL_BOTH));
					//
					// Font font = new Font(shell.getDisplay(),
					// "New Athena Unicode", 12, SWT.NORMAL);
					// plainTextEditor.setFont(font);
					// plainTextEditor.setText("[&hDot;&aleph;,t-&ajin;]-m"
					// + " &halfSqOn;s&hArc;&aleph;,w&sicChr;&halfSqOff;" +
					// " &hUs;r-n&tUs;r");

					plainTextComp.layout();
					plainTextComp.pack();
				}

				CTabItem tbtm3 = new CTabItem(tabFolder, SWT.NONE);
				tbtm3.setText("LexEditor");
				{
					Composite plainTextComp = new Composite(tabFolder, SWT.NONE | SWT.BORDER);
					plainTextComp.setLayout(new GridLayout());
					tbtm3.setControl(plainTextComp);

					Composite comEmbeded = new Composite(plainTextComp, SWT.EMBEDDED | SWT.NO_BACKGROUND | SWT.BORDER);
					comEmbeded.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

					// comEmbeded.setLayout(new FillLayout());
					Frame frame = SWT_AWT.new_Frame(comEmbeded);

					JLexicalEditor led = new JLexicalEditor();

					frame.add(led);

					comEmbeded.layout();

					plainTextComp.layout();
					plainTextComp.pack();
				}

				CTabItem tbtm4 = new CTabItem(tabFolder, SWT.NONE);
				tbtm4.setText("SyntaxEditor");
				{
					Composite plainTextComp = new Composite(tabFolder, SWT.NONE | SWT.BORDER);
					plainTextComp.setLayout(new GridLayout());
					tbtm4.setControl(plainTextComp);

					Composite comEmbeded = new Composite(plainTextComp, SWT.EMBEDDED | SWT.NO_BACKGROUND | SWT.BORDER);
					comEmbeded.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

					// comEmbeded.setLayout(new FillLayout());
					Frame frame = SWT_AWT.new_Frame(comEmbeded);

					JSyntagmEditor synEd = new JSyntagmEditor();
					frame.add(synEd);

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

	@Inject
	@Optional
	void eventReceivedNew(@EventTopic("model_new/*") Object object)
	{
		if (object instanceof WordOccurrence)
		{
			WordOccurrence word = (WordOccurrence) object;
			ElementOccurrence current = editorPanel.getCurrentWord();
			int index = textModel.indexOf(current);
			textModel.add(index, word);
			editorPanel.setTextModel(textModel);
			editorPanel.setCursorPosition(index + 1);

		}
	}

	@Inject
	@Optional
	void eventReceived(@EventTopic("viewcommunication/*") ISelection selection)
	{
		Object o = ((StructuredSelection) selection).getFirstElement();
		if (o instanceof BTSCorpusObject)
		{
			loadInput((BTSCorpusObject) o);
		}
		System.out.println("EgyptTexted selection received");

	}

	private void loadInput(BTSCorpusObject o)
	{
		if (o instanceof BTSText)
		{

			plainTextEditor.setText(((BTSText) o).getCode());
		} else
		{
			// plainTextEditor.setText("");
		}

	}

	@Focus
	public void setFocus()
	{
		tabFolder.setFocus();
	}
}
