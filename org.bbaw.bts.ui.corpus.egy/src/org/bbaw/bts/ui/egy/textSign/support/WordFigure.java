package org.bbaw.bts.ui.egy.textSign.support;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.swt.graphics.Color;

public class WordFigure extends RoundedRectangle
{
	public static Color classColor = new Color(null, 255, 255, 206);
	private CompartementImageFigure attributeFigure = new CompartementImageFigure();

	public WordFigure(Label name)
	{
		ToolbarLayout layout = new ToolbarLayout();
		setLayoutManager(layout);
		setBorder(new LineBorder(ColorConstants.black, 1));
		setBackgroundColor(classColor);
		setOpaque(true);

		add(name);
		add(attributeFigure);
	}

	public CompartementImageFigure getAttributesCompartment()
	{
		return attributeFigure;
	}

}