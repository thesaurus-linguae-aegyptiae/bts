package org.bbaw.bts.ui.egy.textSign.support;

import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.geometry.Rectangle;

public class ElementFigureImpl extends RoundedRectangle implements
		ElementFigure {

	private Object modelObject;

	private String type;

	public int getLength() {
		Rectangle rec = getBounds();
		return rec.getSize().width;
	}

	public Object getModelObject() {
		return modelObject;
	}

	public void setModelObject(Object modelObject) {
		this.modelObject = modelObject;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
}
