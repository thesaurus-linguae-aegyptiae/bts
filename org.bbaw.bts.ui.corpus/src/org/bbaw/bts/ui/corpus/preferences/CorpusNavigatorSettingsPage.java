package org.bbaw.bts.ui.corpus.preferences;

import org.bbaw.bts.btsmodel.BtsmodelPackage;
import org.bbaw.bts.core.commons.corpus.BTSCorpusConstants;
import org.bbaw.bts.core.commons.staticAccess.StaticAccessController;
import org.bbaw.bts.core.corpus.controller.generalController.PassportConfigurationController;
import org.bbaw.bts.corpus.btsCorpusModel.BTSTCObject;
import org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelFactory;
import org.bbaw.bts.ui.commons.converter.BTSConfigItemToStringConverter;
import org.bbaw.bts.ui.commons.converter.BTSStringToConfigItemConverter;
import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.runtime.preferences.ConfigurationScope;
import org.eclipse.core.runtime.preferences.DefaultScope;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.EMFUpdateValueStrategy;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.databinding.viewers.ViewersObservables;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.osgi.service.prefs.BackingStoreException;

public class CorpusNavigatorSettingsPage extends FieldEditorPreferencePage {

	private Combo visibilityCMB_Admin;
	private ComboViewer visibility_viewer;
	private Combo reviewCMB_Admin;
	private ComboViewer reviewState_viewer;
	private ComposedAdapterFactory factory = new ComposedAdapterFactory(
			ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
	private PassportConfigurationController configurationController;
	private IEclipseContext context;
	private IEclipsePreferences prefs;
	private String default_visibility;
	private String default_reviewState;
	private BTSTCObject object;
	/**
	 * @wbp.parser.constructor
	 */
	public CorpusNavigatorSettingsPage() {
		super(FLAT);
		setTitle("Corpus Navigator Settings");
	}


	@Override
	protected void createFieldEditors() {
		// TODO Auto-generated method stub
		Composite container = (Composite) this.getControl();
		addField(new BooleanFieldEditor(BTSCorpusConstants.PREF_CORPUS_NAVIGATOR_SORTBYKEY, "Corpus Navigator sort by sort key", BooleanFieldEditor.DEFAULT, getFieldEditorParent()));
		
		context = StaticAccessController.getContext();
		configurationController = context.get(PassportConfigurationController.class);
		
		Label lblVisibility = new Label(container, SWT.NONE);
		lblVisibility.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false,
				false, 1, 1));
		lblVisibility.setText("Default Visibility");

		visibilityCMB_Admin = new Combo(container, SWT.READ_ONLY);
		visibilityCMB_Admin.setLayoutData(new GridData(SWT.LEFT, SWT.TOP,
				true, false, 3, 1));
		visibility_viewer = new ComboViewer(visibilityCMB_Admin);
		AdapterFactoryLabelProvider labelProvider_vis = new AdapterFactoryLabelProvider(
				factory);
		AdapterFactoryContentProvider contentProvider_vis = new AdapterFactoryContentProvider(
				factory);

		visibility_viewer.setContentProvider(contentProvider_vis);
		visibility_viewer.setLabelProvider(labelProvider_vis);
		visibility_viewer.setInput(configurationController
				.getVisibilityConfigItemProcessedClones(null));
		
		
		Label lblRevisionState = new Label(container, SWT.NONE);
		lblRevisionState.setLayoutData(new GridData(SWT.LEFT, SWT.TOP,
				false, false, 1, 1));
		lblRevisionState.setText("Default Review State");

