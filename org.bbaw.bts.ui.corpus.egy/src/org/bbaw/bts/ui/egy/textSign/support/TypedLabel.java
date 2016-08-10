package org.bbaw.bts.ui.egy.textSign.support;

import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.eclipse.draw2d.Label;

public class TypedLabel extends Label{
	
	public static final int LEMMA = 1<<0;
	
	public static final int FLEXION = 1<<1;
	
	public static final int TRANSLITATION = 1<<2;

	public static final int TRANSLATION = 1<<3;
	
	private int type;

	public int getType() {
		return Integer.highestOneBit(type);
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getTranslationLang() {
		if (Integer.highestOneBit(type) == TRANSLATION) {
			assert BTSCoreConstants.LANGS.length < 9;
			int langId = type ^ TRANSLATION;
			if (langId > -1) {
				return BTSCoreConstants.LANGS[langId];
			}
		}
		return null;
	}

	public void setTranslationLang(String lang) {
		type = TRANSLATION;
		for (int langId = 0; langId < BTSCoreConstants.LANGS.length; langId++) {
			if (BTSCoreConstants.LANGS[langId].equals(lang)) {
				type |= langId;
				break;
			}
		}
	}

	public boolean typeOf(int type) {
		return (this.type & type) == type;
	}

}
