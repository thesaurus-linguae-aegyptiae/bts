package org.bbaw.bts.ui.corpus.handlers;

import java.util.List;
import java.util.Vector;

import javax.inject.Named;

import org.bbaw.bts.btsmodel.BTSConfigItem;
import org.bbaw.bts.btsmodel.BTSProject;
import org.bbaw.bts.btsmodel.BTSUser;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.controller.generalController.BTSConfigurationController;
import org.bbaw.bts.ui.commons.filter.CreatorViewerFilter;
import org.bbaw.bts.ui.commons.filter.ProjectPrefixViewerFilter;
import org.bbaw.bts.ui.commons.filter.ReviewStatusViewerFilter;
import org.bbaw.bts.ui.commons.filter.UpdaterViewerFilter;
import org.bbaw.bts.ui.commons.filter.VisibilityViewerFilter;
import org.bbaw.bts.ui.commons.navigator.StructuredViewerProvider;
import org.bbaw.bts.ui.corpus.parts.corpusNavigator.CorpusNavigatorActiveTextCorporaViewerFilter;
import org.bbaw.bts.ui.main.dialogs.ObjectByListEntrySelectionFilterDialog;
import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.State;
import org.eclipse.e4.core.commands.ECommandService;
import org.eclipse.e4.core.contexts.Active;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.widgets.Shell;

public class NavigatorParametrizedFilterHandler {
	
	private ViewerFilter filter;
	private boolean isContained;
	private List<Object> allObjects;
	@Execute
	public void execute(IEclipseContext context, @Active MPart activePart, 
			@Optional @Named("navigatorParametrizedFilter") String param,
			ECommandService commandService)
	{
		if (param == null) param = "activeTextCorpora";
		Command command = commandService.getCommand("org.bbaw.bts.ui.corpus.command.navigatorParametrizedFilter");
		State state = command.getState(param);
		if (state == null)
		{
			state = new State();
			state.setValue(new Boolean(false));
			command.addState(param, state);
		}
		Boolean checked = (Boolean) state.getValue();
		checked = !checked;
		state.setValue(new Boolean(checked));
		
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
		
		Class clazz = null;
		clazz = findFilterClass(param, viewer, context);
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
		
		
		
		if (filter instanceof ViewerFilter) {
			if (!checked) {
				viewer.removeFilter((ViewerFilter) filter);
			} else if (!isContained) {
				viewer.addFilter((ViewerFilter) filter);
			}
			viewer.refresh();	
		}
		
	}

	private Class findFilterClass(String param, StructuredViewer viewer, IEclipseContext context) {
		
		Class clazz = null;
		switch (param) {
		case "activeTextCorpora":
		{
			clazz = CorpusNavigatorActiveTextCorporaViewerFilter.class;
			break;
		}	
		
		default:
			break;
		}
		return clazz;
	}

	private ViewerFilter makeFilter(Class clazz, IEclipseContext context) throws InstantiationException, IllegalAccessException {
		ViewerFilter filter =  (ViewerFilter) clazz.newInstance();
		ContextInjectionFactory.inject(filter, context);
		return filter;

	}

	private ViewerFilter findFilter(StructuredViewer viewer,
			Class clazz) {
		ViewerFilter localfilter = null;
		ViewerFilter[] filters = viewer.getFilters();
		for (ViewerFilter f : filters)
		{
			if (clazz.isInstance(f))
			{
				localfilter = (ViewerFilter) f;
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
