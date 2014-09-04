package org.bbaw.bts.core.dao.corpus;

import org.bbaw.bts.core.dao.GenericDao;
import org.bbaw.bts.corpus.btsCorpusModel.BTSThsEntry;

public interface BTSThsEntryDao extends GenericDao<BTSThsEntry, String>
{

	boolean removeBTSThsEntry(BTSThsEntry btsThsEntry, String path);

	

}
