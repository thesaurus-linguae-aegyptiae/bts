package org.bbaw.bts.ui.main.dialogs;

import java.util.ArrayList;

import org.bbaw.bts.btsmodel.BTSUser;
import org.bbaw.bts.btsmodel.BTSUserGroup;
import org.bbaw.bts.btsviewmodel.BtsviewmodelFactory;
import org.bbaw.bts.btsviewmodel.TreeNodeWrapper;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Tree;

public class UserManagementDialog extends TitleAreaDialog
{
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
	private Tree tree;
	private TreeViewer treeViewer;
	private Composite composite_right;
	protected StructuredSelection selection;
	private ArrayList<BTSUserGroup> userGroups;
	private TreeNodeWrapper root;
	private BTSUser selectedUser;
	private BTSUserGroup selectedGroup;
	private SashForm sashForm;

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

		sashForm = new SashForm(container, SWT.NONE);

		Composite composite_left = new Composite(sashForm, SWT.NONE);
		composite_left.setLayout(new GridLayout(2, false));

		Label lblUserGroups = new Label(composite_left, SWT.NONE);
		lblUserGroups.setText("User Groups");
		new Label(composite_left, SWT.NONE);

		tree = new Tree(composite_left, SWT.BORDER);
		tree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
		treeViewer = new TreeViewer(tree);

		Composite composite_lowerLeft = new Composite(composite_left, SWT.NONE);
		composite_lowerLeft.setLayout(new GridLayout(1, false));

		Link link_createGroup = new Link(composite_lowerLeft, SWT.NONE);
		link_createGroup.setText("<a>Create New Group</a>");

		Link link_DeleteGroup = new Link(composite_left, SWT.NONE);
		link_DeleteGroup.setText("<a>Delete Group</a>");

		composite_right = new Composite(sashForm, SWT.NONE);
		composite_right.setLayout(new FillLayout(SWT.HORIZONTAL));

		sashForm.setWeights(new int[] { 1, 1 });
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
		treeViewer.setContentProvider(contentProvider);
		treeViewer.setLabelProvider(labelProvider);

		treeViewer.addSelectionChangedListener(new ISelectionChangedListener()
		{

			@Override
			public void selectionChanged(SelectionChangedEvent event)
			{
				selection = (StructuredSelection) event.getSelection();
				handleTreeSelection(selection);

			}

		});
		treeViewer.setSorter(new ViewerSorter()
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
				child.setChildrenLoaded(true);
				root.getChildren().add(child);
				root.setChildrenLoaded(true);
			}
		}

		// Set the writeableList as input for the viewer
		treeViewer.setInput(root);

	}

	private void handleTreeSelection(StructuredSelection selection)
	{
		if (selection.getFirstElement() instanceof TreeNodeWrapper)
		{
			TreeNodeWrapper tn = (TreeNodeWrapper) selection.getFirstElement();
			if (tn.getObject() instanceof BTSUserGroup)
			{
				selectedGroup = (BTSUserGroup) tn.getObject();
				loadGroupEditComposite(selectedGroup);
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
		composite_right = new Composite(sashForm, SWT.NONE);
		composite_right.setLayout(new FillLayout(SWT.HORIZONTAL));

		Composite composite_UserEdit = new Composite(composite_right, SWT.NONE);
		composite_UserEdit.setLayout(new GridLayout(2, false));

		Label lblUser = new Label(composite_UserEdit, SWT.NONE);
		lblUser.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 2, 1));
		lblUser.setText("User");

		Label lblForename = new Label(composite_UserEdit, SWT.NONE);
		lblForename.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblForename.setText("Forename");

		textForeName_User = new Text(composite_UserEdit, SWT.BORDER);
		textForeName_User.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Label lblSurename = new Label(composite_UserEdit, SWT.NONE);
		lblSurename.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblSurename.setText("Surname");

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
		grpLogin.setText("Login");

		Label lblUsername = new Label(grpLogin, SWT.NONE);
		lblUsername.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblUsername.setText("Username");

		textUserName_User = new Text(grpLogin, SWT.BORDER);
		textUserName_User.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Label lblPassword = new Label(grpLogin, SWT.NONE);
		lblPassword.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblPassword.setText("Password");

		textPassword_User = new Text(grpLogin, SWT.BORDER);
		textPassword_User.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Label lblUserRoles = new Label(composite_UserEdit, SWT.NONE);
		lblUserRoles.setText("User Roles");
		new Label(composite_UserEdit, SWT.NONE);

		Label lblUserGroups_1 = new Label(composite_UserEdit, SWT.NONE);
		lblUserGroups_1.setText("User Groups");
		new Label(composite_UserEdit, SWT.NONE);

		return composite_UserEdit;
	}

	private Composite loadGroupEditComposite(BTSUserGroup group)
	{
		composite_right.dispose();
		composite_right = null;
		composite_right = new Composite(sashForm, SWT.NONE);
		composite_right.setLayout(new FillLayout(SWT.HORIZONTAL));

		Composite composite_GroupEdit = new Composite(composite_right, SWT.NONE);
		composite_GroupEdit.setLayout(new GridLayout(2, false));

		Label lblUserGroup = new Label(composite_GroupEdit, SWT.NONE);
		lblUserGroup.setAlignment(SWT.CENTER);
		lblUserGroup.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 2, 1));
		lblUserGroup.setText("User Group");

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
		return composite_GroupEdit;
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
