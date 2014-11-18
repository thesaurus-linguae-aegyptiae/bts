package org.bbaw.bts.core.controller.impl.generalController;

import java.util.List;
import java.util.Set;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSProject;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.controller.generalController.BTSProjectController;
import org.bbaw.bts.core.services.BTSProjectService;
import org.eclipse.core.runtime.IProgressMonitor;

public class BTSProjectControllerImpl implements BTSProjectController
{

	@Inject
	private BTSProjectService projectService;


	@Override
	public BTSProject createNewProject()
	{
		return projectService.createNew();
	}

	@Override
	public boolean saveProject(BTSProject project)
	{
		return projectService.save(project);
	}

	@Override
	public List<BTSProject> listProjects(IProgressMonitor monitor)
	{
		return projectService.list(BTSConstants.OBJECT_STATE_ACTIVE, monitor);
	}

	@Override
	public boolean saveProjects(Set<BTSProject> dirtyProjects)
	{
		return projectService.saveMultiple(dirtyProjects);
	}

	@Override
	public BTSProject findProjectByProjectPrefix(String project) {
		return projectService.findByProjectPrefix(project);
	}

	@Override
	public boolean remove(BTSProject project) {
		projectService.remove(project);
		return true;
	}

}
