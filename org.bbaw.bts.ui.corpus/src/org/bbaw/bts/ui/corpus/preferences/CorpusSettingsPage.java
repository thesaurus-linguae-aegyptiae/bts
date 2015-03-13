package org.bbaw.bts.ui.corpus.preferences;

import java.util.List;
import java.util.Vector;

import org.bbaw.bts.commons.BTSPluginIDs;
import org.bbaw.bts.core.commons.staticAccess.StaticAccessController;
import org.bbaw.bts.core.corpus.controller.partController.CorpusNavigatorController;
import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject;
import org.bbaw.bts.corpus.btsCorpusModel.BTSTextCorpus;
import org.bbaw.bts.ui.corpus.provider.BTSCorpusLabelProvider;
import org.bbaw.bts.ui.corpus.provider.BTSCorpusRemovableContentProvider;
import org.bbaw.bts.ui.corpus.provider.ListContentProvider;
import org.eclipse.core.runtime.preferences.ConfigurationScope;
import org.eclipse.core.runtime.preferences.DefaultScope;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.services.log.Logger;
import org.eclipse.e4.ui.workbench.IWorkbench;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.osgi.service.prefs.BackingStoreException;

import com.richclientgui.toolbox.duallists.DualListComposite;

public class CorpusSettingsPage extends FieldEditorPreferencePage {

	private ComboViewer comboViewer;
	private BTSTextCorpus selectedTextCorpus;
	private String main_corpus_key;
	private DualListComposite<BTSCorpusObject> duallistcomposite;
	private IEclipseContext context;
	private CorpusNavigatorController corpusController;
	private List<BTSTextCorpus> corpora;
	private String active_corpora;
	private IEclipsePreferences prefs;
	private Logger logger;
	private boolean loaded;
	private BTSCorpusRemovableContentProvider chrosenProvider;

	/**
	 * Create the preference page.
	 */
	public CorpusSettingsPage() {
		super(FLAT);
		setTitle("Corpus Settings");
	}

