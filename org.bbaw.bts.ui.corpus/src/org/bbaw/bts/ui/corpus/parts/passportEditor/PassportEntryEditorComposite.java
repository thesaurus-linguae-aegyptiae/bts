package org.bbaw.bts.ui.corpus.parts.passportEditor;

import java.util.List;
import java.util.Vector;

import javax.inject.Inject;
import javax.inject.Named;

import org.bbaw.bts.btsmodel.BTSConfigItem;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.corpus.btsCorpusModel.BTSPassport;
import org.bbaw.bts.corpus.btsCorpusModel.BTSPassportEntry;
import org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelFactory;
import org.eclipse.core.runtime.Assert;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.Preference;
import org.eclipse.e4.ui.di.UISynchronize;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;

public abstract class PassportEntryEditorComposite extends Composite {
	@Inject
	@Optional
	@Named(BTSCoreConstants.CORE_EXPRESSION_MAY_EDIT)
	protected boolean userMayEdit;
	
	
	@Inject
	@Preference(value = "locale_lang", nodePath = "org.bbaw.bts.app")
	private String lang;
	
	// get UISynchronize injected as field
	@Inject
	private UISynchronize sync;


	public PassportEntryEditorComposite(Composite parent, int style) {
		super(parent, style);
		// TODO Auto-generated constructor stub
	}

	protected List<BTSPassportEntry> findMatchingEntries(
			BTSPassportEntry parentEntryGroup, BTSConfigItem groupConfig,
			BTSPassportEntry grandParentEntry, BTSPassport passport,
			boolean makeDefault, String entryType) {
		Assert.isNotNull(parentEntryGroup);
		Assert.isNotNull(groupConfig);

		List<BTSPassportEntry> entries = new Vector<BTSPassportEntry>();
		for (BTSPassportEntry group : parentEntryGroup.getChildren()) {
			if (group.getType() != null
					&& group.getType().equals(groupConfig.getValue())) {
				entries.add(group);
			}
		}
		if (makeDefault && entries.isEmpty()) {
		BTSPassportEntry entry = checkAndMakeDefaultInput(entries, 0,
					entryType, parentEntryGroup,
					passport, groupConfig);
			entries.add(entry);
		}
		return entries;
	}

	protected BTSPassportEntry checkAndMakeDefaultInput(
			List<BTSPassportEntry> localEntries, int i, String type,
			BTSPassportEntry parentEntry, BTSPassport passport,
			BTSConfigItem configItem) {
		BTSPassportEntry defaultInput = null;
		if (localEntries.isEmpty() || localEntries.size() <= 1) {
			if (BTSCoreConstants.PASSPORT_ENTRY_GROUP.equals(type)) {
				defaultInput = BtsCorpusModelFactory.eINSTANCE
						.createBTSPassportEntryGroup();
				defaultInput.setType(configItem.getValue());
				// make default input
				if (parentEntry != null) {
					parentEntry.getChildren().add(defaultInput);
				} else {
					passport.getChildren().add(defaultInput);
				}
			} else if (BTSCoreConstants.PASSPORT_ENTRY_ITEM.equals(type)) {
				defaultInput = BtsCorpusModelFactory.eINSTANCE
						.createBTSPassportEntryItem();
				defaultInput.setType(configItem.getValue());
				// make default input
				if (parentEntry != null) {
					parentEntry.getChildren().add(defaultInput);
				} else {
					passport.getChildren().add(defaultInput);
				}
			}
		} else {
			defaultInput = localEntries.get(i);
		}
		return defaultInput;
	}

	protected void forceResizeRelayout(Composite composite) {
		if (composite != null) {
			composite.layout();
			Point p = composite.getSize();
			composite.setSize(p.x, p.y + 1);
		}
	}
	
	@Inject
	@Optional
	public void setUserMayEdit(
			@Named(BTSCoreConstants.CORE_EXPRESSION_MAY_EDIT) final boolean userMayEdit) {
		if(userMayEdit != this.userMayEdit)
		{
			sync.asyncExec(new Runnable() {
				@Override
				public void run() {
					setUserMayEditInteral(userMayEdit);
				}
			});
		}
	}

	protected abstract void setUserMayEditInteral(boolean mayEdit);
	
	protected String getLabel(BTSConfigItem itemconfig) {
		String label = itemconfig.getLabel().getTranslation(lang);
		if (label != null)
		{
			return label;
		}
		else
		{
			return itemconfig.getValue();
		}
	}
}
