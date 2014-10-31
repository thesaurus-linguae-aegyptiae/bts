package org.bbaw.bts.ui.commons.filter;

import org.bbaw.bts.btsmodel.AdministrativDataObject;
import org.bbaw.bts.btsmodel.BTSUser;
import org.bbaw.bts.btsviewmodel.TreeNodeWrapper;

public class CreatorViewerFilter extends AbstractObjectByListEntryFilter{

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
		if (object instanceof AdministrativDataObject)
		{
			AdministrativDataObject adminObject = (AdministrativDataObject) object;
			for (Object o : getObjects())
			{
				if (o instanceof BTSUser)
				{
					BTSUser user = (BTSUser) o;
					if (!adminObject.getRevisions().isEmpty() && user.get_id() != null 
							&& user.get_id().equals(adminObject.getRevision(0).getUserId()))
					{
						return true;
					}
				}
			}
		}
		return false;
	}

}
