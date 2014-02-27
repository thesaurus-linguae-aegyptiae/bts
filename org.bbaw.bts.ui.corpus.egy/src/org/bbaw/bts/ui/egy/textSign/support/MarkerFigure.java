package org.bbaw.bts.ui.egy.textSign.support;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.swt.graphics.Color;

public class MarkerFigure extends ElementFigureImpl {

	public static Color classColor = new Color(null, 215, 115, 206);

	public MarkerFigure(String name) {
		ToolbarLayout layout = new ToolbarLayout();
		setLayoutManager(layout);
		setBorder(new LineBorder(ColorConstants.black, 1));
		setBackgroundColor(classColor);
		setOpaque(true);
		org.eclipse.draw2d.Label label = new org.eclipse.draw2d.Label();
		label.setText(name);
		add(label);
	}
}