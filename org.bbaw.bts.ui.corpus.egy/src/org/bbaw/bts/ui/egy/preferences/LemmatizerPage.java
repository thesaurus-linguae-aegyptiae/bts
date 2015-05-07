package org.bbaw.bts.ui.egy.preferences;

import org.bbaw.bts.ui.commons.corpus.util.BTSEGYUIConstants;
import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IntegerFieldEditor;
import org.eclipse.ui.IWorkbench;

public class LemmatizerPage extends FieldEditorPreferencePage {

	/**
	 * @wbp.parser.constructor
	 */
	public LemmatizerPage() {
		super(FLAT);
	}


	@Override
	protected void createFieldEditors() {
		// TODO Auto-generated method stub

		addField(new IntegerFieldEditor(BTSEGYUIConstants.PREF_LEMMATIZER_FELXION_DEFAULT, "Default Flexion", getFieldEditorParent()));
		
		addField(new BooleanFieldEditor(BTSEGYUIConstants.PREF_LEMMATIZER_AUTO_LEMMA_PROPOSAL_SELECTION, "Automatically select first lemma proposal", getFieldEditorParent()));

	}
	/**
	 * Initialize the preference page.
	 */
	public void init(IWorkbench workbench) {
		// Initialize the preference page
	}
}
