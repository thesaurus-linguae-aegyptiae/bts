package org.bbaw.bts.ui.commons.corpus.text;

import org.bbaw.bts.btsmodel.BTSIdentifiableItem;
import org.bbaw.bts.btsmodel.BTSInterTextReference;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.core.commons.corpus.CorpusUtils;
import org.bbaw.bts.core.commons.staticAccess.StaticAccessController;
import org.eclipse.e4.tools.services.IResourceProviderService;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.validation.XtextAnnotation;
import org.eclipse.xtext.validation.Issue;

public class BTSModelAnnotation extends XtextAnnotation
{

	public static final String HIGHLIGHTED = ".highlighted";

	public static final String TOKEN = "token";

	protected IResourceProviderService resourceProvider = (IResourceProviderService) StaticAccessController.getResourceProvider();

	
	private BTSInterTextReference interTextReference;
	
	private BTSObject relatingObject;
	
	protected String cachedType;
	
	private boolean highlighted = false;

	
	public BTSModelAnnotation(String type, BTSIdentifiableItem model)
	{
		super(type, false, null, new Issue.IssueImpl(), false);
		this.model = model;
	}
	public BTSModelAnnotation(String type, BTSIdentifiableItem model, BTSInterTextReference interTextReference, BTSObject relatingObject)
	{
		super(type, false, null, new Issue.IssueImpl(), false);
		this.model = model;
		this.interTextReference = interTextReference;
		this.relatingObject = relatingObject;
		setType(CorpusUtils.getTypeIdentifier(relatingObject));
	}
	public BTSModelAnnotation(String type, boolean isPersistent,
			IXtextDocument document, Issue issue, boolean isQuickfixable,
			BTSIdentifiableItem modelObject) {
		super(type, isPersistent, document, issue, isQuickfixable);
		this.model = modelObject;
		setType(CorpusUtils.getTypeIdentifier(model));
	}


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
		setType(CorpusUtils.getTypeIdentifier(model));
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
		this.highlighted = highlighted;
	}
	
	@Override
	public String getType() {
		return super.getType() + (this.highlighted ? HIGHLIGHTED : "");
	}
	
	@Override
	public String getText() {
		if (relatingObject != null)
		{
			String text = "";
			if (relatingObject.getType() != null)
			{
				text = relatingObject.getType() + ": ";
			}
			text += relatingObject.getName();
			return text;
			
		}
		return super.getText();
	}
}
