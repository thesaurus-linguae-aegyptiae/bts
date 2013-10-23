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
import org.bbaw.bts.core.services.BTSUserService;
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
	private BTSUserService uService;

	@Inject
	private IEclipseContext context;

	@Inject
	@Named(IServiceConstants.ACTIVE_SHELL)
	private Shell shell;

	public void login(IEclipseContext context, BTSUserService userService)
	{
		if (context == null)
		{
			this.context = context;
		}
		if (uService == null)
		{
			this.uService = userService;
		}
		System.out.println("login");
		if (shell == null)
		{
			shell = new Shell(SWT.TOOL | SWT.NO_TRIM);
		}

		final LoginDialog dialog = new LoginDialog(shell, context, uService);
		dialog.create();
		// close the static splash screen

		// position the shell
		setLocation(shell.getDisplay(), shell);
		// String cssTheme = "org.bbaw.bts.ui.themes.login";
		// context.set(E4Application.THEME_ID, cssTheme);
		// String cssURI = "css/login.css";
		// context.set(E4Workbench.CSS_URI_ARG, cssURI);
		//
		// PartRenderingEngine.initializeStyling(shell.getDisplay(), context);

		if (dialog.open() != Window.OK)
		{
			// we don't have a workbench yet...
			System.exit(0);
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
}
