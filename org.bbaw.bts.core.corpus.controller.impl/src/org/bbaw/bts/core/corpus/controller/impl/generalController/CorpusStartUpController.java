package org.bbaw.bts.core.corpus.controller.impl.generalController;

import java.util.List;

import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.commons.BTSPluginIDs;
import org.bbaw.bts.core.commons.staticAccess.StaticAccessController;
import org.bbaw.bts.core.controller.generalController.ExtensionStartUpController;
import org.bbaw.bts.core.services.corpus.BTSTextCorpusService;
import org.bbaw.bts.corpus.btsCorpusModel.BTSTextCorpus;
import org.eclipse.core.runtime.preferences.ConfigurationScope;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.services.log.Logger;

public class CorpusStartUpController implements ExtensionStartUpController {

	private BTSTextCorpusService textCorpusService;
	private Object main_project_key;
	private IEclipseContext context;
	private Logger logger;

	@Override
	public void startup() {
		
		context = StaticAccessController.getContext();
		textCorpusService = context.get(BTSTextCorpusService.class);
		logger = context.get(Logger.class);
		String main_corpus_key;

		main_corpus_key = ConfigurationScope.INSTANCE.getNode("org.bbaw.bts.app").get(BTSPluginIDs.PREF_MAIN_CORPUS_KEY, null);
		logger.info("checkCorpusSelectionSettings: main_project_key : " + main_project_key + ", main_corpus_key: " + main_corpus_key);
		if (main_project_key == null || "".equals(main_project_key)) return;

		if (main_corpus_key == null || "".equals(main_corpus_key)) return;
		List<BTSTextCorpus> corpora = textCorpusService.list(BTSConstants.OBJECT_STATE_ACTIVE);
		for (BTSTextCorpus cor : corpora)
		{
			if (main_project_key.equals(cor.getProject()) && main_corpus_key != null && main_corpus_key.equals(cor.getCorpusPrefix()))
			{
				BTSTextCorpus main_corpus = cor;
				context.set(BTSPluginIDs.PREF_MAIN_CORPUS, main_corpus);
				break;
			}
		}

	}

}
