package org.bbaw.bts.ui.main.handlers;

import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.workbench.IWorkbench;
import org.eclipse.equinox.p2.core.IProvisioningAgent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Shell;
import org.ramo.klevis.p2.core.iservice.IInstallNewSoftwareService;
import org.ramo.klevis.p4app.parts.SimpleInstallPart;
/*******************************************************************************
 * Copyright (c) 2012 Klevis Ramo and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Klevis Ramo - initial API and implementation
 *******************************************************************************/
public class InstallNewSoftwareHandler {
	
	@Execute
	public void execute(@Optional @Named(IServiceConstants.ACTIVE_SHELL) Shell shell,IProvisioningAgent agem,IInstallNewSoftwareService installNewSoftwareService,IWorkbench workbench) {
		// TODO Your code goes here

		System.err.println("Ok");
		
		Shell shell2 = new Shell(shell,SWT.DIALOG_TRIM);
		
		new SimpleInstallPart(installNewSoftwareService, agem,workbench).createControls(shell2);
		
		shell2.open();
		;

		
		
	}

}