package org.bbaw.bts.core.dao;

import java.util.List;

import org.bbaw.bts.btsmodel.BTSCorpusObject;

public interface CorpusObjectDao extends GenericDao<BTSCorpusObject, String>
{

	List<BTSCorpusObject> getRootBTSCorpusObjects(String path);

}
