package org.bbaw.bts.ui.egy.parts.egyTextEditor.model;

import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.validation.Issue;

public class LemmaAnnotation extends ModelAnnotation {

	public static final String TYPE = "org.bbaw.bts.ui.text.modelAnnotation.lemma";

	public static final String TYPE_HIGHLIGHTED = TYPE + ".highlighted";;

	public LemmaAnnotation(IXtextDocument document, Issue issue,
			Object modelObject) {
		super(TYPE, document, issue, modelObject);
	}

	@Override
	public String getType() {
		if (super.getType() == null)
		{
			return this.TYPE;
		}
		return super.getType();
	}

	@Override
	public void paint(GC gc, Canvas canvas, Rectangle bounds) {
		// // TODO Auto-generated method stub
		// super.paint(gc, canvas, bounds);
	}
	@Override
	public void setHighlighted(boolean highlighted) {
		if (highlighted)
		{
			cachedType = this.type;
			setType(TYPE_HIGHLIGHTED);
		}
		else
		{
			setType(cachedType);
		}
		
	}
}
