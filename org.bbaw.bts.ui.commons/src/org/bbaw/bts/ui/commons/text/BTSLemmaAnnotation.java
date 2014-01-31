package org.bbaw.bts.ui.commons.text;

import org.bbaw.bts.btsmodel.BTSIdentifiableItem;

public class BTSLemmaAnnotation extends BTSModelAnnotation {

	private static final String TYPE = "org.bbaw.bts.ui.text.modelAnnotation.lemma";

	public BTSLemmaAnnotation(BTSIdentifiableItem model) {
		super(model);
	}

	@Override
	public String getType() {
		return TYPE;
	}
}
