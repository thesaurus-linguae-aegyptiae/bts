package org.bbaw.bts.ui.commons.corpus.text;

import org.bbaw.bts.btsmodel.BTSIdentifiableItem;
import org.bbaw.bts.btsmodel.BTSInterTextReference;
import org.bbaw.bts.btsmodel.BTSObject;
import org.eclipse.jface.text.source.Annotation;

public class BTSModelAnnotation extends Annotation
{

	public static final String TYPE = "org.bbaw.bts.ui.text.modelAnnotation";
	
	private BTSInterTextReference interTextRefernce;
	
	private BTSObject relatingObject;
	
	public BTSModelAnnotation(BTSIdentifiableItem model)
	{
		this.model = model;
	}

	public BTSModelAnnotation(BTSIdentifiableItem model, BTSInterTextReference interTextReference)
	{
		this.model = model;
		this.interTextRefernce = interTextReference;
	}
	
	public BTSModelAnnotation(BTSIdentifiableItem model, BTSInterTextReference interTextReference, BTSObject relatingObject)
	{
		this.model = model;
		this.interTextRefernce = interTextReference;
		this.relatingObject = relatingObject;
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

	public BTSObject getRelatingObject() {
		return relatingObject;
	}

	public void setRelatingObject(BTSObject relatingObject) {
		this.relatingObject = relatingObject;
	}

}
