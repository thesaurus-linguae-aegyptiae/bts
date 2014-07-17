package org.bbaw.bts.core.services;

import java.util.List;

import org.bbaw.bts.btsmodel.UserActionCounter;

public interface UserActionCounterService extends
		GenericObjectService<UserActionCounter, String> {

	List<UserActionCounter> getCountersForPrefix(String code);

	void updateCounters(List<String> toAdd);

}
