package org.bbaw.bts.ui.main.dialogs;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import org.bbaw.bts.searchModel.BTSQueryRequest;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.elasticsearch.index.query.FilterBuilders;
import org.elasticsearch.index.query.QueryBuilders;

public class SimpleSearchQueryDialog extends TitleAreaDialog {
	private Text text;
	private BTSQueryRequest queryRequest;
	private Button idButton;
	private Button exactButton;

	/**
	 * Create the dialog.
	 * @param parentShell
	 * @param query 
	 */
	public SimpleSearchQueryDialog(Shell parentShell, BTSQueryRequest queryRequest) {
		super(parentShell);
		this.queryRequest = queryRequest;
	}

	/**
	 * Create contents of the dialog.
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite area = (Composite) super.createDialogArea(parent);
		Composite container = new Composite(area, SWT.NONE);
		container.setLayout(new GridLayout(1, false));
		container.setLayoutData(new GridData(GridData.FILL_BOTH));
		
		Label lblFullTextSearch = new Label(container, SWT.NONE);
		lblFullTextSearch.setText("Full Text Search");
		
		text = new Text(container, SWT.BORDER);
		text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		idButton = new Button(container, SWT.CHECK);
		idButton.setText("Search for IDs");
		idButton.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		exactButton = new Button(container, SWT.CHECK);
		exactButton.setText("Search for exactly this string (equals not contains)");
		exactButton.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		return area;
	}

	/**
	 * Create contents of the button bar.
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.OK_ID, "Search",
				true);
		createButton(parent, IDialogConstants.CANCEL_ID,
				IDialogConstants.CANCEL_LABEL, false);
	}
	
	@Override
	protected void okPressed() {
		if (text.getText().trim().length() > 0)
		{
			if (idButton.getSelection())
			{
				queryRequest.setIdQuery(true);
				queryRequest.setIdString(text.getText().trim());
				Date now = Calendar.getInstance(Locale.getDefault()).getTime();
				queryRequest.setQueryId("timestamp-" + now.toString());
			}
			else if (exactButton.getSelection())
			{
				queryRequest.setQueryBuilder(QueryBuilders.filteredQuery(QueryBuilders.termQuery("_all", text.getText().trim()),
						FilterBuilders.termFilter("name", text.getText().trim())));
				Date now = Calendar.getInstance(Locale.getDefault()).getTime();
				queryRequest.setQueryId("timestamp-" + now.toString());
			}
			else
			{
				queryRequest.setQueryBuilder(QueryBuilders.simpleQueryString(text.getText().trim().toLowerCase()));
				Date now = Calendar.getInstance(Locale.getDefault()).getTime();
				queryRequest.setQueryId("timestamp-" + now.toString());
			}
		}
		else
		{
			queryRequest = null;
		}
		super.okPressed();
	}

	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(450, 300);
	}

	public BTSQueryRequest getQueryRequest() {
		return queryRequest;
	}

}
