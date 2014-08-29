package org.bbaw.bts.core.corpus.controller.partController;

import java.util.List;

import org.bbaw.bts.btsmodel.BTSObject;

public interface AnnotationPartController {
	
	void save(BTSObject object);

	List<BTSObject> findRelatingObjects(BTSObject object);
}
