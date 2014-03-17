 
package org.bbaw.bts.ui.corpus.parts;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSCorpusObject;
import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.BTSThsEntry;
import org.bbaw.bts.btsviewmodel.BtsviewmodelFactory;
import org.bbaw.bts.btsviewmodel.BtsviewmodelPackage;
import org.bbaw.bts.btsviewmodel.TreeNodeWrapper;
import org.bbaw.bts.commons.BTSPluginIDs;
import org.bbaw.bts.commons.interfaces.ScatteredCachingPart;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.controller.generalController.PermissionsAndExpressionsEvaluationController;
import org.bbaw.bts.core.corpus.controller.partController.ThsNavigatorController;
import org.bbaw.bts.searchModel.BTSModelUpdateNotification;
import org.bbaw.bts.searchModel.BTSQueryResultAbstract;
import org.bbaw.bts.ui.commons.filter.SuppressDeletedViewerFilter;
import org.bbaw.bts.ui.commons.filter.SuppressNondeletedViewerFilter;
import org.bbaw.bts.ui.resources.BTSResourceProvider;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.EventTopic;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.di.UISynchronize;
import org.eclipse.e4.ui.services.internal.events.EventBroker;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.e4.ui.workbench.swt.modeling.EMenuService;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;

public class ThsNavigator implements ScatteredCachingPart {

	@Inject
	private EventBroker eventBroker;
	@Inject
	private ThsNavigatorController thsNavigatorController;
	// Get UISynchronize injected as field
	@Inject
	private UISynchronize sync;
	// use field injection for the service
	@Inject
	private ESelectionService selectionService;

	@Inject
	private IEclipseContext context;

	@Inject
	private PermissionsAndExpressionsEvaluationController evaluationController;

	@Inject
	private BTSResourceProvider resourceProvider;

	@Inject
	private EMenuService menuService;

	private TreeViewer mainTreeViewer;
	private StructuredSelection selection;
	private Map<String, BTSQueryResultAbstract> queryResultMap = new HashMap<String, BTSQueryResultAbstract>();
	private Map<String, List<TreeNodeWrapper>> viewHolderMap = new HashMap<String, List<TreeNodeWrapper>>();

	private EditingDomain editingDomain;
	private ISelectionChangedListener selectionListener;
	private Composite composite;

	private Map<Control, Map> cachingMap = new HashMap<Control, Map>();
	private TreeNodeWrapper mainRootNode;
	private CTabFolder tabFolder;
	private CTabItem mainTabItem;
	private Composite mainTabItemComp;
	private CTabItem binTabItem;
	private Composite binTabItemComp;
	private TreeViewer bintreeViewer;
	private SuppressDeletedViewerFilter deletedFilter;

	@Inject
	public ThsNavigator() {
		//TODO Your code here
	}
	
