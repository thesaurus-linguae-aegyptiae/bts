package org.bbaw.bts.ui.main.handlers;

import javax.inject.Inject;

import org.bbaw.bts.core.controller.handlerController.Backend2ClientUpdateHandlerController;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;

public class StartBackendUpdateListeningHandler
{

	@Inject
	private Backend2ClientUpdateHandlerController updateController;

	@Execute
	public void execute()
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