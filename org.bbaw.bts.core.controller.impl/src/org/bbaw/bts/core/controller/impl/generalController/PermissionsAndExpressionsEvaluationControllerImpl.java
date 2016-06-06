package org.bbaw.bts.core.controller.impl.generalController;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.inject.Inject;
import javax.inject.Named;

import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.btsmodel.BTSDBCollectionRoleDesc;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.BTSProject;
import org.bbaw.bts.btsmodel.BTSProjectDBCollection;
import org.bbaw.bts.btsmodel.BTSUser;
import org.bbaw.bts.btsmodel.BTSUserGroup;
import org.bbaw.bts.btsmodel.DBLease;
import org.bbaw.bts.btsviewmodel.BtsviewmodelFactory;
import org.bbaw.bts.btsviewmodel.StatusMessage;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.commons.BTSPluginIDs;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.controller.generalController.EditingDomainController;
import org.bbaw.bts.core.controller.generalController.PermissionsAndExpressionsEvaluationController;
import org.bbaw.bts.core.services.BTSEvaluationService;
import org.bbaw.bts.core.services.BTSProjectService;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.EventTopic;
import org.eclipse.e4.core.di.extensions.Preference;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.services.IServiceConstants;

/** This Controller is "passively" listening to changes in active selection or authenticated user.
 * If a change occurs, it processes all relevant core expressions and modifies them if need.
 * @author plutte
 *
 */
