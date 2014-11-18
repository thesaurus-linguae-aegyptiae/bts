package org.bbaw.bts.core.controller.dialogControllers;

import java.util.List;

import org.bbaw.bts.btsviewmodel.DBCollectionStatusInformation;
import org.eclipse.core.runtime.IProgressMonitor;

public interface DBManagerPartController {

	List<DBCollectionStatusInformation> getDBCollectionStatusInformations(IProgressMonitor monitor);

	boolean reIndex(String dbCollectionName, IProgressMonitor monitor);

}
