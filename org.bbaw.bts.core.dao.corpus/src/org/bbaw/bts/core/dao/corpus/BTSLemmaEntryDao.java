package org.bbaw.bts.core.dao.corpus;

import org.bbaw.bts.core.dao.GenericDao;
import org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaEntry;

public interface BTSLemmaEntryDao extends GenericDao<BTSLemmaEntry, String>
{

	boolean removeBTSListEntry(BTSLemmaEntry listEntry, String path);

}
