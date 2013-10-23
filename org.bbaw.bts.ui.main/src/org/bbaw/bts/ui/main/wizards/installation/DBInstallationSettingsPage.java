package org.bbaw.bts.ui.main.wizards.installation;

import org.bbaw.bts.core.commons.BTSUIConstants;
import org.bbaw.bts.ui.commons.controldecoration.BackgroundControlDecorationSupport;
import org.bbaw.bts.ui.commons.validator.StringIsIntegerValidator;
import org.bbaw.bts.ui.commons.validator.StringNotEmptyValidator;
import org.eclipse.core.databinding.AggregateValidationStatus;
import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.beans.PojoProperties;
import org.eclipse.core.databinding.observable.ChangeEvent;
import org.eclipse.core.databinding.observable.IChangeListener;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.databinding.swt.ISWTObservable;
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
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;

public class DBInstallationSettingsPage extends WizardPage
{
	private DataBindingContext m_bindingContext;
	private Text textDBInstallationDir;
	private Text textDBPort;
	private DBInstallSettings settings = new DBInstallSettings();
	private Link btnBrowseFileSystem;
	private Label errorLabel;
	private IObservableValue uiElement;

	/**
	 * Create the wizard.
	 */
	public DBInstallationSettingsPage()
	{
		super("wizardPage");
		setTitle("Database Installation Settings");
		setDescription("BTS will install a CouchDB database and the required Erlang Runtime Environment. You can change the default installation directory.");
	}

	/**
	 * Create contents of the wizard.
	 * 
	 * @param parent
	 */
	public void createControl(Composite parent)
	{
		Composite container = new Composite(parent, SWT.NULL);

		setControl(container);
		GridLayout gl_container = new GridLayout(1, false);
		gl_container.marginWidth = 10;
		container.setLayout(gl_container);

		errorLabel = new Label(container, SWT.NONE);
		errorLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));

		Label lblDatabaseInstallationDirectory = new Label(container, SWT.NONE);
		lblDatabaseInstallationDirectory.setFont(SWTResourceManager.getFont("Tahoma", 8, SWT.BOLD));
		lblDatabaseInstallationDirectory.setText("Database Installation Directory");

		textDBInstallationDir = new Text(container, SWT.BORDER);
		textDBInstallationDir.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		btnBrowseFileSystem = new Link(container, SWT.NONE);
		btnBrowseFileSystem.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		btnBrowseFileSystem.setText("<a>Browse File System...</a>");
		btnBrowseFileSystem.addSelectionListener(new SelectionListener()
		{

			@Override
			public void widgetSelected(SelectionEvent e)
			{
				DirectoryDialog dlg = new DirectoryDialog(DBInstallationSettingsPage.this.getShell());

				// Set the initial filter path according
				// to anything they've selected or typed in
				dlg.setFilterPath(textDBInstallationDir.getText());

				// Change the title bar text
				dlg.setText("SWT's DirectoryDialog");

				// Customizable message displayed in the dialog
				dlg.setMessage("Select a directory");

				// Calling open() will open and run the dialog.
				// It will return the selected directory, or
				// null if user cancels
				String dir = dlg.open();
				if (dir != null)
				{
					// Set the text box to the new selection
					textDBInstallationDir.setText(dir);
				}

			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e)
			{
				// TODO Auto-generated method stub

			}
		});
		new Label(container, SWT.NONE);

		Label lblHttpPortOf = new Label(container, SWT.NONE);
		lblHttpPortOf.setFont(SWTResourceManager.getFont("Tahoma", 8, SWT.BOLD));
		lblHttpPortOf.setText("Http Port of your CouchDB on Localhost");

		textDBPort = new Text(container, SWT.BORDER);
		textDBPort.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		m_bindingContext = initDataBindings();
	}

	protected DataBindingContext initDataBindings()
	{
		final DataBindingContext bindingContext = new DataBindingContext();
		//
		IObservableValue observeTextTextDBInstallationDirObserveWidget = WidgetProperties.text(SWT.Modify).observe(
				textDBInstallationDir);
		IObservableValue bytesDbdirObserveValue = PojoProperties.value("dir").observe(settings);
		UpdateValueStrategy strategy = new UpdateValueStrategy();
		strategy.setAfterGetValidator(new StringNotEmptyValidator());
		Binding binding = bindingContext.bindValue(observeTextTextDBInstallationDirObserveWidget,
				bytesDbdirObserveValue, strategy, null);
		BackgroundControlDecorationSupport.create(binding, SWT.TOP | SWT.LEFT);
		//		setWidgetBackground(textDBInstallationDir, (IStatus) binding.getValidationStatus().getValue());
		//
		IObservableValue observeTextTextDBPortObserveWidget = WidgetProperties.text(SWT.Modify).observe(textDBPort);
		IObservableValue bytesPortObserveValue = PojoProperties.value("port").observe(settings);
		UpdateValueStrategy strategy_2 = new UpdateValueStrategy();
		strategy_2.setAfterGetValidator(new StringIsIntegerValidator());
		Binding binding2 = bindingContext.bindValue(observeTextTextDBPortObserveWidget, bytesPortObserveValue,
				strategy_2, null);

		BackgroundControlDecorationSupport.create(binding2, SWT.TOP | SWT.LEFT);
		//		setWidgetBackground(textDBInstallationDir, (IStatus) binding2.getValidationStatus().getValue());

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
					Control control = null;
					if (binding.getTarget() instanceof ISWTObservable)
					{
						ISWTObservable swtObservable = (ISWTObservable) binding.getTarget();
						control = (Control) swtObservable.getWidget();
						setWidgetBackground(control, status);

					}
					if (!status.isOK())
					{
						allcomplete = false;
					}
				}
				setPageComplete(allcomplete);

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

	private class DBInstallSettings
	{
		private String dir;

		private String port;

		public String getDir()
		{
			return dir;
		}

		public void setDir(String dir)
		{
			this.dir = dir;
		}

		public String getPort()
		{
			return port;
		}

		public void setPort(String port)
		{
			this.port = port;
		}

	}
}
