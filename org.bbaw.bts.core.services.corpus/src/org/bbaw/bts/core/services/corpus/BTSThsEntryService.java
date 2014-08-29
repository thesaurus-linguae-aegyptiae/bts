package org.bbaw.bts.core.services.corpus;

import java.util.List;

import org.bbaw.bts.core.services.GenericObjectService;
import org.bbaw.bts.corpus.btsCorpusModel.BTSThsEntry;

public interface BTSThsEntryService extends
		GenericObjectService<BTSThsEntry, String> {

	List<BTSThsEntry> listRootEntries();

}
