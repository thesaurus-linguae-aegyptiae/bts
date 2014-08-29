package org.bbaw.bts.ui.egy.parts.egyTextEditor.model;

import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.validation.Issue;

public class InvisibleAnnotation extends ModelAnnotation{

	public static final String TYPE = "org.bbaw.bts.ui.text.modelAnnotation";
	
	public InvisibleAnnotation(IXtextDocument document, Issue issue,
			Object modelObject) {
		super(document, issue, modelObject);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setHighlighted(boolean highlighted) {
		// TODO Auto-generated method stub
		
	}

}
