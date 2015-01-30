package org.bbaw.bts.core.corpus.controller.impl.generalController;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSComment;
import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.core.corpus.controller.generalController.CorpusCommandController;
import org.bbaw.bts.core.services.BTSCommentService;
import org.bbaw.bts.core.services.corpus.CorpusObjectService;
import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject;

public class CorpusCommandControllerImpl implements CorpusCommandController {

	@Inject
	private CorpusObjectService corpusObjectService;
	
	@Inject
	private BTSCommentService commentService;

	@Override
	public boolean save(BTSDBBaseObject object) {
		if (object instanceof BTSCorpusObject) {
			return corpusObjectService.save((BTSCorpusObject) object);
		}
		else if (object instanceof BTSComment) {
			return commentService.save((BTSComment) object);
		}
		return false;

	}

	@Override
	public boolean deleteFromDB(BTSDBBaseObject object) {
		if (object instanceof BTSCorpusObject) {
			corpusObjectService.remove((BTSCorpusObject) object);
			return true;
		}if (object instanceof BTSComment) {
			commentService.remove((BTSComment) object);
			return true;
		}
		return false;

	}

}
