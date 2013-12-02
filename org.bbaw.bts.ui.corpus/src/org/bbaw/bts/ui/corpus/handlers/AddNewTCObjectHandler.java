package org.bbaw.bts.ui.corpus.handlers;

import javax.inject.Named;

import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.BTSTCObject;
import org.bbaw.bts.core.corpus.controller.partController.CorpusNavigatorController;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.services.internal.events.EventBroker;
import org.eclipse.swt.widgets.Shell;

public class AddNewTCObjectHandler
{

	@Execute
	public void execute(@Named(IServiceConstants.ACTIVE_SELECTION) @Optional BTSObject selection,
			@Named(IServiceConstants.ACTIVE_SHELL) final Shell shell, EventBroker eventBroker,
			CorpusNavigatorController corpusNavigatorController)
	{
		final BTSTCObject object = corpusNavigatorController.createNewTCObject();

		// Realm.runWithDefault(SWTObservables.getRealm(Display.getDefault()),
		// new Runnable()
		// {
		// public void run()
		// {
		// NewCorpusObjectDialog dialog = new NewCorpusObjectDialog(shell, new
		// BTSCorpusObject[] { object });
		// if (dialog.open() == dialog.OK)
		// {
		//
		// }
		//
		// }
		// });
		corpusNavigatorController.save(object);
		eventBroker.post("model_new/BTSTCObject", object);
	}

	@CanExecute
	public boolean canExecute(@Named(IServiceConstants.ACTIVE_SELECTION) @Optional BTSObject selection)
	{
		return true; // (selection instanceof BTSCorpusObject);
	}

}