package org.bbaw.bts.core.dao;

import org.bbaw.bts.btsmodel.BTSThsEntry;

public interface BTSThsEntryDao extends GenericDao<BTSThsEntry, String>
{

	boolean removeBTSThsEntry(BTSThsEntry btsThsEntry, String path);

}
