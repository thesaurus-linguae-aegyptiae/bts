package org.fuberlin.bts.ui.corpus.egy.annotations.parts.textAnnoations;

import org.bbaw.bts.ui.egy.textSign.support.ElementFigure;
import org.eclipse.draw2d.AbstractBorder;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.Rectangle;

public class PlaceholderFigure extends RoundedRectangle {


	private int len;
	private ElementFigure startFigure;
	private ElementFigure elementFigureBefore; 
	public PlaceholderFigure(int len) {
		this.len = len;
	}

	/**
	 * @param startFigure
	 * @param object
	 */
	public PlaceholderFigure(ElementFigure startFigure, ElementFigure elementFigureBefore) {
		this.startFigure = startFigure;
		this.elementFigureBefore = elementFigureBefore;
	}

	@Override
	public void add(IFigure figure, Object constraint, int index) {
		super.add(figure, constraint, index);
	}

	public class LineFigureBorder extends AbstractBorder {
		public Insets getInsets(IFigure figure) {
			return new Insets(1, 0, 0, 0);
		}

		@Override
		public void paint(IFigure figure, Graphics graphics, Insets insets) {
			graphics.drawLine(getPaintRectangle(figure, insets).getTopLeft(),
					tempRect.getTopRight());

		}
	}
	public int getLength()
	{
		if (startFigure != null)
		{
			return startFigure.getBounds().getTopLeft().x;
		}
		return len;
	}
	/* (non-Javadoc)
	 * @see org.eclipse.draw2d.Figure#getMinimumSize(int, int)
	 */
	@Override
	public Dimension getMinimumSize(int wHint, int hHint) {
		// TODO Auto-generated method stub
		Dimension dim =  super.getMinimumSize(wHint, hHint);
		if (startFigure != null)
		{
			int len = startFigure.getBounds().getTopLeft().x;
			if (elementFigureBefore != null)
			{
				len = len - elementFigureBefore.getBounds().getTopRight().x;
			}
			dim.setWidth(len);
		}
		return dim;
	}

	public int getSpaceLength() {
		return len;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.draw2d.Figure#layout()
	 */
	@Override
	protected void layout() {
		setMinimumSize(getMinimumSize(30, 16));
		setPreferredSize(getMinimumSize());

		super.layout();
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.draw2d.Figure#getClientArea(org.eclipse.draw2d.geometry.Rectangle)
	 */
	@Override
	public Rectangle getClientArea(Rectangle rect) {
		// TODO Auto-generated method stub
		Rectangle r = super.getClientArea(rect);
		r.width = getMinimumSize(30, 16).width;
		return r;
	}
	
}