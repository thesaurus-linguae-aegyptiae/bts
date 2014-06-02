package org.bbaw.bts.ui.main.compare;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

import org.bbaw.bts.ui.commons.compare.CompareViewer;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.di.Persist;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.layout.GridData;

public class CompareViewerGeneralImpl implements CompareViewer{

	private Composite leftComposite;
	private Composite rightComposite;


	@Override
	public boolean load(Object leftObject, boolean leftEditable,
			Object rightObject, boolean rightEditable) {
		// TODO Auto-generated method stub
		return false;
	}

	@Inject
	public CompareViewerGeneralImpl() {
		//TODO Your code here
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
		
		rightComposite = new Composite(sashForm, SWT.NONE);
		sashForm.setWeights(new int[] {1, 1});
		//TODO Your code here
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