public class PermissionsAndExpressionsEvaluationControllerImpl implements
		PermissionsAndExpressionsEvaluationController {

	@Inject
	private IEventBroker eventBroker;
	
	private static final String FALSE = "false";

	private static final String TRUE = "true";

	private static final long LOCKING_DELAY = 600;

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
	@Preference(value = BTSPluginIDs.PREF_MAIN_CORPUS_KEY, nodePath = "org.bbaw.bts.app")
	private String main_corpus_key;

	@Inject
	@Optional
	@Preference(value = BTSPluginIDs.PREF_MAIN_PROJECT_KEY, nodePath = "org.bbaw.bts.app")
	private String main_project_key;
	
	@Inject
	private BTSEvaluationService evaluationService;
	
	private Object loadedObject;

	private IEclipseContext workbenchContext;

	private String userContextRole;

	private boolean otherLocked;

	private boolean hasLock = false;

	private Set<Object> deselectedQueue = new HashSet<Object>();

	@Inject
	private BTSProjectService projecService;

	private List<BTSProject> allProjects;


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
			@Optional @Named(IServiceConstants.ACTIVE_SELECTION) final Object sel) {
		if (sel != null && sel instanceof BTSDBBaseObject
				&& !sel.equals(this.selection)) {
			processDeselection(this.selection);
			this.selection = sel;
			delayedSetSelection((BTSDBBaseObject) selection);
			
			
		}
	}

	private void delayedSetSelection(final BTSDBBaseObject jobSelection) {
		Job job = new Job("Acquire Lock") {

			@Override
			protected IStatus run(IProgressMonitor monitor) {
				if (selection != null && selection instanceof BTSDBBaseObject) {
					synchronized (selection) {

						if (!((BTSDBBaseObject)selection).isLocked()) {
							internalSetSelection(selection);
						}
					}
				}

				return Status.OK_STATUS;
			}

		};
		job.schedule(LOCKING_DELAY);

	}

	protected void internalSetSelection(Object internalSelection) {
		evaluateDbContext(internalSelection);
		if (evaluationService.acquireLockOptimistic(internalSelection))
		{
			otherLocked = false;
		}
		else
		{
			otherLocked = true;
		}
		hasLock = otherLocked;
		evaluateSelectionPermissionsAndExpressions(internalSelection);
		
	}

	private void evaluateDbContext(Object internalSelection) {
		if (internalSelection instanceof BTSDBBaseObject)
		{
			if (dbCollectionContext == null 
					|| !dbCollectionContext.equals(((BTSDBBaseObject) internalSelection).getDBCollectionKey()))
			{
				setDBCollectionContext(((BTSDBBaseObject) internalSelection).getDBCollectionKey());
			}
		}
		
	}

	private void setDBCollectionContext(String dbCollectionKey) {
		this.dbCollectionContext = dbCollectionKey;
		
	}

	private void processDeselection(Object object) {
		evaluationService.unlock(object);
		
	}

	private void evaluateSelectionPermissionsAndExpressions(Object internalSelection) {
		evaluateUserContextRole();

		evaluateMayAdd(internalSelection);
		evaluateMayDelete(internalSelection);
		evaluateMayEdit(internalSelection);
		evaluateMayTranscribe(internalSelection);
		evaluateMayAnnotate(internalSelection);
		evaluateMayComment(internalSelection);
		

	}


	private void evaluateUserPermissionsAndExpressions() {
		evaluateMayMasterEditConfig();
		evaluateMayEditConfig();
		evaluateMayEditUsers();
		evaluateMayEditPermissions();
		evaluateMayOpenFuton();
		evaluateMayCreateDBCollection();
		evaluateMayEditProjects();
	}
	
	private boolean evaluateMayEditProjects() {
		boolean may = false;
		if (authenticatedUser == null  || mainProject == null) {
			may = false;
		} else {
			may = evaluationService.authenticatedUserIsDBAdmin(false);
		}
		workbenchContext.modify(BTSCoreConstants.CORE_EXPRESSION_MAY_EDIT_PROJECTS,
				new Boolean(may));
		return may;
	}

	private boolean evaluateMayCreateDBCollection() {
		boolean may = false;
		if (authenticatedUser == null || mainProject == null) {
			may = false;
		} else {
			may = evaluationService.authenticatedUserIsDBAdmin(false);
		}
		workbenchContext.modify(BTSCoreConstants.CORE_EXPRESSION_MAY_CREATE_DBCOLLECTION,
				new Boolean(may));
		return may;
	}

	private boolean evaluateMayTranscribe(Object internalSelection) {
		boolean may = !otherLocked;
		if (may)
		{
			may = evaluateMayTranscribeInteral(internalSelection);
		}

		workbenchContext.modify(BTSCoreConstants.CORE_EXPRESSION_MAY_TRANSCRIBE,
				new Boolean(may));
		if (!may)
		{
//			StatusMessage m = BtsviewmodelFactory.eINSTANCE.createNotEditingRightsMessage();
//			eventBroker.post("status_info/filtered", m);
		}
		return may;
	}

	private boolean evaluateMayTranscribeInteral(Object internalSelection) {
		if (authenticatedUser == null || internalSelection == null
				|| !(internalSelection instanceof BTSDBBaseObject)) {
			return false;
		} 
		else {
			if (evaluateUserContextRoleDisallowsTranscribing()) {
				return false;
			}
			if (userRoleMayEdit()
					|| evaluationService.authenticatedUserIsMember(((BTSDBBaseObject) internalSelection).getUpdaters())) {
				return true;
			}
		}
		return false;
	}

	private boolean evaluateUserContextRoleDisallowsTranscribing() {
		if (userContextRole == null 
				|| userContextRole.equals(BTSCoreConstants.USER_ROLE_GUESTS))
		{
			return true;
		}
		return false;
	}

	private void evaluateUserContextRole() {
	private void evaluateUserContextRole(Object internalSelection) {
		userContextRole = BTSCoreConstants.USER_ROLE_GUESTS;
		if (authenticatedUser == null || mainProject == null) {

		} else {
			BTSProjectDBCollection projectCollection = findProjectCollection(dbCollectionContext);
			userContextRole = evaluationService.highestRoleOfAuthenticatedUserInDBCollection(projectCollection);
		}
		workbenchContext.modify(
				BTSCoreConstants.CORE_EXPRESSION_USER_CONTEXT_ROLE,
				userContextRole);
	}

	
	private BTSProjectDBCollection findProjectCollection(
			String dbCollectionName) {
		return projecService.findProjectCollection(dbCollectionName);
	}

	
	private boolean evaluateMayOpenFuton() {
		boolean may = false;
		if (authenticatedUser == null) {
			may = false;
		} else {
			may = evaluationService.authenticatedUserIsDBAdmin(true);
		}
		workbenchContext.modify(BTSCoreConstants.CORE_EXPRESSION_MAY_EDIT_USERS,
				new Boolean(may));
		return may;

	}

	private boolean evaluateMayEditPermissions() {
		boolean may = false;
		if (authenticatedUser == null  || mainProject == null) {
			may = false;
		} else if(evaluationService.authenticatedUserIsDBAdmin(true)) {
			may = true;
		} else {
			String userAdminDBRole = null;
			for (BTSProjectDBCollection c : mainProject.getDbCollections()) {
				if (c.getCollectionName() != null
						&& c.getCollectionName().equals("admin")) {
					userAdminDBRole = evaluationService.highestRoleOfAuthenticatedUserInDBCollection(c);
					break;
				}
			}
			if ("admins".equals(userAdminDBRole)) {
				may = true;
			}
		}
		workbenchContext.modify(BTSCoreConstants.CORE_EXPRESSION_MAY_EDIT_USERS,
				new Boolean(may));
		return may;

	}

	private boolean evaluateMayEditUsers() {
		boolean may = false;
		if (authenticatedUser == null  || mainProject == null) {
			may = false;
		} else if(evaluationService.authenticatedUserIsDBAdmin(true)) {
			may = true;
		} else {
			String userAdminDBRole = null;
			for (BTSProjectDBCollection c : mainProject.getDbCollections()) {
				if (c.getCollectionName() != null
						&& c.getCollectionName().equals("admin")) {
					userAdminDBRole = evaluationService.highestRoleOfAuthenticatedUserInDBCollection(c);
					break;
				}
			}
			if ("admins".equals(userAdminDBRole)) {
				may = true;
			}
		}
		workbenchContext.modify(BTSCoreConstants.CORE_EXPRESSION_MAY_EDIT_USERS,
				new Boolean(may));
		return may;

	}

	private boolean evaluateMayMasterEditConfig() {
		boolean may = false;
		if (authenticatedUser == null || mainProject == null) {
			may = false;
		} else if(evaluationService.authenticatedUserIsDBAdmin(false)) {
			may = true;
		} else {
			String userAdminDBRole = null;
			for (BTSProjectDBCollection c : mainProject.getDbCollections()) {
				if (c.getCollectionName() != null
						&& c.getCollectionName().equals(mainProject.getPrefix() + "_admin")) {
					userAdminDBRole = evaluationService.highestRoleOfAuthenticatedUserInDBCollection(c);
					break;
				}
			}
			if ("admins".equals(userAdminDBRole)) {
				may = true;
			}
		}
		workbenchContext.modify(BTSCoreConstants.CORE_EXPRESSION_MAY_MASTER_EDIT_CONFIG,
				new Boolean(may));
		return may;

	}

	private boolean evaluateMayEditConfig() {
		boolean may = false;
		if (authenticatedUser == null || mainProject == null) {
			may = false;
		} else if(evaluationService.authenticatedUserIsDBAdmin(false)) { // check if user is local admin, not remote which would require remote access
			may = true;
		} else {
			String userAdminDBRole = null;
			for (BTSProjectDBCollection c : mainProject.getDbCollections()) {
				if (c.getCollectionName() != null
						&& c.getCollectionName().equals(mainProject.getPrefix() + "_admin")) {
					userAdminDBRole = evaluationService.highestRoleOfAuthenticatedUserInDBCollection(c);
					break;
				}
			}
			if ("admins".equals(userAdminDBRole) || "editors".equals(userAdminDBRole)) {
				may = true;
			}
		}
		workbenchContext.modify(BTSCoreConstants.CORE_EXPRESSION_MAY_EDIT_CONFIG,
				new Boolean(may));
		return may;

	}

	private boolean evaluateMayComment(Object internalSelection) {
		return false;
		//FIXME evaluate may comment
	}

	private boolean evaluateMayAnnotate(Object internalSelection) {
		return false;
		//FIXME evaluate may annotate

	}

	private boolean evaluateMayEdit(Object internalSelection) {
		boolean may = !otherLocked;
		if (may)
		{
			may = evaluateMayEditInteral(internalSelection);
		}

		workbenchContext.modify(BTSCoreConstants.CORE_EXPRESSION_MAY_EDIT,
				new Boolean(may));
		if (!may)
		{
			StatusMessage m = BtsviewmodelFactory.eINSTANCE.createNotEditingRightsMessage();
			eventBroker.post("status_info/filtered", m);
		}
		return may;

	}

	private boolean evaluateMayEditInteral(Object internalSelection) {
		if (authenticatedUser == null || internalSelection == null  || mainProject == null
				|| !(internalSelection instanceof BTSDBBaseObject)) {
			return false;
		} 
		else {
			if (evaluateUserContextRoleDisallowsEditing()) {
				return false;
			}
			if (userRoleMayEdit()
					|| evaluationService.authenticatedUserIsMember(((BTSDBBaseObject) internalSelection).getUpdaters())) {
				return true;
			}
		}
		return false;
	}

	private boolean evaluateUserContextRoleDisallowsEditing() {
		if (userContextRole == null 
				|| userContextRole.equals(BTSCoreConstants.USER_ROLE_GUESTS)
				|| userContextRole.equals(BTSCoreConstants.USER_ROLE_TRANSCRIBERS))
		{
			return true;
		}
		return false;
	}

	@Override
	public boolean authenticatedUserMayEditObject(BTSObject object) {

		//FIXME check if object is locked
		return evaluateMayEditInteral(object);
	}
	private boolean userRoleMayEdit() {
		return (userContextRole != null && (userContextRole
				.equals(BTSCoreConstants.USER_ROLE_ADMINS) || userContextRole
				.equals(BTSCoreConstants.USER_ROLE_EDITORS)));
	}

	

	private boolean evaluateMayDelete(Object internalSelection) {
		boolean may = false;
		if (otherLocked || authenticatedUser == null || internalSelection == null  || mainProject == null
				|| !(internalSelection instanceof BTSDBBaseObject)) {
			may = false;
		} else {
			if (userRoleMayEdit()
					|| evaluationService.authenticatedUserIsMember(((BTSDBBaseObject) internalSelection).getUpdaters())) {
				may = true;
			}
		}
		workbenchContext.modify(BTSCoreConstants.CORE_EXPRESSION_MAY_DELETE,
				new Boolean(may));
		return may;

	}

	private boolean evaluateMayAdd(Object internalSelection) {
		return false;
		//FIXME evaluate may add

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
			evaluateSelectionPermissionsAndExpressions(selection);
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
			evaluateSelectionPermissionsAndExpressions(selection);
			evaluateUserPermissionsAndExpressions();
		}

	}


	@Override
	public void activateDBCollectionContext(String key) {
		if (key != null) {
			String localDBCollContext = null;
			switch (key) {
			case BTSPluginIDs.PREF_MAIN_CORPUS_KEY: {
				localDBCollContext = main_corpus_key;
				break;
			}
			case "corpus": {
				localDBCollContext = main_corpus_key;
				break;
			}
			case BTSCoreConstants.MAIN_WORD_LIST: {
				localDBCollContext = main_project_key + "_wlist";

				break;
			}
			default:
				break;
			}
			//FIXME ist das immer noch notwendig?
//			if (localDBCollContext != null
//					&& !localDBCollContext.equals(dbCollectionContext)) {
//				dbCollectionContext = localDBCollContext;
//				workbenchContext.modify(
//						BTSCoreConstants.CURRENT_DB_COLLECTION_CONTEXT,
//						dbCollectionContext);
//				evaluateSelectionPermissionsAndExpressions(selection);
//			}
		}

	}

	/** Should be called if the locked satuts of an object locked by another user changes.
	 * eg. when the object is unlocked by former lock owner.
	 * Only if the given object is the ACTIVE_SELECTION this method will trigger the 
	 * recalculation of core expressions - it will make the newly unlocked object editable to the user.
	 * @param lease the given lease on the object or null if not locked.
	 */
	@Inject
	@Optional
	public void eventReceivedLockStatusUpdate(@EventTopic("locking_status_update/*") DBLease lease)
	{
		if (lease instanceof DBLease)
		{
			// object is locked
			if (selection != null
					&& selection.equals(((DBLease) lease).getObject())
					&& !hasLock) {
				evaluateSelectionPermissionsAndExpressions(selection);
				hasLock = true;
			}
		} else {
			// object is locked
			if (selection != null
					&& selection.equals(((DBLease) lease).getObject())
					&& hasLock) {
				otherLocked = false;
				evaluateSelectionPermissionsAndExpressions(selection);
				hasLock = false;
			}
		}
	}

	@Override
	public boolean authenticatedUserIsDBAdmin(boolean remoteDBAdmin) {
		return evaluationService.authenticatedUserIsDBAdmin(remoteDBAdmin);
	}

	@Override
	public boolean authenticatedUserMaySyncDBColl(String dbCollectionName) {
		return evaluationService.authenticatedUserMaySyncDBColl(dbCollectionName);
	}


	@Override
	public boolean userMayEditObject(BTSUser user, Object object) {
		if (user == null || object == null
				|| !(object instanceof BTSDBBaseObject)) {
			return false;
		} else {
			if (userRoleMayEdit(user, (BTSDBBaseObject) object)
					|| evaluationService.userIsMember(user, ((BTSDBBaseObject) object).getUpdaters())) {
				return true;
			}
		}
		return false;
		
	}

	private boolean userRoleMayEdit(BTSUser user, BTSDBBaseObject object) {
		String localUserContextRole = BTSCoreConstants.USER_ROLE_GUESTS;
		if (user == null || object == null) {

		} else {
			for (BTSProject project : getAllProjects())
			{
				if (project.getPrefix() != null && project.getPrefix().equals(object.getProject()))
				{
					for (BTSProjectDBCollection c : project.getDbCollections()) {
						if (c.getCollectionName() != null
								&& c.getCollectionName().equals(object.getDBCollectionKey())) {
							localUserContextRole = evaluationService.highestRoleOfUserInDBCollection(user, c);
							break;
						}
					}
				}
			}
		}
		return (localUserContextRole != null && (localUserContextRole
				.equals(BTSCoreConstants.USER_ROLE_ADMINS) || localUserContextRole
				.equals(BTSCoreConstants.USER_ROLE_EDITORS)));
	}

	private List<BTSProject> getAllProjects() {
		if (allProjects == null)
		{
			allProjects = projecService.list(BTSConstants.OBJECT_STATE_ACTIVE, null);
		}
		return allProjects;
	}

	@Override
	public boolean authenticatedUserMayAddToDBCollection(
			BTSProjectDBCollection dbCollection) {
		String localUserContextRole = evaluationService.highestRoleOfUserInDBCollection(authenticatedUser, dbCollection);
		return (localUserContextRole != null && (localUserContextRole
				.equals(BTSCoreConstants.USER_ROLE_ADMINS) || localUserContextRole
				.equals(BTSCoreConstants.USER_ROLE_EDITORS)));
	}

	@Override
	public boolean authenticatedUserMayDeleteProject(BTSProject project) {
		if (!authenticatedUserIsDBAdmin(true))
		{
			return false;
		}
		// TODO more rights logic 
		return (evaluateMayEditInteral(project));
	}

	@Override
	public boolean authenticatedUserMayDeleteUserOrUserGroup(BTSObject object) {
		if (!authenticatedUserIsDBAdmin(true))
		{
			return false;
		}
		// TODO more rights logic 
		return (evaluateMayEditInteral(object));
	}
}
