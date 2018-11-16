package org.bbaw.bts.ui.corpus.parts.annotationsPart;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.ui.corpus.dialogs.PassportEditorDialog;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.widgets.Composite;

public class RelatedObjectGroupImpl extends RelatedObjectGroup {


	@Inject
	public RelatedObjectGroupImpl(Composite parent, BTSObject object) {
		super(parent, object);
	}

	@Override
	protected void addButtons(Composite composite) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void fillContentComposite(Composite composite) {
		setGroupTitle(getObject().getType());
		setExpandItemTitle(getObject().getName());
	}

	@Override
	protected void refreshContent(BTSObject obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected Dialog createEditorDialog() {
		return ContextInjectionFactory.make(
				PassportEditorDialog.class, context);
	}

}
