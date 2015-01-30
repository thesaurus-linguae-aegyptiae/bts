package org.bbaw.bts.core.services.impl.services;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import javax.inject.Inject;
import javax.inject.Named;

import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.services.BTSSelectionHistoryService;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.services.IServiceConstants;


public class BTSSelectionHistoryServiceImpl implements BTSSelectionHistoryService {

	@Inject
	private IEclipseContext context;
	
	@SuppressWarnings("unchecked")
	@Inject
	@Optional
	void receiveSelection(@Optional @Named(IServiceConstants.ACTIVE_SELECTION) Object selection) {
		if (selection != null) {
			List<BTSObject> sel;
			if (selection instanceof List<?>) {
				sel = (List<BTSObject>)selection;
			} else {		
				sel = new Vector<BTSObject>();
				if (selection instanceof BTSObject[]) {
					sel.addAll(Arrays.asList((BTSObject[])selection));
				} else if (selection instanceof BTSObject)
					sel.add((BTSObject)selection);
			}
			appendToHistory(sel);
		}
	}
	
	
	private void appendToHistory(List<BTSObject> sel) {
		List<BTSObject> history = loadSelectionHistory();
		history.addAll(0, sel);
		if (history.size()>BTSConstants.BTS_SELECTION_HISTORY_LENGTH)
			history = history.subList(0, BTSConstants.BTS_SELECTION_HISTORY_LENGTH);
	}
	

	@SuppressWarnings("unchecked")
	private List<BTSObject> loadSelectionHistory() {
		Object hist = context.get(BTSConstants.BTS_SELECTION_HISTORY);
		if (hist == null || !(hist instanceof List<?>)) {
			hist = new Vector<BTSObject>();
			context.set(BTSConstants.BTS_SELECTION_HISTORY, hist);
		}
		return (List<BTSObject>) hist;
	}


	@Override
	public List<BTSObject> getHistory(int n) {
		return loadSelectionHistory().subList(0, n);
	}


	@Override
	public List<BTSObject> getHistory(Class<BTSObject> type, int n) {
		List<BTSObject> res = new Vector<BTSObject>();
		Iterator<BTSObject> i = loadSelectionHistory().iterator();
		while (res.size()<n && i.hasNext()) {
			BTSObject o = i.next();
			if (type.isAssignableFrom(o.getClass()))
				res.add(o);
		}
		return res;
	}


}
