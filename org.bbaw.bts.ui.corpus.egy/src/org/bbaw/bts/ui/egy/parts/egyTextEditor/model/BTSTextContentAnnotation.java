package org.bbaw.bts.ui.egy.parts.egyTextEditor.model;

import org.bbaw.bts.btsmodel.BTSIdentifiableItem;

public class BTSTextContentAnnotation extends BTSTextAnnotation {

	public static final String TYPE = "org.bbaw.bts.ui.egy.texteditor.textcontentannotation";

	private BTSIdentifiableItem item;

	public BTSIdentifiableItem getItem() {
		return item;
	}

	public void setItem(BTSIdentifiableItem item) {
		this.item = item;
	}
}
