package org.bbaw.bts.ui.main.objectTypeSelector;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSConfig;
import org.bbaw.bts.btsmodel.BTSConfigItem;
import org.bbaw.bts.btsmodel.BTSObjectTypePath;
import org.bbaw.bts.btsmodel.BTSObjectTypePathRoot;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.btsmodel.BtsmodelPackage;
import org.bbaw.bts.btsmodel.ObjectTypePathEntry;
import org.bbaw.bts.core.controller.generalController.BTSConfigurationController;
import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.layout.TreeColumnLayout;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Tree;

public class ObjectTypeSelectionTreeComposite extends Composite {

	@Inject
	private BTSConfigurationController configurationController;
	private Tree tree;
	private CheckboxTreeViewer treeViewer;
	private BTSObjectTypePathRoot inputPath;
	private EditingDomain editingDomain;
	private boolean dirty;

	public ObjectTypeSelectionTreeComposite(
			BTSConfigurationController configurationController,
			Composite parent, int style) {
		super(parent, style);
		this.configurationController = configurationController;
		createContent();
	}

	private void createContent() {
		this.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		TreeColumnLayout tcl_compositeExample = new TreeColumnLayout();
		this.setLayout(tcl_compositeExample);

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
		// treeViewer.setContentProvider(new PathTreeContentProvider());
		// treeViewer.setLabelProvider(new PathTreeLabelProvider());

		// TreeViewerColumn treeViewerColumnName = new TreeViewerColumn(
		// treeViewer, SWT.NONE);
		// TreeColumn trclmnName = treeViewerColumnName.getColumn();
		// tcl_compositeExample.setColumnData(trclmnName, new ColumnWeightData(
		// 100, ColumnWeightData.MINIMUM_WIDTH, true));
		// trclmnName.setText("Name");
		// When user checks a checkbox in the tree, check all its children
		treeViewer.addCheckStateListener(new ICheckStateListener() {
			public void checkStateChanged(CheckStateChangedEvent event) {
				setDirty(true);
				ObjectTypePathEntry entry = (ObjectTypePathEntry) event
						.getElement();
				setEntrySelected(entry, event.getChecked());

				treeViewer.setSubtreeChecked(event.getElement(),
						event.getChecked());

			}
		});
	}
	
	private void setDirty(boolean dirty) {
		this.dirty = dirty;

	}

	protected void setEntrySelected(ObjectTypePathEntry entry, boolean checked) {
		CompoundCommand compoundCommand = new CompoundCommand();
		org.eclipse.emf.common.command.Command command = SetCommand.create(
				editingDomain, entry,
				BtsmodelPackage.Literals.OBJECT_TYPE_PATH_ENTRY__SELECTED,
				checked);
		for (BTSObjectTypePath child : entry.getChildren()) {
			setChildEntrySelected((ObjectTypePathEntry) child, checked,
					compoundCommand);
		}

		compoundCommand.append(command);
		editingDomain.getCommandStack().execute(compoundCommand);

	}

	private void setChildEntrySelected(ObjectTypePathEntry entry,
			boolean checked, CompoundCommand compoundCommand) {
		org.eclipse.emf.common.command.Command command = SetCommand.create(
				editingDomain, entry,
				BtsmodelPackage.Literals.OBJECT_TYPE_PATH_ENTRY__SELECTED,
				checked);
		for (BTSObjectTypePath child : entry.getChildren()) {
			setChildEntrySelected((ObjectTypePathEntry) child, checked,
					compoundCommand);
		}

		compoundCommand.append(command);

	}

	public void setPathInput(BTSObjectTypePathRoot path,
			EditingDomain editingDomain) {
		Assert.isNotNull(path);
		inputPath = path;
		this.editingDomain = editingDomain;
		BTSConfigItem objectTypesConfig = configurationController
				.getObjectTypesConfigItem();
		if (objectTypesConfig != null) {
		BTSObjectTypePath processedPath = configurationController
				.processTreeSelectorInputPath(objectTypesConfig,
						(BTSObjectTypePathRoot) path);
		treeViewer.setInput(processedPath);
			treeViewer.setCheckedElements(getSelectedElements(processedPath));
		}
	}

	public void setPathInput(BTSObjectTypePathRoot path,
			EditingDomain editingDomain, BTSConfig objectTypesConfig) {
		Assert.isNotNull(path);
		inputPath = path;
		this.editingDomain = editingDomain;
		if (objectTypesConfig != null) {
			BTSObjectTypePath processedPath = configurationController
					.processTreeSelectorInputPath(objectTypesConfig,
							(BTSObjectTypePathRoot) path);
			treeViewer.setInput(processedPath);
			treeViewer.setCheckedElements(getSelectedElements(processedPath));
		}
	}

	private Object[] getSelectedElements(BTSObjectTypePath processedPath) {
		List<BTSObjectTypePath> checked = new ArrayList<BTSObjectTypePath>();
		for (BTSObjectTypePath c : processedPath.getChildren()) {
			addChildrenToList(c, checked);
		}
		return checked.toArray(new Object[checked.size()]);
	}

	private void addChildrenToList(BTSObjectTypePath c,
			List<BTSObjectTypePath> checked) {
		if (c instanceof ObjectTypePathEntry) {
			ObjectTypePathEntry entry = (ObjectTypePathEntry) c;
			if (entry.isSelected()) {
				checked.add(entry);
				for (BTSObjectTypePath cc : entry.getChildren()) {
					addChildrenToList(cc, checked);
				}
			}

		}

	}

	public void save() {

		if (dirty) {
			BTSObjectTypePathRoot treePath = (BTSObjectTypePathRoot) treeViewer
					.getInput();
			inputPath.getChildren().clear();
			for (ObjectTypePathEntry c : treePath.getChildren()) {
				processNodeAndChildrenSelection(c,
						(BTSObjectTypePath) inputPath);

			}
		}
	}

	private void processNodeAndChildrenSelection(ObjectTypePathEntry selectionNode,
 BTSObjectTypePath inputNode) {
		if (!selectionNode.isSelected()) {

		} else {
			ObjectTypePathEntry child = BtsmodelFactory.eINSTANCE
					.createObjectTypePathEntry();
			child.setValue(selectionNode.getValue());
			inputPath.getChildren().add(child);
			for (ObjectTypePathEntry cc : selectionNode.getChildren()) {
				processNodeAndChildrenSelection(cc, child);
			}
		}
	}



}
