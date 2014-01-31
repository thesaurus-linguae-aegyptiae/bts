package org.bbaw.bts.ui.egy.textSign.support;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.ImageFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.swt.graphics.Color;

public class WordFigure extends ElementFigureImpl
{
	public static Color classColor = new Color(null, 255, 255, 206);
	private CompartementImageFigure attributeFigure = new CompartementImageFigure();

	int imageWidth;
	public WordFigure(Label name)
	{
		ToolbarLayout layout = new ToolbarLayout();
		setLayoutManager(layout);
		setBorder(new LineBorder(ColorConstants.black, 1));
		setBackgroundColor(classColor);
		setOpaque(true);

		add(name);
		// add(attributeFigure);
	}

	public CompartementImageFigure getAttributesCompartment()
	{
		return attributeFigure;
	}

	@Override
	public void add(IFigure figure, Object constraint, int index) {
		if (figure instanceof ImageFigure) {
			if (((ImageFigure) figure).getImage() != null) {
				imageWidth = ((ImageFigure) figure).getImage().getBounds().width;
			}
		}
		super.add(figure, constraint, index);
	}

	@Override
	public int getLength() {
		if (imageWidth > 0) {
			return imageWidth + 6;
		} else {
			return super.getLength();
		}
	}

}