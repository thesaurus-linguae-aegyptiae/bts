package org.bbaw.bts.core.controller.handlerController;

import javax.inject.Inject;

import org.bbaw.bts.core.services.Backend2ClientUpdateService;
import org.eclipse.e4.core.di.annotations.Creatable;
import org.eclipse.e4.core.di.annotations.Optional;

@Creatable
public class Backend2ClientUpdateHandlerController
{

	@Inject
	@Optional
	private Backend2ClientUpdateService updateService;

	public void startListening()
	{
		updateService.startService();
	}
}
