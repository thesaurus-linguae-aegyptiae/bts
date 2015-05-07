 
package org.bbaw.bts.ui.main.handlers;

import java.util.List;

import org.bbaw.bts.btsmodel.BTSConfigItem;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.btsviewmodel.BTSObjectTypeTreeNode;
import org.bbaw.bts.core.commons.filter.BTSObjectsByListEntryFilter;
import org.bbaw.bts.core.controller.generalController.BTSConfigurationController;
import org.bbaw.bts.ui.commons.filter.TypeSubtypeViewerFilter;
import org.bbaw.bts.ui.commons.navigator.StructuredViewerProvider;
import org.bbaw.bts.ui.main.dialogs.ObjectByListEntrySelectionFilterDialog;
import org.bbaw.bts.ui.main.dialogs.ObjectByTypeSubtypeSelectionFilterDialog;
import org.eclipse.e4.core.contexts.Active;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.widgets.Shell;

public class OpenTypeSubtypeFilterDialogHandler {
	
	
	
	@Execute
	public void execute(IEclipseContext context, @Active MPart activePart, @Active Shell shell, 
			BTSConfigurationController configurationController) {
		TypeSubtypeViewerFilter filter;
		boolean isContained;
		BTSConfigItem inputPath = null;
		filter = null;
		isContained = false;
		Object o = activePart.getObject();
		StructuredViewerProvider part;
		// see if part has a StructuredViewer
		if (o instanceof StructuredViewerProvider)
		{
			part = (StructuredViewerProvider) o;
		}
		else
		{
			return;
		}
		
		// get viewer
		StructuredViewer viewer = part.getActiveStructuredViewer();
		
		if (viewer == null) return;
		
		filter = findFilter(viewer);
		if (filter == null)
		{
			isContained = false;
			try {
				filter = makeFilter(context);
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
			
		}
		else
		{
			isContained = true;
			inputPath = filter.getInputPath();
		}
		if (inputPath == null)
		{
			inputPath = BtsmodelFactory.eINSTANCE.createBTSConfigItem();
			BTSConfigItem objectTypesConfig = configurationController
					.getObjectTypesConfigItem();
			BTSObjectTypeTreeNode path = configurationController
					.processTreeSelectorInputPath(objectTypesConfig, null,
							null, false);
			inputPath.getOwnerReferencedTypesStringList().addAll(configurationController
			.processTreePathToList(path));
		}
		
		
		// make dialog
		ObjectByTypeSubtypeSelectionFilterDialog dialog = new ObjectByTypeSubtypeSelectionFilterDialog(shell, filter, part.getTypesFilterTerms());
		IEclipseContext childContext = context.createChild("dialog");
		childContext.set(BTSConfigItem.class, inputPath);
		ContextInjectionFactory.inject(dialog, childContext);
		//inject projects and filter
		dialog.create();
		
		if (dialog.open() == dialog.OK)
		{
			filter = dialog.getFilter();
			// if no projects selected, drop filter, else add to viewer
			if (filter instanceof ViewerFilter) {
				if (filterPathIsEmpty(filter)) {
					viewer.removeFilter((ViewerFilter) filter);
				} else if (!isContained) {
					viewer.addFilter((ViewerFilter) filter);
				} else {
				}
				part.reloadViewerNodes(viewer);
			}
		}
	}
	private boolean filterPathIsEmpty(TypeSubtypeViewerFilter filter2) {
		// TODO check if filter path is empty
		if (filter2.getInputPath() == null || filter2.getInputPath().getOwnerReferencedTypesStringList().isEmpty()
				|| filter2.getInputPath().getOwnerReferencedTypesStringList().contains("ANY"))
		{
			return true;
		}
		return false;
	}
	@CanExecute
	public boolean canExecute(@Active MPart activePart) {
		
		// have active part injected via param
		
		// true if active part has a StructuredViewer
		Object o = activePart.getObject();
		// see if part has a StructuredViewer
		if (o instanceof StructuredViewerProvider)
		{
			return true;
		}
		
		return false;
		
	}
	
	private TypeSubtypeViewerFilter makeFilter(IEclipseContext context) throws InstantiationException, IllegalAccessException {
		TypeSubtypeViewerFilter filter =  ContextInjectionFactory.make(TypeSubtypeViewerFilter.class, context);
		return filter;

	}

	private TypeSubtypeViewerFilter findFilter(StructuredViewer viewer) {
		TypeSubtypeViewerFilter localfilter = null;
		ViewerFilter[] filters = viewer.getFilters();
		for (ViewerFilter f : filters)
		{
			if (f instanceof TypeSubtypeViewerFilter)
			{
				localfilter = (TypeSubtypeViewerFilter) f;
			}
		}
		return localfilter;
	}
}