package org.bbaw.bts.ui.egy.preferences;

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
		addField(new BooleanFieldEditor(BTSEGYUIConstants.SIGN_TEXT_SHOW_TRANSLATION_DE, "Show Translation: DE", BooleanFieldEditor.DEFAULT, getFieldEditorParent()));
		addField(new BooleanFieldEditor(BTSEGYUIConstants.SIGN_TEXT_SHOW_TRANSLATION_EN, "Show Translation: EN", BooleanFieldEditor.DEFAULT, getFieldEditorParent()));
		addField(new BooleanFieldEditor(BTSEGYUIConstants.SIGN_TEXT_SHOW_TRANSLATION_FR, "Show Translation: FR", BooleanFieldEditor.DEFAULT, getFieldEditorParent()));
		addField(new BooleanFieldEditor(BTSEGYUIConstants.SIGN_TEXT_SHOW_TRANSLATION_ES, "Show Translation: ES", BooleanFieldEditor.DEFAULT, getFieldEditorParent()));
		addField(new BooleanFieldEditor(BTSEGYUIConstants.SIGN_TEXT_SHOW_TRANSLATION_AR, "Show Translation: AR", BooleanFieldEditor.DEFAULT, getFieldEditorParent()));
		addField(new BooleanFieldEditor(BTSEGYUIConstants.SIGN_TEXT_SHOW_TRANSLATION_IT, "Show Translation: IT", BooleanFieldEditor.DEFAULT, getFieldEditorParent()));
		addField(new IntegerFieldEditor(BTSEGYUIConstants.SIGN_TEXT_SHOW_LINE_WIDTH, "Line Width in Pixel", getFieldEditorParent()));
	}

	/**
	 * Initialize the preference page.
	 */
	public void init(IWorkbench workbench) {
		// Initialize the preference page
	}

}
