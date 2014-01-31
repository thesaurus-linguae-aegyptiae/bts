package org.bbaw.bts.ui.commons.text;

import org.bbaw.bts.btsmodel.BTSAnnotation;
import org.bbaw.bts.btsmodel.BTSIdentifiableItem;

public class BTSAnnotationAnnotation extends BTSModelAnnotation {

	public static final String TYPE = "org.bbaw.bts.ui.text.modelAnnotation.annotatation";

	private BTSAnnotation annotation;

	public BTSAnnotationAnnotation(BTSIdentifiableItem model,
			BTSAnnotation annotation) {
		super(model);
		this.annotation = annotation;
	}

	@Override
	public String getType() {
		return TYPE;
	}

	public BTSAnnotation getAnnotation() {
		return annotation;
	}

	public void setAnnotation(BTSAnnotation annotation) {
		this.annotation = annotation;
	}
}
