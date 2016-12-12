package org.bbaw.bts.ui.corpus.handlers;

import javax.inject.Inject;
import javax.inject.Named;

import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.core.controller.generalController.PermissionsAndExpressionsEvaluationController;
import org.bbaw.bts.core.corpus.controller.partController.CorpusNavigatorController;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAnnotation;
import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject;
import org.bbaw.bts.corpus.btsCorpusModel.BTSTCObject;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.services.internal.events.EventBroker;
import org.eclipse.swt.widgets.Shell;

@SuppressWarnings("restriction")
public class AddNewTCObjectHandler
{

	@Inject
	private PermissionsAndExpressionsEvaluationController permissionController;

	@Inject
	private CorpusNavigatorController navigatorController;

	@Execute
	public void execute(@Named(IServiceConstants.ACTIVE_SELECTION) @Optional BTSCorpusObject selection,
			@Named(IServiceConstants.ACTIVE_SHELL) final Shell shell, EventBroker eventBroker,
			CorpusNavigatorController corpusNavigatorController)
	{
		final BTSTCObject object = corpusNavigatorController.createNewTCObject(selection);
		corpusNavigatorController.save(object);
		eventBroker.post("model_new/BTSTCObject", object);
	}

	@CanExecute
	public boolean canExecute(
			@Named(IServiceConstants.ACTIVE_SELECTION) @Optional BTSObject selection) {
		if (selection instanceof BTSCorpusObject && !(selection instanceof BTSAnnotation)) {
			String dbCollectionName = navigatorController.getDBCollectionName(
					(BTSCorpusObject)selection);
			return permissionController.authenticatedUserMayAddToDBCollection(dbCollectionName);
		}
		return false;
	}

}