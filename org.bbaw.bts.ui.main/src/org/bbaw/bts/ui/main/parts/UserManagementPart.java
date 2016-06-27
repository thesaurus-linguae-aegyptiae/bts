package org.bbaw.bts.ui.main.parts;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.btsmodel.BTSDBCollectionRoleDesc;
import org.bbaw.bts.btsmodel.BTSIdentifiableItem;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.BTSProject;
import org.bbaw.bts.btsmodel.BTSProjectDBCollection;
import org.bbaw.bts.btsmodel.BTSUser;
import org.bbaw.bts.btsmodel.BTSUserGroup;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.btsmodel.BtsmodelPackage;
import org.bbaw.bts.btsviewmodel.BtsviewmodelFactory;
import org.bbaw.bts.btsviewmodel.BtsviewmodelPackage;
import org.bbaw.bts.btsviewmodel.TreeNodeWrapper;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.commons.BTSPluginIDs;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.controller.dialogControllers.UserManagerController;
import org.bbaw.bts.core.controller.generalController.BTSProjectController;
import org.bbaw.bts.core.controller.generalController.BTSUserController;
import org.bbaw.bts.core.controller.generalController.EditingDomainController;
import org.bbaw.bts.core.controller.generalController.PermissionsAndExpressionsEvaluationController;
import org.bbaw.bts.searchModel.BTSQueryResultAbstract;
import org.bbaw.bts.ui.commons.controldecoration.BackgroundControlDecorationSupport;
import org.bbaw.bts.ui.commons.utils.BTSUIConstants;
import org.bbaw.bts.ui.commons.validator.StringEmailAddressValidator;
import org.bbaw.bts.ui.commons.validator.StringHttp_s_URLValidator;
import org.bbaw.bts.ui.commons.validator.StringNotEmptyValidator;
import org.bbaw.bts.ui.commons.viewerSorter.BTSUserManagerViewerComparator;
import org.bbaw.bts.ui.main.dialogs.ObjectUpdaterReaderEditorDialog;
import org.bbaw.bts.ui.main.handlers.CreateNewUserGroupHandler;
import org.bbaw.bts.ui.main.parts.userMan.support.ProjectDBCollectionTreeFactory;
import org.bbaw.bts.ui.main.parts.userMan.support.ProjectDBCollectionTreeStructureAdvisor;
import org.bbaw.bts.ui.main.wizards.newProject.EditDBCollectionDialog;
import org.bbaw.bts.ui.resources.BTSResourceProvider;
import org.eclipse.core.commands.ParameterizedCommand;
import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.list.WritableList;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.e4.core.commands.ECommandService;
import org.eclipse.e4.core.commands.EHandlerService;
import org.eclipse.e4.core.contexts.Active;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.EventTopic;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.di.Persist;
import org.eclipse.e4.ui.di.UISynchronize;
import org.eclipse.e4.ui.model.application.ui.MDirtyable;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.EMFUpdateValueStrategy;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.emf.databinding.edit.EMFEditProperties;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.databinding.viewers.ObservableListContentProvider;
import org.eclipse.jface.databinding.viewers.ObservableListTreeContentProvider;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;
import org.eclipse.swt.widgets.Tree;

public class UserManagementPart
{

	@Inject
	private UserManagerController userManagerController;

	@Inject
	private UISynchronize sync;

	@Inject
	private ECommandService commandService;

	@Inject
	private EHandlerService handlerService;

	@Inject
	private BTSProjectController projectController;

	@Inject
	private EditingDomainController editingDomainController;

	@Inject
	private BTSResourceProvider resourceProvider;
	
	@Inject
	private BTSUserController userController;

	@Inject
	private PermissionsAndExpressionsEvaluationController permissionController;

	@Inject
	private IEclipseContext context;
	
	@Inject
	@Active
	private Shell shell;

	
	private Text textName_Group;
	private Text textType_Group;
	private Text textComment_Group;
	private Text textForeName_User;
	private Text textSurName_User;
	private Text textEmail_User;
	private Text textWebsite_User;
	private Text textDesc_User;
	private Text textWebDesc_User;
	private Text textSigle_User;
	private Text textComment_User;
	private Text textUserName_User;
	private Text textPassword_User;
	private Tree user_tree;
	private TreeViewer user_treeViewer;
	private Composite composite_right;
	protected StructuredSelection selection;
	private List<BTSUserGroup> userGroups;
	private TreeNodeWrapper user_root;
	private BTSUser selectedUser;
	private BTSUserGroup selectedGroup;
	private SashForm user_sashForm;
	private BTSIdentifiableItem selectedTreeObject;
	private Map<String, BTSQueryResultAbstract> queryResultMap = new HashMap<String, BTSQueryResultAbstract>();

	private ISelectionChangedListener user_selectionListener;
	private TreeNodeWrapper selectedTreeNode;

	private TabFolder tabFolder;

	private TabItem user_tabItem;

	private TabItem roles_tabItem;

	private Composite user_composite;

	private Composite roles_composite;

	private DataBindingContext user_group_bindingContext;

	private Text labelId_Group;

	private Text textCreateNewUser_Group;

	private DataBindingContext user_bindingContext;

	private Text labelId_User;

	private ToolItem user_ToolcreateGroup;

	private ToolItem user_ToolDeleteGroup;

	private ToolItem user_ToolUndo;

	private ToolItem user_ToolRedo;

	private Adapter globalChangeListener;

	private Link linkCreateNewUser_Group;
	private Composite composite;
	private SashForm roles_sashForm;

	private Composite roles_composite_Left;

	private TreeViewer roles_treeViewer;

	private Composite roles_composite_right;

	private ISelectionChangedListener roles_selectionListener;

	private BTSProject selectedProject;

	private BTSProjectDBCollection selectedDBCollection;

	private List<BTSProject> projects;

	private WritableList roles_list;
	private Label lblProject;
	private Label lblProjectId;
	private Text roles_project_id_text;
	private Label lblProjectName;
	private Text roles_project_name_text;
	private Label lblProjectPrefix;
	private Text roles_project_prefix_text;
	private Label lblDescription_1;
	private Text roles_project_desc_text;
	private Link roles_project_addColl_link;

	private DataBindingContext project_bindingContext;

	private Text roles_project_Connectiontype;

	private Text roles_project_remote_url;

	private Text roles_project_textdbPath;

	private Set<BTSUser> dirtyUsers = new HashSet<>();

	private Set<BTSUserGroup> dirtyUserGroups = new HashSet<>();

	private Set<BTSProject> dirtyProjects = new HashSet<>();
	private Label lblDatabaseCollection;
	private Label lblDbCollectionName;
	private Text roles_dbColl_name_text;
	private Button roles_dbColl_sync_btn;
	private Button roles_dbColl_index_btn;
	private Link roles_dbColl_newRoles_link;
	private Label lblCreateNewRoles;
	private DataBindingContext dbColl_bindingContext;
	private Label lblUserRoleDefinition;
	private Label lblRoleName;
	private Text roles_rolesDesc_name_text;
	private Link roles_roleDesc_assignUser_link;
	private Group grpAssignUserGroup;
	private Label lblSelectUserGroup;
	private ComboViewer roles_rolesDesc_group_comboViewer;
	private Link roles_roleDesc_assignGroup_link;

	private BTSDBCollectionRoleDesc selectedDBRoleDesc;

	private DataBindingContext dbRoleDesc_bindingContext;

	private ComboViewer roles_rolesDesc_users_comboViewer;

