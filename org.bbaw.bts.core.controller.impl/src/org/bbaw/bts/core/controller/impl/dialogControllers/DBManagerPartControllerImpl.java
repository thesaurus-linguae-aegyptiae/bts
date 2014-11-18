package org.bbaw.bts.core.controller.impl.dialogControllers;

import java.util.List;

import javax.inject.Inject;

import org.bbaw.bts.btsviewmodel.DBCollectionStatusInformation;
import org.bbaw.bts.core.controller.dialogControllers.DBManagerPartController;
import org.bbaw.bts.db.DBManager;
import org.eclipse.core.runtime.IProgressMonitor;

public class DBManagerPartControllerImpl implements DBManagerPartController {

	@Inject
	private DBManager dbManager;
	@Override
	public List<DBCollectionStatusInformation> getDBCollectionStatusInformations(IProgressMonitor monitor) {
		// TODO Auto-generated method stub
		return dbManager.getDBCollectionStatusInformations(monitor);
	}
	@Override
	public boolean reIndex(String dbCollectionName, IProgressMonitor monitor) {
		return dbManager.reindex(dbCollectionName, monitor);
	}

}
