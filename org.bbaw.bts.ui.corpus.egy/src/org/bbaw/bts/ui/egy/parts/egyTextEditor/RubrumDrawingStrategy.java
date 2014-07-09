package org.bbaw.bts.ui.egy.parts.egyTextEditor;


import org.eclipse.jface.text.source.AnnotationPainter.ITextStyleStrategy;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.graphics.Color;

public class RubrumDrawingStrategy  implements ITextStyleStrategy  {


	@Override
	public void applyTextStyle(StyleRange styleRange, Color annotationColor) {
		styleRange.foreground = annotationColor;
		
	}

}
