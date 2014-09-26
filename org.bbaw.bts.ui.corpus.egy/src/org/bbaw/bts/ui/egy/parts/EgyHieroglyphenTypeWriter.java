package org.bbaw.bts.ui.egy.parts;

//import grammaticalBase.model.light.LightSpelling;
//import grammaticalBase.model.text.ElementOccurrence;
//import grammaticalBase.model.text.WordOccurrence;
//import grammaticalBase.textEditor.view.textView.JTextAsWordsEditorPanel;

import java.awt.Dimension;
import java.awt.Frame;
import java.util.Collection;
import java.util.EventObject;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;
import javax.inject.Named;

import jsesh.editor.JMDCEditor;
import jsesh.hieroglyphs.DefaultHieroglyphicFontManager;
import jsesh.hieroglyphs.HieroglyphicFontManager;
import jsesh.hieroglyphs.HieroglyphsManager;
import jsesh.hieroglyphs.ManuelDeCodage;
import jsesh.mdc.MDCSyntaxError;
import jsesh.mdc.utils.MDCNormalizer;

import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.commons.BTSPluginIDs;
import org.bbaw.bts.commons.interfaces.ScatteredCachingPart;
import org.bbaw.bts.core.controller.generalController.EditingDomainController;
import org.bbaw.bts.core.controller.generalController.PermissionsAndExpressionsEvaluationController;
import org.bbaw.bts.core.corpus.controller.partController.BTSTextEditorController;
import org.bbaw.bts.core.corpus.controller.partController.HieroglyphTypeWriterController;
import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject;
import org.bbaw.bts.corpus.btsCorpusModel.BTSGraphic;
import org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaEntry;
import org.bbaw.bts.corpus.btsCorpusModel.BTSText;
import org.bbaw.bts.corpus.btsCorpusModel.BTSWord;
import org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelPackage;
import org.bbaw.bts.ui.commons.corpus.events.BTSTextSelectionEvent;
import org.bbaw.bts.ui.commons.utils.BTSUIConstants;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.EventTopic;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.di.Persist;
import org.eclipse.e4.ui.di.UISynchronize;
import org.eclipse.e4.ui.model.application.ui.MDirtyable;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.services.EContextService;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.services.internal.events.EventBroker;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.swt.SWT;
import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.widgets.Text;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventHandler;

