package org.bbaw.bts.core.dao.corpus;

import org.bbaw.bts.core.dao.GenericDao;
import org.bbaw.bts.corpus.btsCorpusModel.BTSText;

public interface BTSTextDao extends GenericDao<BTSText, String>
{

	boolean removeBTSText(BTSText btsText, String path);

}
