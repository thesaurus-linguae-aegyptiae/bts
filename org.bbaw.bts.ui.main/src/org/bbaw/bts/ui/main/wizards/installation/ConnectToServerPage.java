package org.bbaw.bts.ui.main.wizards.installation;

import java.net.MalformedURLException;

import org.bbaw.bts.core.commons.BTSUIConstants;
import org.bbaw.bts.core.controller.generalController.ApplicationStartupController;
import org.bbaw.bts.ui.commons.controldecoration.BackgroundControlDecorationSupport;
import org.bbaw.bts.ui.commons.validator.StringHttp_s_URLValidator;
import org.bbaw.bts.ui.commons.validator.StringNotEmptyValidator;
import org.bbaw.bts.ui.main.wizards.installation.support.Connection;
import org.eclipse.core.databinding.AggregateValidationStatus;
import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.beans.PojoProperties;
import org.eclipse.core.databinding.observable.ChangeEvent;
import org.eclipse.core.databinding.observable.IChangeListener;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;

public class ConnectToServerPage extends WizardPage
{
	private static final int DELAY = 600;
	private DataBindingContext m_bindingContext;
	private Text textServerURL;
	private Text text;
	private Text text_1;
	private Link btnTestConnection;
	private Connection connection = new Connection();
	private boolean connectionOk;
	private Label errorLabel;
	private IObservableValue uiElement;
	private ApplicationStartupController startupController;
	private String remote_db_url;

	/**
	 * Create the wizard.
	 */
	public ConnectToServerPage(String remote_db_url)
	{
		super("wizardPage");
		setTitle("Server Connection");
		this.remote_db_url = remote_db_url;
		setDescription("You stated that you have the URL for a shared collaboration server for BTS. Now, BTS will try to connect to it.");
		connection.setUrl(remote_db_url);
	}

	/**
	 * Create contents of the wizard.
	 * 
	 * @param parent
	 */
	public void createControl(Composite parent)
	{
		startupController = ((InstallationWizard) getWizard()).getStartupController();

		Composite container = new Composite(parent, SWT.NULL);

		setControl(container);
		GridLayout gl_container = new GridLayout(1, false);
		gl_container.marginWidth = 10;
		container.setLayout(gl_container);
		errorLabel = new Label(container, SWT.NONE);
		errorLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		Label lblPleaseEnterYou = new Label(container, SWT.NONE);
		lblPleaseEnterYou.setText("Please enter you connection information, URL, username and password.");

		Label lblServerUrl = new Label(container, SWT.NONE);
		lblServerUrl.setFont(SWTResourceManager.getFont("Tahoma", 8, SWT.BOLD));
		lblServerUrl.setText("Server URL*");

		textServerURL = new Text(container, SWT.BORDER);
		textServerURL.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);

		Label lblYourUserName = new Label(container, SWT.NONE);
		lblYourUserName.setFont(SWTResourceManager.getFont("Tahoma", 8, SWT.BOLD));
		lblYourUserName.setText("Your User Name*");