public class EgyHieroglyphenTypeWriter implements ScatteredCachingPart,
		EventHandler
{
	private static final String MDC_MARKER = "\\red";
	private static final String MDC_IGNORE = "\\\\i";
	private static final String HTW_CONTEXT_ID = "org.bbaw.bts.ui.corpus.egy.bindingcontext.htw";
	@Inject
	private UISynchronize sync;
	@Inject
	private BTSTextEditorController textEditorController;
	// @Inject
	// GraphicSelectionCounterService service;
	@Inject
	private EPartService partService;
	@Inject
	private EventBroker eventBroker;
	@Inject
	private HieroglyphTypeWriterController htwController;
	@Inject
	private EContextService contextService;
	@Inject
	private MDirtyable dirty;
	@Inject
	private EditingDomainController editingDomainController;

	@Inject
	private PermissionsAndExpressionsEvaluationController evaluationController;
	private Text hierotw_text;
	// private WordOccurrence wordOccurrence;
	// private JTextAsWordsEditorPanel ramsesEditor;

	private JMDCEditor jseshEditor;
	private ManuelDeCodage basicManuelDeCodageManager = ManuelDeCodage.getInstance();
	private HieroglyphsManager jSeshhieroglyphManager = new HieroglyphsManager(basicManuelDeCodageManager);
	private JMDCEditor jseshEditorProposals;
	private BTSWord currentWord;

	private boolean loading = false;


	private HieroglyphicFontManager fontManager = DefaultHieroglyphicFontManager.getInstance();

	private ManuelDeCodage manuelDeCodage = ManuelDeCodage.instance;


	private boolean selfSelecting;
	private Button firstGlyph_Button;
	private Button previousGlyph_Button;
	private Button nextGlyph_Button;
	private Button lastGlyph_Button;
	private Spinner glyphOrder_spinner;
	private Button ignoreGlyph_Button;
	private EList<BTSGraphic> wordGraphics;
	private MDCNormalizer mdcNormalizer;
	private BTSGraphic selectedGlyphe;
	private String beforeImageMdC;
	private Map hieroglyphSelectionCounterCacheMap = new HashMap<URI, Object>();
	private String htwProposals;
	private BTSObject selectionObject;
	private boolean loaded;
	private EditingDomain editingDomain;
	private Set<Command> localCommandCacheSet = new HashSet<Command>();
	private BTSText currentText;
	private CommandStackListener commandStackListener;
	private MPart part;
	
	private String suffix;
	private String mdcProposals;

	@Inject
	public EgyHieroglyphenTypeWriter(EPartService partService)
	{
		part = partService.findPart(BTSPluginIDs.PART_ID_HIEROGLYPH_TW);
	}

	/**
	 * Create contents of the view part.
	 */
	@PostConstruct
	public void createControls(Composite parent)
	{
		eventBroker.subscribe(BTSUIConstants.EVENT_HTW_SHORTCUT, this);
		mdcNormalizer = new MDCNormalizer();
		parent.setLayout(new GridLayout(1, false));

		if (partService != null)
		{
			Collection<MPart> parts = partService.getParts();

		}

		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(new GridLayout(2, false));
		((GridLayout) composite.getLayout()).marginHeight = 0;
		((GridLayout) composite.getLayout()).marginWidth = 0;

		composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));


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
					String internalSuffix = getInteralProSuffix();
					
					if (internalSuffix.equals(suffix))
					{
						return;
					}
					suffix = internalSuffix;
					jseshEditorProposals.clearText();
					String normalizedMdC = suffix;
					try {
						normalizedMdC = mdcNormalizer.normalize(suffix);
					} catch (MDCSyntaxError ee) {
						ee.printStackTrace();
					}
					if (normalizedMdC != null && !"".equals(normalizedMdC)) {

						mdcProposals = getHieroglypheProposals(normalizedMdC);

						if (mdcProposals.length() > 1) {
							mdcProposals = mdcProposals.substring(1, mdcProposals.length());
							System.out.println(mdcProposals);
							jseshEditorProposals.setMDCText(mdcProposals);
						}
					}
					setHiertTWText(hierotw_text.getText());
					
				}

			}
		});
		hierotw_text.addKeyListener(new KeyListener() {

			@Override
			public void keyReleased(KeyEvent e) {
			}

			@Override
			public void keyPressed(KeyEvent e) {
				if (e.keyCode == SWT.CR) {
					shiftCaret(BTSUIConstants.EVENT_TEXT_SELECTION_NEXT);
				}
				else if(e.stateMask == SWT.CTRL && Character.isDigit(e.character)){
					System.out.println(Character.getNumericValue(e.character));
					selectMdCProposal(Character.getNumericValue(e.character));
			    }


			}
		});
		Group manageGlyphs_composite = new Group(parent, SWT.NONE);
		manageGlyphs_composite.setLayout(new GridLayout(8, false));
		manageGlyphs_composite.setLayoutData(new GridData(SWT.FILL, SWT.TOP,
				true, false, 1, 1));

		manageGlyphs_composite.setText("Select Single Glyphs");

		firstGlyph_Button = new Button(manageGlyphs_composite, SWT.NONE);
		firstGlyph_Button.setText("|<");
		firstGlyph_Button.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				shiftGlyphSelection(-1000);

			}
		});

		previousGlyph_Button = new Button(manageGlyphs_composite, SWT.NONE);
		previousGlyph_Button.setText("<");
		previousGlyph_Button.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				shiftGlyphSelection(-1);

			}
		});
		nextGlyph_Button = new Button(manageGlyphs_composite, SWT.NONE);
		nextGlyph_Button.setText(">");
		nextGlyph_Button.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				shiftGlyphSelection(1);

			}
		});
		lastGlyph_Button = new Button(manageGlyphs_composite, SWT.NONE);
		lastGlyph_Button.setText(">|");
		lastGlyph_Button.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				shiftGlyphSelection(1000);

			}
		});
		Label lblNewLabel_1 = new Label(manageGlyphs_composite, SWT.NONE);
		lblNewLabel_1.setText("Order in Sentence");

		glyphOrder_spinner = new Spinner(manageGlyphs_composite, SWT.BORDER);
		 glyphOrder_spinner.addSelectionListener(new SelectionAdapter() {
		
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (selectedGlyphe != null) {
					selectedGlyphe.setInnerSentenceOrder(glyphOrder_spinner
							.getSelection());
				}

			}
		});
		ignoreGlyph_Button = new Button(manageGlyphs_composite, SWT.CHECK);
		ignoreGlyph_Button.setText("Ignore Glyph");
		ignoreGlyph_Button.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				setSelectedGlypheIgnored(ignoreGlyph_Button.getSelection());

			}
		});
		Composite comEmbededProposals = new Composite(composite, SWT.EMBEDDED | SWT.NO_BACKGROUND | SWT.BORDER);
		comEmbededProposals.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true,
				true, 2, 1));
		Frame frameProposals = SWT_AWT.new_Frame(comEmbededProposals);

		jseshEditorProposals = new JMDCEditor();
		// jseshEditor.setTextDirection(TextDirection.RIGHT_TO_LEFT);
		// jseshEditor.setTextOrientation(TextOrientation.VERTICAL);
		jseshEditorProposals.setPreferredSize(new Dimension(500, 40));

		frameProposals.add(jseshEditorProposals);

		comEmbededProposals.layout();

		Composite comEmbeded = new Composite(composite, SWT.EMBEDDED | SWT.NO_BACKGROUND | SWT.BORDER);
		comEmbeded.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true,
				2, 1));

		// comEmbeded.setLayout(new FillLayout());
		Frame frame = SWT_AWT.new_Frame(comEmbeded);

		jseshEditor = new JMDCEditor();
		// jseshEditor.setTextDirection(TextDirection.RIGHT_TO_LEFT);
		// jseshEditor.setTextOrientation(TextOrientation.VERTICAL);
		jseshEditor.setPreferredSize(new Dimension(500, 40));

		frame.add(jseshEditor);

		comEmbeded.layout();
		loaded = true;
		if (selectionObject != null)
		{
			setSelection(selectionObject);
		}

	}

	private String getInteralProSuffix() {
		String internalSuffix = "";
		StringTokenizer tok = new StringTokenizer(hierotw_text
				.getText(), ":-<>");
		while (tok.hasMoreTokens()) {
			internalSuffix = tok.nextToken();
		}
		return internalSuffix;
	}

	private void setHiertTWText(String mdc) {
		try
		{
			System.out.println(mdc);
			if (!(mdc.endsWith(":") || mdc.endsWith("-")
					|| mdc.endsWith("<") || mdc.endsWith("*") || mdc
					.endsWith("["))) {
				jseshEditor.setMDCText(mdc.toUpperCase());
			}
		} catch (Exception e1)
		{
			e1.printStackTrace();
		}
		
	}

	protected void selectMdCProposal(int index) {
		int start = 0;
		int end = mdcProposals.indexOf("\"" + index + "\"\\red");
		if (index > 1)
		{
			int before = index - 1;
			start = mdcProposals.indexOf("\"" + before + "\"\\red-");
			start = start + 8;
		}
		String part = mdcProposals.substring(start, end);
		if (part.contains("-"))
		{
			part = part.split("-")[0];
		}
		System.out.println(part);
		jseshEditorProposals.clearText();
		String mdc = hierotw_text
				.getText();
		String suffix = getInteralProSuffix();
		mdc = mdc.replace(suffix, part);
		hierotw_text.setText(mdc);
		hierotw_text.setSelection(hierotw_text.getText().length());
		setHiertTWText(mdc);
	}

	private String getHieroglypheProposals(String normalizedMdC) {

		String proposals = htwController.getHieroglypheProposalsAsMdCString(
				normalizedMdC,
				hieroglyphSelectionCounterCacheMap);
		htwProposals = proposals;
		return proposals;

	}

	private void setSelectedGlypheIgnored(boolean selection) {
		if (selectedGlyphe != null) {
			Command c = SetCommand.create(editingDomain, selectedGlyphe,
					BtsCorpusModelPackage.BTS_GRAPHIC__IGNORED, selection);
			editingDomain.getCommandStack().execute(c);
			selectedGlyphe.setIgnored(selection);
			int selectedGlypheIndex = selectedGlyphe != null ? wordGraphics
					.indexOf(selectedGlyphe) : 0;
			String normalizedMdC = transformWordToMdCString(currentWord,
					selectedGlypheIndex);
			MDCNormalizer d = new MDCNormalizer();
			try {
				normalizedMdC = d.normalize(normalizedMdC);
			} catch (MDCSyntaxError e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

//			String glypheSelectedMdC = setGlypheSelectionInMdC(normalizedMdC,
//					selectedGlypheIndex);

			hierotw_text.setText(normalizedMdC);
			hierotw_text.setSelection(hierotw_text.getText().length());
			jseshEditor.setMDCText(normalizedMdC);
		}

	}

	private void shiftGlyphSelection(int i) {
		BTSGraphic oldGlyphe = selectedGlyphe;
		int selectedGlypheIndex = oldGlyphe != null ? wordGraphics
				.indexOf(oldGlyphe) : 0;
		int newSelectedGlypheIndex = selectedGlypheIndex;
		if (i == 1000) // jump to end of line
		{
			newSelectedGlypheIndex = wordGraphics.size() - 1;
		} else if (i == -1000) // jump to start of line
		{
			newSelectedGlypheIndex = 0;
		} else if (oldGlyphe == null) {
			newSelectedGlypheIndex = 0;
		} else {
			newSelectedGlypheIndex += i;
			newSelectedGlypheIndex = newSelectedGlypheIndex > -1 ? newSelectedGlypheIndex
					: 0;
			newSelectedGlypheIndex = newSelectedGlypheIndex < wordGraphics
					.size() ? newSelectedGlypheIndex : wordGraphics.size() - 1;
		}
		selectedGlyphe = wordGraphics.get(newSelectedGlypheIndex);
		
		//ignore button
		ignoreGlyph_Button.setSelection(selectedGlyphe.isIgnored());
		glyphOrder_spinner.setSelection(selectedGlyphe.getInnerSentenceOrder());

		String glypheSelectedMdC = transformWordToMdCString(currentWord,
				newSelectedGlypheIndex);

		hierotw_text.setText(glypheSelectedMdC);
		hierotw_text.setSelection(hierotw_text.getText().length());
		jseshEditor.setMDCText(glypheSelectedMdC);

//		Binding binding0 = bindingContext.bindValue(
//				WidgetProperties.selection().observeDelayed(
//						BTSUIConstants.DELAY, ignoreGlyph_Button),
//				EMFEditProperties.value(editingDomain,
//						BtsCorpusModelPackage.Literals.BTS_GRAPHIC__IGNORED).observe(
//						selectedGlyphe), null, null);
//		Binding binding1 = bindingContext
//				.bindValue(
//						WidgetProperties.selection().observeDelayed(
//								BTSUIConstants.DELAY, glyphOrder_spinner),
//						EMFEditProperties
//								.value(editingDomain,
//										BtsCorpusModelPackage.Literals.BTS_GRAPHIC__INNER_SENTENCE_ORDER)
//								.observe(selectedGlyphe), null, null);
	}

	private String setGlypheSelectionInMdC(String normalizedMdC,
			int newSelectedGlypheIndex) {
		String[] codes = textEditorController
				.splitSignsKeepDelimeters(normalizedMdC);
		if (codes.length > newSelectedGlypheIndex) {
			String selectedCode = codes[newSelectedGlypheIndex];
			codes[newSelectedGlypheIndex] = textEditorController
					.insertMarkerBehindSingleCode(selectedCode, MDC_MARKER);
		}
		normalizedMdC = "";
		for (String s : codes) {
			normalizedMdC += s;
		}
		System.out.println(normalizedMdC);
		return normalizedMdC;
	}



	private void shiftCaret(String eventTopic) {
		System.out.println(eventTopic);
		saveMdCstring(currentWord);
		eventBroker.post(eventTopic, eventTopic);

	}

	@PreDestroy
	public void dispose()
	{
	}

	@Focus
	public void setFocus()
	{
		if (hierotw_text != null) {
			hierotw_text.setFocus();
		}
//		contextService.activateContext(HTW_CONTEXT_ID);
		evaluationController
				.activateDBCollectionContext(BTSPluginIDs.PREF_MAIN_CORPUS_KEY);
	}

	@Inject
	void setSelection(
			@Optional
			@Named(IServiceConstants.ACTIVE_SELECTION) Object selection) {
		if (selection != null && selection instanceof BTSCorpusObject
				&& !selection.equals(currentText)) {
			if (loaded) {
			if (currentText != null) {
				saveMdCstring(currentWord);
				saveText();
			}
			if (selection instanceof BTSText) {
				currentText = (BTSText) selection;
				part.setLabel(((BTSText) selection).getName());

			} 
			else if (selection instanceof BTSLemmaEntry) {
//				currentText = (BTSLemmaEntry) selection;
				part.setLabel(((BTSLemmaEntry) selection).getName());

			} else {
				currentText = null;
				part.setLabel("Hieroglyph Type Writer");
			}
			ignoreGlyph_Button.setSelection(false);
			}
		}
		
	}

	@Inject
	void setSelection(
			@Optional @Named(IServiceConstants.ACTIVE_SELECTION) BTSTextSelectionEvent selection) {
		if (!selfSelecting) {

			if (selection != null) {

				if (!selection.getSelectedItems().isEmpty()
						&& !selection.getSelectedItems().get(0)
								.equals(selectionObject)
						&& selection.getSelectedItems().get(0) instanceof BTSWord) {

					selectionObject = (BTSObject) selection.getSelectedItems()
							.get(0);
					if (loaded) {
						setSelectionInteral(selection.getSelectedItems().get(0));
						ignoreGlyph_Button.setSelection(false);
					}

				}
				else
				{
					selectionObject = null;
				}

			}
		} else {
			selfSelecting = false;
		}
	}
	
	private void purgeAll() {
		selectedGlyphe = null;
		wordGraphics = null;
		currentWord = null;
		glyphOrder_spinner.setSelection(0);
		if (editingDomain != null) {
			editingDomain.getCommandStack().removeCommandStackListener(
					commandStackListener);
		}
		editingDomain = null;

	}

	private void setSelectionInteral(Object selection)
	{
		System.out.println("hieroglyph tw selection received: " + selection);

		loading = true;
		try
		{

			if (selection == null)
			{
			} else if (selection instanceof BTSWord)
			{
				BTSWord oldWord = currentWord;
				if (oldWord != null)
				{
					saveMdCstring(oldWord);
					updateGraphicSelectionCounter();
				}
				purgeAll();
				currentWord = (BTSWord) selection;
				editingDomain = getEditingDomain(currentWord);
				editingDomain.getCommandStack().removeCommandStackListener(
						commandStackListener);
				editingDomain.getCommandStack().addCommandStackListener(
						getCommandStackListener());
				if (currentWord != null)
				{
					wordGraphics = currentWord.getGraphics();
					String mdc = transformWordToMdCString(currentWord, -1);
					loadMdCString(mdc);
					beforeImageMdC = mdc;
				}
			}
		} finally
		{
			loading = false;
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
							localCommandCacheSet.add(mostRecentCommand);
						} else {
							localCommandCacheSet.remove(mostRecentCommand);
						}
					}
					if (localCommandCacheSet.remove(mostRecentCommand)
							&& localCommandCacheSet.isEmpty()) {
						dirty.setDirty(false);
					} else if (!dirty.isDirty()) {
						dirty.setDirty(true);
					}

				}
			};
		}
		return commandStackListener;
	}

	private EditingDomain getEditingDomain(EObject editingObject) {
		return editingDomainController.getEditingDomain(editingObject);
	}

	private void updateGraphicSelectionCounter() {
		String newMdC = hierotw_text.getText();
		if (newMdC.equals(beforeImageMdC)) {
			// no changes
			return;
		}
		htwController.updateGraphicSelectionCounter(beforeImageMdC, newMdC);

	}

	@Inject
	@Optional
	void eventReceivedHTWShortcutEvents(
			@EventTopic("event_htw_shortcut/*") Object event) {
		if (event instanceof String && event != null) {
			int index = new Integer((String) event);
			selectHieroglypheShortcut(index);

		}
	}

	private void selectHieroglypheShortcut(int index) {
		String hiero = getProposedHieroglyphe(index);
		String suffix = "";
		StringTokenizer tok = new StringTokenizer(hierotw_text.getText(),
				":-<>");
		while (tok.hasMoreTokens()) {
			suffix = tok.nextToken();
		}
		String codes = hierotw_text.getText().substring(0,
				hierotw_text.getText().length() - suffix.length());
		codes += hiero;
		hierotw_text.setText(codes);
		hierotw_text.setSelection(codes.length());
		jseshEditorProposals.clearText();
	}

	private String getProposedHieroglyphe(int index) {
		String code = "";
		StringTokenizer tok = new StringTokenizer(htwProposals, "\\red-");
		int i = 0;
		while (tok.hasMoreTokens()) {

			code = tok.nextToken().split("-")[0];
			if (!code.startsWith("\"")) {
				i++;
			}
			if (i == index) {
				break;
			}
		}



		return code;
	}

	@Persist
	public boolean saveText() {
		if (dirty.isDirty()) {
			textEditorController.save(currentText);
			localCommandCacheSet.clear();

			dirty.setDirty(false);
		}
		return true;
	}

	private void saveMdCstring(BTSWord word)
	{
		if (word != null) {
			String normalizedMdC = hierotw_text.getText();
			try {
				normalizedMdC = mdcNormalizer.normalize(hierotw_text.getText());
			} catch (MDCSyntaxError e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			normalizedMdC = removeSelectionMarker(normalizedMdC);
			System.out.println("new mdc " + normalizedMdC + " ::: old "
					+ beforeImageMdC);
			if (!normalizedMdC.equals(beforeImageMdC))
			{
				normalizedMdC = removeIgnoreMarker(normalizedMdC);
				System.out.println("htw saveMdCString " + normalizedMdC);
				textEditorController.updateBTSWordFromMdCString(word,
						normalizedMdC, editingDomain);
				
			}
		}

	}

	private String removeSelectionMarker(String normalizedMdC) {
		Pattern p = Pattern.compile("\\" + MDC_MARKER);
		Matcher m = p.matcher(normalizedMdC);
		String result = m.replaceAll("");
		return result;
	}

	private String removeIgnoreMarker(String normalizedMdC) {
		Pattern p = Pattern.compile(MDC_IGNORE);
		Matcher m = p.matcher(normalizedMdC);
		String result = m.replaceAll("");
		return result;
	}

	private String transformWordToMdCString(BTSWord word, int selectedGlyphIndex)
	{
		String mdc = "";
		mdc = textEditorController.transformWordToMdCString(word,
				selectedGlyphIndex);
		return mdc;
	}

	// @Inject
	// @Optional
	// void eventReceivedNew(
	// @UIEventTopic("egySentenceItemSelection/*") Object selection)
	// {
	// if (!loading)
	// {
	// setSelectionInteral(selection);
	// }
	// }

	// private void saveMdCstring(final WordOccurrence word)
	// {
	// sync.asyncExec(new Runnable()
	// {
	// public void run()
	// {
	// if (word.getSpelling() == null)
	// {
	// word.setSpelling(new LightSpelling());
	// }
	// if (word.getSpelling().getMdC() != hierotw_text.getText() &&
	// !"".equals(hierotw_text.getText()))
	// {
	// // word.getSpelling().setMdC();
	// final String text = hierotw_text.getText();
	//
	// SwingUtilities.invokeLater(new Runnable()
	// {
	//
	// @Override
	// public void run()
	// {
	// LightSpelling oldSpelling = word.getSpelling();
	// LightSpelling spelling = new LightSpelling(oldSpelling.getId() + 500,
	// oldSpelling
	// .getLabel(), text);
	// word.setSpelling(spelling);
	// if (ramsesEditor != null)
	// {
	// // RamsesWordEditionListener listener = ramsesEditor.g
	// ramsesEditor.changeWordData(word.getWordAnalysis());
	// }
	//
	// }
	//
	// });
	// // hierotw_text.setText("");
	//
	// }
	// }
	// });
	// }

	private void loadMdCString(final String mdC)
	{
		sync.asyncExec(new Runnable()
		{
			public void run()
			{
				String normalizedMdC = mdC;
				MDCNormalizer d = new MDCNormalizer();
				try {
					normalizedMdC = d.normalize(mdC);
				} catch (MDCSyntaxError e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				hierotw_text.setText(normalizedMdC);
				hierotw_text.setSelection(hierotw_text.getText().length());
				
				String[] codes = textEditorController
						.splitSignsKeepDelimeters(normalizedMdC);
				for (String s : codes) {
					System.out.println(s);
				}
			}
		});

	}

	@Override
	public List<Map> getScatteredCashMaps() {
		final List<Map> maps = new Vector<Map>(1);
		maps.add(hieroglyphSelectionCounterCacheMap);
		return maps;
	}

	@Override
	public void handleEvent(Event arg0) {

		eventReceivedHTWShortcutEvents(arg0.getProperty("org.eclipse.e4.data"));

	}
}
