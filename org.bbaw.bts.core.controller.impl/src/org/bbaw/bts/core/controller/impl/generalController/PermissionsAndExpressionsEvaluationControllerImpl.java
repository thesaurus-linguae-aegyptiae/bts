package org.bbaw.bts.core.controller.impl.generalController;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.btsmodel.BTSDBCollectionRoleDesc;
import org.bbaw.bts.btsmodel.BTSProject;
import org.bbaw.bts.btsmodel.BTSProjectDBCollection;
import org.bbaw.bts.btsmodel.BTSUser;
import org.bbaw.bts.btsmodel.BTSUserGroup;
import org.bbaw.bts.commons.BTSPluginIDs;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.controller.generalController.EditingDomainController;
import org.bbaw.bts.core.controller.generalController.PermissionsAndExpressionsEvaluationController;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.Preference;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.services.IServiceConstants;

public class PermissionsAndExpressionsEvaluationControllerImpl implements
		PermissionsAndExpressionsEvaluationController {

	private static final String FALSE = "false";

	private static final String TRUE = "true";

	// @Inject
	// @Optional
	// @Named(IServiceConstants.ACTIVE_SELECTION)
	private Object selection;

	@Inject
	@Optional
	@Named(BTSCoreConstants.MAIN_PROJECT)
	private BTSProject mainProject;

	@Optional
	@Named(BTSCoreConstants.AUTHENTICATED_USER)
	private BTSUser authenticatedUser;

	@Optional
	@Named(BTSCoreConstants.USERGROUPS_OF_AUTHENTICATED_USER)
	private List<BTSUserGroup> userGroups;

	@Optional
	@Named(BTSCoreConstants.CURRENT_DB_COLLECTION_CONTEXT)
	private String dbCollectionContext;
	// @Inject
	// private PermissionsAndExpressionsEvaluationService evaluationService;

	@Inject
	private EditingDomainController editingDomaincontroller;

	@Inject
	@Optional
	@Preference(value = BTSPluginIDs.PREF_MAIN_CORPUS, nodePath = "org.bbaw.bts.app")
	private String main_corpus_key;

	@Inject
	@Optional
	@Preference(value = "main_project_key", nodePath = "org.bbaw.bts.app")
	private String main_project_key;
	private IEclipseContext workbenchContext;

	private String userContextRole;

	@Inject
	public PermissionsAndExpressionsEvaluationControllerImpl(IEclipseContext ctx) {
		MApplication application = ctx.get(MApplication.class);
		workbenchContext = application.getContext();
		workbenchContext
				.declareModifiable(BTSCoreConstants.CORE_EXPRESSION_MAY_EDIT);
		workbenchContext
				.declareModifiable(BTSCoreConstants.CORE_EXPRESSION_MAY_ADD);
		workbenchContext
				.declareModifiable(BTSCoreConstants.CORE_EXPRESSION_MAY_ANNOTATE);
		workbenchContext
				.declareModifiable(BTSCoreConstants.CORE_EXPRESSION_MAY_COMMENT);
		workbenchContext
				.declareModifiable(BTSCoreConstants.CORE_EXPRESSION_MAY_DELETE);
		workbenchContext
				.declareModifiable(BTSCoreConstants.CORE_EXPRESSION_MAY_EDIT_CONFIG);
		workbenchContext
				.declareModifiable(BTSCoreConstants.CORE_EXPRESSION_MAY_EDIT_PERMISSIONS);
		workbenchContext
				.declareModifiable(BTSCoreConstants.CORE_EXPRESSION_MAY_EDIT_USERS);
		workbenchContext
				.declareModifiable(BTSCoreConstants.CORE_EXPRESSION_MAY_MASTER_EDIT_CONFIG);
		workbenchContext
				.declareModifiable(BTSCoreConstants.CORE_EXPRESSION_MAY_TRANSCRIBE);
		workbenchContext
				.declareModifiable(BTSCoreConstants.CORE_EXPRESSION_USER_CONTEXT_ROLE);
		workbenchContext
				.declareModifiable(BTSCoreConstants.CURRENT_DB_COLLECTION_CONTEXT);

	}

	@Override
	public void init() {
		// TODO Auto-generated method stub

	}

	@Inject
	void setSelection(
			@Optional @Named(IServiceConstants.ACTIVE_SELECTION) Object selection) {
		if (selection != null && selection instanceof BTSDBBaseObject
				&& !selection.equals(this.selection)) {
			this.selection = selection;
			evaluatePermissionsAndExpressions();
		}
	}

	private void evaluatePermissionsAndExpressions() {
		evaluateUserContextRole();

		evaluateMayAdd();
		evaluateMayDelete();
		evaluateMayEdit();
		evaluateMayTranscribe();
		evaluateMayAnnotate();
		evaluateMayComment();
		evaluateMayEditConfig();
		evaluateMayMasterEditConfig();
		evaluateMayEditUsers();
		evaluateMayEditPermissions();
		evaluateMayOpenFuton();

	}

	private boolean evaluateMayTranscribe() {
		return false;
		// TODO Auto-generated method stub

	}

	private void evaluateUserContextRole() {
		userContextRole = BTSCoreConstants.USER_ROLE_GUESTS;
		if (authenticatedUser == null || mainProject == null) {

		} else {
			for (BTSProjectDBCollection c : mainProject.getDbCollections()) {
				if (c.getCollectionName() != null
						&& c.getCollectionName().equals(dbCollectionContext)) {
					userContextRole = highestUserRoleInDBCollection(c);
					break;
				}
			}
		}
		workbenchContext.modify(
				BTSCoreConstants.CORE_EXPRESSION_USER_CONTEXT_ROLE,
				userContextRole);
	}

	private String highestUserRoleInDBCollection(BTSProjectDBCollection c) {
		String role = BTSCoreConstants.USER_ROLE_GUESTS;
		int level = 0;
		for (BTSDBCollectionRoleDesc r : c.getRoleDescriptions()) {
			switch (r.getRoleName()) {
			case BTSCoreConstants.USER_ROLE_ADMINS: {
				if (userIsMember(r.getUserNames())) {
					return BTSCoreConstants.USER_ROLE_ADMINS;
				}
				break;
			}
			case BTSCoreConstants.USER_ROLE_EDITORS: {
				if (userIsMember(r.getUserNames())) {
					role = BTSCoreConstants.USER_ROLE_EDITORS;
					level = 4;
				}
				break;
			}
			case BTSCoreConstants.USER_ROLE_RESEARCHERS: {
				if (level < 3 && userIsMember(r.getUserNames())) {
					role = BTSCoreConstants.USER_ROLE_RESEARCHERS;
					level = 3;
				}
				break;
			}
			case BTSCoreConstants.USER_ROLE_TRANSCRIBERS: {
				if (level < 2 && userIsMember(r.getUserNames())) {
					role = BTSCoreConstants.USER_ROLE_TRANSCRIBERS;
					level = 2;
				}
				break;
			}

			}
		}
		return role;
	}

	private boolean evaluateMayOpenFuton() {
		return false;
		// TODO Auto-generated method stub

	}

	private boolean evaluateMayEditPermissions() {
		return false;
		// TODO Auto-generated method stub

	}

	private boolean evaluateMayEditUsers() {
		return false;
		// TODO Auto-generated method stub

	}

	private boolean evaluateMayMasterEditConfig() {
		return false;
		// TODO Auto-generated method stub

	}

	private boolean evaluateMayEditConfig() {
		return false;
		// TODO Auto-generated method stub

	}

	private boolean evaluateMayComment() {
		return false;
		// TODO Auto-generated method stub

	}

	private boolean evaluateMayAnnotate() {
		return false;
		// TODO Auto-generated method stub

	}

	private boolean evaluateMayEdit() {
		boolean may = false;
		if (authenticatedUser == null || selection == null
				|| !(selection instanceof BTSDBBaseObject)) {
			may = false;
		} else {
			if (userRoleMayEdit()
					|| userIsMember(((BTSDBBaseObject) selection).getUpdaters())) {
				may = true;
			}
		}
		workbenchContext.modify(BTSCoreConstants.CORE_EXPRESSION_MAY_EDIT,
				new Boolean(may));
		return may;

	}

	private boolean userRoleMayEdit() {
		return (userContextRole != null && (userContextRole
				.equals(BTSCoreConstants.USER_ROLE_ADMINS) || userContextRole
				.equals(BTSCoreConstants.USER_ROLE_EDITORS)));
	}

	private boolean userIsMember(List<String> userList) {
		for (String userId : userList) {
			if (userId.equals(authenticatedUser.get_id())
					|| userId.equals(authenticatedUser.getUserName())) {
				return true;
			}
			if (userGroups != null && !userGroups.isEmpty()) {
				for (BTSUserGroup g : userGroups) {
					if (userId.equals(g.get_id()) || userId.equals(g.getName())) {
						return true;
					}
				}
			}

		}
		return false;
	}

	private boolean evaluateMayDelete() {
		return false;
		// TODO Auto-generated method stub

	}

	private boolean evaluateMayAdd() {
		return false;
		// TODO Auto-generated method stub

	}

	/**
	 * @param mainProject
	 *            the mainProject to set
	 */
	@Inject
	@Optional
	public void setMainProject(
			@Named(BTSCoreConstants.MAIN_PROJECT) BTSProject mainProject) {
		if (this.mainProject != null && !this.mainProject.equals(mainProject)) {
			this.mainProject = mainProject;
			evaluatePermissionsAndExpressions();
		}
	}

	/**
	 * @param authenticatedUser
	 *            the authenticatedUser to set
	 */
	@Inject
	@Optional
	public void setAuthenticatedUser(
			@Named(BTSCoreConstants.AUTHENTICATED_USER) BTSUser authenticatedUser) {
		if (authenticatedUser != null
				&& !authenticatedUser.equals(this.authenticatedUser)) {
			this.authenticatedUser = authenticatedUser;
			evaluatePermissionsAndExpressions();
		}

	}

	@Override
	public void activateDBCollectionContext(String key) {
		if (key != null) {
			String localDBCollContext = null;
			switch (key) {
			case BTSPluginIDs.PREF_MAIN_CORPUS: {
				localDBCollContext = main_project_key + "_corpus_"
						+ main_corpus_key;
				break;
			}
			case BTSCoreConstants.MAIN_WORD_LIST: {
				localDBCollContext = main_project_key + "_wlist";

				break;
			}
			default:
				break;
			}
			if (localDBCollContext != null
					&& !localDBCollContext.equals(dbCollectionContext)) {
				dbCollectionContext = localDBCollContext;
				workbenchContext.modify(
						BTSCoreConstants.CURRENT_DB_COLLECTION_CONTEXT,
						dbCollectionContext);
				evaluatePermissionsAndExpressions();
			}
		}

	}

}
