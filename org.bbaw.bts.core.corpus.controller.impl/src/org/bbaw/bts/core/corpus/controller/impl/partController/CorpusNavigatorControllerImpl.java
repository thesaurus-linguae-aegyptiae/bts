package org.bbaw.bts.core.corpus.controller.impl.partController;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import javax.inject.Inject;

import org.bbaw.bts.btsviewmodel.TreeNodeWrapper;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.commons.comparator.BTSObjectByNameComparator;
import org.bbaw.bts.core.commons.filter.BTSFilter;
import org.bbaw.bts.core.controller.generalController.PermissionsAndExpressionsEvaluationController;
import org.bbaw.bts.core.corpus.controller.partController.CorpusNavigatorController;
import org.bbaw.bts.core.dao.util.BTSQueryRequest;
import org.bbaw.bts.core.services.Backend2ClientUpdateService;
import org.bbaw.bts.core.services.IDService;
import org.bbaw.bts.core.services.corpus.BTSAnnotationService;
import org.bbaw.bts.core.services.corpus.BTSLemmaEntryService;
import org.bbaw.bts.core.services.corpus.BTSTCObjectService;
import org.bbaw.bts.core.services.corpus.BTSTextCorpusService;
import org.bbaw.bts.core.services.corpus.BTSTextService;
import org.bbaw.bts.core.services.corpus.BTSThsEntryService;
import org.bbaw.bts.core.services.corpus.CorpusObjectService;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAnnotation;
import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject;
import org.bbaw.bts.corpus.btsCorpusModel.BTSTCObject;
import org.bbaw.bts.corpus.btsCorpusModel.BTSText;
import org.bbaw.bts.corpus.btsCorpusModel.BTSTextCorpus;
import org.bbaw.bts.searchModel.BTSQueryResultAbstract;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.e4.core.services.log.Logger;
import org.eclipse.e4.ui.services.internal.events.EventBroker;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.jface.viewers.ContentViewer;
import org.elasticsearch.index.query.QueryBuilders;

