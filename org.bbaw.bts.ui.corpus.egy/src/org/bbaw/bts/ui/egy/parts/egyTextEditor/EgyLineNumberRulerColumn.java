package org.bbaw.bts.ui.egy.parts.egyTextEditor;

import org.eclipse.jface.text.source.CompositeRuler;
import org.eclipse.jface.text.source.LineNumberRulerColumn;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;

public class EgyLineNumberRulerColumn extends LineNumberRulerColumn {

	private int lineSpace;
	private int oldLine;
	private int counter;
	public EgyLineNumberRulerColumn(int lineSpace) {
		this.lineSpace = lineSpace;
	}
	@Override
	public Control createControl(CompositeRuler parentRuler,
			Composite parentControl) {
		Control control = super.createControl(parentRuler, parentControl);
		setBackground(new Color(Display.getDefault(), new RGB(233, 233, 233)));
		return control;
	}

	@Override
	protected void paintLine(int line, int y, int lineheight, GC gc,
			Display display) {
		if (line <= oldLine)
		{
			counter = 0;
		}
		// multiply the lineSpace by the number of currently repainted lines.
		super.paintLine(line, y   + (counter * lineSpace),
				lineheight, gc, display);
		oldLine = line;
		counter++;
	}
	
	

	@Override
	protected String createDisplayString(int line) {
		return Integer.toString(line);
	}

	protected int computeNumberOfDigits() {
		return 4;
	}
	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return super.getWidth();
	}
	
}
