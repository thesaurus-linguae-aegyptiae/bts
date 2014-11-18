package org.bbaw.bts.ui.main.dialogs;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.bbaw.bts.btsviewmodel.BtsviewmodelFactory;
import org.bbaw.bts.btsviewmodel.StatusMessage;
import org.bbaw.bts.btsviewmodel.impl.StatusMessageImpl;
import org.bbaw.bts.core.services.BTSStatusMessageService;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Table;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;

public class StatusMessageDialog extends TitleAreaDialog {
	
	private static final int MESSAGE_SIZE = 25;

	@Inject
	private BTSStatusMessageService service;
	
	private Table table;
	protected ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(
			ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
	private List<StatusMessage> messages;
	private StatusMessage masterMessage;
	private TableViewer tableViewer;

	/**
	 * Create the dialog.
	 * @param parentShell
	 */
	public StatusMessageDialog() {
		super(new Shell());

	}

	/**
	 * Create contents of the dialog.
	 * @param parent
	 */
	protected Control createDialogArea(Composite parent) {

		Composite area = (Composite) super.createDialogArea(parent);
		Composite container = new Composite(area, SWT.NONE);
		container.setLayout(new GridLayout(1, false));
		container.setLayoutData(new GridData(GridData.FILL_BOTH));
		final AdapterFactoryLabelProvider labelProvider = new AdapterFactoryLabelProvider(adapterFactory);
		AdapterFactoryContentProvider contentProvider = new AdapterFactoryContentProvider(adapterFactory);

		tableViewer = new TableViewer(container, SWT.MULTI | 
			      SWT.H_SCROLL | 
			      SWT.V_SCROLL | 
			      SWT.FULL_SELECTION | 
			      SWT.BORDER);
		tableViewer.setContentProvider(contentProvider);
//		tableViewer.setLabelProvider(labelProvider);
		table = tableViewer.getTable();
		table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		// Define one exmaple column Columns
		TableViewerColumn viewerColumn;
		viewerColumn = new TableViewerColumn(tableViewer, SWT.NONE);
		viewerColumn.getColumn().setText("Message");
		viewerColumn.getColumn().setWidth(200);
		viewerColumn.getColumn().setMoveable(true); 
		// for simplification I use the standard labelprovider
		viewerColumn.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				return labelProvider.getColumnText(element, 0);
			}
			
		});
		// alternatively use relative size
		// last parameter defines if the column is allowed 
		// to be resized
		TableColumnLayout tableColumnLayout = new TableColumnLayout();
		tableColumnLayout.setColumnData(viewerColumn.getColumn(), 
		      new ColumnWeightData(20, 200, true)); 
		
		TableViewerColumn viewerColumn2;
		viewerColumn2 = new TableViewerColumn(tableViewer, SWT.NONE);
		viewerColumn2.getColumn().setText("Creation Time");
		viewerColumn2.getColumn().setWidth(200);
		viewerColumn2.getColumn().setMoveable(true); 
		viewerColumn2.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				return labelProvider.getColumnText(element, 1);
			}
			
		});
		TableColumnLayout tableColumnLayout2 = new TableColumnLayout();
		tableColumnLayout2.setColumnData(viewerColumn2.getColumn(), 
		      new ColumnWeightData(20, 200, true)); 
		
		TableViewerColumn viewerColumn3;
		viewerColumn3 = new TableViewerColumn(tableViewer, SWT.NONE);
		viewerColumn3.getColumn().setText("User Id");
		viewerColumn3.getColumn().setWidth(200);
		viewerColumn3.getColumn().setMoveable(true); 
		viewerColumn3.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				return labelProvider.getColumnText(element, 2);
			}
			
		});
		TableColumnLayout tableColumnLayout3 = new TableColumnLayout();
		tableColumnLayout3.setColumnData(viewerColumn3.getColumn(), 
		      new ColumnWeightData(20, 200, true)); 
		
		loadMessages();
		return area;
	}

	private void loadMessages() {
		messages = service.listLastStatusMessages(MESSAGE_SIZE);
		masterMessage = BtsviewmodelFactory.eINSTANCE.createStatusMessage();
		masterMessage.getChildren().addAll(messages);
		tableViewer.setInput(masterMessage);
	}


	/**
	 * Create contents of the button bar.
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL,
				true);
		createButton(parent, IDialogConstants.CANCEL_ID,
				IDialogConstants.CANCEL_LABEL, false);
		
		setTitle("Status Messages");
		setMessage("This dialog shows the last " + MESSAGE_SIZE + " status messages.");
	}

	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(580, 450);
	}
	@Override
	protected boolean isResizable() {
		return true;
	}

}
