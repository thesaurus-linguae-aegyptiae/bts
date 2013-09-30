package org.bbaw.bts.core.dao;

import org.bbaw.bts.btsmodel.BTSListEntry;

public interface BTSListEntryDao extends GenericDao<BTSListEntry, String>
{

	boolean removeBTSListEntry(BTSListEntry listEntry, String path);

}
