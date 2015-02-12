 
package org.bbaw.bts.ui.main.handlers;

import org.bbaw.bts.db.DBManager;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.di.UISynchronize;
import org.eclipse.e4.ui.workbench.IWorkbench;

public class RestartHandler {
	@Execute
	  public void execute(final IWorkbench workbench, DBManager dbManager, UISynchronize sync) {
		 dbManager.shutdown();
		 sync.asyncExec(new Runnable() {
				@Override
				public void run() {
					 workbench.restart();
				}
			});
	   
	  }
		
}