	@PostConstruct
	public void postConstruct(Composite parent) {
		parent.setLayout(new GridLayout());
		((GridLayout) parent.getLayout()).marginHeight = 0;
		((GridLayout) parent.getLayout()).marginWidth = 0;
		composite = new Composite(parent, SWT.NONE);
		composite.setLayoutData(new GridData(GridData.FILL_BOTH));
		composite.setLayout(new GridLayout());
		((GridLayout) composite.getLayout()).marginHeight = 0;
		((GridLayout) composite.getLayout()).marginWidth = 0;

		tabFolder = new CTabFolder(composite, SWT.None);
		tabFolder.setSimple(false);
		tabFolder.setLayoutData(new GridData(GridData.FILL_BOTH));
		
		tabFolder.addSelectionListener(new SelectionAdapter() {
			
			private TreeNodeWrapper binRootNode;

			@Override
			public void widgetSelected(SelectionEvent e) {
				CTabItem ti = tabFolder.getSelection();
				Object o = ti.getData("key");
				Object o2 = ti.getData("loaded");
				Object tv = ti.getData("tv");
				TreeViewer treeViewer;
				if (tv != null && tv instanceof TreeViewer) {
					treeViewer = (TreeViewer) tv;
					treeViewer.refresh();
				}
				boolean loaded = false;
				if (o2 != null && (boolean) o2)
				{
					loaded = true;
				}
				if (o != null && o instanceof String)
				{
					if (((String)o).equals("bin"))
					{
						if (!loaded)
						{
							binRootNode = BtsviewmodelFactory.eINSTANCE
									.createTreeNodeWrapper();
							loadInput(binTabItemComp, bintreeViewer,
									binRootNode, true);
							// ti.setData("loaded", true);
						}
						
					}
				}
				
			}
		});

		// create main tab item
		mainTabItem = new CTabItem(tabFolder, SWT.NONE);
		mainTabItem.setImage(resourceProvider.getImage(Display.getDefault(),
				BTSResourceProvider.IMG_THSS));
		mainTabItem.setText("Ths");
		mainTabItem.setData("key", "main");

		mainTabItemComp = new Composite(tabFolder, SWT.NONE);
		mainTabItemComp.setLayoutData(new GridData(GridData.FILL_BOTH));
		mainTabItemComp.setLayout(new GridLayout());
		((GridLayout) mainTabItemComp.getLayout()).marginHeight = 0;
		((GridLayout) mainTabItemComp.getLayout()).marginWidth = 0;

		mainTabItem.setControl(mainTabItemComp);

		mainTreeViewer = new TreeViewer(mainTabItemComp);
		mainTreeViewer.getTree()
				.setLayoutData(new GridData(GridData.FILL_BOTH));
		mainTreeViewer.getTree().setLayout(new GridLayout());

		mainRootNode = BtsviewmodelFactory.eINSTANCE.createTreeNodeWrapper();
		prepareTreeViewer(mainTreeViewer, mainTabItemComp);
		loadInput(mainTabItemComp, mainTreeViewer, mainRootNode, false);

		mainTabItemComp.setData("tv", mainTreeViewer);

		mainTabItemComp.layout();

		// create bin tab item
		binTabItem = new CTabItem(tabFolder, SWT.NONE);
		binTabItem.setText("Bin");
		binTabItem.setData("key", "bin");
		binTabItem.setImage(resourceProvider.getImage(Display.getDefault(),
				BTSResourceProvider.IMG_BIN));

		binTabItemComp = new Composite(tabFolder, SWT.NONE);
		binTabItemComp.setLayoutData(new GridData(GridData.FILL_BOTH));
		binTabItemComp.setLayout(new GridLayout());
		((GridLayout) binTabItemComp.getLayout()).marginHeight = 0;
		((GridLayout) binTabItemComp.getLayout()).marginWidth = 0;

		binTabItem.setControl(binTabItemComp);

		bintreeViewer = new TreeViewer(binTabItemComp);
		bintreeViewer.getTree().setLayoutData(new GridData(GridData.FILL_BOTH));
		bintreeViewer.getTree().setLayout(new GridLayout());
		binTabItem.setData("tv", bintreeViewer);
		prepareTreeViewer(bintreeViewer, binTabItemComp);

		binTabItemComp.layout();
		// loadInput(mainTabItemComp);

		tabFolder.setSelection(mainTabItem);
		parent.layout();
		// parent.pack();
		// tryRunnable();
	}

	private void prepareTreeViewer(TreeViewer treeViewer,
			final Composite parentControl) {
		ComposedAdapterFactory factory = new ComposedAdapterFactory(
				ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		AdapterFactoryLabelProvider labelProvider = new AdapterFactoryLabelProvider(
				factory);
		AdapterFactoryContentProvider contentProvider = new AdapterFactoryContentProvider(
				factory);

		treeViewer.setContentProvider(contentProvider);
		treeViewer.setLabelProvider(labelProvider);

		treeViewer.setUseHashlookup(true);
		selectionListener = new ISelectionChangedListener() {

			private BTSCorpusObject selectedTreeObject;

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				selection = (StructuredSelection) event.getSelection();
				System.out.println(event.getSelection());
				if (selection.getFirstElement() != null
						&& selection.getFirstElement() instanceof TreeNodeWrapper) {
					TreeNodeWrapper tn = (TreeNodeWrapper) selection
							.getFirstElement();
					if (tn.getObject() != null) {
						BTSObject o = (BTSObject) tn.getObject();
						if (o instanceof BTSCorpusObject) {
							selectedTreeObject = (BTSCorpusObject) o;

						}
						if (!tn.isChildrenLoaded()) {
							List<TreeNodeWrapper> parents = new Vector<TreeNodeWrapper>(
									1);
							parents.add(tn);
							loadChildren(parents, false, parentControl);
						}
						selectionService.setSelection(o);
						// eventBroker.send("viewcommunication/syncEvent", o);
					}

				}
			}
		};

		treeViewer.setSorter(new ViewerSorter() {
			@Override
			public int compare(Viewer viewer, Object e1, Object e2) {
				if (e1 instanceof BTSObject && e2 instanceof BTSObject) {
					BTSObject b1 = (BTSObject) e1;
					BTSObject b2 = (BTSObject) e2;
					if (b1.getName() != null) {
						if (b2.getName() != null) {
							return ((BTSObject) e1).getName().compareTo(
									((BTSObject) e2).getName());
						} else
							return -1;
					}

				}
				return 0;
			}
		});
		treeViewer.addSelectionChangedListener(selectionListener);

	}

