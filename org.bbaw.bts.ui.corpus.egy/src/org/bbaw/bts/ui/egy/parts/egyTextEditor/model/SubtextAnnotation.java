package org.bbaw.bts.ui.egy.parts.egyTextEditor.model;

import org.bbaw.bts.btsmodel.BTSText;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.validation.Issue;

public class SubtextAnnotation extends ModelAnnotation {

	public static final String TYPE = "org.bbaw.bts.ui.text.modelAnnotation.subtext";
	private BTSText subtext;

	public SubtextAnnotation(IXtextDocument document, Issue issue,
			Object modelObject, BTSText subtext) {
		super(TYPE, document, issue, modelObject);
		this.setSubtext(subtext);
	}

	@Override
	public String getType() {
		return TYPE;
	}

	public BTSText getSubtext() {
		return subtext;
	}

	public void setSubtext(BTSText subtext) {
		this.subtext = subtext;
	}

	@Override
	public void paint(GC gc, Canvas canvas, Rectangle bounds) {
		// // TODO Auto-generated method stub
		// super.paint(gc, canvas, bounds);
	}
}