 
package org.bbaw.bts.ui.main.handlers;

import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.workbench.modeling.EPartService;

public class SaveAllHandler {
	@Execute
	void execute(EPartService partService) {
		partService.saveAll(false);
	}

	@CanExecute
	public boolean canExecute(
			EPartService partService,
			@Optional @Named(IServiceConstants.ACTIVE_SELECTION) Object selection) {
		boolean can = !partService.getDirtyParts().isEmpty();
		return can;
	}
		
}