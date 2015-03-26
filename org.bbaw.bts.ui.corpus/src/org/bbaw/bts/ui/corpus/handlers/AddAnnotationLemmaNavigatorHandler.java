 
package org.bbaw.bts.ui.corpus.handlers;

import javax.inject.Named;

import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.core.corpus.controller.partController.LemmaNavigatorController;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAnnotation;
import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.services.internal.events.EventBroker;

public class AddAnnotationLemmaNavigatorHandler {
	@Execute
	public void execute(
			@Named(IServiceConstants.ACTIVE_SELECTION) @Optional BTSObject selection,
			EventBroker eventBroker,
			LemmaNavigatorController lemmaNavigatorController) {
		if (selection instanceof BTSCorpusObject) {
			final BTSAnnotation object = lemmaNavigatorController
					.createNewAnnotation((BTSCorpusObject) selection);
			lemmaNavigatorController.save(object);
			eventBroker.post("model_add/BTSAnnotation", object);
		}
	}
	
	
	@CanExecute
	public boolean canExecute(
			@Named(IServiceConstants.ACTIVE_SELECTION) @Optional BTSObject selection) {
		return (selection instanceof BTSCorpusObject && !(selection instanceof BTSAnnotation));
	}
		
}