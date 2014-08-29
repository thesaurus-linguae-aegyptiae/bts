package org.bbaw.bts.core.dao.corpus;

import org.bbaw.bts.core.dao.GenericDao;
import org.bbaw.bts.corpus.btsCorpusModel.BTSTCObject;

public interface BTSTCObjectDao extends GenericDao<BTSTCObject, String>
{

	boolean removeBTSTCObject(BTSTCObject tcObject, String path);

}
