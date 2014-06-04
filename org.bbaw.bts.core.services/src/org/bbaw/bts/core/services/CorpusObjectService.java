package org.bbaw.bts.core.services;

import java.util.List;

import org.bbaw.bts.btsmodel.BTSCorpusObject;
import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.btsmodel.BTSPassportEntry;
import org.bbaw.bts.searchModel.BTSQueryRequest;

public interface CorpusObjectService extends GenericObjectService<BTSCorpusObject, String>
{

	List<BTSCorpusObject> getRootBTSCorpusObjects();

	List<BTSPassportEntry> getPassportEntryProposals(BTSQueryRequest query);



}
