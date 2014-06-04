package org.bbaw.bts.core.controller.dialogControllers;

import java.util.List;

import org.bbaw.bts.btsmodel.BTSDBBaseObject;

public interface CompareObjectsController {
	
	List<BTSDBBaseObject> listConflictingVersions(BTSDBBaseObject object);
	
	List<BTSDBBaseObject> listAvailableVersions(BTSDBBaseObject object, boolean fetchFromRemote);


	boolean removeRevision(BTSDBBaseObject object, String revision);
	
	void reloadConflicts(BTSDBBaseObject object);
}
