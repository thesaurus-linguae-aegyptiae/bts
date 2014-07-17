package org.bbaw.bts.core.corpus.controller.partController;

import java.util.List;

import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject;
import org.bbaw.bts.corpus.btsCorpusModel.BTSPassportEntry;

public interface PassportEditorPartController
{

	List<BTSPassportEntry> getProposalsFor(List<BTSPassportEntry> entryPath,
			String text);

	boolean save(BTSCorpusObject object);

}