package org.bbaw.bts.ui.main.handlers;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSTCObject;
import org.bbaw.bts.core.controller.partController.CorpusNavigatorController;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.services.internal.events.EventBroker;

public class CreateNewTCObjectHandler
{

	@Inject
	EventBroker eventBroker;
	@Inject
	private CorpusNavigatorController corpusNavigatorController;

	@Execute
	public void execute()
	{
		BTSTCObject object = corpusNavigatorController.createNewTCObject();
		object.setName("Object1");
		eventBroker.post("model_new/asyncEvent", object);
	}

	@CanExecute
	public boolean canExecute()
	{
		// TODO Your code goes here
		return true;
	}

}