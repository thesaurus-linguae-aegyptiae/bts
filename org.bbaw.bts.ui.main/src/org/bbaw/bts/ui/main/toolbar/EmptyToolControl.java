 
package org.bbaw.bts.ui.main.toolbar;

import javax.inject.Inject;
import javax.annotation.PostConstruct;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class EmptyToolControl {
	private Composite composite;

	@Inject
	public EmptyToolControl() {
		//TODO Your code here
	}
	
	@PostConstruct
	public void postConstruct(Composite parent) {
		this.composite = parent;
		composite.setLayout(new GridLayout(6, false));
		new Label(composite, SWT.None);
		new Label(composite, SWT.None);
		new Label(composite, SWT.None);
		new Label(composite, SWT.None);
		new Label(composite, SWT.None);
		new Label(composite, SWT.None);
	}
	
	
	
	
}