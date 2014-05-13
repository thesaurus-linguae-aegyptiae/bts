package org.bbaw.bts.ui.main.wizards.installation;

import org.bbaw.bts.btsmodel.BTSUser;
import org.bbaw.bts.btsmodel.BTSUserGroup;
import org.bbaw.bts.btsmodel.BtsmodelPackage;
import org.bbaw.bts.core.controller.dialogControllers.UserManagerController;
import org.bbaw.bts.core.controller.generalController.EditingDomainController;
import org.bbaw.bts.ui.commons.controldecoration.BackgroundControlDecorationSupport;
import org.bbaw.bts.ui.commons.utils.BTSUIConstants;
import org.bbaw.bts.ui.commons.validator.StringEmailAddressValidator;
import org.bbaw.bts.ui.commons.validator.StringHttp_s_URLValidator;
import org.bbaw.bts.ui.commons.validator.StringNotEmptyValidator;
import org.eclipse.core.databinding.AggregateValidationStatus;
import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.EMFUpdateValueStrategy;
import org.eclipse.emf.databinding.edit.EMFEditProperties;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.dialogs.DialogPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;

public class LocalCreateUserPage extends WizardPage
{

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
	private Composite composite;
	private Text labelId_User;
	private DataBindingContext user_bindingContext;
	private BTSUser user;
	private EditingDomain editingDomain;
	private UserManagerController userManagerController;
	private EditingDomainController editingDomainController;
	private Text textUserGroup;
	protected BTSUserGroup usergroup;
	private Button createUser;
	private Text errorLabel;
	/**
	 * Create the wizard.
	 */
	public LocalCreateUserPage(UserManagerController userManagerController,
			EditingDomainController editingDomainController)
	{
		super("wizardPage");
		setTitle("Create Local User");
		this.userManagerController = userManagerController;
		this.editingDomainController = editingDomainController;
		setDescription("You are about to install BTS locally. In order to secure your database you have to create a user with administration rights on your local database. DON'T LOOSE THIS USER ACCOUNT!");
	}


