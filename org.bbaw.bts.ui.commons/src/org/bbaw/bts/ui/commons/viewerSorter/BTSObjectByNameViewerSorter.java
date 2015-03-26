package org.bbaw.bts.ui.commons.viewerSorter;

import org.bbaw.bts.btsmodel.BTSConfigItem;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsviewmodel.TreeNodeWrapper;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.commons.comparator.AlphanumComparator;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;

public class BTSObjectByNameViewerSorter extends ViewerSorter {
	private AlphanumComparator alphaNumComp = new AlphanumComparator();
	private boolean preferSortKey;

	public BTSObjectByNameViewerSorter(){};
	
	public BTSObjectByNameViewerSorter(boolean preferSortKey){
		this.preferSortKey = preferSortKey;
	};

	
	@Override
	public int compare(Viewer viewer, Object e1, Object e2) {
		String s1 = null;
		String s2 = null;
		int i1 = 0;
		int i2 = 0;
		if (e1 instanceof TreeNodeWrapper && e2 instanceof TreeNodeWrapper) {
			TreeNodeWrapper t1 = (TreeNodeWrapper) e1;
			if (t1.getObject() != null && t1.getObject() instanceof BTSObject) {
				s1 = ((BTSObject) t1.getObject()).getName();
				i1 = ((BTSObject) t1.getObject()).getSortKey();
			} else {
				s1 = t1.getLabel();
			}
			TreeNodeWrapper t2 = (TreeNodeWrapper) e2;
			if (t2.getObject() != null && t2.getObject() instanceof BTSObject) {
				s2 = ((BTSObject) t2.getObject()).getName();
				i2 = ((BTSObject) t2.getObject()).getSortKey();
			} else {
				s2 = t2.getLabel();
			}
			if (t1.getLabel() != null) {

			}
			if (t2.getLabel() != null) {
				s2 = t2.getLabel();
			}

		} else if (e1 instanceof BTSObject && e2 instanceof BTSObject) {
			BTSObject b1 = (BTSObject) e1;
			BTSObject b2 = (BTSObject) e2;
			i1 = b1.getSortKey();
			i2 = b2.getSortKey();
			if (b1.getName() != null) {
				s1 = b1.getName();
			}
			if (b2.getName() != null) {
				s2 = b2.getName();
			}

		} else if (e1 instanceof BTSConfigItem && e2 instanceof BTSConfigItem) {
			BTSConfigItem b1 = (BTSConfigItem) e1;
			BTSConfigItem b2 = (BTSConfigItem) e2;
			i1 = b1.getSortKey();
			i2 = b2.getSortKey();
			if (b1.getLabel() != null) {
				s1 = b1.getLabel().getTranslation("de");
			}
			if (b2.getLabel() != null) {
				s2 = b2.getLabel().getTranslation("de");
			}

		}
		
		if (preferSortKey && i1 != 0 && i2 != 0) return i1 -i2;
		// sort _Orphans node in tree at bottom 
		if (BTSConstants.ORPHANS_NODE_LABEL.equals(s1)) return 1;
		else if (BTSConstants.ORPHANS_NODE_LABEL.equals(s2)) return -1;
		
		if (s1 != null) {
			if (s2 != null) {
				return alphaNumComp.compare(s1, s2);
			} else
				return -1;
		}
		return 0;
	}
}
