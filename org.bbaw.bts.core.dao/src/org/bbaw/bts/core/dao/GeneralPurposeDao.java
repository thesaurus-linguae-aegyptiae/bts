package org.bbaw.bts.core.dao;

import java.util.List;

import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.searchModel.BTSQueryRequest;
import org.elasticsearch.search.SearchHit;

public interface GeneralPurposeDao extends GenericDao<BTSDBBaseObject, String>
{
	List<SearchHit> queryNonBTSObjects(BTSQueryRequest query, String indexName,
			String indexType);
}
