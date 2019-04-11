package org.bbaw.bts.ui.main.dialogs;

import javax.inject.Inject;
import javax.inject.Named;

import org.bbaw.bts.core.dao.util.BTSQueryRequest;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.osgi.service.prefs.BackingStoreException;

public class SimpleSearchQueryDialog extends TitleAreaDialog {
	private Text text;
	private BTSQueryRequest queryRequest;
	private Button idButton;
	private Button nameButton;
	private Button prefixButton;
	private Button simpleQueryButton;
	private Button wildcardQueryButton;
	private Button phraseQueryButton;
	private Button[] specificFieldButtons;
	
	@Inject
	@Optional
	@Named("org.bbaw.bts.ui.main.commandparameter.searchString")
	private String searchString;

	private String scopeId = null;

	final static String OPT_ID_SEARCH = "id_search";
	final static String OPT_NAME_SEARCH = "name_search";
	final static String OPT_PREFIX_QUERY = "prefix_query";
	final static String OPT_WILDCARD_QUERY = "wildcard_query";
	final static String OPT_PHRASE_QUERY = "phrase_query";

	private IEclipsePreferences prefs;

	/**
	 * Create the dialog.
	 * @param parentShell
	 * @param query 
	 */
	public SimpleSearchQueryDialog(Shell parentShell) {
		super(parentShell);
	}

