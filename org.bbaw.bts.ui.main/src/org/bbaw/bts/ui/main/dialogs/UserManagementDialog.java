package org.bbaw.bts.ui.main.dialogs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSCorpusObject;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.BTSTCObject;
import org.bbaw.bts.btsmodel.BTSUser;
import org.bbaw.bts.btsmodel.BTSUserGroup;
import org.bbaw.bts.btsmodel.BtsmodelPackage;
import org.bbaw.bts.btsviewmodel.BtsviewmodelFactory;
import org.bbaw.bts.btsviewmodel.BtsviewmodelPackage;
import org.bbaw.bts.btsviewmodel.TreeNodeWrapper;
import org.bbaw.bts.core.controller.dialogControllers.UserManagerController;
import org.bbaw.bts.searchModel.BTSQueryResultAbstract;
import org.bbaw.bts.ui.commons.controldecoration.BackgroundControlDecorationSupport;
import org.bbaw.bts.ui.commons.validator.StringEmailAddressValidator;
import org.bbaw.bts.ui.commons.validator.StringHttp_s_URLValidator;
import org.bbaw.bts.ui.commons.validator.StringNotEmptyValidator;
import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.e4.ui.di.UISynchronize;
import org.eclipse.emf.databinding.EMFUpdateValueStrategy;
import org.eclipse.emf.databinding.edit.EMFEditProperties;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.wb.swt.SWTResourceManager;

public class UserManagementDialog extends TitleAreaDialog
{
	private static final int DELAY = 0;

	@Inject
	private UserManagerController userManagerController;

	@Inject
	private UISynchronize sync;
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
	private TreeNodeWrapper root;
	private BTSUser selectedUser;
	private BTSUserGroup selectedGroup;
	private SashForm user_sashForm;
	private BTSCorpusObject selectedTreeObject;
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

	private Map<BTSObject, EditingDomain> editingDomainMap = new HashMap<BTSObject, EditingDomain>();

	@Override
	public void create()
	{
		// TODO Auto-generated method stub
		super.create();
		dialogArea.addListener(SWT.Traverse, new Listener()
		{
			@Override
			public void handleEvent(final Event e)
			{
				if (e.detail == SWT.TRAVERSE_ESCAPE)
				{
					e.doit = false;
				}
			}
		});

	}

	/**
	 * Create the dialog with default constructor.
	 * 
	 * @wbp.parser.constructor
	 */
	public UserManagementDialog()
	{
		super(new Shell());
		System.out.println("construct UserManagementDialog");

	}

	/**
	 * Create the dialog.
	 * 
	 * @param parentShell
	 */
	public UserManagementDialog(Shell parentShell)
	{
		super(parentShell);
	}

