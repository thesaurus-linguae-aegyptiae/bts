package org.bbaw.bts.core.dao;

import org.bbaw.bts.btsmodel.BTSTextCorpus;

public interface BTSTextCorpusDao extends GenericDao<BTSTextCorpus, String>
{

	boolean removeBTSTextCorpus(BTSTextCorpus textCorpus, String path);

}
