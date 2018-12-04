package org.bbaw.bts.ui.commons.corpus.events;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

import org.bbaw.bts.btsmodel.BTSIdentifiableItem;
import org.bbaw.bts.btsmodel.BTSInterTextReference;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.corpus.btsCorpusModel.BTSSentenceItem;
import org.bbaw.bts.ui.commons.corpus.text.BTSModelAnnotation;
import org.eclipse.swt.custom.CaretEvent;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.TypedEvent;
import org.eclipse.swt.widgets.Event;

public class BTSTextSelectionEvent extends Event {
	
	private List<BTSObject> relatingObjects = new Vector<BTSObject>(4);
	private List<BTSModelAnnotation> textAnnotations = new Vector<BTSModelAnnotation>(4);
	
	private List<BTSInterTextReference> interTextReferences = new Vector<BTSInterTextReference>(4);
	
	private List<BTSIdentifiableItem> selectedItems = new Vector<BTSIdentifiableItem>(4);
	
	private String startId;
	private String endId;
	private TypedEvent originalEvent;
	
	private BTSObject parentObject;

	public BTSTextSelectionEvent(TypedEvent event, BTSObject parentObject) {
		this.originalEvent = event;
		this.display = event.display;
		this.widget = event.widget;
		this.time = event.time;
		this.parentObject = parentObject;
	}


	public BTSTextSelectionEvent(SelectionEvent event, BTSObject parentObject) {
		this((TypedEvent)event, parentObject);
		this.x = event.x;
		this.y = event.y;
		this.text = event.text;
	}


	public BTSTextSelectionEvent(CaretEvent event, BTSObject parentObject) {
		this((TypedEvent)event, parentObject);
		StyledText sourceAsStyledText = 
				event.getSource() instanceof StyledText 
				? (StyledText)event.getSource() : null;
		if (sourceAsStyledText != null && 
				sourceAsStyledText.getSelection().x != sourceAsStyledText.getSelection().y) {
			// catch select all with ctrl+a
			this.x = sourceAsStyledText.getSelection().x;
			this.y = sourceAsStyledText.getSelection().y;
		} else {
			this.x = event.caretOffset;
			this.y = event.caretOffset;
		}
	}


	public BTSTextSelectionEvent(Event event, BTSObject parentObject) {
		this(new TypedEvent(event), parentObject);
	}


	public List<BTSObject> getRelatingObjects() {
		return Collections.unmodifiableList(relatingObjects);
	}

	public boolean addRelatingObjects(List<BTSObject> objects) {
		// XXX dubletten
		if (objects != null && objects.size() > 0) {
			relatingObjects.addAll(relatingObjects);
			return true;
		}
		return false;
	}

	public boolean addRelatingObject(BTSObject object) {
		if (object != null && !relatingObjects.contains(object)) {
			relatingObjects.add(object);
			return true;
		}
		return false;
	}

	public void setRelatingObjects(List<BTSObject> relatingObjects) {
		this.relatingObjects = relatingObjects;
	}

	public List<BTSModelAnnotation> getTextAnnotations() {
		return Collections.unmodifiableList(textAnnotations);
	}

	public boolean addTextAnnotations(List<BTSModelAnnotation> annotations) {
		if (annotations != null && annotations.size() > 0) {
			textAnnotations.addAll(annotations);
			return true;
		}
		return false;
	}

	public List<BTSInterTextReference> getInterTextReferences() {
		return Collections.unmodifiableList(interTextReferences);
	}

	public boolean addInterTextReference(BTSInterTextReference reference) {
		if (reference != null && !interTextReferences.contains(reference)) {
			interTextReferences.add(reference);
			return true;
		}
		return false;
	}

	public boolean addInterTextReferences(List<BTSInterTextReference> references) {
		if (references != null && !references.isEmpty()) { // XXX dubletten
			interTextReferences.addAll(references);
			return true;
		}
		return false;
	}


	public List<BTSIdentifiableItem> getSelectedItems() {
		return Collections.unmodifiableList(selectedItems);
	}

	public boolean addSelectedItem(BTSIdentifiableItem item) {
		if (item != null && !selectedItems.contains(item)) {
			selectedItems.add(item);
			if (item instanceof BTSSentenceItem) // XXX fuck
			{
				setEndId(item.get_id());
				setStartId(item.get_id());
			}
		}
		return false;
	}

	public boolean addSelectedItems(List<BTSIdentifiableItem> items) {
		if (items != null && !items.isEmpty()) {
			// XXX dubletten
			selectedItems.addAll(items);
			return true;
		}
		return false;
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

}
