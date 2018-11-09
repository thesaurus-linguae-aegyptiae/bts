package org.bbaw.bts.ui.main.dialogs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSConfiguration;
import org.bbaw.bts.btsviewmodel.BtsviewmodelFactory;
import org.bbaw.bts.btsviewmodel.TreeNodeWrapper;
import org.bbaw.bts.core.controller.generalController.BTSConfigurationController;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class NewConfigurationDialog extends TitleAreaDialog
{
	private Text text;
	private DataBindingContext bindingContext;
	private BTSConfiguration configuration;


	private ComboViewer activeConfigcomboViewer;
	@Inject
	private BTSConfigurationController configurationController;
	String configurationName = "";
	private Button okButton;
	protected BTSConfiguration originalconfiguration;

	private Set<String> configProviderSet;
	private Text configProviderTxt;
	protected Pattern prefixPattern = Pattern.compile("[a-z0-9]+");

	/**
	 * Create the dialog.
	 * 
	 * @param parentShell
	 */
	public NewConfigurationDialog(Shell parentShell)
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
		container.setLayout(new GridLayout(1, false));
		container.setLayoutData(new GridData(GridData.FILL_BOTH));

		Label lblName = new Label(container, SWT.NONE);
		lblName.setText("Name");

		text = new Text(container, SWT.BORDER);
		text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblProvider = new Label(container, SWT.NONE);
		lblProvider.setText("provider");

		configProviderTxt = new Text(container, SWT.BORDER);
		configProviderTxt.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		configProviderTxt.addModifyListener(new ModifyListener() {
			
			@Override
			public void modifyText(ModifyEvent e) {
				if (configProviderSet.contains(configProviderTxt.getText()))
				{
					setMessage("A Corpus with this prefix exists already. Please, use different prefix.", SWT.ERROR);
					okButton.setEnabled(false);
					return;
				}
				else
				{
					setMessage("");
				}
				if (configProviderTxt.getText().contains(" "))
				{
					setMessage("Corpus prefix may not contain whitespaces.", SWT.ERROR);
					okButton.setEnabled(false);
					return;
				}
				else
				{
					setMessage("");
				}
				Matcher m = prefixPattern.matcher(configProviderTxt.getText());
				if (!m.matches())
				{
					setMessage("Corpus prefix may contain only small characters and integers [a-z0-9].", SWT.ERROR);
					okButton.setEnabled(false);
					return;
				}
				okButton.setEnabled(configProviderTxt.getText().trim().length() > 0 && text.getText().trim().length() > 0);
			}
		});
		Label lblInherit = new Label(container, SWT.NONE);
		lblInherit.setText("Based on");
		
		activeConfigcomboViewer = new ComboViewer(container, SWT.READ_ONLY);
		activeConfigcomboViewer.getControl().setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 1, 1));
		ComposedAdapterFactory factory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		AdapterFactoryLabelProvider labelProvider = new AdapterFactoryLabelProvider(factory);
		activeConfigcomboViewer.setContentProvider(new AdapterFactoryContentProvider(factory));
		activeConfigcomboViewer.setLabelProvider(labelProvider);

		bindingContext = initializeBindings();
		return area;
	}

	private DataBindingContext initializeBindings()
	{
		
		ArrayList<BTSConfiguration> configurations = new ArrayList<BTSConfiguration>();
		List<BTSConfiguration> list = configurationController
				.listConfigurations(null);
		
		BTSConfiguration activeConfiguration = configurationController.getActiveConfiguration();
		TreeNodeWrapper activeConfigurationTreeNode = null;
		
		
		TreeNodeWrapper root = BtsviewmodelFactory.eINSTANCE.createTreeNodeWrapper();
		
		// empty selectoin
		TreeNodeWrapper empty = BtsviewmodelFactory.eINSTANCE
				.createTreeNodeWrapper();
		empty.setChildrenLoaded(true);
		root.getChildren().add(empty);
		root.setChildrenLoaded(true);
		
		if (list != null) {
			for (BTSConfiguration o : list) {
				TreeNodeWrapper child = BtsviewmodelFactory.eINSTANCE
						.createTreeNodeWrapper();
				child.setObject(o);
				child.setChildrenLoaded(true);
				
				if (o.equals(activeConfiguration))
				{
					activeConfigurationTreeNode = child;
				}
				root.getChildren().add(child);
				root.setChildrenLoaded(true);
				configurations.add(o);
			}
		}
		

		activeConfigcomboViewer.setInput(root);
		if (activeConfigurationTreeNode != null)
		{
			activeConfigcomboViewer.setSelection(new StructuredSelection(activeConfigurationTreeNode));
			originalconfiguration = (BTSConfiguration) activeConfiguration;
		}
		activeConfigcomboViewer.addSelectionChangedListener(new ISelectionChangedListener()
		{

			@Override
			public void selectionChanged(SelectionChangedEvent event)
			{
				Object o = event.getSelection();
				IStructuredSelection sel = (IStructuredSelection) o;
				TreeNodeWrapper tn = (TreeNodeWrapper) sel.getFirstElement();
				originalconfiguration = (BTSConfiguration) tn.getObject();
				
			}
		});
		
		configProviderSet = new HashSet<String>();
		for (BTSConfiguration c : list)
		{
			if (c.getProvider() != null)
			{
				configProviderSet.add(c.getProvider());
			}
		}

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
		okButton = createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
		
		createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
	}
	
	@Override
	protected void okPressed() {
		if (originalconfiguration != null)
		{
			configuration = configurationController.createNew(originalconfiguration);
		}
		else
		{
			configuration = configurationController.createNew();
		}
		configuration.setName(text.getText());
		configuration.setProvider(configProviderTxt.getText());
		configuration.set_rev(null);
		super.okPressed();
	}

	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize()
	{
		return new Point(450, 380);
	}
	public BTSConfiguration getConfiguration() {
		return configuration;
	}
	/* (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.Dialog#isResizable()
	 */
	@Override
	protected boolean isResizable() {
		return true;
	}
}
