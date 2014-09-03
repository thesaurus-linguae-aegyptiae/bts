package org.bbaw.bts.ui.commons.filter;

import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.btsmodel.BTSProject;
import org.bbaw.bts.btsviewmodel.TreeNodeWrapper;

public class ProjectPrefixViewerFilter extends AbstractObjectByListEntryFilter{

	@Override
	public boolean select(Object object) {
		if (object instanceof TreeNodeWrapper)
		{
			if (((TreeNodeWrapper) object).getObject() != null)
			{
				object = ((TreeNodeWrapper) object).getObject();
			}
			else
			{
				return true;
			}
		}
		if (object instanceof BTSDBBaseObject)
		{
			for (Object o : getObjects())
			{
				if (o instanceof BTSProject)
				{
					BTSProject project = (BTSProject) o;
					if (project.getPrefix() != null && project.getPrefix().equals(((BTSDBBaseObject) object).getProject()))
					{
						return true;
					}
				}
			}
		}
		return false;
	}

}
