package org.bbaw.bts.ui.egy.preferences;

import org.bbaw.bts.ui.commons.corpus.util.BTSEGYUIConstants;
import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.ui.IWorkbench;

public class EgyTextEditorPage extends FieldEditorPreferencePage {

	/**
	 * Create the preference page.
	 */
	public EgyTextEditorPage() {
		super(FLAT);
	}

	/**
	 * Create contents of the preference page.
	 */
	@Override
	protected void createFieldEditors() {
		addField(new BooleanFieldEditor(BTSEGYUIConstants.PREF_TRANSLITERATION_EDITOR_ACTIVATE_HOVER_INFO,
				"Activate mouse-over pop-up with information on lemmata", getFieldEditorParent()));
		
		addField(new BooleanFieldEditor(BTSEGYUIConstants.PREF_TRANSLITERATION_EDITOR_SHOW_LINE_NUMBER_RULER,
				"Show line number ruler on left side", getFieldEditorParent()));

	}

	/**
	 * Initialize the preference page.
	 */
	public void init(IWorkbench workbench) {
		// Initialize the preference page
	}

}
