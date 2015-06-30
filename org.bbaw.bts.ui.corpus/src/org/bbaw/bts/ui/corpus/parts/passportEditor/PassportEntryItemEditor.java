package org.bbaw.bts.ui.corpus.parts.passportEditor;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.bbaw.bts.btsmodel.BTSConfigItem;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.btsmodel.BtsmodelPackage;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.controller.generalController.BTSConfigurationController;
import org.bbaw.bts.core.controller.generalController.GeneralBTSObjectController;
import org.bbaw.bts.core.corpus.controller.generalController.PassportConfigurationController;
import org.bbaw.bts.core.corpus.controller.partController.PassportEditorPartController;
import org.bbaw.bts.core.corpus.controller.partController.ThsNavigatorController;
import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject;
import org.bbaw.bts.corpus.btsCorpusModel.BTSPassport;
import org.bbaw.bts.corpus.btsCorpusModel.BTSPassportEntry;
import org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelFactory;
import org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelPackage;
import org.bbaw.bts.ui.commons.controldecoration.BackgroundControlDecorationSupport;
import org.bbaw.bts.ui.commons.converter.BTSBooleanToStringConverter;
import org.bbaw.bts.ui.commons.converter.BTSConfigItemToStringConverter;
import org.bbaw.bts.ui.commons.converter.BTSIntegerToStringConverter;
import org.bbaw.bts.ui.commons.converter.BTSStringToBooleanConverter;
import org.bbaw.bts.ui.commons.converter.BTSStringToConfigItemConverter;
import org.bbaw.bts.ui.commons.converter.BTSStringToIntegerConverter;
import org.bbaw.bts.ui.commons.filter.BTSObjectTypeSubtypeViewerFilter;
import org.bbaw.bts.ui.commons.utils.BTSUIConstants;
import org.bbaw.bts.ui.commons.validator.StringNotEmptyValidator;
import org.bbaw.bts.ui.commons.validator.StringRegexValidator;
import org.bbaw.bts.ui.corpus.dialogs.PassportEditorDialog;
import org.bbaw.bts.ui.main.dialogs.SearchSelectObjectDialog;
import org.bbaw.bts.ui.main.widgets.ObjectSelectionProposalProvider;
import org.bbaw.bts.ui.resources.BTSResourceProvider;
import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.Preference;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.databinding.EMFUpdateValueStrategy;
import org.eclipse.emf.databinding.edit.EMFEditProperties;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.bindings.keys.KeyStroke;
import org.eclipse.jface.bindings.keys.ParseException;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.databinding.viewers.ViewersObservables;
import org.eclipse.jface.fieldassist.ContentProposalAdapter;
import org.eclipse.jface.fieldassist.ControlDecoration;
import org.eclipse.jface.fieldassist.FieldDecorationRegistry;
import org.eclipse.jface.fieldassist.IContentProposal;
import org.eclipse.jface.fieldassist.IContentProposalListener;
import org.eclipse.jface.fieldassist.IContentProposalProvider;
import org.eclipse.jface.fieldassist.TextContentAdapter;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.widgets.Text;

public class PassportEntryItemEditor extends PassportEntryEditorComposite {

	@Inject
	private BTSConfigItem itemConfig;
	@Inject
	private IEclipseContext context;
	@Inject
	private BTSPassport passport;
	@Inject
	private EditingDomain editingDomain;
	@Inject
	@Named(BTSUIConstants.PASSPORT_PARENT_ENTRY_GROUP)
	private BTSPassportEntry parentEntry;
	@Inject
	@Named(BTSUIConstants.PASSPORT_ENTRIES)
	private List<BTSPassportEntry> entries;
	@Inject
	@Optional
	@Named(BTSUIConstants.PASSPORT_PARENT_ENTRY_EDITOR)
	private PassportEntryEditorComposite parentEntryEditor;
	@Inject
	@Named(BTSUIConstants.PASSPORT_TABITEM_MAIN_COMPOSITE)
	private Composite tabitemParentComposite;
	@Inject
	private PassportEditorPartController passportEditorController;
	@Inject
	@Named(BTSUIConstants.PASSPORT_ENTRY_PATH)
	private List<BTSPassportEntry> entryPath;
	@Inject
	private GeneralBTSObjectController generalObjectController;

	private IContentProposalProvider itemProposalProvider;
	private boolean makingProposalProvider;
	@Inject
	private BTSResourceProvider resourceProvider;
	@Inject
	@Optional
	@Preference(value = "locale_lang", nodePath = "org.bbaw.bts.app")
	private String lang;
	@Inject
	private BTSCorpusObject corpusObject;
	private Text ths_select_text;
	
	@Inject
	private ThsNavigatorController thsNavigatorController;
	private ObjectSelectionProposalProvider thsItemProposalProvider;
	private Text textField;
	private Button checkBox;
	private Spinner spinner;
	private Text textSuggest;
	private Combo combo;
	private Text text;
	@Inject
	private PassportConfigurationController passportConfigurationController;

	@Inject
	public PassportEntryItemEditor(Composite parent) {
		super(parent, SWT.NONE);
	}

