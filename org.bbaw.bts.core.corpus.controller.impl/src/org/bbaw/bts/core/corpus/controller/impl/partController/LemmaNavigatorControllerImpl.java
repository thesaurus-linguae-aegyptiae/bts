package org.bbaw.bts.core.corpus.controller.impl.partController;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import javax.inject.Inject;

import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.commons.filter.BTSFilter;
import org.bbaw.bts.core.corpus.controller.impl.util.BTSEgyObjectByNameComparator;
import org.bbaw.bts.core.corpus.controller.partController.LemmaNavigatorController;
import org.bbaw.bts.core.services.corpus.BTSAnnotationService;
import org.bbaw.bts.core.services.corpus.BTSLemmaEntryService;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAnnotation;
import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject;
import org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaEntry;
import org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaSubentry;
import org.bbaw.bts.corpus.btsCorpusModel.BTSText;
import org.bbaw.bts.searchModel.BTSQueryRequest;
import org.eclipse.core.runtime.IProgressMonitor;

public class LemmaNavigatorControllerImpl extends AbstractCorpusObjectNavigatorControllerImpl<BTSLemmaEntry, String> 
implements LemmaNavigatorController{

	@Inject
	private BTSLemmaEntryService lemmaService;
	
	@Override
	protected List<BTSLemmaEntry> retrieveTypedRootEntries(IProgressMonitor monitor) {
		return lemmaService.listRootEntries(monitor);
	}

	@Override
	protected List<BTSLemmaEntry> executeTypedQuery(BTSQueryRequest query, String objectState, IProgressMonitor monitor) {
		return lemmaService.query(query, objectState, monitor);
	}

	@Override
	protected BTSLemmaEntry typedCreateNew() {
		return lemmaService.createNew();
	}

	@Override
	protected List<BTSLemmaEntry> typedListEntries(String objectState, IProgressMonitor monitor) {
		return lemmaService.list(objectState, monitor);
	}

	@Override
	protected List<BTSLemmaEntry> retrieveTypedOrphandEntries(Map map,
			List<BTSFilter> btsFilters, IProgressMonitor monitor) {
		return lemmaService.getOrphanEntries(map, btsFilters, monitor);
	}

	@Override
	public BTSLemmaEntry find(String id, IProgressMonitor monitor) {
		return lemmaService.find(id, monitor);
	}

	@Override
	public BTSLemmaSubentry createNewSubEntry() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void sortEntries(List<BTSLemmaEntry> list) {
		Collections.sort(list, new BTSEgyObjectByNameComparator());
	}

	protected String[] getChildRelationTypes() {
		return new String[]{"partOf", "referencedBy", "referencing"};
	}

	@Override
	public BTSAnnotation createNewAnnotation(BTSCorpusObject annotatedObject) {
		BTSAnnotation anno = lemmaService
				.createNewAnnotationRelationPartOf(annotatedObject);
		
		return anno;
	}

	
}
