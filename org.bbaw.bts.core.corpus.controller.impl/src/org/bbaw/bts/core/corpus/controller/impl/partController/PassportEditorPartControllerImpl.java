package org.bbaw.bts.core.corpus.controller.impl.partController;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSCorpusObject;
import org.bbaw.bts.btsmodel.BTSPassportEntry;
import org.bbaw.bts.core.services.CorpusObjectService;
import org.bbaw.bts.searchModel.BTSQueryRequest;
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

	@Override
	public List<BTSPassportEntry> getProposalsFor(
			List<BTSPassportEntry> entryPath,
			String text) {
		String field = "passport";

		List<FilterBuilder> filters = new ArrayList<FilterBuilder>(
				entryPath.size());
		for (int i = 0; i < entryPath.size() - 1; i++) {
			field += ".children";
			filters.add(FilterBuilders.termFilter(new String(field + ".type"),
					entryPath.get(i).getType()));

		}
		String type = field + ".children.type";
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
		sqb.addField(field);
		query.setSearchRequestBuilder(sqb);
		query.setRequestField(field);
		query.setAutocompletePrefix(text);
		query.setRequestTypeFieldValue(entryPath.get(entryPath.size() - 1)
				.getType());

		List<BTSPassportEntry> proposals = corpusObjectService
				.getPassportEntryProposals(query);
		return proposals;
	}

	@Override
	public boolean save(BTSCorpusObject object) {
		return corpusObjectService.save(object);
	}
}
