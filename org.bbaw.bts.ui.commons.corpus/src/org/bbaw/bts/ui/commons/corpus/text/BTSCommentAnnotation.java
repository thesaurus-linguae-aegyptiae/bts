package org.bbaw.bts.ui.commons.corpus.text;

import org.apache.commons.lang.WordUtils;
import org.bbaw.bts.btsmodel.BTSComment;
import org.bbaw.bts.btsmodel.BTSIdentifiableItem;
import org.bbaw.bts.btsmodel.BTSInterTextReference;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.validation.Issue;

public class BTSCommentAnnotation extends BTSModelAnnotation {

	public static final String TYPE = "org.bbaw.bts.ui.text.modelAnnotation.comment";
	public static final String TYPE_HIGHLIGHTED = "org.bbaw.bts.ui.text.modelAnnotation.comment.highlighted";
	
	private BTSComment comment;

	public BTSCommentAnnotation(String type, BTSIdentifiableItem model, BTSComment comment, BTSInterTextReference interTextReference) {
		super(type, model, interTextReference, comment);
		this.setComment(comment);
	}

	public BTSCommentAnnotation(String type, IXtextDocument document, Issue issue,
			BTSIdentifiableItem modelObject, BTSComment btsComment) {
		super(type, document, issue, modelObject);
		this.setComment(btsComment);
	}


	public BTSComment getComment() {
		return comment;
	}

	public void setComment(BTSComment comment) {
		this.comment = comment;
	}

	@Override
	public String getText() {
		if (comment != null)
		{
			String text = "";
			if (comment.getName() != null)
			{
				text=  comment.getName() + "\n";
			}
			if (comment.getComment() != null && !"".equals(comment.getComment()))
			{
				text += WordUtils.wrap(comment.getComment(), 60);
			}
			return text;
		}
		return super.getText();
	}
}
