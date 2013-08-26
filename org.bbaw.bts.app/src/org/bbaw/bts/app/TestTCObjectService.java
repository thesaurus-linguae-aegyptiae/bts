 
package org.bbaw.bts.app;

import javax.inject.Inject;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.eclipse.e4.core.services.events.IEventBroker;

public class TestTCObjectService {
	@Inject
	IEventBroker eventBroker;
	
	@PostConstruct
	void hookListeners() {
		// Hook event listeners
	}
	
	@PreDestroy
	void unhookListeners() {
		// Unhook event listeners
	}
}