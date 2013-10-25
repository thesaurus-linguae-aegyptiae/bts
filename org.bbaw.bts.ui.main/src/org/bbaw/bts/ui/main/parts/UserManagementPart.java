package org.bbaw.bts.ui.main.parts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSCorpusObject;
import org.bbaw.bts.btsmodel.BTSIdentifiableItem;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.BTSProject;
import org.bbaw.bts.btsmodel.BTSProjectDBCollection;
import org.bbaw.bts.btsmodel.BTSTCObject;
import org.bbaw.bts.btsmodel.BTSUser;
import org.bbaw.bts.btsmodel.BTSUserGroup;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.btsmodel.BtsmodelPackage;
import org.bbaw.bts.btsviewmodel.BtsviewmodelFactory;
import org.bbaw.bts.btsviewmodel.BtsviewmodelPackage;
import org.bbaw.bts.btsviewmodel.TreeNodeWrapper;
import org.bbaw.bts.commons.BTSPluginIDs;
import org.bbaw.bts.core.controller.dialogControllers.UserManagerController;
import org.bbaw.bts.core.controller.generalController.BTSProjectController;
import org.bbaw.bts.searchModel.BTSQueryResultAbstract;
import org.bbaw.bts.ui.commons.controldecoration.BackgroundControlDecorationSupport;
import org.bbaw.bts.ui.commons.validator.StringEmailAddressValidator;
import org.bbaw.bts.ui.commons.validator.StringHttp_s_URLValidator;
import org.bbaw.bts.ui.commons.validator.StringNotEmptyValidator;
import org.bbaw.bts.ui.main.handlers.CreateNewUserGroupHandler;
import org.bbaw.bts.ui.main.wizards.newProject.EditDBCollectionDialog;
import org.eclipse.core.commands.ParameterizedCommand;
import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.e4.core.commands.ECommandService;
import org.eclipse.e4.core.commands.EHandlerService;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.EventTopic;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.di.UISynchronize;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.EMFUpdateValueStrategy;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.emf.databinding.edit.EMFEditProperties;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Composite;
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
import org.eclipse.wb.swt.SWTResourceManager;

public class UserManagementPart
{

	private static final int DELAY = 400;

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

	private Map<BTSIdentifiableItem, EditingDomain> editingDomainMap = new HashMap<BTSIdentifiableItem, EditingDomain>();

	private ToolItem user_ToolcreateGroup;

	private ToolItem user_ToolDeleteGroup;

	private ToolItem user_ToolUndo;

	private ToolItem user_ToolRedo;

	private Adapter globalChangeListener;

	private Link linkCreateNewUser_Group;
	private Composite composite;
	private ToolBar toolBar_1;

	private SashForm roles_sashForm;

	private Composite roles_composite_Left;

	private TreeViewer roles_treeViewer;

	private Composite roles_composite_right;

	private ISelectionChangedListener roles_selectionListener;

	private BTSProject selectedProject;

	private BTSProjectDBCollection selectedDBCollection;

	private List<BTSProject> projects;

	private TreeNodeWrapper roles_root;
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

		Composite container = new Composite(parent, SWT.NONE);
		container.setLayoutData(new GridData(GridData.FILL_BOTH)); // ######## cp: aukommentiert für windowbuilder
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
		user_ToolcreateGroup.setText("New Group");
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
		user_ToolDeleteGroup.setText("Delete");
		user_ToolDeleteGroup.addSelectionListener(new SelectionAdapter()
		{

			@Override
			public void widgetSelected(SelectionEvent e)
			{

			}
		});

		user_ToolUndo = new ToolItem(toolBar, SWT.NONE);
		user_ToolUndo.setText("Undo");
		user_ToolUndo.addSelectionListener(new SelectionAdapter()
		{

			@Override
			public void widgetSelected(SelectionEvent e)
			{
				getEditingDomain(selectedTreeObject).getCommandStack().undo();

			}
		});

		user_ToolRedo = new ToolItem(toolBar, SWT.NONE);
		user_ToolRedo.setText("Redo");
		user_ToolRedo.addSelectionListener(new SelectionAdapter()
		{

			@Override
			public void widgetSelected(SelectionEvent e)
			{
				getEditingDomain(selectedTreeObject).getCommandStack().redo();

			}
		});

		user_sashForm = new SashForm(user_composite, SWT.NONE);
		user_sashForm.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

