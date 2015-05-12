package org.bbaw.bts.ui.corpus.handlers;

import javax.inject.Named;

import org.bbaw.bts.btsmodel.BTSComment;
import org.bbaw.bts.btsmodel.BTSRelation;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.controller.generalController.CommentController;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAnnotation;
import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject;
import org.bbaw.bts.ui.main.dialogs.CommentEditorDialog;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.services.internal.events.EventBroker;
import org.eclipse.swt.widgets.Shell;

public class AddCommentToATextHandler {
	@Execute
	public void execute(
			@Named(IServiceConstants.ACTIVE_SELECTION) BTSCorpusObject corpusObject,
			@Named(IServiceConstants.ACTIVE_SHELL) final Shell shell,
			EventBroker eventBroker,
			CommentController commentController, IEclipseContext context) {
		
			if (corpusObject != null)
			{
				final BTSComment object = commentController
						.createComment((BTSCorpusObject) corpusObject);
	
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
	
				rel.setObjectId(corpusObject.get_id());
				object.getRelations().add(rel);
				
				IEclipseContext child = context.createChild();
				child.set(BTSComment.class, object);
				child.set(Shell.class, shell);
				
				CommentEditorDialog dialog = ContextInjectionFactory.make(
						CommentEditorDialog.class, child);

				if (dialog.open() == CommentEditorDialog.OK) {
					
				}
				
			}
	}

	@CanExecute
	public boolean canExecute(
			@Named(IServiceConstants.ACTIVE_SELECTION) BTSCorpusObject corpusObject) {
		return (corpusObject != null && !(corpusObject instanceof BTSAnnotation));
	}

}