package org.bbaw.bts.core.corpus.controller.impl.util;

import java.text.ParseException;
import java.text.RuleBasedCollator;
import java.util.Comparator;

import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.core.commons.comparator.AlphanumComparator;
import org.bbaw.bts.ui.commons.corpus.util.BTSEGYConstants;

public class BTSEgyObjectByNameComparator implements Comparator<BTSObject>{

	private RuleBasedCollator egyCollator;
	private AlphanumComparator alphaNumComp;
	
	public BTSEgyObjectByNameComparator()
	{
		try {
			egyCollator =  new RuleBasedCollator(BTSEGYConstants.EGY_COLLATOR_RULE);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		alphaNumComp = new AlphanumComparator(egyCollator);

	}
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
			if (egyCollator != null)
			{
				return alphaNumComp.compare(o0.getName(), o1.getName());
			}
			return o0.getName().compareTo(o1.getName());
		}
		return 0;
	}

}
