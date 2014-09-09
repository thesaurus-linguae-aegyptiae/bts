package org.bbaw.bts.ui.corpus.toolcontrol;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.bbaw.bts.btsmodel.BTSProject;
import org.bbaw.bts.commons.BTSPluginIDs;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.corpus.btsCorpusModel.BTSTextCorpus;
import org.bbaw.bts.ui.commons.utils.BTSUIConstants;
import org.bbaw.bts.ui.main.handlers.CreateNewUserGroupHandler;
import org.bbaw.bts.ui.resources.BTSResourceProvider;
import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.ParameterizedCommand;
import org.eclipse.e4.core.commands.ECommandService;
import org.eclipse.e4.core.commands.EHandlerService;
import org.eclipse.e4.core.di.annotations.Optional;
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

import com.opcoach.e4.preferences.handlers.E4PreferencesHandler;

public class CorpusToolControl {

	@Inject
	private BTSResourceProvider resourceProvider;

	@Inject
	private ECommandService commandService;

	@Inject
	private EHandlerService handlerService;
	
	private ComposedAdapterFactory factory = new ComposedAdapterFactory(
			ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
	private AdapterFactoryLabelProvider labelProvider = new AdapterFactoryLabelProvider(
			factory);
	private Label corpusLabel;

	private Composite composite;

	private BTSTextCorpus mainCorpus;

	@PostConstruct
	public void postConstruct(Composite composite) {
		this.composite = composite;
		composite.setLayout(new GridLayout(6, false));
		Label l = new Label(composite, SWT.None);
		l.setImage(resourceProvider.getImage(Display.getCurrent(), BTSResourceProvider.IMG_CORPUS));
		l.setLayoutData(new GridData());
		l.pack();

		corpusLabel = new Label(composite, SWT.None);
		corpusLabel.setLayoutData(new GridData());
		((GridData) corpusLabel.getLayoutData()).horizontalSpan = 2;
		if (mainCorpus != null) {
			corpusLabel.setText(labelProvider.getText(mainCorpus));
		}
		else {
			corpusLabel.setText("No Corpus");
		}
		corpusLabel.pack();

		Label editPrefs = new Label(composite, SWT.PUSH);
		editPrefs.setImage(resourceProvider.getImage(Display.getCurrent(), BTSResourceProvider.IMG_PREFERENCES));
		editPrefs.setToolTipText("Edit project settings.");
		editPrefs.setLayoutData(new GridData(SWT.RIGHT, SWT.TOP,
				false, false, 1, 1));
		((GridData) editPrefs.getLayoutData()).verticalIndent = 2;
		editPrefs.addMouseListener(new MouseAdapter() {


			@Override
			public void mouseDown(MouseEvent e) {
				Label l = (Label) e.getSource();
				l.setBackground(BTSUIConstants.VIEW_BACKGROUND_LABEL_PRESSED);

			}

			@Override
			public void mouseUp(MouseEvent e) {
				// Activate Handler
				handlerService.activateHandler(BTSPluginIDs.CMD_ID_EDIT_PREFERENCE, new E4PreferencesHandler());

				Map map = new HashMap(1);
				map.put("preferencePageId", "org.bbaw.bts.ui.corpus.corpussettings.page");

				Command cmd = commandService.getCommand(BTSPluginIDs.CMD_ID_EDIT_PREFERENCE);
				ParameterizedCommand command = ParameterizedCommand.generateCommand(cmd, map);
				//				command = commandService.getCommand(BTSPluginIDs.CMD_ID_NEW_USERGROUP);

				handlerService.executeHandler(command);
				Label l = (Label) e.getSource();
				l.setBackground(l.getParent().getBackground());
			}
		});

		composite.layout();
		composite.pack();
	}
	
	@Inject
	@Optional
	public void setMainCorpus(
			@Named(BTSPluginIDs.PREF_MAIN_CORPUS) Object corpus) {
		
		if (corpus instanceof BTSTextCorpus && corpus != null
				&& !corpus.equals(this.mainCorpus)) {
			this.mainCorpus = (BTSTextCorpus) corpus;
			if (corpusLabel != null) {
				if (mainCorpus != null) {
					corpusLabel.setText(labelProvider.getText(mainCorpus));
				}
				corpusLabel.pack();
				composite.layout();
				composite.pack();
			}
		}
	}
}
