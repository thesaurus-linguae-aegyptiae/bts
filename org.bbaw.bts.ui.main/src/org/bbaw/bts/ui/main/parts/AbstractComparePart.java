package org.bbaw.bts.ui.main.parts;

import java.util.List;
import java.util.Vector;

import javax.annotation.PreDestroy;
import javax.inject.Inject;
import javax.inject.Named;

import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsviewmodel.BtsviewmodelFactory;
import org.bbaw.bts.btsviewmodel.TreeNodeWrapper;
import org.bbaw.bts.core.controller.dialogControllers.CompareObjectsController;
import org.bbaw.bts.ui.commons.compare.CompareViewer;
import org.bbaw.bts.ui.commons.compare.CompareViewerFactory;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.services.log.Logger;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.di.Persist;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;

public class AbstractComparePart {

	@Inject
	@Named("compareObject")
	protected BTSDBBaseObject object;
	@Inject
	protected CompareObjectsController compareObjectsController;
	protected ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(
				ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
	protected ISelectionChangedListener leftSelectionListener;
	protected BTSDBBaseObject selectedRightVersion;
	protected CTabFolder tabFolder;
	@Inject
	private Logger logger;
	@Inject
	private IEclipseContext context;
	@Inject
	private IExtensionRegistry registry;
	protected List<CompareViewer> compareViewers;
	private boolean leftEditable;
	private boolean rightEditable;
	protected Menu leftContextMenu;
	protected TreeNodeWrapper compareRevInput;

	public AbstractComparePart() {
		super();
	}

	protected void fillListContextMenu(Menu parent) {
		 final MenuItem item = new MenuItem(parent, SWT.PUSH);
		 item.setText("Remove Conflicting Revision");

		
	}

	protected void loadRightVersion(BTSDBBaseObject selectedRightVersion2) {
		for (CompareViewer viewer : compareViewers)
		{
			viewer.load(object, leftEditable, selectedRightVersion2, rightEditable);
		}
		
	}

	protected void loadInput() {

	}

	protected List<CompareViewerFactory> loadViewerFactories() {
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


	@PreDestroy
	public void preDestroy() {
		for (CompareViewer viewer : compareViewers)
		{
			if (viewer != null)
			{
				viewer.dispose();
			}
		}
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

	protected List<TreeNodeWrapper> loadNodes(List<BTSDBBaseObject> conflictObjects) {
		List<TreeNodeWrapper> nodes = new Vector<TreeNodeWrapper>(conflictObjects.size());
		for (Object o : conflictObjects)
		{
			TreeNodeWrapper tn = BtsviewmodelFactory.eINSTANCE.createTreeNodeWrapper();
			tn.setObject((BTSObject) o);
			nodes.add(tn);
		}
		return nodes;
	}
	protected void loadCompareViewers() {
		List<CompareViewerFactory> compareViewerFactories = loadViewerFactories();
		compareViewers = new Vector<CompareViewer>(compareViewerFactories.size());
		for (CompareViewerFactory cvf : compareViewerFactories)
		{
			CTabItem tabItem = new CTabItem(tabFolder, SWT.None);
			tabItem.setText(cvf.getCompareViewerName());
			tabItem.setImage(cvf.getCompareViewerIcon());
			Composite c = new Composite(tabFolder, SWT.NONE);
			tabItem.setControl(c);
			CompareViewer viewer = cvf.createViewer(c, SWT.NONE);
			if (viewer != null)
			{
				compareViewers.add(viewer);
			}
		}
		
	}
}