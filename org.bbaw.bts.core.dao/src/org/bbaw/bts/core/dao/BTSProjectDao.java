package org.bbaw.bts.core.dao;

import org.bbaw.bts.btsmodel.BTSProject;

public interface BTSProjectDao extends GenericDao<BTSProject, String>
{
	boolean removeBTSProject(BTSProject btsProject);
}
