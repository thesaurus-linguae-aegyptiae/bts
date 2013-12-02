package org.bbaw.bts.ui.egy.parts;

import grammaticalBase.model.light.LightSpelling;
import grammaticalBase.model.text.ElementOccurrence;
import grammaticalBase.model.text.WordOccurrence;
import grammaticalBase.textEditor.view.textView.JTextAsWordsEditorPanel;

import java.awt.Dimension;
import java.awt.Frame;
import java.util.Collection;
import java.util.StringTokenizer;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;
import javax.swing.SwingUtilities;

import jsesh.editor.JMDCEditor;
import jsesh.hieroglyphs.DefaultHieroglyphicFontManager;
import jsesh.hieroglyphs.HieroglyphicFontManager;
import jsesh.hieroglyphs.HieroglyphsManager;
import jsesh.hieroglyphs.ManuelDeCodage;
import jsesh.hieroglyphs.ShapeChar;

import org.bbaw.bts.btsmodel.BTSGraphic;
import org.bbaw.bts.btsmodel.BTSWord;
import org.bbaw.bts.core.corpus.controller.partController.BTSTextEditorController;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.EventTopic;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.di.UISynchronize;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.swt.SWT;
import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import swing2swt.layout.FlowLayout;

public class EgyHieroglyphenTypeWriter
{
	@Inject
	private UISynchronize sync;
	@Inject
	private BTSTextEditorController textEditorController;
	@Inject
	private EPartService partService;
	private Text hierotw_text;
	private WordOccurrence wordOccurrence;
	private JMDCEditor jseshEditor;
	private ManuelDeCodage basicManuelDeCodageManager = ManuelDeCodage.getInstance();
	private HieroglyphsManager jSeshhieroglyphManager = new HieroglyphsManager(basicManuelDeCodageManager);
	private JMDCEditor jseshEditorProposals;
	private BTSWord currentWord;

	private boolean loading = false;

	private JTextAsWordsEditorPanel ramsesEditor;

	private HieroglyphicFontManager fontManager = DefaultHieroglyphicFontManager.getInstance();

	private ManuelDeCodage manuelDeCodage = ManuelDeCodage.instance;

	public EgyHieroglyphenTypeWriter()
	{
	}

