 
package org.bbaw.bts.ui.main.handlers;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.workbench.IWorkbench;

public class ExitApplicationHandler {
	@Execute
	  public void execute(IWorkbench workbench) {
	    workbench.close();
	  }
		
}