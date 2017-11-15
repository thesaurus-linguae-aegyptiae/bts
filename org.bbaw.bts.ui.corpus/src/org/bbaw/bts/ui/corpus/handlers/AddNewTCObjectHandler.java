package org.bbaw.bts.ui.corpus.handlers;

import javax.inject.Inject;
import javax.inject.Named;

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

	private BTSCorpusObject latestSelection = null;
	private boolean latestStatus = false;

	@Execute
	public void execute(@Named(IServiceConstants.ACTIVE_SELECTION) @Optional BTSCorpusObject selection,
			@Named(IServiceConstants.ACTIVE_SHELL) final Shell shell, EventBroker eventBroker,
			CorpusNavigatorController corpusNavigatorController)
	{
		latestSelection = selection;
		final BTSTCObject object = corpusNavigatorController.createNewTCObject(selection);
		corpusNavigatorController.save(object);
		eventBroker.post("model_new/BTSTCObject", object);
	}

	@CanExecute
	public boolean canExecute(
			@Named(IServiceConstants.ACTIVE_SELECTION) @Optional BTSCorpusObject selection) {
		if (!(selection instanceof BTSAnnotation)) {
			if ((latestSelection == null) || !selection.get_id().equals(latestSelection.get_id())) {
				String dbCollectionName = navigatorController.getDBCollectionName(selection);
				latestStatus = permissionController.authenticatedUserMayAddToDBCollection(dbCollectionName);
				latestSelection = selection;
			}
			return latestStatus;
		}
		return false;
	}

}