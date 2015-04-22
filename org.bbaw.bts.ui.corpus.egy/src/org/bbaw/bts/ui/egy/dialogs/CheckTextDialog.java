package org.bbaw.bts.ui.egy.dialogs;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsviewmodel.BtsviewmodelFactory;
import org.bbaw.bts.btsviewmodel.TreeNodeWrapper;
import org.bbaw.bts.core.corpus.controller.partController.BTSTextEditorController;
import org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaEntry;
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
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Decorations;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Label;

public class CheckTextDialog extends TitleAreaDialog {

	@Inject
	private IEclipseContext context;

	@Inject
	private BTSText text;
	
	@Inject
	private UISynchronize sync;
	
	@Inject
	private BTSTextEditorController textController;

	private Label lblLemmapercent;

	private Label lblFlexcodepercent;

	private Label lblHieropercent;

	private Label lblWordtranspercent;

	private Label lblSentencetranspercent;

	private Label lblPasportpercent;
	/**
	 * Create the dialog.
	 * @param parentShell
	 */
	@Inject
	public CheckTextDialog(Shell parentShell) {
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
		
		Label lblNewLabel = new Label(container, SWT.NONE);
		lblNewLabel.setText("Lemmatizing completed");
		
		lblLemmapercent = new Label(container, SWT.NONE);
		lblLemmapercent.setText("lemmaPercent");
		
		Label lblFlexcodeCompleted = new Label(container, SWT.NONE);
		lblFlexcodeCompleted.setText("Flexcode completed");
		
		lblFlexcodepercent = new Label(container, SWT.NONE);
		lblFlexcodepercent.setText("flexcodePercent");
		
		Label lblHieroglyphesCompleted = new Label(container, SWT.NONE);
		lblHieroglyphesCompleted.setText("Hieroglyphes completed");
		
		lblHieropercent = new Label(container, SWT.NONE);
		lblHieropercent.setText("hieroPercent");
		
		Label lblWordTranslationsCompleted = new Label(container, SWT.NONE);
		lblWordTranslationsCompleted.setText("Word translations completed");
		
		lblWordtranspercent = new Label(container, SWT.NONE);
		lblWordtranspercent.setText("wordTransPercent");
		
		Label lblSentenceTranslationsCompleted = new Label(container, SWT.NONE);
		lblSentenceTranslationsCompleted.setText("Sentence translations completed");
		
		lblSentencetranspercent = new Label(container, SWT.NONE);
		lblSentencetranspercent.setText("sentenceTransPercent");
		
//		Label lblPassportCompleted = new Label(container, SWT.NONE);
//		lblPassportCompleted.setText("Passport completed");
//		
//		lblPasportpercent = new Label(container, SWT.NONE);
//		lblPasportpercent.setText("pasportPercent");

		loadPercentages();
		return area;
	}

	private void loadPercentages() {
		try {
			IRunnableWithProgress op = new IRunnableWithProgress() {

				@Override
				public void run(IProgressMonitor monitor)
						throws InvocationTargetException, InterruptedException {
					final int[] percentages = textController
							.checkTextCompleteness(text);
					sync.asyncExec(new Runnable() {
						@Override
						public void run() {
							lblLemmapercent.setText(percentages[0] + "%");

							lblFlexcodepercent.setText(percentages[1] + "%");

							lblHieropercent.setText(percentages[2] + "%");

							lblWordtranspercent.setText(percentages[3] + "%");

							lblSentencetranspercent.setText(percentages[4]
									+ "%");
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
		setTitle("Check Text Completeness Dialog");
		setMessage("Percentage of completed Lemmatization, flexcode etc.");
	}

	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(550, 350);
	}
}
