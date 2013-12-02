package org.bbaw.bts.ui.corpus.parts;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.di.Persist;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class Test
{
	@Inject
	public Test()
	{
		//TODO Your code here
	}

	@PostConstruct
	public void postConstruct(Composite parent)
	{
		new Label(parent, SWT.NONE).setText("HAllo");
	}

	@PreDestroy
	public void preDestroy()
	{
		//TODO Your code here
	}

	@Focus
	public void onFocus()
	{
		//TODO Your code here
	}

	@Persist
	public void save()
	{
		//TODO Your code here
	}

}