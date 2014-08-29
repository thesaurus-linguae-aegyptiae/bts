package org.bbaw.bts.ui.egy.handlers;

import javax.inject.Named;

import org.bbaw.bts.btsmodel.BTSInterTextReference;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.BTSRelation;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.core.corpus.controller.partController.BTSTextEditorController;
import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject;
import org.bbaw.bts.corpus.btsCorpusModel.BTSText;
import org.bbaw.bts.ui.commons.corpus.events.BTSTextSelectionEvent;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.services.internal.events.EventBroker;
import org.eclipse.swt.widgets.Shell;

public class AddGlosseHandler {
	@Execute
	public void execute(
			@Named(IServiceConstants.ACTIVE_SELECTION) @Optional BTSTextSelectionEvent event,
			@Named(IServiceConstants.ACTIVE_SHELL) final Shell shell,
			EventBroker eventBroker,
			BTSTextEditorController textController) {
			BTSObject dbbaseObject = (BTSObject) event.data;
		
			if (dbbaseObject != null)
			{
				final BTSText object = textController
						.createNewText((BTSCorpusObject) dbbaseObject);
				object.setType("Subtext");
				BTSRelation rel = null;
				if (object.getRelations().isEmpty())
				{
					rel = BtsmodelFactory.eINSTANCE.createBTSRelation();
				}
				else
				{
					rel = object.getRelations().get(0);
				}
	
				rel.setObjectId(dbbaseObject.get_id());
				object.getRelations().add(rel);
				BTSInterTextReference ref = BtsmodelFactory.eINSTANCE.createBTSInterTextReference();
				ref.setBeginId(event.getStartId());
				ref.setEndId(event.getEndId());
				rel.getParts().add(ref);
				textController.save(object);
			}
			// FIXME eventBroker.post("model_add/BTSAnnotation", object);
	}

	@CanExecute
	public boolean canExecute(
			@Named(IServiceConstants.ACTIVE_SELECTION) @Optional BTSTextSelectionEvent event) {
		return (!event.getSelectedItems().isEmpty());
	}

}