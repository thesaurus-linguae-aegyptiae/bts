package org.bbaw.bts.ui.commons.corpus.events;

import java.util.List;
import java.util.Vector;

import org.bbaw.bts.btsmodel.BTSIdentifiableItem;
import org.bbaw.bts.btsmodel.BTSInterTextReference;
import org.bbaw.bts.btsmodel.BTSObject;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.swt.custom.CaretEvent;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.TypedEvent;
import org.eclipse.swt.widgets.Event;

public class BTSTextSelectionEvent extends Event {
	
	private List<BTSObject> relatingObjects = new Vector<BTSObject>(4);
	private List<Annotation> textAnnotations = new Vector<Annotation>(4);
	
	private List<BTSInterTextReference> interTextReferences = new Vector<BTSInterTextReference>(4);
	
	private List<BTSIdentifiableItem> selectedItems = new Vector<BTSIdentifiableItem>(4);
	
	private String startId;
	
	private String endId;
	private TypedEvent originalEvent;
	
	private BTSObject parentObject;

	public BTSTextSelectionEvent(TypedEvent event, BTSObject parentObject) {
		this.setOriginalEvent(event);
		this.display = event.display;
		this.widget = event.widget;
		this.time = event.time;
		StyledText sourceAsStyledText = event.getSource() instanceof StyledText ? (StyledText)event.getSource() : null;
		if (event instanceof CaretEvent)
		{
			// catch select all with ctrl+a
			if (sourceAsStyledText != null && 
					sourceAsStyledText.getSelection().x != sourceAsStyledText.getSelection().y) {
				this.x = sourceAsStyledText.getSelection().x;
				this.y = sourceAsStyledText.getSelection().y;
			} else {
				this.x = ((CaretEvent)event).caretOffset;
				this.y = ((CaretEvent)event).caretOffset;
			}
		}
		else if (event instanceof SelectionEvent)
		{
			this.x = ((SelectionEvent)event).x;
			this.y = ((SelectionEvent)event).y;
			this.text = ((SelectionEvent)event).text;
			
		}
		this.setParentObject(parentObject);
	}

	public List<BTSObject> getRelatingObjects() {
		return relatingObjects;
	}

	public void setRelatingObjects(List<BTSObject> relatingObjects) {
		this.relatingObjects = relatingObjects;
	}

	public List<Annotation> getTextAnnotations() {
		return textAnnotations;
	}

	public void setTextAnnotations(List<Annotation> textAnnotations) {
		this.textAnnotations = textAnnotations;
	}

	public List<BTSInterTextReference> getInterTextReferences() {
		return interTextReferences;
	}

	public void setInterTextReferences(
			List<BTSInterTextReference> interTextReferences) {
		this.interTextReferences = interTextReferences;
	}

	public List<BTSIdentifiableItem> getSelectedItems() {
		return selectedItems;
	}

	public void setSelectedItems(List<BTSIdentifiableItem> selectedItems) {
		this.selectedItems = selectedItems;
	}

	public String getStartId() {
		return startId;
	}

	public void setStartId(String startId) {
		this.startId = startId;
	}

	public String getEndId() {
		return endId;
	}

	public void setEndId(String endId) {
		this.endId = endId;
	}

	public TypedEvent getOriginalEvent() {
		return originalEvent;
	}

	public void setOriginalEvent(TypedEvent originalEvent) {
		this.originalEvent = originalEvent;
	}

	public BTSObject getParentObject() {
		return parentObject;
	}

	public void setParentObject(BTSObject parentObject) {
		this.parentObject = parentObject;
	}
	
}
