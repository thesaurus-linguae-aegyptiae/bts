package org.bbaw.bts.core.corpus.controller.impl.partController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.Vector;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSConfigItem;
import org.bbaw.bts.btsmodel.BTSCorpusObject;
import org.bbaw.bts.btsmodel.BTSPassportEntry;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.controller.generalController.BTSConfigurationController;
import org.bbaw.bts.core.services.BTSListEntryService;
import org.bbaw.bts.core.services.BTSThsEntryService;
import org.bbaw.bts.core.services.CorpusObjectService;
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
	private BTSThsEntryService thsService;

	@Inject
	private BTSListEntryService listService;
	
	@Inject
	private BTSConfigurationController configurationController;
	
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

	@Override
	public List<BTSCorpusObject> getObjectProposalsFor(
			BTSConfigItem configItem, String text, BTSCorpusObject object) {
		List<BTSCorpusObject> list = new Vector<BTSCorpusObject>();
		
		//FIXME aktualisieren und auf map umstellen
		
		if (configItem != null && !configItem.getOwnerTypesMap().isEmpty()) {
			boolean corpus = false;

				if (configurationController.objectMayReferenceToThs(object, configItem)) {
					// load
					BTSQueryRequest query = new BTSQueryRequest();
					QueryBuilder qb = QueryBuilders.termQuery("eClass",
							"http://btsmodel/1.0#//BTSThsEntry"); // prefixQuery("name",
																	// text);

					SearchRequestBuilder sqb = thsService
							.getSearchRequestBuilder();
					sqb.setQuery(qb);
					List<FilterBuilder> filters = makeFilterList(configItem, object);

					FilterBuilder[] filterArray = filters
							.toArray(new FilterBuilder[filters.size()]);
					sqb.setPostFilter(FilterBuilders.orFilter(filterArray));

					list.addAll((Collection<? extends BTSCorpusObject>) thsService
							.query(query, BTSConstants.OBJECT_STATE_ACTIVE,
									false));
				} else if (configurationController.objectMayReferenceToWList(object, configItem)) {

				} else if (configurationController.objectMayReferenceToCorpus(object, configItem)) {
					BTSQueryRequest query = new BTSQueryRequest();
					QueryBuilder qb = QueryBuilders.prefixQuery("name", text);

					SearchRequestBuilder sqb = corpusObjectService
							.getSearchRequestBuilder();
					sqb.setQuery(qb);
					List<FilterBuilder> filters = makeFilterList(configItem, object);

					FilterBuilder[] filterArray = filters
							.toArray(new FilterBuilder[filters.size()]);
					sqb.setPostFilter(FilterBuilders.orFilter(filterArray));

					list.addAll((Collection<? extends BTSCorpusObject>) corpusObjectService
							.query(query, BTSConstants.OBJECT_STATE_ACTIVE,
									false));
					corpus = true;
				} else if (!corpus) {
					BTSQueryRequest query = new BTSQueryRequest();
					QueryBuilder qb = QueryBuilders.prefixQuery("name", text);

					SearchRequestBuilder sqb = corpusObjectService
							.getSearchRequestBuilder();
					sqb.setQuery(qb);


					list.addAll((Collection<? extends BTSCorpusObject>) corpusObjectService
							.query(query, BTSConstants.OBJECT_STATE_ACTIVE,
									false));
					corpus = true;
				
			}
		}

		return list;
	}

	private List<FilterBuilder> makeFilterList(BTSConfigItem configItem, BTSCorpusObject object) {

		Set<String> referenceTypes = configurationController.getReferenceTypesSet(object, configItem);
		
		List<FilterBuilder> filters = new ArrayList<FilterBuilder>();
		for (String ref : referenceTypes) {
			if (ref.contains(BTSConstants.OWNER_REFERENCED_TYPES_PATH_SEPERATOR)) {
				String[] split = ref.split("\\.");
				if (split.length == 2) {
					filters.add(FilterBuilders.termFilter(new String("type"),
							ref));
				} else if (split.length == 3) {
					filters.add(FilterBuilders.termFilter(
							new String("subtype"), ref));
				}

			}

		}
		return filters;

	}
}
