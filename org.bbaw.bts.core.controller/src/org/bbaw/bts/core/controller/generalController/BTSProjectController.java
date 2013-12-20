package org.bbaw.bts.core.controller.generalController;

import java.util.List;
import java.util.Set;

import org.bbaw.bts.btsmodel.BTSProject;

public interface BTSProjectController
{

	void createInitialProject();

	BTSProject createNewProject();

	boolean saveProject(BTSProject project);

	List<BTSProject> listProjects();

	boolean saveProjects(Set<BTSProject> dirtyProjects);

}