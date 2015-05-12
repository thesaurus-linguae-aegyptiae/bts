 
package org.bbaw.bts.ui.corpus.handlers;

import org.bbaw.bts.core.corpus.controller.partController.ATextNavigatorController;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAbstractText;
import org.eclipse.e4.core.contexts.Active;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.services.internal.events.EventBroker;

public class CreateNewAbstractTextHandler {
	@Execute
	public void execute(@Active MPart part,
			ATextNavigatorController atextController, EventBroker eventBroker) {
		BTSAbstractText atext = atextController.createNew();
		atext.setName("Abstract Text");
		eventBroker.post("model_atext_new_root/asyncEvent", atext);
	}
		
}