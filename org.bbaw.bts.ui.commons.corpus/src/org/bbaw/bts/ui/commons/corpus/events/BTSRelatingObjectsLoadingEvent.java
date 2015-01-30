package org.bbaw.bts.ui.commons.corpus.events;

import java.util.List;
import java.util.Vector;

import org.bbaw.bts.btsmodel.BTSObject;

public class BTSRelatingObjectsLoadingEvent {
	private List<BTSObject> relatingObjects = new Vector<BTSObject>(4);
	
	private BTSObject object;

	public BTSRelatingObjectsLoadingEvent(BTSObject object) {
		this.object = object;
	}

	public List<BTSObject> getRelatingObjects() {
		return relatingObjects;
	}

	public void setRelatingObjects(List<BTSObject> relatingObjects) {
		this.relatingObjects = relatingObjects;
	}

	public BTSObject getObject() {
		return object;
	}

	public void setObject(BTSObject object) {
		this.object = object;
	}

}
