 
package org.bbaw.bts.ui.main.parts;

import java.util.List;
import java.util.Vector;

import javax.inject.Inject;
import javax.inject.Named;
import javax.annotation.PostConstruct;

import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsviewmodel.BtsviewmodelFactory;
import org.bbaw.bts.btsviewmodel.TreeNodeWrapper;
import org.bbaw.bts.core.controller.dialogControllers.CompareObjectsController;
import org.bbaw.bts.ui.commons.compare.CompareViewer;
import org.bbaw.bts.ui.commons.compare.CompareViewerFactory;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Shell;

import javax.annotation.PreDestroy;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.services.log.Logger;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.di.Persist;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.layout.GridData;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.AbstractListViewer;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.events.MenuEvent;
import org.eclipse.swt.events.MenuListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Display;

public class ConflictsPart {
	
	@Inject
	@Named("compareObject")
	private BTSDBBaseObject object;
	
	@Inject
	private CompareObjectsController compareObjectsController;
	
	private ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(
			ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

	private ListViewer listViewer;

	private ISelectionChangedListener listSelectionListener;

	protected BTSDBBaseObject selectedRightVersion;

	private CTabFolder tabFolder;
	
	@Inject
	private Logger logger;
	
	@Inject
	private IEclipseContext context;

	@Inject
	private IExtensionRegistry registry;

	private List<CompareViewer> compareViewers;

	private boolean leftEditable;

	private boolean rightEditable;

	private Menu listContextMenu;

	private TreeNodeWrapper conflictingRevInput;
	
	@Inject
	public ConflictsPart() {
		//TODO Your code here
	}
	
	@PostConstruct
	public void postConstruct(Composite parent) {
		GridLayout gl_parent = new GridLayout(1, false);
		gl_parent.verticalSpacing = 0;
		gl_parent.marginWidth = 0;
		gl_parent.horizontalSpacing = 0;
		parent.setLayout(gl_parent);
		
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(new GridLayout(2, false));
		composite.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
		
		Label lblSelectVersion = new Label(composite, SWT.NONE);
		lblSelectVersion.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1));
		lblSelectVersion.setText("Current Version");
		
