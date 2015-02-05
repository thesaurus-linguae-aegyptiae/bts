package org.bbaw.bts.ui.main.preferences;

import java.io.IOException;
import java.util.List;
import java.util.Vector;

import org.bbaw.bts.btsmodel.BTSConfiguration;
import org.bbaw.bts.btsviewmodel.BtsviewmodelFactory;
import org.bbaw.bts.btsviewmodel.TreeNodeWrapper;
import org.bbaw.bts.core.commons.staticAccess.StaticAccessController;
import org.bbaw.bts.core.controller.generalController.BTSConfigurationController;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.EclipseContextFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.services.log.Logger;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.equinox.security.storage.ISecurePreferences;
import org.eclipse.equinox.security.storage.SecurePreferencesFactory;
import org.eclipse.equinox.security.storage.StorageException;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IWorkbench;
import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.viewers.AbstractListViewer;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.osgi.framework.BundleContext;

import com.opcoach.e4.preferences.ScopedPreferenceStore;

public class ConfigurationPage extends FieldEditorPreferencePage {

	private Logger logger;
	private boolean loaded;
	private ComboViewer activeConfigcomboViewer;
	private BTSConfigurationController configurationController;
	private BTSConfiguration activeConfiguration;
	private TreeNodeWrapper root;
	private List<BTSConfiguration> configurations = new Vector<BTSConfiguration>();
	/**
	 * Create the preference page.
	 */
	public ConfigurationPage() {
		super(FLAT);
	}

	/**
	 * Create contents of the preference page.
	 */
	@Override
	protected void createFieldEditors() {
		// Create the field editors
		IPreferenceStore store = new ScopedPreferenceStore(InstanceScope.INSTANCE, "org.bbaw.bts.app");
		Composite container = (Composite) this.getControl();
		container.setLayout(new GridLayout(1, false));

		Label activeConfigLB = new Label(container, SWT.NONE);
		activeConfigLB.setLayoutData(new GridData(SWT.RIGHT, SWT.TOP, false,
				false, 1, 1));
		activeConfigLB.setText("Currently active Configuration");

		activeConfigcomboViewer = new ComboViewer(container, SWT.READ_ONLY);
		activeConfigcomboViewer.getControl().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				false, 1, 1));
		ComposedAdapterFactory factory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		AdapterFactoryLabelProvider labelProvider = new AdapterFactoryLabelProvider(factory);
		activeConfigcomboViewer.setContentProvider(new AdapterFactoryContentProvider(factory));
		activeConfigcomboViewer.setLabelProvider(labelProvider);		
		
		
		init(null);
		loaded = true;
	}

	/**
	 * Initialize the preference page.
	 */
	public void init(IWorkbench workbench) {
//		BundleContext bundleContext = Platform.getBundle("org.bbaw.bts.ui.main").getBundleContext();
		IEclipseContext context = StaticAccessController.getContext();
		logger = context.get(Logger.class);
		configurationController = context.get(BTSConfigurationController.class);
		List<BTSConfiguration> list = configurationController
				.listConfigurations(null);
		
		activeConfiguration = configurationController.getActiveConfiguration();
		TreeNodeWrapper activeConfigurationTreeNode = null;
		
		
		root = BtsviewmodelFactory.eINSTANCE.createTreeNodeWrapper();
		if (list != null) {
			for (BTSConfiguration o : list) {
				TreeNodeWrapper child = BtsviewmodelFactory.eINSTANCE
						.createTreeNodeWrapper();
				child.setObject(o);
				child.setChildrenLoaded(true);
				
				if (o.get_id().equals(activeConfiguration.get_id()))
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
		}
		activeConfigcomboViewer.addSelectionChangedListener(new ISelectionChangedListener()
		{

			@Override
			public void selectionChanged(SelectionChangedEvent event)
			{
				Object o = event.getSelection();
				IStructuredSelection sel = (IStructuredSelection) o;
				TreeNodeWrapper tn = (TreeNodeWrapper) sel.getFirstElement();
				BTSConfiguration configuration = (BTSConfiguration) tn.getObject();
				if (activeConfiguration == null || !activeConfiguration.equals(configuration))
				{
					setActiveConfiguration(configuration);
				}
			}
		});
	}
	protected void setActiveConfiguration(BTSConfiguration configuration) {

		activeConfiguration = configuration;

		
	}
	
	@Override
	public boolean performOk() {
		if (loaded)
		{
			configurationController.setActiveConfiguration(activeConfiguration);

			return super.performOk();
		}
		return super.performOk();
	}
}
