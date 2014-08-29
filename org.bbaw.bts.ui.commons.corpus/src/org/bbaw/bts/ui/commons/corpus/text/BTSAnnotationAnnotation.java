package org.bbaw.bts.ui.commons.corpus.text;

import org.bbaw.bts.btsmodel.BTSIdentifiableItem;
import org.bbaw.bts.btsmodel.BTSInterTextReference;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAnnotation;

public class BTSAnnotationAnnotation extends BTSModelAnnotation {

	public static final String TYPE = "org.bbaw.bts.ui.text.modelAnnotation.annotatation";


	public BTSAnnotationAnnotation(BTSIdentifiableItem model, BTSInterTextReference interTextReference,
			BTSAnnotation annotation) {
		super(model, interTextReference,annotation);
	}

	@Override
	public String getType() {
		return TYPE;
	}

}
