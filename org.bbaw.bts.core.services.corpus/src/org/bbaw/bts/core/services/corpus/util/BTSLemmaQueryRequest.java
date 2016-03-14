package org.bbaw.bts.core.services.corpus.util;

import java.util.Arrays;

import org.bbaw.bts.core.dao.util.BTSQueryRequest;

public class BTSLemmaQueryRequest extends BTSQueryRequest {
	
	public BTSLemmaQueryRequest(String chars) {
		super(chars);
	}
	
	public BTSLemmaQueryRequest(BTSQueryRequest base) {
		super();
		this.searchString = base.getSearchString();
		this.searchRequestBuilder = base.getSearchRequestBuilder();
		this.queryBuilder = base.getQueryBuilder();
		if (base.getResponseFields() != null)
			this.responseFields = Arrays.asList(base.getResponseFields());
		this.autocompletePrefix = base.getAutocompletePrefix();
		this.idQuery = base.isIdQuery();
		this.wildcardQuery = base.isWildcardQuery();
	}

	
	@Override
	public void initQueryBuilder() {
		super.initQueryBuilder();
	}
	
}
