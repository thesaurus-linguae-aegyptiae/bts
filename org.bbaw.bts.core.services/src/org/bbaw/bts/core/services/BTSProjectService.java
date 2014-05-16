package org.bbaw.bts.core.services;

import java.util.List;

import org.bbaw.bts.btsmodel.BTSProject;
import org.bbaw.bts.btsmodel.BTSProjectDBCollection;

public interface BTSProjectService extends GenericObjectService<BTSProject, String>
{

	List<BTSProject> listRemoteProjects();

	BTSProject findByProjectPrefix(String project);

	BTSProjectDBCollection checkAndAddDBCollection(BTSProject project, String corpusPrefix,
			boolean b, boolean synchronizeCorpus);

}
