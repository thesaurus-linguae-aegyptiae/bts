package org.bbaw.bts.core.corpus.controller.impl.partController;

import java.util.List;

import javax.inject.Inject;

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
		return lemmaService.findLemmaProposals(word, monitor);
	}

}
