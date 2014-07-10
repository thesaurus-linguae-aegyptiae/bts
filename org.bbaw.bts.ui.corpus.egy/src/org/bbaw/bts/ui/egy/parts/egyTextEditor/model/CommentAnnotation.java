package org.bbaw.bts.ui.egy.parts.egyTextEditor.model;

import org.bbaw.bts.btsmodel.BTSComment;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.validation.Issue;

public class CommentAnnotation extends ModelAnnotation {

	public static final String TYPE = "org.bbaw.bts.ui.text.modelAnnotation.comment";
	public static final String TYPE_HIGHLIGHTED = "org.bbaw.bts.ui.text.modelAnnotation.comment.highlighted";

	private BTSComment comment;
	

	public CommentAnnotation(IXtextDocument document, Issue issue,
			Object modelObject, BTSComment btsComment) {
		super(TYPE, document, issue, modelObject);
		this.setComment(btsComment);
	}

	@Override
	public String getType() {
		if (super.getType() == null)
		{
			return TYPE;
		}
		return super.getType();
	}
	public BTSComment getComment() {
		return comment;
	}

	public void setComment(BTSComment comment) {
		this.comment = comment;
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
		if (comment.getName() != null && !"".equals(comment.getName())){
			return (comment.getName());
		}
		else
		{
			return (comment.getComment().substring(0, Math.min(comment.getComment().length(), 23)));
		}
	}
}