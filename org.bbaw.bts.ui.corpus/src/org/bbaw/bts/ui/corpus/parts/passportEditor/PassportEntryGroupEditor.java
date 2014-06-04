package org.bbaw.bts.ui.corpus.parts.passportEditor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.bbaw.bts.btsmodel.BTSConfig;
import org.bbaw.bts.btsmodel.BTSConfigItem;
import org.bbaw.bts.btsmodel.BTSCorpusObject;
import org.bbaw.bts.btsmodel.BTSPassport;
import org.bbaw.bts.btsmodel.BTSPassportEntry;
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
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;

public class PassportEntryGroupEditor extends PassportEntryEditorComposite {

	@Inject
	private BTSConfigItem groupConfig;
	@Inject
	private IEclipseContext context;
	@Inject
	private BTSPassport passport;
	@Inject
	private EditingDomain editingDomain;
	@Inject
	@Named(BTSUIConstants.PASSPORT_ENTRIES)
	private List<BTSPassportEntry> entries;
	@Inject
	@Optional
	@Named(BTSUIConstants.PASSPORT_PARENT_ENTRY_GROUP)
	private BTSPassportEntry parentEntry;

	@Inject
	@Optional
	@Named(BTSUIConstants.PASSPORT_PARENT_ENTRY_EDITOR)
	private PassportEntryEditorComposite parentEntryEditor;

	@Inject
	@Named(BTSUIConstants.PASSPORT_TABITEM_MAIN_COMPOSITE)
	private Composite tabitemParentComposite;
	@Inject
	@Named(BTSUIConstants.PASSPORT_ENTRY_PATH)
	private List<BTSPassportEntry> entryPath;
	@Inject
	private BTSCorpusObject corpusObject;
	@Inject
	private BTSConfigurationController configurationController;
	@Inject
	private BTSResourceProvider resourceProvider;

	private boolean isGroup;
	private Map<BTSConfigItem, PassportEntryEditorComposite> groupMap = new HashMap<BTSConfigItem, PassportEntryEditorComposite>();

	@Inject
	public PassportEntryGroupEditor(Composite parent) {
		super(parent, SWT.NONE);
		this.isGroup = (parent instanceof PassportEntryEditorComposite)
				|| (parent instanceof Group);
	}

