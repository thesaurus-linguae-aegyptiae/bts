package org.bbaw.bts.core.corpus.controller.impl.partController;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.BTSRelation;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.btsviewmodel.BtsviewmodelFactory;
import org.bbaw.bts.btsviewmodel.TreeNodeWrapper;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.commons.filter.BTSFilter;
import org.bbaw.bts.core.corpus.controller.partController.GenericCorpusObjectNavigatorController;
import org.bbaw.bts.core.dao.util.DaoConstants;
import org.bbaw.bts.core.services.Backend2ClientUpdateService;
import org.bbaw.bts.core.services.GenericObjectService;
import org.bbaw.bts.core.services.IDService;
import org.bbaw.bts.core.services.corpus.BTSThsEntryService;
import org.bbaw.bts.core.services.corpus.CorpusObjectService;
import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject;
import org.bbaw.bts.corpus.btsCorpusModel.BTSThsEntry;
import org.bbaw.bts.searchModel.BTSModelUpdateNotification;
import org.bbaw.bts.searchModel.BTSQueryRequest;
import org.bbaw.bts.searchModel.BTSQueryResultAbstract;
import org.eclipse.e4.ui.services.internal.events.EventBroker;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.jface.viewers.ContentViewer;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.elasticsearch.index.query.QueryBuilders;

