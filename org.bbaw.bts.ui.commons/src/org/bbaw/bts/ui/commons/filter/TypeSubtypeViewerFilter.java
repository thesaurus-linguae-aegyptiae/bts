package org.bbaw.bts.ui.commons.filter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSConfigItem;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsviewmodel.TreeNodeWrapper;
import org.bbaw.bts.core.controller.generalController.BTSConfigurationController;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

public class TypeSubtypeViewerFilter extends ViewerFilter{

	private BTSConfigItem inputPath;
	@Inject
	private BTSConfigurationController configurationController;
	private Map<String, List<String>> map;
	
	@Override
	public boolean select(Viewer viewer, Object parentElement, Object element) {
		if (element instanceof TreeNodeWrapper)
		{
			if (((TreeNodeWrapper) element).getObject() != null)
			{
				element = ((TreeNodeWrapper) element).getObject();
			}
			else
			{
				return true;
			}
		}
		if (element instanceof BTSObject)
		{
			BTSObject o = (BTSObject) element;

			if (map == null)
			{
				map = loadMap();
			}
			// if map empty, no filtering!
			if (map.isEmpty()) return true;
			return configurationController.objectTypesPathsContainsObjectype(map, o);
		}
		return false;
	}

	private Map<String, List<String>> loadMap() {
		if (inputPath == null)
		{
			return new HashMap<String, List<String>>();
		}
		return inputPath.getOwnerTypesMap();
	}


	public BTSConfigItem getInputPath() {
		return inputPath;
	}

	public void setInputPath(BTSConfigItem inputPath2) {
		this.inputPath = inputPath2;
		map = null;
		
	}

	

}
