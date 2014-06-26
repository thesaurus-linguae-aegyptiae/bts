package org.bbaw.bts.ui.main.objectTypeSelector;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSConfig;
import org.bbaw.bts.btsmodel.BTSConfigItem;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.btsmodel.BtsmodelPackage;
import org.bbaw.bts.btsviewmodel.BTSObjectTypeTreeNode;
import org.bbaw.bts.btsviewmodel.BtsviewmodelFactory;
import org.bbaw.bts.btsviewmodel.BtsviewmodelPackage;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.controller.generalController.BTSConfigurationController;
import org.bbaw.bts.ui.commons.utils.BTSUIConstants;
import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.layout.TreeColumnLayout;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Tree;

public class ObjectTypeSelectionTreeComposite extends Composite {

	@Inject
	private BTSConfigurationController configurationController;
	private Tree tree;
	private CheckboxTreeViewer treeViewer;
	private BTSObjectTypeTreeNode inputPath;
	private EditingDomain editingDomain;
	private boolean dirty;
	private BTSConfigItem inputConfigItem;
	private Button allbutton;

	public ObjectTypeSelectionTreeComposite(
			BTSConfigurationController configurationController,
			Composite parent, int style) {
		super(parent, style);
		this.configurationController = configurationController;
		createContent();
	}

