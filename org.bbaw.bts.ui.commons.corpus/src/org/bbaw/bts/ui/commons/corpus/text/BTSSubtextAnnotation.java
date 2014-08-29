package org.bbaw.bts.ui.commons.corpus.text;

import org.bbaw.bts.btsmodel.BTSIdentifiableItem;
import org.bbaw.bts.btsmodel.BTSInterTextReference;
import org.bbaw.bts.corpus.btsCorpusModel.BTSText;

public class BTSSubtextAnnotation extends BTSModelAnnotation {

	private static final String TYPE = "org.bbaw.bts.ui.text.modelAnnotation.subtext";


	public BTSSubtextAnnotation(BTSIdentifiableItem model, BTSInterTextReference interTextReference, BTSText subtext) {
		super(model, interTextReference, subtext);
	}

	@Override
	public String getType() {
		return TYPE;
	}

}
