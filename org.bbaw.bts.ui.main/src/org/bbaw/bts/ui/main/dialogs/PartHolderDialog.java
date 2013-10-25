package org.bbaw.bts.ui.main.dialogs;

import javax.inject.Inject;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;

public class PartHolderDialog extends Dialog
{
	@Inject
	IEclipseContext context;

	//	@Inject
	//	ModelService modelService;

	/**
	 * Create the dialog.
	 * 
	 * @param parentShell
	 */
	public PartHolderDialog(Shell parentShell)
	{
		super(parentShell);
	}

	public PartHolderDialog()
	{
		super(new Shell());
	}

	/**
	 * Create contents of the dialog.
	 * 
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent)
	{
		Composite container = (Composite) super.createDialogArea(parent);
		IEclipseContext child = context.createChild("partdialogHolder");
		//		//		child.set("partHolderComposite", container);
		//		child.set(Composite.class, container);
		//		MPartStack partstack = MBasicFactory.INSTANCE.createPartStack();//ContextInjectionFactory.make(PartStackImpl.class, child);
		//		partstack.set
		//		MPart part = MBasicFactory.INSTANCE.createInputPart();
		//		part.setContributionURI("bundleclass://org.bbaw.bts.ui.main/org.bbaw.bts.ui.main.parts.UserManagementPart");
		//		//		part.setInputURI("file://C:/bla.model");
		//
		//		//		UserManagementPart part2 = ContextInjectionFactory.make(UserManagementPart.class, child);
		//
		//		partstack.getChildren().add(part);
		//		//		partService.activate(editor, true);
		//		//		context.set(UserManagementDialog.class, dialog);

		return container;
	}

	/**
	 * Create contents of the button bar.
	 * 
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent)
	{
		createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
		createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
	}

	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize()
	{
		return new Point(785, 581);
	}

}
