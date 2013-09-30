package org.bbaw.bts.core.services;

import java.util.List;

import org.bbaw.bts.btsmodel.BTSCorpusObject;

public interface CorpusObjectService extends GenericObjectService<BTSCorpusObject, String>
{

	List<BTSCorpusObject> getRootBTSCorpusObjects();

	List<BTSCorpusObject> find(String searchId, List<String> parameter);

	void loadChildren(BTSCorpusObject parent);

}
