package org.bbaw.bts.ui.corpus.handlers;

import org.bbaw.bts.btsmodel.BTSTextCorpus;
import org.bbaw.bts.commons.BTSPluginIDs;
import org.bbaw.bts.core.corpus.controller.partController.CorpusNavigatorController;
import org.eclipse.e4.core.contexts.Active;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.services.internal.events.EventBroker;

public class CreateNewTextCorpusHandler
{

	@Execute
	public void execute(@Active MPart part, CorpusNavigatorController corpusNavigatorController, EventBroker eventBroker)
	{
		BTSTextCorpus corpus = corpusNavigatorController.createNewTextCorpus();
		corpus.setName("Corpus1");
		eventBroker.post("model_new/asyncEvent", corpus);
	}

	@CanExecute
	public boolean canExecute(@Active MPart part)
	{
		return part.getElementId().equals(BTSPluginIDs.PART_ID_CORPUS_NAVIGATOR);
	}
}