	@PostConstruct
	public void postConstruct() {
		int hwidth = BTSUIConstants.PASSPORT_COLUMN_NUMBER;
		if (isGroup && groupConfig.getPassportEditorConfig() != null) {
			hwidth = groupConfig.getPassportEditorConfig().getHorizontalWidth();
		}
		this.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, true, hwidth,
				1));
		this.setLayout(new GridLayout(BTSUIConstants.PASSPORT_COLUMN_NUMBER,
				false));
		((GridLayout) this.getLayout()).marginWidth = 0;
		((GridLayout) this.getLayout()).marginHeight = 0;

		// draw group onto this

		makeContent(false, false);

	}

	private void makeContent(boolean resize, boolean relayout) {
		if (isGroup) {
			makeGroupContent();
		} else {
			makeCategoryContent();

		}

		// if (resize) {
		// forceResizeRelayout(tabitemParentComposite);
		//
		// }
		// if (relayout) {
		// forceResizeRelayout(this);
		// parentEntryEditor.layout();
		//
		// }
	}

	private void makeCategoryContent() {
		BTSPassportEntry entry = entries.get(0);
		entryPath.add(entry);

		List<BTSConfig> filteredChildren = configurationController
				.getFilteredChildren(groupConfig, corpusObject);
		for (BTSConfig child : filteredChildren) {
			if (child instanceof BTSConfigItem
					&& !((BTSConfigItem) child).isIgnore()) {
				BTSConfigItem childConfig = (BTSConfigItem) child;

				if (BTSCoreConstants.PASSPORT_ENTRY_GROUP.equals(childConfig
						.getType())) {

					List<BTSPassportEntry> childEntryGroups = findMatchingEntries(
							entry, childConfig, null, passport, true,
							BTSCoreConstants.PASSPORT_ENTRY_GROUP);
					loadPassportEntryGroupComposite(childConfig,
							childEntryGroups, this, entry, entryPath);
				} else if (BTSCoreConstants.PASSPORT_ENTRY_ITEM
						.equals(childConfig.getType())) {
					List<BTSPassportEntry> childEntryGroups = findMatchingEntries(
							entry, childConfig, null, passport, true,
							BTSCoreConstants.PASSPORT_ENTRY_ITEM);
					loadPassportEntryItemComposite(childConfig,
							childEntryGroups, this, entry, entryPath);
				}
			}
		}

	}

	private void makeGroupContent() {
		for (int i = 0; i < entries.size(); i++) {
			final BTSPassportEntry entry = entries.get(i);
			List<BTSPassportEntry> path = new Vector<>();
			path.addAll(entryPath);
			path.add(entry);
			Composite group = new Group(this, SWT.NONE);
			group.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true,
					BTSUIConstants.PASSPORT_COLUMN_NUMBER, 1));
			group.setLayout(new GridLayout(2, false));
			((GridLayout) group.getLayout()).marginWidth = 0;
			((GridLayout) group.getLayout()).marginHeight = 0;
			((GridLayout) group.getLayout()).horizontalSpacing = 0;
			((GridLayout) group.getLayout()).verticalSpacing = 0;
			((Group) group).setText(groupConfig.getValue());

			Composite composite = new Composite(group, SWT.NONE);
			composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
					true, 1, 1));
			composite.setLayout(new GridLayout(
					BTSUIConstants.PASSPORT_COLUMN_NUMBER, true));
			((GridLayout) composite.getLayout()).marginWidth = 0;
			((GridLayout) composite.getLayout()).marginHeight = 0;
			((GridLayout) group.getLayout()).horizontalSpacing = 7;
			((GridLayout) group.getLayout()).verticalSpacing = 0;
			List<BTSConfig> filteredChildren = configurationController
					.getFilteredChildren(groupConfig, corpusObject);
			for (BTSConfig child : filteredChildren) {
				if (child instanceof BTSConfigItem
						&& !((BTSConfigItem) child).isIgnore()) {
					BTSConfigItem childConfig = (BTSConfigItem) child;
					if (BTSCoreConstants.PASSPORT_ENTRY_GROUP
							.equals(childConfig.getType())) {
						List<BTSPassportEntry> childEntryGroups = findMatchingEntries(
								entry, childConfig, parentEntry, passport,
								true, BTSCoreConstants.PASSPORT_ENTRY_GROUP);
						loadPassportEntryGroupComposite(childConfig,
								childEntryGroups, composite, entry, path);
					} else if (BTSCoreConstants.PASSPORT_ENTRY_ITEM
							.equals(childConfig.getType())) {
						List<BTSPassportEntry> childEntryGroups = findMatchingEntries(
								entry, childConfig, parentEntry, passport,
								true, BTSCoreConstants.PASSPORT_ENTRY_ITEM);
						loadPassportEntryItemComposite(childConfig,
								childEntryGroups, composite, entry, path);
					}
				}
			}
			if (groupConfig.getPassportEditorConfig().isAllowMultiple()
					|| entries.size() > 1) {
				if (groupConfig.getPassportEditorConfig().isAllowMultiple()
						&& i == 0) {
					Composite compositeAddButton = new Composite(group,
							SWT.NONE);
					compositeAddButton.setLayoutData(new GridData(SWT.RIGHT,
							SWT.BEGINNING, false, true, 1, 1));
					compositeAddButton.setLayout(new GridLayout(1, false));
					((GridLayout) compositeAddButton.getLayout()).marginWidth = 0;
					((GridLayout) compositeAddButton.getLayout()).marginHeight = 0;

					Label addButton = new Label(compositeAddButton, SWT.PUSH);
					addButton.setToolTipText("Add Entry Group");
					addButton.setImage(resourceProvider.getImage(
							Display.getDefault(),
							BTSResourceProvider.IMG_WIDGET_GROUP_ADD));
					addButton.setLayoutData(new GridData(SWT.RIGHT,
							SWT.BEGINNING, false, false, 1, 1));
					addButton.addMouseListener(new MouseAdapter() {

						@Override
						public void mouseDown(MouseEvent e) {
							if (PassportEntryGroupEditor.this.userMayEdit)
							{
							Label l = (Label) e.getSource();
							l.setBackground(BTSUIConstants.VIEW_BACKGROUND_LABEL_PRESSED);
							}
						}

						@Override
						public void mouseUp(MouseEvent e) {
							if (PassportEntryGroupEditor.this.userMayEdit)
							{
								Label l = (Label) e.getSource();
								l.setBackground(l.getParent().getBackground());
								BTSPassportEntry addEntry = makeAdditionalEntry();
								CompoundCommand compoundCommand = new CompoundCommand();
								org.eclipse.emf.common.command.Command command = AddCommand
										.create(editingDomain,
												parentEntry,
												BtsmodelPackage.Literals.BTS_PASSPORT_ENTRY__CHILDREN,
												addEntry);
								compoundCommand.append(command);
								editingDomain.getCommandStack().execute(
										compoundCommand);
							}

						}

					});

					Label delButton = new Label(compositeAddButton, SWT.PUSH);
					delButton.setToolTipText("Remove Entry Group");
					delButton.setImage(resourceProvider.getImage(
							Display.getDefault(),
							BTSResourceProvider.IMG_WIDGET_GROUP_DELETE));
					delButton.setLayoutData(new GridData(SWT.RIGHT,
							SWT.BEGINNING, false, false, 1, 1));
					delButton.addMouseListener(new MouseAdapter() {

						@Override
						public void mouseDown(MouseEvent e) {
							if (PassportEntryGroupEditor.this.userMayEdit)
							{
							Label l = (Label) e.getSource();
							l.setBackground(BTSUIConstants.VIEW_BACKGROUND_LABEL_PRESSED);
							}
						}

						@Override
						public void mouseUp(MouseEvent e) {
							if (PassportEntryGroupEditor.this.userMayEdit)
							{
								Label l = (Label) e.getSource();
								l.setBackground(l.getParent().getBackground());
								System.out.println("entry group editor delete");
	
								CompoundCommand compoundCommand = new CompoundCommand();
								org.eclipse.emf.common.command.Command command = DeleteCommand
										.create(editingDomain, entry);
								compoundCommand.append(command);
								editingDomain.getCommandStack().execute(
										compoundCommand);
							}
						}
					});

				} else {
					Label delButton = new Label(group, SWT.PUSH);
					delButton.setToolTipText("Remove Entry Group");
					delButton.setImage(resourceProvider.getImage(
							Display.getDefault(),
							BTSResourceProvider.IMG_WIDGET_GROUP_DELETE));
					delButton.setLayoutData(new GridData(SWT.RIGHT,
							SWT.BEGINNING, false, false, 1, 1));
					delButton.addMouseListener(new MouseAdapter() {

						@Override
						public void mouseDown(MouseEvent e) {
							if (PassportEntryGroupEditor.this.userMayEdit)
							{
							Label l = (Label) e.getSource();
							l.setBackground(BTSUIConstants.VIEW_BACKGROUND_LABEL_PRESSED);
							}
						}

						@Override
						public void mouseUp(MouseEvent e) {
							if (PassportEntryGroupEditor.this.userMayEdit)
							{
								Label l = (Label) e.getSource();
								l.setBackground(l.getParent().getBackground());
								System.out.println("entry group editor delete");
	
								CompoundCommand compoundCommand = new CompoundCommand();
								org.eclipse.emf.common.command.Command command = DeleteCommand
										.create(editingDomain, entry);
								compoundCommand.append(command);
								editingDomain.getCommandStack().execute(
										compoundCommand);
							}
						}
					});
				}
			} else {
				new Label(group, SWT.None);
			}
		}
	}

	protected BTSPassportEntry makeAdditionalEntry() {
		BTSPassportEntry entry = BtsmodelFactory.eINSTANCE
				.createBTSPassportEntryGroup();
		entry.setType(groupConfig.getValue());
		return entry;
	}

	private void loadPassportEntryItemComposite(BTSConfigItem itemConfig,
			List<BTSPassportEntry> childEntryGroups, Composite composite,
			BTSPassportEntry childParentEntryGroup, List<BTSPassportEntry> path) {
		IEclipseContext child = context.createChild("group:"
				+ itemConfig.getValue());

		child.set(Composite.class, composite);
		child.set(BTSConfigItem.class, itemConfig);
		child.set(BTSPassport.class, passport);
		child.set(EditingDomain.class, editingDomain);
		child.set(BTSUIConstants.PASSPORT_PARENT_ENTRY_GROUP,
				childParentEntryGroup);
		child.set(BTSUIConstants.PASSPORT_ENTRIES, childEntryGroups);
		child.set(BTSUIConstants.PASSPORT_TABITEM_MAIN_COMPOSITE,
				tabitemParentComposite);

		child.set(BTSUIConstants.PASSPORT_PARENT_ENTRY_EDITOR,
				PassportEntryGroupEditor.this);
		child.set(BTSUIConstants.PASSPORT_ENTRY_PATH, path);
		child.set(BTSCorpusObject.class, corpusObject);
		child.set(BTSResourceProvider.class, resourceProvider);
		PassportEntryItemEditor categoryComposite = ContextInjectionFactory
				.make(PassportEntryItemEditor.class, child);
		groupMap.put(itemConfig, categoryComposite);

	}

	private void loadPassportEntryGroupComposite(BTSConfigItem groupConfig,
			List<BTSPassportEntry> childEntryGroups, Composite composite,
			BTSPassportEntry childParentEntryGroup, List<BTSPassportEntry> path) {

		IEclipseContext child = context.createChild("group:"
				+ groupConfig.getValue());
		child.set(Composite.class, composite);
		child.set(BTSConfigItem.class, groupConfig);
		child.set(BTSPassport.class, passport);
		child.set(EditingDomain.class, editingDomain);
		child.set(BTSUIConstants.PASSPORT_PARENT_ENTRY_GROUP,
				childParentEntryGroup);
		child.set(BTSUIConstants.PASSPORT_ENTRIES, childEntryGroups);
		child.set(BTSUIConstants.PASSPORT_PARENT_ENTRY_EDITOR,
				PassportEntryGroupEditor.this);
		child.set(BTSUIConstants.PASSPORT_TABITEM_MAIN_COMPOSITE,
				tabitemParentComposite);

		child.set(BTSUIConstants.PASSPORT_PARENT_ENTRY_EDITOR,
				PassportEntryGroupEditor.this);
		child.set(BTSUIConstants.PASSPORT_ENTRY_PATH, path);
		child.set(BTSCorpusObject.class, corpusObject);
		child.set(BTSResourceProvider.class, resourceProvider);

		PassportEntryGroupEditor categoryComposite = ContextInjectionFactory
				.make(PassportEntryGroupEditor.class, child);
		groupMap.put(groupConfig, categoryComposite);

	}

	@Override
	protected void setUserMayEditInteral(boolean mayEdit) {
		this.userMayEdit = mayEdit;

	}

}
