package org.bbaw.bts.ui.commons.corpus.text;

import org.bbaw.bts.btsmodel.BTSComment;
import org.bbaw.bts.btsmodel.BTSIdentifiableItem;
import org.bbaw.bts.btsmodel.BTSInterTextReference;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.validation.Issue;

public class BTSCommentAnnotation extends BTSModelAnnotation {

	public static final String TYPE = "org.bbaw.bts.ui.text.modelAnnotation.comment";
	public static final String TYPE_HIGHLIGHTED = "org.bbaw.bts.ui.text.modelAnnotation.comment.highlighted";
	
	private BTSComment comment;

	public BTSCommentAnnotation(BTSIdentifiableItem model, BTSComment comment, BTSInterTextReference interTextReference) {
		super(model, interTextReference, comment);
		this.setComment(comment);
	}

	public BTSCommentAnnotation(IXtextDocument document, Issue issue,
			BTSIdentifiableItem modelObject, BTSComment btsComment) {
		super(TYPE, document, issue, modelObject);
		this.setComment(btsComment);
	}

	@Override
	public String getType() {
		return TYPE;
	}

	public BTSComment getComment() {
		return comment;
	}

	public void setComment(BTSComment comment) {
		this.comment = comment;
	}

}
