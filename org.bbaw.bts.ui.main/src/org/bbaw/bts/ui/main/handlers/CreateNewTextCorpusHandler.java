package org.bbaw.bts.ui.main.handlers;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSTextCorpus;
import org.bbaw.bts.commons.BTSPluginIDs;
import org.bbaw.bts.core.controller.partController.CorpusNavigatorController;
import org.eclipse.e4.core.contexts.Active;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.services.internal.events.EventBroker;

public class CreateNewTextCorpusHandler
{
	@Inject
	EventBroker eventBroker;
	@Inject
	private CorpusNavigatorController corpusNavigatorController;

	@Execute
	public void execute(@Active MPart part)
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
