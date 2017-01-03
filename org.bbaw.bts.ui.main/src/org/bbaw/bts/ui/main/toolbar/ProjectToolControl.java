package org.bbaw.bts.ui.main.toolbar;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.bbaw.bts.btsmodel.BTSProject;
import org.bbaw.bts.commons.BTSPluginIDs;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.ui.commons.utils.BTSUIConstants;
import org.bbaw.bts.ui.main.handlers.CreateNewUserGroupHandler;
import org.bbaw.bts.ui.resources.BTSResourceProvider;
import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.ParameterizedCommand;
import org.eclipse.e4.core.commands.ECommandService;
import org.eclipse.e4.core.commands.EHandlerService;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.services.IStylingEngine;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;


public class ProjectToolControl {

	@Inject
	private BTSResourceProvider resourceProvider;

	@Inject
	private ECommandService commandService;

	@Inject
	private EHandlerService handlerService;
	
	@Inject 
	private IStylingEngine engine;
	
	private ComposedAdapterFactory factory = new ComposedAdapterFactory(
			ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
	private AdapterFactoryLabelProvider labelProvider = new AdapterFactoryLabelProvider(
			factory);
	private Label projectLabel;

	private Composite composite;

	private BTSProject mainProject;

	@PostConstruct
	public void postConstruct(Composite composite) {
		this.composite = composite;
		composite.setLayout(new GridLayout(6, false));
		engine.setClassname(composite, "MToolBar");

		Label l = new Label(composite, SWT.None);
		l.setImage(resourceProvider.getImage(Display.getCurrent(), BTSResourceProvider.IMG_PROJECT));
		l.setLayoutData(new GridData());
		l.pack();

		projectLabel = new Label(composite, SWT.None);
		projectLabel.setLayoutData(new GridData());
		((GridData) projectLabel.getLayoutData()).horizontalSpan = 2;
		if (mainProject != null) {
			projectLabel.setText(labelProvider.getText(mainProject));
		}
		else {
			projectLabel.setText("ERROR: No Project");
		}
		projectLabel.pack();

//		Label editPrefs = new Label(composite, SWT.PUSH);
//		editPrefs.setImage(resourceProvider.getImage(Display.getCurrent(), BTSResourceProvider.IMG_PREFERENCES));
//		editPrefs.setToolTipText("Edit project settings.");
//		editPrefs.setLayoutData(new GridData(SWT.RIGHT, SWT.TOP,
//				false, false, 1, 1));
//		((GridData) editPrefs.getLayoutData()).verticalIndent = 2;
//		editPrefs.addMouseListener(new MouseAdapter() {
//
//
//			@Override
//			public void mouseDown(MouseEvent e) {
//				Label l = (Label) e.getSource();
//				l.setBackground(BTSUIConstants.VIEW_BACKGROUND_LABEL_PRESSED);
//
//			}
//
//			@Override
//			public void mouseUp(MouseEvent e) {
//				// Activate Handler
//				handlerService.activateHandler(BTSPluginIDs.CMD_ID_EDIT_PREFERENCE, new E4PreferencesHandler());
//
//				Map map = new HashMap(1);
//				map.put("preferencePageId", "org.bbaw.bts.ui.main.projectsettings.page");
//
//				Command cmd = commandService.getCommand(BTSPluginIDs.CMD_ID_EDIT_PREFERENCE);
//				ParameterizedCommand command = ParameterizedCommand.generateCommand(cmd, map);
//				//				command = commandService.getCommand(BTSPluginIDs.CMD_ID_NEW_USERGROUP);
//
//				handlerService.executeHandler(command);
//				Label l = (Label) e.getSource();
//				l.setBackground(l.getParent().getBackground());
//			}
//		});

		composite.layout();
		composite.pack();
	}
	
	@Inject
	@Optional
	public void setMainProject(
			@Named(BTSCoreConstants.MAIN_PROJECT) BTSProject project) {
		if (project != null
				&& !project.equals(this.mainProject)) {
			this.mainProject = project;
			if (projectLabel != null) {
				if (mainProject != null) {
					projectLabel.setText(labelProvider.getText(mainProject));
				}
				projectLabel.pack();
				composite.layout();
				composite.pack();
			}
		}
	}
}