	/**
	 * Create contents of the wizard.
	 * 
	 * @param parent
	 */
	public void createControl(Composite parent)
	{
		composite = new Composite(parent, SWT.NONE);

		setControl(composite);
		composite.setLayout(new GridLayout(1, false));
		composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
//
//
//		composite = new Composite(container, SWT.BORDER);
//		composite.setLayout(new GridLayout());
//		composite.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, true, true, 1, 1));

		Composite composite_UserEdit = new Composite(composite, SWT.NONE);
		composite_UserEdit.setLayout(new GridLayout(2, false));
		((GridLayout) composite_UserEdit.getLayout()).horizontalSpacing = 10;
		composite_UserEdit.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

		 // this label displays all errors of all bindings
	    Label descAllLabel = new Label(composite, SWT.NONE);
	    descAllLabel.setText("All Validation Problems:");
	    
		errorLabel = new Text(composite, SWT.NONE);
		GridData gridData = new GridData();
	    gridData.horizontalAlignment = SWT.FILL;
	    gridData.grabExcessHorizontalSpace = true;
	    gridData.horizontalAlignment = GridData.FILL;
	    gridData.horizontalSpan = 1;
	    errorLabel.setLayoutData(gridData);
	    errorLabel.setEditable(false);
	    errorLabel.addModifyListener(new ModifyListener() {
			
			@Override
			public void modifyText(ModifyEvent e) {
				setPageComplete(user != null && errorLabel.getText().equals("OK"));
			}
		});
	    
		Label lblUserGroup = new Label(composite_UserEdit, SWT.NONE);
		lblUserGroup.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 2, 1));
		lblUserGroup.setText("User Group");
		lblUserGroup.setFont(SWTResourceManager.getFont("Tahoma", 8, SWT.BOLD));
		
		
		Label lblUserGroupname = new Label(composite_UserEdit, SWT.NONE);
		lblUserGroupname.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblUserGroupname.setText("Enter name of user group*");

		textUserGroup = new Text(composite_UserEdit, SWT.BORDER);
		textUserGroup.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		textUserGroup.addModifyListener(new ModifyListener() {
			
			@Override
			public void modifyText(ModifyEvent e) {
				createUser.setEnabled(textUserGroup.getText().trim().length() > 0 && textUserName_User.getText().trim().length() > 0);
			}
		});

		Label lblUser = new Label(composite_UserEdit, SWT.NONE);
		lblUser.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 2, 1));
		lblUser.setText("User");
		lblUser.setFont(SWTResourceManager.getFont("Tahoma", 8, SWT.BOLD));
		
		
		Label lblUsername = new Label(composite_UserEdit, SWT.NONE);
		lblUsername.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblUsername.setText("Enter Username first (this cannot be changed!)*");

		textUserName_User = new Text(composite_UserEdit, SWT.BORDER);
		textUserName_User.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		textUserName_User.addModifyListener(new ModifyListener() {
			
			@Override
			public void modifyText(ModifyEvent e) {
				createUser.setEnabled(textUserGroup.getText().trim().length() > 0 && textUserName_User.getText().trim().length() > 0);
			}
		});
		
		createUser = new Button(composite_UserEdit, SWT.PUSH);
		createUser.setText("Create User");
		createUser.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1));
		createUser.setEnabled(false);
		createUser.addSelectionListener(new SelectionAdapter() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				textUserName_User.setEnabled(false);
				user = userManagerController.createNewUser(textUserName_User.getText());
				usergroup = userManagerController.createNewUserGroup();
				String groupname = textUserGroup.getText();
				usergroup.setName(groupname);
				user.getGroupIds().add(usergroup.get_id());
				setEnabled(user != null);
				user_bindingContext = initializeUserBindings(user);
				createUser.setEnabled(false);
			}

		});

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

		Group grpLogin = new Group(composite_UserEdit, SWT.NONE);
		grpLogin.setLayout(new GridLayout(2, false));
		grpLogin.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 2, 1));
		grpLogin.setText("Login");

		Label lblPassword = new Label(grpLogin, SWT.NONE);
		lblPassword.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblPassword.setText("Password");

		textPassword_User = new Text(grpLogin, SWT.PASSWORD | SWT.BORDER);
		textPassword_User.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Label lblRequired = new Label(composite_UserEdit, SWT.NONE);
		lblRequired.setLayoutData(new GridData(SWT.LEFT, SWT.BOTTOM, false, true, 1, 1));
		lblRequired.setText("* = required");
		new Label(composite_UserEdit, SWT.NONE);
		setEnabled(user != null);
		parent.layout();
		
	}
	private void setEnabled(boolean enabled) {
		textForeName_User.setEnabled(enabled);
		textSurName_User.setEnabled(enabled);
		textEmail_User.setEnabled(enabled);
		textWebsite_User.setEnabled(enabled);
		textDesc_User.setEnabled(enabled);
		textWebDesc_User.setEnabled(enabled);
		textSigle_User.setEnabled(enabled);
		textComment_User.setEnabled(enabled);
		textPassword_User.setEnabled(enabled);
		
	}


	private DataBindingContext initializeUserBindings(BTSUser user)
	{

		editingDomain = editingDomainController.getEditingDomain(user);
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
		
		//password
		IObservableValue model_pw = EMFEditProperties
				.value(editingDomain, BtsmodelPackage.Literals.BTS_USER__PASSWORD).observe(user);
		EMFUpdateValueStrategy us_pw = new EMFUpdateValueStrategy();
		us_pw.setBeforeSetValidator(new StringNotEmptyValidator("Password is required."));
		Binding binding_pw = bindingContext.bindValue(
				WidgetProperties.text(SWT.Modify).observeDelayed(
						BTSUIConstants.DELAY, textPassword_User), model_pw,
						us_pw, null);
		bindingContext.addValidationStatusProvider(binding_pw);
		
		// listen to all errors via this binding
	    // we do not need to listen to any SWT event on this label as it never
	    // changes independently
	    final IObservableValue errorObservable = WidgetProperties.text()
	        .observe(errorLabel);
	    // this one listenes to all changes
	    bindingContext.bindValue(errorObservable,
	        new AggregateValidationStatus(bindingContext.getBindings(),
	            AggregateValidationStatus.MAX_SEVERITY), null, null);
		return bindingContext;
	}

	public BTSUser getUser() {
		return user;
	}
	public BTSUserGroup getUserGroup() {
		return usergroup;
	}
}
