package org.bbaw.bts.ui.corpus.parts.annotationsPart;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.ui.commons.utils.BTSUIConstants;
import org.bbaw.bts.ui.corpus.dialogs.PassportEditorDialog;
import org.bbaw.bts.ui.resources.BTSResourceProvider;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;

public class RelatedObjectGroupRubrum extends RelatedObjectGroup {

	@Inject
	public RelatedObjectGroupRubrum(Composite parent, BTSObject object) {
		super(parent, object);
	}

	@Override
	protected void addButtons(Composite composite) {
		Label editButton = new Label(composite, SWT.PUSH);
		editButton.setImage(resourceProvider.getImage(Display.getCurrent(), BTSResourceProvider.IMG_EDIT));
		editButton.setToolTipText("Open Rubrum");
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
	protected Dialog createEditorDialog() {
		return ContextInjectionFactory.make(
				PassportEditorDialog.class, context);
	}

	@Override
	protected void refreshContent(BTSObject object) {
		setGroupTitle("Rubrum");
	}

	@Override
	protected void fillContentComposite(Composite composite) {
		setExpandBarIcon(resourceProvider.getImage(Display.getCurrent(), BTSResourceProvider.IMG_RUBRUM));
		setExpandBarBackground(BTSUIConstants.COLOR_WIHTE);
		refreshContent((BTSObject) getObject());
	}

}
