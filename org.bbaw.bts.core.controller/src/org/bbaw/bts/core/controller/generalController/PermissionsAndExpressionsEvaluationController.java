package org.bbaw.bts.core.controller.generalController;

import org.bbaw.bts.btsmodel.BTSObject;

public interface PermissionsAndExpressionsEvaluationController {

	void init();

	void activateDBCollectionContext(String prefMainCorpus);

	boolean authenticatedUserIsDBAdmin(boolean remoteDBAdmin);

	boolean authenticatedUserMaySyncDBColl(String dbCollectionName);
	
	boolean authenticatedUserMayEditObeject(BTSObject object);
}
