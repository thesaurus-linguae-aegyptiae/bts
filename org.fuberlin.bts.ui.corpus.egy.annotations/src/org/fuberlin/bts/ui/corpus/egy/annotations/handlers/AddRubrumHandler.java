package org.fuberlin.bts.ui.corpus.egy.annotations.handlers;

import javax.inject.Named;

import org.bbaw.bts.btsmodel.BTSInterTextReference;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.BTSRelation;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.commons.corpus.CorpusUtils;
import org.bbaw.bts.core.corpus.controller.partController.CorpusNavigatorController;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAnnotation;
import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject;
import org.bbaw.bts.ui.commons.corpus.events.BTSTextSelectionEvent;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.services.internal.events.EventBroker;
import org.eclipse.swt.widgets.Shell;

public class AddRubrumHandler {
	@Execute
	public void execute(
			@Named(IServiceConstants.ACTIVE_SELECTION) @Optional BTSTextSelectionEvent event,
			@Named(IServiceConstants.ACTIVE_SHELL) final Shell shell,
			EventBroker eventBroker,
			CorpusNavigatorController corpusNavigatorController) {
			BTSObject dbbaseObject = (BTSObject) event.data;
		
			if (dbbaseObject != null)
			{
				final BTSAnnotation object = corpusNavigatorController
						.createNewAnnotation((BTSCorpusObject) dbbaseObject, BTSConstants.ANNOTATION +
								CorpusUtils.TYPE_PATH_DELIMITER + CorpusUtils.ANNOTATION_RUBRUM_TYPE);
				object.setName("Rubrum");
				BTSRelation rel = null;
				if (object.getRelations().isEmpty())
				{
					rel = BtsmodelFactory.eINSTANCE.createBTSRelation();
					object.getRelations().add(rel);
				}
				else
				{
					rel = object.getRelations().get(0);
				}
	
				rel.setObjectId(dbbaseObject.get_id());
				
				BTSInterTextReference ref = BtsmodelFactory.eINSTANCE.createBTSInterTextReference();
				ref.setBeginId(event.getStartId());
				ref.setEndId(event.getEndId());
				rel.getParts().add(ref);
				corpusNavigatorController.save(object);
			}
			// FIXME eventBroker.post("model_add/BTSAnnotation", object);
	}

	@CanExecute
	public boolean canExecute(
			@Named(IServiceConstants.ACTIVE_SELECTION) @Optional BTSTextSelectionEvent event) {
		return (!event.getSelectedItems().isEmpty());
	}

}