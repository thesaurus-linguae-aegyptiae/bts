 
package org.bbaw.bts.ui.egy.handlers;

import javax.inject.Named;

import org.bbaw.bts.btsmodel.BTSComment;
import org.bbaw.bts.core.corpus.controller.partController.BTSTextEditorController;
import org.bbaw.bts.core.corpus.controller.partController.CorpusNavigatorController;
import org.bbaw.bts.corpus.btsCorpusModel.BTSText;
import org.bbaw.bts.ui.commons.corpus.events.BTSTextSelectionEvent;
import org.bbaw.bts.ui.egy.dialogs.CheckTextDialog;
import org.bbaw.bts.ui.main.dialogs.CommentEditorDialog;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.services.internal.events.EventBroker;
import org.eclipse.swt.widgets.Shell;

public class CheckTextHandler {
	@Execute
	public void execute(@Named(IServiceConstants.ACTIVE_SELECTION) @Optional Object object,
			@Named(IServiceConstants.ACTIVE_SHELL) final Shell shell,
			IEclipseContext context) {
		BTSText text = null;
		if (object instanceof BTSText)
		{
			text = (BTSText) object;
		}
		else if (object instanceof BTSTextSelectionEvent && ((BTSTextSelectionEvent) object).data instanceof BTSText)
		{
			text = (BTSText) ((BTSTextSelectionEvent) object).data;
		}
		if (text == null) return;
		IEclipseContext child = context.createChild();
		child.set(BTSText.class, text);
		child.set(Shell.class, shell);
		
		CheckTextDialog dialog = ContextInjectionFactory.make(
				CheckTextDialog.class, child);

		if (dialog.open() == CheckTextDialog.OK) {
			
		}
	}
	
	
	@CanExecute
	public boolean canExecute(@Named(IServiceConstants.ACTIVE_SELECTION) @Optional Object object) {
		
		return (object instanceof BTSText) || (object instanceof BTSTextSelectionEvent);
	}
		
}