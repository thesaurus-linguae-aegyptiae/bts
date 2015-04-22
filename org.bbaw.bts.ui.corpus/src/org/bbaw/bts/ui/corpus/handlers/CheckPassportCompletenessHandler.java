 
package org.bbaw.bts.ui.corpus.handlers;

import javax.inject.Named;

import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject;
import org.bbaw.bts.ui.commons.corpus.events.BTSTextSelectionEvent;
import org.bbaw.bts.ui.corpus.dialogs.CheckPassportDialog;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.swt.widgets.Shell;

public class CheckPassportCompletenessHandler {
	@Execute
	public void execute(@Named(IServiceConstants.ACTIVE_SELECTION) @Optional Object object,
			@Named(IServiceConstants.ACTIVE_SHELL) final Shell shell,
			IEclipseContext context) {
		BTSCorpusObject corpusObject = null;
		if (object instanceof BTSCorpusObject)
		{
			corpusObject = (BTSCorpusObject) object;
		}
		else if (object instanceof BTSTextSelectionEvent && ((BTSTextSelectionEvent) object).data instanceof BTSCorpusObject)
		{
			corpusObject = (BTSCorpusObject) ((BTSTextSelectionEvent) object).data;
		}
		if (corpusObject == null) return;
		IEclipseContext child = context.createChild();
		child.set(BTSCorpusObject.class, corpusObject);
		child.set(Shell.class, shell);
		
		CheckPassportDialog dialog = ContextInjectionFactory.make(
				CheckPassportDialog.class, child);

		if (dialog.open() == CheckPassportDialog.OK) {
			
		}
	}
	
	
	@CanExecute
	public boolean canExecute(@Named(IServiceConstants.ACTIVE_SELECTION) @Optional Object object) {
		
		return (object instanceof BTSCorpusObject) || (object instanceof BTSTextSelectionEvent);
	}
		
}