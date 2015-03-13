package org.bbaw.bts.ui.egy.textSign.support;

import org.bbaw.bts.ui.commons.utils.BTSUIConstants;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Color;

public class MarkerFigure extends ElementFigureImpl {

	public static Color classColor = BTSUIConstants.COLOR_BACKGROUND_DISABLED;//new Color(null, 215, 115, 206);
	private String name;

	public MarkerFigure(String name) {
		ToolbarLayout layout = new ToolbarLayout();
		setLayoutManager(layout);
		setBorder(new LineBorder(ColorConstants.black, 1));
		setBackgroundColor(classColor);
		setOpaque(true);
		org.eclipse.draw2d.Label label = new org.eclipse.draw2d.Label();
		label.setText(name);
		add(label);
		super.setCornerDimensions(new Dimension(0, 0));
		this.name = name;
	}
	
	public int getLength() {
		
		int len = this.name.length() * 5;
		return len > 15 ? len : 15;
	}
	
}
