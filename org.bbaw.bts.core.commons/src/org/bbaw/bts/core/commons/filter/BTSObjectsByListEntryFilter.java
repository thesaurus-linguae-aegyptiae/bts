package org.bbaw.bts.core.commons.filter;

import java.util.List;

public interface BTSObjectsByListEntryFilter extends BTSFilter {

	List<Object> getObjects();
	
	void setObjects(List<Object> objects);
}
