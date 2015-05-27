package org.bbaw.bts.ui.main.dialogs;

import java.util.EventObject;
import java.util.HashSet;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSComment;
import org.bbaw.bts.btsmodel.BTSConfigItem;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.BtsmodelPackage;
import org.bbaw.bts.core.controller.generalController.CommentController;
import org.bbaw.bts.core.controller.generalController.EditingDomainController;
import org.bbaw.bts.ui.commons.utils.BTSUIConstants;
import org.bbaw.bts.ui.commons.validator.StringNotEmptyValidator;
import org.bbaw.bts.ui.commons.validator.StringRegexValidator;
import org.bbaw.bts.ui.main.widgets.CompoundRelationsEditorComposite;
import org.bbaw.bts.ui.resources.BTSResourceProvider;
import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.databinding.EMFUpdateValueStrategy;
import org.eclipse.emf.databinding.edit.EMFEditProperties;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class CommentEditorDialog extends TitleAreaDialog {
	private Text txtCommenttxt;
	private BTSComment comment;
	
	@Inject
	private IEclipseContext context;
	private Composite compositeRelations;
	
	@Inject
	private BTSResourceProvider resourceProvider;
	
	@Inject
	private EditingDomainController editingDomainController;
	
	@Inject
	private CommentController commentController;

	private EditingDomain editingDomain;
	private CompoundRelationsEditorComposite relationsEditor;
	private Text txtTitletxt;
	private CommandStackListener commandStackListener;
	private Set<Command> localCommandCacheSet = new HashSet<Command>();
	private boolean dirty;
	private Composite container;
	private Composite innerCompositeRelations;

	/**
	 * Create the dialog.
	 * @param parentShell
	 */
	@Inject
	public CommentEditorDialog(Shell parentShell, BTSComment comment) {
		super(parentShell);
		this.comment = comment;
		
	}

	/**
	 * Create contents of the dialog.
	 * @param parent
	 */
	protected Control createDialogArea(Composite parent) {
		Composite area = (Composite) super.createDialogArea(parent);
		container = new Composite(area, SWT.NONE);
		container.setLayout(new GridLayout(1, false));
		container.setLayoutData(new GridData(GridData.FILL_BOTH));
		
		Label lblTitelText = new Label(container, SWT.NONE);
		lblTitelText.setText("Title of Comment");
		
		txtTitletxt = new Text(container, SWT.BORDER);
		txtTitletxt.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		
		
		Label lblCommentText = new Label(container, SWT.NONE);
		lblCommentText.setText("Comment Text (test)");
		
		txtCommenttxt = new Text(container, SWT.BORDER | SWT.WRAP | SWT.V_SCROLL | SWT.MULTI);
		txtCommenttxt.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
		compositeRelations = new Composite(container, SWT.NONE);
		compositeRelations.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		compositeRelations.setLayout(new GridLayout(1, false));
		loadInput();
		setTitle("Comment Editor");
		setMessage("Please create or edit comment.");
		return area;
	}

	private void loadInput() {

		editingDomain = editingDomainController.getEditingDomain(comment);
		DataBindingContext bindingContext = new DataBindingContext();

		EMFUpdateValueStrategy us = null;
		us = new EMFUpdateValueStrategy();
		us.setBeforeSetValidator(new StringNotEmptyValidator());
		
		// title
		Binding binding_t = bindingContext.bindValue(
				WidgetProperties.text(SWT.Modify).observeDelayed(
						BTSUIConstants.DELAY, txtTitletxt),
				EMFEditProperties.value(editingDomain,
						BtsmodelPackage.Literals.BTS_NAMED_TYPED_OBJECT__NAME)
						.observe(comment), us, null);
		
		// comment
		Binding binding = bindingContext.bindValue(
				WidgetProperties.text(SWT.Modify).observeDelayed(
						BTSUIConstants.DELAY, txtCommenttxt),
				EMFEditProperties.value(editingDomain,
						BtsmodelPackage.Literals.BTS_COMMENT__COMMENT)
						.observe(comment), us, null);
		editingDomain.getCommandStack().addCommandStackListener(
				getCommandStackListener());
		
		loadRelations();
		
	}

	private CommandStackListener getCommandStackListener() {
		if (commandStackListener == null) {
			commandStackListener = new CommandStackListener() {

				@Override
				public void commandStackChanged(EventObject event) {
					Command mostRecentCommand = editingDomain.getCommandStack()
							.getMostRecentCommand();
					if (mostRecentCommand != null) {
						if (mostRecentCommand.equals(editingDomain
								.getCommandStack().getUndoCommand())) {
							// normal command or redo executed
							localCommandCacheSet.add(mostRecentCommand);
							if (localCommandCacheSet.isEmpty()) {
								setDirty(false);
							} else if (!isDirty()) {
								setDirty(true);
							}
							// if redo, check if reload required
							checkAndReload(mostRecentCommand);
						} else {
							// undo executed
							if (localCommandCacheSet.remove(mostRecentCommand)
									&& localCommandCacheSet.isEmpty()) {
								setDirty(false);
							} else if (!isDirty()) {
								setDirty(true);
							}
							checkAndReload(mostRecentCommand);
						}
					}

				}
			};
		}
		return commandStackListener;
	}
	protected void checkAndReload(Command command) {
		if (command instanceof DeleteCommand
				|| command instanceof CompoundCommand
				|| command instanceof AddCommand
				|| command instanceof RemoveCommand) {
			loadRelations();

		}

		
	}

	private void loadRelations() {
		if (innerCompositeRelations != null)
		{
			innerCompositeRelations.dispose();
			innerCompositeRelations = null;
		}
		System.out.println("contains is disposed " + container.isDisposed());
		innerCompositeRelations = new Composite(compositeRelations, SWT.NONE);
		innerCompositeRelations.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		innerCompositeRelations.setLayout(new GridLayout(1, false));

		IEclipseContext child = context.createChild("relations");
		child.set(Composite.class, innerCompositeRelations);
		child.set(EditingDomain.class, editingDomain);
		child.set(BTSObject.class, comment);
		child.set(BTSResourceProvider.class, resourceProvider);


		relationsEditor = ContextInjectionFactory
				.make(CompoundRelationsEditorComposite.class, child);
		compositeRelations.layout();
		container.layout();
	}

	protected void setDirty(boolean dirty) {
		this.dirty = dirty;
		
	}
	public boolean isDirty()
	{
		return dirty;
	}

	/**
	 * Create contents of the button bar.
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.OK_ID, "Save",
				true);
		createButton(parent, IDialogConstants.CANCEL_ID,
				IDialogConstants.CANCEL_LABEL, false);
	}

	@Override
	protected void okPressed() {
		if (isDirty())
		{
			commentController.save(comment);
		}
		editingDomain.getCommandStack().removeCommandStackListener(
				getCommandStackListener());
		super.okPressed();
	}
	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(450, 450);
	}
	
	@Override
	protected boolean isResizable() {
		return true;
	}
}
