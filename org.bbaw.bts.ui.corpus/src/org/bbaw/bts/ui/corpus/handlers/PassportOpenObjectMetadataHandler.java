 
package org.bbaw.bts.ui.corpus.handlers;

import javax.inject.Named;

import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.corpus.controller.partController.CorpusNavigatorController;
import org.bbaw.bts.ui.corpus.dialogs.PassportEditorDialog;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.swt.widgets.Shell;

public class PassportOpenObjectMetadataHandler {
	@Execute
	public void execute(IEclipseContext context, @Named("objectId") String objectId, 
			CorpusNavigatorController corpusNavigatorController) {
		
		if (objectId != null)
		{
			BTSObject object = corpusNavigatorController.find(objectId, null);
			if (object == null) return;
			IEclipseContext child = context.createChild();
			child.set(BTSObject.class, object);
			child.set(Shell.class, new Shell());
			child.set(BTSCoreConstants.CORE_EXPRESSION_MAY_EDIT, false);

			PassportEditorDialog dialog = ContextInjectionFactory.make(
					PassportEditorDialog.class, child);
			if (dialog.open() == dialog.OK) {
				
			}
		}
		
	}
		
}