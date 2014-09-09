 
package org.bbaw.bts.ui.main.widgets;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.bbaw.bts.btsmodel.BTSConfig;
import org.bbaw.bts.btsmodel.BTSConfigItem;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.BTSRelation;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.btsmodel.BtsmodelPackage;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.controller.generalController.BTSConfigurationController;
import org.bbaw.bts.ui.commons.utils.BTSUIConstants;
import org.bbaw.bts.ui.resources.BTSResourceProvider;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;

public class CompoundRelationsEditorComposite extends Composite {

	@Inject
	private IEclipseContext context;

	@Inject
	private EditingDomain editingDomain;

	@Inject
	private BTSConfigurationController configurationController;

	@Inject
	private BTSResourceProvider resourceProvider;

	@Inject
	private BTSObject object;

	@Inject
	@Optional
	@Named(BTSCoreConstants.CORE_EXPRESSION_MAY_EDIT)
	protected boolean userMayEdit;
	
	private Map<String, BTSConfigItem> relationConfigCache = new HashMap<String, BTSConfigItem>();

	private List<BTSConfigItem> cachedRelationConfigs;

	@Inject
	public CompoundRelationsEditorComposite(Composite parent) {
		super(parent, SWT.NONE);
	}
	
	@PostConstruct
	public void postConstruct(Composite parent) {
		this.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, true, 6, 1));
		this.setLayout(new GridLayout(3, false));
		((GridLayout) this.getLayout()).marginWidth = 0;
		((GridLayout) this.getLayout()).marginHeight = 0;

		this.setBackground(parent.getBackground());
		createWidgets();

		this.layout();
	}

	private void createWidgets() {
		// if (corpusObject.getRelations() )
		if (!object.getRelations().isEmpty())
		{
			for (int i = 0; i < object.getRelations().size(); i++) {
				BTSRelation relation = object.getRelations().get(i);
				BTSConfigItem relationConfig = getRelationConfig(relation);
					createWidget(relation, i, relationConfig);
	
			}
		}
		else
		{
			// create add buttons
			Label addButton = new Label(this, SWT.PUSH);
			addButton.setImage(resourceProvider.getImage(Display.getDefault(),
					BTSResourceProvider.IMG_ADD));
			addButton.setToolTipText("Add Relation");
			addButton.setLayoutData(new GridData(SWT.RIGHT, SWT.TOP, false,
					false, 1, 1));
			((GridData) addButton.getLayoutData()).verticalIndent = 2;
			addButton.addMouseListener(new MouseAdapter() {

				@Override
				public void mouseDown(MouseEvent e) {
					if (CompoundRelationsEditorComposite.this.userMayEdit)
					{
					Label l = (Label) e.getSource();
					l.setBackground(BTSUIConstants.VIEW_BACKGROUND_LABEL_PRESSED);
					}
				}

				@Override
				public void mouseUp(MouseEvent e) {
					if (CompoundRelationsEditorComposite.this.userMayEdit)
					{
					Label l = (Label) e.getSource();
					l.setBackground(l.getParent().getBackground());
					BTSRelation rel = makeAdditionalRelation();
					CompoundCommand compoundCommand = new CompoundCommand();
					org.eclipse.emf.common.command.Command command = AddCommand
							.create(editingDomain,
									object,
									BtsmodelPackage.Literals.BTS_OBJECT__RELATIONS,
									rel);
					compoundCommand.append(command);
					editingDomain.getCommandStack().execute(compoundCommand);
					}
				}
			});
		}

	}

	private BTSConfigItem getRelationConfig(BTSRelation relation) {
		if (relationConfigCache.containsKey(relation.getType())) {
			return relationConfigCache.get(relation.getType());
		} else {
			BTSConfigItem last = null;
			for (BTSConfigItem child : listAllRelationConfigs()) {
				
				//if relation type not set
				if (relation.getType() == null && child.getValue().equals("partOf"))
				{
					return child;
				}
				else if (child.getValue() != null
						&& child.getValue().equals(relation.getType())) {
					relationConfigCache.put(child.getType(), child);
					return child;
				}
				last = child;
			}
			return last;
		}
	}

	private List<BTSConfigItem> listAllRelationConfigs() {
		if (cachedRelationConfigs == null) {
			cachedRelationConfigs = new Vector<BTSConfigItem>();
			addToListRecursively(configurationController
					.getRelationsConfigItem());

		}
		return cachedRelationConfigs;
	}

	private void addToListRecursively(BTSConfig relationsConfigItem) {
		if (!BTSCoreConstants.RELATIONS
				.equals(((BTSConfigItem) relationsConfigItem).getValue()))
		{
			cachedRelationConfigs.add((BTSConfigItem) relationsConfigItem);
		}
		for (BTSConfig item : relationsConfigItem.getChildren()) {
			addToListRecursively(item);
		}

	}

	private void createWidget(final BTSRelation relation, int index,
			BTSConfigItem relationConfig) {
		IEclipseContext child = context.createChild("relation:"
				+ relation.get_id());

		Composite composite = new Composite(this, SWT.NONE);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, true, 1,
				1));
		composite.setLayout(new GridLayout(1, true));
		composite.setBackground(this.getBackground());
		((GridLayout) composite.getLayout()).marginWidth = 0;
		((GridLayout) composite.getLayout()).marginHeight = 0;
		((GridLayout) composite.getLayout()).horizontalSpacing = 5;
		((GridLayout) composite.getLayout()).verticalSpacing = 5;

		child.set(Composite.class, composite);
		child.set(BTSConfigItem.class, relationConfig);
		child.set(EditingDomain.class, editingDomain);
		child.set(BTSRelation.class, relation);

		child.set(BTSObject.class, object);
		child.set(BTSResourceProvider.class, resourceProvider);
		RelationEditorComposite editor = ContextInjectionFactory.make(
				RelationEditorComposite.class, child);
		// relationMap.put(relationConfig, composite);

		if (index == 0) {

			Label delButton = new Label(this, SWT.PUSH);
			setButtonImage(delButton, relationConfig, false);
			delButton.setToolTipText("Remove widget");
			delButton.setLayoutData(new GridData(SWT.RIGHT, SWT.TOP, false,
					false, 1, 1));
			((GridData) delButton.getLayoutData()).verticalIndent = 2;
			delButton.addMouseListener(new MouseAdapter() {

				@Override
				public void mouseDown(MouseEvent e) {
					if (CompoundRelationsEditorComposite.this.userMayEdit)
					{
					Label l = (Label) e.getSource();
					l.setBackground(BTSUIConstants.VIEW_BACKGROUND_LABEL_PRESSED);
					}
				}

				@Override
				public void mouseUp(MouseEvent e) {
					if (CompoundRelationsEditorComposite.this.userMayEdit)
					{
					Label l = (Label) e.getSource();
					l.setBackground(l.getParent().getBackground());
					CompoundCommand compoundCommand = new CompoundCommand();
					org.eclipse.emf.common.command.Command command = DeleteCommand
							.create(editingDomain, relation);
					compoundCommand.append(command);
					editingDomain.getCommandStack().execute(compoundCommand);
					}
				}
			});
			Label addButton = new Label(this, SWT.PUSH);
			setButtonImage(addButton, relationConfig, true);
			addButton.setToolTipText("Add Relation");
			addButton.setLayoutData(new GridData(SWT.RIGHT, SWT.TOP, false,
					false, 1, 1));
			((GridData) addButton.getLayoutData()).verticalIndent = 2;
			addButton.addMouseListener(new MouseAdapter() {

				@Override
				public void mouseDown(MouseEvent e) {
					if (CompoundRelationsEditorComposite.this.userMayEdit)
					{
					Label l = (Label) e.getSource();
					l.setBackground(BTSUIConstants.VIEW_BACKGROUND_LABEL_PRESSED);
					}
				}

				@Override
				public void mouseUp(MouseEvent e) {
					if (CompoundRelationsEditorComposite.this.userMayEdit)
					{
					Label l = (Label) e.getSource();
					l.setBackground(l.getParent().getBackground());
					BTSRelation rel = makeAdditionalRelation();
					CompoundCommand compoundCommand = new CompoundCommand();
					org.eclipse.emf.common.command.Command command = AddCommand
							.create(editingDomain,
									object,
									BtsmodelPackage.Literals.BTS_OBJECT__RELATIONS,
									rel);
					compoundCommand.append(command);
					editingDomain.getCommandStack().execute(compoundCommand);
					}
				}
			});
		} else {
			Label delButton = new Label(this, SWT.PUSH);
			setButtonImage(delButton, relationConfig, false);

			delButton.setToolTipText("Remove widget");
			delButton.setLayoutData(new GridData(SWT.RIGHT, SWT.TOP, false,
					false, 1, 1));
			((GridData) delButton.getLayoutData()).verticalIndent = 2;
			((GridData) delButton.getLayoutData()).horizontalSpan = 2;

			delButton.addMouseListener(new MouseAdapter() {

				@Override
				public void mouseDown(MouseEvent e) {
					if (CompoundRelationsEditorComposite.this.userMayEdit)
					{
					Label l = (Label) e.getSource();
					l.setBackground(BTSUIConstants.VIEW_BACKGROUND_LABEL_PRESSED);
					}
				}

				@Override
				public void mouseUp(MouseEvent e) {
					if (CompoundRelationsEditorComposite.this.userMayEdit)
					{
					Label l = (Label) e.getSource();
					l.setBackground(l.getParent().getBackground());
					CompoundCommand compoundCommand = new CompoundCommand();
					org.eclipse.emf.common.command.Command command = DeleteCommand
							.create(editingDomain, relation);
					compoundCommand.append(command);
					editingDomain.getCommandStack().execute(compoundCommand);
					}
				}
			});
		}

	}

	private void setButtonImage(Label button, BTSConfigItem relationConfig,
			boolean isAdd) {
		if (isAdd) {
			button.setImage(resourceProvider.getImage(Display.getDefault(),
					BTSResourceProvider.IMG_ADD));
		} else {
			button.setImage(resourceProvider.getImage(Display.getDefault(),
					BTSResourceProvider.IMG_DELETE));
		}

	}

	protected BTSRelation makeAdditionalRelation() {
		BTSRelation rel = BtsmodelFactory.eINSTANCE.createBTSRelation();
		return rel;
	}
	
	
	
	
}