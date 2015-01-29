package org.bbaw.bts.core.commons.comparator;

import java.util.Comparator;

import org.bbaw.bts.btsmodel.BTSObject;

public class BTSObjectByNameComparator implements Comparator<BTSObject>{

	private AlphanumComparator alphaNumComp = new AlphanumComparator();
	@Override
	public int compare(BTSObject o0, BTSObject o1) {
		if (o0.getSortKey() != 0 && o1.getSortKey() != 0)
		{
			return o0.getSortKey() - o1.getSortKey();
		}
		else if (o0.getSortKey() != 0)
		{
			return -1;
		}
		else if (o1.getSortKey() != 0)
		{
			return 1;
		}
		else if (o0 != null && o0.getName() != null && o1 != null && o1.getName() != null)
		{
			return alphaNumComp.compare(o0.getName(), o1.getName());
		}
		return 0;
	}

}