public class CorpusNavigatorControllerImpl 
extends AbstractCorpusObjectNavigatorControllerImpl<BTSCorpusObject, String> 
implements CorpusNavigatorController
{
	@Inject
	private EventBroker eventBroker;
	@Inject
	private BTSTextCorpusService textCorpusService;

	@Inject
	private BTSTCObjectService tcObjectService;

	@Inject
	private CorpusObjectService corpusObjectService;

	@Inject
	private BTSTextService textService;

	@Inject
	private IDService ids;

	@Inject
	private Backend2ClientUpdateService updateService;

	@Inject
	private BTSAnnotationService annotationService;

	@Inject
	private BTSThsEntryService thsService;

	@Inject
	private BTSLemmaEntryService wlistService;

	@Inject
	private PermissionsAndExpressionsEvaluationController permissionController;
	
	@Inject
	private Logger logger;

	@Override
	public BTSTextCorpus createNewTextCorpus()
	{
		BTSTextCorpus corpus = textCorpusService.createNew();
		return corpus;
	}

	@Override
	public BTSTCObject createNewTCObject(BTSCorpusObject parentObject)
	{
		BTSTCObject o = tcObjectService.createNewRelationPartOf(parentObject);

		return o;
	}

//	/*
//	 * (non-Javadoc)
//	 * 
//	 * @see
//	 * org.bbaw.bts.core.controller.impl.partController.CorpusNavigatorController
//	 * #addRelation(org.bbaw.bts.btsmodel.BTSCorpusObject, java.lang.String,
//	 * org.bbaw.bts.btsmodel.BTSCorpusObject,
//	 * org.eclipse.core.databinding.observable.list.WritableList)
//	 */
//	@Override
//	public void addRelation(final BTSCorpusObject subject, final String relationType,
//			final TreeNodeWrapper objectTreeNode)
//	{
//		logger.info("run refresh");
//		Object o = objectTreeNode.getObject();
//		BTSObject object = null;
//		if (o instanceof BTSObject)
//		{
//			object = (BTSObject) o;
//		}
//		else
//		{
//			return;
//		}
//		if (subject != null)
//		{
//			logger.info("selection is instance of BTSTextCorpus");
//			BTSRelation rel = BtsmodelFactory.eINSTANCE.createBTSRelation();
//			rel.setObjectId(((BTSDBBaseObject) object).get_id());
//			rel.setType(relationType);
//			subject.getRelations().add(rel);
//			corpusObjectService.save((BTSCorpusObject) subject);
//		}
//		if (relationType != null && relationType.equals("partOf"))
//		{
//			TreeNodeWrapper childNode = BtsviewmodelFactory.eINSTANCE.createTreeNodeWrapper();
//			childNode.setParent(objectTreeNode);
//			childNode.setObject(subject);
//			objectTreeNode.getChildren().add(childNode);
//
//		}
//		eventBroker.post("model_update/async", "Hallo");
//
//	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.bbaw.bts.core.controller.impl.partController.CorpusNavigatorController
	 * #save(org.bbaw.bts.btsmodel.BTSCorpusObject)
	 */
	@Override
	public void save(BTSCorpusObject o)
	{
		corpusObjectService.save(o);

	}

	@Override
	public List<BTSCorpusObject> findChildren(BTSCorpusObject parent,
			Map<String, BTSQueryResultAbstract> queryResultMap, ContentViewer treeViewer,
			TreeNodeWrapper parentWrapper, EReference referenceName, IProgressMonitor monitor)
	{
		BTSQueryRequest query = new BTSQueryRequest();

		query.setQueryId("relations.objectId-" + parent.get_id());
		query.setQueryBuilder(QueryBuilders.matchQuery("relations.objectId", parent.get_id()));
		query.setResponseFields(BTSConstants.SEARCH_BASIC_RESPONSE_FIELDS);
		logger.info(query.getQueryId());
		if (queryResultMap != null)
		{
			BTSQueryResultAbstract qra = new BTSQueryResultAbstract();
			qra.setViewer(treeViewer);
			qra.setParentEObject(parentWrapper);
			qra.setReferenceName(referenceName);
			qra.setQueryId(query.getQueryId());
			queryResultMap.put(query.getQueryId(), qra);
		}
		List<BTSCorpusObject> children = corpusObjectService.query(query,
				BTSConstants.OBJECT_STATE_ACTIVE, monitor);
		logger.info("Number of children found: " + children.size());
		List<BTSCorpusObject> result = new Vector<BTSCorpusObject>(children.size());
		for (BTSCorpusObject o : children)
		{
			if (!(o instanceof BTSAnnotation))
			{
				result.add(o);
			}
		}
		Collections.sort(result, new BTSObjectByNameComparator());
		return result;
	}

//	@Override
//	public boolean handleModelUpdate(BTSModelUpdateNotification notification,
//			Map<String, BTSQueryResultAbstract> queryResultMap, Map<String, List<TreeNodeWrapper>> viewHolderMap)
//	{
//		if (notification.getObject() != null)
//		{
//			Set<Object> keepHolderMap = new HashSet<Object>(1);
//			// Adds
//			if (queryResultMap != null && notification.getQueryIds() != null && !notification.getQueryIds().isEmpty())
//			{
//				for (String queryId : notification.getQueryIds())
//				{
//					if (queryResultMap.containsKey(queryId))
//					{
//						BTSQueryResultAbstract queryAbstract = queryResultMap.get(queryId);
//						TreeNodeWrapper holder = handleUpdateReturnHolder(queryAbstract, notification, viewHolderMap);
//						keepHolderMap.add(holder);
//					}
//				}
//			}
//			// removals
//			if (notification.getObject() instanceof BTSObject)
//			{
//				BTSObject o = (BTSObject) notification.getObject();
//				List<TreeNodeWrapper> holders = viewHolderMap.get(((BTSDBBaseObject) o).get_id());
//				Set<Object> removeHolderMap = new HashSet<Object>(1);
//				if (holders != null)
//				{
//					for (Object holder : holders)
//					{
//						if (!keepHolderMap.contains(holder))
//						{
//							removeHolderMap.add(holder);
//							removeObjectFromHolder(holder, o);
//						}
//					}
//					if (!removeHolderMap.isEmpty())
//					{
//						holders.removeAll(removeHolderMap);
//						return true;
//					}
//				}
//			}
//
//		}
//		return false;
//	}

//	private void removeObjectFromHolder(Object holder, BTSObject o)
//	{
//		TreeNodeWrapper parent = ((TreeNodeWrapper) holder).getParent();
//		if (parent != null)
//		{
//			parent.getChildren().remove(holder);
//		}
//
//	}
//
//	private TreeNodeWrapper handleUpdateReturnHolder(BTSQueryResultAbstract resultAbstract,
//			BTSModelUpdateNotification notification,  Map<String, List<TreeNodeWrapper>> viewHolderMap)
//	{
//		EObject parent = resultAbstract.getParentEObject();
//		Object feature = parent.eGet(resultAbstract.getReferenceName());
//		if (feature instanceof List<?>)
//		{
//			List<EObject> ref = (List<EObject>) feature;
//			if (ref.isEmpty() || notification.getObject() == null)
//			{
//				TreeNodeWrapper tn = BtsviewmodelFactory.eINSTANCE
//						.createTreeNodeWrapper();
//				tn.setObject((BTSObject) notification.getObject());
//				tn.setParent((TreeNodeWrapper) parent);
//				ref.add(tn);
//				addTooHolderMap((BTSObject) notification.getObject(), tn, viewHolderMap);
//
//				return tn;
//			}
//			for (EObject o : ref)
//			{
//				if (o instanceof TreeNodeWrapper && ((TreeNodeWrapper) o).getObject() != null
//						&& ((TreeNodeWrapper) o).getObject().equals(notification.getObject()))
//				{
//					return (TreeNodeWrapper) o;
//				}
//			}
//
//			TreeNodeWrapper tn = BtsviewmodelFactory.eINSTANCE.createTreeNodeWrapper();
//			tn.setObject((BTSObject) notification.getObject());
//			tn.setObject((BTSObject) notification.getObject());
//			addTooHolderMap((BTSObject) notification.getObject(), tn, viewHolderMap);
//
//			ref.add(tn);
//			return tn;
//		}
//		return null;
//
//	}
//	
//	private void addTooHolderMap(BTSObject o, TreeNodeWrapper tn,Map<String, List<TreeNodeWrapper>> viewHolderMap) {
//		List<TreeNodeWrapper> list = viewHolderMap.get(((BTSDBBaseObject) o)
//				.get_id());
//		if (list == null) {
//			list = new Vector<TreeNodeWrapper>(1);
//		}
//		if (!list.contains(tn)) {
//			list.add(tn);
//		}
//		viewHolderMap.put(((BTSDBBaseObject) o).get_id(), list);
//
//	}

//	@Override
//	public List<BTSCorpusObject> getRootEntries(
//			Map<String, BTSQueryResultAbstract> queryResultMap,
//			TreeViewer viewer, TreeNodeWrapper parentHolder,
//			EReference referenceName, String queryId) {
//		if (queryResultMap != null)
//		{
//			BTSQueryResultAbstract qra = new BTSQueryResultAbstract();
//			qra.setViewer(viewer);
//			qra.setParentEObject(parentHolder);
//			qra.setReferenceName(referenceName);
//			qra.setQueryId(queryId);
//			queryResultMap.put(qra.getQueryId(), qra);
//		}
//		List<BTSTextCorpus> list = textCorpusService
//				.list(BTSConstants.OBJECT_STATE_ACTIVE);
//		List<BTSCorpusObject> result = new Vector<BTSCorpusObject>(list.size());
//		for (BTSTextCorpus t : list)
//		{
//			result.add(t);
//		}
//		return result;
//	}

	@Override
	public BTSText createNewText(BTSCorpusObject parentObject)
	{
		BTSText text = textService.createNewRelationPartOf(parentObject);
		return text;
	}

	@Override
	public BTSAnnotation createNewAnnotation(BTSCorpusObject annotatedObject) {
		BTSAnnotation anno = annotationService
				.createNewRelationPartOf(annotatedObject);

		return anno;
	}


	@Override
	public BTSCorpusObject find(String id, IProgressMonitor monitor) {
		BTSCorpusObject o = null;
		try {
			o = corpusObjectService.find(id, monitor);
		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
		}
		if (o != null) {
			return o;
		} else {
			try {
				o = textCorpusService.find(id, monitor);
			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
			}
		}
		if (o != null) {
			return o;
		} else {
			try {
				o = thsService.find(id, monitor);
			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
			}
		}
		if (o != null) {
			return o;
		} else {
			try {
				o = wlistService.find(id, monitor);
			} catch (Exception e) {
				
			}
		}
		return o;
	}

	@Override
	public List<BTSTextCorpus> listTextCorpora(IProgressMonitor monitor) {
		List<BTSTextCorpus> corpora = new Vector<BTSTextCorpus>();
		for (BTSTextCorpus c : textCorpusService.list(BTSConstants.OBJECT_STATE_ACTIVE, monitor))
		{
			String dbCollectionName = String.format("%s_%s",
					c.getDBCollectionKey(),
					c.getCorpusPrefix());
			if (c.getVisibility().equals(BTSCoreConstants.VISIBILITY_PUBLIC)
					|| permissionController.authenticatedUserMayReadDBCollection(dbCollectionName)) {
				checkAndFullyLoad(c, true);
				corpora.add(c);
			}
		}
		sortBTSTextCorpus(corpora);
		return corpora;
	}

	private void sortBTSTextCorpus(List<BTSTextCorpus> list) {
		Collections.sort(list, new BTSObjectByNameComparator());
		
	}

	@Override
	public boolean makeAndSaveNewTextCorpus(BTSTextCorpus corpus, boolean synchronizeCorpus) {
		return textCorpusService.makeAndSaveNewTextCorpus(corpus, synchronizeCorpus);
	}


	@Override
	public BTSCorpusObject createNew() {
		return createNewTextCorpus();
	}

	@Override
	public String getDisplayName(String id) {
		return corpusObjectService.getDisplayName(id, null);
	}

	

	@Override
	protected List<BTSCorpusObject> retrieveTypedRootEntries(IProgressMonitor monitor) {
		List<BTSTextCorpus> list = textCorpusService
				.list(BTSConstants.OBJECT_STATE_ACTIVE, monitor);
		List<BTSCorpusObject> result = new Vector<BTSCorpusObject>(list.size());
		for (BTSTextCorpus t : list)
		{
			result.add(t);
		}
		return result;
	}

	@Override
	protected List<BTSCorpusObject> executeTypedQuery(BTSQueryRequest query,
			String objectState, IProgressMonitor monitor) {
		return corpusObjectService.query(query, objectState, monitor);
	}

	@Override
	protected BTSCorpusObject typedCreateNew() {
		return createNewTextCorpus();
	}

	@Override
	protected List<BTSCorpusObject> typedListEntries(String objectState, IProgressMonitor monitor) {
		return corpusObjectService.list(objectState, monitor);
	}

	@Override
	protected List<BTSCorpusObject> retrieveTypedOrphandEntries(Map map,
			List<BTSFilter> btsFilters, IProgressMonitor monitor) {
		return corpusObjectService.getOrphanEntries(map, btsFilters, monitor);
	}

	@Override
	public BTSTextCorpus findTextCorpusByPrefix(String corpusPrefix) {
		return textCorpusService.findTextCorpusByPrefix(corpusPrefix);
	}

	
	
}
