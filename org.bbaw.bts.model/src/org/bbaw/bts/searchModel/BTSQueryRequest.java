package org.bbaw.bts.searchModel;

import java.util.List;

import org.bbaw.bts.btsmodel.BTSCorpusObject;
import org.elasticsearch.index.query.QueryBuilder;

public class BTSQueryRequest
{
	private String queryId;

	private List<BTSCorpusObject> givenObjects;

	private QueryBuilder queryBuilder;

	public List<BTSCorpusObject> getGivenObjects()
	{
		return givenObjects;
	}

	public void setGivenObjects(List<BTSCorpusObject> givenObjects)
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

}
