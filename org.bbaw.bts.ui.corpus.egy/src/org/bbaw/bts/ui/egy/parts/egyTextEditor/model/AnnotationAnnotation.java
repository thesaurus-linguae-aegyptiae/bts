package org.bbaw.bts.ui.egy.parts.egyTextEditor.model;

import org.bbaw.bts.btsmodel.BTSAnnotation;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.validation.Issue;

public class AnnotationAnnotation extends ModelAnnotation {

	public static final String TYPE = "org.bbaw.bts.ui.text.modelAnnotation.annotation";

	public static final String TYPE_RUBRUM = "org.bbaw.bts.ui.text.modelAnnotation.annotation.rubrum";

	private String type = TYPE;
	private BTSAnnotation annotation;

	public AnnotationAnnotation(IXtextDocument document, Issue issue,
			Object modelObject, BTSAnnotation btsAnnotation) {
		super(TYPE, document, issue, modelObject);
		this.setAnnotation(btsAnnotation);
	}

	public AnnotationAnnotation(IXtextDocument document, String type,
			Issue issue, Object modelObject, BTSAnnotation btsAnnotation) {
		super(type, document, issue, modelObject);
		this.setAnnotation(btsAnnotation);
	}

	@Override
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public BTSAnnotation getAnnotation() {
		return annotation;
	}

	public void setAnnotation(BTSAnnotation annotation) {
		this.annotation = annotation;
	}

	@Override
	public void paint(GC gc, Canvas canvas, Rectangle bounds) {
		// // TODO Auto-generated method stub
		// super.paint(gc, canvas, bounds);
	}
}
