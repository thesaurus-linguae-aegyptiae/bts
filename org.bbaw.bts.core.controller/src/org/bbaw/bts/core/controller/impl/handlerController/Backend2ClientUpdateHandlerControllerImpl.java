package org.bbaw.bts.core.controller.impl.handlerController;

import javax.inject.Inject;

import org.bbaw.bts.core.controller.handlerController.Backend2ClientUpdateHandlerController;
import org.bbaw.bts.core.services.Backend2ClientUpdateService;
import org.eclipse.e4.core.di.annotations.Optional;

public class Backend2ClientUpdateHandlerControllerImpl implements Backend2ClientUpdateHandlerController
{

	@Inject
	@Optional
	private Backend2ClientUpdateService updateService;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.bbaw.bts.core.controller.impl.handlerController.
	 * Backend2ClientUpdateHandlerController#startListening()
	 */
	@Override
	public void startListening()
	{
		// updateService.startService();
	}
}
