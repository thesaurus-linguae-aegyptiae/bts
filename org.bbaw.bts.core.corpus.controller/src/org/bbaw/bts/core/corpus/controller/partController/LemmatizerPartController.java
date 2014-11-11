package org.bbaw.bts.core.corpus.controller.partController;

import java.util.List;

import org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaEntry;
import org.bbaw.bts.corpus.btsCorpusModel.BTSWord;

public interface LemmatizerPartController {

	List<BTSLemmaEntry> findLemmaProposals(BTSWord word);

}
