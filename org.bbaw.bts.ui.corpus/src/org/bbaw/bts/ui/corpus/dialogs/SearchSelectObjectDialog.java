package org.bbaw.bts.ui.corpus.dialogs;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSConfigItem;
import org.bbaw.bts.btsmodel.BTSCorpusObject;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.ui.commons.utils.BTSUIConstants;
import org.bbaw.bts.ui.corpus.parts.CorpusNavigatorPart;
import org.bbaw.bts.ui.resources.BTSResourceProvider;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.EventTopic;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class SearchSelectObjectDialog extends TitleAreaDialog {

	@Inject
	private IEclipseContext context;

	@Inject
	private BTSConfigItem relationConfig;

	@Inject
	private BTSCorpusObject selectionObject;

	private Text text;

	@Inject
	private BTSResourceProvider resourceProvider;
	/**
	 * Create the dialog.
	 * @param parentShell
	 */
	@Inject
	public SearchSelectObjectDialog(Shell parentShell) {
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

		Label lblSelectedObject = new Label(container, SWT.NONE);
		lblSelectedObject.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER,
				false, false, 1, 1));
		lblSelectedObject.setText("Selected Object");

		text = new Text(container, SWT.BORDER | SWT.READ_ONLY);
		text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		CTabFolder tabFolder = new CTabFolder(container, SWT.BORDER);
		tabFolder.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2,
				1));
		tabFolder.setSelectionBackground(Display.getCurrent().getSystemColor(
				SWT.COLOR_WHITE));

		tabFolder.setSimple(false);
		CTabItem tbtmCorpusObjects = new CTabItem(tabFolder, SWT.NONE);
		tbtmCorpusObjects.setText("Corpus Objects");
		tbtmCorpusObjects.setImage(resourceProvider.getImage(
				Display.getDefault(), BTSResourceProvider.IMG_CORPORA));

		Composite composite = new Composite(tabFolder, SWT.NONE);
		tbtmCorpusObjects.setControl(composite);
		composite.setLayout(new GridLayout(1, false));

		IEclipseContext child = context
				.createChild("searchselect:corpusNavigator");

		Composite composite_CorpusNavigator = new Composite(composite, SWT.NONE);
		composite_CorpusNavigator.setLayoutData(new GridData(SWT.FILL,
				SWT.FILL,
				true, true, 1, 1));
		composite_CorpusNavigator.setLayout(new GridLayout(1, true));
		composite_CorpusNavigator.setBackground(composite.getBackground());
		((GridLayout) composite_CorpusNavigator.getLayout()).marginWidth = 0;
		((GridLayout) composite_CorpusNavigator.getLayout()).marginHeight = 0;
		((GridLayout) composite_CorpusNavigator.getLayout()).horizontalSpacing = 0;
		((GridLayout) composite_CorpusNavigator.getLayout()).verticalSpacing = 0;

		child.set(Composite.class, composite_CorpusNavigator);
		child.set(BTSConfigItem.class, relationConfig);
		child.set(BTSUIConstants.SELECTION_TYPE,
				BTSUIConstants.SELECTION_TYPE_SECONDARY);

		CorpusNavigatorPart editor = ContextInjectionFactory.make(
				CorpusNavigatorPart.class, child);

		CTabItem tbtmWList = new CTabItem(tabFolder, SWT.NONE);
		tbtmWList.setText("Word List");
		tbtmWList.setImage(resourceProvider.getImage(Display.getDefault(),
				BTSResourceProvider.IMG_LEMMATA));

		Composite composite_1 = new Composite(tabFolder, SWT.NONE);
		tbtmWList.setControl(composite_1);
		composite_1.setLayout(new GridLayout(1, false));

		CTabItem tbtmThs = new CTabItem(tabFolder, SWT.NONE);
		tbtmThs.setText("Thesaurus");
		tbtmThs.setImage(resourceProvider.getImage(Display.getDefault(),
				BTSResourceProvider.IMG_LEMMATA));
		Composite composite_2 = new Composite(tabFolder, SWT.NONE);
		tbtmThs.setControl(composite_2);

		composite_2.setLayout(new GridLayout(1, false));


		tabFolder.setSelection(0);
		return area;
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
	}

	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(650, 550);
	}

	@Override
	protected boolean isResizable() {
		return true;
	}

	@Inject
	@Optional
	void eventReceivedSecondarySelection(
			@EventTopic("ui_secondarySelection/*") BTSObject object) {
		if (object instanceof BTSCorpusObject) {
			selectionObject = (BTSCorpusObject) object;
			if (text != null && !text.isDisposed()) {
				text.setText(object.getName());
			}
			// refreshTreeViewer((BTSCorpusObject) object);

		}
	}

	public BTSCorpusObject getObject() {
		return selectionObject;
	}

}