	private ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(
			ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

	private WritableList observableLisAllUsers;

	private WritableList observableLisAllUserGroups;

	private HashMap<String, BTSUser> userMap;

	private HashMap<String, BTSUserGroup> userGroupMap;

	private Combo roles_dbColl_newRoles_combo;

	private static final String[] databaseRoles = new String[] {
			BTSCoreConstants.USER_ROLE_ADMINS,
			BTSCoreConstants.USER_ROLE_EDITORS,
			BTSCoreConstants.USER_ROLE_RESEARCHERS,
			BTSCoreConstants.USER_ROLE_TRANSCRIBERS,
			BTSCoreConstants.USER_ROLE_GUESTS };

	private static final String[] databaseRolesDescs = new String[] {
			BTSCoreConstants.USER_ROLE_ADMINS
					+ " = Administrator. Administrators may edit or delete all objects even if no special rights for a very objects were granted to them. Thus they can also clean up the database. Administrators are the only users who are allowed to manage other users, user group membershibs and roles. Administrators are also the only users who may edit the configuration.",
			BTSCoreConstants.USER_ROLE_EDITORS
					+ " = Editors. Editors may review and correct objects owned by other users even if no special rights for a very object were granted to them. Thus they can review and improve the quality of the data.",
			BTSCoreConstants.USER_ROLE_RESEARCHERS
					+ " = Researcher. Researcher may create new objects and edit or delete their own objects but only their own or objects for which they were granted editing rights.",
			BTSCoreConstants.USER_ROLE_TRANSCRIBERS
					+ " = users who are allowed to transcribe a text. They may not create new objects and may not change anything except adding transcribtion to text for which they are granted update rights.",
			BTSCoreConstants.USER_ROLE_GUESTS
					+ " = Guest. Guests may read data but not create new objects or edit or delete anything." };

	private HashMap<String, String> roleDescMap;
	private Label lblUser_1;
	private Label lblForename_1;
	private Text roles_user_forename_text;
	private Label lblSurname;
	private Text roles_user_surname_text;
	private Label lblUserGroup_1;
	private Label lblGroupName;
	private Text text;
	private Link roles_group_removeGroupfromRole_link;

	private ToolItem roles_ToolcreateProject;

	private ToolItem roles_ToolDeleteProject;

	private ToolItem roles_ToolUndo;

	private ToolItem roles_ToolRedo;

	private Link roles_roleDesc_removeRoleDesc_link;

	private Text textCreateNewUserPassword_Group;

	private Button btnDBAdmin_User;

	private ToolItem user_ToolUpdaters;

	private ToolItem roles_ToolUpdaters;

	private ComboViewer users_groupMembers_groups_comboViewer;

	private Link users_addGroupMembers_groups_link;

	private CTabFolder user_tabFolder;

	private CTabItem user_mainTabItem;

	private Composite user_mainTabItemComp;

	private CTabItem user_binTabItem;

	private Composite user_binTabItemComp;

	private TreeViewer user_bintreeViewer;

	private TreeNodeWrapper user_binRoot;

	private TreeNodeWrapper user_orphanNode;



	public UserManagementPart()
	{
	}

	/**
	 * Create contents of the dialog.
	 * 
	 * @param parent
	 */
	@PostConstruct
	public void createControls(Composite parent)
	{
		init();

		Composite container = new Composite(parent, SWT.NONE);
		container.setLayoutData(new GridData(GridData.FILL_BOTH)); // ########
																	// cp:
																	// aukommentiert
																	// für
																	// windowbuilder
		container.setLayout(new FillLayout(SWT.HORIZONTAL));

		tabFolder = new TabFolder(container, SWT.NONE);

		/////////////////users
		user_tabItem = new TabItem(tabFolder, SWT.NONE);
		user_tabItem.setText("Manage Users and User Groups");

		user_composite = new Composite(tabFolder, SWT.NONE);
		user_tabItem.setControl(user_composite);
		GridLayout gl_user_composite = new GridLayout(1, true);
		gl_user_composite.marginHeight = 0;
		gl_user_composite.verticalSpacing = 0;
		user_composite.setLayout(gl_user_composite);

		Composite user_compositeToolbar = new Composite(user_composite, SWT.NONE);
		user_compositeToolbar.setLayout(new RowLayout(SWT.HORIZONTAL));

		ToolBar toolBar = new ToolBar(user_composite, SWT.FLAT | SWT.RIGHT);
		user_ToolcreateGroup = new ToolItem(toolBar, SWT.NONE);
		user_ToolcreateGroup.setToolTipText("New Group");
		user_ToolcreateGroup.setImage(resourceProvider.getImage(
				Display.getDefault(), BTSResourceProvider.IMG_USERS_ADD));
		user_ToolcreateGroup.addSelectionListener(new SelectionAdapter()
		{

			@Override
			public void widgetSelected(SelectionEvent e)
			{
				//				Command command = commandService.getCommand(BTSPluginIDs.CMD_ID_NEW_USERGROUP);

				// Activate Handler
				handlerService.activateHandler(BTSPluginIDs.CMD_ID_NEW_USERGROUP, new CreateNewUserGroupHandler());

				ParameterizedCommand cmd = commandService.createCommand(BTSPluginIDs.CMD_ID_NEW_USERGROUP, null);
				//				command = commandService.getCommand(BTSPluginIDs.CMD_ID_NEW_USERGROUP);

				handlerService.executeHandler(cmd);

			}
		});

		user_ToolDeleteGroup = new ToolItem(toolBar, SWT.NONE);
		user_ToolDeleteGroup.setToolTipText("Delete");
		user_ToolDeleteGroup.setImage(resourceProvider.getImage(
				Display.getDefault(), BTSResourceProvider.IMG_DELETE));
		user_ToolDeleteGroup.setEnabled(false);
		user_ToolDeleteGroup.addSelectionListener(new SelectionAdapter()
		{

			@Override
			public void widgetSelected(SelectionEvent e)
			{
				selection = (StructuredSelection) user_treeViewer.getSelection();
				if (selection.getFirstElement() instanceof TreeNodeWrapper)
				{
					TreeNodeWrapper tn = (TreeNodeWrapper) selection.getFirstElement();
					deleteUserOrGroup(tn);
				}

			}
		});

		user_ToolUndo = new ToolItem(toolBar, SWT.NONE);
		user_ToolUndo.setToolTipText("Undo");
		user_ToolUndo.setImage(resourceProvider.getImage(Display.getDefault(),
				BTSResourceProvider.IMG_UNDO));
		user_ToolUndo.addSelectionListener(new SelectionAdapter()
		{

			@Override
			public void widgetSelected(SelectionEvent e)
			{
				getEditingDomain(selectedTreeObject).getCommandStack().undo();

			}
		});

		user_ToolRedo = new ToolItem(toolBar, SWT.NONE);
		user_ToolRedo.setToolTipText("Redo");
		user_ToolRedo.setImage(resourceProvider.getImage(Display.getDefault(),
				BTSResourceProvider.IMG_REDO));
		user_ToolRedo.addSelectionListener(new SelectionAdapter()
		{

			@Override
			public void widgetSelected(SelectionEvent e)
			{
				getEditingDomain(selectedTreeObject).getCommandStack().redo();

			}
		});
		
		user_ToolUpdaters = new ToolItem(toolBar, SWT.NONE);
		user_ToolUpdaters.setToolTipText("Edit updaters of selected database object.");
		user_ToolUpdaters.setImage(resourceProvider.getImage(Display.getDefault(),
				BTSResourceProvider.IMG_USERROLE_EDIT));
		user_ToolUpdaters.addSelectionListener(new SelectionAdapter()
		{

			@Override
			public void widgetSelected(SelectionEvent e)
			{
				selection = (StructuredSelection) user_treeViewer.getSelection();
				if (selection.getFirstElement() instanceof TreeNodeWrapper)
				{
					TreeNodeWrapper tn = (TreeNodeWrapper) selection.getFirstElement();
					if (tn.getObject() != null && tn.getObject() instanceof BTSDBBaseObject)
					{
						editUpdaters((BTSDBBaseObject) tn.getObject());
					}
				}
				

			}
		});

		user_sashForm = new SashForm(user_composite, SWT.NONE);
		user_sashForm.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
		user_tabFolder = new CTabFolder(user_sashForm, SWT.None);
		user_tabFolder.setSimple(false);
		user_tabFolder.setLayoutData(new GridData(GridData.FILL_BOTH));
		
		user_tabFolder.addSelectionListener(new SelectionAdapter() {
			

			@Override
			public void widgetSelected(SelectionEvent e) {
				CTabItem ti = user_tabFolder.getSelection();
				Object o = ti.getData("key");
				Object o2 = ti.getData("loaded");
				boolean loaded = false;
				if (o2 != null && (boolean) o2)
				{
					loaded = true;
				}
				if (o != null && o instanceof String)
				{
					if (((String)o).equals("bin"))
					{
						if (!loaded)
						{
							loadBinUserTreeInput(user_bintreeViewer, user_binTabItem);
							// ti.setData("loaded", true);
						}
						
					}
				}
				
			}
		});

		// create main tab item
		user_mainTabItem = new CTabItem(user_tabFolder, SWT.NONE);
		user_mainTabItem.setImage(resourceProvider.getImage(Display.getDefault(),
				BTSResourceProvider.IMG_USERS));
		user_mainTabItem.setText("Active Users");
		user_mainTabItem.setData("key", "main");

		Composite composite_left = new Composite(user_tabFolder, SWT.NONE);
		composite_left.setLayout(new GridLayout());
		((GridLayout) composite_left.getLayout()).marginHeight = 0;
		((GridLayout) composite_left.getLayout()).marginWidth = 0;

		user_mainTabItem.setControl(composite_left);

		composite_left.setLayout(new GridLayout(2, false));

		Label lblUserGroups = new Label(composite_left, SWT.NONE);
		lblUserGroups.setText("User Groups");
		new Label(composite_left, SWT.NONE);

		user_tree = new Tree(composite_left, SWT.BORDER);
		user_tree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
		user_treeViewer = new TreeViewer(user_tree);
		user_mainTabItem.setData("tv", user_tree);
		
		
		// create bin tab item
		user_binTabItem = new CTabItem(user_tabFolder, SWT.NONE);
		user_binTabItem.setText("Bin");
		user_binTabItem.setData("key", "bin");
		user_binTabItem.setImage(resourceProvider.getImage(Display.getDefault(),
				BTSResourceProvider.IMG_BIN));

		user_binTabItemComp = new Composite(user_tabFolder, SWT.NONE);
		user_binTabItemComp.setLayoutData(new GridData(GridData.FILL_BOTH));
		user_binTabItemComp.setLayout(new GridLayout());
		((GridLayout) user_binTabItemComp.getLayout()).marginHeight = 0;
		((GridLayout) user_binTabItemComp.getLayout()).marginWidth = 0;

		user_binTabItem.setControl(user_binTabItemComp);

		user_bintreeViewer = new TreeViewer(user_binTabItemComp);
		user_bintreeViewer.getTree().setLayoutData(new GridData(GridData.FILL_BOTH));
		user_bintreeViewer.getTree().setLayout(new GridLayout());
		user_binTabItemComp.setData("tv", user_bintreeViewer);
		

		
		composite_right = new Composite(user_sashForm, SWT.NONE);
		composite_right.setLayout(new FillLayout(SWT.HORIZONTAL));
		user_sashForm.setWeights(new int[] { 1, 1 });
		
		user_tabFolder.setSelection(user_mainTabItem);

		////////////////roles
		roles_tabItem = new TabItem(tabFolder, SWT.NONE);
		roles_tabItem.setText("Administrate User Roles and Rights");

		roles_composite = new Composite(tabFolder, SWT.NONE);
		roles_tabItem.setControl(roles_composite);
		roles_composite.setLayout(new GridLayout(1, false));

		composite = new Composite(roles_composite, SWT.NONE);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
		composite.setLayout(new RowLayout(SWT.HORIZONTAL));

		ToolBar roles_toolbar = new ToolBar(composite, SWT.FLAT | SWT.RIGHT);
		roles_ToolcreateProject = new ToolItem(roles_toolbar, SWT.NONE);
		roles_ToolcreateProject.setToolTipText("New Project");
		roles_ToolcreateProject.setImage(resourceProvider.getImage(
				Display.getDefault(), BTSResourceProvider.IMG_PROJECT_ADD));
		roles_ToolcreateProject.addSelectionListener(new SelectionAdapter()
		{

			@Override
			public void widgetSelected(SelectionEvent e)
			{
				//				Command command = commandService.getCommand(BTSPluginIDs.CMD_ID_NEW_USERGROUP);

				// Activate Handler
				handlerService.activateHandler(BTSPluginIDs.CMD_ID_NEW_USERGROUP, new CreateNewUserGroupHandler());

				ParameterizedCommand cmd = commandService.createCommand(BTSPluginIDs.CMD_ID_NEW_USERGROUP, null);
				//				command = commandService.getCommand(BTSPluginIDs.CMD_ID_NEW_USERGROUP);

				handlerService.executeHandler(cmd);

			}
		});

		roles_ToolDeleteProject = new ToolItem(roles_toolbar, SWT.NONE);
		roles_ToolDeleteProject.setToolTipText("Delete");
		roles_ToolDeleteProject.setImage(resourceProvider.getImage(
				Display.getDefault(), BTSResourceProvider.IMG_DELETE));
		roles_ToolDeleteProject.addSelectionListener(new SelectionAdapter()
		{

			@Override
			public void widgetSelected(SelectionEvent e)
			{
				StructuredSelection sel = (StructuredSelection) roles_treeViewer.getSelection();
				if (sel.getFirstElement() instanceof TreeNodeWrapper)
				{
					TreeNodeWrapper tn = (TreeNodeWrapper) sel.getFirstElement();
					deleteRolesTreeObject(tn);

				}
			}
		});

		roles_ToolUndo = new ToolItem(roles_toolbar, SWT.NONE);
		roles_ToolUndo.setToolTipText("Undo");
		roles_ToolUndo.setImage(resourceProvider.getImage(Display.getDefault(),
				BTSResourceProvider.IMG_UNDO));
		roles_ToolUndo.addSelectionListener(new SelectionAdapter()
		{

			@Override
			public void widgetSelected(SelectionEvent e)
			{
				getEditingDomain(selectedTreeObject).getCommandStack().undo();

			}
		});

		roles_ToolRedo = new ToolItem(roles_toolbar, SWT.NONE);
		roles_ToolRedo.setToolTipText("Redo");
		roles_ToolRedo.setImage(resourceProvider.getImage(Display.getDefault(),
				BTSResourceProvider.IMG_REDO));
		roles_ToolRedo.addSelectionListener(new SelectionAdapter()
		{

			@Override
			public void widgetSelected(SelectionEvent e)
			{
				getEditingDomain(selectedTreeObject).getCommandStack().redo();

			}
		});
		
		roles_ToolUpdaters = new ToolItem(roles_toolbar, SWT.NONE);
		roles_ToolUpdaters.setToolTipText("Edit updaters of selected database object.");
		roles_ToolUpdaters.setImage(resourceProvider.getImage(Display.getDefault(),
				BTSResourceProvider.IMG_USERROLE_EDIT));
		roles_ToolUpdaters.addSelectionListener(new SelectionAdapter()
		{

			@Override
			public void widgetSelected(SelectionEvent e)
			{
				StructuredSelection sel = (StructuredSelection) roles_treeViewer.getSelection();
				if (sel.getFirstElement() instanceof TreeNodeWrapper)
				{
					TreeNodeWrapper tn = (TreeNodeWrapper) sel.getFirstElement();
					if (tn.getObject() != null && tn.getObject() instanceof BTSDBBaseObject)
					{
						editUpdaters((BTSDBBaseObject) tn.getObject());
					}
				}
				

			}
		});
		
		roles_sashForm = new SashForm(roles_composite, SWT.NONE);
		roles_sashForm.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				true, 1, 1));

		roles_composite_Left = new Composite(roles_sashForm, SWT.NONE);
		roles_composite_Left.setLayout(new GridLayout(1, false));

		Label lblDatabaseCollectionsAnd = new Label(roles_composite_Left, SWT.NONE);
		lblDatabaseCollectionsAnd.setText("Database collections and associated users and their editing rights");

		Label lblFirstLevelProjects = new Label(roles_composite_Left, SWT.NONE);
		lblFirstLevelProjects
				.setText("1st Level: Projects, 2nd: DB Collections, 3rd: User Roles, 4th: User");

		roles_treeViewer = new TreeViewer(roles_composite_Left, SWT.BORDER);
		Tree roles_tree = roles_treeViewer.getTree();
		roles_tree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

		roles_composite_right = new Composite(roles_sashForm, SWT.NONE);
		roles_composite_right.setLayout(new GridLayout(2, false));

		roles_sashForm.setWeights(new int[] { 1, 1 });
		loadUserTree();
		user_mainTabItem.setData("loaded", true);

