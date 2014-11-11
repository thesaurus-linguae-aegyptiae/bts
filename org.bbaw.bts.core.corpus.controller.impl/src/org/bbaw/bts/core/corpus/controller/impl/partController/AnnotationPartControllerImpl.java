package org.bbaw.bts.core.corpus.controller.impl.partController;

import java.util.List;
import java.util.Map;
import java.util.Vector;

import javax.inject.Inject;
import javax.inject.Named;

import org.bbaw.bts.btsmodel.BTSComment;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.commons.corpus.BTSCorpusConstants;
import org.bbaw.bts.core.corpus.controller.partController.AnnotationPartController;
import org.bbaw.bts.core.services.BTSCommentService;
import org.bbaw.bts.core.services.corpus.CorpusObjectService;
import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject;
import org.bbaw.bts.searchModel.BTSQueryRequest;
import org.eclipse.e4.core.di.annotations.Optional;
import org.elasticsearch.index.query.QueryBuilders;

public class AnnotationPartControllerImpl implements AnnotationPartController {

	@Inject
	private CorpusObjectService corpusObjectService;
	
	@Inject
	private BTSCommentService commentService;

	@Inject
	@Named(BTSCoreConstants.CURRENT_DB_COLLECTION_CONTEXT)
	@Optional
	private String dbcollectionContext;
	
	@Override
	public void save(BTSObject object) {
		if (object instanceof BTSCorpusObject)
		{
			corpusObjectService.save((BTSCorpusObject) object);
		}
		else if (object instanceof BTSComment)
		{
			commentService.save((BTSComment) object);
		}
		
		
	}

	@Override
	public List<BTSObject> findRelatingObjects(BTSObject object) {
		BTSQueryRequest query = new BTSQueryRequest();
		query.setQueryBuilder(QueryBuilders.matchQuery("relations.objectId",
				object.get_id()));
		query.setQueryId("relations.objectId-" + object.get_id());
//		query.setResponseFields(BTSConstants.SEARCH_BASIC_RESPONSE_FIELDS);
		
		// set current dbcollection context
		query.setDbPath(dbcollectionContext);
		
		System.out.println(query.getQueryId());
		List<BTSObject> children = new Vector<BTSObject>();
		List<BTSCorpusObject> obs = corpusObjectService.query(query,
				BTSConstants.OBJECT_STATE_ACTIVE);
		for (BTSCorpusObject o : obs)
		{
			children.add(o);
		}
		children.addAll(commentService.query(query, BTSConstants.OBJECT_STATE_ACTIVE, true));
		return children;
	}
	@Override
	public boolean checkAndFullyLoad(BTSCorpusObject object)
	{
		return corpusObjectService.checkAndFullyLoad(object);
	}
}
