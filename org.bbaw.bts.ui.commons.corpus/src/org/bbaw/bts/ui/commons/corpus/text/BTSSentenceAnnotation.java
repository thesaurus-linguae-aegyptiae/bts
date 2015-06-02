package org.bbaw.bts.ui.commons.corpus.text;
import org.bbaw.bts.ui.resources.BTSResourceProvider;
import org.bbaw.bts.btsmodel.BTSIdentifiableItem;
import org.eclipse.jface.text.source.ImageUtilities;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Display;

public class BTSSentenceAnnotation extends BTSModelAnnotation {
	public static final String TYPE = "org.bbaw.bts.ui.text.modelAnnotation.sentence";

	public static final String TYPE_HIGHLIGHTED = TYPE + HIGHLIGHTED;

	public BTSSentenceAnnotation(String type, BTSIdentifiableItem model) {
		super(type, model);
	}
	
	@Override
	public void paint(GC gc, Canvas canvas, Rectangle bounds) {
		Image image = resourceProvider.getImage(Display.getCurrent(), BTSResourceProvider.IMG_LOCALE);
		if(image != null)
			ImageUtilities.drawImage(image, gc, canvas, bounds, SWT.CENTER, SWT.TOP);
	}
	
}