		Composite composite_left = new Composite(user_sashForm, SWT.NONE);
		composite_left.setLayout(new GridLayout(2, false));

		Label lblUserGroups = new Label(composite_left, SWT.NONE);
		lblUserGroups.setText("User Groups");
		new Label(composite_left, SWT.NONE);

		user_tree = new Tree(composite_left, SWT.BORDER);
		user_tree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
		user_treeViewer = new TreeViewer(user_tree);

		composite_right = new Composite(user_sashForm, SWT.NONE);
		composite_right.setLayout(new FillLayout(SWT.HORIZONTAL));

		user_sashForm.setWeights(new int[] { 1, 1 });

		////////////////roles
		roles_tabItem = new TabItem(tabFolder, SWT.NONE);
		roles_tabItem.setText("Administrate User Roles and Rights");

		roles_composite = new Composite(tabFolder, SWT.NONE);
		roles_tabItem.setControl(roles_composite);
		roles_composite.setLayout(new GridLayout(1, false));

		composite = new Composite(roles_composite, SWT.NONE);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
		composite.setLayout(new RowLayout(SWT.HORIZONTAL));

		toolBar_1 = new ToolBar(composite, SWT.FLAT | SWT.RIGHT);

		roles_sashForm = new SashForm(roles_composite, SWT.NONE);
		roles_sashForm.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

		roles_composite_Left = new Composite(roles_sashForm, SWT.NONE);
		roles_composite_Left.setLayout(new GridLayout(1, false));

		Label lblDatabaseCollectionsAnd = new Label(roles_composite_Left, SWT.NONE);
		lblDatabaseCollectionsAnd.setText("Database collections and associated users and their editing rights");

		Label lblFirstLevelProjects = new Label(roles_composite_Left, SWT.NONE);
		lblFirstLevelProjects.setText("First Level: Projects, Second: DB Collections, Thrid: User Roles, Fourth: User");

		roles_treeViewer = new TreeViewer(roles_composite_Left, SWT.BORDER);
		Tree roles_tree = roles_treeViewer.getTree();
		roles_tree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

		roles_composite_right = new Composite(roles_sashForm, SWT.NONE);
		roles_composite_right.setLayout(new GridLayout(2, false));

