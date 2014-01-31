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
		if (line > 0) {
			super.paintLine(line, y + (line * lineSpace) - lineSpace,
					lineheight, gc, display);
		}
	}

	@Override
	protected String createDisplayString(int line) {
		return Integer.toString(line);
	}


}
