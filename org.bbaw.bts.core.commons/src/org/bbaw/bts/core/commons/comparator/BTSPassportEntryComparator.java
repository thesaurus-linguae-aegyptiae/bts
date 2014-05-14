package org.bbaw.bts.core.commons.comparator;

import java.util.Comparator;

import org.bbaw.bts.btsmodel.BTSPassportEntry;

public class BTSPassportEntryComparator implements Comparator<BTSPassportEntry>{

	@Override
	public int compare(BTSPassportEntry e0, BTSPassportEntry e1) {
		if (e0 != null && e1 != null && e0.getValue() != null)
		{
			return e1.getValue().compareTo(e1.getValue());
		}
		return 0;
	}

}
