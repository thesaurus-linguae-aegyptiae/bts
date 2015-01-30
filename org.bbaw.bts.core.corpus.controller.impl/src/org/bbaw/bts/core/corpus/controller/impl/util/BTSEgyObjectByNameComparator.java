package org.bbaw.bts.core.corpus.controller.impl.util;

import java.text.ParseException;
import java.text.RuleBasedCollator;
import java.util.Comparator;

import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.core.commons.comparator.AlphanumComparator;

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
	public int compare(BTSObject arg0, BTSObject o1) {
		if (arg0 != null && arg0.getName() != null && o1 != null && o1.getName() != null)
		{
			if (egyCollator != null)
			{
				return alphaNumComp.compare(arg0.getName(), o1.getName());
			}
			return arg0.getName().compareTo(o1.getName());
		}
		return 0;
	}

}
