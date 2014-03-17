package org.bbaw.bts.core.dao;

import java.util.Collection;

import org.bbaw.bts.btsmodel.BTSThsEntry;

public interface BTSThsEntryDao extends GenericDao<BTSThsEntry, String>
{

	boolean removeBTSThsEntry(BTSThsEntry btsThsEntry, String path);

	Collection<? extends BTSThsEntry> list(String dbPath, String staticQueryId,
			String objectState);

}