		reviewCMB_Admin = new Combo(container, SWT.READ_ONLY);
		reviewCMB_Admin.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, true,
				false, 3, 1));
		reviewState_viewer = new ComboViewer(reviewCMB_Admin);

		AdapterFactoryLabelProvider labelProvider_rev = new AdapterFactoryLabelProvider(
				factory);
		AdapterFactoryContentProvider contentProvider_rev = new AdapterFactoryContentProvider(
				factory);

		reviewState_viewer.setContentProvider(contentProvider_rev);
		reviewState_viewer.setLabelProvider(labelProvider_rev);
		reviewState_viewer.setInput(configurationController
				.getReviewStateConfigItemProcessedClones(null));
		init();
		container.layout();
	}
	
	protected void init() {
		prefs = ConfigurationScope.INSTANCE.getNode("org.bbaw.bts.ui.corpus");
		IEclipsePreferences defaultpref = DefaultScope.INSTANCE.getNode("org.bbaw.bts.ui.corpus");

		default_visibility = prefs.get(BTSCorpusConstants.PREF_CORPUS_DEFAULT_VISIBILITY, null);
		default_reviewState = prefs.get(BTSCorpusConstants.PREF_CORPUS_DEFAULT_REVIEWSTATE, null);
		
		object = BtsCorpusModelFactory.eINSTANCE.createBTSTCObject();
		object.setVisibility(default_visibility);
		object.setRevisionState(default_reviewState);
		
		DataBindingContext bindingContext = new DataBindingContext();
		
		// visibility
		EMFUpdateValueStrategy targetToModel_vis = new EMFUpdateValueStrategy();
		targetToModel_vis.setConverter(new BTSConfigItemToStringConverter());
		EMFUpdateValueStrategy modelToTarget_vis = new EMFUpdateValueStrategy();
		modelToTarget_vis.setConverter(new BTSStringToConfigItemConverter(
				visibility_viewer));
		IObservableValue target_vis_viewer = ViewersObservables
				.observeSingleSelection(visibility_viewer);
		Binding binding_vis = bindingContext
				.bindValue(
						target_vis_viewer,
						EMFProperties
								.value(BtsmodelPackage.Literals.ADMINISTRATIV_DATA_OBJECT__VISIBILITY)
								.observe(object), targetToModel_vis,
						modelToTarget_vis);		
		
		// review status
		EMFUpdateValueStrategy targetToModel_rev = new EMFUpdateValueStrategy();
		targetToModel_rev.setConverter(new BTSConfigItemToStringConverter());
		EMFUpdateValueStrategy modelToTarget_rev = new EMFUpdateValueStrategy();
		modelToTarget_rev.setConverter(new BTSStringToConfigItemConverter(
				reviewState_viewer));
		IObservableValue target_rev_viewer = ViewersObservables
				.observeSingleSelection(reviewState_viewer);
		Binding binding_rev = bindingContext
				.bindValue(
						target_rev_viewer,
						EMFProperties
								.value(BtsmodelPackage.Literals.ADMINISTRATIV_DATA_OBJECT__REVISION_STATE)
								.observe(object), targetToModel_rev,
						modelToTarget_rev);
		super.initialize();
	}

	@Override
	public boolean performOk() {
		boolean dirty = false;

		if (object != null && object.getVisibility() != null && !object.getVisibility().equals(default_visibility))
		{
			ConfigurationScope.INSTANCE.getNode("org.bbaw.bts.ui.corpus").put(BTSCorpusConstants.PREF_CORPUS_DEFAULT_VISIBILITY, object.getVisibility());
			// update instance scope so that new value is injected
			InstanceScope.INSTANCE.getNode("org.bbaw.bts.ui.corpus").put(BTSCorpusConstants.PREF_CORPUS_DEFAULT_VISIBILITY, object.getVisibility());
			dirty = true;
		}
		
		if (object != null && object.getRevisionState() != null && !object.getRevisionState().equals(default_reviewState))
		{
			ConfigurationScope.INSTANCE.getNode("org.bbaw.bts.ui.corpus").put(BTSCorpusConstants.PREF_CORPUS_DEFAULT_REVIEWSTATE, object.getRevisionState());
			// update instance scope so that new value is injected
			InstanceScope.INSTANCE.getNode("org.bbaw.bts.ui.corpus").put(BTSCorpusConstants.PREF_CORPUS_DEFAULT_REVIEWSTATE, object.getRevisionState());
			dirty = true;
		}
		
		if (dirty)
		{
			try {
				ConfigurationScope.INSTANCE.getNode("org.bbaw.bts.ui.corpus").flush();
			} catch (BackingStoreException e) {
			}
			try {
				InstanceScope.INSTANCE.getNode("org.bbaw.bts.ui.corpus").flush();
			} catch (BackingStoreException e) {
			}
		}
		return super.performOk();
	}
}
