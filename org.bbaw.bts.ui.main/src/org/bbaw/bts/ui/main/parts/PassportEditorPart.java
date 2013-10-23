package org.bbaw.bts.ui.main.parts;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSConfigItem;
import org.bbaw.bts.btsmodel.BTSCorpusObject;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.BtsmodelPackage;
import org.bbaw.bts.core.controller.generalController.BTSConfigurationController;
import org.bbaw.bts.core.controller.partController.PassportEditorPartController;
import org.bbaw.bts.ui.commons.validator.StringNotEmptyValidator;
import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.EventTopic;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.di.Persist;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.EMFUpdateValueStrategy;
import org.eclipse.jface.databinding.fieldassist.ControlDecorationSupport;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.ExpandBar;
import org.eclipse.swt.widgets.ExpandItem;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Text;

public class PassportEditorPart
{
	private static final int DELAY = 400;
	@Inject
	private BTSConfigurationController configurationController;
	@Inject
	private PassportEditorPartController passportEditorController;
	private Text text;
	private Text txtCodetextmain;
	private Text txtAuthortextadmin;
	private Text txtDatetextadmin;
	private Text txtIdtextmain;
	private CTabFolder tabFolder;
	private Table historyTable_Admin;
	private Combo typeCMB_Main;
	private Combo subtypeCMB_Main;
	private Spinner sortKeySpinner_Main;
	private Combo reviewCMB_Admin;
	private Combo visibilityCMB_Admin;

	private BTSCorpusObject corpusObject;
	private Composite mainComposite;
	private int selectionIndex;
	private DataBindingContext databindingMain;
	private DataBindingContext databindingAdmin;
	private Text txtFurtherRemarks;
	private Text txtSiteFromThesaurus;
	private Text txtEgyptianMuseaumCairo;
	private Text text_1;
	private Text txtLeidenRijksmuseumVan;
	private Text text_2;

	@Inject
	public PassportEditorPart()
	{
		// TODO Your code here
	}

	@PostConstruct
	public void postConstruct(Composite parent)
	{
		GridLayout gl_parent = new GridLayout(1, false);
		gl_parent.horizontalSpacing = 1;
		parent.setLayout(gl_parent);

		mainComposite = new Composite(parent, SWT.NONE);
		mainComposite.setLayout(new FillLayout(SWT.HORIZONTAL));
		GridData gd_composite = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
		gd_composite.widthHint = 436;
		mainComposite.setLayoutData(gd_composite);

		tabFolder = new CTabFolder(mainComposite, SWT.BORDER);
		tabFolder.setSelectionBackground(Display.getCurrent().getSystemColor(
				SWT.COLOR_TITLE_INACTIVE_BACKGROUND_GRADIENT));
		tabFolder.setSimple(false);
		createMainTabItem(tabFolder);
		createAdminTabItem(tabFolder);

		createGenericTabItems(tabFolder);

		// TODO Your code here
	}

	private void createGenericTabItems(CTabFolder folder)
	{
		List<BTSConfigItem> configItems = configurationController.getPassportCategories(corpusObject);
		for (BTSConfigItem category : configItems)
		{
			createTabItem(folder, category);
		}

	}

	private void createTabItem(CTabFolder folder, BTSConfigItem category)
	{
		CTabItem tabItem = new CTabItem(folder, SWT.NONE);
		tabItem.setText(category.getValue());

		Composite mainComp = new Composite(folder, SWT.NONE);
		tabItem.setControl(mainComp);
		mainComp.setLayout(new GridLayout(4, false));

	}