		loadRolesTree();
		parent.layout();
		parent.pack();
	}

	private void loadBinUserTreeInput(final TreeViewer treeViewer, final CTabItem tabitem) {
		AdapterFactoryLabelProvider labelProvider = new AdapterFactoryLabelProvider(adapterFactory);
		AdapterFactoryContentProvider contentProvider = new AdapterFactoryContentProvider(adapterFactory);
		treeViewer.setContentProvider(contentProvider);
		treeViewer.setLabelProvider(labelProvider);
		user_selectionListener = new ISelectionChangedListener()
		{

			@Override
			public void selectionChanged(SelectionChangedEvent event)
			{
				selection = (StructuredSelection) event.getSelection();
				if (selection.getFirstElement() instanceof TreeNodeWrapper)
				{
					selectedTreeNode = (TreeNodeWrapper) selection.getFirstElement();
				}
				handleUserTreeSelection(selection, treeViewer);

			}

		};

		treeViewer.addSelectionChangedListener(user_selectionListener);
		treeViewer.setComparator(new BTSUserManagerViewerComparator());
		
		// Create sample data
		try {
			 IRunnableWithProgress op = new IRunnableWithProgress() {

					@Override
					public void run(IProgressMonitor monitor)
							throws InvocationTargetException, InterruptedException 
					{
						final List<BTSObject> terminatedUsers =  userManagerController.listTerminatedUsersUserGroups(monitor);
						sync.asyncExec(new Runnable() {
							@Override
							public void run() {
								user_binRoot = BtsviewmodelFactory.eINSTANCE.createTreeNodeWrapper();
								if (terminatedUsers != null)
								{
									for (BTSObject o : terminatedUsers)
									{
										TreeNodeWrapper child = BtsviewmodelFactory.eINSTANCE.createTreeNodeWrapper();
										child.setObject(o);
										child.setChildrenLoaded(false);
										user_binRoot.getChildren().add(child);
										user_binRoot.setChildrenLoaded(true);
									}
								}

								// Set the writeableList as input for the viewer
								treeViewer.setInput(user_binRoot);
								tabitem.setData("loaded", true);
							}
						});
					}};
		       new ProgressMonitorDialog(new Shell()).run(true, true, op);
		    } catch (InvocationTargetException e) {
		       // handle exception
		    } catch (InterruptedException e) {
		       // handle cancelation
		    }
		
		
	}

	protected void editUpdaters(BTSDBBaseObject object) {
		// TODO Auto-generated method stub
		IEclipseContext child = context.createChild();
		child.set(IServiceConstants.ACTIVE_SELECTION, object);
		ObjectUpdaterReaderEditorDialog dialog = ContextInjectionFactory.make(
				ObjectUpdaterReaderEditorDialog.class, child);
		// context.set(UserManagementDialog.class, dialog);

		if (dialog.open() == dialog.OK) {
		}
	}

	protected void deleteRolesTreeObject(TreeNodeWrapper treeNode) {
		if (treeNode.getObject() == null)
		{
			return;
		}
		Object object = treeNode.getObject();

		String dialogTitle;
		String dialogMessage;
		AdapterFactoryLabelProvider labelProvider = new AdapterFactoryLabelProvider(adapterFactory);
		if (object instanceof BTSProject)
		{
			if (!permissionController.authenticatedUserMayDeleteProject((BTSProject)object))
			{
				dialogTitle = "Deletion Not Allowed";
				dialogMessage = "You are not allowed to delete the selected project: " + labelProvider.getText(object);
				MessageDialog dialog = new MessageDialog(shell, dialogTitle, null,
					    dialogMessage, MessageDialog.INFORMATION, new String[] { "OK" }, 0);
				dialog.open();
				return;
			}
			dialogTitle = "Delete Project";
			dialogMessage = "Delete selected project: " + labelProvider.getText(object);
			MessageDialog dialog = new MessageDialog(shell, dialogTitle, null,
				    dialogMessage, MessageDialog.WARNING, new String[] { "Delete",
				  "Cancel" }, 1);
			int result = dialog.open();
			if (result == MessageDialog.OK)
			{
				projectController.remove((BTSProject)object);
				treeNode.getParent().getChildren().remove(treeNode);
			}	
		}
		else
		{
			return;
		}
			
	}

	private void deleteUserOrGroup(TreeNodeWrapper treeNode) {
		if (!(treeNode.getObject() instanceof BTSObject))
		{
			return;
		}
		BTSObject object = (BTSObject) treeNode.getObject();
		
		String dialogTitle;
		String dialogMessage;
		AdapterFactoryLabelProvider labelProvider = new AdapterFactoryLabelProvider(adapterFactory);
		if (object instanceof BTSUser)
		{
			dialogTitle = "Delete User";
			dialogMessage = "Delete selected user: " + labelProvider.getText(object);
		}
		else
		{
			dialogTitle = "Delete Usergroup";
			dialogMessage = "Delete selected usergroup: " + labelProvider.getText(object);
		}
		if (!permissionController.authenticatedUserMayDeleteUserOrUserGroup((BTSObject)object))
		{
			dialogTitle = "Deletion Not Allowed";
			dialogMessage = "You are not allowed to delete the selected user or usergroup: " + labelProvider.getText(object);
			MessageDialog dialog = new MessageDialog(shell, dialogTitle, null,
				    dialogMessage, MessageDialog.INFORMATION, new String[] { "OK" }, 0);
			dialog.open();
			return;
		}
		MessageDialog dialog = new MessageDialog(shell, dialogTitle, null,
			    dialogMessage, MessageDialog.WARNING, new String[] { "Delete",
			  "Cancel" }, 1);
		int result = dialog.open();
		if (result == MessageDialog.OK)
		{
			userController.removeUserUserGroup(object, projects);
			treeNode.getParent().getChildren().remove(treeNode);
		}		
	}

	private void init()
	{
		roleDescMap = new HashMap<String, String>();
		for (int i = 0; i < databaseRoles.length; i++)
		{
			roleDescMap.put(databaseRoles[i], databaseRolesDescs[i]);
		}

	}

	private void loadUserTree()
	{

		// BtsviewmodelAdapterFactory factory = new
		// BtsviewmodelAdapterFactory();
		AdapterFactoryLabelProvider labelProvider = new AdapterFactoryLabelProvider(adapterFactory);
		AdapterFactoryContentProvider contentProvider = new AdapterFactoryContentProvider(adapterFactory);
		user_treeViewer.setContentProvider(contentProvider);
		user_treeViewer.setLabelProvider(labelProvider);
		user_selectionListener = new ISelectionChangedListener()
		{

			@Override
			public void selectionChanged(SelectionChangedEvent event)
			{
				selection = (StructuredSelection) event.getSelection();
				if (selection.getFirstElement() instanceof TreeNodeWrapper)
				{
					selectedTreeNode = (TreeNodeWrapper) selection.getFirstElement();
				}
				handleUserTreeSelection(selection, user_treeViewer);

			}

		};

		user_treeViewer.addSelectionChangedListener(user_selectionListener);
		user_treeViewer.setComparator(new BTSUserManagerViewerComparator());
		// Create sample data
		userGroups = new ArrayList<BTSUserGroup>();
		Job job = new Job("load orphans") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				userGroups = userManagerController.listUserGroups(monitor);
				user_root = BtsviewmodelFactory.eINSTANCE.createTreeNodeWrapper();
				if (userGroups != null)
				{
					for (BTSUserGroup o : userGroups)
					{
						TreeNodeWrapper child = BtsviewmodelFactory.eINSTANCE.createTreeNodeWrapper();
						child.setObject(o);
						child.setChildrenLoaded(false);
						child.setParent(user_root);
						user_root.getChildren().add(child);
						user_root.setChildrenLoaded(true);
					}
				}
				
				// load orphans
				user_orphanNode = BtsviewmodelFactory.eINSTANCE.createTreeNodeWrapper();
				user_orphanNode.setLabel(BTSConstants.ORPHANS_NODE_LABEL);
				List<BTSObject> orphans;
				orphans = userManagerController
						.getUserUserGroupOrphans(user_treeViewer.getFilters(), monitor);
				if (orphans != null)
				{
					for (BTSObject o : orphans)
					{
						TreeNodeWrapper child = BtsviewmodelFactory.eINSTANCE.createTreeNodeWrapper();
						child.setObject(o);
						child.setChildrenLoaded(false);
						child.setParent(user_orphanNode);
						user_orphanNode.getChildren().add(child);
						user_orphanNode.setChildrenLoaded(true);
					}
					user_root.getChildren().add(user_orphanNode);

				}

				// If you want to update the UI
				sync.asyncExec(new Runnable() {
					@Override
					public void run() {
						
						// Set the writeableList as input for the viewer
						user_treeViewer.setInput(user_root);
					}
				});
				

			
			return Status.OK_STATUS;
		}
	};

	// Start the Job
	job.schedule();
		
	}

	private void loadChildren(final List<TreeNodeWrapper> parents, final TreeViewer treeviewer, boolean includeGrandChildren)
	{
		for (final TreeNodeWrapper parent : parents)
			synchronized(parent) {
				if (!parent.isChildrenLoaded()) {
					Job job = new Job("load children")
					{
						@Override
						protected IStatus run(IProgressMonitor monitor)
						{
							if (!parent.isChildrenLoaded()) {
								final List<BTSUser> children = userManagerController.findGroupMembers(
										(BTSUserGroup) parent.getObject(), queryResultMap, treeviewer, parent,
										BtsviewmodelPackage.Literals.TREE_NODE_WRAPPER__CHILDREN, monitor);
								// If you want to update the UI
								if (!parent.isChildrenLoaded())
									sync.asyncExec(new Runnable()
									{
										@Override
										public void run()
										{
											System.out.println("add children" + children.size());
											for (BTSObject o : children)
											{
												TreeNodeWrapper tn = wrappObject(o);
												tn.setParent(parent);
												// grandChildren.add(tn);
												parent.getChildren().add(tn);
											}
											parent.setChildrenLoaded(true);
										}
								});
								// loadChildren(grandChildren, false);
							}
							return Status.OK_STATUS;
						}
					};
					// Start the Job
					job.schedule();
				}
			}
		refreshTreeViewer(treeviewer, null);
	}

	private void loadRolesTree()
	{
		//
		//		// BtsviewmodelAdapterFactory factory = new
		//		// BtsviewmodelAdapterFactory();
		AdapterFactoryLabelProvider labelProvider = new AdapterFactoryLabelProvider(adapterFactory);
		//		AdapterFactoryContentProvider contentProvider = new AdapterFactoryContentProvider(factory);
		//		roles_treeViewer.setContentProvider(contentProvider);
		roles_treeViewer.setLabelProvider(labelProvider);
		ObservableListTreeContentProvider contentProvider = new ObservableListTreeContentProvider(
				new ProjectDBCollectionTreeFactory(), new ProjectDBCollectionTreeStructureAdvisor());
		roles_treeViewer.setContentProvider(contentProvider);
		//		roles_treeViewer.setLabelProvider(new ExplorerTreeLabelProvider());
		roles_treeViewer.addFilter(new ViewerFilter()
		{

			@Override
			public boolean select(Viewer viewer, Object parentElement, Object element)
			{
				if (element instanceof BTSDBCollectionRoleDesc
						&& "members".equals(((BTSDBCollectionRoleDesc) element).getRoleName()))
				{
					return false;
				}
				return true;
			}
		});
		roles_selectionListener = new ISelectionChangedListener()
		{

			@Override
			public void selectionChanged(SelectionChangedEvent event)
			{
				IStructuredSelection selection = (StructuredSelection) event.getSelection();
				if (selection.getFirstElement() instanceof TreeNodeWrapper)
				{
					selectedTreeNode = (TreeNodeWrapper) selection.getFirstElement();
				}
				handleRolesTreeSelection(selection, roles_treeViewer);

			}

		};

		roles_treeViewer.addSelectionChangedListener(roles_selectionListener);
		roles_treeViewer.setComparator(new BTSUserManagerViewerComparator());
		// Create sample data
		projects = projectController.listProjects(null);

		roles_list = new WritableList(projects, BTSProject.class);
		//		if (projects != null)
		//		{
		//			for (BTSProject o : projects)
		//			{
		//				roles_list.add(o);
		//			}
		//		}

		// Set the writeableList as input for the viewer
		roles_treeViewer.setInput(roles_list);

	}

	private TreeNodeWrapper wrappObject(BTSObject o)
	{
		return BtsviewmodelFactory.eINSTANCE.wrappObject(o);
	}

	private void refreshTreeViewer(final TreeViewer treeviewer, final BTSObject object)
	{
		sync.asyncExec(new Runnable()
		{
			public void run()
			{
				treeviewer.removeSelectionChangedListener(user_selectionListener);
				treeviewer.refresh();
				treeviewer.addSelectionChangedListener(user_selectionListener);
			}
		});

	}

	private void handleUserTreeSelection(IStructuredSelection selection2, TreeViewer treeViewer)
	{
		user_ToolDeleteGroup.setEnabled(false);
		if (selection2.getFirstElement() instanceof TreeNodeWrapper)
		{
			TreeNodeWrapper tn = (TreeNodeWrapper) selection2.getFirstElement();

			if (tn.getObject() instanceof BTSUserGroup)
			{
				if (!tn.isChildrenLoaded())
				{
					List<TreeNodeWrapper> parents = new Vector<TreeNodeWrapper>(1);
					parents.add(tn);
					loadChildren(parents, treeViewer, false);
				}
				selectedGroup = (BTSUserGroup) tn.getObject();
				user_ToolDeleteGroup.setEnabled(true);
				loadGroupEditComposite(selectedGroup);
				enableUndoRedo(selectedTreeObject);
			}
			if (tn.getObject() instanceof BTSUser)
			{
				selectedUser = (BTSUser) tn.getObject();
				loadUserEditComposite(selectedUser);
				enableUndoRedo(selectedTreeObject);
			}
			if (selectedTreeObject == null || !selectedTreeObject.equals(tn.getObject()))
			{
				BTSIdentifiableItem oldSelection = selectedTreeObject;
				selectedTreeObject = (BTSIdentifiableItem) tn.getObject();
				manageDomainListeners(oldSelection, selectedTreeObject);
				manageDirtyObjects(oldSelection, selectedTreeObject);
			}
		} else if (selection2.getFirstElement() instanceof BTSUser)
		{
			selectedUser = (BTSUser) selection2.getFirstElement();
			selectedTreeObject = selectedUser;
			loadUserEditComposite(selectedUser);
		}

	}

	private void manageDirtyObjects(BTSIdentifiableItem oldSelection, BTSIdentifiableItem selectedTreeObject2)
	{
		if (oldSelection != null
				&& getEditingDomain(oldSelection).getCommandStack().canUndo()) // object
																				// is
																				// dirty
		{
			if (oldSelection instanceof BTSUser)
			{
				dirtyUsers.add((BTSUser) oldSelection);
			} else if (oldSelection instanceof BTSUserGroup)
			{
				dirtyUserGroups.add((BTSUserGroup) oldSelection);
			} else if (oldSelection instanceof BTSProject)
			{
				dirtyProjects.add((BTSProject) oldSelection);
			} else if (oldSelection instanceof BTSProjectDBCollection)
			{
				dirtyProjects.add((BTSProject) oldSelection.eContainer());
			} else if (oldSelection instanceof BTSDBCollectionRoleDesc)
			{
				if (oldSelection.eContainer() != null)
				{
					dirtyProjects.add((BTSProject) oldSelection.eContainer().eContainer());
				}
			}
		} else
		// if not dirty then check if it was added to dirty list prior
		{
			if (dirtyUsers.contains(oldSelection))
			{
				dirtyUsers.remove(oldSelection);
			} else if (dirtyUserGroups.contains(oldSelection))
			{
				dirtyUserGroups.remove(oldSelection);
			} else if (dirtyProjects.contains(oldSelection))
			{
				dirtyProjects.remove(oldSelection);
			} else if (oldSelection instanceof BTSProjectDBCollection)
			{
				dirtyProjects.remove((BTSProject) oldSelection.eContainer());
			} else if (oldSelection instanceof BTSDBCollectionRoleDesc)
			{
				if (oldSelection.eContainer() != null)
				{
					dirtyProjects.remove((BTSProject) oldSelection.eContainer().eContainer());
				}
			}
		}

	}

	private void handleRolesTreeSelection(IStructuredSelection selection, TreeViewer treeViewer)
	{
		if (selection.getFirstElement() instanceof BTSIdentifiableItem)
		{
			selectedTreeObject = (BTSIdentifiableItem) selection.getFirstElement();
			if (selection.getFirstElement() instanceof BTSProject)
			{
				selectedProject = (BTSProject) selection.getFirstElement();
				loadProjectEditComposite(selectedProject);
				enableReolesUndoRedo(selectedProject);
			} else if (selection.getFirstElement() instanceof BTSProjectDBCollection)
			{
				selectedDBCollection = (BTSProjectDBCollection) selection.getFirstElement();
				loadDBCollectionEditComposite(selectedDBCollection);
				enableReolesUndoRedo(selectedTreeObject);
			} else if (selection.getFirstElement() instanceof BTSDBCollectionRoleDesc)
			{
				selectedDBRoleDesc = (BTSDBCollectionRoleDesc) selection.getFirstElement();
				loadDBRoleDescEditComposite(selectedDBRoleDesc);
				enableReolesUndoRedo(selectedTreeObject);
			} else if (selectedTreeObject instanceof BTSUser)
			{
				loadDBRoleDescUserEditComposite((BTSUser) selectedTreeObject);
				enableReolesUndoRedo(selectedTreeObject);
			} else if (selection.getFirstElement() instanceof BTSUserGroup)
			{
				loadDBRoleDescUserGroupEditComposite((BTSUserGroup) selectedTreeObject);
				enableReolesUndoRedo(selectedTreeObject);
			}
			if (selectedTreeObject == null || !selectedTreeObject.equals(selection.getFirstElement()))
			{
				BTSIdentifiableItem oldSelection = selectedTreeObject;
				selectedTreeObject = (BTSIdentifiableItem) selection.getFirstElement();
				manageDomainListeners(oldSelection, selectedTreeObject);
				manageDirtyObjects(oldSelection, selectedTreeObject);
			}
		} else if (selection.getFirstElement() instanceof TreeNodeWrapper)
		{
			TreeNodeWrapper tn = (TreeNodeWrapper) selection.getFirstElement();
			selectedTreeNode = tn;
			if (tn.getObject() instanceof BTSUserGroup)
			{
				if (!tn.isChildrenLoaded())
				{
					List<TreeNodeWrapper> parents = new Vector<TreeNodeWrapper>(1);
					parents.add(tn);
					loadChildren(parents, treeViewer, false);
				}
				loadDBRoleDescUserGroupEditComposite((BTSUserGroup) tn.getObject());
				enableReolesUndoRedo((BTSUserGroup) tn.getObject());
			}
			if (tn.getObject() instanceof BTSUser)
			{
				loadDBRoleDescUserEditComposite((BTSUser) tn.getObject());
				enableReolesUndoRedo((BTSUser) tn.getObject());
			}
			if (selectedTreeObject == null || !selectedTreeObject.equals(tn.getObject()))
			{
				BTSIdentifiableItem oldSelection = selectedTreeObject;
				selectedTreeObject = (BTSIdentifiableItem) tn.getObject();
				manageDomainListeners(oldSelection, selectedTreeObject);
				manageDirtyObjects(oldSelection, selectedTreeObject);
			}
		}

	}

	private void loadDBRoleDescUserGroupEditComposite(final BTSUserGroup group)
	{
		if (roles_composite_right != null)
		{
			roles_composite_right.dispose();
			roles_composite_right = null;
		}
		roles_composite_right = new Composite(roles_sashForm, SWT.NONE);
		roles_composite_right.setLayout(new GridLayout(2, false));

		lblUserGroup_1 = new Label(roles_composite_right, SWT.NONE);
		lblUserGroup_1.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, true, false, 2, 1));
		lblUserGroup_1.setText("User Group");

		lblGroupName = new Label(roles_composite_right, SWT.NONE);
		lblGroupName.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblGroupName.setText("Group name");

		text = new Text(roles_composite_right, SWT.BORDER);
		text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		text.setText(group.getName());
		text.setEditable(false);

		roles_group_removeGroupfromRole_link = new Link(roles_composite_right, SWT.NONE);
		roles_group_removeGroupfromRole_link.setLayoutData(new GridData(SWT.LEFT, SWT.BOTTOM, true, true, 2, 1));
		roles_group_removeGroupfromRole_link.setText("<a>Remove Group from role</a>");
		roles_group_removeGroupfromRole_link.addSelectionListener(new SelectionAdapter()
		{

			@Override
			public void widgetSelected(SelectionEvent e)
			{
				if (selectedTreeNode != null)
				{
					Object parent = selectedTreeNode.getParentObject();
					if (parent instanceof BTSDBCollectionRoleDesc)
					{
						BTSDBCollectionRoleDesc parentRoleDesc = (BTSDBCollectionRoleDesc) parent;
						BTSUserGroup u = (BTSUserGroup) selectedTreeNode.getObject();
						CompoundCommand compoundCommand = new CompoundCommand();
						Command c1 = RemoveCommand.create(getEditingDomain(selectedDBRoleDesc), parentRoleDesc,
								BtsmodelPackage.Literals.BTSDB_COLLECTION_ROLE_DESC__CACHED_CHILDREN, selectedTreeNode);
						compoundCommand.append(c1);
						Command c2 = RemoveCommand.create(getEditingDomain(selectedDBRoleDesc), parentRoleDesc,
								BtsmodelPackage.Literals.BTSDB_COLLECTION_ROLE_DESC__USER_ROLES, u.getName());
						compoundCommand.append(c2);
						getEditingDomain(selectedDBRoleDesc).getCommandStack().execute(compoundCommand);
						if (((BTSDBCollectionRoleDesc) parentRoleDesc).eContainer() instanceof BTSProjectDBCollection)
						{
							((BTSProjectDBCollection) ((BTSDBCollectionRoleDesc) parentRoleDesc).eContainer()).setDirty(true);
						}
						roles_treeViewer.refresh(parent);
					}
				}

			}
		});

		roles_sashForm.setWeights(new int[] { 10, 8 });
		roles_sashForm.layout();

	}

	private void loadDBRoleDescUserEditComposite(final BTSUser user)
	{
		if (roles_composite_right != null)
		{
			roles_composite_right.dispose();
			roles_composite_right = null;
		}
		roles_composite_right = new Composite(roles_sashForm, SWT.NONE);
		roles_composite_right.setLayout(new GridLayout(2, false));

		lblUser_1 = new Label(roles_composite_right, SWT.NONE);
		lblUser_1.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, true, false, 2, 1));
		lblUser_1.setText("User");

		lblForename_1 = new Label(roles_composite_right, SWT.NONE);
		lblForename_1.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblForename_1.setText("Forename");

		roles_user_forename_text = new Text(roles_composite_right, SWT.BORDER);
		roles_user_forename_text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		roles_user_forename_text.setEditable(false);
		roles_user_forename_text.setText(user.getForeName());

		lblSurname = new Label(roles_composite_right, SWT.NONE);
		lblSurname.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblSurname.setText("Surname");

		roles_user_surname_text = new Text(roles_composite_right, SWT.BORDER);
		roles_user_surname_text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		roles_user_surname_text.setEditable(false);
		roles_user_surname_text.setText(user.getSureName());

		Link roles_user_removeRolefromUser_link = new Link(roles_composite_right, SWT.NONE);
		roles_user_removeRolefromUser_link.setLayoutData(new GridData(SWT.LEFT, SWT.BOTTOM, false, true, 2, 1));
		roles_user_removeRolefromUser_link.setText("<a>Remove Role from User</a>");
		roles_user_removeRolefromUser_link.addSelectionListener(new SelectionAdapter()
		{

			@Override
			public void widgetSelected(SelectionEvent e)
			{
				if (selectedTreeNode != null)
				{
					Object parent = selectedTreeNode.getParentObject();
					if (parent instanceof BTSDBCollectionRoleDesc)
					{
						BTSDBCollectionRoleDesc parentRoleDesc = (BTSDBCollectionRoleDesc) parent;
						BTSUser u = (BTSUser) selectedTreeNode.getObject();
						CompoundCommand compoundCommand = new CompoundCommand();
						Command c1 = RemoveCommand.create(getEditingDomain(selectedDBRoleDesc), parentRoleDesc,
								BtsmodelPackage.Literals.BTSDB_COLLECTION_ROLE_DESC__CACHED_CHILDREN, selectedTreeNode);
						compoundCommand.append(c1);
						Command c2 = RemoveCommand.create(getEditingDomain(selectedDBRoleDesc), parentRoleDesc,
								BtsmodelPackage.Literals.BTSDB_COLLECTION_ROLE_DESC__USER_NAMES, u.getUserName());
						compoundCommand.append(c2);
						getEditingDomain(selectedDBRoleDesc).getCommandStack().execute(compoundCommand);
						if (((BTSDBCollectionRoleDesc) parentRoleDesc).eContainer() instanceof BTSProjectDBCollection)
						{
							((BTSProjectDBCollection) ((BTSDBCollectionRoleDesc) parentRoleDesc).eContainer()).setDirty(true);
						}
						roles_treeViewer.refresh(parent);
					}
				}
			}
		});

		roles_sashForm.setWeights(new int[] { 10, 8 });
		roles_sashForm.layout();

	}

	private void loadDBRoleDescEditComposite(BTSDBCollectionRoleDesc dBRoleDesc)
	{
		if (roles_composite_right != null)
		{
			roles_composite_right.dispose();
			roles_composite_right = null;
		}
		if (observableLisAllUsers == null)
		{
			loadAllUsers();
		}
		if (observableLisAllUserGroups == null)
		{
			loadAllUserGroups();
		}
		checkAndLoadCache(dBRoleDesc);
		roles_composite_right = new Composite(roles_sashForm, SWT.NONE);
		roles_composite_right.setLayout(new GridLayout(3, false));
		lblUserRoleDefinition = new Label(roles_composite_right, SWT.NONE);
		lblUserRoleDefinition.setLayoutData(new GridData(SWT.CENTER,
				SWT.CENTER, true, false, 1, 1));
		lblUserRoleDefinition.setText("User Role Definition");

		lblRoleName = new Label(roles_composite_right, SWT.NONE);
		lblRoleName.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblRoleName.setText("Role Name");

		roles_rolesDesc_name_text = new Text(roles_composite_right, SWT.BORDER);
		roles_rolesDesc_name_text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		roles_rolesDesc_name_text.setEditable(false);

		// Label lblRoleDesc = new Label(roles_composite_right, SWT.NONE);
		// lblRoleDesc.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
		// false, 1, 1));
		// lblRoleDesc.setText("Role Description");

		Text txt_rolesDesc = new Text(roles_composite_right, SWT.BORDER | SWT.MULTI | SWT.WRAP);
		txt_rolesDesc.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 3, 2));
		txt_rolesDesc.setEditable(false);
		String desc = roleDescMap.get(dBRoleDesc.getRoleName());
		if (desc != null)
		{
			txt_rolesDesc.setText(desc);
		}

		Group grpAssignUser = new Group(roles_composite_right, SWT.NONE);
		grpAssignUser.setLayout(new GridLayout(2, false));
		grpAssignUser.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 3, 1));
		grpAssignUser.setText("Assign User");

		Label lblSelectUser = new Label(grpAssignUser, SWT.NONE);
		lblSelectUser.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
				false, 1, 1));
		lblSelectUser.setText("Select User");
		lblSelectUser.pack();

		roles_rolesDesc_users_comboViewer = new ComboViewer(grpAssignUser, SWT.NONE | SWT.READ_ONLY);
		roles_rolesDesc_users_comboViewer.getCombo().setLayoutData(
				new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		AdapterFactoryLabelProvider labelProvider = new AdapterFactoryLabelProvider(adapterFactory);
		roles_rolesDesc_users_comboViewer.setContentProvider(new ObservableListContentProvider());
		roles_rolesDesc_users_comboViewer.setLabelProvider(labelProvider);
		roles_rolesDesc_users_comboViewer.setInput(observableLisAllUsers);
		roles_rolesDesc_users_comboViewer.setComparator(new BTSUserManagerViewerComparator());

		roles_roleDesc_assignUser_link = new Link(grpAssignUser, SWT.NONE);
		roles_roleDesc_assignUser_link.setText("<a>Assign role to user</a>");
		roles_roleDesc_assignUser_link.setLayoutData(new GridData(SWT.FILL,
				SWT.CENTER, true, false, 2, 1));
		roles_roleDesc_assignUser_link.addSelectionListener(new SelectionAdapter()
		{

			@Override
			public void widgetSelected(SelectionEvent e)
			{
				if (roles_rolesDesc_users_comboViewer.getSelection() != null)
				{
					IStructuredSelection sel = (IStructuredSelection) roles_rolesDesc_users_comboViewer.getSelection();
					if (sel.getFirstElement() != null)
					{
						BTSUser u = (BTSUser) sel.getFirstElement();
						TreeNodeWrapper tn = BtsviewmodelFactory.eINSTANCE.wrappObject(u);
						tn.setParentObject(selectedDBRoleDesc);
						tn.setChildrenLoaded(true);
						CompoundCommand compoundCommand = new CompoundCommand();
						Command command = AddCommand.create(getEditingDomain(selectedDBRoleDesc), selectedDBRoleDesc,
								BtsmodelPackage.Literals.BTSDB_COLLECTION_ROLE_DESC__CACHED_CHILDREN, tn);
						compoundCommand.append(command);
						Command command2 = AddCommand.create(getEditingDomain(selectedDBRoleDesc), selectedDBRoleDesc,
								BtsmodelPackage.Literals.BTSDB_COLLECTION_ROLE_DESC__USER_NAMES, u.getUserName());
						compoundCommand.append(command2);
						getEditingDomain(selectedDBRoleDesc).getCommandStack().execute(compoundCommand);
						if (((BTSDBCollectionRoleDesc) selectedDBRoleDesc).eContainer() instanceof BTSProjectDBCollection)
						{
							((BTSProjectDBCollection) ((BTSDBCollectionRoleDesc) selectedDBRoleDesc).eContainer()).setDirty(true);
						}
						roles_treeViewer.refresh(selectedDBRoleDesc);
						manageDirtyObjects(selectedDBRoleDesc, selectedTreeObject);
					}
				}

			}
		});

		grpAssignUserGroup = new Group(roles_composite_right, SWT.NONE);
		grpAssignUserGroup.setLayout(new GridLayout(2, false));
		grpAssignUserGroup.setLayoutData(new GridData(SWT.FILL, SWT.CENTER,
				false, false, 3, 1));
		grpAssignUserGroup.setText("Assign User Group");

		lblSelectUserGroup = new Label(grpAssignUserGroup, SWT.NONE);
		lblSelectUserGroup.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER,
				false, false, 1, 1));
		lblSelectUserGroup.setText("Select Group");
		lblSelectUserGroup.pack();

		roles_rolesDesc_group_comboViewer = new ComboViewer(grpAssignUserGroup, SWT.NONE | SWT.READ_ONLY);
		roles_rolesDesc_group_comboViewer.getCombo().setLayoutData(
				new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		roles_rolesDesc_group_comboViewer.setContentProvider(new ObservableListContentProvider());
		roles_rolesDesc_group_comboViewer.setLabelProvider(labelProvider);
		roles_rolesDesc_group_comboViewer.setInput(observableLisAllUserGroups);
		roles_roleDesc_assignGroup_link = new Link(grpAssignUserGroup, SWT.NONE);
		roles_roleDesc_assignGroup_link.setText("<a>Assign role to whole user group</a>");
		roles_roleDesc_assignGroup_link.setLayoutData(new GridData(SWT.FILL,
				SWT.CENTER, true, false, 2, 1));
		roles_roleDesc_assignGroup_link.addSelectionListener(new SelectionAdapter()
		{

			@Override
			public void widgetSelected(SelectionEvent e)
			{
				if (roles_rolesDesc_group_comboViewer.getSelection() != null)
				{
					IStructuredSelection sel = (IStructuredSelection) roles_rolesDesc_group_comboViewer.getSelection();
					if (sel.getFirstElement() != null)
					{
						BTSUserGroup ug = (BTSUserGroup) sel.getFirstElement();
						TreeNodeWrapper tn = BtsviewmodelFactory.eINSTANCE.wrappObject(ug);
						tn.setParentObject(selectedDBRoleDesc);
						tn.setChildrenLoaded(true);
						CompoundCommand compoundCommand = new CompoundCommand();
						Command command = AddCommand.create(getEditingDomain(selectedDBRoleDesc), selectedDBRoleDesc,
								BtsmodelPackage.Literals.BTSDB_COLLECTION_ROLE_DESC__CACHED_CHILDREN, tn);
						compoundCommand.append(command);
						Command command2 = AddCommand.create(getEditingDomain(selectedDBRoleDesc), selectedDBRoleDesc,
								BtsmodelPackage.Literals.BTSDB_COLLECTION_ROLE_DESC__USER_ROLES, ug.getName());
						compoundCommand.append(command2);
						getEditingDomain(selectedDBRoleDesc).getCommandStack().execute(compoundCommand);
						manageDirtyObjects(selectedDBRoleDesc, selectedTreeObject);
						if (((BTSDBCollectionRoleDesc) selectedDBRoleDesc).eContainer() instanceof BTSProjectDBCollection)
						{
							((BTSProjectDBCollection) ((BTSDBCollectionRoleDesc) selectedDBRoleDesc).eContainer()).setDirty(true);
						}
						roles_treeViewer.refresh(selectedDBRoleDesc);
					}
				}

			}
		});
		roles_roleDesc_removeRoleDesc_link = new Link(roles_composite_right, SWT.NONE);
		roles_roleDesc_removeRoleDesc_link.setLayoutData(new GridData(SWT.FILL,
				SWT.CENTER, false, false, 3, 1));
		roles_roleDesc_removeRoleDesc_link.setText("<a>Remove this Role and its members from DB collection</a>");
		roles_roleDesc_removeRoleDesc_link.addSelectionListener(new SelectionAdapter()
		{

			@Override
			public void widgetSelected(SelectionEvent e)
			{
				if (selectedDBRoleDesc != null && selectedDBRoleDesc.eContainer() instanceof BTSProjectDBCollection)
				{
					BTSProjectDBCollection coll = (BTSProjectDBCollection) selectedDBRoleDesc.eContainer();
					Command command = RemoveCommand.create(getEditingDomain(coll), coll,
							BtsmodelPackage.Literals.BTS_PROJECT_DB_COLLECTION__ROLE_DESCRIPTIONS, selectedDBRoleDesc);
					getEditingDomain(selectedDBRoleDesc).getCommandStack().execute(command);
					coll.setDirty(true);
					roles_treeViewer.refresh(coll);

				}

			}
		});
		dbRoleDesc_bindingContext = initializeRoleDescBindings(dBRoleDesc);
		roles_composite_right.layout();
		roles_sashForm.setWeights(new int[] { 10, 8 });
		roles_sashForm.layout();

	}

	private void checkAndLoadCache(BTSDBCollectionRoleDesc dBRoleDesc)
	{
		boolean uncached = dBRoleDesc.getCachedChildren().isEmpty();
		if (!dBRoleDesc.getUserNames().isEmpty() && uncached)
		{

			for (String n : dBRoleDesc.getUserNames())
			{
				BTSObject user = userMap.get(n);
				if (user != null)
				{
					TreeNodeWrapper tn = BtsviewmodelFactory.eINSTANCE.wrappObject(user);
					tn.setParentObject(dBRoleDesc);
					tn.setChildrenLoaded(true);
					dBRoleDesc.getCachedChildren().add(tn);
				}
			}
		}
		if (!dBRoleDesc.getUserRoles().isEmpty() && uncached)
		{
			for (String n : dBRoleDesc.getUserRoles())
			{
				BTSObject userGroup = userGroupMap.get(n);
				if (userGroup != null)
				{
				TreeNodeWrapper tn = BtsviewmodelFactory.eINSTANCE.wrappObject(userGroup);
				tn.setParentObject(dBRoleDesc);
				tn.setChildrenLoaded(true);
				dBRoleDesc.getCachedChildren().add(tn);
				}
			}
		}
		if (uncached)
		{
			roles_treeViewer.refresh(dBRoleDesc);
		}

	}

	private void loadAllUserGroups()
	{
		List<BTSUserGroup> groups = userManagerController.listUserGroups(null);
		observableLisAllUserGroups = new WritableList(groups, BTSUserGroup.class);
		userGroupMap = new HashMap<String, BTSUserGroup>(groups.size());
		for (BTSUserGroup u : groups)
		{
			userGroupMap.put(u.getName(), u);
		}
	}

	private void loadAllUsers()
	{
		List<BTSUser> users = userManagerController.listUsers(null);
		observableLisAllUsers = new WritableList(users, BTSUser.class);
		userMap = new HashMap<String, BTSUser>(users.size());
		for (BTSUser u : users)
		{
			userMap.put(u.getUserName(), u);
		}

	}

	private DataBindingContext initializeRoleDescBindings(BTSDBCollectionRoleDesc dBRoleDesc)
	{
		getEditingDomain(dBRoleDesc);
		if (dbRoleDesc_bindingContext != null)
		{
			dbRoleDesc_bindingContext.dispose();
		}
		DataBindingContext bindingContext = new DataBindingContext();

		// db collection name - cannot be changed
		IObservableValue model_na = EMFProperties.value(BtsmodelPackage.Literals.BTSDB_COLLECTION_ROLE_DESC__ROLE_NAME)
				.observe(dBRoleDesc);
		bindingContext.bindValue(
				WidgetProperties.text(SWT.Modify).observeDelayed(
						BTSUIConstants.DELAY, roles_rolesDesc_name_text),
				model_na, null, null);
		return bindingContext;
	}

	private void loadDBCollectionEditComposite(BTSProjectDBCollection dbCollection)
	{
		if (roles_composite_right != null)
		{
			roles_composite_right.dispose();
			roles_composite_right = null;
		}
		roles_composite_right = new Composite(roles_sashForm, SWT.NONE);
		roles_composite_right.setLayout(new GridLayout(2, false));

		lblDatabaseCollection = new Label(roles_composite_right, SWT.NONE);
		lblDatabaseCollection.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1));
		lblDatabaseCollection.setAlignment(SWT.CENTER);
		lblDatabaseCollection.setText("Database Collection");

		lblDbCollectionName = new Label(roles_composite_right, SWT.NONE);
		lblDbCollectionName.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblDbCollectionName.setText("DB Collection Name");

		roles_dbColl_name_text = new Text(roles_composite_right, SWT.BORDER);
		roles_dbColl_name_text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		roles_dbColl_name_text.setEditable(false);

		roles_dbColl_sync_btn = new Button(roles_composite_right, SWT.CHECK);
		roles_dbColl_sync_btn.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1));
		roles_dbColl_sync_btn.setText("Synchronize with Server");

		roles_dbColl_index_btn = new Button(roles_composite_right, SWT.CHECK);
		roles_dbColl_index_btn.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1));
		roles_dbColl_index_btn.setText("Index Collection");
		
		Label l = new Label(roles_composite_right, SWT.NONE);
		l.setText("");
		l.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 10));

		lblCreateNewRoles = new Label(roles_composite_right, SWT.NONE);
		lblCreateNewRoles.setLayoutData(new GridData(SWT.LEFT, SWT.BOTTOM, false, true, 2, 10));
		lblCreateNewRoles.setText("Create New Roles Description (Select role first)");

		Label lblCreateNewRoles2 = new Label(roles_composite_right, SWT.NONE);
		lblCreateNewRoles2.setLayoutData(new GridData(SWT.LEFT, SWT.BOTTOM, false, true, 2, 1));
		lblCreateNewRoles2.setText("Please, avoid dublicates!");

		
		roles_dbColl_newRoles_combo = new Combo(roles_composite_right, SWT.BORDER | SWT.READ_ONLY);
		roles_dbColl_newRoles_combo.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, true, 2, 1));
		roles_dbColl_newRoles_combo.setItems(databaseRoles);
		roles_dbColl_newRoles_combo.select(0);
		
		roles_dbColl_newRoles_link = new Link(roles_composite_right, SWT.NONE);
		roles_dbColl_newRoles_link.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, true, true, 2, 1));
		roles_dbColl_newRoles_link.setText("<a>Add new User Roles Description</a>");
		roles_dbColl_newRoles_link.addSelectionListener(new SelectionAdapter()
		{

			@Override
			public void widgetSelected(SelectionEvent e)
			{
				//				FeaturePath feature3 = FeaturePath.fromList(BtsmodelPackage.Literals.BTS_PROJECT__DB_COLLECTIONS,
				//						BtsmodelPackage.Literals.BTSDB_CONNECTION__DB_PATH);
				BTSDBCollectionRoleDesc rolesDesc = BtsmodelFactory.eINSTANCE.createBTSDBCollectionRoleDesc();

				CompoundCommand compound = new CompoundCommand();
				Command c2 = SetCommand.create(getEditingDomain(selectedDBCollection), rolesDesc,
						BtsmodelPackage.Literals.BTSDB_COLLECTION_ROLE_DESC__ROLE_NAME,
						roles_dbColl_newRoles_combo.getText());
				compound.append(c2);

				Command c1 = AddCommand.create(getEditingDomain(selectedDBCollection), selectedDBCollection,
						BtsmodelPackage.Literals.BTS_PROJECT_DB_COLLECTION__ROLE_DESCRIPTIONS, rolesDesc);
				compound.append(c1);
				manageDirtyObjects(selectedDBCollection, selectedTreeObject);
				selectedDBCollection.setDirty(true);
				getEditingDomain(selectedDBCollection).getCommandStack().execute(compound);
				roles_treeViewer.refresh();

			}
		});

		dbColl_bindingContext = initializeDBCollectionBindings(dbCollection);

		roles_sashForm.setWeights(new int[] { 10, 8 });
		roles_sashForm.layout();
	}

	private DataBindingContext initializeDBCollectionBindings(BTSProjectDBCollection dbCollection)
	{
		EditingDomain editingDomain = getEditingDomain(dbCollection);
		if (dbColl_bindingContext != null)
		{
			dbColl_bindingContext.dispose();
		}
		DataBindingContext bindingContext = new DataBindingContext();

		// db collection name - cannot be changed
		IObservableValue model_na = EMFProperties.value(
				BtsmodelPackage.Literals.BTS_PROJECT_DB_COLLECTION__COLLECTION_NAME).observe(dbCollection);
		bindingContext.bindValue(WidgetProperties.text(SWT.Modify)
				.observeDelayed(BTSUIConstants.DELAY, roles_dbColl_name_text),
				model_na, null, null);

		// sync
		IObservableValue model_sy = EMFEditProperties.value(editingDomain,
				BtsmodelPackage.Literals.BTS_PROJECT_DB_COLLECTION__SYNCHRONIZED).observe(dbCollection);
		Binding binding_sy = bindingContext.bindValue(
				WidgetProperties.selection().observeDelayed(
						BTSUIConstants.DELAY, roles_dbColl_sync_btn), model_sy,
				null, null);
		bindingContext.addValidationStatusProvider(binding_sy);

		// index
		IObservableValue model_in = EMFEditProperties.value(editingDomain,
				BtsmodelPackage.Literals.BTS_PROJECT_DB_COLLECTION__INDEXED).observe(dbCollection);
		Binding binding_in = bindingContext.bindValue(
				WidgetProperties.selection().observeDelayed(
						BTSUIConstants.DELAY, roles_dbColl_index_btn),
				model_in, null, null);
		bindingContext.addValidationStatusProvider(binding_in);

		return bindingContext;
	}

	private void loadProjectEditComposite(BTSProject project)
	{
		if (roles_composite_right != null)
		{
			roles_composite_right.dispose();
			roles_composite_right = null;
		}
		roles_composite_right = new Composite(roles_sashForm, SWT.NONE);
		roles_composite_right.setLayout(new GridLayout(2, false));

		lblProject = new Label(roles_composite_right, SWT.NONE);
		lblProject.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, true, false, 2, 1));
		lblProject.setText("Project");

		lblProjectId = new Label(roles_composite_right, SWT.NONE);
		lblProjectId.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblProjectId.setText("Project ID");

		roles_project_id_text = new Text(roles_composite_right, SWT.BORDER);
		roles_project_id_text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		lblProjectName = new Label(roles_composite_right, SWT.NONE);
		lblProjectName.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblProjectName.setText("Project Name");

		roles_project_name_text = new Text(roles_composite_right, SWT.BORDER);
		roles_project_name_text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		lblProjectPrefix = new Label(roles_composite_right, SWT.NONE);
		lblProjectPrefix.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblProjectPrefix.setText("Project Prefix");

		roles_project_prefix_text = new Text(roles_composite_right, SWT.BORDER);
		roles_project_prefix_text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		lblDescription_1 = new Label(roles_composite_right, SWT.NONE);
		lblDescription_1.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblDescription_1.setText("Description");

		roles_project_desc_text = new Text(roles_composite_right, SWT.BORDER);
		roles_project_desc_text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Label lblConntectionType = new Label(roles_composite_right, SWT.NONE);
		lblConntectionType.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblConntectionType.setText("Connection Type");

		roles_project_Connectiontype = new Text(roles_composite_right, SWT.BORDER);
		roles_project_Connectiontype.setText("connectionType");
		roles_project_Connectiontype.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Label lblServerUrl = new Label(roles_composite_right, SWT.NONE);
		lblServerUrl.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblServerUrl.setText("Server URL");

		roles_project_remote_url = new Text(roles_composite_right, SWT.BORDER);
		roles_project_remote_url.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Label lblDbPath = new Label(roles_composite_right, SWT.NONE);
		lblDbPath.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblDbPath.setText("DB Path");

		roles_project_textdbPath = new Text(roles_composite_right, SWT.BORDER);
		roles_project_textdbPath.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		roles_project_addColl_link = new Link(roles_composite_right, SWT.NONE);
		roles_project_addColl_link.setLayoutData(new GridData(SWT.LEFT, SWT.BOTTOM, false, true, 2, 1));
		roles_project_addColl_link.setText("<a>Add Database Collection</a>");
		roles_project_addColl_link.addSelectionListener(new SelectionAdapter()
		{

			@Override
			public void widgetSelected(SelectionEvent e)
			{
				//				FeaturePath feature3 = FeaturePath.fromList(BtsmodelPackage.Literals.BTS_PROJECT__DB_COLLECTIONS,
				//						BtsmodelPackage.Literals.BTSDB_CONNECTION__DB_PATH);
				BTSProjectDBCollection coll = BtsmodelFactory.eINSTANCE.createBTSProjectDBCollection();

				Dialog collectionDialog = new EditDBCollectionDialog(new Shell(), coll);
				if (collectionDialog.open() == collectionDialog.OK)
				{
					Command command = AddCommand.create(getEditingDomain(selectedProject), selectedProject,
							BtsmodelPackage.Literals.BTS_PROJECT__DB_COLLECTIONS, coll);
					getEditingDomain(selectedProject).getCommandStack().execute(command);
					manageDirtyObjects(selectedProject, selectedTreeObject);

					roles_treeViewer.refresh();
				}

			}
		});

		project_bindingContext = initializeProjectBindings(project);

		roles_sashForm.setWeights(new int[] { 10, 8 });
		roles_sashForm.layout();

	}

	private DataBindingContext initializeProjectBindings(BTSProject project)
	{
		EditingDomain editingDomain = getEditingDomain(project);
		if (project_bindingContext != null)
		{
			project_bindingContext.dispose();
		}
		DataBindingContext bindingContext = new DataBindingContext();

		// group id
		IObservableValue model_id = EMFProperties.value(BtsmodelPackage.Literals.BTS_IDENTIFIABLE_ITEM__ID).observe(
				project);
		Binding binding_id = bindingContext.bindValue(
				WidgetProperties.text(SWT.Modify).observeDelayed(
						BTSUIConstants.DELAY, roles_project_id_text), model_id,
				null, null);
		bindingContext.addValidationStatusProvider(binding_id);

		// project name
		EMFUpdateValueStrategy us_n = new EMFUpdateValueStrategy();
		us_n.setBeforeSetValidator(new StringNotEmptyValidator("Project name is required."));

		IObservableValue model_n = EMFEditProperties.value(editingDomain, BtsmodelPackage.Literals.BTS_NAMED_TYPED_OBJECT__NAME)
				.observe(project);
		Binding binding_n = bindingContext.bindValue(
				WidgetProperties.text(SWT.Modify).observeDelayed(
						BTSUIConstants.DELAY, roles_project_name_text),
				model_n, us_n, null);
		bindingContext.addValidationStatusProvider(binding_n);
		BackgroundControlDecorationSupport.create(binding_n, SWT.TOP | SWT.LEFT);

		// project prefix

		IObservableValue model_p = EMFProperties.value(BtsmodelPackage.Literals.BTS_PROJECT__PREFIX).observe(project);
		Binding binding_p = bindingContext
.bindValue(
				WidgetProperties.text(SWT.Modify).observeDelayed(
						BTSUIConstants.DELAY, roles_project_prefix_text),
				model_p,
						null, null);
		bindingContext.addValidationStatusProvider(binding_p);

		// project description

		IObservableValue model_ds = EMFEditProperties.value(editingDomain,
				BtsmodelPackage.Literals.BTS_PROJECT__DESCRIPTION).observe(project);
		Binding binding_ds = bindingContext.bindValue(
				WidgetProperties.text(SWT.Modify).observeDelayed(
						BTSUIConstants.DELAY, roles_project_desc_text),
				model_ds, null, null);
		bindingContext.addValidationStatusProvider(binding_ds);

		//project connection
		FeaturePath feature = FeaturePath.fromList(BtsmodelPackage.Literals.BTS_PROJECT__DB_CONNECTION,
				BtsmodelPackage.Literals.BTSDB_CONNECTION__TYPE);

		IObservableValue model = EMFEditProperties.value(editingDomain, feature).observe(project);
		Binding binding = bindingContext.bindValue(
				WidgetProperties.text(SWT.Modify).observeDelayed(
						BTSUIConstants.DELAY, roles_project_Connectiontype),
				model, null,
				null);
		bindingContext.addValidationStatusProvider(binding);

		// server url
		EMFUpdateValueStrategy us_su = new EMFUpdateValueStrategy();
		us_su.setBeforeSetValidator(new StringHttp_s_URLValidator("Valid URL required.", true));
		FeaturePath feature2 = FeaturePath.fromList(BtsmodelPackage.Literals.BTS_PROJECT__DB_CONNECTION,
				BtsmodelPackage.Literals.BTSDB_CONNECTION__MASTER_SERVER);
		IObservableValue model2 = EMFEditProperties.value(editingDomain, feature2).observe(project);
		Binding binding2 = bindingContext.bindValue(
				WidgetProperties.text(SWT.Modify).observeDelayed(
						BTSUIConstants.DELAY, roles_project_remote_url),
				model2, us_su, null);
		bindingContext.addValidationStatusProvider(binding2);

		FeaturePath feature3 = FeaturePath.fromList(BtsmodelPackage.Literals.BTS_PROJECT__DB_CONNECTION,
				BtsmodelPackage.Literals.BTSDB_CONNECTION__DB_PATH);
		IObservableValue model3 = EMFEditProperties.value(editingDomain, feature3).observe(project);
		Binding binding3 = bindingContext.bindValue(
				WidgetProperties.text(SWT.Modify).observeDelayed(
						BTSUIConstants.DELAY, roles_project_textdbPath),
				model3, null, null);
		bindingContext.addValidationStatusProvider(binding3);
		return bindingContext;
	}

	private void manageDomainListeners(BTSIdentifiableItem oldSelection, BTSIdentifiableItem currentSelection)
	{
		// FIXME hier checken, ob der CommandStack von oldSelecton canUndo() ist, wenn ja, 
		// dann zum Set dirtyUser/GroupObjects hinzufügen oder entfernen

		Adapter changeListenerAdapter = getChangeListenerAdapter();
		if (oldSelection != null)
		{
			oldSelection.eAdapters().remove(changeListenerAdapter);
		}
		if (currentSelection != null)
		{
			currentSelection.eAdapters().add(changeListenerAdapter);
		}

	}

	private Adapter getChangeListenerAdapter()
	{
		if (globalChangeListener == null)
		{
			globalChangeListener = new AdapterImpl()
			{

				@Override
				public void notifyChanged(Notification notification)
				{

						enableUndoRedo(selectedTreeObject);
						enableReolesUndoRedo(selectedTreeObject);

				}
			};

		}
		return globalChangeListener;
	}

	private void enableUndoRedo(BTSIdentifiableItem object)
	{
		if (object == null) {
			user_ToolUndo.setEnabled(false);
			user_ToolRedo.setEnabled(false);
		} else if (!user_ToolUndo.isDisposed()){
		user_ToolUndo.setEnabled(getEditingDomain(object).getCommandStack().canUndo());
		user_ToolRedo.setEnabled(getEditingDomain(object).getCommandStack().canRedo());
		}

	}

	private void enableReolesUndoRedo(BTSIdentifiableItem object)
	{
		if (object == null) {
			roles_ToolUndo.setEnabled(false);
			roles_ToolRedo.setEnabled(false);
		} else if (!roles_ToolUndo.isDisposed()){
		roles_ToolUndo.setEnabled(getEditingDomain(object).getCommandStack().canUndo());
		roles_ToolRedo.setEnabled(getEditingDomain(object).getCommandStack().canRedo());
		}
	}

	private Composite loadUserEditComposite(final BTSUser user)
	{
		composite_right.dispose();
		composite_right = null;
		composite_right = new Composite(user_sashForm, SWT.NONE);
		composite_right.setLayout(new FillLayout(SWT.HORIZONTAL));

		Composite composite_UserEdit = new Composite(composite_right, SWT.NONE);
		composite_UserEdit.setLayout(new GridLayout(2, false));
		((GridLayout) composite_UserEdit.getLayout()).horizontalSpacing = 10;

		Label lblUser = new Label(composite_UserEdit, SWT.NONE);
		lblUser.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 2, 1));
		lblUser.setText("User");

		Label idOfGroup = new Label(composite_UserEdit, SWT.NONE);
		idOfGroup.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		idOfGroup.setText("ID of User");

		labelId_User = new Text(composite_UserEdit, SWT.BORDER);
		labelId_User.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		labelId_User.setEditable(false);

		Label lblForename = new Label(composite_UserEdit, SWT.NONE);
		lblForename.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblForename.setText("Forename*");

		textForeName_User = new Text(composite_UserEdit, SWT.BORDER);
		textForeName_User.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Label lblSurename = new Label(composite_UserEdit, SWT.NONE);
		lblSurename.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblSurename.setText("Surname*");

		textSurName_User = new Text(composite_UserEdit, SWT.BORDER);
		textSurName_User.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Label lblEmail = new Label(composite_UserEdit, SWT.NONE);
		lblEmail.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblEmail.setText("Email");

		textEmail_User = new Text(composite_UserEdit, SWT.BORDER);
		textEmail_User.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Label lblWebsite = new Label(composite_UserEdit, SWT.NONE);
		lblWebsite.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblWebsite.setText("Website");

		textWebsite_User = new Text(composite_UserEdit, SWT.BORDER);
		textWebsite_User.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Label lblDescription = new Label(composite_UserEdit, SWT.NONE);
		lblDescription.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblDescription.setText("Description");

		textDesc_User = new Text(composite_UserEdit, SWT.BORDER);
		textDesc_User.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Label lblWebDescriptin = new Label(composite_UserEdit, SWT.NONE);
		lblWebDescriptin.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblWebDescriptin.setText("Web Description");

		textWebDesc_User = new Text(composite_UserEdit, SWT.BORDER);
		textWebDesc_User.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Label lblSigle = new Label(composite_UserEdit, SWT.NONE);
		lblSigle.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblSigle.setText("Siglum");

		textSigle_User = new Text(composite_UserEdit, SWT.BORDER);
		textSigle_User.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Label lblComment_1 = new Label(composite_UserEdit, SWT.NONE);
		lblComment_1.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblComment_1.setText("Comment");

		textComment_User = new Text(composite_UserEdit, SWT.BORDER);
		textComment_User.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Group grpLogin = new Group(composite_UserEdit, SWT.NONE);
		grpLogin.setLayout(new GridLayout(2, false));
		grpLogin.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 2, 1));
		grpLogin.setText("Login - (Username cannot be changed)");

		Label lblUsername = new Label(grpLogin, SWT.NONE);
		lblUsername.setLayoutData(new GridData(SWT.RIGHT, SWT.TOP, false, false, 1, 1));
		lblUsername.setText("Username");

		textUserName_User = new Text(grpLogin, SWT.BORDER);
		textUserName_User.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
		textUserName_User.setEditable(false);

		Label lblPassword = new Label(grpLogin, SWT.NONE);
		lblPassword.setLayoutData(new GridData(SWT.RIGHT, SWT.TOP, false, false, 1, 1));
		lblPassword.setText("Password");
		
		// change password here
		// button
		
		Button changePasswordButton = new Button(grpLogin, SWT.PUSH);
		changePasswordButton.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
		changePasswordButton.setText("Change Password");
		changePasswordButton.addSelectionListener(new SelectionAdapter() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				final EHandlerService handlerService = context.get(EHandlerService.class);

				ECommandService commandService = context.get(ECommandService.class);
				// Activate Handler
				Map<String, Object> map = new HashMap<>(1);
				map.put("userId", user.get_id());
				org.eclipse.core.commands.Command cmd = commandService.getCommand(BTSPluginIDs.CMD_OPEN_CHANGE_PASSWORD);
				final ParameterizedCommand command = ParameterizedCommand.generateCommand(cmd, map);
				handlerService.executeHandler(command);
				
			}
		});
		changePasswordButton.setEnabled(permissionController.authenticatedUserIsDBAdmin(false));

		btnDBAdmin_User = new Button(grpLogin, SWT.CHECK);
		btnDBAdmin_User.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
		btnDBAdmin_User.setText("User is Database Administrator");
		grpLogin.layout();
		Label lblRequired = new Label(composite_UserEdit, SWT.NONE);
		lblRequired.setLayoutData(new GridData(SWT.LEFT, SWT.BOTTOM, false, true, 1, 1));
		lblRequired.setText("* = required");
		user_bindingContext = initializeUserBindings(user);

		user_sashForm.setWeights(new int[] { 1, 1 });
		user_sashForm.layout();
		return composite_UserEdit;
	}

	private DataBindingContext initializeUserBindings(BTSUser user)
	{
		EditingDomain editingDomain = getEditingDomain(user);
		if (user_bindingContext != null)
		{
			user_bindingContext.dispose();
		}
		DataBindingContext bindingContext = new DataBindingContext();

		// group id
		IObservableValue model_id = EMFProperties.value(BtsmodelPackage.Literals.BTS_IDENTIFIABLE_ITEM__ID).observe(
				user);
		Binding binding_id = bindingContext.bindValue(
				WidgetProperties.text(SWT.Modify).observeDelayed(
						BTSUIConstants.DELAY, labelId_User), model_id, null,
				null);
		bindingContext.addValidationStatusProvider(binding_id);

		// forename
		EMFUpdateValueStrategy us_fn = new EMFUpdateValueStrategy();
		us_fn.setBeforeSetValidator(new StringNotEmptyValidator("Forename is required."));

		IObservableValue model_fn = EMFEditProperties
				.value(editingDomain, BtsmodelPackage.Literals.BTS_USER__FORE_NAME).observe(user);
		Binding binding_fn = bindingContext.bindValue(
				WidgetProperties.text(SWT.Modify).observeDelayed(
						BTSUIConstants.DELAY, textForeName_User), model_fn,
				us_fn, null);
		bindingContext.addValidationStatusProvider(binding_fn);
		BackgroundControlDecorationSupport.create(binding_fn, SWT.TOP | SWT.LEFT);

		//surename
		EMFUpdateValueStrategy us_sn = new EMFUpdateValueStrategy();
		us_sn.setBeforeSetValidator(new StringNotEmptyValidator("Surname is required."));
		IObservableValue model_sn = EMFEditProperties
				.value(editingDomain, BtsmodelPackage.Literals.BTS_USER__SURE_NAME).observe(user);
		Binding binding_sn = bindingContext.bindValue(
				WidgetProperties.text(SWT.Modify).observeDelayed(
						BTSUIConstants.DELAY, textSurName_User), model_sn,
				us_sn, null);
		bindingContext.addValidationStatusProvider(binding_sn);
		BackgroundControlDecorationSupport.create(binding_sn, SWT.TOP | SWT.LEFT);

		//email
		EMFUpdateValueStrategy us_em = new EMFUpdateValueStrategy();
		us_em.setBeforeSetValidator(new StringEmailAddressValidator(true));
		IObservableValue model_em = EMFEditProperties.value(editingDomain, BtsmodelPackage.Literals.BTS_USER__MAIL)
				.observe(user);
		Binding binding_em = bindingContext.bindValue(
				WidgetProperties.text(SWT.Modify).observeDelayed(
						BTSUIConstants.DELAY, textEmail_User), model_em, us_em,
				null);
		bindingContext.addValidationStatusProvider(binding_em);
		BackgroundControlDecorationSupport.create(binding_em, SWT.TOP | SWT.LEFT);

		//website
		EMFUpdateValueStrategy us_ws = new EMFUpdateValueStrategy();
		us_ws.setBeforeSetValidator(new StringHttp_s_URLValidator(true));
		IObservableValue model_ws = EMFEditProperties.value(editingDomain, BtsmodelPackage.Literals.BTS_USER__WEB_URL)
				.observe(user);
		Binding binding_ws = bindingContext.bindValue(
				WidgetProperties.text(SWT.Modify).observeDelayed(
						BTSUIConstants.DELAY, textWebsite_User), model_ws,
				us_ws, null);
		bindingContext.addValidationStatusProvider(binding_ws);
		BackgroundControlDecorationSupport.create(binding_ws, SWT.TOP | SWT.LEFT);

		//descritpion
		IObservableValue model_de = EMFEditProperties.value(editingDomain,
				BtsmodelPackage.Literals.BTS_USER__DESCRIPTION).observe(user);
		Binding binding_de = bindingContext.bindValue(
				WidgetProperties.text(SWT.Modify).observeDelayed(
						BTSUIConstants.DELAY, textDesc_User), model_de, null,
				null);
		bindingContext.addValidationStatusProvider(binding_de);

		//web description
		IObservableValue model_wd = EMFEditProperties.value(editingDomain,
				BtsmodelPackage.Literals.BTS_USER__WEB_DESCRIPTION).observe(user);
		Binding binding_wd = bindingContext.bindValue(
				WidgetProperties.text(SWT.Modify).observeDelayed(
						BTSUIConstants.DELAY, textWebDesc_User), model_wd,
				null, null);
		bindingContext.addValidationStatusProvider(binding_wd);

		// sigl
		IObservableValue model_si = EMFEditProperties.value(editingDomain, BtsmodelPackage.Literals.BTS_USER__SIGLE)
				.observe(user);
		Binding binding_si = bindingContext.bindValue(
				WidgetProperties.text(SWT.Modify).observeDelayed(
						BTSUIConstants.DELAY, textSigle_User), model_si, null,
				null);
		bindingContext.addValidationStatusProvider(binding_si);

		// comment
		IObservableValue model_co = EMFEditProperties.value(editingDomain, BtsmodelPackage.Literals.BTS_USER__COMMENT)
				.observe(user);
		Binding binding_co = bindingContext.bindValue(
				WidgetProperties.text(SWT.Modify).observeDelayed(
						BTSUIConstants.DELAY, textComment_User), model_co,
				null, null);
		bindingContext.addValidationStatusProvider(binding_co);

		// comment
		IObservableValue model_us = EMFEditProperties
				.value(editingDomain, BtsmodelPackage.Literals.BTS_USER__USER_NAME).observe(user);
		Binding binding_us = bindingContext.bindValue(
				WidgetProperties.text(SWT.Modify).observeDelayed(
						BTSUIConstants.DELAY, textUserName_User), model_us,
				null, null);
		bindingContext.addValidationStatusProvider(binding_us);
		
		// dbAdmin
		IObservableValue model_db = EMFEditProperties
				.value(editingDomain, BtsmodelPackage.Literals.BTS_USER__DB_ADMIN).observe(user);
		Binding binding_db = bindingContext.bindValue(
				WidgetProperties.selection().observeDelayed(
						BTSUIConstants.DELAY, btnDBAdmin_User), model_db,
				null, null);
		bindingContext.addValidationStatusProvider(binding_db);
		return bindingContext;
	}

	private EditingDomain getEditingDomain(BTSIdentifiableItem item)
	{
		return editingDomainController.getEditingDomain(item);
	}

	private Composite loadGroupEditComposite(final BTSUserGroup group)
	{
		if (observableLisAllUsers == null)
		{
			loadAllUsers();
		}
		composite_right.dispose();
		composite_right = null;
		composite_right = new Composite(user_sashForm, SWT.NONE);
		composite_right.setLayout(new FillLayout(SWT.HORIZONTAL));

		Composite composite_GroupEdit = new Composite(composite_right, SWT.NONE);
		composite_GroupEdit.setLayout(new GridLayout(2, false));
		((GridLayout) composite_GroupEdit.getLayout()).horizontalSpacing = 10;

		Label lblUserGroup = new Label(composite_GroupEdit, SWT.NONE);
		lblUserGroup.setAlignment(SWT.CENTER);
		lblUserGroup.setLayoutData(new GridData(SWT.CENTER, SWT.TOP, false, false, 2, 1));
		lblUserGroup.setText("User Group");

		Label idOfGroup = new Label(composite_GroupEdit, SWT.NONE);
		idOfGroup.setLayoutData(new GridData(SWT.RIGHT, SWT.TOP, false, false, 1, 1));
		idOfGroup.setText("ID of Group");

		labelId_Group = new Text(composite_GroupEdit, SWT.BORDER);
		labelId_Group.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
		labelId_Group.setEditable(false);

		Label lblNameOfGroup = new Label(composite_GroupEdit, SWT.NONE);
		lblNameOfGroup.setLayoutData(new GridData(SWT.RIGHT, SWT.TOP, false, false, 1, 1));
		lblNameOfGroup.setText("Name of Group");

		textName_Group = new Text(composite_GroupEdit, SWT.BORDER);
		textName_Group.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));

		Label lblTypeOfGroup = new Label(composite_GroupEdit, SWT.NONE);
		lblTypeOfGroup.setLayoutData(new GridData(SWT.RIGHT, SWT.TOP, false, false, 1, 1));
		lblTypeOfGroup.setText("Type of Group");

		textType_Group = new Text(composite_GroupEdit, SWT.BORDER);
		textType_Group.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));

		Label lblComment = new Label(composite_GroupEdit, SWT.NONE);
		lblComment.setText("Comment");

		new Label(composite_GroupEdit, SWT.NONE);

		textComment_Group = new Text(composite_GroupEdit, SWT.BORDER);
		textComment_Group.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 2, 1));

		Group groupCreateUser_Group = new Group(composite_GroupEdit, SWT.NONE);
		groupCreateUser_Group.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 2, 1));
		groupCreateUser_Group.setLayout(new GridLayout(1, false));
		groupCreateUser_Group.setText("Create new User");

		Label lblcreateUserName_Group = new Label(groupCreateUser_Group, SWT.NONE);
		lblcreateUserName_Group.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, true, 1, 1));
		lblcreateUserName_Group.setText("Enter Username");
		
		textCreateNewUser_Group = new Text(groupCreateUser_Group, SWT.BORDER);
		textCreateNewUser_Group.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
		
		Label lblcreateUserPassword_Group = new Label(groupCreateUser_Group, SWT.NONE);
		lblcreateUserPassword_Group.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, true, 1, 1));
		lblcreateUserPassword_Group.setText("Password of New User");

		textCreateNewUserPassword_Group = new Text(groupCreateUser_Group, SWT.BORDER | SWT.PASSWORD);
		textCreateNewUserPassword_Group.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));

		textCreateNewUserPassword_Group.addModifyListener(new ModifyListener()
		{

			@Override
			public void modifyText(ModifyEvent e)
			{
				linkCreateNewUser_Group.setEnabled((textCreateNewUser_Group.getText().trim().length() > 0)
						&& (textCreateNewUserPassword_Group.getText().trim().length() > 0));
			}
		});
		
		textCreateNewUser_Group.addModifyListener(new ModifyListener()
		{

			@Override
			public void modifyText(ModifyEvent e)
			{
				linkCreateNewUser_Group.setEnabled((textCreateNewUser_Group.getText().trim().length() > 0)
						&& (textCreateNewUserPassword_Group.getText().trim().length() > 0));
			}
		});

		linkCreateNewUser_Group = new Link(groupCreateUser_Group, SWT.NONE);
		linkCreateNewUser_Group.setText("<a>Create new User</a>");
		linkCreateNewUser_Group.addSelectionListener(new SelectionAdapter()
		{

			@Override
			public void widgetSelected(SelectionEvent e)
			{
				createNewUser(selectedTreeNode, group, textCreateNewUser_Group.getText().trim(),
						textCreateNewUserPassword_Group.getText().trim());
			}
		});
		linkCreateNewUser_Group.setEnabled((textCreateNewUser_Group.getText().trim().length() > 0)
				&& (textCreateNewUserPassword_Group.getText().trim().length() > 0));
		
		
		Group groupSelectUser_Group = new Group(composite_GroupEdit, SWT.NONE);
		groupSelectUser_Group.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
		groupSelectUser_Group.setLayout(new GridLayout(2, false));

		groupSelectUser_Group.setText("Select User");

		users_groupMembers_groups_comboViewer = new ComboViewer(groupSelectUser_Group, SWT.NONE | SWT.READ_ONLY);
		users_groupMembers_groups_comboViewer.getCombo().setLayoutData(
				new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		AdapterFactoryLabelProvider labelProvider = new AdapterFactoryLabelProvider(adapterFactory);
		users_groupMembers_groups_comboViewer.setContentProvider(new ObservableListContentProvider());
		users_groupMembers_groups_comboViewer.setLabelProvider(labelProvider);
		users_groupMembers_groups_comboViewer.setInput(observableLisAllUsers);
		users_groupMembers_groups_comboViewer.setComparator(new BTSUserManagerViewerComparator());

		users_addGroupMembers_groups_link = new Link(groupSelectUser_Group, SWT.NONE);
		users_addGroupMembers_groups_link.setText("<a>Add User to Group</a>");
		users_addGroupMembers_groups_link.setLayoutData(new GridData(SWT.FILL,
				SWT.CENTER, true, false, 2, 1));
		users_addGroupMembers_groups_link.addSelectionListener(new SelectionAdapter()
		{
			@Override
			public void widgetSelected(SelectionEvent e)
			{
				
				if (permissionController.authenticatedUserIsDBAdmin(true) && users_groupMembers_groups_comboViewer.getSelection() != null)
				{
					IStructuredSelection sel = (IStructuredSelection) users_groupMembers_groups_comboViewer.getSelection();
					if (sel.getFirstElement() != null)
					{
						BTSUser user = (BTSUser) sel.getFirstElement();
						IStructuredSelection groupSelection = (IStructuredSelection) user_treeViewer.getSelection();
						if (groupSelection.getFirstElement() != null && groupSelection.getFirstElement() instanceof TreeNodeWrapper)
						{
							TreeNodeWrapper groupTreeNode = (TreeNodeWrapper) groupSelection.getFirstElement();
							if (selectedGroup != null)
							{
								TreeNodeWrapper tn = BtsviewmodelFactory.eINSTANCE.wrappObject(user);
								tn.setParentObject(selectedGroup);
								tn.setParent(groupTreeNode);
								tn.setChildrenLoaded(true);
								
								CompoundCommand compoundCommand = new CompoundCommand();
								Command command = AddCommand.create(getEditingDomain(user), user,
										BtsmodelPackage.Literals.BTS_USER__GROUP_IDS, selectedGroup.get_id());
								compoundCommand.append(command);
								groupTreeNode.getChildren().add(tn);
								getEditingDomain(user).getCommandStack().execute(compoundCommand);
								dirtyUsers.add(user);
								user_treeViewer.refresh(groupTreeNode);
							}
						}
						
						
					}
				}

			}
		});
		user_sashForm.setWeights(new int[] { 1, 1 });
		user_sashForm.layout();
		user_composite.layout();

		user_group_bindingContext = initializeUserGoupBindings(group);
		return composite_GroupEdit;
	}

	private void createNewUser(TreeNodeWrapper parentNodeWrapper, BTSUserGroup group, String userName, String password)
	{
		BTSUser user = userManagerController.createNewUser(userName);
		user.getGroupIds().add(group.get_id());
		user.setPassword(password);
		TreeNodeWrapper tn = BtsviewmodelFactory.eINSTANCE.createTreeNodeWrapper();
		tn.setObject(user);
		tn.setParent(parentNodeWrapper);
		parentNodeWrapper.getChildren().add(tn);
		dirtyUsers.add(user);
		if (observableLisAllUsers == null) {
			loadAllUsers();
		}
		if (observableLisAllUserGroups == null) {
			loadAllUserGroups();
		}
		observableLisAllUsers.add(user);
	}

	private DataBindingContext initializeUserGoupBindings(BTSUserGroup group)
	{
		EditingDomain editingDomain = getEditingDomain(group);
		if (user_group_bindingContext != null)
		{
			user_group_bindingContext.dispose();
		}

		DataBindingContext bindingContext = new DataBindingContext();
		EMFUpdateValueStrategy us = new EMFUpdateValueStrategy();
		us.setBeforeSetValidator(new StringNotEmptyValidator());

		// group id
		IObservableValue model_id = EMFEditProperties.value(editingDomain,
				BtsmodelPackage.Literals.BTS_IDENTIFIABLE_ITEM__ID).observe(group);
		Binding binding_id = bindingContext.bindValue(
				WidgetProperties.text(SWT.Modify).observeDelayed(
						BTSUIConstants.DELAY, labelId_Group), model_id, us,
				null);
		bindingContext.addValidationStatusProvider(binding_id);

		// name
		IObservableValue model = EMFEditProperties.value(editingDomain, BtsmodelPackage.Literals.BTS_NAMED_TYPED_OBJECT__NAME)
				.observe(group);
		Binding binding = bindingContext.bindValue(
				WidgetProperties.text(SWT.Modify).observeDelayed(
						BTSUIConstants.DELAY, textName_Group), model, us, null);
		BackgroundControlDecorationSupport.create(binding, SWT.TOP | SWT.LEFT);
		bindingContext.addValidationStatusProvider(binding);

		//type
		IObservableValue model2 = EMFEditProperties.value(editingDomain, BtsmodelPackage.Literals.BTS_NAMED_TYPED_OBJECT__TYPE)
				.observe(group);
		Binding binding2 = bindingContext.bindValue(
						WidgetProperties.text(SWT.Modify).observeDelayed(
								BTSUIConstants.DELAY, textType_Group), model2,
						us, null);
		bindingContext.addValidationStatusProvider(binding2);

		// comment
		IObservableValue model3 = EMFEditProperties.value(editingDomain,
				BtsmodelPackage.Literals.BTS_USER_GROUP__COMMENT).observe(group);
		Binding binding3 = bindingContext.bindValue(
				WidgetProperties.text(SWT.Modify).observeDelayed(
						BTSUIConstants.DELAY, textComment_Group), model3, us,
				null);
		bindingContext.addValidationStatusProvider(binding3);
		return bindingContext;
	}

	@PreDestroy
	public void dispose()
	{
	}

	@Focus
	public void setFocus()
	{
		// TODO	Set the focus to control
	}

	@Inject
	@Optional
	void eventReceivedNew(@EventTopic("model_new/*") BTSObject object)
	{
		if (object instanceof BTSUserGroup)
		{
			addObjectToInput(object);
		}
	}

	@Persist
	public void save(MDirtyable dirty)
	{
		manageDirtyObjects(selectedProject, null);
		boolean internalDirty = dirty != null ? dirty.isDirty() : true;
		if (!dirtyUsers.isEmpty())
		{
			if (!userManagerController.saveUsers(dirtyUsers))
			{
				internalDirty = true;
			} else
			{
				dirtyUsers.clear();
			}
		}
		if (!dirtyUserGroups.isEmpty())
		{
			if (!userManagerController.saveUserGroups(dirtyUserGroups))
			{
				internalDirty = true;
			} else
			{
				dirtyUserGroups.clear();
			}
		}
		if (!dirtyProjects.isEmpty())
		{
			if (!projectController.saveProjects(dirtyProjects))
			{
				internalDirty = true;
			} else
			{
				dirtyProjects.clear();
			}
		}
		if (dirty != null)
		{
			dirty.setDirty(internalDirty);
		}
	}

	private void addObjectToInput(final BTSObject object)
	{
		sync.asyncExec(new Runnable()
		{
			@Override
			public void run()
			{
				TreeNodeWrapper tn = wrappObject(object);
				tn.setParent(user_root);
				user_root.getChildren().add(tn);
				StructuredSelection select = new StructuredSelection(tn);
				handleUserTreeSelection((IStructuredSelection) select, user_treeViewer);
				if (object instanceof BTSUserGroup)
				{
					if (observableLisAllUserGroups == null) {
						loadAllUserGroups();
					}
					observableLisAllUserGroups.add(object);
					dirtyUserGroups.add((BTSUserGroup) object);
				}
				user_treeViewer.setSelection(select);
			}
		});

	}
}