	private void createContent() {
		this.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		this.setLayout(new GridLayout(1, false));
		
		allbutton = new Button(this, SWT.CHECK);
		allbutton.setText("Select all");
		allbutton.addSelectionListener(new SelectionAdapter() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				setAllSelected(allbutton.getSelection());

				BTSObjectTypeTreeNode root = (BTSObjectTypeTreeNode) treeViewer.getInput();
				root.setSelected(allbutton.getSelection());
				setDirty(true);
			}
			
		});

		treeViewer = new CheckboxTreeViewer(this);
		treeViewer.getTree().setLayoutData(new GridData(GridData.FILL_BOTH));
		ComposedAdapterFactory factory = new ComposedAdapterFactory(
				ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		AdapterFactoryLabelProvider labelProvider = new AdapterFactoryLabelProvider(
				factory);
		AdapterFactoryContentProvider contentProvider = new AdapterFactoryContentProvider(
				factory);

		treeViewer.setContentProvider(contentProvider);
		treeViewer.setLabelProvider(labelProvider);
		treeViewer.addCheckStateListener(new ICheckStateListener() {
			public void checkStateChanged(CheckStateChangedEvent event) {
				setDirty(true);
				BTSObjectTypeTreeNode entry = (BTSObjectTypeTreeNode) event
						.getElement();
				setEntrySelected(entry, event.getChecked());

				treeViewer.setSubtreeChecked(event.getElement(),
						event.getChecked());

			}
		});
	}
	
	private void setAllSelected(boolean selection) {
		if(selection)
		{
			if (treeViewer != null && !treeViewer.getTree().isDisposed())
			{
				treeViewer.getTree().setBackground(BTSUIConstants.COLOR_BACKGROUND_DISABLED);
			}
		}
		else
		{
			if (treeViewer != null && !treeViewer.getTree().isDisposed())
			{
				treeViewer.getTree().setBackground(BTSUIConstants.COLOR_WIHTE);
			}
		}
		
	}

	public void setDirty(boolean dirty) {
		this.dirty = dirty;

	}

	protected void setEntrySelected(BTSObjectTypeTreeNode entry, boolean checked) {
		CompoundCommand compoundCommand = new CompoundCommand();
		org.eclipse.emf.common.command.Command command = SetCommand.create(
				editingDomain, entry,
				BtsviewmodelPackage.Literals.BTS_OBJECT_TYPE_TREE_NODE__SELECTED,
				checked);
		for (BTSObjectTypeTreeNode child : entry.getChildren()) {
			setChildEntrySelected((BTSObjectTypeTreeNode) child, checked,
					compoundCommand);
		}

		compoundCommand.append(command);
		editingDomain.getCommandStack().execute(compoundCommand);

	}

	private void setChildEntrySelected(BTSObjectTypeTreeNode entry,
			boolean checked, CompoundCommand compoundCommand) {
		org.eclipse.emf.common.command.Command command = SetCommand.create(
				editingDomain, entry,
				BtsviewmodelPackage.Literals.BTS_OBJECT_TYPE_TREE_NODE__SELECTED,
				checked);
		for (BTSObjectTypeTreeNode child : entry.getChildren()) {
			setChildEntrySelected((BTSObjectTypeTreeNode) child, checked,
					compoundCommand);
		}

		compoundCommand.append(command);

	}

	public void setPathInput(BTSConfigItem input,
			EditingDomain editingDomain, BTSConfig objectTypesConfig, boolean includeReferencedObjectTree) {
		Assert.isNotNull(input);
		inputConfigItem = input;
		this.editingDomain = editingDomain;
		if (objectTypesConfig == null){
		objectTypesConfig = configurationController
				.getObjectTypesConfigItem();
		}
		if (objectTypesConfig != null) {
			inputPath = configurationController
					.processTreeSelectorInputPath(objectTypesConfig,
							inputConfigItem.getOwnerTypesMap(), includeReferencedObjectTree);
			treeViewer.setInput(inputPath);
			treeViewer.setCheckedElements(getSelectedElements(inputPath));
			if (inputPath.isSelected())
			{
				allbutton.setSelection(inputPath.isSelected());
				setAllSelected(inputPath.isSelected());
			}
		}
	}

	public void setPathInput(BTSObjectTypeTreeNode path,
			EditingDomain editingDomain, BTSConfig objectTypesConfig) {
		Assert.isNotNull(path);
		inputPath = path;
		this.editingDomain = editingDomain;
		treeViewer.setInput(inputPath);
		treeViewer.setCheckedElements(getSelectedElements(inputPath));
	}

	private Object[] getSelectedElements(BTSObjectTypeTreeNode processedPath) {
		List<BTSObjectTypeTreeNode> checked = new ArrayList<BTSObjectTypeTreeNode>();
		for (BTSObjectTypeTreeNode c : processedPath.getChildren()) {
			addChildrenToList(c, checked);
		}
		return checked.toArray(new Object[checked.size()]);
	}

	private void addChildrenToList(BTSObjectTypeTreeNode c,
			List<BTSObjectTypeTreeNode> checked) {
		if (c instanceof BTSObjectTypeTreeNode) {
			BTSObjectTypeTreeNode entry = (BTSObjectTypeTreeNode) c;
			if (entry.isSelected()) {
				checked.add(entry);
				
			}
			for (BTSObjectTypeTreeNode cc : entry.getChildren()) {
				addChildrenToList(cc, checked);
			}
		}

	}

	public void save() {

		if (dirty) {
			BTSObjectTypeTreeNode treePath = (BTSObjectTypeTreeNode) treeViewer
					.getInput();
			if (inputConfigItem != null)
			{
				inputConfigItem.clearOwnerTypesMap();
				if (allbutton.getSelection())
				{
					Command command = AddCommand.create(
							editingDomain, inputConfigItem,
							BtsmodelPackage.Literals.BTS_CONFIG_ITEM__OWNER_REFERENCED_TYPES_STRING_LIST,
							BTSConstants.OWNER_REFERENCED_TYPES_ANY);
					editingDomain.getCommandStack().execute(command);
//					inputConfigItem.getOwnerReferencedTypesStringList().add(BTSConstants.OWNER_REFERENCED_TYPES_ALL);
				}
				else
				{
					Command command = AddCommand.create(
							editingDomain, inputConfigItem,
							BtsmodelPackage.Literals.BTS_CONFIG_ITEM__OWNER_REFERENCED_TYPES_STRING_LIST,
							configurationController
							.processTreePathToList(treePath));
					editingDomain.getCommandStack().execute(command);
//				inputConfigItem.getOwnerReferencedTypesStringList().addAll(configurationController
//					.processTreePathToList(treePath));
				}
			}
			else if (inputPath != null)
			{
				inputPath.setSelected(allbutton.getSelection());
			}
		}
	}

	public TreeViewer getTreeViewer() {
		return treeViewer;
	}
	
	@Override
	public void setEnabled(boolean enabled) {
		if (enabled != this.isEnabled())
		{
			super.setEnabled(enabled);
			if (enabled)
			{
				setBackground(BTSUIConstants.COLOR_WIHTE);
			}
			else
			{
				setBackground(BTSUIConstants.COLOR_BACKGROUND_DISABLED);
			}
		}
	}


	@Override
	public void setBackground(Color color) {
		super.setBackground(color);
		if (treeViewer != null && !treeViewer.getTree().isDisposed())
		{
			treeViewer.getTree().setBackground(color);
		}
	}
	
	public BTSObjectTypeTreeNode getPathInput()
	{
		return inputPath;
	}

	public boolean isDirty() {
		return dirty;
	}
}
