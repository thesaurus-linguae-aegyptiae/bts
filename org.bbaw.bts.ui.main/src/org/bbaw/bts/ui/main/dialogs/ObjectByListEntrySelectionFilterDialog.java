package org.bbaw.bts.ui.main.dialogs;

import java.util.List;
import java.util.Vector;

import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.BTSProject;
import org.bbaw.bts.btsviewmodel.BtsviewmodelFactory;
import org.bbaw.bts.btsviewmodel.TreeNodeWrapper;
import org.bbaw.bts.core.commons.filter.BTSObjectsByListEntryFilter;
import org.bbaw.bts.ui.commons.filter.ProjectPrefixViewerFilter;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Table;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.DelegatingStyledCellLabelProvider;

public class ObjectByListEntrySelectionFilterDialog extends TitleAreaDialog {

	private List<Object> objects;
	private BTSObjectsByListEntryFilter filter;
	private Table table;
	private CheckboxTableViewer checkboxTableViewer;
	private List<TreeNodeWrapper> checkedTreeNodes = new Vector<TreeNodeWrapper>();

	/**
	 * Create the dialog.
	 * @param parentShell
	 * @param filter 
	 * @param projects 
	 */
	public ObjectByListEntrySelectionFilterDialog(Shell parentShell, List<Object> objects, BTSObjectsByListEntryFilter filter) {
		super(parentShell);
		this.objects = objects;
		this.setFilter(filter);
	}

	/**
	 * Create contents of the dialog.
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		
		setTitle("Project Filter Selection Dialog");
		setMessage("Please select projects from the list you want to filter in.");
		
		Composite area = (Composite) super.createDialogArea(parent);
		Composite container = new Composite(area, SWT.NONE);
		container.setLayout(new GridLayout(1, false));
		container.setLayoutData(new GridData(GridData.FILL_BOTH));
		
		checkboxTableViewer = CheckboxTableViewer.newCheckList(container, SWT.BORDER | SWT.FULL_SELECTION);
		table = checkboxTableViewer.getTable();
		table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
		ComposedAdapterFactory factory = new ComposedAdapterFactory(
				ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		AdapterFactoryLabelProvider.StyledLabelProvider labelProvider = new AdapterFactoryLabelProvider.StyledLabelProvider(
				factory, checkboxTableViewer);
		AdapterFactoryContentProvider contentProvider = new AdapterFactoryContentProvider(
				factory);

		checkboxTableViewer.setContentProvider(contentProvider);
		checkboxTableViewer.setLabelProvider(new DelegatingStyledCellLabelProvider(
				labelProvider));
		TreeNodeWrapper root = BtsviewmodelFactory.eINSTANCE.createTreeNodeWrapper();
		root.getChildren().addAll(loadNodes(objects));
		checkboxTableViewer.setInput(root);
		
		Composite composite = new Composite(container, SWT.NONE);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.BOTTOM, true, false, 1, 1));

		for (TreeNodeWrapper p : checkedTreeNodes)
		{
			checkboxTableViewer.setChecked(p, true);
		}
		return area;
	}

	/**
	 * Create contents of the button bar.
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL,
				true);
		createButton(parent, IDialogConstants.CANCEL_ID,
				IDialogConstants.CANCEL_LABEL, false);
	}

	@Override
	protected void okPressed() {
		Object[] checkedObjects = checkboxTableViewer.getCheckedElements();
		List<Object> checkedProjects = new Vector<Object>(checkedObjects.length);
		for (Object o : checkedObjects)
		{
			if (o instanceof TreeNodeWrapper)
			{
				checkedProjects.add(((TreeNodeWrapper) o).getObject());
			}
		}
		filter.setObjects(checkedProjects);
		super.okPressed();
		
		
	}
	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(550, 500);
	}

	public BTSObjectsByListEntryFilter getFilter() {
		return filter;
	}

	public void setFilter(BTSObjectsByListEntryFilter filter) {
		this.filter = filter;
	}
	private List<TreeNodeWrapper> loadNodes(List<Object> obs) {
		List<TreeNodeWrapper> nodes = new Vector<TreeNodeWrapper>(obs.size());
		for (Object o : obs) {
			TreeNodeWrapper tn = BtsviewmodelFactory.eINSTANCE
					.createTreeNodeWrapper();
			tn.setObject(o);
			nodes.add(tn);
			for (Object pro : filter.getObjects())
			{
				if (pro.equals(o))
				{
					checkedTreeNodes.add(tn);
				}
			}
		}
		return nodes;
	}
}