	private void loadInput(final Control parentControl,
			final TreeViewer treeViewer, final TreeNodeWrapper rootNode,
			final boolean deleted) {

		Job job = new Job("load input") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {


				// input = new WritableList(nodes, TreeNodeWrapper.class);
				// Set the writeableList as input for the viewer
				// Create sample data

				List<BTSThsEntry> obs;
				if (!deleted) {
					obs = thsNavigatorController
						.getRootBTSThsEntries(
								queryResultMap,
								treeViewer,
								rootNode,
								BtsviewmodelPackage.Literals.TREE_NODE_WRAPPER__CHILDREN);
				} else {
					obs = thsNavigatorController
							.getDeletedThsEntries(
									queryResultMap,
									treeViewer,
									rootNode,
									BtsviewmodelPackage.Literals.TREE_NODE_WRAPPER__CHILDREN);
				}
				storeIntoMap(obs, parentControl);
				List<TreeNodeWrapper> nodes = loadNodes(obs);
				rootNode.getChildren().addAll(nodes);

				// If you want to update the UI
				sync.asyncExec(new Runnable() {
					@Override
					public void run() {
						loadTree(treeViewer, rootNode, parentControl);
						if (!deleted) {
							treeViewer.addFilter(getDeletedFilter());
						}
 else {
							treeViewer
									.addFilter(new SuppressNondeletedViewerFilter());
						}
						// register context menu on the table
						menuService.registerContextMenu(
								treeViewer.getControl(),
								BTSPluginIDs.POPMENU_THS_NAVIGATOR_TREE_MENU);

					}
				});
				return Status.OK_STATUS;
			}
		};

