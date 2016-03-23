package org.bbaw.bts.ui.commons.viewerSorter;

import org.bbaw.bts.btsmodel.BTSDBCollectionRoleDesc;
import org.bbaw.bts.btsmodel.BTSProject;
import org.bbaw.bts.btsmodel.BTSProjectDBCollection;
import org.bbaw.bts.btsmodel.BTSUser;
import org.bbaw.bts.btsmodel.BTSUserGroup;
import org.bbaw.bts.btsviewmodel.TreeNodeWrapper;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerComparator;

public class BTSUserManagerViewerComparator extends ViewerComparator {

	@Override
	public int compare(Viewer viewer, Object e1, Object e2) {
		return pickSortString(e1).compareTo(pickSortString(e2));
	}
	
	private String pickSortString(Object o) {
		if (o instanceof TreeNodeWrapper) {
			// extract object from container
			TreeNodeWrapper t = (TreeNodeWrapper)o;
			o = t.getObject();
			if (o == null)
				return (t.getLabel() != null ? t.getLabel() : t.toString());
		}
		if (o == null) return "";
		if (o instanceof BTSUser) {
			BTSUser u = (BTSUser)o;
			return u.getSureName() + ", " + u.getForeName()+" "+u.getUserName();
		}
		if (o instanceof BTSUserGroup)
			return ((BTSUserGroup)o).getName();
		if (o instanceof BTSProjectDBCollection)
			return ((BTSProjectDBCollection)o).getCollectionName();
		if (o instanceof BTSDBCollectionRoleDesc)
			return ((BTSDBCollectionRoleDesc)o).getRoleName();
		if (o instanceof BTSProject)
			return ((BTSProject)o).getName();		
		return o.toString();
	}
	
}
