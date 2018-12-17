package org.bbaw.bts.ui.main.dialogs;

import java.util.List;
import java.util.Vector;

import javax.inject.Inject;
import javax.inject.Named;

import org.bbaw.bts.btsmodel.BTSConfigItem;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.controller.generalController.BTSConfigurationController;
import org.bbaw.bts.ui.commons.search.SearchViewer;
import org.bbaw.bts.ui.commons.search.SearchViewerFactory;
import org.bbaw.bts.ui.resources.BTSResourceProvider;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.EventTopic;
import org.eclipse.e4.core.services.log.Logger;
import org.eclipse.e4.ui.services.internal.events.EventBroker;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventHandler;

public class SearchSelectObjectDialog extends TitleAreaDialog implements
		EventHandler {

	@Inject
	private IEclipseContext context;

	@Inject
	@Optional
	private BTSConfigItem relationConfig;

	@Inject
	@Optional
	private BTSObject selectionObject;

	@Inject
	private BTSConfigurationController configurationController;

	@Inject
	@Optional
	@Named(BTSConstants.OBJECT_TYPES_ARRAY)
	private String[] objectTypes;

	private Text text;

	@Inject
	private BTSResourceProvider resourceProvider;

	@Inject
	private EventBroker eventBroker;

	@Inject
	private IExtensionRegistry registry;
	@Inject
	private Logger logger;

	/**
	 * Create the dialog.
	 * 
	 * @param parentShell
	 */
	@Inject
	public SearchSelectObjectDialog(Shell parentShell) {
		super(parentShell);
	}

	/**
	 * Create contents of the dialog.
	 * 
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite area = (Composite) super.createDialogArea(parent);
		Composite container = new Composite(area, SWT.NONE);
		container.setLayout(new GridLayout(2, false));
		container.setLayoutData(new GridData(GridData.FILL_BOTH));

		Label lblSelectedObject = new Label(container, SWT.NONE);
		lblSelectedObject.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER,
				false, false, 1, 1));
		lblSelectedObject.setText("Selected Object");

		text = new Text(container, SWT.BORDER | SWT.READ_ONLY);
		text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		CTabFolder tabFolder = new CTabFolder(container, SWT.BORDER);
		tabFolder.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2,
				1));
		tabFolder.setSelectionBackground(Display.getCurrent().getSystemColor(
				SWT.COLOR_WHITE));

		tabFolder.setSimple(false);

		if (showCorpusPanel()) {
			CTabItem tbtmCorpusObjects = new CTabItem(tabFolder, SWT.NONE);
			tbtmCorpusObjects.setText("Corpus Objects");
			tbtmCorpusObjects.setImage(resourceProvider.getImage(
					Display.getDefault(), BTSResourceProvider.IMG_CORPORA));

			Composite composite = new Composite(tabFolder, SWT.NONE);
			tbtmCorpusObjects.setControl(composite);
			composite.setLayout(new GridLayout(1, false));

			// IEclipseContext child = context
			// .createChild("searchselect:corpusNavigator");

			Composite composite_CorpusNavigator = new Composite(composite,
					SWT.NONE);
			composite_CorpusNavigator.setLayoutData(new GridData(SWT.FILL,
					SWT.FILL, true, true, 1, 1));
			composite_CorpusNavigator.setLayout(new GridLayout(1, true));
			composite_CorpusNavigator.setBackground(composite.getBackground());
			((GridLayout) composite_CorpusNavigator.getLayout()).marginWidth = 0;
			((GridLayout) composite_CorpusNavigator.getLayout()).marginHeight = 0;
			((GridLayout) composite_CorpusNavigator.getLayout()).horizontalSpacing = 0;
			((GridLayout) composite_CorpusNavigator.getLayout()).verticalSpacing = 0;

			// child.set(Composite.class, composite_CorpusNavigator);

			makeSearchViewer(
					composite_CorpusNavigator,
					relationConfig,
					"CorpusNavigator",
					context);
		}

		// wlist
		if (showLemmaPanel()) {
			CTabItem tbtmWList = new CTabItem(tabFolder, SWT.NONE);
			tbtmWList.setText("Word List");
			tbtmWList.setImage(resourceProvider.getImage(Display.getDefault(),
					BTSResourceProvider.IMG_LEMMATA));

			Composite composite_1 = new Composite(tabFolder, SWT.NONE);
			tbtmWList.setControl(composite_1);
			composite_1.setLayout(new GridLayout(1, false));

			// IEclipseContext child_wlist = context
			// .createChild("searchselect:WlistNavigator");

			Composite composite_wlistNavigator = new Composite(composite_1,
					SWT.NONE);
			composite_wlistNavigator.setLayoutData(new GridData(SWT.FILL,
					SWT.FILL, true, true, 1, 1));
			composite_wlistNavigator.setLayout(new GridLayout(1, true));
			composite_wlistNavigator.setBackground(composite_1.getBackground());
			((GridLayout) composite_wlistNavigator.getLayout()).marginWidth = 0;
			((GridLayout) composite_wlistNavigator.getLayout()).marginHeight = 0;
			((GridLayout) composite_wlistNavigator.getLayout()).horizontalSpacing = 0;
			((GridLayout) composite_wlistNavigator.getLayout()).verticalSpacing = 0;

			// child_wlist.set(Composite.class, composite_wlistNavigator);
			// child_wlist.set(BTSConfigItem.class, relationConfig);
			// child_wlist.set(BTSUIConstants.SELECTION_TYPE,
			// BTSUIConstants.SELECTION_TYPE_SECONDARY);

			makeSearchViewer(
					composite_wlistNavigator,
					relationConfig,
					"LemmaNavigator",
					context);

			// WordListNavigator wlistNavigator = ContextInjectionFactory.make(
			// WordListNavigator.class, child_wlist);
		}

		// ths
		if (showThsPanel()) {
			CTabItem tbtmThs = new CTabItem(tabFolder, SWT.NONE);
			tbtmThs.setText("Thesaurus");
			tbtmThs.setImage(resourceProvider.getImage(Display.getDefault(),
					BTSResourceProvider.IMG_LEMMATA));
			Composite composite_2 = new Composite(tabFolder, SWT.NONE);
			tbtmThs.setControl(composite_2);

			composite_2.setLayout(new GridLayout(1, false));
			// IEclipseContext child_ths = context
			// .createChild("searchselect:thsNavigator");

			Composite composite_thsNavigator = new Composite(composite_2,
					SWT.NONE);
			composite_thsNavigator.setLayoutData(new GridData(SWT.FILL,
					SWT.FILL, true, true, 1, 1));
			composite_thsNavigator.setLayout(new GridLayout(1, true));
			composite_thsNavigator.setBackground(composite_2.getBackground());
			((GridLayout) composite_thsNavigator.getLayout()).marginWidth = 0;
			((GridLayout) composite_thsNavigator.getLayout()).marginHeight = 0;
			((GridLayout) composite_thsNavigator.getLayout()).horizontalSpacing = 0;
			((GridLayout) composite_thsNavigator.getLayout()).verticalSpacing = 0;

			// child_ths.set(Composite.class, composite_thsNavigator);
			// child_ths.set(BTSConfigItem.class, relationConfig);
			// child_ths.set(BTSUIConstants.SELECTION_TYPE,
			// BTSUIConstants.SELECTION_TYPE_SECONDARY);
			//
			// ThsNavigator thsNavigator = ContextInjectionFactory.make(
			// ThsNavigator.class, child_ths);

			makeSearchViewer(
					composite_thsNavigator,
					relationConfig,
					"ThsNavigator",
					context);

		}

		eventBroker.subscribe("ui_secondarySelection/corpusNavigator", this);
		tabFolder.setSelection(0);
		return area;
	}

	private boolean showThsPanel() {
		if (relationConfig != null && selectionObject != null 
				&& configurationController.objectMayReferenceToThs(
					selectionObject, relationConfig))
		{
			return true;
		}
		if (objectTypes != null) {
			for (String s : objectTypes) {
				if (BTSConstants.THS_ENTRY.equals(s))
					return true;
			}
		}
		return false;
	}

	private boolean showLemmaPanel() {
		if (relationConfig != null && selectionObject != null) {
			return configurationController.objectMayReferenceToWList(
					selectionObject, relationConfig);
		}
		if (objectTypes != null) {
			for (String s : objectTypes) {
				if (BTSConstants.WLIST_ENTRY.equals(s))
					return true;
			}
		}
		return false;
	}

	private boolean showCorpusPanel() {
		if (relationConfig != null && selectionObject != null) {
			return configurationController.objectMayReferenceToCorpus(
					selectionObject, relationConfig);
		}
		if (objectTypes != null) {
			for (String s : objectTypes) {
				if (BTSConstants.CORPUS_OBJECT.equals(s))
					return true;
			}
			return false;
		}
		return false;
	}

	private SearchViewer makeSearchViewer(Composite composite,
			BTSConfigItem config, String viewerName, IEclipseContext context) {
		List<SearchViewerFactory> factories = loadSearchViewerFactory(viewerName);
		if (factories != null) {
			for (SearchViewerFactory factory : factories) {
				factory.createSearchViewer(composite, SWT.None, config, context);
			}
		}
		return null;
	}

	private List<SearchViewerFactory> loadSearchViewerFactory(String viewerName) {
		if (registry == null) {
			registry = ((IExtensionRegistry) context
					.get(IExtensionRegistry.class.getName()));
		}
		IExtensionPoint[] points = registry.getExtensionPoints();
		for (IExtensionPoint p : points) {
			logger.info(p.getUniqueIdentifier());
		}
		IConfigurationElement[] config = registry
				.getConfigurationElementsFor("org.bbaw.bts.ui.commons.searchViewerFactory");

		logger.info("extension registry number of elements " + config);
		logger.info("extension registry number of elements " + config.length);

		List<SearchViewerFactory> searchViewerFactories = new Vector<SearchViewerFactory>(
				config.length);
		for (IConfigurationElement e : config) {
			logger.info("extension registry element " + e.getName());

			Object o = null;
			try {
				o = e.createExecutableExtension("class");
				if (o instanceof SearchViewerFactory) {
					SearchViewerFactory cvf = (SearchViewerFactory) o;
					if (cvf.getSearchViewerName().equals(viewerName)) {
						searchViewerFactories.add(cvf);
					}
				}
			} catch (CoreException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}
		return searchViewerFactories;
	}

	/**
	 * Create contents of the button bar.
	 * 
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL,
				true);
		createButton(parent, IDialogConstants.CANCEL_ID,
				IDialogConstants.CANCEL_LABEL, false);
	}

	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(650, 550);
	}

	@Override
	protected boolean isResizable() {
		return true;
	}

	@Inject
	@Optional
	void eventReceivedSecondarySelection(
			@EventTopic("ui_secondarySelection/*") BTSObject object) {
		if (object instanceof BTSObject) {
			selectionObject = (BTSObject) object;
			if (text != null && !text.isDisposed()) {
				text.setText(object.getName());
			}
			// refreshTreeViewer((BTSCorpusObject) object);

		}
	}

	public BTSObject getObject() {
		return selectionObject;
	}

	@Override
	public void handleEvent(Event event) {
		switch (event.getTopic()) {
		case "event_text_relating_objects/loaded": {
			// eventReceivedRelatingObjectsLoadedEvents(event.getProperty("org.eclipse.e4.data"));
			break;
		}
		case "ui_secondarySelection/corpusNavigator": {
			Object o = event.getProperty("org.eclipse.e4.data");
			if (o instanceof BTSObject) {
				eventReceivedSecondarySelection((BTSObject) o);
			}
			break;
		}
		}
	}

}
