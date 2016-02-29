package org.bbaw.bts.core.corpus.controller.impl.util;

import java.text.ParseException;
import java.text.RuleBasedCollator;
import java.util.Comparator;

import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.core.commons.comparator.AlphanumComparator;
import org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaEntry;
import org.bbaw.bts.ui.commons.corpus.util.BTSEGYUIConstants;

public class BTSEgyLemmaEntryComparator implements Comparator<BTSLemmaEntry>{

	private RuleBasedCollator egyCollator;
	private AlphanumComparator alphaNumComp;
	private String searchString;
	public BTSEgyLemmaEntryComparator(String searchString)
	{
		try {
			egyCollator =  new RuleBasedCollator(BTSEGYUIConstants.EGY_COLLATOR_RULE);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		alphaNumComp = new AlphanumComparator(egyCollator);
		this.searchString = searchString;
	}
	
	@Override
	public int compare(BTSLemmaEntry e1, BTSLemmaEntry e2) {
		String s1 = null;
		String s2 = null;
		if (e1 instanceof BTSObject && e2 instanceof BTSObject) {
			BTSObject b1 = (BTSObject) e1;
			BTSObject b2 = (BTSObject) e2;
			if (b1.getName() != null) {
				s1 = b1.getName().toLowerCase();
			}
			if (b2.getName() != null) {
				s2 = b2.getName().toLowerCase();
			}

		}
		
		
		if (s1 != null) {
			if (s2 != null) {
				if (searchString != null)
					if (s1.startsWith(searchString)) {
						if (s2.startsWith(searchString))
							return alphaNumComp.compare(s1, s2);
						return -1;
					} else if (s2.startsWith(searchString))
						return 1;
				return alphaNumComp.compare(s1, s2);
			} else
				return -1;
		} else if (s2 != null)
			return 1;
		return e1.get_id().compareTo(e2.get_id());
	}

}
