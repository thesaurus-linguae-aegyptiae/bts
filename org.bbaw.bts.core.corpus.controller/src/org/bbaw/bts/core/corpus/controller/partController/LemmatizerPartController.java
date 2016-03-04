package org.bbaw.bts.core.corpus.controller.partController;

import java.util.List;

import org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaEntry;
import org.bbaw.bts.searchModel.BTSQueryRequest;
import org.eclipse.core.runtime.IProgressMonitor;

public interface LemmatizerPartController {

	List<BTSLemmaEntry> findLemmaProposals(String prefix, IProgressMonitor monitor);

	String processWordCharForLemmatizing(String wordChars);

	List<BTSLemmaEntry> sortAndFilterLemmaProposals(List<BTSLemmaEntry> obs, String searchString);

	BTSQueryRequest getLemmaSearchQuery(String searchString);

}
