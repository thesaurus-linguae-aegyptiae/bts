package org.bbaw.bts.ui.main.dialogs;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.btsmodel.BTSProject;
import org.bbaw.bts.btsmodel.BTSProjectDBCollection;
import org.bbaw.bts.btsviewmodel.TreeNodeWrapper;
import org.bbaw.bts.core.commons.filter.BTSFilter;
import org.bbaw.bts.core.controller.generalController.PermissionsAndExpressionsEvaluationController;
import org.bbaw.bts.core.controller.handlerController.MoveObjectAmongProjectDBCollectionHandlerController;
import org.eclipse.e4.core.services.log.Logger;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.DelegatingStyledCellLabelProvider;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.widgets.Button;

public class MoveObjectAmongProjectDBCollectionSelectionDialog extends
		TitleAreaDialog {

	@Inject
	private PermissionsAndExpressionsEvaluationController permissionController;
	
	
	@Inject
	private Logger logger;
	
	@Inject
	private MoveObjectAmongProjectDBCollectionHandlerController moveController;
	
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

	private TreeNodeWrapper checkedProjectTreeNode;

	private TreeNodeWrapper checkedDBCollTreeNode;


	private Button okButton;
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
		
		checkboxTreeViewer.setInput(rootNode);
		if (logger != null && rootNode != null && rootNode.getChildren() != null)
		{
			logger.info("Move Object among projects dialog. target projects size: " + rootNode.getChildren().size());
		}
		else if (logger != null)
		{
			logger.info("Move Object among projects dialog. input root node is null");
		}

		// calculate checked elements
		// iteratate over project + dbcollection
		// select if dbcoll.name == object.dbkey
		
		TreeNodeWrapper[] selected = null;
		for (TreeNodeWrapper tn : rootNode.getChildren())
		{
			if (tn.getObject() != null && tn.getObject() instanceof BTSProject && tn.getObject().equals(currentProject))
			{
				checkedProjectTreeNode = tn;
				selected = new TreeNodeWrapper[]{checkedProjectTreeNode};
				if (!checkedProjectTreeNode.getChildren().isEmpty())
				{
					for (TreeNodeWrapper child : checkedProjectTreeNode.getChildren())
					{
						if (child.getObject() != null && child.getObject() instanceof BTSProjectDBCollection 
								&& ((BTSProjectDBCollection) child.getObject()).getCollectionName() != null
								&& ((BTSProjectDBCollection) child.getObject()).getCollectionName().equals(object.getDBCollectionKey()))
						{
							checkedDBCollTreeNode = child;
							selected = new TreeNodeWrapper[]{checkedProjectTreeNode, checkedDBCollTreeNode};
							break;
						}
					}
				}
				break;
			}
		}
		if (selected != null)
		{
			checkboxTreeViewer.setCheckedElements(selected);
			checkboxTreeViewer.setExpandedElements(selected);
		}
		
		// add checkstate listener to programmatically do single selection
		checkboxTreeViewer.addCheckStateListener(new ICheckStateListener(){

			@Override
			public void checkStateChanged(CheckStateChangedEvent event) {
				if (!event.getChecked())
				{
					// do nothing
					event.getCheckable().setChecked(event.getElement(), true);
				}
				else
				{
					TreeNodeWrapper entry = (TreeNodeWrapper) event
							.getElement();
					if (entry.getObject() instanceof BTSProject)
					{
						// uncheck old
						if (checkedProjectTreeNode != null)
						checkboxTreeViewer.setSubtreeChecked(checkedProjectTreeNode,
								false);
						checkboxTreeViewer.setChecked(checkedProjectTreeNode, false);
						
						// set checked
						checkedProjectTreeNode = entry;
						
					}
					else if (entry.getObject() instanceof BTSProjectDBCollection)
					{
						// uncheck old
						if (checkedDBCollTreeNode != null)
						checkboxTreeViewer.setSubtreeChecked(checkedDBCollTreeNode,
								false);
						checkboxTreeViewer.setChecked(checkedDBCollTreeNode, false);
						
						// find parent
						if (checkedDBCollTreeNode.getParent() != null && checkedDBCollTreeNode.getParent().equals(entry.getParent()))
						{
							// do nothing
						}
						else
						{
							checkboxTreeViewer.setSubtreeChecked(checkedDBCollTreeNode.getParent(),
									false);
							checkboxTreeViewer.setChecked(checkedDBCollTreeNode.getParent(), false);
							checkedProjectTreeNode = entry.getParent();
							checkboxTreeViewer.setChecked(checkedProjectTreeNode, true);

						}
						// set checked
						checkedDBCollTreeNode = entry;
					}
	
					
					
					
				}
				
			}});
	}

	/**
	 * Create contents of the button bar.
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		okButton = createButton(parent, IDialogConstants.OK_ID, "Move Object",
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
		if (checkedDBCollTreeNode != null && checkedDBCollTreeNode.getObject() != null)
		{
			return ((BTSProjectDBCollection)checkedDBCollTreeNode.getObject()).getCollectionName();
		}
		return null;
	}
}
