package org.bbaw.bts.searchModel;

import java.util.List;

import org.bbaw.bts.btsmodel.BTSObject;
import org.elasticsearch.action.search.SearchRequestBuilder;
import org.elasticsearch.index.query.QueryBuilder;

public class BTSQueryRequest
{
	private String queryId;

	private List<BTSObject> givenObjects;

	private QueryBuilder queryBuilder;

	private SearchRequestBuilder searchRequestBuilder;

	private String requestField;

	private String autocompletePrefix;

	private String requestTypeFieldValue;

	public List<BTSObject> getGivenObjects()
	{
		return givenObjects;
	}

	public void setGivenObjects(List<BTSObject> givenObjects)
	{
		this.givenObjects = givenObjects;
	}

	public QueryBuilder getQueryBuilder()
	{
		return queryBuilder;
	}

	public void setQueryBuilder(QueryBuilder queryBuilder)
	{
		this.queryBuilder = queryBuilder;
	}

	/**
	 * @return the queryId
	 */
	public String getQueryId()
	{
		return queryId;
	}

	/**
	 * @param queryId
	 *            the queryId to set
	 */
	public void setQueryId(String queryId)
	{
		this.queryId = queryId;
	}

	public SearchRequestBuilder getSearchRequestBuilder() {
		return searchRequestBuilder;
	}

	public void setSearchRequestBuilder(
			SearchRequestBuilder searchRequestBuilder) {
		this.searchRequestBuilder = searchRequestBuilder;
	}

	public String getRequestField() {
		return requestField;
	}

	public void setRequestField(String requestField) {
		this.requestField = requestField;
	}

	public String getAutocompletePrefix() {
		return autocompletePrefix;
	}

	public void setAutocompletePrefix(String autocompletePrefix) {
		this.autocompletePrefix = autocompletePrefix;
	}

	public String getRequestTypeFieldValue() {
		return requestTypeFieldValue;
	}

	public void setRequestTypeFieldValue(String requestTypeFieldValue) {
		this.requestTypeFieldValue = requestTypeFieldValue;
	}

}
