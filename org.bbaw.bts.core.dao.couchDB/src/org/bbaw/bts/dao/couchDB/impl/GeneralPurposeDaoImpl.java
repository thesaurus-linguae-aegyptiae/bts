package org.bbaw.bts.dao.couchDB.impl;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.dao.GeneralPurposeDao;
import org.bbaw.bts.searchModel.BTSQueryRequest;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.action.search.SearchType;
import org.elasticsearch.client.Client;
import org.elasticsearch.search.SearchHit;
import org.lightcouch.CouchDbClient;

public class GeneralPurposeDaoImpl extends CouchDBDao<BTSDBBaseObject, String> implements GeneralPurposeDao
{

	@Override
	public List<SearchHit> queryNonBTSObjects(BTSQueryRequest query,
			String indexName, String indexType) {
		if (query.getSearchRequestBuilder() == null) {
			SearchResponse response = connectionProvider
					.getSearchClient(Client.class)
					.prepareSearch(indexName)
					.setTypes(indexType)
					.setSearchType(SearchType.QUERY_AND_FETCH)
					.setQuery(query.getQueryBuilder())
					.setFrom(0).setSize(60).setExplain(true).execute()
					.actionGet();
			List<SearchHit> result = new Vector<SearchHit>();
			for (SearchHit hit : response.getHits()) {
				result.add(hit);
			}

			return result;
		} else {
			SearchResponse response = query.getSearchRequestBuilder()
					.setIndices(indexName).setTypes(indexType)
					.setSearchType(SearchType.QUERY_AND_FETCH).execute()
					.actionGet();
			List<SearchHit> result = new Vector<SearchHit>();
			for (SearchHit hit : response.getHits()) {
				result.add(hit);
			}

			return result;
		}
	}

}
