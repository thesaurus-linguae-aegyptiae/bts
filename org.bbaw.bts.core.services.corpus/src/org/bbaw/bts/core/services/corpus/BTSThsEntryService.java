package org.bbaw.bts.core.services.corpus;

import java.util.List;
import java.util.Map;

import org.bbaw.bts.core.commons.filter.BTSFilter;
import org.bbaw.bts.core.services.GenericObjectService;
import org.bbaw.bts.corpus.btsCorpusModel.BTSThsEntry;

public interface BTSThsEntryService extends
		GenericObjectService<BTSThsEntry, String> {

	List<BTSThsEntry> listRootEntries();

	List<BTSThsEntry> getOrphanThsEntries(Map map, List<BTSFilter> btsFilters);

}
