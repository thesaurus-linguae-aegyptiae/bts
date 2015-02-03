package org.ramo.klevis.p4app.parts;

import java.util.Collections;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.workbench.IWorkbench;
import org.eclipse.equinox.p2.core.IProvisioningAgent;
import org.eclipse.equinox.p2.metadata.IInstallableUnit;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.layout.GridData;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.ramo.klevis.p2.core.iservice.IInstallNewSoftwareService;
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
public class SimpleInstallPart {
	private Text text;
	IInstallNewSoftwareService installService;
	IProvisioningAgent agent;
	private Tree tree;
	List<IInstallableUnit> loadRepository;
	IWorkbench workbench;

	public SimpleInstallPart(IInstallNewSoftwareService installService,
			IProvisioningAgent agent, IWorkbench workbench) {
		this.installService = installService;
		this.agent = agent;
		this.workbench = workbench;
	}

	public SimpleInstallPart() {
	}

	/**
	 * Create contents of the view part.
	 */
	@PostConstruct
	public void createControls(final Composite parent) {
		parent.setLayout(new GridLayout(4, false));
		new Label(parent, SWT.NONE);
		new Label(parent, SWT.NONE);
		new Label(parent, SWT.NONE);
		new Label(parent, SWT.NONE);
		new Label(parent, SWT.NONE);

		Label lblEnterUrlHere = new Label(parent, SWT.NONE);
		lblEnterUrlHere.setFont(SWTResourceManager.getFont("Segoe UI", 11,
				SWT.BOLD | SWT.ITALIC));
		lblEnterUrlHere.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER,
				false, false, 1, 1));
		lblEnterUrlHere.setText("Enter url here");

		text = new Text(parent, SWT.BORDER | SWT.MULTI | SWT.WRAP | SWT.V_SCROLL);
		text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Button btnOk = new Button(parent, SWT.NONE);
		btnOk.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

				String text2 = text.getText();

				loadRepository = installService.loadRepository(text2, agent);
				Collections.sort(loadRepository);
				tree.removeAll();
				for (IInstallableUnit install : loadRepository) {

					TreeItem treeItem = new TreeItem(tree, 0);
					treeItem.setText(install.getId());

					boolean category = installService.isCategory(install);
					if (category) {

						List<IInstallableUnit> extractFromCategory = installService
								.extractFromCategory(install);

						for (IInstallableUnit iInstallableUnit : extractFromCategory) {

							new TreeItem(treeItem, 0).setText(iInstallableUnit
									.getId());
						}
					}

				}
			}
		});
		btnOk.setText("OK");
		new Label(parent, SWT.NONE);

		tree = new Tree(parent, SWT.BORDER);
		tree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 3, 1));
		new Label(parent, SWT.NONE);

		Label lblErrorLog = new Label(parent, SWT.NONE);
		lblErrorLog.setFont(SWTResourceManager.getFont("Times New Roman", 12,
				SWT.BOLD | SWT.ITALIC));
		lblErrorLog.setText("Error Log");
		new Label(parent, SWT.NONE);
		new Label(parent, SWT.NONE);
		new Label(parent, SWT.NONE);

		final StyledText styledText = new StyledText(parent, SWT.BORDER);
		styledText.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true,
				3, 1));
		new Label(parent, SWT.NONE);

		Button btnNewButton = new Button(parent, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String installNewSoftware = "";

				try {

					if (loadRepository == null || loadRepository.isEmpty()) {

						styledText.setText("You must select at last one");

					}
					installNewSoftware = installService
							.installNewSoftware(loadRepository);

				} catch (Exception exception) {

					exception.printStackTrace();
					if (exception.getMessage().contains(
							"Profile id _SELF_ is not registered"))

						styledText
								.setText("You must export via .product file first");
					else
						styledText.setText(exception.getMessage()
								+ "Something bat happended");

				}

				if (installNewSoftware != null) {
					styledText.setText(installNewSoftware);

					if (installNewSoftware
							.equals(IInstallNewSoftwareService.SUCESS_INSTALL)) {
						boolean openConfirm = MessageDialog.openConfirm(
								(Shell) parent, "",
								"Software installed, do you want to restart in order to see changes?");
						if (openConfirm) {
							workbench.restart();
						}

					}
				} else
					styledText
							.setText("Software installed!Pres Esc and restart");

			}
		});
		btnNewButton.setFont(SWTResourceManager.getFont("Segoe UI", 12,
				SWT.BOLD));
		GridData gd_btnNewButton = new GridData(SWT.LEFT, SWT.CENTER, false,
				false, 3, 1);
		gd_btnNewButton.widthHint = 459;
		btnNewButton.setLayoutData(gd_btnNewButton);
		btnNewButton.setText("Install New Software");
	}

	@PreDestroy
	public void dispose() {
	}

	@Focus
	public void setFocus() {
		// TODO Set the focus to control
	}

}
