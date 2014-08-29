package org.bbaw.bts.core.dao.corpus;

import java.util.List;

import org.bbaw.bts.core.dao.GenericDao;
import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject;
import org.bbaw.bts.corpus.btsCorpusModel.BTSPassportEntry;
import org.bbaw.bts.searchModel.BTSQueryRequest;

public interface CorpusObjectDao extends GenericDao<BTSCorpusObject, String>
{

	List<BTSCorpusObject> getRootBTSCorpusObjects(String path);

	List<BTSPassportEntry> getPassportEntryProposals(
			BTSQueryRequest query, String indexName, String indexType);

}
