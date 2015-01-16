 
package org.bbaw.bts.ui.main.handlers;

import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.workbench.modeling.EPartService;

public class OpenPartHandler {
	@Execute
	public void execute(EPartService partService, @Named("partId") String partId) {
		MPart part = partService.findPart(partId);
		if (part == null)
		{
			partService.createPart(partId);
		}
		partService.activate(part);
	}
		
}