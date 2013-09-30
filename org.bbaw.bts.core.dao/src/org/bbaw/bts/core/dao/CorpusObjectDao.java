package org.bbaw.bts.core.dao;

import java.util.Collection;
import java.util.List;

import org.bbaw.bts.btsmodel.BTSCorpusObject;

public interface CorpusObjectDao extends GenericDao<BTSCorpusObject, String>
{

	List<BTSCorpusObject> getRootBTSCorpusObjects(String path);

	Collection<? extends BTSCorpusObject> find(String path, String searchId, List<String> parameter);
}
