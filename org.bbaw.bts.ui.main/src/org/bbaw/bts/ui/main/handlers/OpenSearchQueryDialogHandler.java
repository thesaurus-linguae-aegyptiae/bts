package org.bbaw.bts.ui.main.handlers;

import org.bbaw.bts.searchModel.BTSQueryRequest;
import org.bbaw.bts.ui.commons.search.SearchViewer;
import org.bbaw.bts.ui.main.dialogs.SimpleSearchQueryDialog;
import org.eclipse.e4.core.contexts.Active;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.swt.widgets.Shell;

public class OpenSearchQueryDialogHandler {
	@Execute
	public void execute(@Active MPart activePart, @Active Shell shell,
			IEclipseContext context) {
		Object o = activePart.getObject();
		if (o instanceof SearchViewer) {
			SearchViewer searchViewer = (SearchViewer) o;
			BTSQueryRequest query = new BTSQueryRequest();

			SimpleSearchQueryDialog dialog = new SimpleSearchQueryDialog(shell,
					query);
			ContextInjectionFactory.inject(dialog, context);
			dialog.create();
			if (dialog.open() == dialog.OK) {
				query = dialog.getQueryRequest();
				if (query != null) {
					searchViewer.search(query, null);
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