package org.bbaw.bts.core.commons.comparator;

import java.util.Comparator;

import org.bbaw.bts.btsmodel.BTSConfig;
import org.bbaw.bts.btsmodel.BTSConfigItem;

public class BTSConfigSortKeyLabelSorter implements
		Comparator<BTSConfig> {

	private AlphanumComparator alphaNumComp = new AlphanumComparator();
	private String lang;

	public BTSConfigSortKeyLabelSorter() {
	}
	
	public BTSConfigSortKeyLabelSorter(String lang) {
		this.lang = lang;
	}
	
	@Override
	public int compare(BTSConfig o0, BTSConfig o1) {
		if (o0 instanceof BTSConfigItem && o1 instanceof BTSConfigItem)
		{
			BTSConfigItem ci0 = (BTSConfigItem) o0;
			BTSConfigItem ci1 = (BTSConfigItem) o1;
			if (ci0.getSortKey() != 0 && ci1.getSortKey() != 0) {
				return ci0.getSortKey() - ci1.getSortKey();
			} else if (ci0.getSortKey() != 0) {
				return -1;
			} else if (ci1.getSortKey() != 0) {
				return 1;
			} else {
				String l0 = ci0.getLabel().getTranslation(lang);
				String l1 = ci1.getLabel().getTranslation(lang);
				if (l0 != null && l1 != null) {
					return alphaNumComp.compare(l0, l1);
				} else if (l0 != null) {
					return -1;
				}
				return 0;
			}
		}
		else
		{
			return 0;
		}
	}
}