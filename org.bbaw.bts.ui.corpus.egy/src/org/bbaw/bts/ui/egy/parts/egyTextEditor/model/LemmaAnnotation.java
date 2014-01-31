package org.bbaw.bts.ui.egy.parts.egyTextEditor.model;

import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.validation.Issue;

public class LemmaAnnotation extends ModelAnnotation {

	public static final String TYPE = "org.bbaw.bts.ui.text.modelAnnotation.lemma";

	public LemmaAnnotation(IXtextDocument document, Issue issue,
			Object modelObject) {
		super(TYPE, document, issue, modelObject);
	}

	@Override
	public String getType() {
		return TYPE;
	}

	@Override
	public void paint(GC gc, Canvas canvas, Rectangle bounds) {
		// // TODO Auto-generated method stub
		// super.paint(gc, canvas, bounds);
	}
}