	/**
	 * Create contents of the preference page.
	 */
	@Override
	protected void createFieldEditors() {
		
		Composite container = (Composite) this.getControl();
		
		Label lblSelectYourMain = new Label(container, SWT.NONE);
		lblSelectYourMain.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 1, 1));
		lblSelectYourMain.setText("Select your main working corpus");

		comboViewer = new ComboViewer(container, SWT.READ_ONLY);
		comboViewer.getControl().setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));

		ComposedAdapterFactory factory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		AdapterFactoryLabelProvider labelProvider = new AdapterFactoryLabelProvider(factory);
		comboViewer.setContentProvider(new ListContentProvider());
		comboViewer.setLabelProvider(labelProvider);
		comboViewer.addSelectionChangedListener(new ISelectionChangedListener()
		{

			@Override
			public void selectionChanged(SelectionChangedEvent event)
			{
				Object o = event.getSelection();
				IStructuredSelection sel = (IStructuredSelection) o;
				selectedTextCorpus = (BTSTextCorpus) sel.getFirstElement();
			}
		});
		
		Group grpFurtherProjectsFrom = new Group(container, SWT.NONE);
		grpFurtherProjectsFrom.setLayout(new GridLayout(2, false));
		grpFurtherProjectsFrom.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		grpFurtherProjectsFrom.setText("Further corpora from which you want to load and read data");
		
		Label lblAvailableProjects = new Label(grpFurtherProjectsFrom, SWT.NONE);
		lblAvailableProjects.setText("Available Corpora (Not activated)");
		
		Label lblProjectsToBe = new Label(grpFurtherProjectsFrom, SWT.NONE);
		lblProjectsToBe.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, true, false, 1, 1));
		lblProjectsToBe.setAlignment(SWT.RIGHT);
		lblProjectsToBe.setText("Active Corpora");

		duallistcomposite = new DualListComposite<BTSCorpusObject>(grpFurtherProjectsFrom, SWT.NONE);
		duallistcomposite.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true, true, 2, 1));
		duallistcomposite.setBackground(grpFurtherProjectsFrom.getBackground());
		
		init(null);
	}

	/**
	 * Initialize the preference page.
	 */
	public void init(IWorkbench workbench) {
//		BundleContext bundleContext = Platform.getBundle("org.bbaw.bts.ui.main").getBundleContext();
		context = StaticAccessController.getContext();
		corpusController = context.get(CorpusNavigatorController.class);
		prefs = ConfigurationScope.INSTANCE.getNode("org.bbaw.bts.app");
		IEclipsePreferences defaultpref = DefaultScope.INSTANCE.getNode("org.bbaw.bts.app");

		main_corpus_key = prefs.get(BTSPluginIDs.PREF_MAIN_CORPUS_KEY, defaultpref.get(BTSPluginIDs.PREF_MAIN_CORPUS_KEY, null));
		active_corpora = prefs.get(BTSPluginIDs.PREF_ACTIVE_CORPORA, defaultpref.get(BTSPluginIDs.PREF_ACTIVE_CORPORA, null));
		logger = context.get(Logger.class);
		
		loadListInput();

	}
	
	
	private void loadListInput()
	{

		corpora = corpusController.listTextCorpora(null);
		comboViewer.setInput(corpora);
		List<BTSCorpusObject> availableCorpora = new Vector<BTSCorpusObject>(1);

		List<BTSCorpusObject> chosenCorpora = new Vector<BTSCorpusObject>(1);

		if (active_corpora == null || active_corpora.trim().length() == 0)
		{
			active_corpora = main_corpus_key;
		}
		if (active_corpora != null && active_corpora.trim().length() > 0)
		{
			String[] pros = active_corpora.split("\\|");

			for (BTSTextCorpus corpus : corpora)
			{

				boolean found = false;
				if (main_corpus_key != null && main_corpus_key.equals(corpus.getDBCollectionKey() + "_" + corpus.getCorpusPrefix()))
				{
					selectedTextCorpus = corpus;
					comboViewer.setSelection(new StructuredSelection(corpus));
				}
				for (String p : pros)
				{
					if (p.equals(corpus.getDBCollectionKey()+ "_" + corpus.getCorpusPrefix()))
					{
						chosenCorpora.add(corpus);
						found = true;
						break;
					}
				}
				if (!found)
				{
					availableCorpora.add(corpus);
				}
			}

		}

		duallistcomposite.setAvailableContentProvider(new BTSCorpusRemovableContentProvider(availableCorpora));
		duallistcomposite.setAvailableLabelProvider(new BTSCorpusLabelProvider());
		chrosenProvider = new BTSCorpusRemovableContentProvider(chosenCorpora);
		duallistcomposite.setChosenContentProvider(chrosenProvider);
		duallistcomposite.setChosenLabelProvider(new BTSCorpusLabelProvider());
		loaded = true;

	}
	
	
	private String getActiveProjectSelectionsAsString() {
		String string = "";
		for (String s : getActiveProjectSelectionsAsStringList())
		{
			string += s + "|";
		}
		return string.length() > 2 ? string.substring(0, string.length() - 1) : "";
	}
	
	private List<String> getActiveProjectSelectionsAsStringList()
	{
		List<String> prefixes = new Vector<String>();
		if (chrosenProvider == null)
		{
			return prefixes;
		}
		List<BTSCorpusObject> selections = chrosenProvider.getInputElements();
		for (BTSCorpusObject corpus : selections)
		{
			if (corpus.getDBCollectionKey() != null && !prefixes.contains(corpus.getDBCollectionKey()+ "_" + corpus.getCorpusPrefix()))
			{
				prefixes.add(corpus.getDBCollectionKey()+ "_" + corpus.getCorpusPrefix());
			}
		}
		return prefixes;
	}
	@Override
	public boolean performOk() {
		if (!loaded)
		{
			return super.performOk();
		}
		boolean dirty = false;
		if (selectedTextCorpus != null && selectedTextCorpus.getDBCollectionKey() != null && (main_corpus_key == null || !main_corpus_key.equals(selectedTextCorpus.getDBCollectionKey()+ "_" + selectedTextCorpus.getCorpusPrefix())))
		{
			ConfigurationScope.INSTANCE.getNode("org.bbaw.bts.app").put(BTSPluginIDs.PREF_MAIN_CORPUS_KEY, selectedTextCorpus.getDBCollectionKey()+ "_" + selectedTextCorpus.getCorpusPrefix());
			// update instance scope so that new value is injected
			InstanceScope.INSTANCE.getNode("org.bbaw.bts.app").put(BTSPluginIDs.PREF_MAIN_CORPUS_KEY, selectedTextCorpus.getDBCollectionKey()+ "_" + selectedTextCorpus.getCorpusPrefix());
			context.modify(BTSPluginIDs.PREF_MAIN_CORPUS, selectedTextCorpus);
			dirty = true;
		}
		String selectedProjetsString = getActiveProjectSelectionsAsString();
		if (selectedProjetsString != null && !selectedProjetsString.equals(active_corpora))
		{
			ConfigurationScope.INSTANCE.getNode("org.bbaw.bts.app").put(BTSPluginIDs.PREF_ACTIVE_CORPORA, selectedProjetsString);
			// update instance scope so that new value is injected
			InstanceScope.INSTANCE.getNode("org.bbaw.bts.app").put(BTSPluginIDs.PREF_ACTIVE_CORPORA, selectedProjetsString);
			context.modify(BTSPluginIDs.PREF_ACTIVE_CORPORA, selectedProjetsString);
			dirty = true;
			for (BTSTextCorpus c : corpora)
			{
				boolean active = false;
				for (String s : getActiveProjectSelectionsAsStringList())
				{
					if (s.equals(c.getDBCollectionKey() + "_" + c.getCorpusPrefix()))
					{
						active = true;
						break;
					}
				}
				if (c.isActive() != active)
				{
					c.setActive(active);
				}
				
			}
		}
		if (dirty)
		{
			try {
				ConfigurationScope.INSTANCE.getNode("org.bbaw.bts.app").flush();
			} catch (BackingStoreException e) {
				logger.error(e);
			}
			try {
				InstanceScope.INSTANCE.getNode("org.bbaw.bts.app").flush();
			} catch (BackingStoreException e) {
				logger.error(e);
			}
		}
		return super.performOk();
	}
}
