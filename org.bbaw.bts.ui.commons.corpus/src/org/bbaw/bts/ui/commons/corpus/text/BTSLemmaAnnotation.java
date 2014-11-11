package org.bbaw.bts.ui.commons.corpus.text;

import org.bbaw.bts.btsmodel.BTSIdentifiableItem;

public class BTSLemmaAnnotation extends BTSModelAnnotation {

	public static final String TYPE = "org.bbaw.bts.ui.text.modelAnnotation.lemma";

	public BTSLemmaAnnotation(String type, BTSIdentifiableItem model) {
		super(type, model);
	}

}
