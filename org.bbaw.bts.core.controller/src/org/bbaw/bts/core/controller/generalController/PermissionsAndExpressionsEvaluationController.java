package org.bbaw.bts.core.controller.generalController;

public interface PermissionsAndExpressionsEvaluationController {

	void init();

	void activateDBCollectionContext(String prefMainCorpus);

	boolean authenticatedUserIsDBAdmin(boolean remoteDBAdmin);

	boolean authenticatedUserMaySyncDBColl(String dbCollectionName);
}
