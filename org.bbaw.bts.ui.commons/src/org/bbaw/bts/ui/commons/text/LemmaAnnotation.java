package org.bbaw.bts.ui.commons.text;

import org.bbaw.bts.btsmodel.BTSIdentifiableItem;
import org.eclipse.jface.text.source.Annotation;

public class LemmaAnnotation extends Annotation
{

	public static final String TYPE = "org.bbaw.bts.ui.text.lemmaAnnotation";

	public LemmaAnnotation(BTSIdentifiableItem word)
	{
		this.item = word;
	}

	private BTSIdentifiableItem item;

	public BTSIdentifiableItem getItem()
	{
		return item;
	}

	public void setItem(BTSIdentifiableItem item)
	{
		this.item = item;
	}

}
