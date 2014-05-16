package org.bbaw.bts.ui.corpus.handlers;

import javax.inject.Named;

import org.bbaw.bts.btsmodel.BTSTextCorpus;
import org.bbaw.bts.commons.BTSPluginIDs;
import org.bbaw.bts.core.corpus.controller.partController.CorpusNavigatorController;
import org.bbaw.bts.ui.corpus.dialogs.NewCorpusObjectDialog;
import org.eclipse.e4.core.contexts.Active;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.services.internal.events.EventBroker;
import org.eclipse.swt.widgets.Shell;

public class CreateNewTextCorpusHandler
{

	@Execute
	public void execute(CorpusNavigatorController corpusNavigatorController, EventBroker eventBroker, @Named(IServiceConstants.ACTIVE_SHELL) Shell shell)
	{
		BTSTextCorpus corpus = corpusNavigatorController.createNewTextCorpus();
		corpus.setCorpusPrefix(null);
		NewCorpusObjectDialog dialog = new NewCorpusObjectDialog(shell, corpus);
		if (dialog.open() == NewCorpusObjectDialog.OK)
		{
			corpusNavigatorController.makeAndSaveNewTextCorpus(corpus, dialog.isCorpusSynchronized());

			eventBroker.post("model_new/asyncEvent", corpus);
		}
	}

	@CanExecute
	public boolean canExecute(@Active MPart part)
	{
		return part.getElementId().equals(BTSPluginIDs.PART_ID_CORPUS_NAVIGATOR);
	}
}
