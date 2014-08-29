package org.bbaw.bts.core.dao.corpus;

import java.util.List;

import org.bbaw.bts.core.dao.GenericDao;
import org.bbaw.bts.corpus.btsCorpusModel.BTSThsEntry;

public interface BTSThsEntryDao extends GenericDao<BTSThsEntry, String>
{

	boolean removeBTSThsEntry(BTSThsEntry btsThsEntry, String path);

	List< BTSThsEntry> list(String dbPath, String staticQueryId,
			String objectState);

}
