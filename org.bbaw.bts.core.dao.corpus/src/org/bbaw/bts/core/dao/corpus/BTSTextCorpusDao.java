package org.bbaw.bts.core.dao.corpus;

import org.bbaw.bts.core.dao.GenericDao;
import org.bbaw.bts.corpus.btsCorpusModel.BTSTextCorpus;

public interface BTSTextCorpusDao extends GenericDao<BTSTextCorpus, String>
{

	boolean removeBTSTextCorpus(BTSTextCorpus textCorpus, String path);

}