		// Start the Job
		job.schedule();

	}

	private ViewerFilter getDeletedFilter() {
		if (deletedFilter == null) {
			deletedFilter = new SuppressDeletedViewerFilter();
		}
		return deletedFilter;
	}

	private void loadChildren(final List<TreeNodeWrapper> parents,
			boolean includeGrandChildren, final Control parentControl) {
		Job job = new Job("load children") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				final List<TreeNodeWrapper> grandChildren = new Vector<>();
				for (final TreeNodeWrapper parent : parents) {
					final List<BTSThsEntry> children = thsNavigatorController
							.findChildren(
									(BTSThsEntry) parent.getObject(),
									queryResultMap,
									mainTreeViewer,
									parent,
									BtsviewmodelPackage.Literals.TREE_NODE_WRAPPER__CHILDREN);

					storeIntoMap(children, parentControl);
					// If you want to update the UI
					sync.asyncExec(new Runnable() {

						@Override
						public void run() {
							System.out.println("add children" + children.size());
							for (BTSObject o : children) {
								TreeNodeWrapper tn = BtsviewmodelFactory.eINSTANCE
										.createTreeNodeWrapper();
								tn.setObject(o);
								addTooHolderMap(o, tn);
								tn.setParent(parent);
								// grandChildren.add(tn);
								parent.getChildren().add(tn);
							}
							parent.setChildrenLoaded(true);

						}

					});
				}
				// loadChildren(grandChildren, false);

				return Status.OK_STATUS;
			}
		};
		// Start the Job
		job.schedule();
		refreshTreeViewer(null);
	}

	protected void storeIntoMap(final List<BTSThsEntry> children,
			final Control parentControl) {
		if (parentControl != null && children != null && !children.isEmpty()) {
			Map map = null;
			if (cachingMap.get(parentControl) != null
					&& cachingMap.get(parentControl) instanceof Map) {
				map = (Map) cachingMap.get(parentControl);
			} else {
				map = new HashMap<URI, Resource>();
				cachingMap.put(parentControl, map);
			}
			if (map != null) {
				for (BTSCorpusObject o : children) {
					map.put(o.eResource().getURI(), o.eResource());
				}
			}

		}

	}

	private void addTooHolderMap(BTSObject o, TreeNodeWrapper tn) {
		List<TreeNodeWrapper> list = viewHolderMap.get(((BTSDBBaseObject) o)
				.get_id());
		if (list == null) {
			list = new Vector<TreeNodeWrapper>(1);
		}
		if (!list.contains(tn)) {
			list.add(tn);
		}
		viewHolderMap.put(((BTSDBBaseObject) o).get_id(), list);

	}

	private void loadTree(TreeViewer treeViewer, TreeNodeWrapper root,
			final Control parentControl) {
		//


		treeViewer.setInput(root);

	}

	private List<TreeNodeWrapper> loadNodes(List<BTSThsEntry> obs) {
		List<TreeNodeWrapper> nodes = new Vector<TreeNodeWrapper>(obs.size());
		for (BTSObject o : obs) {
			TreeNodeWrapper tn = BtsviewmodelFactory.eINSTANCE
					.createTreeNodeWrapper();
			tn.setObject(o);
			nodes.add(tn);
		}
		return nodes;
	}

	@PreDestroy
	public void preDestroy() {
		// TODO Your code here
	}

	@Focus
	public void onFocus() {
		evaluationController
				.activateDBCollectionContext(BTSPluginIDs.PREF_MAIN_CORPUS);
	}

	@Inject
	@Optional
	void eventReceivedNew(@EventTopic("model_ths_new_root/*") BTSObject object) {
		if ((object instanceof BTSThsEntry)) {
			TreeNodeWrapper tn = BtsviewmodelFactory.eINSTANCE
					.createTreeNodeWrapper();
			tn.setObject(object);
			mainRootNode.getChildren().add(tn);
			tn.setParentObject(mainRootNode);
			// refreshTreeViewer((BTSCorpusObject) object);

		}
	}

	@Inject
	@Optional
	void eventReceivedAdd(@EventTopic("model_ths_add/*") BTSObject object) {
		if ((object instanceof BTSThsEntry)
				&& selection != null
				&& ((TreeNodeWrapper) selection.getFirstElement()).getObject() instanceof BTSThsEntry) {
			thsNavigatorController.addRelation((BTSThsEntry) object,
					BTSCoreConstants.BASIC_RELATIONS_PARTOF,
					(TreeNodeWrapper) selection.getFirstElement());

			// refreshTreeViewer((BTSCorpusObject) object);

		}
	}

	@Inject
	@Optional
	void eventReceivedUpdates(@EventTopic("model_update/async") Object object) {
		if (object instanceof BTSThsEntry && selection != null
				&& selection.getFirstElement() instanceof BTSThsEntry) {
			// corpusNavigatorController.addRelation((BTSCorpusObject) object,
			// "partOf",
			// (BTSCorpusObject) selection.getFirstElement(), input);

			refreshTreeViewer((BTSThsEntry) object);
		} else if (object instanceof BTSThsEntry) {
			refreshTreeViewer((BTSThsEntry) object);
		} else if (object instanceof BTSModelUpdateNotification) {
			if (thsNavigatorController.handleModelUpdate(
					(BTSModelUpdateNotification) object, queryResultMap,
					viewHolderMap)) {
				refreshTreeViewer((BTSThsEntry) ((BTSModelUpdateNotification) object)
						.getObject());
			}

		}
	}

	private void refreshTreeViewer(final BTSCorpusObject btsCorpusObject) {
		sync.asyncExec(new Runnable() {
			public void run() {
				mainTreeViewer
						.removeSelectionChangedListener(selectionListener);
				for (TreePath path : mainTreeViewer.getExpandedTreePaths())
					System.out.println(path.getLastSegment());
				mainTreeViewer.refresh();
				mainTreeViewer.addSelectionChangedListener(selectionListener);
			}
		});

	}

	private void addObjectToInput(final BTSObject object) {
		sync.asyncExec(new Runnable() {
			@Override
			public void run() {
				// input.add(object);
			}
		});

	}

	@Override
	public List<Map> getScatteredCashMaps() {
		final List<Map> maps = new Vector<Map>(1);
		sync.asyncExec(new Runnable() {
			@Override
			public void run() {
				for (CTabItem ti : tabFolder.getItems()) {
					Control c = ti.getControl();
					if (c != null && cachingMap.containsKey(c)
							&& cachingMap.get(c) instanceof Map) {
						Map map = (Map) cachingMap.get(c);
						maps.add(map);

					}
				}

			}
		});

		return maps;
	}

}