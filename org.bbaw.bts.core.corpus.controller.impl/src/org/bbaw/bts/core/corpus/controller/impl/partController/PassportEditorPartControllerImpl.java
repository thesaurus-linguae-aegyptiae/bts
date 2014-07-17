package org.bbaw.bts.core.corpus.controller.impl.partController;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

import org.bbaw.bts.core.services.corpus.CorpusObjectService;
import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject;
import org.bbaw.bts.corpus.btsCorpusModel.BTSPassportEntry;
import org.bbaw.bts.searchModel.BTSQueryRequest;
import org.eclipse.e4.core.services.log.Logger;
import org.elasticsearch.action.search.SearchRequestBuilder;
import org.elasticsearch.index.query.FilterBuilder;
import org.elasticsearch.index.query.FilterBuilders;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;

public class PassportEditorPartControllerImpl
		implements
		org.bbaw.bts.core.corpus.controller.partController.PassportEditorPartController {
	@Inject
	private CorpusObjectService corpusObjectService;

	
	@Inject
	private Logger logger;

	@Override
	public List<BTSPassportEntry> getProposalsFor(
			List<BTSPassportEntry> entryPath,
			String text) {
		String field = "passport";
		if (text == null)
		{
			text = "";
		}

		List<FilterBuilder> filters = new ArrayList<FilterBuilder>(
				entryPath.size());
		for (int i = 0; i < entryPath.size() - 1; i++) {
			field += ".children";
			filters.add(FilterBuilders.termFilter(new String(field + ".type"),
					entryPath.get(i).getType()));

		}
		field += ".children";
		// TODO build es query
		BTSQueryRequest query = new BTSQueryRequest();
		QueryBuilder qb = QueryBuilders.prefixQuery(field + ".value", text);

		FilterBuilder[] filterArray = filters.toArray(new FilterBuilder[filters
				.size()]);

		SearchRequestBuilder sqb = corpusObjectService
				.getSearchRequestBuilder();
		sqb.setQuery(qb);
		// sqb.setFilter(FilterBuilders.andFilter(filterArray));
//		sqb.setFilter(FilterBuilders.termFilter(type,
		// entryPath.get(entryPath.size() - 1).getType()));
		sqb.setFetchSource(field, null);

		query.setSearchRequestBuilder(sqb);
		query.setRequestField(field);
		query.setAutocompletePrefix(text);
		query.setRequestTypeFieldValue(entryPath.get(entryPath.size() - 1)
				.getType());

		List<BTSPassportEntry> proposals = corpusObjectService
				.getPassportEntryProposals(query);
		logger.info("Searching proposals: " + query.getSearchRequestBuilder().toString());
		logger.info("Number of proposals: " + proposals.size() + ", prefix " + text);
		return proposals;
	}

	@Override
	public boolean save(BTSCorpusObject object) {
		return corpusObjectService.save(object);
	}

	

	
}
