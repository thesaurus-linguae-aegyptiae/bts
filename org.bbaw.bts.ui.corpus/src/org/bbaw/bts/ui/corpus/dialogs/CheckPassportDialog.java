package org.bbaw.bts.ui.corpus.dialogs;

import java.lang.reflect.InvocationTargetException;

import javax.inject.Inject;

import org.bbaw.bts.core.corpus.controller.generalController.PassportConfigurationController;
import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject;
import org.bbaw.bts.corpus.btsCorpusModel.BTSText;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.di.UISynchronize;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

public class CheckPassportDialog extends TitleAreaDialog {

	@Inject
	private IEclipseContext context;

	@Inject
	private BTSCorpusObject corpusObject;
	
	@Inject
	private UISynchronize sync;
	
	@Inject
	private PassportConfigurationController passportController;
	
	private Label lblPasportpercent;

	/**
	 * Create the dialog.
	 * @param parentShell
	 */
	public CheckPassportDialog(Shell parentShell) {
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

		
		Label lblPassportCompleted = new Label(container, SWT.NONE);
		lblPassportCompleted.setText("Passport completed");
		
		lblPasportpercent = new Label(container, SWT.NONE);
		lblPasportpercent.setText("pasportPercent");

		loadPercentages();
		return area;
	}

	private void loadPercentages() {
		try {
			IRunnableWithProgress op = new IRunnableWithProgress() {

				@Override
				public void run(IProgressMonitor monitor)
						throws InvocationTargetException, InterruptedException {
					final int percentage = passportController
							.checkPassportCompleteness(corpusObject);
					sync.asyncExec(new Runnable() {
						@Override
						public void run() {
							lblPasportpercent.setText(percentage + "%");

						}
					});
				}
			};
			new ProgressMonitorDialog(getShell()).run(true, true, op);
		} catch (InvocationTargetException e) {
			// handle exception
		} catch (InterruptedException e) {
			// handle cancelation
		}

	}

	/**
	 * Create contents of the button bar.
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL,
				true);
	}

	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(450, 300);
	}

}
