 
package org.bbaw.bts.ui.main.parts;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Vector;

import javax.inject.Inject;
import javax.annotation.PostConstruct;

import org.bbaw.bts.btsviewmodel.DBCollectionStatusInformation;
import org.bbaw.bts.core.controller.dialogControllers.DBManagerPartController;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.TableEditor;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;

import javax.annotation.PreDestroy;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.e4.core.contexts.Active;
import org.eclipse.e4.ui.di.Persist;
import org.eclipse.e4.ui.di.UISynchronize;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.ViewerCell;

public class DBManagerPart {
	
	@Inject
	private DBManagerPartController dbManagerPartController;
	
	// Get UISynchronize injected as field
	@Inject
	private UISynchronize sync;
	private Table table;
	protected ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(
			ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
	private List<DBCollectionStatusInformation> collInfos;
	private TableViewer tableViewer;
	private String[] columnArray = new String[]{"Name", "DB Doc Count", "Sync To Remote", "Sync From Remote",
			"Index Doc Count", "Status", "DB Update Seq", "Index Update Seq"};
	private int[] columnWidth = new int[]{200, 100, 100, 100, 100, 100, 100, 100};
	private int[] columnWeight = new int[]{20, 10, 10, 10, 10, 10, 10, 10};
	
	@Inject
	@Active
	private Shell parentShell;

	@Inject
	public DBManagerPart() {
		
	}
	
	@PostConstruct
	public void postConstruct(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);
		container.setLayout(new GridLayout(1, false));
		container.setLayoutData(new GridData(GridData.FILL_BOTH));
		final AdapterFactoryLabelProvider labelProvider = new AdapterFactoryLabelProvider(adapterFactory);
		tableViewer = new TableViewer(container, SWT.MULTI | 
			      SWT.H_SCROLL | 
			      SWT.V_SCROLL | 
			      SWT.FULL_SELECTION | 
			      SWT.BORDER);
		
		tableViewer.setLabelProvider(labelProvider);
		tableViewer.setContentProvider(new ArrayContentProvider());

		table = tableViewer.getTable();
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
		makeColumns(columnArray, columnWidth, columnWeight, labelProvider);
		
		// percentage indexed column
		TableViewerColumn viewerColumn;
		viewerColumn = new TableViewerColumn(tableViewer, SWT.NONE);
		viewerColumn.getColumn().setText("% indexed");
		viewerColumn.getColumn().setWidth(100);
		viewerColumn.getColumn().setMoveable(true); 
		// for simplification I use the standard labelprovider
		viewerColumn.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				final DBCollectionStatusInformation info = (DBCollectionStatusInformation) element;
                if ("_replicator".equals(info.getDbCollectionName()) || "_users".equals(info.getDbCollectionName()))
    			{
                	return ""; // no index
    			}
                else if ("OK".equals(((DBCollectionStatusInformation) element).getIndexStatus())) {
		            return "100%";
		        }
                else if (info.getIndexDocCount() == -1) {
		            return "0%";
		        }
                float percentage = ((float)(info.getIndexDocCount() +3)/ (float) info.getDbDocCount());
                percentage = percentage * 100;
				return new String( new Float(percentage).toString() + "%");
			}
			
