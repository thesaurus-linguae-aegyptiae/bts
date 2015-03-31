package org.bbaw.bts.ui.corpus.sorter;

import java.text.ParseException;
import java.text.RuleBasedCollator;

import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsviewmodel.TreeNodeWrapper;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.commons.comparator.AlphanumComparator;
import org.bbaw.bts.ui.commons.corpus.util.BTSEGYUIConstants;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;

public class BTSEgyObjectByNameViewerSorter extends ViewerSorter {
	private RuleBasedCollator egyCollator;
	private AlphanumComparator alphaNumComp;
	protected boolean forceSortKey;

	public BTSEgyObjectByNameViewerSorter(){
		try {
			egyCollator =  new RuleBasedCollator(BTSEGYUIConstants.EGY_COLLATOR_RULE);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		alphaNumComp = new AlphanumComparator(egyCollator);
	}
	public BTSEgyObjectByNameViewerSorter(boolean forceSortKey){
		this.forceSortKey = forceSortKey;
		try {
			egyCollator =  new RuleBasedCollator(BTSEGYUIConstants.EGY_COLLATOR_RULE);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		alphaNumComp = new AlphanumComparator(egyCollator);
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

		}
		// sort _Orphans node in tree at bottom 
		if (BTSConstants.ORPHANS_NODE_LABEL.equals(s1)) return 1;
		else if (BTSConstants.ORPHANS_NODE_LABEL.equals(s2)) return -1;
		else if (isForceSortKey() && i1 != i2) {
			return i1 -i2;
		}

		if (s1 != null) {
			if (s2 != null) {
				return alphaNumComp.compare(s1, s2);
			} else
				return -1;
		}
		return 0;
	}
	protected boolean isForceSortKey() {
		return forceSortKey;
	}
}