	/**
	 * Create contents of the view part.
	 */
	@PostConstruct
	public void createControls(Composite parent)
	{
		parent.setLayout(new GridLayout(1, false));

		if (partService != null)
		{
			Collection<MPart> parts = partService.getParts();
			for (MPart p : parts)
			{
				if (p.getObject() instanceof EgyptEditorPart)
				{
					EgyptEditorPart editorPart = (EgyptEditorPart) p.getObject();
					ramsesEditor = editorPart.getRamsesTextEditorPanel();
					break;

				}
			}
		}

		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(new GridLayout(2, false));
		composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

		Composite composite_1 = new Composite(composite, SWT.NONE);
		composite_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		composite_1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));

		Button button = new Button(composite_1, SWT.NONE);
		button.setText("||<");

		Button button_1 = new Button(composite_1, SWT.NONE);
		button_1.setText("|<");

		Button button_2 = new Button(composite_1, SWT.NONE);
		button_2.setText("<");

		Button button_toNextWord = new Button(composite_1, SWT.NONE);
		button_toNextWord.setText(">");
		button_toNextWord.addSelectionListener(new SelectionAdapter()
		{

			@Override
			public void widgetSelected(SelectionEvent e)
			{
				// TODO Auto-generated method stub

			}

		});

		Button button_4 = new Button(composite_1, SWT.NONE);
		button_4.setText(">|");

		Button button_5 = new Button(composite_1, SWT.NONE);
		button_5.setText(">||");

		Label lblNewLabel = new Label(composite, SWT.NONE);
		lblNewLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel.setText("Type here");

		hierotw_text = new Text(composite, SWT.BORDER);
		hierotw_text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		hierotw_text.addModifyListener(new ModifyListener()
		{

			@Override
			public void modifyText(ModifyEvent e)
			{

				if (!loading)
				{
					String suffix = "";
					StringTokenizer tok = new StringTokenizer(hierotw_text.getText(), ":-<>");
					while (tok.hasMoreTokens())
					{
						suffix = tok.nextToken();
					}
					Collection<String> list = manuelDeCodage.getBasicGardinerCodesForFamily(suffix);
					ShapeChar glyph = fontManager.get("A1");
					jseshEditorProposals.clearText();
					for (int i = 0; i < list.size(); i++)
					{
						String pos = list.iterator().next();
						//					String prop = pos.getCode();// + "-\"" + i + "\"";
						jseshEditorProposals.insert(pos);
					}
					try
					{
						jseshEditor.setMDCText(hierotw_text.getText());
					} catch (Exception e1)
					{
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}

			}
		});
		new Label(composite, SWT.NONE);

		Composite comEmbededProposals = new Composite(composite, SWT.EMBEDDED | SWT.NO_BACKGROUND | SWT.BORDER);
		comEmbededProposals.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 2, 1));
		Frame frameProposals = SWT_AWT.new_Frame(comEmbededProposals);

		jseshEditorProposals = new JMDCEditor();
		// jseshEditor.setTextDirection(TextDirection.RIGHT_TO_LEFT);
		// jseshEditor.setTextOrientation(TextOrientation.VERTICAL);
		jseshEditorProposals.setPreferredSize(new Dimension(500, 40));

		frameProposals.add(jseshEditorProposals);

		comEmbededProposals.layout();

		Composite comEmbeded = new Composite(composite, SWT.EMBEDDED | SWT.NO_BACKGROUND | SWT.BORDER);
		comEmbeded.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 2, 1));

		// comEmbeded.setLayout(new FillLayout());
		Frame frame = SWT_AWT.new_Frame(comEmbeded);

		jseshEditor = new JMDCEditor();
		// jseshEditor.setTextDirection(TextDirection.RIGHT_TO_LEFT);
		// jseshEditor.setTextOrientation(TextOrientation.VERTICAL);
		jseshEditor.setPreferredSize(new Dimension(500, 40));

		frame.add(jseshEditor);

		comEmbeded.layout();
	}

	@PreDestroy
	public void dispose()
	{
	}

	@Focus
	public void setFocus()
	{
		// TODO	Set the focus to control
	}

	void setSelection(Object selection)
	{
		System.out.println("hieroglyph tw selection received: " + selection);

		loading = true;
		try
		{

			if (selection == null)
			{
				/* implementation not shown */
			} else if (selection instanceof ElementOccurrence)
			{
				ElementOccurrence element = (ElementOccurrence) selection;
				if (element.getElement() != null && element.getElement() instanceof WordOccurrence)
				{
					WordOccurrence oldWord = wordOccurrence;
					if (oldWord != null)
					{
						saveMdCstring(oldWord);
					}
					wordOccurrence = (WordOccurrence) element.getElement();
					if (wordOccurrence.getSpelling() != null)
					{
						loadMdCString(wordOccurrence.getSpelling().getMdC());
					}
				}
			} else if (selection instanceof BTSWord)
			{
				BTSWord oldWord = currentWord;
				if (oldWord != null)
				{
					saveMdCstring(oldWord);
				}
				currentWord = (BTSWord) selection;
				if (currentWord != null)
				{
					loadMdCString(transformWordToMdCString(currentWord));
				}
			}
		} finally
		{
			loading = false;
		}
	}

	private void saveMdCstring(BTSWord word)
	{
		textEditorController.updateBTSWordFromMdCString(word, hierotw_text.getText());

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
		return mdc;
	}

	@Inject
	@Optional
	void eventReceivedNew(@EventTopic("egywordSelection") Object selection)
	{
		if (!loading)
		{
			setSelection(selection);
		}
	}

	private void saveMdCstring(final WordOccurrence word)
	{
		sync.asyncExec(new Runnable()
		{
			public void run()
			{
				if (word.getSpelling() == null)
				{
					word.setSpelling(new LightSpelling());
				}
				if (word.getSpelling().getMdC() != hierotw_text.getText() && !"".equals(hierotw_text.getText()))
				{
					//					word.getSpelling().setMdC();
					final String text = hierotw_text.getText();

					SwingUtilities.invokeLater(new Runnable()
					{

						@Override
						public void run()
						{
							LightSpelling oldSpelling = word.getSpelling();
							LightSpelling spelling = new LightSpelling(oldSpelling.getId() + 500, oldSpelling
									.getLabel(), text);
							word.setSpelling(spelling);
							if (ramsesEditor != null)
							{
								//						RamsesWordEditionListener listener = ramsesEditor.g
								ramsesEditor.changeWordData(word.getWordAnalysis());
							}

						}

					});
					//					hierotw_text.setText("");

				}
			}
		});
	}

	private void loadMdCString(final String mdC)
	{
		sync.asyncExec(new Runnable()
		{
			public void run()
			{
				hierotw_text.setText(mdC);
			}
		});

	}
}
