package org.bbaw.bts.ui.main.dialogs.btsConfigDialog.provider;

import org.bbaw.bts.btsmodel.BTSConfig;
import org.bbaw.bts.btsmodel.BTSConfigItem;
import org.bbaw.bts.btsmodel.BTSConfiguration;
import org.eclipse.jface.databinding.viewers.TreeStructureAdvisor;

public class TreeStructureAdvisorImpl extends TreeStructureAdvisor
{
	@Override
	public Object getParent(Object element)
	{
		if (element instanceof BTSConfigItem)
		{
			// return ((BTSConfigItem) element).getParent();
		}

		return null;
	}

	@Override
	public Boolean hasChildren(Object element)
	{
		if (element instanceof BTSConfig)
		{
			if (((BTSConfig) element).getChildren().size() > 0)
			{
				return Boolean.TRUE;
			}

		} else if (element instanceof BTSConfiguration)
		{
			if (((BTSConfiguration) element).getChildren().size() > 0)
			{
				return Boolean.TRUE;
			}

		} else if (element instanceof BTSConfigItem)
		{
			if (((BTSConfigItem) element).getChildren().size() > 0)
			{
				return Boolean.TRUE;
			}

		}
		return super.hasChildren(element);
	}
}