package org.bbaw.bts.ui.main.handlers;

import org.bbaw.bts.core.controller.handlerController.Backend2ClientUpdateHandlerController;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;

public class StartBackendUpdateListeningHandler
{

	@Execute
	public void execute(Backend2ClientUpdateHandlerController updateController)
	{
		updateController.startListening();
	}

	@CanExecute
	public boolean canExecute()
	{
		// TODO Your code goes here
		return true; // (updateService != null);
	}

}