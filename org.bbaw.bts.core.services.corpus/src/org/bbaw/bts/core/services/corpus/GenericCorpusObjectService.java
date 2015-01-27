package org.bbaw.bts.core.services.corpus;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.bbaw.bts.core.commons.filter.BTSFilter;
import org.bbaw.bts.core.services.GenericObjectService;
import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject;
import org.eclipse.core.runtime.IProgressMonitor;

public interface GenericCorpusObjectService<E extends BTSCorpusObject, K extends Serializable> 
extends GenericObjectService<E, K>{

	List<E> listRootEntries(IProgressMonitor monitor);
	
	List<E> getOrphanEntries(Map map, List<BTSFilter> btsFilters, IProgressMonitor monitor);

	boolean checkAndFullyLoad(BTSCorpusObject object, boolean checkForConflicts);
}
