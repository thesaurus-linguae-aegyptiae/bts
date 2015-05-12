package org.bbaw.bts.ui.main.wizards.newProject;

import org.bbaw.bts.btsmodel.BTSProject;
import org.bbaw.bts.btsmodel.BTSProjectDBCollection;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.btsmodel.BtsmodelPackage;
import org.bbaw.bts.ui.commons.validator.StringNotEmptyValidator;
import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.validation.IValidator;
import org.eclipse.core.databinding.validation.ValidationStatus;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.EMFUpdateValueStrategy;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.layout.GridData;

public class ProjectGeneralCollectionPage extends WizardPage {
	private BTSProject project;
	private Button btnCorpusData;
	private Button btnThesaurusData;
	private Button btnWordlistData;
	private Button btnATextData;

	/**
	 * Create the wizard.
	 */
	public ProjectGeneralCollectionPage(BTSProject project)
	{
		super("wizardPage");
		setTitle("Project Feature Page");
		setDescription("Please select the features you want to include in your project.");
		this.project = project;

	}

	/**
	 * Create contents of the wizard.
	 * @param parent
	 */
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);

		setControl(container);
		container.setLayout(new GridLayout(2, false));
		
		Label lblSelectProjectFeatures = new Label(container, SWT.NONE);
		lblSelectProjectFeatures.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1));
		lblSelectProjectFeatures.setText("Select project features you want to include");
		
		btnCorpusData = new Button(container, SWT.CHECK);
		btnCorpusData.setText("Corpus Data");
		btnCorpusData.addSelectionListener(new SelectionAdapter() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				processAddOrRemoveCorpus(btnCorpusData.getSelection());
			}
		});
		new Label(container, SWT.NONE);
		
		btnThesaurusData = new Button(container, SWT.CHECK);
		btnThesaurusData.setText("Thesaurus Data");
		btnThesaurusData.addSelectionListener(new SelectionAdapter() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				processAddOrRemoveTHS(btnThesaurusData.getSelection());
			}
		});
		new Label(container, SWT.NONE);
		
		btnWordlistData = new Button(container, SWT.CHECK);
		btnWordlistData.setText("Wordlist Data");
		btnWordlistData.addSelectionListener(new SelectionAdapter() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				processAddOrRemoveWordList(btnWordlistData.getSelection());
			}
		});
		new Label(container, SWT.NONE);
		
		btnATextData = new Button(container, SWT.CHECK);
		btnATextData.setText("Abstract Texts Data");
		btnATextData.addSelectionListener(new SelectionAdapter() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				processAddOrRemoveAText(btnATextData.getSelection());
			}
		});
	}
	
	protected void processAddOrRemoveAText(boolean selection) {
		processAddOrRemoveDBColl(project.getPrefix() + "_atext", selection);
		
	}

	@Override
	public void setVisible(boolean visible) {
		if(visible)
		{
			loadData();
		}
		super.setVisible(visible);
	}

	private void processAddOrRemoveCorpus(boolean selection) {
		processAddOrRemoveDBColl(project.getPrefix() + "_corpus", selection);
		
	}

	private void processAddOrRemoveWordList(boolean selection) {
		processAddOrRemoveDBColl(project.getPrefix() + "_wlist", selection);
		
	}

	private void processAddOrRemoveTHS(boolean selection) {
		processAddOrRemoveDBColl(project.getPrefix() + "_ths", selection);
		
	}

	private void processAddOrRemoveDBColl(String collName, boolean add) {
		if (collName == null || "".equals(collName)) return;
		BTSProjectDBCollection collection = null;
		for (BTSProjectDBCollection coll : project.getDbCollections())
		{
			if (project.getPrefix() != null)
			{
				if (collName.equals(coll.getCollectionName()))
				{
					collection = coll;
				}
			}
		}
		if (add)
		{
			if (collection == null)
			{
				addDBColl(collName, true);
			}
		}
		else
		{
			if (collection != null)
			{
				project.getDbCollections().remove(collection);
			}
		}
		
	}

	private void addDBColl(String collName, boolean sync) {
		BTSProjectDBCollection collection = BtsmodelFactory.eINSTANCE.createBTSProjectDBCollection();
		collection.setCollectionName(collName);
		collection.setIndexed(true);
		collection.setSynchronized(sync);
		project.getDbCollections().add(collection);
		
	}

	private void loadData() {
		btnCorpusData.setSelection(false);
		btnThesaurusData.setSelection(false);
		btnWordlistData.setSelection(false);
		boolean project_admin = false;
		boolean admin = false;
		boolean local = false;
		boolean notification = false;
		for (BTSProjectDBCollection coll : project.getDbCollections())
		{
			if (project.getPrefix() != null)
			{
				if ((project.getPrefix() + "_corpus").equals(coll.getCollectionName()))
				{
					btnCorpusData.setSelection(true);
				}
				else if ((project.getPrefix() + "_ths").equals(coll.getCollectionName()))
				{
					btnThesaurusData.setSelection(true);
				}
				else if ((project.getPrefix() + "_wlist").equals(coll.getCollectionName()))
				{
					btnWordlistData.setSelection(true);
				}
				else if ((project.getPrefix() + "_admin").equals(coll.getCollectionName()))
				{
					project_admin = true;
				}
				else if (("admin").equals(coll.getCollectionName()))
				{
					admin = true;
				}
				else if (("local").equals(coll.getCollectionName()))
				{
					local = true;
				}
				else if (("notification").equals(coll.getCollectionName()))
				{
					notification = true;
				}
			}
		}
		if (!project_admin) addDBColl(project.getPrefix() + "_admin", true);
		if (!admin) addDBColl("admin", true);
		if (!local) addDBColl("local", false);
		if (!notification) addDBColl("notification", true);

		
	}

	
}