public abstract class AbstractCorpusObjectNavigatorControllerImpl<E extends BTSCorpusObject, K extends Serializable>
implements
GenericCorpusObjectNavigatorController<E, K>
{

	@Inject
	private IDService ids;

	@Inject
	private EventBroker eventBroker;

	@Inject
	private Backend2ClientUpdateService updateService;


	
	@Inject
	private CorpusObjectService corpusObjectService;
	@Override
	public List<E> getRootEntries(
			Map<String, BTSQueryResultAbstract> queryResultMap,
			TreeViewer viewer, TreeNodeWrapper parentHolder,
			EReference referenceName, String queryID) {
		if (queryResultMap != null) {
			BTSQueryResultAbstract qra = new BTSQueryResultAbstract();
			qra.setViewer(viewer);
			qra.setParentEObject(parentHolder);
			qra.setReferenceName(referenceName);
			qra.setQueryId(queryID);
			queryResultMap.put(qra.getQueryId(), qra);
		}
		List<E> list = retrieveTypedRootEntries();//thsService.listRootEntries();
		List<E> result = new Vector<E>(list.size());
		for (E t : list) {
			result.add(t);
		}
		return result;
	}

	protected abstract List<E> retrieveTypedRootEntries();

	@Override
	public void addRelation(E subject, String relationType,
			TreeNodeWrapper treeNodeWrapper) {
		Object o = treeNodeWrapper.getObject();
		BTSObject object = null;
		if (o instanceof BTSObject)
		{
			object = (BTSObject) o;
		}
		else
		{
			return;
		}
		if (subject != null) {
			BTSRelation rel = BtsmodelFactory.eINSTANCE.createBTSRelation();
			rel.setObjectId(((BTSDBBaseObject) object).get_id());
			rel.setType(relationType);
			subject.getRelations().add(rel);
			corpusObjectService.save((E) subject);
		}
		if (relationType != null && relationType.equals("partOf")) {
			TreeNodeWrapper childNode = BtsviewmodelFactory.eINSTANCE
					.createTreeNodeWrapper();
			childNode.setParent(treeNodeWrapper);
			childNode.setObject(subject);
			treeNodeWrapper.getChildren().add(childNode);

		}
		eventBroker.post("model_update/async", "Hallo");

	}

	@Override
	public void save(E o) {
		corpusObjectService.save(o);

	}

	@Override
	public List<E> findChildren(E parent,
			Map<String, BTSQueryResultAbstract> queryResultMap,
			ContentViewer viewer, TreeNodeWrapper parentHolder,
			EReference referenceName) {
		BTSQueryRequest query = new BTSQueryRequest();
		query.setQueryBuilder(QueryBuilders.termQuery("relations.objectId",
				parent.get_id()));
		query.setQueryId("relations.objectId-" + parent.get_id());
		System.out.println(query.getQueryId());
		if (queryResultMap != null) {
			BTSQueryResultAbstract qra = new BTSQueryResultAbstract();
			qra.setViewer(viewer);
			qra.setParentEObject(parentHolder);
			qra.setReferenceName(referenceName);
			qra.setQueryId(query.getQueryId());
			queryResultMap.put(query.getQueryId(), qra);
		}
		List<E> children = executeTypedQuery(query, BTSConstants.OBJECT_STATE_ACTIVE); //thsService.query(query,BTSConstants.OBJECT_STATE_ACTIVE);
		return children;
	}

	protected abstract List<E> executeTypedQuery(BTSQueryRequest query, String objectState);

	@Override
	public boolean handleModelUpdate(BTSModelUpdateNotification notification,
			Map<String, BTSQueryResultAbstract> queryResultMap,
			Map<String, List<TreeNodeWrapper>> viewHolderMap) {
		boolean structualModfication = false;
		if (notification.isLoaded() && notification.getObject() != null) {
			Set<Object> keepHolderMap = new HashSet<Object>(1);
			// Adds
			if (queryResultMap != null && notification.getQueryIds() != null
					&& !notification.getQueryIds().isEmpty()) {
				for (String queryId : notification.getQueryIds()) {
					if (queryResultMap.containsKey(queryId)) {
						BTSQueryResultAbstract queryAbstract = queryResultMap
								.get(queryId);
						TreeNodeWrapper holder = handleUpdateReturnHolder(
								queryAbstract, notification, viewHolderMap);
						structualModfication =  true;
						keepHolderMap.add(holder);
					}
				}
			}
			// removals
			if (notification.getObject() instanceof BTSObject) {
				BTSObject o = (BTSObject) notification.getObject();
				List<TreeNodeWrapper> holders = viewHolderMap
						.get(((BTSDBBaseObject) o).get_id());
				Set<Object> removeHolderMap = new HashSet<Object>(1);
				if (holders != null) {
					for (Object holder : holders) {
						if (!keepHolderMap.contains(holder)) {
							removeHolderMap.add(holder);
							removeObjectFromHolder(holder, o);
						}
					}
					if (!removeHolderMap.isEmpty()) {
						holders.removeAll(removeHolderMap);
						structualModfication =  true;
					}
				}
			}

		}
		return structualModfication;
	}

	private void removeObjectFromHolder(Object holder, BTSObject o) {
		TreeNodeWrapper parent = ((TreeNodeWrapper) holder).getParent();
		parent.getChildren().remove(holder);

	}

	private TreeNodeWrapper handleUpdateReturnHolder(
			BTSQueryResultAbstract resultAbstract,
			BTSModelUpdateNotification notification, Map<String, List<TreeNodeWrapper>> viewHolderMap) {
		EObject parent = resultAbstract.getParentEObject();
		Object feature = parent.eGet(resultAbstract.getReferenceName());
		if (feature instanceof List<?>) {
			List<EObject> ref = (List<EObject>) feature;
			if (ref.isEmpty() || notification.getObject() == null) {
				TreeNodeWrapper tn = BtsviewmodelFactory.eINSTANCE
						.createTreeNodeWrapper();
				tn.setObject((BTSObject) notification.getObject());
				tn.setParent((TreeNodeWrapper) parent);
				ref.add(tn);
				addTooHolderMap((BTSObject) notification.getObject(), tn, viewHolderMap);

				return tn;
			}
			for (EObject o : ref) {
				if (o instanceof TreeNodeWrapper
						&& ((TreeNodeWrapper) o).getObject() != null
						&& ((TreeNodeWrapper) o).getObject().equals(
								notification.getObject())) {
					return (TreeNodeWrapper) o;
				}
			}
			TreeNodeWrapper tn = BtsviewmodelFactory.eINSTANCE
					.createTreeNodeWrapper();
			tn.setObject((BTSObject) notification.getObject());
			tn.setParent((TreeNodeWrapper) parent);
			ref.add(tn);
			addTooHolderMap((BTSObject) notification.getObject(), tn, viewHolderMap);
			return tn;
			
		}
		return null;

	}
	private void addTooHolderMap(BTSObject o, TreeNodeWrapper tn,Map<String, List<TreeNodeWrapper>> viewHolderMap) {
		List<TreeNodeWrapper> list = viewHolderMap.get(((BTSDBBaseObject) o)
				.get_id());
		if (list == null) {
			list = new Vector<TreeNodeWrapper>(1);
		}
		if (!list.contains(tn)) {
			list.add(tn);
		}
		viewHolderMap.put(((BTSDBBaseObject) o).get_id(), list);

	}
	@Override
	public E createNew() {
		return typedCreateNew(); //thsService.createNew();
	}

	protected abstract E typedCreateNew();

	@Override
	public List<E> getDeletedEntries(
			Map<String, BTSQueryResultAbstract> queryResultMap,
			TreeViewer viewer, TreeNodeWrapper parentHolder,
			EReference referenceName, String queryID) {
		if (queryResultMap != null) {
			BTSQueryResultAbstract qra = new BTSQueryResultAbstract();
			qra.setViewer(viewer);
			qra.setParentEObject(parentHolder);
			qra.setReferenceName(referenceName);
			qra.setQueryId(queryID);
			queryResultMap.put(qra.getQueryId(), qra);
		}
		List<E> list = typedListEntries(BTSConstants.OBJECT_STATE_TERMINATED); //thsService.list(BTSConstants.OBJECT_STATE_TERMINATED);
		List<E> result = new Vector<E>(list.size());
		for (E t : list) {
			result.add(t);
		}
		return result;
	}

	protected abstract List<E> typedListEntries(String objectState);

	@Override
	public String getDisplayName(String id) {
		BTSCorpusObject o = null;

			try {
				o = typedFind(id); //thsService.find(id);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		if (o != null) {
			return o.getName();
		} 
//		else {
//			try {
//				o = wlistService.find(id);
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		if (o != null) {
//			return o.getName();
//		}
		return id;
	}

	protected abstract E typedFind(String id);

	@Override
	public List<E> getOrphanEntries(Map map, ViewerFilter[] filters) {
		List<BTSFilter> btsFilters = null;
		if (filters.length > 0)
		{
			btsFilters = new Vector<BTSFilter>(filters.length);
			for (ViewerFilter f : filters)
			{
				if (f instanceof BTSFilter)
				{
					btsFilters.add((BTSFilter) f);
				}
			}
		}
		return retrieveTypedOrphandEntries(map, btsFilters); //thsService.getOrphanThsEntries(map, btsFilters);
	}

	protected abstract List<E> retrieveTypedOrphandEntries(Map map,
			List<BTSFilter> btsFilters);

	@Override
	public List<E> getSearchEntries(BTSQueryRequest query, 
			Map<String, BTSQueryResultAbstract> queryResultMap,
			TreeViewer viewer, TreeNodeWrapper parentHolder,
			EReference referenceName) {
		System.out.println(query.getQueryId());
		if (queryResultMap != null) {
			BTSQueryResultAbstract qra = new BTSQueryResultAbstract();
			qra.setViewer(viewer);
			qra.setParentEObject(parentHolder);
			qra.setReferenceName(referenceName);
			qra.setQueryId(query.getQueryId());
			queryResultMap.put(query.getQueryId(), qra);
		}
		System.out.println(query);
		List<E> children =executeTypedQuery(query, BTSConstants.OBJECT_STATE_ACTIVE);// thsService.query(query,BTSConstants.OBJECT_STATE_ACTIVE);
		return children;
	}
}
