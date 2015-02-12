package org.bbaw.bts.ui.main.wizards.newProject;

import org.bbaw.bts.btsmodel.BTSProject;
import org.bbaw.bts.btsmodel.BTSProjectDBCollection;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.ui.main.dialogs.EditPropertiesDialog;
import org.bbaw.bts.ui.main.provider.ListContentProvider;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;

public class ProjectCollectionPage extends WizardPage
{

	private BTSProject project;
	private Table table;
	private TableViewer tableViewer;
	private Button btnAdd;
	private Button btnDelete;
	private Button btnEdit;
	private BTSProjectDBCollection selectedCollection;
	private Button btnEditProperties;

	/**
	 * Create the wizard.
	 * 
	 * @param project
	 */
	public ProjectCollectionPage(BTSProject project)
	{
		super("wizardPage");
		setTitle("Project Database Collection");
		setDescription("For experts only! Here you can edit database collections.");
		this.project = project;
	}

	/**
	 * Create contents of the wizard.
	 * 
	 * @param parent
	 */
	public void createControl(Composite parent)
	{
		Composite container = new Composite(parent, SWT.NULL);

		setControl(container);
		container.setLayout(new FillLayout(SWT.HORIZONTAL));

		Group grpDatabaseCollections = new Group(container, SWT.NONE);
		grpDatabaseCollections.setText("Database Collections");
		grpDatabaseCollections.setLayout(new GridLayout(2, false));

		table = new Table(grpDatabaseCollections, SWT.BORDER | SWT.FULL_SELECTION);
		table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 5));
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		tableViewer = new TableViewer(table);

		btnAdd = new Button(grpDatabaseCollections, SWT.NONE);
		btnAdd.setText("Add");
		btnAdd.addSelectionListener(new SelectionAdapter()
		{

			@Override
			public void widgetSelected(SelectionEvent e)
			{
				BTSProjectDBCollection collection = BtsmodelFactory.eINSTANCE.createBTSProjectDBCollection();
				Dialog collectionDialog = new EditDBCollectionDialog(getShell(), collection);
				if (collectionDialog.open() == collectionDialog.OK)
				{
					project.getDbCollections().add(collection);
					tableViewer.refresh();
				}

			}

		});

		btnDelete = new Button(grpDatabaseCollections, SWT.NONE);
		btnDelete.setText("Delete");
		btnDelete.addSelectionListener(new SelectionAdapter()
		{

			@Override
			public void widgetSelected(SelectionEvent e)
			{
				project.getDbCollections().remove(selectedCollection);
				tableViewer.refresh();
			}

		});

		btnEdit = new Button(grpDatabaseCollections, SWT.NONE);
		btnEdit.setText("Edit");
		btnEdit.addSelectionListener(new SelectionAdapter()
		{

			@Override
			public void widgetSelected(SelectionEvent e)
			{
				Dialog collectionDialog = new EditDBCollectionDialog(getShell(), selectedCollection);
				if (collectionDialog.open() == collectionDialog.OK)
				{
					tableViewer.update(selectedCollection, null);
				}

			}

		});
		
		btnEditProperties = new Button(grpDatabaseCollections, SWT.NONE);
		btnEditProperties.setText("Edit Properties");
		btnEditProperties.addSelectionListener(new SelectionAdapter()
		{

			@Override
			public void widgetSelected(SelectionEvent e)
			{
				EditPropertiesDialog collectionDialog = new EditPropertiesDialog(getShell(), selectedCollection.getProperties());
				if (collectionDialog.open() == collectionDialog.OK)
				{
					selectedCollection.setProperties(collectionDialog.getProperties());
				}

			}

		});

		new Label(grpDatabaseCollections, SWT.NONE);
		createColumns(grpDatabaseCollections, tableViewer);
		loadInput();

	}
	
	@Override
	public void setVisible(boolean visible) {
		if (visible)
		{
			loadInput();
		}
		super.setVisible(visible);
	}

	private void createColumns(Group grpDatabaseCollections, TableViewer tableViewer2)
	{
		String[] titles = { "Collection Name", "Is Synchronized", "Is Indexed" };
		int[] bounds = { 100, 100, 100, 100 };

		// First column is for the first name
		TableViewerColumn col = createTableViewerColumn(titles[0], bounds[0], 0);
		col.setLabelProvider(new ColumnLabelProvider()
		{
			@Override
			public String getText(Object element)
			{
				BTSProjectDBCollection p = (BTSProjectDBCollection) element;
				return p.getCollectionName();
			}
		});

		// Second column is for the last name
		col = createTableViewerColumn(titles[1], bounds[1], 1);
		col.setLabelProvider(new ColumnLabelProvider()
		{
			@Override
			public String getText(Object element)
			{
				BTSProjectDBCollection p = (BTSProjectDBCollection) element;
				return new Boolean(p.isSynchronized()).toString();
			}
		});

		// Now the gender
		col = createTableViewerColumn(titles[2], bounds[2], 2);
		col.setLabelProvider(new ColumnLabelProvider()
		{
			@Override
			public String getText(Object element)
			{
				BTSProjectDBCollection p = (BTSProjectDBCollection) element;
				return new Boolean(p.isIndexed()).toString();
			}
		});

	}

	private TableViewerColumn createTableViewerColumn(String title, int bound, final int colNumber)
	{
		final TableViewerColumn viewerColumn = new TableViewerColumn(tableViewer, SWT.NONE);
		final TableColumn column = viewerColumn.getColumn();
		column.setText(title);
		column.setWidth(bound);
		column.setResizable(true);
		column.setMoveable(true);
		return viewerColumn;
	}

	private void loadInput()
	{
		tableViewer.setContentProvider(new ListContentProvider());
		tableViewer.addSelectionChangedListener(new ISelectionChangedListener()
		{

			@Override
			public void selectionChanged(SelectionChangedEvent event)
			{
				Object o = event.getSelection();
				IStructuredSelection sel = (IStructuredSelection) o;
				selectedCollection = (BTSProjectDBCollection) sel.getFirstElement();

			}
		});

		tableViewer.setInput(project.getDbCollections());

	}
}
