 
package org.bbaw.bts.ui.main.parts;

import java.util.List;
import java.util.Vector;

import javax.inject.Inject;
import javax.annotation.PostConstruct;

import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.btsviewmodel.BtsviewmodelFactory;
import org.bbaw.bts.btsviewmodel.TreeNodeWrapper;
import org.bbaw.bts.ui.commons.compare.CompareViewer;
import org.bbaw.bts.ui.commons.compare.CompareViewerFactory;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
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
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.events.MenuEvent;
import org.eclipse.swt.events.MenuListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Display;

public class ConflictsPart extends AbstractComparePart {
	
	protected TableViewer tableViewer;

	
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
		
		tableViewer = new TableViewer(composite, SWT.BORDER | SWT.V_SCROLL);
		Table table = tableViewer.getTable();
		table.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
		AdapterFactoryLabelProvider labelProvider = new AdapterFactoryLabelProvider(adapterFactory);
		AdapterFactoryContentProvider contentProvider = new AdapterFactoryContentProvider(adapterFactory);
		tableViewer.setContentProvider(contentProvider);
		tableViewer.setLabelProvider(labelProvider);
		leftSelectionListener = new ISelectionChangedListener()
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

		tableViewer.addSelectionChangedListener(leftSelectionListener);
		
		leftContextMenu = new Menu(tableViewer.getTable());
		tableViewer.getTable().setMenu(leftContextMenu);
		leftContextMenu.addMenuListener(new MenuListener(){

			@Override
			public void menuHidden(MenuEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void menuShown(MenuEvent e) {
				
				
			}});
		fillListContextMenu(leftContextMenu);
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
				for (TreeNodeWrapper tn : compareRevInput.getChildren())
				{
					if (revision.equals(tn.getObject()))
					{
						delTn = tn;
					}
				}
				compareRevInput.getChildren().remove(delTn);
				compareObjectsController.reloadConflicts(object);
			}
		
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
	

	private void loadConflictingRevision() {
		List<BTSDBBaseObject> conflictObjects = compareObjectsController.listConflictingVersions(object);
		compareRevInput = BtsviewmodelFactory.eINSTANCE.createTreeNodeWrapper();
		compareRevInput.getChildren().addAll(loadNodes(conflictObjects));
		tableViewer.setInput(compareRevInput);
		
	}
	

	protected void loadInput() {
		
		loadConflictingRevision();
		loadCompareViewers();
	}
}