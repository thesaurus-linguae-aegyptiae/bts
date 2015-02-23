package org.bbaw.bts.core.services.impl.services;

import java.util.Comparator;

import org.bbaw.bts.btsmodel.BTSIDReservationObject;

public class BTSIDReservationObjectsComparator implements
		Comparator<BTSIDReservationObject> {

	private String prefix;

	public BTSIDReservationObjectsComparator(String prefix) {
		this.prefix = prefix;
	}

	@Override
	public int compare(BTSIDReservationObject arg0, BTSIDReservationObject arg1) {
		String suffix0 = arg0.get_id().substring(prefix.length(), arg0.get_id().length());
		int intSuffix0 = new Integer(suffix0);
		
		String suffix1 = arg1.get_id().substring(prefix.length(), arg1.get_id().length());
		int intSuffix1 = new Integer(suffix1);
		return intSuffix0 - intSuffix1;
	}

}