	/**
	 * Create contents of the dialog.
	 * 
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent)
	{

		Composite area = (Composite) super.createDialogArea(parent);
		Composite container = new Composite(area, SWT.NONE);
		container.setLayout(new FillLayout(SWT.HORIZONTAL));
		container.setLayoutData(new GridData(GridData.FILL_BOTH));

		tabFolder = new TabFolder(container, SWT.NONE);

		user_tabItem = new TabItem(tabFolder, SWT.NONE);
		user_tabItem.setText("Manage Users and User Groups");

		user_composite = new Composite(tabFolder, SWT.NONE);
		user_tabItem.setControl(user_composite);

		user_sashForm = new SashForm(user_composite, SWT.NONE);
		user_sashForm.setLocation(0, 0);
		user_sashForm.setSize(771, 400);

		Composite composite_left = new Composite(user_sashForm, SWT.NONE);
		composite_left.setLayout(new GridLayout(2, false));

		Label lblUserGroups = new Label(composite_left, SWT.NONE);
		lblUserGroups.setText("User Groups");
		new Label(composite_left, SWT.NONE);

		user_tree = new Tree(composite_left, SWT.BORDER);
		user_tree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
		user_treeViewer = new TreeViewer(user_tree);

		Composite user_composite_lowerLeft = new Composite(composite_left, SWT.NONE);
		user_composite_lowerLeft.setLayout(new RowLayout(SWT.HORIZONTAL));

		Link link_createGroup = new Link(user_composite_lowerLeft, SWT.NONE);
		link_createGroup.setText("<a>Create New Group</a>");

		Link link_DeleteGroup = new Link(user_composite_lowerLeft, SWT.NONE);
		link_DeleteGroup.setText("<a>Delete Group</a>");
		new Label(composite_left, SWT.NONE);

		composite_right = new Composite(user_sashForm, SWT.NONE);
		composite_right.setLayout(new FillLayout(SWT.HORIZONTAL));

		user_sashForm.setWeights(new int[] { 1, 1 });

		roles_tabItem = new TabItem(tabFolder, SWT.NONE);
		roles_tabItem.setText("Administrate User Roles and Rights");

		roles_composite = new Composite(tabFolder, SWT.NONE);
		roles_tabItem.setControl(roles_composite);
		roles_composite.setLayout(new FillLayout(SWT.HORIZONTAL));

		SashForm roles_sashForm = new SashForm(roles_composite, SWT.NONE);

		Composite roles_composite_Left = new Composite(roles_sashForm, SWT.NONE);
		roles_composite_Left.setLayout(new GridLayout(1, false));

		Label lblDatabaseCollectionsAnd = new Label(roles_composite_Left, SWT.NONE);
		lblDatabaseCollectionsAnd.setText("Database collections and associated users and their editing rights");

		Label lblFirstLevelProjects = new Label(roles_composite_Left, SWT.NONE);
		lblFirstLevelProjects.setText("First Level: Projects, Second: DB Collections, Thrid: User Roles, Fourth: User");

		TreeViewer roles_treeViewer = new TreeViewer(roles_composite_Left, SWT.BORDER);
		Tree roles_tree = roles_treeViewer.getTree();
		roles_tree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

		Composite roles_composite_lowerleft = new Composite(roles_composite_Left, SWT.NONE);

		Composite roles_composite_right = new Composite(roles_sashForm, SWT.NONE);
		roles_sashForm.setWeights(new int[] { 1, 1 });
		loadTree();
		return area;
	}

	private void loadTree()
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
				handleTreeSelection(selection, user_treeViewer);

			}

		};

		user_treeViewer.addSelectionChangedListener(user_selectionListener);
		user_treeViewer.setSorter(new ViewerSorter()
		{
		});
		// Create sample data
		userGroups = new ArrayList<BTSUserGroup>();

		userGroups = userManagerController.listUserGroups();
		root = BtsviewmodelFactory.eINSTANCE.createTreeNodeWrapper();
		if (userGroups != null)
		{
			for (BTSUserGroup o : userGroups)
			{
				TreeNodeWrapper child = BtsviewmodelFactory.eINSTANCE.createTreeNodeWrapper();
				child.setObject(o);
				child.setChildrenLoaded(false);
				root.getChildren().add(child);
				root.setChildrenLoaded(true);
			}
		}

		// Set the writeableList as input for the viewer
		user_treeViewer.setInput(root);

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
								TreeNodeWrapper tn = BtsviewmodelFactory.eINSTANCE.createTreeNodeWrapper();
								tn.setObject(o);
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

	private void refreshTreeViewer(final TreeViewer treeviewer, final BTSTCObject object)
	{
		sync.asyncExec(new Runnable()
		{
			public void run()
			{
				treeviewer.removeSelectionChangedListener(user_selectionListener);
				for (TreePath path : treeviewer.getExpandedTreePaths())
					System.out.println(path.getLastSegment());
				treeviewer.refresh();
				treeviewer.addSelectionChangedListener(user_selectionListener);
			}
		});

	}

	private void handleTreeSelection(StructuredSelection selection, TreeViewer treeViewer)
	{
		if (selection.getFirstElement() instanceof TreeNodeWrapper)
		{
			TreeNodeWrapper tn = (TreeNodeWrapper) selection.getFirstElement();

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
			}
			if (tn.getObject() instanceof BTSUser)
			{
				selectedUser = (BTSUser) tn.getObject();
				loadUserEditComposite(selectedUser);
			}
		} else if (selection.getFirstElement() instanceof BTSUser)
		{
			selectedUser = (BTSUser) selection.getFirstElement();
			loadUserEditComposite(selectedUser);
		}

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

		labelId_User = new Text(composite_UserEdit, SWT.NONE);
		labelId_User.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
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

	private EditingDomain getEditingDomain(BTSObject user)
	{
		if (editingDomainMap.containsKey(user))
		{
			return editingDomainMap.get(user);
		}
		EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(user);
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

		labelId_Group = new Text(composite_GroupEdit, SWT.NONE);
		idOfGroup.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
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
		lblcreateUser_Group.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1));
		lblcreateUser_Group.setText("Create new User: Enter Username");

		textCreateNewUser_Group = new Text(composite_GroupEdit, SWT.BORDER);
		textCreateNewUser_Group.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
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

		Link linkCreateNewUser_Group = new Link(composite_GroupEdit, SWT.NONE);
		linkCreateNewUser_Group.setText("<a>Create new User</a>");
		linkCreateNewUser_Group.addSelectionListener(new SelectionListener()
		{

			@Override
			public void widgetSelected(SelectionEvent e)
			{
				createNewUser(selectedTreeNode, group, textCreateNewUser_Group.getText());

			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e)
			{
				// TODO Auto-generated method stub

			}
		});

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

	/**
	 * Create contents of the button bar.
	 * 
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent)
	{
		createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
		createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
	}

	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize()
	{
		return new Point(785, 581);
	}
}
