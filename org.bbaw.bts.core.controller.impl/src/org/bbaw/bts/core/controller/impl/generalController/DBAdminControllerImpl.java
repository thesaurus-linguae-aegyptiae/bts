package org.bbaw.bts.core.controller.impl.generalController;

import javax.inject.Inject;

import org.bbaw.bts.core.controller.generalController.DBAdminController;
import org.bbaw.bts.db.DBManager;

public class DBAdminControllerImpl implements DBAdminController {
	
	@Inject
	private DBManager dbManager;

	@Override
	public String getLocalDBUrl() {
		return dbManager.getLocalDBurl();
	}

	@Override
	public String getLocalESUrl() {
		return dbManager.getLocalESGuiURL();
	}

}
