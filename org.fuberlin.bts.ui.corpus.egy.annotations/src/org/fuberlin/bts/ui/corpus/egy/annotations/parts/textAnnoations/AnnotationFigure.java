package org.fuberlin.bts.ui.corpus.egy.annotations.parts.textAnnoations;

import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.ui.egy.textSign.support.ElementFigure;
import org.bbaw.bts.ui.egy.textSign.support.ElementFigureImpl;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.geometry.Dimension;

public class AnnotationFigure extends ElementFigureImpl{

	int imageWidth;
	private ElementFigure endFigure;
	private ElementFigure startFigure;
	public AnnotationFigure(BTSObject btsObject)
	{
		this.setModelObject(btsObject);
		ToolbarLayout layout = new ToolbarLayout();
		setLayoutManager(layout);
		layout.setSpacing(1);
		setOpaque(true);
		setBorder(new MarginBorder(3));
	}
	/**
	 * @param endFigure
	 */
	public void setEndFigure(ElementFigure endFigure) {
		this.endFigure = endFigure;
	}
	
	@Override
	public Dimension getMinimumSize(int wHint, int hHint) {
		// TODO Auto-generated method stub
		Dimension dim =  super.getMinimumSize(wHint, hHint);
		if (endFigure != null)
		{
			int len = endFigure.getBounds().getTopRight().x;
			if (startFigure != null)
			{
				len = len - startFigure.getBounds().getTopLeft().x;
			}
			dim.setWidth(len);
		}
		return dim;
	}
	
	@Override
	protected void layout() {
		setMinimumSize(getMinimumSize(30, 16));
		setPreferredSize(getMinimumSize());
		super.layout();
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.draw2d.Figure#paint(org.eclipse.draw2d.Graphics)
	 */
	@Override
	public void paint(Graphics graphics) {
		// TODO Auto-generated method stub
		super.paint(graphics);
	}
	/**
	 * @param startFigure
	 */
	public void setStartFigure(ElementFigure startFigure) {
		this.startFigure = startFigure;
		
	}
	
}
