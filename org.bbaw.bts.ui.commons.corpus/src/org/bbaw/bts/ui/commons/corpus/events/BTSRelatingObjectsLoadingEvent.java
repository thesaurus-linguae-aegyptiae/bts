package org.bbaw.bts.ui.commons.corpus.events;

import java.util.List;
import java.util.Vector;

import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject;

public class BTSRelatingObjectsLoadingEvent {
	private List<BTSObject> relatingObjects = new Vector<BTSObject>(4);
	
	private BTSCorpusObject object;

	public BTSRelatingObjectsLoadingEvent(BTSCorpusObject object) {
		this.object = object;
	}

	public List<BTSObject> getRelatingObjects() {
		return relatingObjects;
	}

	public void setRelatingObjects(List<BTSObject> relatingObjects) {
		this.relatingObjects = relatingObjects;
	}

	public BTSCorpusObject getObject() {
		return object;
	}

	public void setObject(BTSCorpusObject object) {
		this.object = object;
	}

}
