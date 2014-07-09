package org.bbaw.bts.core.corpus.controller.partController;

import java.util.List;

import org.bbaw.bts.btsmodel.BTSConfigItem;
import org.bbaw.bts.btsmodel.BTSCorpusObject;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.BTSPassportEntry;

public interface PassportEditorPartController
{

	List<BTSPassportEntry> getProposalsFor(List<BTSPassportEntry> entryPath,
			String text);

	List<BTSCorpusObject> getObjectProposalsFor(BTSConfigItem configItem,
			String text, BTSObject object);

	boolean save(BTSCorpusObject object);

}