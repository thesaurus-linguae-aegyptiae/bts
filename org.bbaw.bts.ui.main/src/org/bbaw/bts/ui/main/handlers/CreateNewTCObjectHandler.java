package org.bbaw.bts.ui.main.handlers;

import org.bbaw.bts.btsmodel.BTSTCObject;
import org.bbaw.bts.core.controller.partController.CorpusNavigatorController;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.services.internal.events.EventBroker;

public class CreateNewTCObjectHandler
{

	@Execute
	public void execute(CorpusNavigatorController corpusNavigatorController, EventBroker eventBroker)
	{
		BTSTCObject object = corpusNavigatorController.createNewTCObject();
		object.setName("Object1");
		eventBroker.post("model_new/asyncEvent", object);
		System.out.println("CreateNewTCObjectHandler executed!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	}

	@CanExecute
	public boolean canExecute()
	{
		// TODO Your code goes here
		return true;
	}

}