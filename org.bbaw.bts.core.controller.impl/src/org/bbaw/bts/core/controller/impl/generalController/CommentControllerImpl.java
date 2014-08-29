package org.bbaw.bts.core.controller.impl.generalController;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSComment;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.core.controller.generalController.CommentController;
import org.bbaw.bts.core.services.BTSCommentService;

public class CommentControllerImpl implements CommentController{

	@Inject
	private BTSCommentService commentService;
	
	@Override
	public BTSComment createComment(BTSObject commentedObject) {
		return commentService.createNewRelationPartOf(commentedObject);
	}

	@Override
	public boolean save(BTSComment comment) {
		return commentService.save(comment);
	}

}
