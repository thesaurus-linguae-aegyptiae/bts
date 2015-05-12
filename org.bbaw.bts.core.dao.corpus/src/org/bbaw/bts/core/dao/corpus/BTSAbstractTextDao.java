package org.bbaw.bts.core.dao.corpus;

import org.bbaw.bts.core.dao.GenericDao;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAbstractText;


public interface BTSAbstractTextDao extends GenericDao<BTSAbstractText, String>
{

	boolean removeBTSAbstractText(BTSAbstractText abstractText, String path);

}
