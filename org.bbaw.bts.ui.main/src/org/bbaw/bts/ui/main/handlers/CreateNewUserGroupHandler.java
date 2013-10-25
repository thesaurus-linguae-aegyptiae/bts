package org.bbaw.bts.ui.main.handlers;

import org.bbaw.bts.btsmodel.BTSUserGroup;
import org.bbaw.bts.core.controller.dialogControllers.UserManagerController;
import org.eclipse.e4.core.contexts.Active;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.services.internal.events.EventBroker;

public class CreateNewUserGroupHandler
{
	@Execute
	public void execute(@Active MPart part, UserManagerController userManagerController, EventBroker eventBroker)
	{

		BTSUserGroup group = userManagerController.createNewUserGroup();

		eventBroker.post("model_new/asyncEvent", group);
	}

	@CanExecute
	public boolean canExecute()
	{
		//TODO Your code goes here
		return true;
	}

}