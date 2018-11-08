package org.bbaw.bts.core.corpus.controller.impl.partController;

import java.util.List;
import java.util.Vector;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.corpus.controller.partController.RelatedObjectsController;
import org.bbaw.bts.core.dao.util.BTSQueryRequest;
import org.bbaw.bts.core.services.BTSCommentService;
import org.bbaw.bts.core.services.corpus.CorpusObjectService;
import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.elasticsearch.index.query.QueryBuilders;

public class RelatedObjectsControllerImpl implements RelatedObjectsController {

	@Inject
	protected CorpusObjectService corpusObjectService;

	@Inject
	protected BTSCommentService commentService;

	@Override
	public BTSQueryRequest getRelatingObjectsQuery(BTSObject subject) {
		BTSQueryRequest query = new BTSQueryRequest();
		query.setQueryBuilder(QueryBuilders.matchQuery("relations.objectId",
				subject.get_id()));
		return query;
	}
	
	@Override
	public List<BTSObject> getRelatingObjects(BTSObject subject, IProgressMonitor monitor) {
		BTSQueryRequest query = getRelatingObjectsQuery(subject);
		query.setQueryId("relations.objectId-" + subject.get_id());
		List<BTSObject> children = new Vector<BTSObject>();
		children.addAll(
				corpusObjectService.query(query,
				BTSConstants.OBJECT_STATE_ACTIVE, monitor)
				);
		if (monitor != null) {
			if (monitor.isCanceled()) return children;
			monitor.beginTask("Load comments", IProgressMonitor.UNKNOWN);
		}
		children.addAll(commentService.query(query, BTSConstants.OBJECT_STATE_ACTIVE, true, monitor));
		return children;
	}

}
