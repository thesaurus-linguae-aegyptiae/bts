package org.bbaw.bts.core.commons.comparator;

import java.util.Comparator;

import org.bbaw.bts.btsmodel.BTSObject;

public class BTSObjectByNameComparator implements Comparator<BTSObject>{

	private AlphanumComparator alphaNumComp = new AlphanumComparator();
	@Override
	public int compare(BTSObject a, BTSObject b) {
		if (a.getSortKey() != 0 && b.getSortKey() != 0)
		{
			if (a.getSortKey() < b.getSortKey()) {
				return -1;
			}
			if (b.getSortKey() < a.getSortKey()) {
				return 1;
			}
		}
		if ((""+a.getName()).compareTo(""+b.getName()) < 0) {
			return -1;
		}
		if ((""+b.getName()).compareTo(""+a.getName()) < 0) {
			return 1;
		}
		return a.get_id().compareTo(b.get_id());
	}

}
