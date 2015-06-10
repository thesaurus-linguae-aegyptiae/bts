/*******************************************************************************
 * Copyright (c) 2012 Kai Toedter and others.
 * 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Kai Toedter - initial implementation
 ******************************************************************************/

package org.bbaw.bts.app.login;

import javax.inject.Inject;
import javax.inject.Named;

import org.bbaw.bts.app.login.internal.LoginDialog;
import org.bbaw.bts.core.controller.generalController.BTSUserController;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Monitor;
import org.eclipse.swt.widgets.Shell;

public class Login
{

	@Inject
	private IEclipseContext context;

	@Inject
	@Named(IServiceConstants.ACTIVE_SHELL)
	private Shell shell;

	@Inject
	private BTSUserController userController;

	private boolean restartRequired;

	public void login(IEclipseContext context, BTSUserController userController)
	{
		if (context == null)
		{
			this.context = context;
		}
		if (userController == null)
		{
			this.userController = userController;
		}
		System.out.println("login");
		if (shell == null)
		{
			shell = new Shell(SWT.NO_TRIM | SWT.ON_TOP);
		}

		final LoginDialog dialog = new LoginDialog(shell, context,
				userController);
		dialog.create();
		// close the static splash screen

		// position the shell
		setLocation(Display.getDefault(), shell);
		// String cssTheme = "org.bbaw.bts.ui.themes.login";
		// context.set(E4Application.THEME_ID, cssTheme);
		// String cssURI = "css/login.css";
		// context.set(E4Workbench.CSS_URI_ARG, cssURI);
		//
		// PartRenderingEngine.initializeStyling(shell.getDisplay(), context);
		int returnCode =dialog.open();
		if (returnCode != Window.OK)
		{
			// we don't have a workbench yet...
			System.exit(0);
		}
		if (dialog.isRestartRequired())
		{
			this.restartRequired = true;
		}
	}

	private void setLocation(Display display, Shell shell)
	{
		Monitor monitor = display.getPrimaryMonitor();
		Rectangle monitorRect = monitor.getBounds();
		Rectangle shellRect = shell.getBounds();
		int x = monitorRect.x + (monitorRect.width - shellRect.width) / 2;
		int y = monitorRect.y + (monitorRect.height - shellRect.height) / 2;
		shell.setLocation(x, y);
	}
	
	public boolean isRestartRequired()
	{
		return restartRequired;
	}
}
