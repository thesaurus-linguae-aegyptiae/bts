package org.bbaw.bts.ui.commons.filter;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsviewmodel.TreeNodeWrapper;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.commons.staticAccess.StaticAccessController;
import org.bbaw.bts.core.controller.generalController.BTSConfigurationController;

public class BTSObjectTypeSubtypeViewerFilter extends AbstractObjectByListEntryFilter {

	private HashSet<String> stringFilterSet;
	private BTSConfigurationController configurationController;

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
			if (getStringFilterSet().isEmpty())
			{
				return true;
			}
			else
			{
				String className = findClassName((BTSObject) object);
				if (getStringFilterSet().contains(className))
				{
					return true;
				}
				else if (((BTSObject) object).getType() != null)
				{
					String type = ((BTSObject) object).getType();
					if (getStringFilterSet().contains(className + BTSConstants.OWNER_REFERENCED_TYPES_PATH_SEPERATOR +type))
					{
						return true;
					}
					if (((BTSObject) object).getSubtype() != null)
					{
						String subtype = ((BTSObject) object).getSubtype();
						if (getStringFilterSet().contains(className + BTSConstants.OWNER_REFERENCED_TYPES_PATH_SEPERATOR 
								+type + BTSConstants.OWNER_REFERENCED_TYPES_PATH_SEPERATOR + subtype))
						{
							return true;
						}
					}
				}
			}
			return false;
		}
		return false;
	}

	private String findClassName(BTSObject object) {
		if (configurationController == null)
		{
			configurationController = StaticAccessController.getContext().get(BTSConfigurationController.class);
		}
		return configurationController.findObjectClass(object);
	}

	private Set<String> getStringFilterSet() {
		if (stringFilterSet == null)
		{
			stringFilterSet = new HashSet<String>();
			List<?> obs = getObjects();
			for (Object o : obs)
			{
				if (o instanceof String)
				{
					stringFilterSet.add((String) o);
				}
			}
		}
		return stringFilterSet;
	}

}
