package org.bbaw.bts.core.services.corpus;

import org.bbaw.bts.core.services.GenericObjectService;
import org.bbaw.bts.corpus.btsCorpusModel.BTSTextCorpus;

public interface BTSTextCorpusService extends
		GenericObjectService<BTSTextCorpus, String> {

	boolean makeAndSaveNewTextCorpus(BTSTextCorpus corpus,
			boolean synchronizeCorpus);

}
