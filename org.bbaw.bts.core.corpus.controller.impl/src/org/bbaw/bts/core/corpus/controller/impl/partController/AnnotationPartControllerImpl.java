package org.bbaw.bts.core.corpus.controller.impl.partController;

import java.util.List;
import java.util.Map;
import java.util.Vector;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSComment;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.corpus.controller.partController.AnnotationPartController;
import org.bbaw.bts.core.services.BTSCommentService;
import org.bbaw.bts.core.services.corpus.CorpusObjectService;
import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject;
import org.bbaw.bts.searchModel.BTSQueryRequest;
import org.elasticsearch.index.query.QueryBuilders;

public class AnnotationPartControllerImpl implements AnnotationPartController {

	@Inject
	private CorpusObjectService corpusObjectService;
	
	@Inject
	private BTSCommentService commentService;
	
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
		query.setQueryBuilder(QueryBuilders.termQuery("relations.objectId",
				object.get_id()));
		query.setQueryId("relations.objectId-" + object.get_id());
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

}
