package org.bbaw.bts.core.services;

import java.util.List;

import org.bbaw.bts.btsmodel.BTSObject;


public interface BTSSelectionHistoryService {
	
	/**
	 * Returns an anti-chronological list of recent selections with <code>n</code> elements.
	 * @param n
	 * @return
	 */
	public List<BTSObject> getHistory(int n);
	

	/**
	 * Returns an anti-chronological list of recent selections with <code>n</code> elements that
	 * are instances of either the specified type or of any of its subclasses.
	 * @param type
	 * @param n
	 * @return
	 */
	public List<BTSObject> getHistory(Class<BTSObject> type, int n);

	
	//TODO: rewind?
	

}
