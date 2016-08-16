package org.bbaw.bts.ui.commons.corpus.text;

import org.bbaw.bts.btsmodel.BTSIdentifiableItem;
import org.bbaw.bts.btsmodel.BTSInterTextReference;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAnnotation;
import org.bbaw.bts.ui.resources.BTSResourceProvider;
import org.eclipse.jface.text.source.ImageUtilities;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Display;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.validation.Issue;

public class BTSAnnotationAnnotation extends BTSModelAnnotation {

	public static final String TYPE = "org.bbaw.bts.ui.text.modelAnnotation.annotation";

	public static final String TYPE_RUBRUM = "org.bbaw.bts.ui.text.modelAnnotation.rubrum";
	public static final String TYPE_RUBRUM_HIGHLIGHTED = "org.bbaw.bts.ui.text.modelAnnotation.rubrum.highlighted";
	public static final String TYPE_HIGHLIGHTED = "org.bbaw.bts.ui.text.modelAnnotation.annotation.highlighted";
	
//	public BTSAnnotationAnnotation(BTSIdentifiableItem model, BTSInterTextReference interTextReference,
//			BTSAnnotation annotation) {
//		super(model, interTextReference,annotation);
//	}
//
//	public BTSAnnotationAnnotation(XtextDocument document, String typeRubrum,
//			Issue issue, BTSObject object, BTSAnnotation modelObject) {
//		super(TYPE, document, issue, modelObject);
////		this.setAnnotation(btsAnnotation);
//	}
	
	public BTSAnnotationAnnotation(String type, IXtextDocument document, Issue issue,
			BTSIdentifiableItem modelObject, BTSAnnotation btsAnnotation) {
		super(type, document, issue, modelObject);
		this.setRelatingObject(btsAnnotation);
		expandType();
	}

	public BTSAnnotationAnnotation(IXtextDocument document, String type,
			Issue issue, BTSIdentifiableItem modelObject,
			BTSAnnotation btsAnnotation) {
		super(type, document, issue, modelObject);
		this.setRelatingObject(btsAnnotation);
		expandType();
	}

	public BTSAnnotationAnnotation(String type, BTSIdentifiableItem item,
			BTSInterTextReference interTextReference, BTSAnnotation relatingObject) {
		super(type, item, interTextReference, relatingObject);
		expandType();
	}
	
	private void expandType() {
		String type = getType();
		if (getRelatingObject().getType() != null) {
			type += "." + getRelatingObject().getType();
			if (getRelatingObject().getSubtype() != null) {
				type += "." + getRelatingObject().getSubtype();
			}
		}
		setType(type);
	}

	@Override
	public String getType() {
		return super.getType();
	}
	
	
}
