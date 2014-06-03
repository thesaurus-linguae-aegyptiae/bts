package org.bbaw.bts.ui.egy.compare;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;
import javax.inject.Named;

import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.core.controller.dialogControllers.CompareObjectsController;
import org.bbaw.bts.ui.commons.compare.CompareViewer;
import org.bbaw.bts.ui.commons.utils.BTSUIConstants;
import org.bbaw.bts.ui.egy.parts.EgyTextEditorPart;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.di.Persist;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;

public class CompareViewerEgyTextImpl implements CompareViewer{

	@Inject
	private IEclipseContext context;
	
	private Composite leftComposite;
	private Composite rightComposite;
	private BTSObject leftObject;
	private boolean leftEditale;
	private BTSObject rightObject;
	private boolean righEditable;
	private EgyTextEditorPart leftTextEditor;

	private EgyTextEditorPart rightTextEditor;


	@Override
	public boolean load(Object leftObject, boolean leftEditable,
			Object rightObject, boolean rightEditable) {
		if (leftObject instanceof BTSObject && rightObject instanceof BTSObject)
		{
			this.leftObject = (BTSObject) leftObject;
			this.leftEditale = leftEditable;
			this.rightObject = (BTSObject) rightObject;
			this.righEditable = rightEditable;

			leftTextEditor.setSelection((BTSObject) leftObject);
			rightTextEditor.setSelection((BTSObject) rightObject);
		}
		return false;
	}

	@Inject
	public CompareViewerEgyTextImpl() {

	}
	
	@PostConstruct
	public void postConstruct(Composite parent) {
		GridLayout gl_parent = new GridLayout(1, false);
		gl_parent.horizontalSpacing = 0;
		gl_parent.verticalSpacing = 0;
		gl_parent.marginHeight = 0;
		parent.setLayout(gl_parent);
		
		SashForm sashForm = new SashForm(parent, SWT.NONE);
		sashForm.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
		leftComposite = new Composite(sashForm, SWT.NONE);
		loadLeftEditor();
		
		rightComposite = new Composite(sashForm, SWT.NONE);
		loadRightEditor();
		sashForm.setWeights(new int[] {1, 1});
		//TODO Your code here
	}
	
	
	private void loadRightEditor() {
		IEclipseContext child = context.createChild();
		child.set(Composite.class, rightComposite);
		child.set(BTSUIConstants.PART_SAVE_ON_DESELCTION, false);

		rightTextEditor = ContextInjectionFactory.make(
				EgyTextEditorPart.class, child);
		
	}

	private void loadLeftEditor() {
		IEclipseContext child = context.createChild();
		child.set(Composite.class, leftComposite);
		child.set(BTSUIConstants.PART_SAVE_ON_DESELCTION, false);

		leftTextEditor = ContextInjectionFactory.make(
				EgyTextEditorPart.class, child);
		
	}

	@PreDestroy
	public void preDestroy() {
		//TODO Your code here
	}
	
	
	@Focus
	public void onFocus() {
		//TODO Your code here
	}
	
	
	@Persist
	public boolean save() {
		return false;
		//TODO Your code here
	}
}
