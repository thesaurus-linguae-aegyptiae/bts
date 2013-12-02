package org.bbaw.bts.ui.egy.textSign.support;

import org.eclipse.draw2d.AbstractBorder;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.ImageFigure;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.geometry.Insets;

public class CompartementImageFigure extends ImageFigure
{
	public CompartementImageFigure()
	{
		ToolbarLayout layout = new ToolbarLayout();
		layout.setMinorAlignment(ToolbarLayout.ALIGN_TOPLEFT);
		layout.setStretchMinorAxis(false);
		layout.setSpacing(2);
		setLayoutManager(layout);
		setBorder(new WordFigureBorder());
	}

	public class WordFigureBorder extends AbstractBorder
	{
		public Insets getInsets(IFigure figure)
		{
			return new Insets(1, 0, 0, 0);
		}

		@Override
		public void paint(IFigure figure, Graphics graphics, Insets insets)
		{
			graphics.drawLine(getPaintRectangle(figure, insets).getTopLeft(), tempRect.getTopRight());

		}
	}
}
