package org.bbaw.bts.ui.commons.corpus.text;

import org.apache.commons.lang.WordUtils;
import org.bbaw.bts.btsmodel.BTSComment;
import org.bbaw.bts.btsmodel.BTSIdentifiableItem;
import org.bbaw.bts.btsmodel.BTSInterTextReference;
import org.bbaw.bts.core.commons.corpus.CorpusUtils;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.validation.Issue;

public class BTSCommentAnnotation extends BTSModelAnnotation {

	private BTSComment comment;

	public BTSCommentAnnotation(BTSIdentifiableItem model, BTSComment comment, BTSInterTextReference interTextReference) {
		super(model, interTextReference, comment);
		this.setComment(comment);
	}

	public BTSCommentAnnotation(IXtextDocument document, Issue issue,
			BTSIdentifiableItem modelObject, BTSComment btsComment) {
		super(CorpusUtils.getTypeIdentifier(btsComment),document, issue, modelObject);
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
