package org.fuberlin.bts.ui.corpus.egy.annotations.preferences;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.ColorFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.resource.ImageDescriptor;

public class TextAnnotationsPreferencePage extends FieldEditorPreferencePage {

	public TextAnnotationsPreferencePage() {
		// TODO Auto-generated constructor stub
	}

	public TextAnnotationsPreferencePage(int style) {
		super(style);
		// TODO Auto-generated constructor stub
	}

	public TextAnnotationsPreferencePage(String title, int style) {
		super(title, style);
		// TODO Auto-generated constructor stub
	}

	public TextAnnotationsPreferencePage(String title, ImageDescriptor image, int style) {
		super(title, image, style);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void createFieldEditors() {
		addField(new BooleanFieldEditor("SHOWALLPROPERTIES", "Show all properties",
                getFieldEditorParent()));
		
		addField(new BooleanFieldEditor("SHOWALLPROPERTIES_ONHOVER", "Show all properties on hover",
                getFieldEditorParent()));
		
	}

}
