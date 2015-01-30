package org.bbaw.bts.core.corpus.controller.impl.generalController;

import java.util.List;

import javax.inject.Inject;

import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.commons.BTSPluginIDs;
import org.bbaw.bts.core.commons.staticAccess.StaticAccessController;
import org.bbaw.bts.core.controller.generalController.ExtensionStartUpController;
import org.bbaw.bts.core.services.corpus.BTSTextCorpusService;
import org.bbaw.bts.core.services.corpus.CorpusObjectService;
import org.bbaw.bts.corpus.btsCorpusModel.BTSTextCorpus;
import org.eclipse.core.runtime.preferences.ConfigurationScope;
import org.eclipse.core.runtime.preferences.DefaultScope;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.services.log.Logger;
import org.eclipse.e4.ui.model.application.MApplication;
import org.osgi.service.prefs.BackingStoreException;

public class CorpusStartUpController implements ExtensionStartUpController {

	@Inject
	private BTSTextCorpusService textCorpusService;
	@Inject
	private CorpusObjectService corpusObjectService;
	private Object main_project_key;
	private IEclipseContext context;
	private Logger logger;

	@Override
	public void startup() {
		
		context = StaticAccessController.getContext();
		MApplication application = context.get(MApplication.class);
		if (application != null)
		{
			context = application.getContext();
		}
		ContextInjectionFactory.inject(this, context);
//		textCorpusService = context.get(BTSTextCorpusService.class);
		logger = context.get(Logger.class);
		
		// declare main_corpus as modifiable
		context.declareModifiable(BTSPluginIDs.PREF_MAIN_CORPUS);

		
		String main_corpus_key;

		main_corpus_key = ConfigurationScope.INSTANCE.getNode("org.bbaw.bts.app").get(BTSPluginIDs.PREF_MAIN_CORPUS_KEY, null);
		main_project_key = ConfigurationScope.INSTANCE.getNode("org.bbaw.bts.app").get(BTSPluginIDs.PREF_MAIN_PROJECT_KEY, null);
		logger.info("checkCorpusSelectionSettings: main_project_key : " + main_project_key + ", main_corpus_key: " + main_corpus_key);
		if (main_project_key == null || "".equals(main_project_key)) return;

		if (main_corpus_key == null || "".equals(main_corpus_key)) return;

		List<BTSTextCorpus> corpora = textCorpusService.list(BTSConstants.OBJECT_STATE_ACTIVE, null);
		for (BTSTextCorpus cor : corpora)
		{
			corpusObjectService.checkAndFullyLoad(cor, false);
			if (main_project_key.equals(cor.getProject()) && main_corpus_key != null && main_corpus_key.endsWith(cor.getCorpusPrefix()))
			{
				BTSTextCorpus main_corpus = cor;
				context.modify(BTSPluginIDs.PREF_MAIN_CORPUS, main_corpus);
				break;
			}
		}
		
		String active_corpora = ConfigurationScope.INSTANCE.getNode("org.bbaw.bts.app").get(BTSPluginIDs.PREF_ACTIVE_CORPORA, 
				DefaultScope.INSTANCE.getNode("org.bbaw.bts.app").get(BTSPluginIDs.PREF_ACTIVE_CORPORA, null));
		boolean dirty = false;
		if (active_corpora == null || active_corpora.trim().length() == 0)
		{
			active_corpora = main_corpus_key;
			dirty = true;
		}
		else
		{
			String[] pros = active_corpora.split("\\|");
			boolean found = false;
			for (String p : pros)
			{
				if (p.equals(main_corpus_key))
				{
					found = true;
					break;
				}
			}
			if (!found)
			{
				active_corpora += "|" + main_corpus_key;
				dirty = true;
			}
		}
		if (dirty)
		{
			ConfigurationScope.INSTANCE.getNode("org.bbaw.bts.app").put(BTSPluginIDs.PREF_ACTIVE_CORPORA, active_corpora);
			InstanceScope.INSTANCE.getNode("org.bbaw.bts.app").put(BTSPluginIDs.PREF_ACTIVE_CORPORA, active_corpora);
			try {
				ConfigurationScope.INSTANCE.getNode("org.bbaw.bts.app").flush();
			} catch (BackingStoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				InstanceScope.INSTANCE.getNode("org.bbaw.bts.app").flush();
			} catch (BackingStoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
