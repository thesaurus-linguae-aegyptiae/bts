package org.bbaw.bts.core.corpus.controller.generalController;

import org.bbaw.bts.btsmodel.BTSDBBaseObject;

public interface CorpusCommandController {

	boolean save(BTSDBBaseObject object);

	boolean deleteFromDB(BTSDBBaseObject object);

}
