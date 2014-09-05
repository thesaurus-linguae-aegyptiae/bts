package org.bbaw.bts.ui.main.dialogs;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.btsmodel.BTSProject;
import org.bbaw.bts.btsmodel.BTSProjectDBCollection;
import org.bbaw.bts.btsviewmodel.TreeNodeWrapper;
import org.bbaw.bts.core.commons.filter.BTSFilter;
import org.bbaw.bts.core.controller.generalController.PermissionsAndExpressionsEvaluationController;
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
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.DelegatingStyledCellLabelProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.widgets.Button;

public class MoveObjectAmongProjectDBCollectionSelectionDialog extends
		TitleAreaDialog {

	@Inject
	private PermissionsAndExpressionsEvaluationController permissionController;
	
	private TreeNodeWrapper rootNode;
	private BTSFilter moveDBCollectionFilter;
	private BTSDBBaseObject object;
	private Text currentProjectLabeltext;
	private Text currentDBCollectionText;
	private BTSProject currentProject;

	private ComposedAdapterFactory factory = new ComposedAdapterFactory(
			ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
	private AdapterFactoryLabelProvider labelProvider = new AdapterFactoryLabelProvider(
			factory);
	private CheckboxTreeViewer checkboxTreeViewer;
	/**
	 * Create the dialog.
	 * @param parentShell
	 */
	public MoveObjectAmongProjectDBCollectionSelectionDialog(Shell parentShell) {
		super(parentShell);
	}

	/**
	 * @param shell
	 * @param rootNode
	 * @param moveDBCollectionFilter
	 * @param object
	 * 
	 * @wbp.parser.constructor
	 */
	public MoveObjectAmongProjectDBCollectionSelectionDialog(Shell shell,
			TreeNodeWrapper rootNode, BTSFilter moveDBCollectionFilter, BTSDBBaseObject object, BTSProject currentProject) {
		super(shell);
		this.rootNode = rootNode;
		this.moveDBCollectionFilter = moveDBCollectionFilter;
		this.object = object;
		this.currentProject = currentProject;
	}

	/**
	 * Create contents of the dialog.
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite area = (Composite) super.createDialogArea(parent);
		Composite container = new Composite(area, SWT.NONE);
		container.setLayout(new GridLayout(1, false));
		container.setLayoutData(new GridData(GridData.FILL_BOTH));
		
		Composite composite = new Composite(container, SWT.NONE);
		composite.setLayout(new GridLayout(1, false));
		composite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblCurrentProject = new Label(composite, SWT.NONE);
		lblCurrentProject.setText("Current Project");
		
		currentProjectLabeltext = new Text(composite, SWT.BORDER);
		currentProjectLabeltext.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblCurrentDbcollection = new Label(composite, SWT.NONE);
		lblCurrentDbcollection.setText("Current DBCollection");
		
		currentDBCollectionText = new Text(composite, SWT.BORDER);
		currentDBCollectionText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Composite composite_1 = new Composite(container, SWT.NONE);
		composite_1.setLayout(new GridLayout(1, false));
		composite_1.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		composite_1.setBounds(0, 0, 64, 64);
		
		Label lblChooseTheNew = new Label(composite_1, SWT.NONE);
		lblChooseTheNew.setText("Choose the new Location with Project and Database Collection");
		
		checkboxTreeViewer = new CheckboxTreeViewer(composite_1, SWT.BORDER);
		Tree tree = checkboxTreeViewer.getTree();
		tree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
//		Button btnMoveRelatedObjects = new Button(composite_1, SWT.CHECK);
//		btnMoveRelatedObjects.setText("Move related objects shown as children of current object aswell.");

		loadInput();
		return area;
	}

	private void loadInput() {
		setTitle("Move Object among Projects and Database Collections");
		setMessage("To move the object " + labelProvider.getText(object) + " to another project and database collection, please select a new target.");
		currentProjectLabeltext.setText(labelProvider.getText(currentProject));
		currentDBCollectionText.setText(object.getDBCollectionKey());
		
		
		// tree
		AdapterFactoryLabelProvider.StyledLabelProvider labelProvider = new AdapterFactoryLabelProvider.StyledLabelProvider(
				factory, checkboxTreeViewer);
		AdapterFactoryContentProvider contentProvider = new AdapterFactoryContentProvider(
				factory);

		checkboxTreeViewer.setContentProvider(contentProvider);
		checkboxTreeViewer.setLabelProvider(new DelegatingStyledCellLabelProvider(labelProvider));
		
//		checkboxTreeViewer.addFilter(new ProjectDBCollectionByPermissionAndProvidedFilterFilter());
		checkboxTreeViewer.setInput(rootNode);
		
		// calculate checked elements
		// iteratate over project + dbcollection
		// select if dbcoll.name == object.dbkey
		
		// add checkstate listener to programmatically do single selection
	}

	/**
	 * Create contents of the button bar.
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.OK_ID, "Move Object",
				true);
		createButton(parent, IDialogConstants.CANCEL_ID,
				IDialogConstants.CANCEL_LABEL, false);
	}

	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(450, 500);
	}

	public String getTargetDBCollectionPath() {
		// TODO Auto-generated method stub
		return null;
	}
	
//	private class ProjectDBCollectionByPermissionAndProvidedFilterFilter extends ViewerFilter
//	{
//		
//
//		@Override
//		public boolean select(Viewer viewer, Object parentElement, Object element) {
//			if (element instanceof TreeNodeWrapper)
//			{
//				Object realObject = ((TreeNodeWrapper) element).getObject();
//				if (realObject instanceof BTSProject)
//				{
//					return true;
//				}
//				else if (realObject instanceof BTSProjectDBCollection)
//				{
//					if (moveDBCollectionFilter != null && !moveDBCollectionFilter.select(((BTSProjectDBCollection) realObject).getCollectionName()))
//					{
//						return false;
//					}
//					if (!permissionController.authenticatedUserMayAddToDBCollection((BTSProjectDBCollection) realObject))
//					{
//						return false;
//					}
//				}
//
//			}
//			
//			return true;
//		}
//	}
}