		lblProject = new Label(roles_composite_right, SWT.NONE);
		lblProject.setFont(SWTResourceManager.getFont("Tahoma", 8, SWT.BOLD));
		lblProject.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, true, false, 2, 1));
		lblProject.setText("Project");

		lblProjectId = new Label(roles_composite_right, SWT.NONE);
		lblProjectId.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblProjectId.setText("Project ID");

		roles_project_id_text = new Text(roles_composite_right, SWT.BORDER);
		roles_project_id_text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		roles_project_id_text.setEditable(false);

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
		roles_project_prefix_text.setEditable(false);

		lblDescription_1 = new Label(roles_composite_right, SWT.NONE);
		lblDescription_1.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblDescription_1.setText("Description");

		roles_project_desc_text = new Text(roles_composite_right, SWT.BORDER);
		roles_project_desc_text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		roles_project_addColl_link = new Link(roles_composite_right, SWT.NONE);
		roles_project_addColl_link.setLayoutData(new GridData(SWT.LEFT, SWT.BOTTOM, false, true, 2, 1));
		roles_project_addColl_link.setText("<a>Add Database Collection</a>");
		new Label(roles_composite_right, SWT.NONE);
		roles_sashForm.setWeights(new int[] { 1, 1 });
		loadUserTree();
		loadRolesTree();
	}

	private void loadUserTree()
	{
		ComposedAdapterFactory factory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

		// BtsviewmodelAdapterFactory factory = new
		// BtsviewmodelAdapterFactory();
		AdapterFactoryLabelProvider labelProvider = new AdapterFactoryLabelProvider(factory);
		AdapterFactoryContentProvider contentProvider = new AdapterFactoryContentProvider(factory);
		user_treeViewer.setContentProvider(contentProvider);
		user_treeViewer.setLabelProvider(labelProvider);
		user_selectionListener = new ISelectionChangedListener()
		{

			private BTSCorpusObject selectedTreeObject;

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
		user_treeViewer.setSorter(new ViewerSorter()
		{
		});
		// Create sample data
		userGroups = new ArrayList<BTSUserGroup>();

		userGroups = userManagerController.listUserGroups();
		user_root = BtsviewmodelFactory.eINSTANCE.createTreeNodeWrapper();
		if (userGroups != null)
		{
			for (BTSUserGroup o : userGroups)
			{
				TreeNodeWrapper child = BtsviewmodelFactory.eINSTANCE.createTreeNodeWrapper();
				child.setObject(o);
				child.setChildrenLoaded(false);
				user_root.getChildren().add(child);
				user_root.setChildrenLoaded(true);
			}
		}

		// Set the writeableList as input for the viewer
		user_treeViewer.setInput(user_root);

	}

	private void loadChildren(final List<TreeNodeWrapper> parents, TreeViewer treeviewer, boolean includeGrandChildren)
	{
		Job job = new Job("load children")
		{
			@Override
			protected IStatus run(IProgressMonitor monitor)
			{
				final List<TreeNodeWrapper> grandChildren = new Vector<>();
				for (final TreeNodeWrapper parent : parents)
				{
					final List<BTSUser> children = userManagerController.findGroupMembers(
							(BTSUserGroup) parent.getObject(), queryResultMap, user_treeViewer, parent,
							BtsviewmodelPackage.Literals.TREE_NODE_WRAPPER__CHILDREN);
					// If you want to update the UI
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
				}
				// loadChildren(grandChildren, false);

				return Status.OK_STATUS;
			}
		};
		// Start the Job
		job.schedule();
		refreshTreeViewer(treeviewer, null);
	}

	private void loadRolesTree()
	{
		ComposedAdapterFactory factory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

		// BtsviewmodelAdapterFactory factory = new
		// BtsviewmodelAdapterFactory();
		AdapterFactoryLabelProvider labelProvider = new AdapterFactoryLabelProvider(factory);
		AdapterFactoryContentProvider contentProvider = new AdapterFactoryContentProvider(factory);
		roles_treeViewer.setContentProvider(contentProvider);
		roles_treeViewer.setLabelProvider(labelProvider);
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
		roles_treeViewer.setSorter(new ViewerSorter()
		{
		});
		// Create sample data
		projects = projectController.listProjects();

		roles_root = BtsviewmodelFactory.eINSTANCE.createTreeNodeWrapper();
		if (projects != null)
		{
			for (BTSProject o : projects)
			{
				TreeNodeWrapper child = BtsviewmodelFactory.eINSTANCE.createTreeNodeWrapper();
				child.setObject(o);
				child.setChildrenLoaded(true);
				roles_root.getChildren().add(child);
				roles_root.setChildrenLoaded(true);
			}
		}

		// Set the writeableList as input for the viewer
		roles_treeViewer.setInput(roles_root);

	}

	private TreeNodeWrapper wrappObject(BTSObject o)
	{
		return BtsviewmodelFactory.eINSTANCE.wrappObject(o);
	}

	private void refreshTreeViewer(final TreeViewer treeviewer, final BTSTCObject object)
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
			}
		} else if (selection2.getFirstElement() instanceof BTSUser)
		{
			selectedUser = (BTSUser) selection2.getFirstElement();
			selectedTreeObject = selectedUser;
			loadUserEditComposite(selectedUser);
		}

	}

	private void handleRolesTreeSelection(IStructuredSelection selection, TreeViewer treeViewer)
	{
		if (selection.getFirstElement() instanceof TreeNodeWrapper)
		{
			TreeNodeWrapper tn = (TreeNodeWrapper) selection.getFirstElement();

			if (tn.getObject() instanceof BTSProject)
			{

				selectedProject = (BTSProject) tn.getObject();
				loadProjectEditComposite(selectedProject);
				enableUndoRedo(selectedProject);
			}

		}
		if (selection.getFirstElement() instanceof BTSProjectDBCollection)
		{
			selectedDBCollection = (BTSProjectDBCollection) selection.getFirstElement();
			loadUserEditComposite(selectedUser);
			enableUndoRedo(selectedTreeObject);
		}
		if (selectedTreeObject == null || !selectedTreeObject.equals(selection.getFirstElement()))
		{
			BTSIdentifiableItem oldSelection = selectedTreeObject;
			selectedTreeObject = (BTSIdentifiableItem) selection.getFirstElement();
			manageDomainListeners(oldSelection, selectedTreeObject);
		}

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
		lblProject.setFont(SWTResourceManager.getFont("Tahoma", 8, SWT.BOLD));
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
		lblConntectionType.setText("Conntection Type");

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
					roles_treeViewer.refresh();
				}

			}
		});

		project_bindingContext = initializeProjectBindings(project);

		roles_sashForm.setWeights(new int[] { 1, 1 });
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
				WidgetProperties.text(SWT.Modify).observeDelayed(DELAY, roles_project_id_text), model_id, null, null);
		bindingContext.addValidationStatusProvider(binding_id);

		// project name
		EMFUpdateValueStrategy us_n = new EMFUpdateValueStrategy();
		us_n.setBeforeSetValidator(new StringNotEmptyValidator("Project name is required."));

		IObservableValue model_n = EMFEditProperties.value(editingDomain, BtsmodelPackage.Literals.BTS_OBJECT__NAME)
				.observe(project);
		Binding binding_n = bindingContext.bindValue(
				WidgetProperties.text(SWT.Modify).observeDelayed(DELAY, roles_project_name_text), model_n, us_n, null);
		bindingContext.addValidationStatusProvider(binding_n);
		BackgroundControlDecorationSupport.create(binding_n, SWT.TOP | SWT.LEFT);

		// project prefix

		IObservableValue model_p = EMFProperties.value(BtsmodelPackage.Literals.BTS_PROJECT__PREFIX).observe(project);
		Binding binding_p = bindingContext
				.bindValue(WidgetProperties.text(SWT.Modify).observeDelayed(DELAY, roles_project_prefix_text), model_p,
						null, null);
		bindingContext.addValidationStatusProvider(binding_p);

		// project description

		IObservableValue model_ds = EMFEditProperties.value(editingDomain,
				BtsmodelPackage.Literals.BTS_PROJECT__DESCRIPTION).observe(project);
		Binding binding_ds = bindingContext.bindValue(
				WidgetProperties.text(SWT.Modify).observeDelayed(DELAY, roles_project_desc_text), model_ds, null, null);
		bindingContext.addValidationStatusProvider(binding_ds);

		//project connection
		FeaturePath feature = FeaturePath.fromList(BtsmodelPackage.Literals.BTS_PROJECT__DB_CONNECTION,
				BtsmodelPackage.Literals.BTSDB_CONNECTION__TYPE);

		IObservableValue model = EMFEditProperties.value(editingDomain, feature).observe(project);
		Binding binding = bindingContext.bindValue(
				WidgetProperties.text(SWT.Modify).observeDelayed(DELAY, roles_project_Connectiontype), model, null,
				null);
		bindingContext.addValidationStatusProvider(binding);

		// server url
		EMFUpdateValueStrategy us_su = new EMFUpdateValueStrategy();
		us_su.setBeforeSetValidator(new StringHttp_s_URLValidator("Valid URL required.", true));
		FeaturePath feature2 = FeaturePath.fromList(BtsmodelPackage.Literals.BTS_PROJECT__DB_CONNECTION,
				BtsmodelPackage.Literals.BTSDB_CONNECTION__MASTER_SERVER);
		IObservableValue model2 = EMFEditProperties.value(editingDomain, feature2).observe(project);
		Binding binding2 = bindingContext.bindValue(
				WidgetProperties.text(SWT.Modify).observeDelayed(DELAY, roles_project_remote_url), model2, us_su, null);
		bindingContext.addValidationStatusProvider(binding2);

		FeaturePath feature3 = FeaturePath.fromList(BtsmodelPackage.Literals.BTS_PROJECT__DB_CONNECTION,
				BtsmodelPackage.Literals.BTSDB_CONNECTION__DB_PATH);
		IObservableValue model3 = EMFEditProperties.value(editingDomain, feature3).observe(project);
		Binding binding3 = bindingContext.bindValue(
				WidgetProperties.text(SWT.Modify).observeDelayed(DELAY, roles_project_textdbPath), model3, null, null);
		bindingContext.addValidationStatusProvider(binding3);
		return bindingContext;
	}

	private void manageDomainListeners(BTSIdentifiableItem oldSelection, BTSIdentifiableItem currentSelection)
	{
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

				}

			};

		}
		return globalChangeListener;
	}

	private void enableUndoRedo(BTSIdentifiableItem object)
	{

		user_ToolUndo.setEnabled(getEditingDomain(object).getCommandStack().canUndo());
		user_ToolRedo.setEnabled(getEditingDomain(object).getCommandStack().canRedo());

	}

	private Composite loadUserEditComposite(BTSUser user)
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
		lblUser.setFont(SWTResourceManager.getFont("Tahoma", 8, SWT.BOLD));

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
		lblWebDescriptin.setText("Web Descriptin");

		textWebDesc_User = new Text(composite_UserEdit, SWT.BORDER);
		textWebDesc_User.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Label lblSigle = new Label(composite_UserEdit, SWT.NONE);
		lblSigle.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblSigle.setText("Sigle");

		textSigle_User = new Text(composite_UserEdit, SWT.BORDER);
		textSigle_User.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Label lblComment_1 = new Label(composite_UserEdit, SWT.NONE);
		lblComment_1.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblComment_1.setText("Comment");

		textComment_User = new Text(composite_UserEdit, SWT.BORDER);
		textComment_User.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Label lblNewLabel = new Label(composite_UserEdit, SWT.NONE);
		new Label(composite_UserEdit, SWT.NONE);

		Group grpLogin = new Group(composite_UserEdit, SWT.NONE);
		grpLogin.setLayout(new GridLayout(2, false));
		grpLogin.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 2, 1));
		grpLogin.setText("Login - (Username cannot be changed)");

		Label lblUsername = new Label(grpLogin, SWT.NONE);
		lblUsername.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblUsername.setText("Username");

		textUserName_User = new Text(grpLogin, SWT.BORDER);
		textUserName_User.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		textUserName_User.setEditable(false);

		Label lblPassword = new Label(grpLogin, SWT.NONE);
		lblPassword.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblPassword.setText("Password");

		textPassword_User = new Text(grpLogin, SWT.BORDER);
		textPassword_User.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

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
		IObservableValue model_id = EMFEditProperties.value(editingDomain,
				BtsmodelPackage.Literals.BTS_IDENTIFIABLE_ITEM__ID).observe(user);
		Binding binding_id = bindingContext.bindValue(
				WidgetProperties.text(SWT.Modify).observeDelayed(DELAY, labelId_User), model_id, null, null);
		bindingContext.addValidationStatusProvider(binding_id);

		// forename
		EMFUpdateValueStrategy us_fn = new EMFUpdateValueStrategy();
		us_fn.setBeforeSetValidator(new StringNotEmptyValidator("Forename is required."));

		IObservableValue model_fn = EMFEditProperties
				.value(editingDomain, BtsmodelPackage.Literals.BTS_USER__FORE_NAME).observe(user);
		Binding binding_fn = bindingContext.bindValue(
				WidgetProperties.text(SWT.Modify).observeDelayed(DELAY, textForeName_User), model_fn, us_fn, null);
		bindingContext.addValidationStatusProvider(binding_fn);
		BackgroundControlDecorationSupport.create(binding_fn, SWT.TOP | SWT.LEFT);

		//surename
		EMFUpdateValueStrategy us_sn = new EMFUpdateValueStrategy();
		us_sn.setBeforeSetValidator(new StringNotEmptyValidator("Surname is required."));
		IObservableValue model_sn = EMFEditProperties
				.value(editingDomain, BtsmodelPackage.Literals.BTS_USER__SURE_NAME).observe(user);
		Binding binding_sn = bindingContext.bindValue(
				WidgetProperties.text(SWT.Modify).observeDelayed(DELAY, textSurName_User), model_sn, us_sn, null);
		bindingContext.addValidationStatusProvider(binding_sn);
		BackgroundControlDecorationSupport.create(binding_sn, SWT.TOP | SWT.LEFT);

		//email
		EMFUpdateValueStrategy us_em = new EMFUpdateValueStrategy();
		us_em.setBeforeSetValidator(new StringEmailAddressValidator(true));
		IObservableValue model_em = EMFEditProperties.value(editingDomain, BtsmodelPackage.Literals.BTS_USER__MAIL)
				.observe(user);
		Binding binding_em = bindingContext.bindValue(
				WidgetProperties.text(SWT.Modify).observeDelayed(DELAY, textEmail_User), model_em, us_em, null);
		bindingContext.addValidationStatusProvider(binding_em);
		BackgroundControlDecorationSupport.create(binding_em, SWT.TOP | SWT.LEFT);

		//website
		EMFUpdateValueStrategy us_ws = new EMFUpdateValueStrategy();
		us_ws.setBeforeSetValidator(new StringHttp_s_URLValidator(true));
		IObservableValue model_ws = EMFEditProperties.value(editingDomain, BtsmodelPackage.Literals.BTS_USER__WEB_URL)
				.observe(user);
		Binding binding_ws = bindingContext.bindValue(
				WidgetProperties.text(SWT.Modify).observeDelayed(DELAY, textWebsite_User), model_ws, us_ws, null);
		bindingContext.addValidationStatusProvider(binding_ws);
		BackgroundControlDecorationSupport.create(binding_ws, SWT.TOP | SWT.LEFT);

		//descritpion
		IObservableValue model_de = EMFEditProperties.value(editingDomain,
				BtsmodelPackage.Literals.BTS_USER__DESCRIPTION).observe(user);
		Binding binding_de = bindingContext.bindValue(
				WidgetProperties.text(SWT.Modify).observeDelayed(DELAY, textDesc_User), model_de, null, null);
		bindingContext.addValidationStatusProvider(binding_de);

		//web description
		IObservableValue model_wd = EMFEditProperties.value(editingDomain,
				BtsmodelPackage.Literals.BTS_USER__WEB_DESCRIPTION).observe(user);
		Binding binding_wd = bindingContext.bindValue(
				WidgetProperties.text(SWT.Modify).observeDelayed(DELAY, textWebDesc_User), model_wd, null, null);
		bindingContext.addValidationStatusProvider(binding_wd);

		// sigl
		IObservableValue model_si = EMFEditProperties.value(editingDomain, BtsmodelPackage.Literals.BTS_USER__SIGLE)
				.observe(user);
		Binding binding_si = bindingContext.bindValue(
				WidgetProperties.text(SWT.Modify).observeDelayed(DELAY, textSigle_User), model_si, null, null);
		bindingContext.addValidationStatusProvider(binding_si);

		// comment
		IObservableValue model_co = EMFEditProperties.value(editingDomain, BtsmodelPackage.Literals.BTS_USER__COMMENT)
				.observe(user);
		Binding binding_co = bindingContext.bindValue(
				WidgetProperties.text(SWT.Modify).observeDelayed(DELAY, textComment_User), model_co, null, null);
		bindingContext.addValidationStatusProvider(binding_co);

		// comment
		IObservableValue model_us = EMFEditProperties
				.value(editingDomain, BtsmodelPackage.Literals.BTS_USER__USER_NAME).observe(user);
		Binding binding_us = bindingContext.bindValue(
				WidgetProperties.text(SWT.Modify).observeDelayed(DELAY, textUserName_User), model_us, null, null);
		bindingContext.addValidationStatusProvider(binding_us);
		return bindingContext;
	}

	private EditingDomain getEditingDomain(BTSIdentifiableItem user)
	{
		if (editingDomainMap.containsKey(user))
		{
			return editingDomainMap.get(user);
		}
		ComposedAdapterFactory factory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

		AdapterFactoryEditingDomain domain = new AdapterFactoryEditingDomain(factory, new BasicCommandStack());
		//		EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(user);
		editingDomainMap.put(user, domain);
		return domain;
	}

	private Composite loadGroupEditComposite(final BTSUserGroup group)
	{
		composite_right.dispose();
		composite_right = null;
		composite_right = new Composite(user_sashForm, SWT.NONE);
		composite_right.setLayout(new FillLayout(SWT.HORIZONTAL));

		Composite composite_GroupEdit = new Composite(composite_right, SWT.NONE);
		composite_GroupEdit.setLayout(new GridLayout(2, false));
		((GridLayout) composite_GroupEdit.getLayout()).horizontalSpacing = 10;

		Label lblUserGroup = new Label(composite_GroupEdit, SWT.NONE);
		lblUserGroup.setAlignment(SWT.CENTER);
		lblUserGroup.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 2, 1));
		lblUserGroup.setText("User Group");
		lblUserGroup.setFont(SWTResourceManager.getFont("Tahoma", 8, SWT.BOLD));

		Label idOfGroup = new Label(composite_GroupEdit, SWT.NONE);
		idOfGroup.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		idOfGroup.setText("ID of Group");

		labelId_Group = new Text(composite_GroupEdit, SWT.BORDER);
		labelId_Group.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		labelId_Group.setEditable(false);

		Label lblNameOfGroup = new Label(composite_GroupEdit, SWT.NONE);
		lblNameOfGroup.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNameOfGroup.setText("Name of Group");

		textName_Group = new Text(composite_GroupEdit, SWT.BORDER);
		textName_Group.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Label lblTypeOfGroup = new Label(composite_GroupEdit, SWT.NONE);
		lblTypeOfGroup.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblTypeOfGroup.setText("Type of Group");

		textType_Group = new Text(composite_GroupEdit, SWT.BORDER);
		textType_Group.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(composite_GroupEdit, SWT.NONE);
		new Label(composite_GroupEdit, SWT.NONE);

		Label lblComment = new Label(composite_GroupEdit, SWT.NONE);
		lblComment.setText("Comment");

		new Label(composite_GroupEdit, SWT.NONE);

		textComment_Group = new Text(composite_GroupEdit, SWT.BORDER);
		textComment_Group.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));

		new Label(composite_GroupEdit, SWT.NONE);
		new Label(composite_GroupEdit, SWT.NONE);

		Label lblcreateUser_Group = new Label(composite_GroupEdit, SWT.NONE);
		lblcreateUser_Group.setLayoutData(new GridData(SWT.LEFT, SWT.BOTTOM, false, true, 2, 1));
		lblcreateUser_Group.setText("Create new User: Enter Username");

		textCreateNewUser_Group = new Text(composite_GroupEdit, SWT.BORDER);
		textCreateNewUser_Group.setLayoutData(new GridData(SWT.FILL, SWT.BOTTOM, true, false, 2, 1));
		textCreateNewUser_Group.addKeyListener(new KeyAdapter()
		{

			@Override
			public void keyPressed(KeyEvent e)
			{
				if (e.keyCode == SWT.CR)
				{
					createNewUser(selectedTreeNode, group, textCreateNewUser_Group.getText());
				}
			}
		});
		textCreateNewUser_Group.addModifyListener(new ModifyListener()
		{

			@Override
			public void modifyText(ModifyEvent e)
			{
				linkCreateNewUser_Group.setEnabled((textCreateNewUser_Group.getText().trim().length() > 0));
			}
		});

		linkCreateNewUser_Group = new Link(composite_GroupEdit, SWT.NONE);
		linkCreateNewUser_Group.setText("<a>Create new User</a>");
		linkCreateNewUser_Group.addSelectionListener(new SelectionAdapter()
		{

			@Override
			public void widgetSelected(SelectionEvent e)
			{
				createNewUser(selectedTreeNode, group, textCreateNewUser_Group.getText());
			}
		});
		linkCreateNewUser_Group.setEnabled((textCreateNewUser_Group.getText().trim().length() > 0));

		user_sashForm.setWeights(new int[] { 1, 1 });
		user_sashForm.layout();
		user_composite.layout();

		user_group_bindingContext = initializeUserGoupBindings(group);
		return composite_GroupEdit;
	}

	private void createNewUser(TreeNodeWrapper parentNodeWrapper, BTSUserGroup group, String userName)
	{
		BTSUser user = userManagerController.createNewUser(userName);
		user.getGroupIds().add(group.get_id());
		TreeNodeWrapper tn = BtsviewmodelFactory.eINSTANCE.createTreeNodeWrapper();
		tn.setObject(user);
		tn.setParent(parentNodeWrapper);
		parentNodeWrapper.getChildren().add(tn);
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
				WidgetProperties.text(SWT.Modify).observeDelayed(DELAY, labelId_Group), model_id, us, null);
		bindingContext.addValidationStatusProvider(binding_id);

		// name
		IObservableValue model = EMFEditProperties.value(editingDomain, BtsmodelPackage.Literals.BTS_OBJECT__NAME)
				.observe(group);
		Binding binding = bindingContext.bindValue(
				WidgetProperties.text(SWT.Modify).observeDelayed(DELAY, textName_Group), model, us, null);
		BackgroundControlDecorationSupport.create(binding, SWT.TOP | SWT.LEFT);
		bindingContext.addValidationStatusProvider(binding);

		//type
		IObservableValue model2 = EMFEditProperties.value(editingDomain, BtsmodelPackage.Literals.BTS_OBJECT__TYPE)
				.observe(group);
		Binding binding2 = bindingContext.bindValue(
				WidgetProperties.text(SWT.Modify).observeDelayed(DELAY, textType_Group), model2, us, null);
		bindingContext.addValidationStatusProvider(binding2);

		// comment
		IObservableValue model3 = EMFEditProperties.value(editingDomain,
				BtsmodelPackage.Literals.BTS_USER_GROUP__COMMENT).observe(group);
		Binding binding3 = bindingContext.bindValue(
				WidgetProperties.text(SWT.Modify).observeDelayed(DELAY, textComment_Group), model3, us, null);
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
			}
		});

	}
}
