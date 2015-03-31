 
package org.bbaw.bts.ui.corpus.handlers;

import javax.inject.Named;

import org.bbaw.bts.core.corpus.controller.partController.ThsNavigatorController;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAnnotation;
import org.bbaw.bts.corpus.btsCorpusModel.BTSThsEntry;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.services.internal.events.EventBroker;

public class AddAnnotationThsNavigatorHandler {
	@Execute
	public void execute(
			@Named(IServiceConstants.ACTIVE_SELECTION) @Optional BTSThsEntry selection,
			EventBroker eventBroker,
			ThsNavigatorController corpusThsController) {
		if (selection instanceof BTSThsEntry) {
			final BTSAnnotation object = corpusThsController
					.createNewAnnotation((BTSThsEntry) selection);
			corpusThsController.save(object);
			eventBroker.post("model_add/BTSAnnotation", object);
		}
	}
	
	
	@CanExecute
	public boolean canExecute(
			@Named(IServiceConstants.ACTIVE_SELECTION) @Optional BTSThsEntry selection) {
		return (selection instanceof BTSThsEntry && !(selection instanceof BTSAnnotation));
	}
		
}