package org.bbaw.bts.ui.commons.corpus.text;

import org.bbaw.bts.btsmodel.BTSIdentifiableItem;
import org.bbaw.bts.btsmodel.BTSInterTextReference;
import org.bbaw.bts.btsmodel.BTSObject;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.validation.XtextAnnotation;
import org.eclipse.xtext.validation.Issue;

public class BTSModelAnnotation extends XtextAnnotation
{

	public static final String TYPE = "org.bbaw.bts.ui.text.modelAnnotation";
	protected static final String HIGHLIGHTED = ".highlighted";

	public static final String TYPE_HIGHLIGHTED = TYPE + HIGHLIGHTED;

	
	
	private BTSInterTextReference interTextReference;
	
	private BTSObject relatingObject;
	
	protected String cachedType;

	
	public BTSModelAnnotation(String type, BTSIdentifiableItem model)
	{
		super(type, false, null, new Issue.IssueImpl(), false);
		this.model = model;
	}
//
//	public BTSModelAnnotation(BTSIdentifiableItem model, BTSInterTextReference interTextReference)
//	{
//		this.model = model;
//		this.interTextReference = interTextReference;
//	}
//	
	public BTSModelAnnotation(String type, BTSIdentifiableItem model, BTSInterTextReference interTextReference, BTSObject relatingObject)
	{
		super(type, false, null, new Issue.IssueImpl(), false);
		this.model = model;
		this.interTextReference = interTextReference;
		this.relatingObject = relatingObject;
	}
//
//	public BTSModelAnnotation(String type, boolean isPersistent,
//			IXtextDocument document, Issue issue, boolean isQuickfixable,
//			Object modelObject) {
//		super(type, isPersistent, document, issue, isQuickfixable);
//		this.modelObject = modelObject;
//
//	}
//
	public BTSModelAnnotation(String type, boolean isPersistent,
			IXtextDocument document, Issue issue, boolean isQuickfixable,
			BTSIdentifiableItem modelObject) {
		super(type, isPersistent, document, issue, isQuickfixable);
		this.model = modelObject;

	}

//	public BTSModelAnnotation(String type, IXtextDocument document, Issue issue,
//			BTSIdentifiableItem modelObject) {
//		super(type, false, document, issue, false);
//		this.model = modelObject;
//
//	}

	public BTSModelAnnotation(String type, IXtextDocument document, Issue issue,
			BTSIdentifiableItem modelObject) {
		super(type, false, document, issue, false);
		this.model = modelObject;
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

	public BTSInterTextReference getInterTextReference() {
		return interTextReference;
	}

	public void setInterTextReference(BTSInterTextReference interTextRefernce) {
		this.interTextReference = interTextRefernce;
	}

	public BTSObject getRelatingObject() {
		return relatingObject;
	}

	public void setRelatingObject(BTSObject relatingObject) {
		this.relatingObject = relatingObject;
	}

	public void setHighlighted(boolean highlighted)
	{
		if (highlighted)
		{
			if (!getType().endsWith(HIGHLIGHTED)) {
				cachedType = getType();
				setType(getType() + HIGHLIGHTED);
			}
		} else {
			setType(cachedType);
		}
	}
	
}
