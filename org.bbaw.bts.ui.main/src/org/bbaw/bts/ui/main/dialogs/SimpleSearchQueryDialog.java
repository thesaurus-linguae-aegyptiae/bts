package org.bbaw.bts.ui.main.dialogs;

import javax.inject.Inject;
import javax.inject.Named;

import org.bbaw.bts.core.dao.util.BTSQueryRequest;
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
	public SimpleSearchQueryDialog(Shell parentShell) {
		super(parentShell);
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
		idButton.setData(false);
		idButton.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				idButton.setData(idButton.getSelection());
				exactButton.setSelection(!idButton.getSelection()
						&& (Boolean)exactButton.getData());
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {}
		});
		
		exactButton = new Button(container, SWT.CHECK);
		exactButton.setText("Search for Names only");
		exactButton.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
		exactButton.setData(false);
		exactButton.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				exactButton.setData(exactButton.getSelection());
				idButton.setSelection(!exactButton.getSelection()
						&& (Boolean)idButton.getData());
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});
		
		wildcardButton = new Button(container, SWT.PUSH);
		wildcardButton.setText("Add *-wildcard");
		wildcardButton.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		wildcardButton.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				String s = text.getText();
				s = s.endsWith("*") ? s.substring(0, s.length()-1) : s + "*";
				text.setText(s);
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
				String s = text.getText();
				s = s.startsWith("\"") && s.endsWith("\"") ? s.substring(1, s.length()-1) : "\"" + s + "\"";
				text.setText(s);
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
		String searchString = text.getText().trim();
		if (searchString.length() > 0)
		{
			queryRequest = new BTSQueryRequest(searchString);
			queryRequest.setIdQuery(idButton.getSelection());
			if (exactButton.getSelection())
				queryRequest.addRequestField("name");
			queryRequest.initQueryBuilder();
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

	public void setSearchString(String searchString2) {
		this.searchString = searchString2;
		if (searchString != null)
		{
			text.setText(searchString);
			text.setSelection(text.getText().length());

		}
	}
	
	public void setNameOnly(boolean checked) {
		exactButton.setSelection(checked);
		exactButton.setData(checked);
	}
	
	public void setIdOnly(boolean checked) {
		idButton.setSelection(checked);
		idButton.setData(checked);
	}

}
