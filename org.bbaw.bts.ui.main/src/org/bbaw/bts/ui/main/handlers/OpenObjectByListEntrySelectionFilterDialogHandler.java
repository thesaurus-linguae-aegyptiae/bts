package org.bbaw.bts.ui.main.handlers;

import java.beans.Visibility;
import java.util.List;
import java.util.Vector;

import javax.inject.Named;

import org.bbaw.bts.btsmodel.BTSConfigItem;
import org.bbaw.bts.btsmodel.BTSProject;
import org.bbaw.bts.btsmodel.BTSUser;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.commons.filter.BTSObjectsByListEntryFilter;
import org.bbaw.bts.core.controller.generalController.BTSConfigurationController;
import org.bbaw.bts.core.services.BTSProjectService;
import org.bbaw.bts.core.services.BTSUserService;
import org.bbaw.bts.core.services.GenericObjectService;
import org.bbaw.bts.ui.commons.filter.CreatorViewerFilter;
import org.bbaw.bts.ui.commons.filter.ProjectPrefixViewerFilter;
import org.bbaw.bts.ui.commons.filter.ReviewStatusViewerFilter;
import org.bbaw.bts.ui.commons.filter.UpdaterViewerFilter;
import org.bbaw.bts.ui.commons.filter.VisibilityViewerFilter;
import org.bbaw.bts.ui.commons.navigator.StructuredViewerProvider;
import org.bbaw.bts.ui.main.dialogs.ObjectByListEntrySelectionFilterDialog;
import org.eclipse.e4.core.contexts.Active;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.widgets.Shell;

public class OpenObjectByListEntrySelectionFilterDialogHandler {
	
	private BTSObjectsByListEntryFilter filter;
	private boolean isContained;
	private List<Object> allObjects;
	@Execute
	public void execute(IEclipseContext context, @Active MPart activePart, @Active Shell shell, 
			@Named(BTSCoreConstants.OBJECTS_FILTER_BY_PARAM_ID) String param)
	{
		filter = null;
		isContained = false;
		allObjects = null;
		
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
		
		// load param specific objects
		loadSpecificObjectsAndFilter(param, viewer, context);
		
		
		
		// make dialog
		ObjectByListEntrySelectionFilterDialog dialog = new ObjectByListEntrySelectionFilterDialog(shell, allObjects, filter);
		//inject projects and filter
		dialog.create();
		
		if (dialog.open() == dialog.OK)
		{
			filter = dialog.getFilter();
			// if no projects selected, drop filter, else add to viewer
			if (filter instanceof ViewerFilter) {
				if (filter.getObjects().isEmpty()) {
					viewer.removeFilter((ViewerFilter) filter);
				} else if (!isContained) {
					viewer.addFilter((ViewerFilter) filter);
				} else {
					viewer.refresh();
				}
			}
		}
		
	}

	private void loadSpecificObjectsAndFilter(String param, StructuredViewer viewer, IEclipseContext context) {
		
		Class clazz = null;
		switch (param) {
		case BTSCoreConstants.OBJECTS_FILTER_PARAM_BY_PROJECTS:
		{
			clazz = ProjectPrefixViewerFilter.class;
			BTSProjectService projectService = context.get(BTSProjectService.class);
			List<BTSProject> projects = projectService.list(BTSConstants.OBJECT_STATE_ACTIVE);
			allObjects = new Vector<Object>(projects.size());
			allObjects.addAll(projects);
			break;
		}	
		case BTSCoreConstants.OBJECTS_FILTER_PARAM_BY_CREATORS:
		{
			clazz = CreatorViewerFilter.class;
			BTSUserService userService = context.get(BTSUserService.class);
			List<BTSUser> users = userService.list(BTSConstants.OBJECT_STATE_ACTIVE);
			allObjects = new Vector<Object>(users.size());
			allObjects.addAll(users);
			break;
		}	
		case BTSCoreConstants.OBJECTS_FILTER_PARAM_BY_UPDATERS:
		{
			clazz = UpdaterViewerFilter.class;
			BTSUserService userService = context.get(BTSUserService.class);
			List<BTSUser> users = userService.list(BTSConstants.OBJECT_STATE_ACTIVE);
			allObjects = new Vector<Object>(users.size());
			allObjects.addAll(users);
			break;
		}	
		case BTSCoreConstants.OBJECTS_FILTER_PARAM_BY_REVIEWSTATUS:
		{
			clazz = ReviewStatusViewerFilter.class;
			BTSConfigurationController configController = context.get(BTSConfigurationController.class);
			BTSConfigItem ci = configController.getReviewStatusConfigItem();
			allObjects = new Vector<Object>(ci.getChildren().size());
			allObjects.addAll(ci.getChildren());
			break;
		}	
		case BTSCoreConstants.OBJECTS_FILTER_PARAM_BY_VISIBILITY:
		{
			clazz = VisibilityViewerFilter.class;
			BTSConfigurationController configController = context.get(BTSConfigurationController.class);
			BTSConfigItem ci = configController.getVisibilityConfigItem();
			allObjects = new Vector<Object>(ci.getChildren().size());
			allObjects.addAll(ci.getChildren());
			break;
		}
		default:
			break;
		}
		filter = findFilter(viewer, clazz);
		if (filter == null)
		{
			isContained = false;
			try {
				filter = makeFilter(clazz, context);
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}
		else
		{
			isContained = true;
		}

				
	}

	private BTSObjectsByListEntryFilter makeFilter(Class clazz, IEclipseContext context) throws InstantiationException, IllegalAccessException {
		BTSObjectsByListEntryFilter filter =  (BTSObjectsByListEntryFilter) clazz.newInstance();
		ContextInjectionFactory.inject(filter, context);
		return filter;

	}

	private BTSObjectsByListEntryFilter findFilter(StructuredViewer viewer,
			Class clazz) {
		BTSObjectsByListEntryFilter localfilter = null;
		ViewerFilter[] filters = viewer.getFilters();
		for (ViewerFilter f : filters)
		{
			if (clazz.isInstance(f))
			{
				localfilter = (BTSObjectsByListEntryFilter) f;
			}
		}
		return localfilter;
	}

	@CanExecute
	public boolean canExecute(@Active MPart activePart) {
		
		// have active part injected via param
		
		// true if active part has a StructuredViewer
		Object o = activePart.getObject();
		StructuredViewerProvider part;
		// see if part has a StructuredViewer
		if (o instanceof StructuredViewerProvider)
		{
			return true;
		}
		
		return false;
		
	}
}
