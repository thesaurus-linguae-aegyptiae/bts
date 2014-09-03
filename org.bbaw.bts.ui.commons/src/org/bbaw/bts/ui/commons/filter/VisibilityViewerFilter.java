package org.bbaw.bts.ui.commons.filter;

import org.bbaw.bts.btsmodel.BTSConfigItem;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsviewmodel.TreeNodeWrapper;

public class VisibilityViewerFilter extends AbstractObjectByListEntryFilter{

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
		if (object instanceof BTSObject)
		{
			for (Object o : getObjects())
			{
				if (o instanceof BTSConfigItem)
				{
					BTSConfigItem configItem = (BTSConfigItem) o;
					if (configItem.getValue() != null && configItem.getValue().equals(((BTSObject) object).getVisibility()))
					{
						return true;
					}
				}
			}
		}
		return false;
	}

}
