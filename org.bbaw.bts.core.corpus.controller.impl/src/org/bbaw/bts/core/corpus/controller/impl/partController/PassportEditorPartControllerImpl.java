package org.bbaw.bts.core.corpus.controller.impl.partController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Vector;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSConfigItem;
import org.bbaw.bts.btsmodel.BTSCorpusObject;
import org.bbaw.bts.btsmodel.BTSPassportEntry;
import org.bbaw.bts.btsmodel.ObjectTypePathEntry;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.services.BTSListEntryService;
import org.bbaw.bts.core.services.BTSThsEntryService;
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

	@Inject
	private BTSThsEntryService thsService;

	@Inject
	private BTSListEntryService listService;

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
//		String type = field + ".children.type";
		field += ".children";
		// TODO build es query
		BTSQueryRequest query = new BTSQueryRequest();
		QueryBuilder qb = QueryBuilders.prefixQuery(field + ".value", text);

		FilterBuilder[] filterArray = filters.toArray(new FilterBuilder[filters
				.size()]);

		SearchRequestBuilder sqb = corpusObjectService
				.getSearchRequestBuilder();
		sqb.setQuery(qb);
//		sqb.setSource("*.value");
		// sqb.setFilter(FilterBuilders.andFilter(filterArray));
//		sqb.setFilter(FilterBuilders.termFilter(type,
		// entryPath.get(entryPath.size() - 1).getType()));
//		sqb.addField(field + ".value");
		query.setSearchRequestBuilder(sqb);
		query.setRequestField(field + ".value");
		query.setAutocompletePrefix(text);
		query.setRequestTypeFieldValue(entryPath.get(entryPath.size() - 1)
				.getType());

		List<BTSPassportEntry> proposals = corpusObjectService
				.getPassportEntryProposals(query);
		System.out.println("Number of proposals: " + proposals.size() + ", prefix " + text);
		return proposals;
	}

	@Override
	public boolean save(BTSCorpusObject object) {
		return corpusObjectService.save(object);
	}

	@Override
	public List<BTSCorpusObject> getObjectProposalsFor(
			BTSConfigItem configItem, String text) {
		List<BTSCorpusObject> list = new Vector<BTSCorpusObject>();
		if (configItem != null && configItem.getOwnerTypesPath() != null) {
			boolean corpus = false;
			for (ObjectTypePathEntry pathEntry : configItem.getOwnerTypesPath()
					.getChildren()) {
				if (BTSConstants.THS_ENTRY.equals(pathEntry.getValue())) {
					// load
					BTSQueryRequest query = new BTSQueryRequest();
					QueryBuilder qb = QueryBuilders.termQuery("eClass",
							"http://btsmodel/1.0#//BTSThsEntry"); // prefixQuery("name",
																	// text);

					SearchRequestBuilder sqb = thsService
							.getSearchRequestBuilder();
					sqb.setQuery(qb);
					List<FilterBuilder> filters = makeFilterList(pathEntry);

					FilterBuilder[] filterArray = filters
							.toArray(new FilterBuilder[filters.size()]);
					sqb.setPostFilter(FilterBuilders.orFilter(filterArray));

					list.addAll((Collection<? extends BTSCorpusObject>) thsService
							.query(query, BTSConstants.OBJECT_STATE_ACITVE,
									false));
				} else if (BTSConstants.WLIST_ENTRY
						.equals(pathEntry.getValue())) {

				} else if (BTSConstants.TEXT_CORPUS
						.equals(pathEntry.getValue())) {

				} else if (!corpus) {
					BTSQueryRequest query = new BTSQueryRequest();
					QueryBuilder qb = QueryBuilders.prefixQuery("name", text);

					SearchRequestBuilder sqb = corpusObjectService
							.getSearchRequestBuilder();
					sqb.setQuery(qb);
					List<FilterBuilder> filters = makeFilterList(pathEntry);

					FilterBuilder[] filterArray = filters
							.toArray(new FilterBuilder[filters.size()]);
					sqb.setPostFilter(FilterBuilders.orFilter(filterArray));

					list.addAll((Collection<? extends BTSCorpusObject>) corpusObjectService
							.query(query, BTSConstants.OBJECT_STATE_ACITVE,
									false));
					corpus = true;
				}
			}
		}

		return list;
	}

	private List<FilterBuilder> makeFilterList(ObjectTypePathEntry pathEntry) {

		List<FilterBuilder> filters = new ArrayList<FilterBuilder>();
		for (int i = 0; i < pathEntry.getChildren().size() - 1; i++) {
			ObjectTypePathEntry child = pathEntry.getChildren().get(i);
			filters.add(FilterBuilders.termFilter(new String("type"),
					child.getValue()));
			for (int j = 0; j < child.getChildren().size() - 1; j++) {
				ObjectTypePathEntry grandchild = child.getChildren().get(j);
				filters.add(FilterBuilders.termFilter(new String("subtype"),
						grandchild.getValue()));

			}

		}
		return filters;


	}
}
