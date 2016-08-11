 package org.bbaw.bts.ui.corpus.parts.annotationsPart;

import javax.inject.Inject;

import org.apache.commons.lang.WordUtils;
import org.bbaw.bts.btsmodel.BTSComment;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.BTSRevision;
import org.bbaw.bts.core.controller.generalController.CommentController;
import org.bbaw.bts.ui.commons.utils.BTSUIConstants;
import org.bbaw.bts.ui.main.dialogs.CommentEditorDialog;
import org.bbaw.bts.ui.resources.BTSResourceProvider;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class RelatedObjectGroupComment extends RelatedObjectGroup {


	private Text commentText;
	
	@Inject
	private CommentController commentController;

	@Inject
	public RelatedObjectGroupComment(Composite parent, BTSObject object) {
		super(parent, object);
	}

	@Override
	protected void addButtons(Composite composite) {
		Label editButton = new Label(composite, SWT.PUSH);
		editButton.setImage(resourceProvider.getImage(Display.getCurrent(), BTSResourceProvider.IMG_EDIT));
		if (mayEdit())
		{
			editButton.setToolTipText("Edit Comment");
		}
		else
		{
			editButton.setToolTipText("Open Comment");
		}
		editButton.setLayoutData(new RowData());
		editButton.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseDown(MouseEvent e) {
				Label l = (Label) e.getSource();
				l.setBackground(BTSUIConstants.VIEW_BACKGROUND_LABEL_PRESSED);
			}

			@Override
			public void mouseUp(MouseEvent e) {
				Label l = (Label) e.getSource();
				l.setBackground(l.getParent().getBackground());
				editObject();
			}
		});

	}

	protected void editObject() {
		IEclipseContext child = context.createChild();
		child.set(BTSComment.class, (BTSComment) getObject());
		child.set(Shell.class, new Shell());
		
		CommentEditorDialog dialog = ContextInjectionFactory.make(
				CommentEditorDialog.class, child);

		if (dialog.open() == dialog.OK) {
			refreschContent((BTSComment) getObject());
		}
		
	}

	private void refreschContent(BTSComment object) {
		if (object.getComment() != null) commentText.setText(object.getComment());
		if (object.getName() != null && !"".equals(object.getName())){
			setExpandItemTitle(object.getName());
		}
		else
		{
			setExpandItemTitle(object.getComment().substring(0, Math.min(object.getComment().length(), TITLE_LENGTH)));
		}
		
	}

	@Override
	protected void fillContentComposite(Composite composite) {
		if (!getObject().getRevisions().isEmpty())
		{
			BTSRevision rev = getObject().getRevision(0);
			setGroupTitle(userController.getUserDisplayName(rev
					.getUserId()));
		}
		commentText = new Text(composite, SWT.WRAP | SWT.READ_ONLY | SWT.MULTI);
		commentText.setLayoutData(new GridData(SWT.FILL, SWT.FILL,
				true, true, 1, 1));
		BTSObject o = getObject();
		if (o instanceof BTSComment)
		{
			refreschContent((BTSComment) getObject());
		}
		commentText.setToolTipText( WordUtils.wrap(((BTSComment) getObject()).getComment(), 60));
		setExpandBarIcon(resourceProvider.getImage(Display.getCurrent(), BTSResourceProvider.IMG_COMMENT));
		setExpandBarBackground(BTSUIConstants.COLOR_WIHTE);
	}

	@Override
	public void setBackground(Color color) {
		super.setBackground(color);
		if (commentText != null && !commentText.isDisposed())
		{
			commentText.setBackground(color);
		}
	}
}
