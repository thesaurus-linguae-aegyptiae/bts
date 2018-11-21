 package org.bbaw.bts.ui.corpus.parts.annotationsPart;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.commons.lang.WordUtils;
import org.bbaw.bts.btsmodel.BTSComment;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.BTSRevision;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.ui.commons.utils.BTSUIConstants;
import org.bbaw.bts.ui.main.dialogs.CommentEditorDialog;
import org.bbaw.bts.ui.resources.BTSResourceProvider;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class RelatedObjectGroupComment extends RelatedObjectGroup {


	private Text commentText;

	@Inject
	@Named(BTSCoreConstants.CORE_EXPRESSION_MAY_COMMENT)
	private boolean mayCommentObject;

	@Inject
	public RelatedObjectGroupComment(Composite parent, BTSObject object) {
		super(parent, object);
	}

	@Override
	protected void addButtons(Composite composite) {
		Label editButton = new Label(composite, SWT.PUSH);
		editButton.setImage(resourceProvider.getImage(Display.getCurrent(), BTSResourceProvider.IMG_EDIT));
		editButton.setToolTipText("Open Comment");
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

	@Override
	protected boolean mayEdit() {
		return super.mayEdit() || mayCommentObject;
	}

	@Override
	protected org.eclipse.jface.dialogs.Dialog createEditorDialog() {
		// we need to replace flag in context because permission to comment
		// must be taken into account
		context.set(BTSCoreConstants.CORE_EXPRESSION_MAY_EDIT,
				mayEdit());
		context.set(BTSComment.class, (BTSComment)getObject());
		return ContextInjectionFactory.make(CommentEditorDialog.class, context);
	};
	
	@Override
	protected void refreshContent(BTSObject obj) {
		BTSComment comment = (BTSComment)obj;
		if (comment.getComment() != null) commentText.setText(comment.getComment());
		if (comment.getName() != null && !"".equals(comment.getName())){
			setExpandItemTitle(comment.getName());
		}
		else
		{
			setExpandItemTitle(comment.getComment().substring(0, Math.min(comment.getComment().length(), TITLE_LENGTH)));
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
			refreshContent((BTSComment) getObject());
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
