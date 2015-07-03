package org.bbaw.bts.core.corpus.controller.impl.partController;

import java.util.Collections;
import java.util.List;

import javax.inject.Inject;

import org.bbaw.bts.core.corpus.controller.impl.util.BTSEgyLemmaEntryComparator;
import org.bbaw.bts.core.corpus.controller.partController.LemmatizerPartController;
import org.bbaw.bts.core.services.corpus.BTSLemmaEntryService;
import org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaEntry;
import org.bbaw.bts.corpus.btsCorpusModel.BTSWord;
import org.eclipse.core.runtime.IProgressMonitor;

public class LemmatizerPartControllerImpl implements LemmatizerPartController {

	@Inject
	private BTSLemmaEntryService lemmaService;
	
	@Override
	public List<BTSLemmaEntry> findLemmaProposals(BTSWord word, IProgressMonitor monitor) {
		List<BTSLemmaEntry> filtered =  lemmaService.findLemmaProposals(word, monitor);
		Collections.sort(filtered, new BTSEgyLemmaEntryComparator(processWordCharForLemmatizing(word)));
		return filtered;
	}

	@Override
	public String processWordCharForLemmatizing(BTSWord word) {
		return lemmaService.processWordCharForLemmatizing(word);
	}

	@Override
	public String processWordCharForLemmatizing(String wordChars) {
		return lemmaService.processWordCharForLemmatizing(wordChars);
	}

	@Override
	public List<BTSLemmaEntry> sortAndFilterLemmaProposals(
			List<BTSLemmaEntry> obs, String searchString) {
		List<BTSLemmaEntry> filtered = lemmaService.sortAndFilterLemmaProposals(obs);
		Collections.sort(filtered, new BTSEgyLemmaEntryComparator(processWordCharForLemmatizing(searchString)));
		return filtered;
	}

}
