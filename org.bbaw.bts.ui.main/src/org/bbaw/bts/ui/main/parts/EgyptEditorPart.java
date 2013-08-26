package org.bbaw.bts.ui.main.parts;

import java.io.UnsupportedEncodingException;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSCorpusObject;
import org.bbaw.bts.btsmodel.BTSText;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.EventTopic;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
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
				tbtmPlaintext.setText("PlainText");
				{
					Composite plainTextComp = new Composite(tabFolder, SWT.NONE);
					plainTextComp.setLayout(new GridLayout());
					tbtmPlaintext.setControl(plainTextComp);

					plainTextEditor = new StyledText(plainTextComp, SWT.BORDER | SWT.WRAP | SWT.V_SCROLL | SWT.MULTI);
					plainTextEditor.setLayoutData(new GridData(GridData.FILL_BOTH));

					Font font = new Font(shell.getDisplay(), "New Athena Unicode", 12, SWT.NORMAL);
					plainTextEditor.setFont(font);
					plainTextEditor.setText("[&hDot;&aleph;,t-&ajin;]-m"
							+ " &halfSqOn;s&hArc;&aleph;,w&sicChr;&halfSqOff;" + " &hUs;r-n&tUs;r");

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
			plainTextEditor.setText("");
		}

	}

	@Focus
	public void setFocus()
	{
		tabFolder.setFocus();
	}
}
