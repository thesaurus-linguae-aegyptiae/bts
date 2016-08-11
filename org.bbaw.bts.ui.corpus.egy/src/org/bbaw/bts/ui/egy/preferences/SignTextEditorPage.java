package org.bbaw.bts.ui.egy.preferences;

import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.ui.commons.corpus.util.BTSEGYUIConstants;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.IntegerFieldEditor;

public class SignTextEditorPage extends FieldEditorPreferencePage {

	/**
	 * Create the preference page.
	 */
	public SignTextEditorPage() {
		super(FLAT);
	}

	/**
	 * Create contents of the preference page.
	 */
	@Override
	protected void createFieldEditors() {
		// Create the field editors
		addField(new BooleanFieldEditor(BTSEGYUIConstants.SIGN_TEXT_SHOW_HIEROGLYPHS, "Show Hieroglyphs", BooleanFieldEditor.DEFAULT, getFieldEditorParent()));
		addField(new BooleanFieldEditor(BTSEGYUIConstants.SIGN_TEXT_SHOW_LEMMAID, "Show Lemma ID", BooleanFieldEditor.DEFAULT, getFieldEditorParent()));
		addField(new BooleanFieldEditor(BTSEGYUIConstants.SIGN_TEXT_SHOW_FLEXION, "Show Flexion", BooleanFieldEditor.DEFAULT, getFieldEditorParent()));
		for (String lang : BTSCoreConstants.LANGS) {
			String prefNode = BTSEGYUIConstants.SIGN_TEXT_SHOW_TRANSLATION_PREFNODE_PREFIX + lang;
			addField(new BooleanFieldEditor(prefNode, "Show Translation: "+lang.toUpperCase(),
					BooleanFieldEditor.DEFAULT, getFieldEditorParent()));
		}
		addField(new IntegerFieldEditor(BTSEGYUIConstants.SIGN_TEXT_SHOW_LINE_WIDTH, "Line Width in Pixel", getFieldEditorParent()));
	}

	/**
	 * Initialize the preference page.
	 */
	public void init(IWorkbench workbench) {
		// Initialize the preference page
	}

}
