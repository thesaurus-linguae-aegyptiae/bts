package org.bbaw.bts.ui.corpus.toolcontrol;

import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsviewmodel.BtsviewmodelFactory;
import org.bbaw.bts.btsviewmodel.TreeNodeWrapper;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.corpus.controller.generalController.ObjectPathController;
import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject;
import org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaEntry;
import org.bbaw.bts.corpus.btsCorpusModel.BTSThsEntry;
import org.bbaw.bts.ui.commons.utils.BTSUIConstants;
import org.bbaw.bts.ui.resources.BTSResourceProvider;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.EventTopic;
import org.eclipse.e4.ui.di.UISynchronize;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.mihalis.opal.breadcrumb.Breadcrumb;
import org.mihalis.opal.breadcrumb.BreadcrumbItem;
import org.osgi.service.event.Event;

public class ObjectPathToolControl {
	
	private Composite composite;
	@Inject
	private BTSResourceProvider resourceProvider;
	@Inject
	private UISynchronize sync;
	
	@Inject
	private ObjectPathController pathController;
	private Breadcrumb breadcrumb;
	private Composite breadcrumbComposite;
	private AdapterFactoryLabelProvider labelProvider;
	private Composite parent;
	private Map<String, List<BTSObject>> pathCache;
	
	@PostConstruct
	public void createGui(Composite parent) {
		this.parent = parent;
		composite = new Composite(parent, SWT.NONE);
		composite.setLayout(new GridLayout(1, false));
		((GridLayout) composite.getLayout()).marginWidth = 0;
		((GridLayout) composite.getLayout()).marginHeight = 0;
		Label l = new Label(composite, SWT.None);
		l.setText("                                                                                                                                                                                                ");
		l.setLayoutData(new GridData());
		l.pack();
		
		ComposedAdapterFactory factory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		labelProvider = new AdapterFactoryLabelProvider(factory);
	}
	
	@Inject
	@Optional
	void eventReceivedObjectPathEvent(@EventTopic("navigator_path_event_with_root/*") final BTSObject[] objects) {
		if (objects != null) {
			Job job = new Job("loadPath") {

				@Override
				protected IStatus run(IProgressMonitor monitor) {
					final BTSObject[] fullPath = loadFullPath(objects, true);
					if (fullPath == null) return Status.OK_STATUS;
					sync.asyncExec(new Runnable() {

						@Override
						public void run() {
							loadObjectBreadCrumbs(fullPath);
						}

					});
					return Status.OK_STATUS;
				}
			};
			job.schedule();

		}
	}
	
	@Inject
	@Optional
	void eventReceivedObjectPathEventNoRoot(@EventTopic("navigator_path_event_no_root/*") final BTSObject[] objects) {
		if (objects != null) {
			Job job = new Job("loadPath") {

				@Override
				protected IStatus run(IProgressMonitor monitor) {
					final BTSObject[] fullPath = loadFullPath(objects, false);
					if (fullPath == null) return Status.OK_STATUS;
					sync.asyncExec(new Runnable() {

						@Override
						public void run() {
							loadObjectBreadCrumbs(fullPath);
						}

					});
					return Status.OK_STATUS;
				}
			};
			job.schedule();

		}
	}

	private BTSObject[] loadFullPath(BTSObject[] objects, boolean rootIncluded) {
		if (rootIncluded || objects == null || objects.length == 0)
		{
			// first is root
			return objects;
		}
		if (objects[0] instanceof BTSThsEntry)
		{
			return pathController.loadFullPathThs(objects, pathCache);
		}
		else if (objects[0] instanceof BTSLemmaEntry)
		{
			return pathController.loadFullPathLemma(objects, pathCache);
		}
		// 
		return pathController.loadFullPath(objects, pathCache);
	}

	private void loadObjectBreadCrumbs(BTSObject[] objects) {
		if (breadcrumbComposite != null)
		{
			breadcrumbComposite.dispose();
			breadcrumbComposite = null;
		}
		Control[] todispose = composite.getChildren();
		for (Control c : todispose)
		{
			c.dispose();
		}
		
		breadcrumbComposite = new Composite(composite, SWT.NONE);
		breadcrumbComposite.setLayout(new GridLayout(
						1, true));
		((GridLayout) breadcrumbComposite.getLayout()).marginWidth = 0;
		((GridLayout) breadcrumbComposite.getLayout()).marginHeight = 0;
		breadcrumbComposite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 1, 1));
		
		breadcrumb = new Breadcrumb(composite, SWT.NONE);
		
		for (BTSObject o : objects)
		{
			final BreadcrumbItem item = new BreadcrumbItem(breadcrumb, SWT.PUSH);
			String name = labelProvider.getText(o);
			if (name.length() > 10)
			item.setText(name.substring(0, 9) + "...");
			else item.setText(name);
			
			item.setTooltipText(name);
			item.setImage(labelProvider.getImage(o));
		}
		parent.layout();
		parent.redraw();
		parent.pack();
	}

}