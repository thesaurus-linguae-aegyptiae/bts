package org.bbaw.bts.core.corpus.controller.impl.partController;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.bbaw.bts.core.commons.filter.BTSFilter;
import org.bbaw.bts.core.corpus.controller.partController.ThsNavigatorController;
import org.bbaw.bts.core.services.corpus.BTSThsEntryService;
import org.bbaw.bts.corpus.btsCorpusModel.BTSThsEntry;
import org.bbaw.bts.searchModel.BTSQueryRequest;

public class ThsNavigatorControllerImpl extends AbstractCorpusObjectNavigatorControllerImpl<BTSThsEntry, String> 
implements ThsNavigatorController {

	@Inject
	private BTSThsEntryService thsService;
	
	@Override
	protected List<BTSThsEntry> retrieveTypedRootEntries() {
		return thsService.listRootEntries();
	}

	@Override
	protected List<BTSThsEntry> executeTypedQuery(BTSQueryRequest query,
			String objectState) {
		return thsService.query(query, objectState);
	}

	@Override
	protected BTSThsEntry typedCreateNew() {
		return thsService.createNew();
	}

	@Override
	protected List<BTSThsEntry> typedListEntries(String objectState) {
		return thsService.list(objectState);
	}

	@Override
	protected List<BTSThsEntry> retrieveTypedOrphandEntries(Map map,
			List<BTSFilter> btsFilters) {
		return thsService.getOrphanEntries(map, btsFilters);
	}

	@Override
	public BTSThsEntry find(String id) {
		return thsService.find(id);
	}



}
