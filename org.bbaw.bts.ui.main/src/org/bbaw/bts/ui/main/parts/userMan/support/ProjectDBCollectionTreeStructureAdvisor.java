package org.bbaw.bts.ui.main.parts.userMan.support;

import org.bbaw.bts.btsmodel.BTSDBCollectionRoleDesc;
import org.bbaw.bts.btsmodel.BTSProject;
import org.bbaw.bts.btsmodel.BTSProjectDBCollection;
import org.eclipse.jface.databinding.viewers.TreeStructureAdvisor;

public class ProjectDBCollectionTreeStructureAdvisor extends TreeStructureAdvisor
{
	@Override
	public Object getParent(Object element)
	{
		if (element instanceof BTSProjectDBCollection)
		{
			return ((BTSProjectDBCollection) element).eClass().eContainer();
		} else if (element instanceof BTSDBCollectionRoleDesc)
		{
			return ((BTSDBCollectionRoleDesc) element).eClass().eContainer();
		}
		//		else if (element instanceof String)
		//		{
		//			return ((EString) element).eClass().eContainer();
		//		}

		return null;
	}

	@Override
	public Boolean hasChildren(Object element)
	{

		if (element instanceof BTSProjectDBCollection)
		{
			if (!((BTSProjectDBCollection) element).getRoleDescriptions().isEmpty())
			{
				return Boolean.TRUE;
			}
		} else if (element instanceof BTSDBCollectionRoleDesc)
		{
			if (!((BTSDBCollectionRoleDesc) element).getCachedChildren().isEmpty())
			{
				return Boolean.TRUE;
			}
		} else if (element instanceof BTSProject)
		{
			if (!((BTSProject) element).getDbCollections().isEmpty())
			{
				return Boolean.TRUE;
			}
		}

		return Boolean.FALSE;
	}

}