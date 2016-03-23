package org.bbaw.bts.ui.main.handlers;

import javax.inject.Named;

import org.bbaw.bts.ui.commons.search.SearchViewer;
import org.bbaw.bts.ui.main.dialogs.SimpleSearchQueryDialog;
import org.eclipse.e4.core.contexts.Active;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.swt.widgets.Shell;

public class OpenSearchQueryDialogHandler {
	@Execute
	public void execute(@Active MPart activePart, @Active Shell shell,
			IEclipseContext context, @Optional @Named("org.bbaw.bts.ui.main.commandparameter.viewerFilter") String viewerFilterString,
			@Optional @Named("org.bbaw.bts.ui.main.commandparameter.searchString") String searchString,
			@Optional @Named("org.bbaw.bts.ui.main.commandparameter.searchOptions") String searchOptions) {
		Object o = activePart.getObject();
		if (o instanceof SearchViewer) {
			SearchViewer searchViewer = (SearchViewer) o;
			SimpleSearchQueryDialog dialog = new SimpleSearchQueryDialog(shell);
			ContextInjectionFactory.inject(dialog, context);
			dialog.create();
			dialog.setSearchString(searchString);
			if (searchOptions != null) {
				dialog.setNameOnly(searchOptions.contains(SearchViewer.OPT_NAME_ONLY));
				dialog.setIdOnly(searchOptions.contains(SearchViewer.OPT_ID_ONLY));
			}
			dialog.setTitle("Object Search");
			if (dialog.open() == SimpleSearchQueryDialog.OK) {
				if (dialog.getQueryRequest() != null) {
					searchViewer.search(dialog.getQueryRequest(), null, viewerFilterString);
				}
			}
		}
	}

	@CanExecute
	public boolean canExecute(@Active MPart activePart) {
		Object o = activePart.getObject();
		if (o instanceof SearchViewer) {
			return true;
		}
		return false;

	}

}