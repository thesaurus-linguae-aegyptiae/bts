package org.bbaw.bts.ui.egy.textSign.support;

import java.util.List;
import java.util.Vector;

import org.bbaw.bts.btsmodel.BTSInterTextReference;
import org.bbaw.bts.btsmodel.BTSObject;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Color;

public class ElementFigureImpl extends RoundedRectangle implements
		ElementFigure {

	private Object modelObject;

	private String type;
	
	private List<BTSObject> relatingObjects;
	
	private List<BTSInterTextReference> interTextReferences;

	private Color baseBackgroundcolor;

	public int getLength() {
		Rectangle rec = getBounds();
		Double d = rec.getSize().width * 0.7;
		return d.intValue();
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

	public List<BTSObject> getRelatingObjects() {
		if (relatingObjects == null)
		{
			relatingObjects = new Vector<BTSObject>(4);
		}
		return relatingObjects;
	}

	public void setRelatingObjects(List<BTSObject> relatingObjects) {
		this.relatingObjects = relatingObjects;
	}

	@Override
	public void addRelatingObject(BTSObject relatingObject) {
		if (relatingObject != null && !getRelatingObjects().contains(relatingObject))
		{
			getRelatingObjects().add(relatingObject);
		}
		
	}

	public List<BTSInterTextReference> getInterTextReferences() {
		if (interTextReferences == null)
		{
			interTextReferences = new Vector<BTSInterTextReference>(4);
		}
		return interTextReferences;
	}

	public void setInterTextReferences(List<BTSInterTextReference> interTextReferences) {
		this.interTextReferences = interTextReferences;
	}
	/**
	 * @param color
	 */
	public void setBaseBackgroundColor(Color color) {
		this.baseBackgroundcolor = color;
		setBackgroundColor(color);
		
	}

	/**
	 * @return the baseBackgroundcolor
	 */
	public Color getBaseBackgroundcolor() {
		return baseBackgroundcolor;
	}
}
