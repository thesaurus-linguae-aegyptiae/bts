package org.bbaw.bts.ui.main.dialogs;

import javax.inject.Inject;
import javax.inject.Named;

import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.ui.main.parts.ObjectUpdaterReaderEditorPart;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;

public class ObjectUpdaterReaderEditorDialog extends TitleAreaDialog {

	@Inject
	private IEclipseContext context;
	@Inject
	private EPartService partService;

	@Inject
	@Named(IServiceConstants.ACTIVE_SELECTION)
	private BTSDBBaseObject dbBaseObject;

	private ComposedAdapterFactory factory = new ComposedAdapterFactory(
			ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
	private AdapterFactoryLabelProvider labelProvider = new AdapterFactoryLabelProvider(
			factory);
	private ObjectUpdaterReaderEditorPart part;
	private Button saveButton;

	@Override
	public void create() {
		// TODO Auto-generated method stub
		super.create();
		dialogArea.addListener(SWT.Traverse, new Listener() {
			@Override
			public void handleEvent(final Event e) {
				if (e.detail == SWT.TRAVERSE_ESCAPE) {
					e.doit = false;
				}
			}
		});
		setTitle("Edit Updaters and Readers of Object "
				+ labelProvider.getText(dbBaseObject));

	}

	/**
	 * Create the dialog with default constructor.
	 * 
	 * @wbp.parser.constructor
	 */
	public ObjectUpdaterReaderEditorDialog() {
		super(new Shell());
		System.out.println("construct UpdatersReadersEditor");

	}

	/**
	 * Create the dialog.
	 * 
	 * @param parentShell
	 */
	public ObjectUpdaterReaderEditorDialog(Shell parentShell) {
		super(parentShell);
	}

	/**
	 * Create contents of the dialog.
	 * 
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {

		Composite area = (Composite) super.createDialogArea(parent);
		area.setLayout(new GridLayout());
		((GridLayout) area.getLayout()).marginWidth = 0;
		((GridLayout) area.getLayout()).marginHeight = 0;
		IEclipseContext child = context
				.createChild("updatersReadersEditorDialog");
		child.set(Composite.class, area);
		part = ContextInjectionFactory.make(
				ObjectUpdaterReaderEditorPart.class, child);
		// area.layout();
		// parent.layout();
		// part.postConstruct();
		return area;
	}

	/**
	 * Create contents of the button bar.
	 * 
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		saveButton = createSaveButton(parent, IDialogConstants.OK_ID,
				"Save and Close", true);
		createButton(parent, IDialogConstants.CANCEL_ID,
				IDialogConstants.CANCEL_LABEL, false);
	}

	private Button createSaveButton(Composite parent, int id, String label,
			boolean defaultButton) {
		((GridLayout) parent.getLayout()).numColumns++;
		Button button = new Button(parent, SWT.PUSH);
		button.setText(label);
		button.setFont(JFaceResources.getDialogFont());
		button.setData(new Integer(id));
		button.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				if (isValidInput()) {
					saveInput();
					okPressed();
				}
			}
		});
		if (defaultButton) {
			Shell shell = parent.getShell();
			if (shell != null) {
				shell.setDefaultButton(button);
			}
		}

		setButtonLayoutData(button);
		return button;

	}

	private boolean saveInput() {
		part.save(null);
		return true;

	}

	private boolean isValidInput() {
		return true;
	}

	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(785, 600);
	}

	@Override
	protected boolean isResizable() {
		return true;
	}

	@Override
	public boolean close() {
		part.dispose();
		part = null;
		return super.close();
	}

}
