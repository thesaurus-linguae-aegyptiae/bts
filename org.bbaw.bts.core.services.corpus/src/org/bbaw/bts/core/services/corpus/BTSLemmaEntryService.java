package org.bbaw.bts.core.services.corpus;

import java.util.List;

import org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaEntry;
import org.bbaw.bts.corpus.btsCorpusModel.BTSWord;

public interface BTSLemmaEntryService extends
GenericCorpusObjectService<BTSLemmaEntry, String> {

	List<BTSLemmaEntry> findLemmaProposals(BTSWord word);

	
}