		text = new Text(container, SWT.BORDER);
		text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);

		Label lblYourPasswordFor = new Label(container, SWT.NONE);
		lblYourPasswordFor.setFont(SWTResourceManager.getFont("Tahoma", 8, SWT.BOLD));
		lblYourPasswordFor.setText("Your Password for Authentication*");

		text_1 = new Text(container, SWT.BORDER | SWT.PASSWORD);
		text_1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		btnTestConnection = new Link(container, SWT.NONE);
		btnTestConnection.setLayoutData(new GridData(SWT.RIGHT, SWT.BOTTOM, false, true, 1, 1));
		btnTestConnection.setText("<a>Connect to Server</a>");
		btnTestConnection.addSelectionListener(new SelectionListener()
		{

			@Override
			public void widgetSelected(SelectionEvent e)
			{
				setPageComplete(validateConnection());

			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e)
			{
				// TODO Auto-generated method stub

			}
		});

		Label lblRequired = new Label(container, SWT.NONE);
		lblRequired.setLayoutData(new GridData(SWT.LEFT, SWT.BOTTOM, false, true, 1, 1));
		lblRequired.setText("* = required");
		m_bindingContext = initDataBindings();
		setPageComplete(connectionOk);
	}

	private boolean validateConnection()
	{
		try
		{
			connectionOk = startupController.checkDBConnection(connection.getUrl(), connection.getUser(),
					connection.getPassword());
		} catch (MalformedURLException e1)
		{
			setErrorMessage("The url you have entered is malformed or invalid.");

		}
		if (!connectionOk)
		{
			setErrorMessage("The connection you have entered is not OK. Either the URL or your authentication is invalid.");

		} else
		{
			setDescription("The connection you have entered is OK. You can load data from the server.");
			((InstallationWizard) getWizard()).setRemoteConnection(connection);
		}
		return connectionOk;

	}

	protected DataBindingContext initDataBindings()
	{
		final DataBindingContext bindingContext = new DataBindingContext();
		//
		IObservableValue observeTextTextServerURLObserveWidget = WidgetProperties.text(SWT.Modify).observeDelayed(
				DELAY, textServerURL);
		IObservableValue bytesUrlObserveValue = PojoProperties.value("url").observe(connection);
		UpdateValueStrategy strategy = new UpdateValueStrategy();
		strategy.setAfterGetValidator(new StringHttp_s_URLValidator());
		Binding binding0 = bindingContext.bindValue(observeTextTextServerURLObserveWidget, bytesUrlObserveValue,
				strategy, null);
		BackgroundControlDecorationSupport.create(binding0, SWT.TOP | SWT.LEFT);

		//
		IObservableValue observeTextTextObserveWidget = WidgetProperties.text(SWT.Modify).observeDelayed(DELAY, text);
		IObservableValue bytesUsernameObserveValue = PojoProperties.value("user").observe(connection);
		UpdateValueStrategy strategy_1 = new UpdateValueStrategy();
		strategy_1.setAfterGetValidator(new StringNotEmptyValidator());
		Binding binding1 = bindingContext.bindValue(observeTextTextObserveWidget, bytesUsernameObserveValue,
				strategy_1, null);
		BackgroundControlDecorationSupport.create(binding1, SWT.TOP | SWT.LEFT);

		//
		IObservableValue observeTextText_1ObserveWidget = WidgetProperties.text(SWT.Modify).observeDelayed(DELAY,
				text_1);
		IObservableValue bytesPasswordObserveValue = PojoProperties.value("password").observe(connection);
		UpdateValueStrategy strategy_2 = new UpdateValueStrategy();
		strategy_2.setAfterGetValidator(new StringNotEmptyValidator());
		Binding binding2 = bindingContext.bindValue(observeTextText_1ObserveWidget, bytesPasswordObserveValue,
				strategy_2, null);
		BackgroundControlDecorationSupport.create(binding2, SWT.TOP | SWT.LEFT);

		//
		uiElement = SWTObservables.observeText(errorLabel);
		// This one listenes to all changes
		bindingContext.bindValue(uiElement, new AggregateValidationStatus(bindingContext.getBindings(),
				AggregateValidationStatus.MAX_SEVERITY), null, null);
		// Lets change the color of the field lastName
		uiElement.addChangeListener(new IChangeListener()
		{
			@Override
			public void handleChange(ChangeEvent event)
			{
				boolean allcomplete = true;
				for (Object o : bindingContext.getBindings())
				{
					Binding binding = (Binding) o;
					IStatus status = (IStatus) binding.getValidationStatus().getValue();

					if (!status.isOK())
					{
						allcomplete = false;
					}
				}
				if (allcomplete) setPageComplete(validateConnection());

			}
		});
		uiElement.setValue("");
		return bindingContext;
	}

	private void setWidgetBackground(Control control, IStatus status)
	{
		if (status.isOK())
		{
			control.setBackground(BTSUIConstants.VIEW_BACKGROUND_DESELECTED_COLOR);
		} else
		{
			control.setBackground(BTSUIConstants.VIEW_BACKGROUND_INVALID_COLOR);
		}

	}

}
