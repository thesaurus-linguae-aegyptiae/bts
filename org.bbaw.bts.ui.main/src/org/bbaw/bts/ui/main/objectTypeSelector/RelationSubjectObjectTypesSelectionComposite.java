package org.bbaw.bts.ui.main.objectTypeSelector;

import java.util.List;
import java.util.Vector;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSConfigItem;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.btsviewmodel.BTSObjectTypeTreeNode;
import org.bbaw.bts.btsviewmodel.BtsviewmodelFactory;
import org.bbaw.bts.core.controller.generalController.BTSConfigurationController;
import org.bbaw.bts.core.controller.generalController.EditingDomainController;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class RelationSubjectObjectTypesSelectionComposite extends Composite {

	@Inject
	private BTSConfigurationController configurationController;
	@Inject
	private BTSConfigItem configItem;

	private ObjectTypeSelectionTreeComposite ownerTypeSelector;
	
	@Inject
	private EditingDomainController editingDomainController;
	private Composite referencedObjectsComposite;
	private TreeViewer treeViewer;
	private Composite refObjectsEditorComp;
	private ObjectTypeSelectionTreeComposite referencedTypeSelector;
	private BTSObjectTypeTreeNode selectedOwnerTypeElement;
	private boolean dirty;

	
	@Inject
	public RelationSubjectObjectTypesSelectionComposite(Composite parent) {
		super(parent, SWT.BORDER);
	}

	
	@PostConstruct
	public void postConstruct()
	{
		this.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		this.setLayout(new GridLayout(1,
				false));
		((GridLayout) this.getLayout()).marginWidth = 0;
		((GridLayout) this.getLayout()).marginHeight = 0;

		
		SashForm ownerSashForm = new SashForm(this, SWT.HORIZONTAL);
		ownerSashForm.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				true, 1, 1));
		
		Composite leftComposite = new Composite(ownerSashForm, SWT.NONE);
		leftComposite.setLayout(new GridLayout(1, false));
		leftComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				true, 1, 1));
		((GridLayout) leftComposite.getLayout()).marginWidth = 0;
		((GridLayout) leftComposite.getLayout()).marginHeight = 0;
		
		Label lblSubtype = new Label(leftComposite, SWT.NONE);
		lblSubtype.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false,
				false, 1, 1));
		lblSubtype.setText("Owner Object Types");
		
		
		ownerTypeSelector = new ObjectTypeSelectionTreeComposite(
				configurationController, leftComposite, SWT.NONE);
		ownerTypeSelector.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

		ownerTypeSelector.setPathInput(configItem,
				getEditingDomain(configItem), null, true);
		
		treeViewer = ownerTypeSelector.getTreeViewer();
		treeViewer.addSelectionChangedListener(new ISelectionChangedListener() {

			private StructuredSelection selection;

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				setDirty(true);
				selection = (StructuredSelection) event.getSelection();
				handleTreeSelection(selection);

			}

		});
		((CheckboxTreeViewer)treeViewer).addCheckStateListener(new ICheckStateListener() {
			public void checkStateChanged(CheckStateChangedEvent event) {
				setDirty(true);
				setEnableReferencedTypesSelector(event.getChecked());
			}
		});
		
		referencedObjectsComposite = new Composite(ownerSashForm, SWT.NONE);
		referencedObjectsComposite.setLayout(new GridLayout(1, false));
		referencedObjectsComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		((GridLayout) referencedObjectsComposite.getLayout()).marginWidth = 0;
		((GridLayout) referencedObjectsComposite.getLayout()).marginHeight = 0;
		
		Label rightLabel = new Label(referencedObjectsComposite, SWT.NONE);
		rightLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.TOP, false,
				false, 1, 1));
		rightLabel.setText("Referenced Object Types");
		
		refObjectsEditorComp = new Composite(referencedObjectsComposite, SWT.NONE);
		refObjectsEditorComp.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		refObjectsEditorComp.setLayout(new GridLayout(1, false));

		ownerSashForm.setWeights(new int[]{ 1, 1});
		ownerSashForm.layout();
		this.layout();
	}


	protected void setEnableReferencedTypesSelector(boolean enabled) {
		if (referencedTypeSelector != null)
		{
			referencedTypeSelector.setEnabled(enabled);
		}
		
	}


	protected void handleTreeSelection(StructuredSelection selection) {
		if (selection.getFirstElement() instanceof BTSObjectTypeTreeNode)
		{
			if (selection.getFirstElement().equals(selectedOwnerTypeElement))
			{
				return;
			}
			
			selectedOwnerTypeElement = (BTSObjectTypeTreeNode) selection.getFirstElement();
			refObjectsEditorComp.dispose();
			refObjectsEditorComp = null;
			refObjectsEditorComp = new Composite(referencedObjectsComposite, SWT.NONE);
			refObjectsEditorComp.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
			refObjectsEditorComp.setLayout(new GridLayout(1, false));
			((GridLayout) refObjectsEditorComp.getLayout()).marginWidth = 0;
			((GridLayout) refObjectsEditorComp.getLayout()).marginHeight = 0;
			
			Label rightLabel = new Label(refObjectsEditorComp, SWT.NONE);
			rightLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.TOP, false,
					false, 1, 1));
			rightLabel.setText("Owner Type: " + selectedOwnerTypeElement.getValue());
			
			referencedTypeSelector = new ObjectTypeSelectionTreeComposite(
					configurationController, refObjectsEditorComp, SWT.NONE);
			referencedTypeSelector.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
			if (configItem.getPassportEditorConfig() == null) {
				configItem.setPassportEditorConfig(BtsmodelFactory.eINSTANCE
						.createBTSPassportEditorConfig());
			} else {
				if (selectedOwnerTypeElement.getReferencedTypesPath() == null) {
					selectedOwnerTypeElement.setReferencedTypesPath(
									BtsviewmodelFactory.eINSTANCE.createBTSObjectTypeTreeNode());
				}
				referencedTypeSelector.setPathInput(selectedOwnerTypeElement.getReferencedTypesPath(),
						getEditingDomain(configItem), configurationController
								.getObjectTypesConfigItem());
			}
			referencedTypeSelector.getTreeViewer();
			referencedObjectsComposite.layout();
			
			referencedTypeSelector.setEnabled(selectedOwnerTypeElement.isSelected());
			
			openTwin((TreeSelection) selection, referencedTypeSelector.getTreeViewer());
		}
	}




	/** Expands the element with the same name in the given treeviewer.
	 * @param selection TreeSelection
	 * @param tv 
	 */
	private void openTwin(TreeSelection selection,
			TreeViewer tv) {
		TreePath[] path = selection.getPaths();
		BTSObjectTypeTreeNode nodeRight = (BTSObjectTypeTreeNode) tv.getInput();
		TreePath tp = path[0];
		List<BTSObjectTypeTreeNode> elements = new Vector<BTSObjectTypeTreeNode>(tp.getSegmentCount());
		for (int i = 0 ; i < tp.getSegmentCount(); i++)
		{
			BTSObjectTypeTreeNode leftNode = (BTSObjectTypeTreeNode) tp.getSegment(i);
			BTSObjectTypeTreeNode childRight = null;
			if (nodeRight != null)
			{
				for (BTSObjectTypeTreeNode c : nodeRight.getChildren())
				{
					if (c.getValue() != null && c.getValue().equals(leftNode.getValue()))
					{
						childRight = c;
						elements.add(childRight);
						break;
					}
				}
				nodeRight = childRight;
			}
		}
		tv.setExpandedElements(elements.toArray(new BTSObjectTypeTreeNode[elements.size()]));

	}


	public void save() {

		if (dirty || (ownerTypeSelector != null && ownerTypeSelector.isDirty())) {
			if (ownerTypeSelector != null)
			{
				if (referencedTypeSelector != null && referencedTypeSelector.isDirty())
				{
					referencedTypeSelector.save();
					ownerTypeSelector.setDirty(true);
				}
				ownerTypeSelector.save();
			}
				
			
		}
	}


	private void setDirty(boolean dirty) {
		this.dirty = dirty;

	}
	private EditingDomain getEditingDomain(BTSConfigItem item) {
		return editingDomainController.getEditingDomain(item);
	}
}