	private void createAdminTabItem(CTabFolder folder)
	{
		CTabItem tbtmAdmin = new CTabItem(folder, SWT.NONE);
		tbtmAdmin.setText("Admin");

		Composite compAdmin = new Composite(folder, SWT.NONE);
		tbtmAdmin.setControl(compAdmin);
		compAdmin.setLayout(new GridLayout(4, false));

		Label lblAuthor = new Label(compAdmin, SWT.NONE);
		lblAuthor.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblAuthor.setText("Author");

		txtAuthortextadmin = new Text(compAdmin, SWT.BORDER);
		txtAuthortextadmin.setText("authorText_Admin");
		txtAuthortextadmin.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Label lblDate = new Label(compAdmin, SWT.NONE);
		lblDate.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblDate.setText("Date");

		txtDatetextadmin = new Text(compAdmin, SWT.BORDER);
		txtDatetextadmin.setText("dateText_Admin");
		txtDatetextadmin.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Label lblVisibility = new Label(compAdmin, SWT.NONE);
		lblVisibility.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblVisibility.setText("Visibility");

		visibilityCMB_Admin = new Combo(compAdmin, SWT.NONE);
		visibilityCMB_Admin.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Label lblRevisionState = new Label(compAdmin, SWT.NONE);
		lblRevisionState.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblRevisionState.setText("Review State");

		reviewCMB_Admin = new Combo(compAdmin, SWT.NONE);
		reviewCMB_Admin.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		ExpandBar expandBar = new ExpandBar(compAdmin, SWT.NONE);
		expandBar.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, true, true, 4, 1));

		ExpandItem xpndtmHistory = new ExpandItem(expandBar, SWT.NONE);
		xpndtmHistory.setExpanded(true);
		xpndtmHistory.setText("History");

		Composite historyComp_Admin = new Composite(expandBar, SWT.NONE);
		xpndtmHistory.setControl(historyComp_Admin);

		ScrolledComposite scrolledComposite = new ScrolledComposite(historyComp_Admin, SWT.BORDER | SWT.H_SCROLL
				| SWT.V_SCROLL);
		scrolledComposite.setSize(0, 0);
		scrolledComposite.setExpandHorizontal(true);
		scrolledComposite.setExpandVertical(true);

		historyTable_Admin = new Table(historyComp_Admin, SWT.BORDER | SWT.FULL_SELECTION);
		historyTable_Admin.setBounds(0, 0, 242, 41);
		historyTable_Admin.setHeaderVisible(true);
		historyTable_Admin.setLinesVisible(true);
		xpndtmHistory.setHeight(xpndtmHistory.getControl().computeSize(SWT.DEFAULT, SWT.DEFAULT).y);

	}

	private void createMainTabItem(CTabFolder folder)
	{
		CTabItem tbtmMain = new CTabItem(folder, SWT.NONE);
		tbtmMain.setText("Main");

		Composite compTBTM_Main = new Composite(folder, SWT.NONE);
		tbtmMain.setControl(compTBTM_Main);
		compTBTM_Main.setLayout(new GridLayout(2, false));

		Label lblName = new Label(compTBTM_Main, SWT.NONE);
		lblName.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblName.setText("Name");

		text = new Text(compTBTM_Main, SWT.BORDER);
		text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Label lblType = new Label(compTBTM_Main, SWT.NONE);
		lblType.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblType.setText("Type");

		typeCMB_Main = new Combo(compTBTM_Main, SWT.NONE);
		typeCMB_Main.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		typeCMB_Main.addSelectionListener(new SelectionAdapter()
		{

			@Override
			public void widgetSelected(SelectionEvent e)
			{
				// subtypeCMB_Main.setItems(configurationController.getObjectSubtypes(corpusObject));
				// load subtype CMB

			}
		});

		Label lblSubtype = new Label(compTBTM_Main, SWT.NONE);
		lblSubtype.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblSubtype.setText("Subtype");

		subtypeCMB_Main = new Combo(compTBTM_Main, SWT.NONE);
		subtypeCMB_Main.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Label lblSortkey = new Label(compTBTM_Main, SWT.NONE);
		lblSortkey.setText("SortKey");

		sortKeySpinner_Main = new Spinner(compTBTM_Main, SWT.BORDER);

		Label lblCode = new Label(compTBTM_Main, SWT.NONE);
		lblCode.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblCode.setText("Code");

		txtCodetextmain = new Text(compTBTM_Main, SWT.BORDER);
		txtCodetextmain.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Label lblId = new Label(compTBTM_Main, SWT.NONE);
		lblId.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblId.setText("ID");

		txtIdtextmain = new Text(compTBTM_Main, SWT.BORDER);
		txtIdtextmain.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

	}

	@Inject
	@Optional
	void eventReceived(@EventTopic("viewcommunication/*") BTSObject selection)
	{
		if (selection instanceof BTSCorpusObject)
		{
			corpusObject = (BTSCorpusObject) selection;
			loadInput(corpusObject);
		}
		System.out.println("Passport selection received");

	}

	private void loadInput(BTSCorpusObject object)
	{
		selectionIndex = tabFolder.getSelectionIndex();
		tabFolder.dispose();
		tabFolder = null;
		tabFolder = new CTabFolder(mainComposite, SWT.BORDER);
		tabFolder.setSelectionBackground(Display.getCurrent().getSystemColor(
				SWT.COLOR_TITLE_INACTIVE_BACKGROUND_GRADIENT));
		tabFolder.setSimple(false);
		createMainTabItem(tabFolder);

		// FIXME effizierter
		// typeCMB_Main.setItems(configurationController.getObjectTypes(configurationController
		// .findObjectType(corpusObject)));
		databindingMain = initializeDatabindingMain(object);
		createAdminTabItem(tabFolder);
		databindingAdmin = initializeDatabindingAdmin(object);
		createGenericTabItems(tabFolder);
		mainComposite.layout();
		if (tabFolder.getItemCount() >= selectionIndex)
		{
			tabFolder.setSelection(selectionIndex);
		} else
		{
			tabFolder.setSelection(0);
		}

	}

	private DataBindingContext initializeDatabindingAdmin(BTSCorpusObject object)
	{
		EMFUpdateValueStrategy us = new EMFUpdateValueStrategy();
		us.setBeforeSetValidator(new StringNotEmptyValidator());

		DataBindingContext bindingContext = new DataBindingContext();
		Binding binding = bindingContext.bindValue(WidgetProperties.text(SWT.Modify).observeDelayed(DELAY, text),
				EMFProperties.value(BtsmodelPackage.Literals.BTS_OBJECT__NAME).observe(object), us, null);

		bindingContext.addValidationStatusProvider(binding);

		ControlDecorationSupport.create(binding, SWT.TOP | SWT.LEFT);

		Binding binding2 = bindingContext.bindValue(WidgetProperties.selection().observeDelayed(0, typeCMB_Main),
				EMFProperties.value(BtsmodelPackage.Literals.BTS_OBJECT__TYPE).observe(object), us, null);

		return bindingContext;
	}

	private DataBindingContext initializeDatabindingMain(BTSCorpusObject object)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@PreDestroy
	public void preDestroy()
	{
		// TODO Your code here
	}

	@Focus
	public void onFocus()
	{
		tabFolder.setFocus();

		if (tabFolder.getItemCount() >= selectionIndex)
		{
			tabFolder.setSelection(selectionIndex);
		} else
		{
			tabFolder.setSelection(0);
		}
	}

	@Persist
	public void save()
	{
		// TODO Your code here
	}
}