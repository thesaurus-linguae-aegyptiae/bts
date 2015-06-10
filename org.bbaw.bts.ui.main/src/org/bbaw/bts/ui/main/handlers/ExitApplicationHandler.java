package org.bbaw.bts.ui.main.handlers;

import org.bbaw.bts.db.DBManager;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.di.UISynchronize;
import org.eclipse.e4.ui.workbench.IWorkbench;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;

public class ExitApplicationHandler {
	@Execute
	public void execute(EPartService partService, final IWorkbench workbench,
			Shell shell, DBManager dbManager, UISynchronize sync) {
		boolean saveAll = false;
		boolean close = false;
		if (!partService.getDirtyParts().isEmpty()) {
			saveAll = MessageDialog.openConfirm(shell, "Unsaved Data",
					"Unsaved data, do you want to save and close?");

		} else {
			close = MessageDialog.openConfirm(shell, "Close",
					"Close application?");
		}

		if (saveAll) {
			partService.saveAll(false);
		}
		if (close || saveAll) {
			try {
				if (dbManager.optimizationRequired()) {
					// ask user if optimize
					dbManager.optimize();
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				dbManager.shutdown();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			sync.asyncExec(new Runnable() {
				@Override
				public void run() {
					workbench.close();
				}
			});
		}

	}

}