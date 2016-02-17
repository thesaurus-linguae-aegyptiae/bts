package org.bbaw.bts.core.corpus.controller.impl.partController;

import java.util.List;
import java.util.Vector;

import javax.inject.Inject;
import javax.inject.Named;

import org.bbaw.bts.btsmodel.BTSComment;
import org.bbaw.bts.btsmodel.BTSConfig;
import org.bbaw.bts.btsmodel.BTSConfigItem;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.corpus.controller.partController.AnnotationPartController;
import org.bbaw.bts.core.services.BTSCommentService;
import org.bbaw.bts.core.services.BTSConfigurationService;
import org.bbaw.bts.core.services.corpus.CorpusObjectService;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAnnotation;
import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject;
import org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaEntry;
import org.bbaw.bts.corpus.btsCorpusModel.BTSThsEntry;
import org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelFactory;
import org.bbaw.bts.searchModel.BTSQueryRequest;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.elasticsearch.index.query.QueryBuilders;

public class AnnotationPartControllerImpl implements AnnotationPartController {

	@Inject
	private CorpusObjectService corpusObjectService;

	@Inject
	private BTSCommentService commentService;

	@Inject
	private BTSConfigurationService confService;


	@Inject
	@Named(BTSCoreConstants.CURRENT_DB_COLLECTION_CONTEXT)
	@Optional
	private String dbcollectionContext;

	@Override
	public void save(BTSObject object) {
		if (object instanceof BTSCorpusObject)
		{
			corpusObjectService.save((BTSCorpusObject) object);
		}
		else if (object instanceof BTSComment)
		{
			commentService.save((BTSComment) object);
		}
		
		
	}



	@Override
	public List<BTSObject> findRelatingObjects(BTSObject object, IProgressMonitor monitor) {
		BTSQueryRequest query = new BTSQueryRequest();
		query.setQueryBuilder(QueryBuilders.matchQuery("relations.objectId",
				object.get_id()));
		query.setQueryId("relations.objectId-" + object.get_id());
//		query.setResponseFields(BTSConstants.SEARCH_BASIC_RESPONSE_FIELDS);
		
		// set current dbcollection context
		query.setDbPath(dbcollectionContext);
		
		System.out.println(query.getQueryId());
		List<BTSObject> children = new Vector<BTSObject>();
		List<BTSCorpusObject> obs;
		if (object instanceof BTSThsEntry)
		{
			query.setDbPath(object.getDBCollectionKey());
		} else if (object instanceof BTSLemmaEntry)
		{
			query.setDbPath(object.getDBCollectionKey());
		}
		else
		{
			
		}
		obs = corpusObjectService.query(query,
				BTSConstants.OBJECT_STATE_ACTIVE, monitor);
		for (BTSCorpusObject o : obs)
		{
			children.add(o);
		}
		children.addAll(commentService.query(query, BTSConstants.OBJECT_STATE_ACTIVE, true, monitor));
		return children;
	}

	@Override
	public boolean checkAndFullyLoad(BTSCorpusObject object, boolean checkForConflicts)
	{
		return corpusObjectService.checkAndFullyLoad(object, checkForConflicts);
	}



	@Override
	public BTSConfigItem getAnnoSubtypesConfigItem(
			BTSConfigItem objectTypesConfigItem) {
		BTSConfigItem configItem = BtsmodelFactory.eINSTANCE
				.createBTSConfigItem();
		for (BTSConfig c : objectTypesConfigItem.getChildren())
			if (c instanceof BTSConfigItem) 
				if (((BTSConfigItem)c).getType().equals(BTSCoreConstants.OBJECT_TYPE)) {
						BTSConfigItem subtypeConfigItem = (BTSConfigItem)c;
						if (!subtypeConfigItem.isIgnore())
							configItem.getChildren().add(EcoreUtil.copy(subtypeConfigItem));
				}
		return configItem;
	}

	@Override
	public BTSConfigItem getAnnoTypesConfigItem() {
		BTSAnnotation anno = BtsCorpusModelFactory.eINSTANCE.createBTSAnnotation();
		return confService.getObjectTypeConfigItemProcessedClones(anno);
	}
}
