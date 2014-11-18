package org.bbaw.bts.core.corpus.controller.impl.partController;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.bbaw.bts.core.commons.filter.BTSFilter;
import org.bbaw.bts.core.corpus.controller.partController.ThsNavigatorController;
import org.bbaw.bts.core.services.corpus.BTSThsEntryService;
import org.bbaw.bts.corpus.btsCorpusModel.BTSThsEntry;
import org.bbaw.bts.searchModel.BTSQueryRequest;
import org.eclipse.core.runtime.IProgressMonitor;

public class ThsNavigatorControllerImpl extends AbstractCorpusObjectNavigatorControllerImpl<BTSThsEntry, String> 
implements ThsNavigatorController {

	@Inject
	private BTSThsEntryService thsService;
	
	@Override
	protected List<BTSThsEntry> retrieveTypedRootEntries(IProgressMonitor monitor) {
		return thsService.listRootEntries(monitor);
	}

	@Override
	protected List<BTSThsEntry> executeTypedQuery(BTSQueryRequest query,
			String objectState, IProgressMonitor monitor) {
		return thsService.query(query, objectState, monitor);
	}

	@Override
	protected BTSThsEntry typedCreateNew() {
		return thsService.createNew();
	}

	@Override
	protected List<BTSThsEntry> typedListEntries(String objectState, IProgressMonitor monitor) {
		return thsService.list(objectState, monitor);
	}

	@Override
	protected List<BTSThsEntry> retrieveTypedOrphandEntries(Map map,
			List<BTSFilter> btsFilters, IProgressMonitor monitor) {
		return thsService.getOrphanEntries(map, btsFilters, monitor);
	}

	@Override
	public BTSThsEntry find(String id, IProgressMonitor monitor) {
		return thsService.find(id, monitor);
	}



}
