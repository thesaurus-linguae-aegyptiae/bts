package org.bbaw.bts.ui.egy.textSign.support;

import org.bbaw.bts.ui.commons.utils.BTSUIConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.ImageFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.swt.graphics.Color;

public class WordFigure extends ElementFigureImpl
{
	public static Color classColor = BTSUIConstants.VIEW_FOREGROUND_DESELECTED_COLOR;//new Color(null, 255, 255, 206);
	private CompartementImageFigure attributeFigure = new CompartementImageFigure();

	private String mdc;
	int imageWidth;
	private ImageFigure imageFigure;
	public WordFigure(Label name)
	{
		ToolbarLayout layout = new ToolbarLayout();
		setLayoutManager(layout);
		layout.setSpacing(20);
		setBackgroundColor(classColor);
		setOpaque(true);
		setBorder(new MarginBorder(3));

		add(name);
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
		if (imageFigure != null && imageWidth > 0) {
			return imageWidth + 6;
		} else {
			return super.getLength();
		}
	}

	public int getImageWidth() {
		return imageWidth;
	}

	public String getMdc() {
		return mdc;
	}

	public void setMdc(String mdc) {
		this.mdc = mdc;
	}

	public void setImageFigure(ImageFigure imageFigure) {
		this.imageFigure = imageFigure;
		
	}

	public ImageFigure getImageFigure() {
		return imageFigure;
	}

}