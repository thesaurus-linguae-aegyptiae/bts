package org.bbaw.bts.core.remote.dao;

import org.bbaw.bts.btsmodel.BTSProject;
import org.bbaw.bts.btsmodel.BTSProjectDBCollection;

public interface RemoteBTSProjectDao extends RemoteGenericDao<BTSProject, String>
{
	boolean removeBTSProject(BTSProject btsProject);

	void addAuthorisation(BTSProjectDBCollection coll, String path);
}
