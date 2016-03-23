package org.bbaw.bts.core.corpus.controller.impl.partController;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.bbaw.bts.core.commons.filter.BTSFilter;
import org.bbaw.bts.core.corpus.controller.partController.ATextNavigatorController;
import org.bbaw.bts.core.dao.util.BTSQueryRequest;
import org.bbaw.bts.core.services.corpus.BTSAbstractTextService;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAbstractText;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAnnotation;
import org.eclipse.core.runtime.IProgressMonitor;

public class ATextNavigatorControllerImpl extends AbstractCorpusObjectNavigatorControllerImpl<BTSAbstractText, String> 
implements ATextNavigatorController {

	@Inject
	private BTSAbstractTextService atextService;
	
	@Override
	protected List<BTSAbstractText> retrieveTypedRootEntries(IProgressMonitor monitor) {
		return atextService.listRootEntries(monitor);
	}

	@Override
	protected List<BTSAbstractText> executeTypedQuery(BTSQueryRequest query,
			String objectState, IProgressMonitor monitor) {
		return atextService.query(query, objectState, monitor);
	}

	@Override
	protected BTSAbstractText typedCreateNew() {
		return atextService.createNew();
	}

	@Override
	protected List<BTSAbstractText> typedListEntries(String objectState, IProgressMonitor monitor) {
		return atextService.list(objectState, monitor);
	}

	@Override
	protected List<BTSAbstractText> retrieveTypedOrphandEntries(Map map,
			List<BTSFilter> btsFilters, IProgressMonitor monitor) {
		return atextService.getOrphanEntries(map, btsFilters, monitor);
	}

	@Override
	public BTSAbstractText find(String id, IProgressMonitor monitor) {
		return atextService.find(id, monitor);
	}

	@Override
	public BTSAnnotation createNewAnnotation(BTSAbstractText annotatedObject) {
		BTSAnnotation anno = atextService
				.createNewAnnotationRelationPartOf(annotatedObject);
		
		return anno;
	}



}
