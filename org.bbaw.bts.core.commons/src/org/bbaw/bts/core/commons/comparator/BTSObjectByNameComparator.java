package org.bbaw.bts.core.commons.comparator;

import java.util.Comparator;

import org.bbaw.bts.btsmodel.BTSObject;

public class BTSObjectByNameComparator implements Comparator<BTSObject>{

	private AlphanumComparator alphaNumComp = new AlphanumComparator();
	@Override
	public int compare(BTSObject arg0, BTSObject o1) {
		if (arg0 != null && arg0.getName() != null && o1 != null && o1.getName() != null)
		{
			return alphaNumComp.compare(arg0.getName(), o1.getName());
		}
		return 0;
	}

}
