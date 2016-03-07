package org.bbaw.bts.core.corpus.controller.partController;

import java.util.List;

import org.bbaw.bts.core.dao.util.BTSQueryRequest;
import org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaEntry;
import org.eclipse.core.runtime.IProgressMonitor;

public interface LemmatizerPartController {

	List<BTSLemmaEntry> findLemmaProposals(String prefix, IProgressMonitor monitor);

	String processWordCharForLemmatizing(String wordChars);

	List<BTSLemmaEntry> filterAndSortLemmaProposals(List<BTSLemmaEntry> obs, String searchString);

	BTSQueryRequest getLemmaSearchQuery(String searchString);

}
