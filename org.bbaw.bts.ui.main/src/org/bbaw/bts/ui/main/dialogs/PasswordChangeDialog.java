package org.bbaw.bts.ui.main.dialogs;

import java.util.HashSet;
import java.util.Set;

import javax.inject.Inject;
import javax.inject.Named;

import org.bbaw.bts.btsmodel.BTSUser;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.controller.dialogControllers.UserManagerController;
import org.bbaw.bts.core.controller.generalController.BTSUserController;
import org.bbaw.bts.core.controller.generalController.PermissionsAndExpressionsEvaluationController;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.services.log.Logger;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class PasswordChangeDialog extends TitleAreaDialog {
	
	@Inject
	private Logger logger;
	
	private Text oldPasswordText;
	private Text newPasswordText;
	private Text newPasswordTextRepeat;

	@Inject
	@Optional
	private BTSUser user;
	
	@Inject
	@Named(BTSCoreConstants.AUTHENTICATED_USER) 
	private BTSUser authenticatedUser;
	
	@Inject
	private PermissionsAndExpressionsEvaluationController permissionController;
	@Inject
	private UserManagerController userManagerController;
	private boolean authenticatedUserIsAdmin = false;
	
	private boolean repeatOldPassword = true;
	
	@Inject
	private BTSUserController userController;

	/**
	 * Create the dialog.
	 * @param parentShell
	 */
	public PasswordChangeDialog() {
		super(new Shell());
	}
	
	/**
	 * Create the dialog.
	 * @param parentShell
	 */
	public PasswordChangeDialog(Shell parentShell) {
		super(parentShell);
	}

	/**
	 * Create contents of the dialog.
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		authenticatedUserIsAdmin = permissionController.authenticatedUserIsDBAdmin(false);
		if (user == null)
		{
			user = authenticatedUser;
		}
		else if (authenticatedUserIsAdmin)
		{
			repeatOldPassword = false;
		}
		setTitle("Change Password of User: " + user.getUserName());
		
		Composite area = (Composite) super.createDialogArea(parent);
		Composite container = new Composite(area, SWT.NONE);
		container.setLayout(new GridLayout(1, false));
		container.setLayoutData(new GridData(GridData.FILL_BOTH));
		
		if (repeatOldPassword)
		{
			setMessage("Please enter your old password!");

			Composite composite = new Composite(container, SWT.NONE);
			composite.setLayout(new GridLayout(1, false));
			composite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
			
			Label lblNewLabel = new Label(composite, SWT.NONE);
			lblNewLabel.setSize(434, 15);
			lblNewLabel.setText("Please enter your old password.");
			
			oldPasswordText = new Text(composite, SWT.BORDER | SWT.PASSWORD);
			oldPasswordText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
			oldPasswordText.setBounds(0, 0, 76, 21);
		}
		
		Composite composite_1 = new Composite(container, SWT.NONE);
		composite_1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		composite_1.setLayout(new GridLayout(1, false));
		
		Label lblEnterYourNew = new Label(composite_1, SWT.NONE);
		lblEnterYourNew.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		lblEnterYourNew.setText("Enter your new password.");
		
		newPasswordText = new Text(composite_1, SWT.BORDER | SWT.PASSWORD);
		newPasswordText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		newPasswordText.setBounds(0, 0, 76, 21);
		
		Label lblRepeatPassword = new Label(composite_1, SWT.NONE);
		lblRepeatPassword.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		lblRepeatPassword.setBounds(0, 0, 55, 15);
		lblRepeatPassword.setText("Repeat password");
		
		newPasswordTextRepeat = new Text(composite_1, SWT.BORDER | SWT.PASSWORD);
		newPasswordTextRepeat.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		newPasswordTextRepeat.setBounds(0, 0, 76, 21);

		return area;
	}

	/**
	 * Create contents of the button bar.
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createOkButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL,
				true);
		createButton(parent, IDialogConstants.CANCEL_ID,
				IDialogConstants.CANCEL_LABEL, false);
	}

	private Button createOkButton(Composite parent, int id, String label, boolean defaultButton)
	{
		// increment the number of columns in the button bar
		((GridLayout) parent.getLayout()).numColumns++;
		Button button = new Button(parent, SWT.PUSH);
		button.setText(label);
		button.setFont(JFaceResources.getDialogFont());
		button.setData(new Integer(id));
		button.addSelectionListener(new SelectionAdapter()
		{
			public void widgetSelected(SelectionEvent event)
			{
				if (isValidLogin())
				{
					logger.info("Login successful");
					save();

					buttonPressed(((Integer) event.widget.getData()).intValue());
				} else
				{
					showLoginError();
				}
			}

		});
		if (defaultButton)
		{
			Shell shell = parent.getShell();
			if (shell != null)
			{
				shell.setDefaultButton(button);
			}
		}
		setButtonLayoutData(button);
		return button;
	}

	protected void save() {
		String newPassword = newPasswordText.getText().trim();
		user.setPassword(newPassword);
		Set<BTSUser> users = new HashSet<BTSUser>(1);
		users.add(user);
		userManagerController.saveUsers(users);
		if (authenticatedUserIsAdmin)
		{
			userController.checkAndChangeDBAdminPassword(user.getUserName(), newPassword);
		}
		if (authenticatedUser != null && authenticatedUser.get_id().equals(user.get_id()))
		{
			// set new Authentication
			userController.setAuthentication(authenticatedUser.getUserName(), newPassword);
		}
		return;		
	}

	private void showLoginError()
	{
		setMessage("User unknown or password invalid.", IMessageProvider.ERROR);

	}

	private boolean isValidLogin()
	{

		if (!authenticatedUserIsAdmin)
		{
		String passWord = oldPasswordText.getText().trim();
		try {
			if (!userController.isValidAuthentication(user.getUserName(), passWord))
			{
				setMessage("Old password not valid!", IMessageProvider.ERROR);
				return false;
			}
		} catch (Exception e) {
			logger.info(e); 
			//FIXME abfangen wenn datenbank korrumpiert/nicht installiert/nicht gestartet wurde
			return false;
		}
		}
		String newPassword = newPasswordText.getText().trim();
		if (!newPassword.equals(newPasswordTextRepeat.getText().trim()))
		{
			setMessage("New password not correctly repeated!", IMessageProvider.ERROR);
			return false;
		}
		return true;
	}
	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(450, 400);
	}
}
