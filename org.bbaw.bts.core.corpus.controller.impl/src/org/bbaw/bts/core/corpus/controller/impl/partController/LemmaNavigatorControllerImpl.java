package org.bbaw.bts.core.corpus.controller.impl.partController;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.bbaw.bts.core.commons.filter.BTSFilter;
import org.bbaw.bts.core.corpus.controller.partController.LemmaNavigatorController;
import org.bbaw.bts.core.services.corpus.BTSLemmaEntryService;
import org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaEntry;
import org.bbaw.bts.searchModel.BTSQueryRequest;

public class LemmaNavigatorControllerImpl extends AbstractCorpusObjectNavigatorControllerImpl<BTSLemmaEntry, String> 
implements LemmaNavigatorController{

	@Inject
	private BTSLemmaEntryService lemmaService;
	
	@Override
	protected List<BTSLemmaEntry> retrieveTypedRootEntries() {
		return lemmaService.listRootEntries();
	}

	@Override
	protected List<BTSLemmaEntry> executeTypedQuery(BTSQueryRequest query, String objectState) {
		return lemmaService.query(query, objectState);
	}

	@Override
	protected BTSLemmaEntry typedCreateNew() {
		return lemmaService.createNew();
	}

	@Override
	protected List<BTSLemmaEntry> typedListEntries(String objectState) {
		return lemmaService.list(objectState);
	}

	@Override
	protected List<BTSLemmaEntry> retrieveTypedOrphandEntries(Map map,
			List<BTSFilter> btsFilters) {
		return lemmaService.getOrphanEntries(map, btsFilters);
	}

	@Override
	protected BTSLemmaEntry typedFind(String id) {
		return lemmaService.find(id);
	}


}
