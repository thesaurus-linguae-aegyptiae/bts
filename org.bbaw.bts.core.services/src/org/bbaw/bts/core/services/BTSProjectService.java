package org.bbaw.bts.core.services;

import java.util.List;

import org.bbaw.bts.btsmodel.BTSProject;

public interface BTSProjectService extends GenericObjectService<BTSProject, String>
{

	List<BTSProject> listRemoteProjects(String url, String user, String password);

}