	@Inject
	public PassportEntryItemEditor(PassportEntryEditorComposite parent) {
		super(parent, SWT.NONE);
	}
	@PostConstruct
	public void postConstruct() {
		int hwidth = BTSUIConstants.PASSPORT_COLUMN_NUMBER;
		if (itemConfig.getPassportEditorConfig() != null) {
			hwidth = itemConfig.getPassportEditorConfig().getHorizontalWidth();
		}
		this.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, true, hwidth,
				1));
		((GridData) this.getLayoutData()).horizontalIndent = 7;
		this.setLayout(new GridLayout(
				BTSUIConstants.PASSPORT_COLUMN_NUMBER + 2,
				false));
		((GridLayout) this.getLayout()).marginWidth = 0;
		((GridLayout) this.getLayout()).marginHeight = 0;
		((GridLayout) this.getLayout()).horizontalSpacing = 0;

		loadContent(false);
		setUserMayEditInteral(userMayEdit);
	}

	private void loadContent(boolean b) {
		// System.out.println("passportItemEditor loadcontent");
		entryPath.add(entries.get(0));
		for (int i = 0; i < entries.size(); i++) {
			final BTSPassportEntry entry = entries.get(i);

			loadItemWidget(itemConfig, entry);

			if (itemConfig.getPassportEditorConfig().isAllowMultiple()
					|| entries.size() > 1) {
				if (itemConfig.getPassportEditorConfig().isAllowMultiple()
						&& i == 0) {

					Label delButton = new Label(this, SWT.PUSH);
					setButtonImage(delButton, itemConfig, false);
					delButton.setToolTipText("Remove widget");
					delButton.setLayoutData(new GridData(SWT.RIGHT, SWT.TOP,
							false, false, 1, 1));
					((GridData) delButton.getLayoutData()).verticalIndent = 2;
					((GridData) delButton.getLayoutData()).horizontalIndent = 2;

					delButton.addMouseListener(new MouseAdapter() {


						@Override
						public void mouseDown(MouseEvent e) {
							if (PassportEntryItemEditor.this.userMayEdit)
							{
							Label l = (Label) e.getSource();
							l.setBackground(BTSUIConstants.VIEW_BACKGROUND_LABEL_PRESSED);
							}
						}

						@Override
						public void mouseUp(MouseEvent e) {
							if (PassportEntryItemEditor.this.userMayEdit)
							{
							Label l = (Label) e.getSource();
							l.setBackground(l.getParent().getBackground());
							CompoundCommand compoundCommand = new CompoundCommand();
							org.eclipse.emf.common.command.Command command = DeleteCommand
									.create(editingDomain, entry);
							compoundCommand.append(command);
							editingDomain.getCommandStack().execute(
									compoundCommand);
							}
						}
					});
					Label addButton = new Label(this, SWT.PUSH);
					setButtonImage(addButton, itemConfig, true);
					addButton.setToolTipText("Add widget");
					addButton.setLayoutData(new GridData(SWT.RIGHT, SWT.TOP,
							false, false, 1, 1));
					((GridData) addButton.getLayoutData()).verticalIndent = 2;
					((GridData) addButton.getLayoutData()).horizontalIndent = 2;

					addButton.addMouseListener(new MouseAdapter() {


						@Override
						public void mouseDown(MouseEvent e) {
							if (PassportEntryItemEditor.this.userMayEdit)
							{
							Label l = (Label) e.getSource();
							l.setBackground(BTSUIConstants.VIEW_BACKGROUND_LABEL_PRESSED);
							}

						}

						@Override
						public void mouseUp(MouseEvent e) {
							if (PassportEntryItemEditor.this.userMayEdit)
							{
							Label l = (Label) e.getSource();
							l.setBackground(l.getParent().getBackground());
							BTSPassportEntry addEntry = makeAdditionalEntry();
							CompoundCommand compoundCommand = new CompoundCommand();
							org.eclipse.emf.common.command.Command command = AddCommand
									.create(editingDomain,
											parentEntry,
											BtsCorpusModelPackage.Literals.BTS_PASSPORT_ENTRY__CHILDREN,
											addEntry);
							compoundCommand.append(command);
							editingDomain.getCommandStack().execute(
									compoundCommand);
							}
						}
					});
				} else {
					Label delButton = new Label(this, SWT.PUSH);
					setButtonImage(delButton, itemConfig, false);

					delButton.setToolTipText("Remove widget");
					delButton.setLayoutData(new GridData(SWT.RIGHT, SWT.TOP,
							false, false, 1, 1));
					((GridData) delButton.getLayoutData()).verticalIndent = 2;
					((GridData) delButton.getLayoutData()).horizontalIndent = 2;

					delButton.addMouseListener(new MouseAdapter() {

						@Override
						public void mouseDown(MouseEvent e) {
							if (PassportEntryItemEditor.this.userMayEdit)
							{
							Label l = (Label) e.getSource();
							l.setBackground(BTSUIConstants.VIEW_BACKGROUND_LABEL_PRESSED);
							}
						}

						@Override
						public void mouseUp(MouseEvent e) {
							if (PassportEntryItemEditor.this.userMayEdit)
							{
							Label l = (Label) e.getSource();
							l.setBackground(l.getParent().getBackground());
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
				new Label(this, SWT.None);
				new Label(this, SWT.None);
			}
		}

		// if (b) {
		// forceResizeRelayout(parentEntryEditor);
		// forceResizeRelayout(tabitemParentComposite);
		//
		// }
	}

	private void setButtonImage(Label button, BTSConfigItem ic, boolean isAdd) {
		if (BTSCoreConstants.WIDGET_TYPE_TEXT.equals(ic
				.getPassportEditorConfig()
				.getWidgetType())) {
			if (isAdd) {
				button.setImage(resourceProvider.getImage(Display.getDefault(),
						BTSResourceProvider.IMG_WIDGET_TEXT_ADD));
			} else {
				button.setImage(resourceProvider.getImage(Display.getDefault(),
						BTSResourceProvider.IMG_WIDGET_TEXT_DELETE));
			}
		} else if (BTSCoreConstants.WIDGET_TYPE_TEXT_SUGGEST.equals(ic
				.getPassportEditorConfig().getWidgetType())) {
			if (isAdd) {
				button.setImage(resourceProvider.getImage(Display.getDefault(),
						BTSResourceProvider.IMG_WIDGET_TEXT_ADD));
			} else {
				button.setImage(resourceProvider.getImage(Display.getDefault(),
						BTSResourceProvider.IMG_WIDGET_TEXT_DELETE));
			}
		} else if (BTSCoreConstants.WIDGET_TYPE_TEXT_FIELD.equals(ic
				.getPassportEditorConfig().getWidgetType())) {
			if (isAdd) {
				button.setImage(resourceProvider.getImage(Display.getDefault(),
						BTSResourceProvider.IMG_WIDGET_TEXT_AREA_ADD));
			} else {
				button.setImage(resourceProvider.getImage(Display.getDefault(),
						BTSResourceProvider.IMG_WIDGET_TEXT_AREA_DELETE));
			}
		} else if (BTSCoreConstants.WIDGET_TYPE_SELECT_CONFIG.equals(ic
				.getPassportEditorConfig().getWidgetType())) {
			if (isAdd) {
				button.setImage(resourceProvider.getImage(Display.getDefault(),
						BTSResourceProvider.IMG_WIDGET_COMBO_ADD));
			} else {
				button.setImage(resourceProvider.getImage(Display.getDefault(),
						BTSResourceProvider.IMG_WIDGET_COMBO_DELETE));
			}
		} else if (BTSCoreConstants.WIDGET_TYPE_SELECT_INTEGER.equals(ic
				.getPassportEditorConfig().getWidgetType())) {
			if (isAdd) {
				button.setImage(resourceProvider.getImage(Display.getDefault(),
						BTSResourceProvider.IMG_WIDGET_SPIN_ADD));
			} else {
				button.setImage(resourceProvider.getImage(Display.getDefault(),
						BTSResourceProvider.IMG_WIDGET_SPIN_DELETE));
			}
		} else if (BTSCoreConstants.WIDGET_TYPE_SELECT_THS.equals(ic
				.getPassportEditorConfig().getWidgetType())
				|| (BTSCoreConstants.WIDGET_TYPE_REFERENCE_EXTERNAL.equals(ic
						.getPassportEditorConfig().getWidgetType()))) {
			if (isAdd) {
				button.setImage(resourceProvider.getImage(Display.getDefault(),
						BTSResourceProvider.IMG_WIDGET_REFERENCE_ADD));
			} else {
				button.setImage(resourceProvider.getImage(Display.getDefault(),
						BTSResourceProvider.IMG_WIDGET_REFERENCE_DELETE));
			}
		} else if (BTSCoreConstants.WIDGET_TYPE_BOOLEAN.equals(ic
				.getPassportEditorConfig().getWidgetType())) {
			if (isAdd) {
				button.setImage(resourceProvider.getImage(Display.getDefault(),
						BTSResourceProvider.IMG_WIDGET_CHECK_BOX_ADD));
			} else {
				button.setImage(resourceProvider.getImage(Display.getDefault(),
						BTSResourceProvider.IMG_WIDGET_CHECK_BOX_DELETE));
			}
		} else if (BTSCoreConstants.WIDGET_TYPE_DATE.equals(ic
				.getPassportEditorConfig().getWidgetType())) {
			if (isAdd) {
				button.setImage(resourceProvider.getImage(Display.getDefault(),
						BTSResourceProvider.IMG_WIDGET_DATE_ADD));
			} else {
				button.setImage(resourceProvider.getImage(Display.getDefault(),
						BTSResourceProvider.IMG_WIDGET_DATE_DELETE));
			}
		} else {
			if (isAdd) {
				button.setImage(resourceProvider.getImage(Display.getDefault(),
						BTSResourceProvider.IMG_CONFIG_ITEM_ADD));
			} else {
				button.setImage(resourceProvider.getImage(Display.getDefault(),
						BTSResourceProvider.IMG_CONFIG_ITEM_DELETE));
			}
		}

	}

	private void loadItemWidget(BTSConfigItem itemConfig2,
			BTSPassportEntry entry) {

		if (itemConfig.getPassportEditorConfig() != null) {

			// first check and load standard widget types
			if (BTSCoreConstants.WIDGET_TYPE_TEXT.equals(itemConfig
					.getPassportEditorConfig().getWidgetType())) {
				loadTextWidget(itemConfig, entry);
			} else if (BTSCoreConstants.WIDGET_TYPE_TEXT_SUGGEST
					.equals(itemConfig.getPassportEditorConfig()
							.getWidgetType())) {
				loadTextSuggestWidget(itemConfig, entry);
			} else if (BTSCoreConstants.WIDGET_TYPE_TEXT_FIELD
					.equals(itemConfig
					.getPassportEditorConfig().getWidgetType())) {
				loadTextFieldWidget(itemConfig, entry);
			} else if (BTSCoreConstants.WIDGET_TYPE_SELECT_CONFIG
					.equals(itemConfig.getPassportEditorConfig()
							.getWidgetType())) {
				loadSelectConfigWidget(itemConfig, entry);
			} else if (BTSCoreConstants.WIDGET_TYPE_SELECT_INTEGER
					.equals(itemConfig.getPassportEditorConfig()
							.getWidgetType())) {
				loadSelectIntegerWidget(itemConfig, entry);
			} else if (BTSCoreConstants.WIDGET_TYPE_SELECT_THS
					.equals(itemConfig
					.getPassportEditorConfig().getWidgetType())) {
				loadSelectTHSWidget(itemConfig, entry);
			} else if (BTSCoreConstants.WIDGET_TYPE_BOOLEAN.equals(itemConfig
					.getPassportEditorConfig().getWidgetType())) {
				loadBooleanWidget(itemConfig, entry);
			} else if (BTSCoreConstants.WIDGET_TYPE_DATE.equals(itemConfig
					.getPassportEditorConfig().getWidgetType())) {
				loadDateWidget(itemConfig, entry);
			} else if (BTSCoreConstants.WIDGET_TYPE_REFERENCE_EXTERNAL
					.equals(itemConfig
					.getPassportEditorConfig().getWidgetType())) {
				loadReferenceWidget(itemConfig, entry);
			}

			// TODO now check widget types from extension point
		}

	}

	private void loadTextFieldWidget(BTSConfigItem itemConfig2,
			BTSPassportEntry entry) {
		Label label = new Label(this, SWT.NONE);
		label.setText(getLabel(itemConfig));
		label.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false,
				BTSUIConstants.PASSPORT_COLUMN_NUMBER, 1));

		// label.pack();
		textField = new Text(this, SWT.BORDER | SWT.MULTI | SWT.WRAP);
		textField.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, true,
				BTSUIConstants.PASSPORT_COLUMN_NUMBER, 4));
		((GridData) textField.getLayoutData()).minimumHeight = 60;
		if (itemConfig2.getDescription() != null
				&& !itemConfig2.getDescription().getLanguages().isEmpty()) {
			final ControlDecoration deco = new ControlDecoration(textField,
					SWT.BOTTOM | SWT.LEFT);

			// re-use an existing image
			Image image = FieldDecorationRegistry
					.getDefault()
					.getFieldDecoration(FieldDecorationRegistry.DEC_INFORMATION)
					.getImage();
			// set description and image
			deco.setDescriptionText(itemConfig2.getDescription()
					.getTranslation(lang));
			deco.setImage(image);
		}
		DataBindingContext bindingContext = new DataBindingContext();

		EMFUpdateValueStrategy us = null;
		if (itemConfig.getPassportEditorConfig().isRequired()) {
			us = new EMFUpdateValueStrategy();
			us.setBeforeSetValidator(new StringNotEmptyValidator());
		}
		boolean regex = false;
		if (itemConfig.getPassportEditorConfig().getRegex() != null
				&& !"".equals(itemConfig.getPassportEditorConfig().getRegex())) {
			if (us == null) {
				us = new EMFUpdateValueStrategy();
			}
			regex = true;
			us.setAfterConvertValidator(new StringRegexValidator(itemConfig
					.getPassportEditorConfig().getRegex()));
		}
		Binding binding = bindingContext.bindValue(
				WidgetProperties.text(SWT.Modify).observeDelayed(
						BTSUIConstants.DELAY, textField),
				EMFEditProperties.value(editingDomain,
						BtsCorpusModelPackage.Literals.BTS_PASSPORT_ENTRY__VALUE)
						.observe(entry), us, null);

		if (itemConfig.getPassportEditorConfig().isRequired() || regex) {
			bindingContext.addValidationStatusProvider(binding);
			BackgroundControlDecorationSupport.create(binding, SWT.TOP
					| SWT.LEFT);
		}

	}

	private void loadReferenceWidget(BTSConfigItem itemConfig2,
			BTSPassportEntry entry) {
		// TODO Auto-generated method stub

	}

	private void loadDateWidget(BTSConfigItem itemConfig2,
			BTSPassportEntry entry) {

	}

	private void loadBooleanWidget(BTSConfigItem itemConfig2,
			BTSPassportEntry entry) {
		checkBox = new Button(this, SWT.CHECK);
		checkBox.setText(itemConfig.getValue());
		checkBox.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false,
				BTSUIConstants.PASSPORT_COLUMN_NUMBER, 1));

		// checkBox.pack();
		DataBindingContext bindingContext = new DataBindingContext();

		EMFUpdateValueStrategy targetToModel = new EMFUpdateValueStrategy();
		targetToModel.setConverter(new BTSBooleanToStringConverter());
		if (itemConfig.getPassportEditorConfig().isRequired()) {
			targetToModel.setBeforeSetValidator(new StringNotEmptyValidator());
		}
		EMFUpdateValueStrategy modelToTarget = new EMFUpdateValueStrategy();
		modelToTarget.setConverter(new BTSStringToBooleanConverter());
		Binding binding = bindingContext.bindValue(
				WidgetProperties.selection().observeDelayed(
						BTSUIConstants.DELAY, checkBox),
				EMFEditProperties.value(editingDomain,
						BtsCorpusModelPackage.Literals.BTS_PASSPORT_ENTRY__VALUE)
						.observe(entry), targetToModel, modelToTarget);

		if (itemConfig.getPassportEditorConfig().isRequired()) {
			bindingContext.addValidationStatusProvider(binding);
			BackgroundControlDecorationSupport.create(binding, SWT.TOP
					| SWT.LEFT);
		}


	}

	private void loadSelectTHSWidget(final BTSConfigItem itemConfig2,
			final BTSPassportEntry entry) {
		Label label = new Label(this, SWT.NONE);
		label.setText(getLabel(itemConfig));
		label.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false,
				2, 1));
		((GridData) label.getLayoutData()).verticalIndent = 2;
		

		ths_select_text = new Text(this, SWT.BORDER | SWT.READ_ONLY);
		ths_select_text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		final char[] autoActivationCharacters = new char[] { '.', '#' };
		ths_select_text.addFocusListener(new FocusAdapter() {

			@Override
			public void focusGained(FocusEvent e) {
				if (PassportEntryItemEditor.this.userMayEdit)
				{
				try {
					KeyStroke keyStroke = KeyStroke.getInstance("Ctrl+Space");
					ContentProposalAdapter adapter = new ContentProposalAdapter(
							ths_select_text, new TextContentAdapter(),
							getObjectProposalProvider(itemConfig), keyStroke,
							autoActivationCharacters);
					adapter.setProposalAcceptanceStyle(ContentProposalAdapter.PROPOSAL_REPLACE);
					adapter.addContentProposalListener(new IContentProposalListener() {

						@Override
						public void proposalAccepted(IContentProposal proposal) {
							System.out.println(proposal);
							Command command = SetCommand.create(
									editingDomain,
									entry, BtsCorpusModelPackage.eINSTANCE.getBTSPassportEntry_Value(),
									proposal.getContent());
							editingDomain.getCommandStack().execute(
									command);
							entry.setValue(proposal.getContent());
						}
					});
				} catch (ParseException e1) {
					e1.printStackTrace();
				}
				}
			}
		});
		BTSObject object = null;
		if (entry.getValue() != null) {
			object = thsNavigatorController.find(entry.getValue(), null);
			ths_select_text.setData(object);
		}
		if (object != null) {
			ths_select_text.setText(object.getName());
		}
		
		ths_select_text.addKeyListener(new KeyAdapter() {

			@Override
			public void keyReleased(KeyEvent e) {
				if(e.keyCode == SWT.CR){
					// open search dialog
					IEclipseContext child = context.createChild("searchselect");

					context.set(BTSConstants.OBJECT_TYPES_ARRAY, new String[]{BTSConstants.THS_ENTRY});
					BTSObjectTypeSubtypeViewerFilter viewerFilter = passportConfigurationController.createObjectTypeSubtypeFilterByReferencedPath(corpusObject, itemConfig2);
					context.set(BTSObjectTypeSubtypeViewerFilter.class, viewerFilter);
					SearchSelectObjectDialog dialog = ContextInjectionFactory.make(
							SearchSelectObjectDialog.class, child);
					if (dialog.open() == dialog.OK) {
						BTSObject object = dialog.getObject();
						System.out.println(object.get_id());
						Command command = SetCommand.create(editingDomain,
								entry, BtsCorpusModelPackage.eINSTANCE.getBTSPassportEntry_Value(),
								object.get_id());
						editingDomain.getCommandStack().execute(command);
						ths_select_text.setText(object.getName());
						ths_select_text.setData(object);

					}
			    } else if (e.keyCode == SWT.BS)
			    {
			    	Command command = SetCommand.create(editingDomain,
							entry, BtsCorpusModelPackage.eINSTANCE.getBTSPassportEntry_Value(),
							null);
					editingDomain.getCommandStack().execute(command);
					ths_select_text.setText("");
					ths_select_text.setData(null);
			    }
			}
		});
		
		ths_select_text.addModifyListener(new ModifyListener() {
			
			@Override
			public void modifyText(ModifyEvent e) {
				if (ths_select_text.getText().trim().length() == 0)
				{
					Command command = SetCommand.create(editingDomain,
							entry, BtsCorpusModelPackage.eINSTANCE.getBTSPassportEntry_Value(),
							null);
					editingDomain.getCommandStack().execute(command);
					ths_select_text.setData(null);
				}
				
			}
		});

		Label lblSearch = new Label(this, SWT.NONE);
		lblSearch.setImage(resourceProvider.getImage(Display.getDefault(),
				BTSResourceProvider.IMG_SEARCH));
		lblSearch.setToolTipText("Search Object");
		lblSearch.setLayoutData(new GridData(SWT.RIGHT, SWT.TOP, false, false,
				1, 1));
		((GridData) lblSearch.getLayoutData()).verticalIndent = 3;
		lblSearch.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseDown(MouseEvent e) {
				if (PassportEntryItemEditor.this.userMayEdit)
				{
				Label l = (Label) e.getSource();
				l.setBackground(BTSUIConstants.VIEW_BACKGROUND_LABEL_PRESSED);
				}
			}

			@Override
			public void mouseUp(MouseEvent e) {
				if (PassportEntryItemEditor.this.userMayEdit)
				{
				Label l = (Label) e.getSource();
				l.setBackground(l.getParent().getBackground());
				// open search dialog
				IEclipseContext child = context.createChild("searchselect");
				context.set(BTSConstants.OBJECT_TYPES_ARRAY, new String[]{BTSConstants.THS_ENTRY});
				BTSObjectTypeSubtypeViewerFilter viewerFilter = passportConfigurationController.createObjectTypeSubtypeFilterByReferencedPath(corpusObject, itemConfig2);
				context.set(BTSObjectTypeSubtypeViewerFilter.class, viewerFilter);
				SearchSelectObjectDialog dialog = ContextInjectionFactory.make(
						SearchSelectObjectDialog.class, child);
				if (dialog.open() == dialog.OK) {
					BTSObject object = dialog.getObject();
					System.out.println(object.get_id());
					Command command = SetCommand.create(editingDomain,
							entry, BtsCorpusModelPackage.eINSTANCE.getBTSPassportEntry_Value(),
							object.get_id());
					editingDomain.getCommandStack().execute(command);
					ths_select_text.setText(object.getName());
					ths_select_text.setData(object);

				}
				}
			}
		});
		
		Label lblPassportDialog = new Label(this, SWT.NONE);
		lblPassportDialog.setImage(resourceProvider.getImage(Display.getDefault(),
				BTSResourceProvider.IMG_PASSPORT));
		lblPassportDialog.setToolTipText("Open Object in Passport Data Editor");
		lblPassportDialog.setLayoutData(new GridData(SWT.RIGHT, SWT.TOP, false, false,
				1, 1));
		((GridData) lblPassportDialog.getLayoutData()).verticalIndent = 3;
		((GridData) lblPassportDialog.getLayoutData()).horizontalIndent = 3;

		lblPassportDialog.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseDown(MouseEvent e) {
				
				Label l = (Label) e.getSource();
					l.setBackground(BTSUIConstants.VIEW_BACKGROUND_LABEL_PRESSED);
			}

			@Override
			public void mouseUp(MouseEvent e) {
				
				Label l = (Label) e.getSource();
				l.setBackground(l.getParent().getBackground());
				// open search dialog
				Object o = ths_select_text.getData();
				if (o != null && o instanceof BTSObject)
				{
					BTSObject btso = (BTSObject) o;
					IEclipseContext child = context.createChild();
					child.set(BTSObject.class, btso);
					child.set(Shell.class, new Shell());
					
					PassportEditorDialog dialog = ContextInjectionFactory.make(
							PassportEditorDialog.class, child);
					if (dialog.open() == dialog.OK) {
						
					}
				}
				
			}
		});


	}

	protected IContentProposalProvider getObjectProposalProvider(
			BTSConfigItem configItem) {
		if (thsItemProposalProvider == null) {
			thsItemProposalProvider = new ObjectSelectionProposalProvider(
					generalObjectController, configItem, corpusObject);
		}
		thsItemProposalProvider.setConfigItem(configItem);
		return thsItemProposalProvider;
	}


	private void loadSelectIntegerWidget(BTSConfigItem itemConfig2,
			BTSPassportEntry entry) {
		Label label = new Label(this, SWT.NONE);
		label.setText(getLabel(itemConfig));
		label.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false,
				BTSUIConstants.PASSPORT_COLUMN_NUMBER / 2, 1));
		((GridData) label.getLayoutData()).verticalIndent = 2;
		// label.pack();
		spinner = new Spinner(this, SWT.BORDER);
		spinner.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false,
				BTSUIConstants.PASSPORT_COLUMN_NUMBER / 2,
				1));
		((GridData) spinner.getLayoutData()).horizontalIndent = 7;
		if (itemConfig2.getDescription() != null
				&& !itemConfig2.getDescription().getLanguages().isEmpty()) {
			final ControlDecoration deco = new ControlDecoration(spinner,
					SWT.BOTTOM | SWT.LEFT);

			// re-use an existing image
			Image image = FieldDecorationRegistry
					.getDefault()
					.getFieldDecoration(FieldDecorationRegistry.DEC_INFORMATION)
					.getImage();
			// set description and image
			deco.setDescriptionText(itemConfig2.getDescription()
					.getTranslation(lang));
			deco.setImage(image);
		}
		DataBindingContext bindingContext = new DataBindingContext();

		EMFUpdateValueStrategy targetToModel = new EMFUpdateValueStrategy();
		targetToModel.setConverter(new BTSIntegerToStringConverter());
		if (itemConfig.getPassportEditorConfig().isRequired()) {
			targetToModel.setBeforeSetValidator(new StringNotEmptyValidator());
		}
		EMFUpdateValueStrategy modelToTarget = new EMFUpdateValueStrategy();
		modelToTarget.setConverter(new BTSStringToIntegerConverter());
		Binding binding = bindingContext.bindValue(
				WidgetProperties.selection().observeDelayed(
						BTSUIConstants.DELAY, spinner),
				EMFEditProperties.value(editingDomain,
						BtsCorpusModelPackage.Literals.BTS_PASSPORT_ENTRY__VALUE)
						.observe(entry), targetToModel, modelToTarget);

		if (itemConfig.getPassportEditorConfig().isRequired()) {
			bindingContext.addValidationStatusProvider(binding);
			BackgroundControlDecorationSupport.create(binding, SWT.TOP
					| SWT.LEFT);
		}

	}

	private void loadTextSuggestWidget(BTSConfigItem itemConfig2,
			BTSPassportEntry entry) {
		Label label = new Label(this, SWT.NONE);
		label.setText(getLabel(itemConfig));
		label.setLayoutData(new GridData(SWT.RIGHT, SWT.TOP, false, false,
				BTSUIConstants.PASSPORT_COLUMN_NUMBER / 2, 1));
		((GridData) label.getLayoutData()).verticalIndent = 2;
		// label.pack();
		makeContentProposalProviderThread("");

		textSuggest = new Text(this, SWT.BORDER);
		textSuggest.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false,
				BTSUIConstants.PASSPORT_COLUMN_NUMBER / 2, 1));
		((GridData) textSuggest.getLayoutData()).horizontalIndent = 7;
		if (itemConfig2.getDescription() != null
				&& !itemConfig2.getDescription().getLanguages().isEmpty()) {
			final ControlDecoration deco = new ControlDecoration(textSuggest,
					SWT.BOTTOM | SWT.LEFT);

			// re-use an existing image
			Image image = FieldDecorationRegistry
					.getDefault()
					.getFieldDecoration(FieldDecorationRegistry.DEC_INFORMATION)
					.getImage();
			// set description and image
			deco.setDescriptionText(itemConfig2.getDescription()
					.getTranslation(lang));
			deco.setImage(image);
		}
		// "." and "#" activate the content proposals
		final char[] autoActivationCharacters = new char[] { '.', '#' };
		textSuggest.addFocusListener(new FocusAdapter() {

			@Override
			public void focusGained(FocusEvent e) {

				try {
					KeyStroke keyStroke = KeyStroke.getInstance("Ctrl+Space");
					ContentProposalAdapter adapter = new ContentProposalAdapter(
							textSuggest, new TextContentAdapter(),
							getItemProposalProvider(textSuggest.getText()),
							keyStroke, autoActivationCharacters);
					adapter.setProposalAcceptanceStyle(ContentProposalAdapter.PROPOSAL_REPLACE);
				} catch (ParseException e1) {
					e1.printStackTrace();
				}

			}
		});

		DataBindingContext bindingContext = new DataBindingContext();

		EMFUpdateValueStrategy us = null;
		if (itemConfig.getPassportEditorConfig().isRequired()) {
			us = new EMFUpdateValueStrategy();
			us.setBeforeSetValidator(new StringNotEmptyValidator());
		}
		boolean regex = false;
		if (itemConfig.getPassportEditorConfig().getRegex() != null
				&& !"".equals(itemConfig.getPassportEditorConfig().getRegex())) {
			if (us == null) {
				us = new EMFUpdateValueStrategy();
			}
			regex = true;
			us.setAfterConvertValidator(new StringRegexValidator(itemConfig
					.getPassportEditorConfig().getRegex()));
		}

		Binding binding = bindingContext.bindValue(
				WidgetProperties.text(SWT.Modify).observeDelayed(
						BTSUIConstants.DELAY, textSuggest),
				EMFEditProperties.value(editingDomain,
						BtsCorpusModelPackage.Literals.BTS_PASSPORT_ENTRY__VALUE)
						.observe(entry), us, null);

		if (itemConfig.getPassportEditorConfig().isRequired() || regex) {
			bindingContext.addValidationStatusProvider(binding);
			BackgroundControlDecorationSupport.create(binding, SWT.TOP
					| SWT.LEFT);
		}

	}

	private void makeContentProposalProviderThread( final String text) {
		if (!makingProposalProvider) {
		Job job = new Job("contentProposal") {

			@Override
			protected IStatus run(IProgressMonitor monitor) {
				getItemProposalProvider(text);
					makingProposalProvider = true;
					return Status.OK_STATUS;
			}
		};
		job.schedule();
		}
	}

	protected IContentProposalProvider getItemProposalProvider(String prefix) {
		if (itemProposalProvider == null) {
			try {
				itemProposalProvider = new PassportEntryContentProposalProvider(
						passportEditorController.getProposalsFor(entryPath, ""));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return itemProposalProvider;
	}

	protected void clearAll() {
		for (Control c : this.getChildren()) {
			c.dispose();
			c = null;
		}
	}

	protected BTSPassportEntry makeAdditionalEntry() {
		BTSPassportEntry entry = BtsCorpusModelFactory.eINSTANCE
				.createBTSPassportEntryItem();
		entry.setType(itemConfig.getValue());
		return entry;
	}

	private void loadSelectConfigWidget(BTSConfigItem itemConfig2,
			BTSPassportEntry entry) {
		Label label = new Label(this, SWT.NONE);
		label.setText(getLabel(itemConfig));
		label.setLayoutData(new GridData(SWT.RIGHT, SWT.TOP, false, false,
				BTSUIConstants.PASSPORT_COLUMN_NUMBER / 2, 1));
		((GridData) label.getLayoutData()).verticalIndent = 2;
		// label.pack();
		combo = new Combo(this, SWT.NONE | SWT.READ_ONLY); // SWT.READ_ONLY);
		combo.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false,
				BTSUIConstants.PASSPORT_COLUMN_NUMBER / 2, 1));
		((GridData) combo.getLayoutData()).horizontalIndent = 7;
		if (itemConfig2.getDescription() != null
				&& !itemConfig2.getDescription().getLanguages().isEmpty()) {
			final ControlDecoration deco = new ControlDecoration(combo,
					SWT.BOTTOM | SWT.LEFT);

			// re-use an existing image
			Image image = FieldDecorationRegistry
					.getDefault()
					.getFieldDecoration(FieldDecorationRegistry.DEC_INFORMATION)
					.getImage();
			// set description and image
			deco.setDescriptionText(itemConfig2.getDescription()
					.getTranslation(lang));
			deco.setImage(image);
		}
		ComboViewer selectComboViewer = new ComboViewer(combo);
		ComposedAdapterFactory factory = new ComposedAdapterFactory(
				ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		AdapterFactoryLabelProvider labelProvider = new AdapterFactoryLabelProvider(
				factory);
		AdapterFactoryContentProvider contentProvider = new AdapterFactoryContentProvider(
				factory);

		selectComboViewer.setContentProvider(contentProvider);
		selectComboViewer.setLabelProvider(labelProvider);
		selectComboViewer.setInput(passportConfigurationController
				.getPathConfigItemProcessedClones(itemConfig2, corpusObject));

		DataBindingContext bindingContext = new DataBindingContext();

		EMFUpdateValueStrategy targetToModel = new EMFUpdateValueStrategy();
		targetToModel.setConverter(new BTSConfigItemToStringConverter());
		if (itemConfig.getPassportEditorConfig().isRequired()) {
			targetToModel.setBeforeSetValidator(new StringNotEmptyValidator());
		}
		EMFUpdateValueStrategy modelToTarget = new EMFUpdateValueStrategy();
		modelToTarget.setConverter(new BTSStringToConfigItemConverter(
				selectComboViewer));
		IObservableValue target_type_viewer = ViewersObservables
				.observeSingleSelection(selectComboViewer);
		Binding binding = bindingContext.bindValue(
				target_type_viewer,
				EMFEditProperties.value(editingDomain,
						BtsCorpusModelPackage.Literals.BTS_PASSPORT_ENTRY__VALUE)
						.observe(entry), targetToModel, modelToTarget);

		if (itemConfig.getPassportEditorConfig().isRequired()) {
			bindingContext.addValidationStatusProvider(binding);
			BackgroundControlDecorationSupport.create(binding, SWT.TOP
					| SWT.LEFT);
		}
		
	}

	private void loadTextWidget(BTSConfigItem itemConfig2,
			BTSPassportEntry entry) {
		Label label = new Label(this, SWT.NONE);
		label.setText(getLabel(itemConfig));
		label.setLayoutData(new GridData(SWT.RIGHT, SWT.TOP, false, false,
				BTSUIConstants.PASSPORT_COLUMN_NUMBER / 2, 1));
		((GridData) label.getLayoutData()).verticalIndent = 2;
		// label.pack();
		text = new Text(this, SWT.BORDER);
		text.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false,
				BTSUIConstants.PASSPORT_COLUMN_NUMBER / 2, 1));
		((GridData) text.getLayoutData()).horizontalIndent = 7;
		if (itemConfig2.getDescription() != null
				&& !itemConfig2.getDescription().getLanguages().isEmpty()) {
			final ControlDecoration deco = new ControlDecoration(text,
					SWT.BOTTOM | SWT.LEFT);

			// re-use an existing image
			Image image = FieldDecorationRegistry
					.getDefault()
					.getFieldDecoration(FieldDecorationRegistry.DEC_INFORMATION)
					.getImage();
			// set description and image
			deco.setDescriptionText(itemConfig2.getDescription()
					.getTranslation(lang));
			deco.setImage(image);
		}
		DataBindingContext bindingContext = new DataBindingContext();

		EMFUpdateValueStrategy us = null;
		if (itemConfig.getPassportEditorConfig().isRequired()) {
			us = new EMFUpdateValueStrategy();
			us.setBeforeSetValidator(new StringNotEmptyValidator());
		}
		boolean regex = false;
		if (itemConfig.getPassportEditorConfig().getRegex() != null
				&& !"".equals(itemConfig.getPassportEditorConfig().getRegex())) {
			if (us == null) {
				us = new EMFUpdateValueStrategy();
			}
			regex = true;
			us.setBeforeSetValidator(new StringRegexValidator(itemConfig
					.getPassportEditorConfig().getRegex()));
		}

		Binding binding = bindingContext.bindValue(
				WidgetProperties.text(SWT.Modify).observeDelayed(
						BTSUIConstants.DELAY, text),
				EMFEditProperties.value(editingDomain,
						BtsCorpusModelPackage.Literals.BTS_PASSPORT_ENTRY__VALUE)
						.observe(entry), us, null);

		if (itemConfig.getPassportEditorConfig().isRequired() || regex) {
			bindingContext.addValidationStatusProvider(binding);
			BackgroundControlDecorationSupport.create(binding, SWT.TOP
					| SWT.LEFT);
		}

	}

	

	@Override
	protected void setUserMayEditInteral(boolean mayEdit) {
		if (this.isDisposed()) return;
		// first check and load standard widget types
		if (BTSCoreConstants.WIDGET_TYPE_TEXT.equals(itemConfig
				.getPassportEditorConfig().getWidgetType())) {
			text.setEditable(mayEdit);
		} else if (BTSCoreConstants.WIDGET_TYPE_TEXT_SUGGEST.equals(itemConfig
				.getPassportEditorConfig().getWidgetType())) {
			textSuggest.setEditable(mayEdit);
		} else if (BTSCoreConstants.WIDGET_TYPE_TEXT_FIELD.equals(itemConfig
				.getPassportEditorConfig().getWidgetType())) {
			textField.setEditable(mayEdit);
		} else if (BTSCoreConstants.WIDGET_TYPE_SELECT_CONFIG.equals(itemConfig
				.getPassportEditorConfig().getWidgetType())) {
			combo.setEnabled(mayEdit);
		} else if (BTSCoreConstants.WIDGET_TYPE_SELECT_INTEGER
				.equals(itemConfig.getPassportEditorConfig().getWidgetType())) {
			spinner.setEnabled(mayEdit);
		} else if (BTSCoreConstants.WIDGET_TYPE_SELECT_THS.equals(itemConfig
				.getPassportEditorConfig().getWidgetType())) {
			ths_select_text.setEditable(mayEdit);
		} else if (BTSCoreConstants.WIDGET_TYPE_BOOLEAN.equals(itemConfig
				.getPassportEditorConfig().getWidgetType())) {
			checkBox.setEnabled(mayEdit);
		} else if (BTSCoreConstants.WIDGET_TYPE_DATE.equals(itemConfig
				.getPassportEditorConfig().getWidgetType())) {
		} else if (BTSCoreConstants.WIDGET_TYPE_REFERENCE_EXTERNAL
				.equals(itemConfig.getPassportEditorConfig().getWidgetType())) {
		}

	}
}