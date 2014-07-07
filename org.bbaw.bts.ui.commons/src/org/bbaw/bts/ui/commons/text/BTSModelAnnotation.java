package org.bbaw.bts.ui.commons.text;

import org.bbaw.bts.btsmodel.BTSIdentifiableItem;
import org.bbaw.bts.btsmodel.BTSInterTextReference;
import org.eclipse.jface.text.source.Annotation;

public class BTSModelAnnotation extends Annotation
{

	public static final String TYPE = "org.bbaw.bts.ui.text.modelAnnotation";
	
	private BTSInterTextReference interTextRefernce;
	
	public BTSModelAnnotation(BTSIdentifiableItem model)
	{
		this.model = model;
	}

	public BTSModelAnnotation(BTSIdentifiableItem model, BTSInterTextReference interTextReference)
	{
		this.model = model;
		this.interTextRefernce = interTextReference;
	}

	private BTSIdentifiableItem model;

	public BTSIdentifiableItem getModel()
	{
		return model;
	}

	public void setModel(BTSIdentifiableItem model)
	{
		this.model = model;
	}

	public BTSInterTextReference getInterTextRefernce() {
		return interTextRefernce;
	}

	public void setInterTextRefernce(BTSInterTextReference interTextRefernce) {
		this.interTextRefernce = interTextRefernce;
	}

}
