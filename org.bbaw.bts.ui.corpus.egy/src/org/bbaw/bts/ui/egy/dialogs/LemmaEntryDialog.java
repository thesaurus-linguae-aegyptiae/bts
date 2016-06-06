package org.bbaw.bts.ui.egy.dialogs;

import javax.inject.Inject;
import javax.inject.Named;

import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.controller.generalController.PermissionsAndExpressionsEvaluationController;
import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject;
import org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaEntry;
import org.bbaw.bts.ui.corpus.parts.PassportEditorPart;
import org.bbaw.bts.ui.egy.parts.EgyLemmaEditorPart;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;

public class LemmaEntryDialog extends TitleAreaDialog {

	@Inject
	private IEclipseContext context;

	@Inject
	private PermissionsAndExpressionsEvaluationController permissionsController;

	@Inject
	private BTSLemmaEntry selectionObject;
	
	private PassportEditorPart passportEditor;

	private EgyLemmaEditorPart lemmaEditor;

	@Inject
	@Optional
	@Named(BTSCoreConstants.CORE_EXPRESSION_MAY_EDIT)
	private Boolean userMayEdit;


	/**
	 * Create the dialog.
	 * @param parentShell
	 */
	@Inject
	public LemmaEntryDialog(Shell parentShell) {
		super(parentShell);
	}

	/**
	 * Create contents of the dialog.
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		userMayEdit &= permissionsController.userMayEditObject(permissionsController.getAuthenticatedUser(), selectionObject);
		Composite area = (Composite) super.createDialogArea(parent);

		SashForm sashForm = new SashForm(area, SWT.VERTICAL);
		sashForm.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				true, 1, 1));
		
		Composite lemmaEdComposite = new Composite(sashForm, SWT.NONE);
		lemmaEdComposite.setLayoutData(new GridData(SWT.FILL,
				SWT.FILL,
				true, true, 1, 1));
		lemmaEdComposite.setLayout(new GridLayout(1, true));
		lemmaEdComposite.setBackground(lemmaEdComposite.getBackground());
		((GridLayout) lemmaEdComposite.getLayout()).marginWidth = 0;
		((GridLayout) lemmaEdComposite.getLayout()).marginHeight = 0;
		((GridLayout) lemmaEdComposite.getLayout()).horizontalSpacing = 0;
		((GridLayout) lemmaEdComposite.getLayout()).verticalSpacing = 0;
		IEclipseContext lemmaChild = context.createChild("lemmaEditorDialog");
		lemmaChild.set(Composite.class, lemmaEdComposite);

		lemmaEditor = ContextInjectionFactory.make(
				EgyLemmaEditorPart.class, lemmaChild);
		lemmaEditor.setInputObjectDirect(selectionObject);
		
		
		Composite passportComposite = new Composite(sashForm, SWT.NONE);
		passportComposite.setLayoutData(new GridData(SWT.FILL,
				SWT.FILL,
				true, true, 1, 1));
		passportComposite.setLayout(new GridLayout(1, true));
		passportComposite.setBackground(passportComposite.getBackground());
		((GridLayout) passportComposite.getLayout()).marginWidth = 0;
		((GridLayout) passportComposite.getLayout()).marginHeight = 0;
		((GridLayout) passportComposite.getLayout()).horizontalSpacing = 0;
		((GridLayout) passportComposite.getLayout()).verticalSpacing = 0;

		IEclipseContext passportChild = context.createChild("passportEditorDialog");
		passportChild.set(Composite.class, passportComposite);
		passportChild.set(IServiceConstants.ACTIVE_SELECTION, null);
		passportChild.set(BTSCoreConstants.CORE_EXPRESSION_MAY_EDIT, new Boolean(userMayEdit));

		passportEditor = ContextInjectionFactory.make(
				PassportEditorPart.class, passportChild);
		passportEditor.setInputObjectDirect((BTSCorpusObject) selectionObject);

		sashForm.setWeights(new int[] { 1, 1 });
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
		getButton(IDialogConstants.OK_ID).setEnabled(userMayEdit);
		createButton(parent, IDialogConstants.CANCEL_ID,
				IDialogConstants.CANCEL_LABEL, false);
	}

	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(750, 750);
	}

	@Override
	protected boolean isResizable() {
		return true;
	}


	@Override
	protected void okPressed() {
			passportEditor.save();
			lemmaEditor.save();
		super.okPressed();
	}

}