		Label lblNewLabel = new Label(composite, SWT.NONE);
		lblNewLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.TOP, false, true, 1, 1));
		lblNewLabel.setText("Conflicting Version");
		new Label(composite, SWT.NONE);
		
		listViewer = new ListViewer(composite, SWT.BORDER | SWT.V_SCROLL);
		org.eclipse.swt.widgets.List list = listViewer.getList();
		list.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		AdapterFactoryLabelProvider labelProvider = new AdapterFactoryLabelProvider(adapterFactory);
		AdapterFactoryContentProvider contentProvider = new AdapterFactoryContentProvider(adapterFactory);
		listViewer.setContentProvider(contentProvider);
		listViewer.setLabelProvider(labelProvider);
		listSelectionListener = new ISelectionChangedListener()
		{

			@Override
			public void selectionChanged(SelectionChangedEvent event)
			{
				StructuredSelection selection = (StructuredSelection) event.getSelection();
				if (selection.getFirstElement() instanceof TreeNodeWrapper)
				{
					TreeNodeWrapper tn = (TreeNodeWrapper) selection.getFirstElement();
					selectedRightVersion = (BTSDBBaseObject) tn.getObject();
					loadRightVersion(selectedRightVersion);
				}
			}
		};

		listViewer.addSelectionChangedListener(listSelectionListener);
		
		listContextMenu = new Menu(listViewer.getList());
		listViewer.getList().setMenu(listContextMenu);
		listContextMenu.addMenuListener(new MenuListener(){

			@Override
			public void menuHidden(MenuEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void menuShown(MenuEvent e) {
				
				
			}});
		fillListContextMenu(listContextMenu);
//		listViewer.setSorter(new ViewerSorter()
//		{
//		});
		
		Composite composite_1 = new Composite(parent, SWT.NONE);
		composite_1.setLayout(new GridLayout(1, false));
		composite_1.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
		tabFolder = new CTabFolder(composite_1, SWT.BORDER);
		tabFolder.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		tabFolder.setSelectionBackground(Display.getCurrent().getSystemColor(SWT.COLOR_TITLE_INACTIVE_BACKGROUND_GRADIENT));
		//TODO Your code here
		
		loadInput();
		
		tabFolder.setSelection(0);
	}
	
	
	protected void fillListContextMenu(Menu parent) {
		 final MenuItem item = new MenuItem(parent, SWT.PUSH);
		 item.setText("Remove Conflicting Revision");
		 item.addSelectionListener(new SelectionAdapter() {
		      public void widgetSelected(SelectionEvent e) {
		    	  removeConflictingRevision(selectedRightVersion);
		    }
		 });
		
	}

	protected void removeConflictingRevision(
			BTSDBBaseObject revision) {
		String messeage = "Caution! Remove this conflicting revision cannot be undone!";
		MessageDialog dialog = new MessageDialog(new Shell(), "Remove Conflicting Revision", null,
			    messeage , MessageDialog.QUESTION, new String[] { "Remove Conflict",
			  "Keep Conflict"}, 1);
			if(dialog.open() == dialog.OK)
			{
				compareObjectsController.removeRevision(revision, revision.get_rev());
				TreeNodeWrapper delTn = null;
				for (TreeNodeWrapper tn : conflictingRevInput.getChildren())
				{
					if (revision.equals(tn.getObject()))
					{
						delTn = tn;
					}
				}
				conflictingRevInput.getChildren().remove(delTn);
				compareObjectsController.reloadConflicts(object);
			}
		
	}

	protected void loadRightVersion(BTSDBBaseObject selectedRightVersion2) {
		for (CompareViewer viewer : compareViewers)
		{
			viewer.load(object, leftEditable, selectedRightVersion2, rightEditable);
		}
		
	}

	private void loadInput() {
		
		loadConflictingRevision();
		loadConflictingViewers();
	}

	private void loadConflictingViewers() {
		List<CompareViewerFactory> compareViewerFactories = loadViewerFactories();
		compareViewers = new Vector<CompareViewer>(compareViewerFactories.size());
		for (CompareViewerFactory cvf : compareViewerFactories)
		{
			CTabItem tabItem = new CTabItem(tabFolder, SWT.None);
			tabItem.setText("Compare");
			Composite c = new Composite(tabFolder, SWT.NONE);
			tabItem.setControl(c);
			CompareViewer viewer = cvf.createViewer(c, SWT.NONE);
			if (viewer != null)
			{
				compareViewers.add(viewer);
			}
		}
		
	}

	private List<CompareViewerFactory> loadViewerFactories() {
		if (registry == null)
		{
			registry = ((IExtensionRegistry) context.get(IExtensionRegistry.class.getName()));
		}
		IExtensionPoint[] points = registry.getExtensionPoints();
		for (IExtensionPoint p : points)
		{
			logger.info(p.getUniqueIdentifier());
		}
		IConfigurationElement[] config = registry
				.getConfigurationElementsFor("org.bbaw.bts.ui.commons.compareViewerFactory");

		logger.info("extension registry number of elements " + config);
		logger.info("extension registry number of elements " + config.length);

		List<CompareViewerFactory> compareViewerFactories = new Vector<CompareViewerFactory>(config.length);
		for (IConfigurationElement e : config)
		{
			logger.info("extension registry element " + e.getName());

			Object o = null;
			try {
				o = e.createExecutableExtension("class");
				if (o instanceof CompareViewerFactory)
				{
					CompareViewerFactory cvf = (CompareViewerFactory) o;
					if (cvf.hasViewerForObject(object.getClass()))
					{
						compareViewerFactories.add(cvf);
					}
				}
			} catch (CoreException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
		return compareViewerFactories;
	}

	private void loadConflictingRevision() {
		List<BTSDBBaseObject> conflictObjects = compareObjectsController.listConflictingVersions(object);
		conflictingRevInput = BtsviewmodelFactory.eINSTANCE.createTreeNodeWrapper();
		conflictingRevInput.getChildren().addAll(loadNodes(conflictObjects));
		listViewer.setInput(conflictingRevInput);
		
	}

	@PreDestroy
	public void preDestroy() {
		//TODO Your code here
	}
	
	
	@Focus
	public void onFocus() {
		//TODO Your code here
	}
	
	
	@Persist
	public void save() {
		//TODO Your code here
	}

	public void dispose() {
		// TODO Auto-generated method stub
		
	}
	

	private List<TreeNodeWrapper> loadNodes(List<BTSDBBaseObject> conflictObjects)
	{
		List<TreeNodeWrapper> nodes = new Vector<TreeNodeWrapper>(conflictObjects.size());
		for (Object o : conflictObjects)
		{
			TreeNodeWrapper tn = BtsviewmodelFactory.eINSTANCE.createTreeNodeWrapper();
			tn.setObject((BTSObject) o);
			nodes.add(tn);
		}
		return nodes;
	}
}