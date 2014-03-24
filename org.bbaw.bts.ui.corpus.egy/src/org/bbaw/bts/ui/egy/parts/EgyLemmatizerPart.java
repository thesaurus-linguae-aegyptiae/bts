 
package org.bbaw.bts.ui.egy.parts;

import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;
import javax.inject.Named;

import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.BTSWord;
import org.bbaw.bts.commons.BTSPluginIDs;
import org.bbaw.bts.core.controller.generalController.PermissionsAndExpressionsEvaluationController;
import org.bbaw.bts.core.corpus.controller.partController.BTSTextEditorController;
import org.bbaw.bts.ui.commons.utils.BTSUIConstants;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.di.UISynchronize;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.services.internal.events.EventBroker;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Text;

public class EgyLemmatizerPart {
	@Inject
	private UISynchronize sync;
	@Inject
	private BTSTextEditorController textEditorController;
	@Inject
	private EPartService partService;
	@Inject
	private EventBroker eventBroker;

	@Inject
	private PermissionsAndExpressionsEvaluationController evaluationController;
	private BTSWord currentWord;
	private Text lemma_text;
	private Text flex_text;
	private boolean selfSelecting;
	private Text transl_text;
	private boolean constructed;

	@Inject
	public EgyLemmatizerPart() {
		//TODO Your code here
	}
	
	@PostConstruct
	public void postConstruct(Composite parent) {
		parent.setLayout(new GridLayout(1, false));
		((GridLayout) parent.getLayout()).marginHeight = 0;
		((GridLayout) parent.getLayout()).marginWidth = 0;
		if (partService != null) {
			Collection<MPart> parts = partService.getParts();

		}

		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(new GridLayout(3, false));
		((GridLayout) composite.getLayout()).marginHeight = 0;
		((GridLayout) composite.getLayout()).marginWidth = 0;
		composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1,
				1));



		Group grpLemma = new Group(composite, SWT.NONE);
		grpLemma.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1,
				1));
		grpLemma.setText("Lemma");
		grpLemma.setLayout(new GridLayout(1, false));

		Label lblNewLabel = new Label(grpLemma, SWT.NONE);
		lblNewLabel.setSize(33, 13);
		lblNewLabel.setText("Lemma Selection");

		lemma_text = new Text(grpLemma, SWT.BORDER);
		lemma_text.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false,
				1, 1));
		lemma_text.setSize(122, 19);
		lemma_text.addKeyListener(new KeyListener() {

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent e) {
				if (e.keyCode == SWT.CR) {
					shiftCaret(BTSUIConstants.EVENT_TEXT_SELECTION_NEXT);
				}

			}
		});

		Composite lemma_composite = new Composite(grpLemma, SWT.NONE);
		lemma_composite.setLayout(new FillLayout(SWT.HORIZONTAL));
		lemma_composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				true, 1, 1));
		lemma_composite.setSize(64, 64);

		ListViewer listViewer = new ListViewer(lemma_composite, SWT.BORDER
				| SWT.V_SCROLL);
		List list = listViewer.getList();

		Group grpFlexion = new Group(composite, SWT.NONE);
		grpFlexion.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true,
				1, 1));
		grpFlexion.setText("Flexion");
		grpFlexion.setLayout(new GridLayout(1, false));

		Label lblFlexion = new Label(grpFlexion, SWT.NONE);
		lblFlexion.setSize(34, 13);
		lblFlexion.setText("Flexion Selection");

		flex_text = new Text(grpFlexion, SWT.BORDER);
		flex_text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false,
				1, 1));
		flex_text.setSize(166, 19);
		flex_text.addKeyListener(new KeyListener() {

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent e) {
				if (e.keyCode == SWT.CR) {
					shiftCaret(BTSUIConstants.EVENT_TEXT_SELECTION_NEXT);
				}

			}
		});

		Composite flex_composite = new Composite(grpFlexion, SWT.NONE);
		flex_composite.setLayout(new FillLayout(SWT.HORIZONTAL));
		flex_composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				true, 1, 1));
		flex_composite.setSize(64, 64);

		ListViewer listViewer_1 = new ListViewer(flex_composite, SWT.BORDER
				| SWT.V_SCROLL);
		List list_1 = listViewer_1.getList();

		Group grpTranslation = new Group(composite, SWT.NONE);
		grpTranslation.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				true, 1, 1));
		grpTranslation.setText("Translation");
		grpTranslation.setLayout(new GridLayout(1, false));

		Label lblTranslationsOfSelected = new Label(grpTranslation, SWT.NONE);
		lblTranslationsOfSelected.setText("Translations of selected Lemma");

		transl_text = new Text(grpTranslation, SWT.BORDER);
		transl_text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 1, 1));

		ListViewer listViewer_2 = new ListViewer(grpTranslation, SWT.BORDER
				| SWT.V_SCROLL);
		List list_2 = listViewer_2.getList();
		list_2.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		constructed = true;
		parent.layout();
		parent.pack();
	}
	
	
	@PreDestroy
	public void preDestroy() {
		//TODO Your code here
	}
	
	
	@Focus
	public void onFocus() {
		evaluationController
				.activateDBCollectionContext(BTSPluginIDs.PREF_MAIN_CORPUS);
	}

	private void shiftCaret(String eventTopic) {
		System.out.println(eventTopic);
		saveWordData(currentWord);
		eventBroker.post(eventTopic, currentWord);

	}

	@Inject
	void setSelection(
			@Optional @Named(IServiceConstants.ACTIVE_SELECTION) BTSObject selection) {
		if (constructed) {
		if (!selfSelecting) {
			if (selection == null) {
				/* implementation not shown */
			} else {
				if (selection instanceof BTSWord) {
					setSelectionInteral((BTSWord) selection);
				}
			}
		} else {
			selfSelecting = false;
		}
		}
	}

	private void setSelectionInteral(BTSWord selection) {
		if (selection == null) {
		} else {
			BTSWord oldWord = currentWord;
			if (oldWord != null) {
				saveWordData(oldWord);
			}
			currentWord = (BTSWord) selection;
			if (currentWord != null) {
				loadWordData(currentWord);
			}
		}

	}

	private void loadWordData(BTSWord word) {
		if (word != null) {
			if (word.getLKey() != null) {
				lemma_text.setText(word.getLKey());
			} else {
				lemma_text.setText("");
			}
			if (word.getFlexCode() != null) {
				flex_text.setText(word.getFlexCode());
			} else {
				flex_text.setText("");
			}
		}

	}

	private void saveWordData(BTSWord word) {
		if (word != null) {
			if (!lemma_text.getText().equals(word.getLKey())) {
				word.setLKey(lemma_text.getText());
			}
			if (!flex_text.getText().equals(word.getFlexCode())) {
				word.setFlexCode(flex_text.getText());
			}
		}

	}
}