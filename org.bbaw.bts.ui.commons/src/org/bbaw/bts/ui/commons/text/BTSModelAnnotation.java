package org.bbaw.bts.ui.commons.text;

import org.bbaw.bts.btsmodel.BTSIdentifiableItem;
import org.eclipse.jface.text.source.Annotation;

public class BTSModelAnnotation extends Annotation
{

	public static final String TYPE = "org.bbaw.bts.ui.text.modelAnnotation";

	public BTSModelAnnotation(BTSIdentifiableItem model)
	{
		this.model = model;
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

}
