package org.bbaw.bts.dao.couchDB.impl;

import java.util.List;
import java.util.Vector;

import org.bbaw.bts.btsmodel.UserActionCounter;
import org.bbaw.bts.core.dao.UserActionCounterDao;
import org.bbaw.bts.dao.couchDB.CouchDBDao;
import org.elasticsearch.ElasticsearchException;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.Client;
import org.elasticsearch.search.suggest.completion.CompletionSuggestionBuilder;

public class UserActionCounterDaoImpl extends
		CouchDBDao<UserActionCounter, String> implements
		UserActionCounterDao {

	private Client searchClient;

	@Override
	public List<UserActionCounter> autocomplete(String prefix,
			String indexName) {
		SearchResponse response = null;
		try {
			response = getSearchClient()
					.prepareSearch(indexName)
					.addSuggestion(
							new CompletionSuggestionBuilder("").field("code")
									.text(prefix).size(10)).execute()
					.actionGet();
		} catch (ElasticsearchException e) {
			e.printStackTrace();
		}
		List<UserActionCounter> counters = new Vector<UserActionCounter>();
		if (response != null) {
		while (response.getSuggest().iterator().hasNext()) {
			counters.add((UserActionCounter) response.getSuggest()
					.iterator().next());
		}
		}
		return counters;
	}

	private Client getSearchClient() {
		if (searchClient == null) {
			searchClient = connectionProvider.getSearchClient(Client.class);
		}
		return searchClient;
	}
}
