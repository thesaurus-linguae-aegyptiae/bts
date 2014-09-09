 
package org.bbaw.bts.ui.main.handlers;

import javax.inject.Named;

import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.BTSProject;
import org.bbaw.bts.btsviewmodel.TreeNodeWrapper;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.commons.filter.BTSFilter;
import org.bbaw.bts.core.controller.generalController.BTSProjectController;
import org.bbaw.bts.core.controller.generalController.PermissionsAndExpressionsEvaluationController;
import org.bbaw.bts.core.controller.handlerController.MoveObjectAmongProjectDBCollectionHandlerController;
import org.bbaw.bts.ui.main.dialogs.MoveObjectAmongProjectDBCollectionSelectionDialog;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.swt.widgets.Shell;

public class MoveObjectAmongProjectDBCollectionHandler {
	@Execute
	public void execute(@Optional @Named(IServiceConstants.ACTIVE_SELECTION) BTSDBBaseObject selection,
			@Named(IServiceConstants.ACTIVE_SHELL) final Shell shell,
			IEclipseContext context, MoveObjectAmongProjectDBCollectionHandlerController moveController, BTSProjectController projectController,
			@Optional @Named(BTSCoreConstants.PARAM_ID_MOVE_OBEJECT_AMONG_PROJECT_TARGET_DBCOLLECTIONS) String targetDBCollectionPath) {
		String sourceDBCollectionPath = selection.getDBCollectionKey();

		// if parameter not null
		if (targetDBCollectionPath != null && !targetDBCollectionPath.equals(selection.getDBCollectionKey()))
		{
			moveController.move(selection, targetDBCollectionPath, sourceDBCollectionPath);
		}
		else 
		{
			// get input treenode from moveController
			TreeNodeWrapper rootNode = moveController.getMoveOptionsRootNode(selection);
	
			// get filter from move service
			BTSFilter moveDBCollectionFilter  = moveController.getMoveDBCollectionFilter(selection);
			
			BTSProject currentProject = projectController.findProjectByProjectPrefix(selection.getProject());
			
			// create dialog, insert rootNode
			MoveObjectAmongProjectDBCollectionSelectionDialog dialog = new MoveObjectAmongProjectDBCollectionSelectionDialog(shell, 
					rootNode, moveDBCollectionFilter, selection, currentProject);
			dialog.create();
			
			ContextInjectionFactory.inject(dialog, context);
			
			if (dialog.open() == dialog.OK)
			{
				// get selection result
				targetDBCollectionPath = dialog.getTargetDBCollectionPath();
				
				// if not null
				if (targetDBCollectionPath != null && !targetDBCollectionPath.equals(selection.getDBCollectionKey()))
				{
					moveController.move(selection, targetDBCollectionPath, sourceDBCollectionPath);
				}
			}
			//
		}
		
	}
	
	
	@CanExecute
	public boolean canExecute(@Optional @Named(IServiceConstants.ACTIVE_SELECTION) BTSDBBaseObject selection,
			PermissionsAndExpressionsEvaluationController evaluationController) {
		if (selection instanceof BTSObject)
		{
			return evaluationController.authenticatedUserMayEditObject((BTSObject) selection);
		}
		return false;
	}
		
}