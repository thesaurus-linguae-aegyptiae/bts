package org.bbaw.bts.core.dao;

import java.util.Collection;
import java.util.List;

import org.bbaw.bts.btsmodel.BTSCorpusObject;
import org.bbaw.bts.btsmodel.BTSPassportEntry;
import org.bbaw.bts.searchModel.BTSQueryRequest;

public interface CorpusObjectDao extends GenericDao<BTSCorpusObject, String>
{

	List<BTSCorpusObject> getRootBTSCorpusObjects(String path);

	Collection<? extends BTSPassportEntry> getPassportEntryProposals(
			BTSQueryRequest query, String indexName, String indexType);

}