	/**
	 * Configure dialog shell to always be of at least the initial size.
	 * @see #getInitialSize()
	 */
	@Override
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		newShell.setMinimumSize(new Point(225, 150));
	}

	/**
	 * Create contents of the dialog.
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(final Composite parent) {

		prefs = InstanceScope.INSTANCE.getNode("org.bbaw.bts.ui");

		Composite area = (Composite) super.createDialogArea(parent);
		Composite containerTop = new Composite(area, SWT.NONE);
		containerTop.setLayout(new GridLayout(2, false));
		containerTop.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, true));
		Composite containerBot = new Composite(area, SWT.NONE);
		containerBot.setLayout(new GridLayout(2, false));
		containerBot.setLayoutData(new GridData(SWT.FILL, SWT.BOTTOM, true, true));
		
		Label lblFullTextSearch = new Label(containerTop, SWT.NONE);
		lblFullTextSearch.setText("Search Term");
		lblFullTextSearch.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 2, 1));

		text = new Text(containerTop, SWT.BORDER | SWT.SEARCH);
		text.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 2, 1));
		if (searchString != null)
		{
			text.setText(searchString);
			text.setSelection(text.getText().length());
		}
		text.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				enableConditionalOptions();
				formStateChanged();
			}
		});

		Group group = new Group(containerBot, SWT.NONE);
		group.setText("Search Options");
		group.setLayout(new GridLayout(2, false));
		group.setLayoutData(new GridData(SWT.FILL, SWT.BOTTOM, true, true, 2, 2));

		simpleQueryButton = new Button(group, SWT.CHECK);
		simpleQueryButton.setText("Full Text Search");
		simpleQueryButton.setLayoutData(new GridData(SWT.FILL, SWT.BOTTOM, true, false, 2, 1));
		simpleQueryButton.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (simpleQueryButton.getSelection()) {
					idButton.setSelection(false);
					nameButton.setSelection(false);
					prefixButton.setEnabled(false);
					wildcardQueryButton.setEnabled(false);
					phraseQueryButton.setEnabled(false);
				}
				formStateChanged();
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {}
		});

		Group fieldsGroup = new Group(group, SWT.NONE);
		fieldsGroup.setText("Exact Search");
		fieldsGroup.setLayout(new GridLayout(3, false));
		fieldsGroup.setLayoutData(new GridData(SWT.FILL, SWT.BOTTOM, true, false, 2, 1));

		Group fieldSelectionGroup = new Group(fieldsGroup, SWT.NONE);
		fieldSelectionGroup.setText("Specific Field");
		fieldSelectionGroup.setLayout(new GridLayout(2, false));
		fieldSelectionGroup.setLayoutData(new GridData(SWT.FILL, SWT.BOTTOM, true, false, 3, 1));
		
		idButton = new Button(fieldSelectionGroup, SWT.CHECK);
		idButton.setText("IDs");
		idButton.setLayoutData(new GridData(SWT.FILL, SWT.BOTTOM, true, false, 2, 1));
		idButton.setData(false);
		idButton.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				setIdSearch(idButton.getSelection());
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {}
		});

		nameButton = new Button(fieldSelectionGroup, SWT.CHECK);
		nameButton.setText("Names");
		nameButton.setLayoutData(new GridData(SWT.FILL, SWT.BOTTOM, true, false, 2, 1));
		nameButton.setData(false);
		nameButton.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				setNameSearch(nameButton.getSelection());
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});

		specificFieldButtons = new Button[]{
				idButton,
				nameButton
		};

		prefixButton = new Button(fieldsGroup, SWT.CHECK);
		prefixButton.setText("Prefix");
		prefixButton.setLayoutData(new GridData(SWT.FILL, SWT.BOTTOM, true, false, 1, 1));

		wildcardQueryButton = new Button(fieldsGroup, SWT.CHECK);
		wildcardQueryButton.setText("Wildcard");
		wildcardQueryButton.setLayoutData(new GridData(SWT.FILL, SWT.BOTTOM, true, false, 1, 1));

		phraseQueryButton = new Button(fieldsGroup, SWT.CHECK);
		phraseQueryButton.setText("Phrase");
		phraseQueryButton.setLayoutData(new GridData(SWT.FILL, SWT.BOTTOM, true, false, 1, 1));

		// init search options
		idButton.setSelection(
				prefs.getBoolean(
						scopeId + "." + OPT_ID_SEARCH,
						false
				)
		);
		nameButton.setSelection(
				prefs.getBoolean(
						scopeId + "." + OPT_NAME_SEARCH,
						false
				)
		);
		prefixButton.setSelection(
				prefs.getBoolean(
						scopeId + "." + OPT_PREFIX_QUERY,
						false
				)
		);
		simpleQueryButton.setSelection(
				!(idButton.getSelection() || nameButton.getSelection())
		);
		prefixButton.setEnabled(
				!simpleQueryButton.getSelection()
		);
		wildcardQueryButton.setSelection(
				prefs.getBoolean(
						scopeId + "." + OPT_WILDCARD_QUERY, 
						false)
		);
		wildcardQueryButton.setEnabled(
				enableWildcardOptionCondition()
		);
		phraseQueryButton.setSelection(
				prefs.getBoolean(
						scopeId + "." + OPT_PHRASE_QUERY,
						false
				)
		);
		phraseQueryButton.setEnabled(
				enablePhraseOptionCondition()
			);

		area.pack();
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
		getButton(IDialogConstants.OK_ID).setEnabled(
				text.getText().trim().length() > 0
				);
		createButton(parent, IDialogConstants.CANCEL_ID,
				IDialogConstants.CANCEL_LABEL, false);
	}
	
	@Override
	protected void okPressed() {
		String searchString = text.getText().trim();
		if (searchString.length() > 0)
		{
			prefs.putBoolean(scopeId+"."+OPT_ID_SEARCH, idButton.getSelection());
			prefs.putBoolean(scopeId+"."+OPT_NAME_SEARCH, nameButton.getSelection());
			prefs.putBoolean(scopeId+"."+OPT_PREFIX_QUERY, prefixButton.getSelection());
			prefs.putBoolean(scopeId+"."+OPT_WILDCARD_QUERY, wildcardQueryButton.getSelection());
			prefs.putBoolean(scopeId+"."+OPT_PHRASE_QUERY, phraseQueryButton.getSelection());
			try {
				prefs.flush();
			} catch (BackingStoreException e) {}
			queryRequest = new BTSQueryRequest(searchString);
			if (!simpleQueryButton.getSelection())
			if (nameButton.getSelection())
				queryRequest.addRequestField("name");
			if (idButton.getSelection()) {
				if (!(nameButton.getSelection() || prefixButton.getSelection())) {
					// this bypasses elasticsearch and retrieves document via ID directly
					queryRequest.setIdQuery(true);
				} else {
					queryRequest.addRequestField("_id");
				}
			}
			queryRequest.setPrefixQuery(
					prefixButton.getSelection() && prefixButton.isEnabled()
				);
			queryRequest.setWildcardQuery(
					wildcardQueryButton.getSelection() && wildcardQueryButton.isEnabled()
				);
			queryRequest.setPhraseQuery(
					phraseQueryButton.getSelection() && phraseQueryButton.isEnabled()
				);
			queryRequest.initQueryBuilder();
		}
		else
		{
			queryRequest = null;
		}
		super.okPressed();
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
	
	public void setNameSearch(boolean checked) {
		setRequestFieldButtonState(nameButton, checked);
	}
	
	public void setIdSearch(boolean checked) {
		setRequestFieldButtonState(idButton, checked);
	}

	private boolean isAnySpecificFieldButtonSelected() {
		boolean specificFieldSelected = false;
		for (Button b : specificFieldButtons) {
			specificFieldSelected |= b.getSelection();
		}
		return specificFieldSelected;
	}

	private void setRequestFieldButtonState(Button fieldButton, boolean checked) {
		fieldButton.setSelection(checked);
		if (checked) {
			simpleQueryButton.setSelection(false);
			prefixButton.setEnabled(true);
		} else {
			if (!isAnySpecificFieldButtonSelected()) {
				prefixButton.setEnabled(false);
				simpleQueryButton.setSelection(true);
			}
		}
		enableConditionalOptions();
		formStateChanged();
	}

	private void formStateChanged() {
		getButton(IDialogConstants.OK_ID).setEnabled(
				(text.getText().trim().length() > 0)
				&&
				(
						simpleQueryButton.getSelection() ||
						isAnySpecificFieldButtonSelected()
				)
		);
	}
	
	public void setScope(String identifier) {
		this.scopeId = identifier;
	}

	@Override
	protected boolean isResizable() {
		return true;
	}

	private boolean enableWildcardOptionCondition() {
		return !simpleQueryButton.getSelection() && text.getText().matches("^.*[*?].*$");
	}

	private boolean enablePhraseOptionCondition() {
		return !simpleQueryButton.getSelection() && text.getText().matches("^.*[ -.:,].*$");
	}

	private void enableConditionalOptions() {
		wildcardQueryButton.setEnabled(
				enableWildcardOptionCondition()
		);
		phraseQueryButton.setEnabled(
				enablePhraseOptionCondition()
		);
	}
}
