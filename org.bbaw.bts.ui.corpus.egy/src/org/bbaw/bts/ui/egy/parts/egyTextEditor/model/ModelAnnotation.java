package org.bbaw.bts.ui.egy.parts.egyTextEditor.model;

import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.validation.XtextAnnotation;
import org.eclipse.xtext.validation.Issue;

public class ModelAnnotation extends XtextAnnotation {

	public static final String TYPE = "org.bbaw.bts.ui.text.modelAnnotation";

	private Object modelObject;

	public ModelAnnotation(String type, boolean isPersistent,
			IXtextDocument document, Issue issue, boolean isQuickfixable,
			Object modelObject) {
		super(type, isPersistent, document, issue, isQuickfixable);
		this.modelObject = modelObject;

	}

	public ModelAnnotation(IXtextDocument document, Issue issue,
			Object modelObject) {
		super(TYPE, false, document, issue, false);
		this.modelObject = modelObject;

	}

	public ModelAnnotation(String type, IXtextDocument document, Issue issue,
			Object modelObject) {
		super(type, false, document, issue, false);
		this.modelObject = modelObject;
	}

	public Object getModelObject() {
		return modelObject;
	}

	public void setModelObject(Object modelObject) {
		this.modelObject = modelObject;
	}

}
