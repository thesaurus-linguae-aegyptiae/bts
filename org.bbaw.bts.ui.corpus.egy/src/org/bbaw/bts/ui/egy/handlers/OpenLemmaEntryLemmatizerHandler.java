 
package org.bbaw.bts.ui.egy.handlers;

import javax.inject.Named;

import org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaEntry;
import org.bbaw.bts.ui.egy.dialogs.LemmaEntryDialog;
import org.bbaw.bts.ui.egy.parts.EgyLemmatizerPart;
import org.eclipse.e4.core.contexts.Active;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.swt.widgets.Shell;

public class OpenLemmaEntryLemmatizerHandler {
	@Execute
	public void execute(@Named(IServiceConstants.ACTIVE_SHELL) final Shell shell, 
			@Active MPart activePart, IEclipseContext context) {
		Object o = activePart.getObject();
		if (o instanceof EgyLemmatizerPart)
		{
			BTSLemmaEntry entry = ((EgyLemmatizerPart)o).getSelectedLemmaProposal();
			if (entry == null) return;
			IEclipseContext child = context.createChild();
			child.set(BTSLemmaEntry.class, entry);
			LemmaEntryDialog dialog = ContextInjectionFactory.make(LemmaEntryDialog.class, child);
			dialog.open();
		}
	}
	
	
	@CanExecute
	public boolean canExecute(@Active MPart activePart) {
		Object o = activePart.getObject();
		if (o instanceof EgyLemmatizerPart)
		{
			return ((EgyLemmatizerPart)o).getSelectedLemmaProposal() != null;
		}
		return false;
	}
		
}