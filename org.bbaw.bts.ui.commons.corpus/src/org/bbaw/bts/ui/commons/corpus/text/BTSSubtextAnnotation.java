package org.bbaw.bts.ui.commons.corpus.text;

import org.bbaw.bts.btsmodel.BTSIdentifiableItem;
import org.bbaw.bts.btsmodel.BTSInterTextReference;
import org.bbaw.bts.core.commons.corpus.CorpusUtils;
import org.bbaw.bts.corpus.btsCorpusModel.BTSText;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.validation.Issue;

public class BTSSubtextAnnotation extends BTSModelAnnotation {

	public BTSSubtextAnnotation(BTSIdentifiableItem model, BTSInterTextReference interTextReference, BTSText subtext) {
		super(CorpusUtils.getTypeIdentifier(subtext), model, interTextReference, subtext);
	}

	public BTSSubtextAnnotation(IXtextDocument document, Issue issue,
			BTSIdentifiableItem modelObject, BTSText subtext) {
		super(CorpusUtils.getTypeIdentifier(subtext), document, issue, modelObject);
		this.setRelatingObject(subtext);
	}


}
