package org.bbaw.bts.ui.main.dialogs;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSConfigItem;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.btsviewmodel.BTSObjectTypeTreeNode;
import org.bbaw.bts.btsviewmodel.BtsviewmodelFactory;
import org.bbaw.bts.core.controller.generalController.BTSConfigurationController;
import org.bbaw.bts.ui.commons.filter.TypeSubtypeViewerFilter;
import org.bbaw.bts.ui.main.objectTypeSelector.ObjectTypeSelectionTreeComposite;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.layout.GridLayout;

public class ObjectByTypeSubtypeSelectionFilterDialog extends TitleAreaDialog {

	private TypeSubtypeViewerFilter filter;
	private ObjectTypeSelectionTreeComposite ownerTypeSelector;
	
	@Inject
	private BTSConfigItem inputPath;
	
	@Inject
	private BTSConfigurationController configurationController;
	private String[] filterTerms;

	/**
	 * Create the dialog.
	 * @param parentShell
	 * @param filter 
	 * @param projects 
	 */
	public ObjectByTypeSubtypeSelectionFilterDialog(Shell parentShell, TypeSubtypeViewerFilter filter, String[] filterTerms) {
		super(parentShell);
		this.setFilter(filter);
		this.filterTerms = filterTerms;
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
		((GridData)container.getLayoutData()).grabExcessHorizontalSpace = true;
		((GridData)container.getLayoutData()).grabExcessVerticalSpace = true;
		ownerTypeSelector = new ObjectTypeSelectionTreeComposite(
				configurationController, container, SWT.NONE);
		BTSObjectTypeTreeNode path = configurationController.processTreeSelectorInputPath(configurationController.getObjectTypesConfigItem(), null, inputPath.getOwnerTypesMap(), false);
		path = filterElements(path, filterTerms);
		ownerTypeSelector.setPathInput(inputPath, path, null,  configurationController.getObjectTypesConfigItem());
		ownerTypeSelector.setLayoutData(new GridData(GridData.FILL_BOTH));
		((GridData)ownerTypeSelector.getLayoutData()).grabExcessHorizontalSpace = true;
		((GridData)ownerTypeSelector.getLayoutData()).grabExcessVerticalSpace = true;


		container.layout();
		return area;
	}

	private BTSObjectTypeTreeNode filterElements(BTSObjectTypeTreeNode path,
			String[] localFilterTerms) {
		BTSObjectTypeTreeNode filtered = BtsviewmodelFactory.eINSTANCE.createBTSObjectTypeTreeNode();
		filtered.setSelected(path.isSelected());
		filtered.setValue(path.getValue());
		for (String s : localFilterTerms)
		{
			BTSObjectTypeTreeNode child = null;
			for (BTSObjectTypeTreeNode c : path.getChildren())
			{
				if (c.getValue() != null && c.getValue().equals(s))
				{
					child = c;
					break;
				}
			}
			if (child != null)
			{
				filtered.getChildren().add(child);
			}
		}
		
		return filtered;
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
		ownerTypeSelector.save();
		filter.setInputPath(inputPath);
		super.okPressed();
		
		
	}
	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(550, 500);
	}

	public TypeSubtypeViewerFilter getFilter() {
		return filter;
	}

	public void setFilter(TypeSubtypeViewerFilter filter) {
		this.filter = filter;
	}
}
