package org.bbaw.bts.core.controller.impl.generalController;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.Vector;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSConfigItem;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.controller.generalController.BTSConfigurationController;
import org.bbaw.bts.core.controller.generalController.GeneralBTSObjectController;
import org.bbaw.bts.core.dao.util.BTSQueryRequest;
import org.bbaw.bts.core.services.BTSProjectService;
import org.bbaw.bts.core.services.GeneralBTSObjectService;
import org.eclipse.core.runtime.IProgressMonitor;
import org.elasticsearch.action.search.SearchRequestBuilder;
import org.elasticsearch.index.query.FilterBuilder;
import org.elasticsearch.index.query.FilterBuilders;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;

public class GeneralBTSObjectControllerImpl implements
		GeneralBTSObjectController {

    private static final int MAX_PROPOSALS = 50;

	@Inject
	private BTSConfigurationController configurationController;
	
	@Inject
	private BTSProjectService projectService;
	
	@Inject
	private GeneralBTSObjectService objectService;

	private List<BTSObject> getTypedObjectProposalsFor(String text, String className, IProgressMonitor monitor) {
		BTSQueryRequest query = new BTSQueryRequest(text);
		query.setQueryBuilder(QueryBuilders.boolQuery()
			.must(QueryBuilders.matchPhrasePrefixQuery("name", text)));
		// try and lookup objects by id first
		query.setIdQuery(true);
        query.setSize(MAX_PROPOSALS);
		List<BTSObject> result = queryObjects(query, BTSConstants.OBJECT_STATE_ACTIVE,
				false, className, monitor);
		if (result != null && !result.isEmpty()) {
			return result;
		} else {
			// if id lookup fails, query object names
			query.setIdQuery(false);
			result = queryObjects(query, BTSConstants.OBJECT_STATE_ACTIVE,
					false, className, monitor);
			if (result != null) {
				return result;
			}
		}
		return new Vector<BTSObject>(0);
	}

	@Override
	public List<BTSObject> getObjectProposalsFor(
			BTSConfigItem configItem, String text, BTSObject object, IProgressMonitor monitor) {
		List<BTSObject> list = new Vector<BTSObject>();

		//FIXME aktualisieren und auf map umstellen

		if (configItem != null && !configItem.getOwnerTypesMap().isEmpty()) {
            if (configurationController.objectMayReferenceToThs(object, configItem)) {
                list.addAll(getTypedObjectProposalsFor(text, "BTSThsEntry", monitor));
            }

            if (configurationController.objectMayReferenceToWList(object, configItem)) {
                list.addAll(getTypedObjectProposalsFor(text, "BTSLemmaEntry", monitor));
            } else if (configurationController.objectMayReferenceToCorpus(object, configItem)) {
                list.addAll(getTypedObjectProposalsFor(text, "BTSCorpusObject", monitor));
            }
		}

		return list;
	}
	
	@Override
	public List<BTSObject> queryObjects(BTSQueryRequest query,
			String objectState, boolean registerQuery, String className, IProgressMonitor monitor) {
		return objectService.queryObjects(query, objectState, registerQuery, className, monitor);
	}
	

	private List<FilterBuilder> makeFilterList(BTSConfigItem configItem, BTSObject object) {

		Set<String> referenceTypes = configurationController.getReferenceTypesSet(object, configItem);
		
		List<FilterBuilder> filters = new ArrayList<FilterBuilder>();
		for (String ref : referenceTypes) {
			if (ref.contains(BTSConstants.OWNER_REFERENCED_TYPES_PATH_SEPERATOR)) {
				String[] split = ref.split("\\.");
				if (split.length == 2) {
					filters.add(FilterBuilders.termFilter(new String("type"),
							ref));
				} else if (split.length == 3) {
					filters.add(FilterBuilders.termFilter(
							new String("subtype"), ref));
				}

			}

		}
		return filters;

	}
	
	@Override
	public String getDisplayName(String id) {
		
		return objectService.getDisplayName(id, null);

	}
	@Override
	public BTSObject findObject(String id, String className, IProgressMonitor monitor) {
		return objectService.findObject(id, className, monitor);
		
	}
}
