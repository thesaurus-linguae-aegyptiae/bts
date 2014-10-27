package org.bbaw.bts.core.corpus.controller.partController.text.model;

import org.bbaw.bts.corpus.btsCorpusModel.BTSText;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.validation.Issue;

public class SubtextAnnotation extends ModelAnnotation {

	public static final String TYPE = "org.bbaw.bts.ui.text.modelAnnotation.subtext";
	public static final String TYPE_HIGHLIGHTED = TYPE + ".highlighted";;

	private BTSText subtext;

	public SubtextAnnotation(IXtextDocument document, Issue issue,
			Object modelObject, BTSText subtext) {
		super(TYPE, document, issue, modelObject);
		this.setSubtext(subtext);
	}
	@Override
	public String getType() {
		if (super.getType() == null)
		{
			return TYPE;
		}
		return super.getType();
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
	@Override
	public void setHighlighted(boolean highlighted) {
		if (highlighted)
		{
			if (!getType().equals(TYPE_HIGHLIGHTED))
			{cachedType = getType();
			setType(TYPE_HIGHLIGHTED);
			}
		}
		else
		{
			setType(cachedType);
		}
		
	}
	
	@Override
	public String getText() {
		if (subtext.getName() != null && !"".equals(subtext.getName())){
			return (subtext.getName());
		}
		return super.getText();
	}
}