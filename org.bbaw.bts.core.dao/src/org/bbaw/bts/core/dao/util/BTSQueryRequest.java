/**
 * This file is part of Berlin Text System.
 * 
 * The software Berlin Text System serves as a client user interface for working with
 * text corpus data. See: aaew.bbaw.de
 * 
 * The software Berlin Text System was developed at the Berlin-Brandenburg Academy
 * of Sciences and Humanities, Jägerstr. 22/23, D-10117 Berlin.
 * www.bbaw.de
 * 
 * Copyright (C) 2013-2015  Berlin-Brandenburg Academy
 * of Sciences and Humanities
 * 
 * The software Berlin Text System was developed by @author: Christoph Plutte.
 * 
 * Berlin Text System is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Berlin Text System is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with Berlin Text System.  
 * If not, see <http://www.gnu.org/licenses/lgpl-3.0.html>.
 */
package org.bbaw.bts.core.dao.util;

import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.Vector;

import org.apache.lucene.queryParser.QueryParser;
import org.bbaw.bts.btsmodel.BTSObject;
import org.elasticsearch.action.search.SearchRequestBuilder;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.index.query.SimpleQueryStringBuilder.Operator;

public class BTSQueryRequest {

	public enum BTSQueryType {
		GENERAL, LEMMA
	}

	private BTSQueryType type;

	private String queryId;

	private List<BTSObject> givenObjects;

	private QueryBuilder queryBuilder;

	private SearchRequestBuilder searchRequestBuilder;

	private Set<String> requestFields;
	
	private String searchString;

	private String autocompletePrefix;
	
	private String requestTypeFieldValue;
	
	private List<String> responseFields;
	
	private String dbPath;
	
	private boolean idQuery;
	
	private boolean wildcardQuery;
	
	public BTSQueryRequest() {
		this.requestFields = new HashSet<String>();
	}
	
	public BTSQueryRequest(String searchString) {
		this();
		this.searchString = searchString;
	}
	
	public BTSQueryRequest(String searchString, boolean idQuery, boolean wildcardQuery) {
		this(searchString);
		this.idQuery = idQuery;
		this.wildcardQuery = wildcardQuery;
	}
	
	/**
	 * Sets up a {@link QueryBuilder} according to current configuration. The result can be retrieved via {@link #getQueryBuilder()}.
	 * 
	 */
	public void initQueryBuilder() {
		if (searchString.length() > 0)
		{
			String escapedString = this.escapeSearchString().toLowerCase();
			Date now = Calendar.getInstance(Locale.getDefault()).getTime();
			this.setQueryId("timestamp-" + now.toString());
			if (idQuery)
			{
				// allows DAO to retrieve object directly from DB
				this.setIdQuery(true);
			}
			else if (!requestFields.isEmpty())
			{
				// "Search for Names only"
				BoolQueryBuilder qb = QueryBuilders.boolQuery();
				for (String field : requestFields)
					qb = qb.should(wildcardQuery ?
							QueryBuilders.wildcardQuery(field, escapedString) :
							QueryBuilders.matchQuery(field, escapedString)
							);
				this.setQueryBuilder(qb);
				this.setAutocompletePrefix(searchString);
			}
			else {
				this.setQueryBuilder(QueryBuilders.simpleQueryString(escapedString).defaultOperator(Operator.AND));
				this.setAutocompletePrefix(searchString);
			}
		}		
	}

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

	public Set<String> getRequestFields() {
		return requestFields;
	}

	public void addRequestField(String requestField) {
		this.requestFields.add(requestField);
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
	
	public BTSQueryType getType() {
		return type;
	}
	
	public void setType(BTSQueryType type) {
		this.type = type;
	}
	
	public String getSearchString() {
		return this.searchString;
	}
	
	public String escapeSearchString() {
		// Anführungszeichen und * nicht escapen!!!
		this.wildcardQuery = this.searchString.contains("*") || this.searchString.contains("?");
		String escapedString = QueryParser.escape(this.searchString);
		escapedString = escapedString.replaceAll("\\\\([\"*?])", "$1");
		System.out.println("\nresulting query string: "+escapedString);
		return escapedString;
	}

	public void setRequestTypeFieldValue(String requestTypeFieldValue) {
		this.requestTypeFieldValue = requestTypeFieldValue;
	}

	public String[] getResponseFields() {
		if (responseFields == null) return null;
		return responseFields.toArray(new String[responseFields.size()]);
	}

	public void setResponseFields(String[] responseFieldsArray) {
		if (responseFields == null) {
			responseFields = new Vector<String>();
		}
		this.responseFields.clear();
		if (responseFieldsArray != null) {
			for (String s : responseFieldsArray)
			{
				responseFields.add(s);
			}
		}
	}
	
	public void addResponseFields(String responseFieldName) {
		if (responseFields == null)
		{
			responseFields = new Vector<String>();
		}
		if (!responseFields.contains(responseFieldName))
		{
			responseFields.add(responseFieldName);
		}
	}

	public String getDbPath() {
		return dbPath;
	}

	public void setDbPath(String dbPath) {
		this.dbPath = dbPath;
	}

	public boolean isIdQuery() {
		return idQuery;
	}
	
	public boolean isWildcardQuery() {
		return wildcardQuery;
	}

	public void setIdQuery(boolean idQuery) {
		this.idQuery = idQuery;
	}
	
	public void setWildcardQuery(boolean wildcardQuery) {
		this.wildcardQuery = wildcardQuery;
	}

}
