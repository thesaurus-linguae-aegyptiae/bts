package org.bbaw.bts.core.commons.filter;

public interface BTSFilter {

	/**
	 * Returns whether the given object makes it through this filter.
	 * @param object
	 * @return true if object makes it through filter
	 */
	boolean select(Object object);
}
