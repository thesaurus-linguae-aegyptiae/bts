package org.bbaw.bts.core.corpus.controller.impl.partController;

import java.util.Collections;
import java.util.List;

import javax.inject.Inject;

import org.bbaw.bts.core.corpus.controller.impl.util.BTSEgyLemmaEntryComparator;
import org.bbaw.bts.core.corpus.controller.partController.LemmatizerPartController;
import org.bbaw.bts.core.dao.util.BTSQueryRequest;
import org.bbaw.bts.core.services.corpus.BTSLemmaEntryService;
import org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaEntry;
import org.eclipse.core.runtime.IProgressMonitor;

public class LemmatizerPartControllerImpl implements LemmatizerPartController {

	@Inject
	private BTSLemmaEntryService lemmaService;
	
	@Override
	public List<BTSLemmaEntry> findLemmaProposals(String word, IProgressMonitor monitor) {
		List<BTSLemmaEntry> filtered =  lemmaService.findLemmaProposals(word, monitor);
		Collections.sort(filtered, new BTSEgyLemmaEntryComparator(word));
		return filtered;
	}

	@Override
	public String processWordCharForLemmatizing(String wordChars) {
		return lemmaService.processWordCharForLemmatizing(wordChars);
	}

	@Override
	public List<BTSLemmaEntry> filterAndSortLemmaProposals(
			List<BTSLemmaEntry> obs, String searchString) {
		List<BTSLemmaEntry> filtered = lemmaService.filterLemmaProposals(obs);
		Collections.sort(filtered, new BTSEgyLemmaEntryComparator(searchString));
		return filtered;
	}
	
	@Override
	public BTSQueryRequest getLemmaSearchQuery(String searchString, boolean includePersonNames) {
		return lemmaService.createLemmaSearchQuery(searchString, includePersonNames);
	}

	@Override
	public BTSQueryRequest getLemmaSearchQuery(String searchString) {
		return lemmaService.createLemmaSearchQuery(searchString);
	}
}
