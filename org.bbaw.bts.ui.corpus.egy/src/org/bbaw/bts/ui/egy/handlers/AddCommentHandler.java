package org.bbaw.bts.ui.egy.handlers;

import javax.inject.Named;

import org.bbaw.bts.btsmodel.BTSComment;
import org.bbaw.bts.btsmodel.BTSInterTextReference;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.BTSRelation;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.controller.generalController.CommentController;
import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject;
import org.bbaw.bts.ui.commons.corpus.events.BTSTextSelectionEvent;
import org.bbaw.bts.ui.main.dialogs.CommentEditorDialog;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Shell;

public class AddCommentHandler {
	@Execute
	public void execute(
			@Named(IServiceConstants.ACTIVE_SELECTION) @Optional BTSTextSelectionEvent event,
			@Named(IServiceConstants.ACTIVE_SHELL) final Shell shell,
			CommentController commentController, IEclipseContext context) {
			BTSObject dbbaseObject = (BTSObject) event.data;
		
			if (dbbaseObject != null)
			{
				final BTSComment object = commentController
						.createComment((BTSCorpusObject) dbbaseObject);
	
				BTSRelation rel = null;
				if (object.getRelations().isEmpty())
				{
					rel = BtsmodelFactory.eINSTANCE.createBTSRelation();
					rel.setType(BTSCoreConstants.BASIC_RELATIONS_PARTOF);
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
				
				IEclipseContext child = context.createChild();
				child.set(BTSComment.class, object);
				child.set(Shell.class, shell);
				
				CommentEditorDialog dialog = ContextInjectionFactory.make(
						CommentEditorDialog.class, child);

				dialog.open();

				child.dispose();

			}
			// FIXME eventBroker.post("model_add/BTSAnnotation", object);
	}

	@CanExecute
	public boolean canExecute(
			@Named(IServiceConstants.ACTIVE_SELECTION) @Optional BTSTextSelectionEvent event) {
		return (!event.getSelectedItems().isEmpty());
	}

}