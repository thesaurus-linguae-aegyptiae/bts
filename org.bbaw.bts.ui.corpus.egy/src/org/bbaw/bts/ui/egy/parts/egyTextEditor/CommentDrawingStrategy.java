package org.bbaw.bts.ui.egy.parts.egyTextEditor;

import org.eclipse.jface.text.source.Annotation;
import org.eclipse.jface.text.source.AnnotationPainter.IDrawingStrategy;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;

public class CommentDrawingStrategy implements IDrawingStrategy {

	@Override
	public void draw(Annotation annotation, GC gc, StyledText textWidget,
			int offset, int length, Color color) {
		if (gc != null) {

			Rectangle bounds;
			if (length > 0)
				bounds = textWidget.getTextBounds(offset, offset + length - 1);
			else {
				Point loc = textWidget.getLocationAtOffset(offset);
				bounds = new Rectangle(loc.x, loc.y, 1,
						textWidget.getLineHeight(offset));
			}
			int y = bounds.y + bounds.height + 3;
			gc.setForeground(color);
			gc.setLineWidth(1);
			gc.setLineStyle(SWT.LINE_SOLID);

			gc.drawLine(bounds.x + 1, y, bounds.x + bounds.width - 2, y);

		} else {
			textWidget.redrawRange(offset, length, true);
		}

	}

}
