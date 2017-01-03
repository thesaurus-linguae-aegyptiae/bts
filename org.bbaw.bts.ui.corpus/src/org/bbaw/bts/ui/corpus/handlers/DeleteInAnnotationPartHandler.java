 
package org.bbaw.bts.ui.corpus.handlers;

import javax.inject.Named;

import org.bbaw.bts.btsmodel.AdministrativDataObject;
import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.commons.BTSPluginIDs;
import org.bbaw.bts.core.controller.generalController.EditingDomainController;
import org.bbaw.bts.core.controller.generalController.PermissionsAndExpressionsEvaluationController;
import org.bbaw.bts.core.corpus.controller.generalController.CorpusCommandController;
import org.bbaw.bts.ui.corpus.parts.AnnotationsPart;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Shell;

public class DeleteInAnnotationPartHandler {
	@Execute
	public void execute(
			@Optional @Named(IServiceConstants.ACTIVE_SHELL) Shell shell,
			IEclipseContext context,
			EditingDomainController editingDomainController,
			CorpusCommandController commandController, EPartService partService,
			PermissionsAndExpressionsEvaluationController permissionController) {
		BTSObject[] objects = null;
		MPart part = partService.findPart(BTSPluginIDs.PART_ID_ANNOTATION_PART);
		if (part != null)
		{
			Object o = part.getObject();
			if (o instanceof AnnotationsPart)
			{
				objects = ((AnnotationsPart) o).getSelectedObjects();
			}
		}
		if (shell == null)
		{
			shell = new Shell();
		}
		if (objects != null && objects.length > 0) {
			for (BTSObject o : objects)
			{
				if (!permissionController.authenticatedUserMayEditObject(o))
				{
					MessageDialog dialog = new MessageDialog(shell, "Deletion not allowed", null,
						    "You are not allowed to delete the selected objects.", MessageDialog.ERROR, new String[] { "OK" }, 0);
					dialog.open();
					return;
				}
			}
			
			MessageDialog dialog = new MessageDialog(shell, "Deletion", null,
				    "You are about to delete all selected objects from AnnotationPart.\n\nAre you sure that you want to delete these objects?", MessageDialog.QUESTION, new String[] { "Delete", "Cancel" }, 1);
			int result = dialog.open();
			if (result == 1 || result == SWT.DEFAULT) 
				return;
			for (BTSObject o : objects)
			{
				((AdministrativDataObject) o)
				.setState(BTSConstants.OBJECT_STATE_TERMINATED);
				//General Command Controller... save!
				commandController.save((BTSDBBaseObject) o);
			}
		}
	}
	
	// no canExecute because it would be a lot to calculate... retrieving the annotation part, then retrieving the objects from... 
		
}