			@Override
			public Color getBackground(Object element) {
				if (element instanceof DBCollectionStatusInformation) {
			        if ("ERROR".equals(((DBCollectionStatusInformation) element).getIndexStatus())) {
			            return new Color(Display.getDefault(), 255, 191, 191);
			        }
			        else if ("INDEX_BEHIND".equals(((DBCollectionStatusInformation) element).getIndexStatus())) {
			            return new Color(Display.getDefault(), 255, 255, 190);
			        }
			        else if ("INDEXING...".equals(((DBCollectionStatusInformation) element).getIndexStatus())) {
			            return new Color(Display.getDefault(), 255, 255, 140);
			        }
			        else if ("OK".equals(((DBCollectionStatusInformation) element).getIndexStatus())) {
			            return new Color(Display.getDefault(), 191, 255, 191);
			        }
			    }
				return super.getBackground(element);
			}
			
		});
		// alternatively use relative size
		// last parameter defines if the column is allowed 
		// to be resized
		TableColumnLayout tableColumnLayout = new TableColumnLayout();
		tableColumnLayout.setColumnData(viewerColumn.getColumn(), 
		      new ColumnWeightData(10, 100, true));		
		
		// reindex action column
		TableColumn column = new TableColumn(tableViewer.getTable(), SWT.NONE);
        column.setText("Reindex");
        column.setWidth(100);
        TableViewerColumn actionsNameCol = new TableViewerColumn(tableViewer, column);
        actionsNameCol.setLabelProvider(new ColumnLabelProvider(){
            //make sure you dispose these buttons when viewer input changes

            @Override
            public void update(ViewerCell cell) {

                TableItem item = (TableItem) cell.getItem();
                final DBCollectionStatusInformation info = (DBCollectionStatusInformation) cell.getElement();
                if ("_replicator".equals(info.getDbCollectionName()) || "_users".equals(info.getDbCollectionName()))
    			{
                	return; // no buttons
    			}
                Button button = new Button((Composite) cell.getViewerRow().getControl(),SWT.NONE);
                button.setText("Reindex");
                button.addSelectionListener(new SelectionListener() {
					
					@Override
					public void widgetSelected(SelectionEvent e) {
						reIndex(info);
						
					}
					
					
					@Override
					public void widgetDefaultSelected(SelectionEvent e) {
						// TODO Auto-generated method stub
						
					}
				});
                TableEditor editor = new TableEditor(item.getParent());
                editor.grabHorizontal  = true;
                editor.grabVertical = true;
                editor.setEditor(button , item, cell.getColumnIndex());
                editor.layout();
            }

        });
		
		tableViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				System.out.println(event);
				
			}
		});
		loadInformations();
		return;
	}
	
	private void reIndex(final DBCollectionStatusInformation info) {
		if (info != null && info.getDbCollectionName() != null)
		{
			MessageDialog dialog = new MessageDialog(parentShell, "Database Collection Reindexing", null,
				    "Do you want to delete an recreate the index of this database collection? Collection: "
			+ info.getDbCollectionName()
			+ "\n\nReindexing may take a while.", MessageDialog.WARNING, new String[] { "Reindex",
				  "Cancel"}, 0);
			if (dialog.open() == MessageDialog.OK)
			{
				try {
				       IRunnableWithProgress op = new IRunnableWithProgress() {

						@Override
						public void run(IProgressMonitor monitor)
								throws InvocationTargetException, InterruptedException {
							
							dbManagerPartController.reIndex(info.getDbCollectionName(), monitor);
							
						}
					};
				       new ProgressMonitorDialog(parentShell).run(true, true, op);
				    } catch (InvocationTargetException e) {
				       // handle exception
				    } catch (InterruptedException e) {
				       // handle cancelation
				    }
				
			}
		}
		
	}

	
	private void makeColumns(String[] columnArray, int[] columnWidth2,
			int[] columnWeight2, final ITableLabelProvider labelProvider) {
		int index = 0;
		for (String name : columnArray)
		{
			// Define one exmaple column Columns
			TableViewerColumn viewerColumn;
			viewerColumn = new TableViewerColumn(tableViewer, SWT.NONE);
			viewerColumn.getColumn().setText(name);
			viewerColumn.getColumn().setWidth(columnWidth2[index]);
			viewerColumn.getColumn().setMoveable(true); 
			// for simplification I use the standard labelprovider
			final int i = index;
			viewerColumn.setLabelProvider(new ColumnLabelProvider() {
				@Override
				public String getText(Object element) {
					return labelProvider.getColumnText(element, i);
				}
				
				@Override
				public Color getBackground(Object element) {
					if (element instanceof DBCollectionStatusInformation) {
				        if ("ERROR".equals(((DBCollectionStatusInformation) element).getIndexStatus())) {
				            return new Color(Display.getDefault(), 255, 191, 191);
				        }
				        else if ("INDEX_BEHIND".equals(((DBCollectionStatusInformation) element).getIndexStatus())) {
				            return new Color(Display.getDefault(), 255, 255, 190);
				        }
				        else if ("INDEXING...".equals(((DBCollectionStatusInformation) element).getIndexStatus())) {
				            return new Color(Display.getDefault(), 255, 255, 140);
				        }
				        else if ("OK".equals(((DBCollectionStatusInformation) element).getIndexStatus())) {
				            return new Color(Display.getDefault(), 191, 255, 191);
				        }
				    }
					return super.getBackground(element);
				}
				
			});
			// alternatively use relative size
			// last parameter defines if the column is allowed 
			// to be resized
			TableColumnLayout tableColumnLayout = new TableColumnLayout();
			tableColumnLayout.setColumnData(viewerColumn.getColumn(), 
			      new ColumnWeightData(columnWeight2[index], columnWidth2[index], true));
			index++;
		}
		
	}

	private void loadInformations() {
		try {
		       IRunnableWithProgress op = new IRunnableWithProgress() {

				@Override
				public void run(IProgressMonitor monitor)
						throws InvocationTargetException, InterruptedException {
						final List<DBCollectionStatusInformation> infos = dbManagerPartController.getDBCollectionStatusInformations(monitor);
					
					// If you want to update the UI
					sync.asyncExec(new Runnable() {

						@Override
						public void run() {
							collInfos = infos;
							tableViewer.setInput(collInfos);
							System.out.println("get collInfos" + collInfos.size());
							
						}
					});
					
				}
			};
		       new ProgressMonitorDialog(parentShell).run(true, true, op);
		    } catch (InvocationTargetException e) {
		       // handle exception
		    } catch (InterruptedException e) {
		       // handle cancelation
		    }
		
		
	}

	@PreDestroy
	public void preDestroy() {
		
	}
	
	
	
	@Persist
	public void save() {
		
	}
	
}