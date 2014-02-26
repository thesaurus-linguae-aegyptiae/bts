package org.bbaw.bts.ui.corpus.parts.passportEditor;

import java.util.List;
import java.util.Vector;

import org.bbaw.bts.btsmodel.BTSConfigItem;
import org.bbaw.bts.btsmodel.BTSPassport;
import org.bbaw.bts.btsmodel.BTSPassportEntry;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.eclipse.core.runtime.Assert;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;

public class PassportEntryEditorComposite extends Composite {

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
				defaultInput = BtsmodelFactory.eINSTANCE
						.createBTSPassportEntryGroup();
				defaultInput.setType(configItem.getValue());
				// make default input
				if (parentEntry != null) {
					parentEntry.getChildren().add(defaultInput);
				} else {
					passport.getChildren().add(defaultInput);
				}
			} else if (BTSCoreConstants.PASSPORT_ENTRY_ITEM.equals(type)) {
				defaultInput = BtsmodelFactory.eINSTANCE
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
}
