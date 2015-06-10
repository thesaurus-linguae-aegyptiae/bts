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
package org.bbaw.bts.searchModel;

import java.util.List;
import java.util.Vector;

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
	
	private List<String> responseFields;
	
	private String dbPath;
	
	private boolean idQuery;
	
	private String idString;

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

	public String[] getResponseFields() {
		if (responseFields == null) return null;
		return responseFields.toArray(new String[responseFields.size()]);
	}

	public void setResponseFields(String[] responseFieldsArray) {
		this.responseFields = new Vector<String>();
		for (String s : responseFieldsArray)
		{
			responseFields.add(s);
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

	public void setIdQuery(boolean idQuery) {
		this.idQuery = idQuery;
	}

	public String getIdString() {
		return idString;
	}

	public void setIdString(String idString) {
		this.idString = idString;
	}


}
