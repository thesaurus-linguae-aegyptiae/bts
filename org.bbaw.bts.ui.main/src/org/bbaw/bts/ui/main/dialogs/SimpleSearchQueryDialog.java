package org.bbaw.bts.ui.main.dialogs;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.lucene.queryParser.QueryParser;
import org.bbaw.bts.searchModel.BTSQueryRequest;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
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
	private Button wildcardButton;
	private Button qmarksButton;
	
	@Inject
	@Optional
	@Named("org.bbaw.bts.ui.main.commandparameter.searchString")
	private String searchString;

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
		container.setLayout(new GridLayout(2, false));
		container.setLayoutData(new GridData(GridData.FILL_BOTH));
		
		Label lblFullTextSearch = new Label(container, SWT.NONE);
		lblFullTextSearch.setText("Full Text Search");
		lblFullTextSearch.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));

		text = new Text(container, SWT.BORDER | SWT.SEARCH);
		text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
		
		if (searchString != null)
		{
			text.setText(searchString);
			text.setSelection(text.getText().length());
		}
		
		idButton = new Button(container, SWT.CHECK);
		idButton.setText("Search for IDs");
		idButton.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
		
		exactButton = new Button(container, SWT.CHECK);
		exactButton.setText("Search for Names only");
		exactButton.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
		
		wildcardButton = new Button(container, SWT.PUSH);
		wildcardButton.setText("Add *-wildcard");
		wildcardButton.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		wildcardButton.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				text.setText(text.getText() + "*");
				
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		qmarksButton = new Button(container, SWT.PUSH);
		qmarksButton.setText("Put in \"...\"");
		qmarksButton.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		qmarksButton.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				text.setText("\"" + text.getText() + "\"");
				
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
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
				queryRequest.setQueryBuilder(QueryBuilders.matchQuery("name", escapeString(text.getText().trim())));
				Date now = Calendar.getInstance(Locale.getDefault()).getTime();
				queryRequest.setQueryId("timestamp-" + now.toString());
				queryRequest.setAutocompletePrefix(text.getText().trim());

			}
			else
			{
				queryRequest.setQueryBuilder(QueryBuilders.simpleQueryString(escapeString(text.getText().trim().toLowerCase())));
				Date now = Calendar.getInstance(Locale.getDefault()).getTime();
				queryRequest.setQueryId("timestamp-" + now.toString());
				queryRequest.setAutocompletePrefix(text.getText().trim());
			}
		}
		else
		{
			queryRequest = null;
		}
		super.okPressed();
	}

	private String escapeString(String searchString) {
		// Anführungszeichen nicht escapen!!!
		boolean inQuots = false;
		boolean leftTrunk = false;
		boolean rightTrunk = false;

		if (searchString.length() > 3 && searchString.startsWith("\"") && searchString.endsWith("\""))
		{
			searchString = searchString.substring(1, searchString.length() -1);
			inQuots = true;
		}
		else if (searchString.length() > 1 && searchString.startsWith("*"))
		{
			searchString = searchString.substring(1, searchString.length());
			leftTrunk = true;
		}else if (searchString.length() > 1 && searchString.endsWith("*"))
		{
			searchString = searchString.substring(0, searchString.length()-1);
			rightTrunk = true;
		}
		String escapedString = QueryParser.escape(searchString);
		if (inQuots)
		{
			escapedString = "\"" + escapedString + "\"";
		} else if (leftTrunk)
		{
			escapedString = "*" + escapedString;
		}else if (rightTrunk)
		{
			escapedString = escapedString+ "*";
		}
		
		return escapedString;
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

	public void setSearchString(String searchString2) {
		this.searchString = searchString2;
		if (searchString != null)
		{
			text.setText(searchString);
			text.setSelection(text.getText().length());

		}
	}

}
