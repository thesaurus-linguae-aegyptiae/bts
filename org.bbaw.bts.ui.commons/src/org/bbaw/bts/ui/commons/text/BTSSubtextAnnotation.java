package org.bbaw.bts.ui.commons.text;

import org.bbaw.bts.btsmodel.BTSIdentifiableItem;
import org.bbaw.bts.btsmodel.BTSInterTextReference;
import org.bbaw.bts.btsmodel.BTSText;

public class BTSSubtextAnnotation extends BTSModelAnnotation {

	private static final String TYPE = "org.bbaw.bts.ui.text.modelAnnotation.subtext";

	private BTSText subtext;

	public BTSSubtextAnnotation(BTSIdentifiableItem model, BTSText subtext, BTSInterTextReference interTextReference) {
		super(model, interTextReference);
		this.setSubtext(subtext);
	}

	@Override
	public String getType() {
		return TYPE;
	}

	public BTSText getSubtext() {
		return subtext;
	}

	public void setSubtext(BTSText subtext) {
		this.subtext = subtext;
	}
}
