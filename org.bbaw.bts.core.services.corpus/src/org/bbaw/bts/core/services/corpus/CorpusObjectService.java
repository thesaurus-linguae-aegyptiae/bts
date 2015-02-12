package org.bbaw.bts.core.services.corpus;

import java.util.List;

import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject;
import org.bbaw.bts.corpus.btsCorpusModel.BTSPassportEntry;
import org.bbaw.bts.searchModel.BTSQueryRequest;

public interface CorpusObjectService extends GenericCorpusObjectService<BTSCorpusObject, String>
{

	List<BTSCorpusObject> getRootBTSCorpusObjects();

	List<BTSPassportEntry> getPassportEntryProposals(BTSQueryRequest query);

	String[] getActive_corpora(String projecPrefix);
	
}
