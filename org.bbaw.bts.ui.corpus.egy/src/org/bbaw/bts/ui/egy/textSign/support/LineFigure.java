package org.bbaw.bts.ui.egy.textSign.support;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.AbstractBorder;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.geometry.Insets;

public class LineFigure extends Figure {

	private List<IFigure> children = new ArrayList<>();

	public LineFigure() {
		ToolbarLayout layout = new ToolbarLayout();
		layout.setMinorAlignment(ToolbarLayout.ALIGN_TOPLEFT);
		layout.setStretchMinorAxis(false);
		layout.setSpacing(2);
		layout.setHorizontal(true);
		setLayoutManager(layout);
		setBorder(new LineFigureBorder());
	}

	@Override
	public void add(IFigure figure, Object constraint, int index) {
		// TODO Auto-generated method stub
		super.add(figure, constraint, index);
		children.add(figure);
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

	/**
	 * @return the children
	 */
	public List<IFigure> getChildren() {
		return children;
	}
}