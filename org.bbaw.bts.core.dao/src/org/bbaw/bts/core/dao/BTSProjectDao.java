package org.bbaw.bts.core.dao;

import org.bbaw.bts.btsmodel.BTSProject;
import org.bbaw.bts.btsmodel.BTSProjectDBCollection;

public interface BTSProjectDao extends GenericDao<BTSProject, String>
{
	boolean removeBTSProject(BTSProject btsProject);

	void addAuthorisation(BTSProjectDBCollection coll, String prefix);
}
