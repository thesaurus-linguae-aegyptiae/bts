package org.bbaw.bts.core.corpus.controller.impl.partController;

import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSAnnotation;
import org.bbaw.bts.btsmodel.BTSCorpusObject;
import org.bbaw.bts.btsmodel.BTSDBBaseObject;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.BTSRelation;
import org.bbaw.bts.btsmodel.BTSTCObject;
import org.bbaw.bts.btsmodel.BTSText;
import org.bbaw.bts.btsmodel.BTSTextCorpus;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.btsviewmodel.BtsviewmodelFactory;
import org.bbaw.bts.btsviewmodel.TreeNodeWrapper;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.corpus.controller.partController.CorpusNavigatorController;
import org.bbaw.bts.core.dao.util.DaoConstants;
import org.bbaw.bts.core.services.BTSAnnotationService;
import org.bbaw.bts.core.services.BTSListEntryService;
import org.bbaw.bts.core.services.BTSTCObjectService;
import org.bbaw.bts.core.services.BTSTextCorpusService;
import org.bbaw.bts.core.services.BTSTextService;
import org.bbaw.bts.core.services.BTSThsEntryService;
import org.bbaw.bts.core.services.Backend2ClientUpdateService;
import org.bbaw.bts.core.services.CorpusObjectService;
import org.bbaw.bts.core.services.IDService;
import org.bbaw.bts.searchModel.BTSModelUpdateNotification;
import org.bbaw.bts.searchModel.BTSQueryRequest;
import org.bbaw.bts.searchModel.BTSQueryResultAbstract;
import org.eclipse.e4.core.services.log.Logger;
import org.eclipse.e4.ui.services.internal.events.EventBroker;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.jface.viewers.ContentViewer;
import org.elasticsearch.index.query.QueryBuilders;

public class CorpusNavigatorControllerImpl implements CorpusNavigatorController
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
	private BTSListEntryService wlistService;
	
	@Inject
	private Logger logger;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.bbaw.bts.core.controller.impl.partController.CorpusNavigatorController
	 * #createNewTextCorpus()
	 */
	@Override
	public BTSTextCorpus createNewTextCorpus()
	{
		BTSTextCorpus corpus = textCorpusService.createNew();
		return corpus;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.bbaw.bts.core.controller.impl.partController.CorpusNavigatorController
	 * #createNewTCObject()
	 */
	@Override
	public BTSTCObject createNewTCObject()
	{
		BTSTCObject o = tcObjectService.createNew();
		return o;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.bbaw.bts.core.controller.impl.partController.CorpusNavigatorController
	 * #addRelation(org.bbaw.bts.btsmodel.BTSCorpusObject, java.lang.String,
	 * org.bbaw.bts.btsmodel.BTSCorpusObject,
	 * org.eclipse.core.databinding.observable.list.WritableList)
	 */
	@Override
	public void addRelation(final BTSCorpusObject subject, final String relationType,
			final TreeNodeWrapper objectTreeNode)
	{
		logger.info("run refresh");
		BTSObject object = objectTreeNode.getObject();
		if (subject != null)
		{
			logger.info("selection is instance of BTSTextCorpus");
			BTSRelation rel = BtsmodelFactory.eINSTANCE.createBTSRelation();
			rel.setObjectId(((BTSDBBaseObject) object).get_id());
			rel.setType(relationType);
			subject.getRelations().add(rel);
			corpusObjectService.save((BTSCorpusObject) subject);
		}
		if (relationType != null && relationType.equals("partOf"))
		{
			TreeNodeWrapper childNode = BtsviewmodelFactory.eINSTANCE.createTreeNodeWrapper();
			childNode.setParent(objectTreeNode);
			childNode.setObject(subject);
			objectTreeNode.getChildren().add(childNode);

		}
		eventBroker.post("model_update/async", "Hallo");

	}

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
			TreeNodeWrapper parentWrapper, EReference referenceName)
	{
		BTSQueryRequest query = new BTSQueryRequest();
		query.setQueryBuilder(QueryBuilders.termQuery("relations.objectId", parent.get_id()));
		query.setQueryId("relations.objectId-" + parent.get_id());
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
				BTSConstants.OBJECT_STATE_ACTIVE);
		logger.info("Number of children found: " + children.size());

		return children;
	}

	@Override
	public boolean handleModelUpdate(BTSModelUpdateNotification notification,
			Map<String, BTSQueryResultAbstract> queryResultMap, Map<String, List<TreeNodeWrapper>> viewHolderMap)
	{
		if (notification.getObject() != null)
		{
			Set<Object> keepHolderMap = new HashSet<Object>(1);
			// Adds
			if (queryResultMap != null && notification.getQueryIds() != null && !notification.getQueryIds().isEmpty())
			{
				for (String queryId : notification.getQueryIds())
				{
					if (queryResultMap.containsKey(queryId))
					{
						BTSQueryResultAbstract queryAbstract = queryResultMap.get(queryId);
						TreeNodeWrapper holder = handleUpdateReturnHolder(queryAbstract, notification, viewHolderMap);
						keepHolderMap.add(holder);
					}
				}
			}
			// removals
			if (notification.getObject() instanceof BTSObject)
			{
				BTSObject o = (BTSObject) notification.getObject();
				List<TreeNodeWrapper> holders = viewHolderMap.get(((BTSDBBaseObject) o).get_id());
				Set<Object> removeHolderMap = new HashSet<Object>(1);
				if (holders != null)
				{
					for (Object holder : holders)
					{
						if (!keepHolderMap.contains(holder))
						{
							removeHolderMap.add(holder);
							removeObjectFromHolder(holder, o);
						}
					}
					if (!removeHolderMap.isEmpty())
					{
						holders.removeAll(removeHolderMap);
						return true;
					}
				}
			}

		}
		return false;
	}

	private void removeObjectFromHolder(Object holder, BTSObject o)
	{
		TreeNodeWrapper parent = ((TreeNodeWrapper) holder).getParent();
		if (parent != null)
		{
			parent.getChildren().remove(holder);
		}

	}

	private TreeNodeWrapper handleUpdateReturnHolder(BTSQueryResultAbstract resultAbstract,
			BTSModelUpdateNotification notification,  Map<String, List<TreeNodeWrapper>> viewHolderMap)
	{
		EObject parent = resultAbstract.getParentEObject();
		Object feature = parent.eGet(resultAbstract.getReferenceName());
		if (feature instanceof List<?>)
		{
			List<EObject> ref = (List<EObject>) feature;
			if (ref.isEmpty() || notification.getObject() == null)
			{
				TreeNodeWrapper tn = BtsviewmodelFactory.eINSTANCE
						.createTreeNodeWrapper();
				tn.setObject((BTSObject) notification.getObject());
				tn.setParent((TreeNodeWrapper) parent);
				ref.add(tn);
				addTooHolderMap((BTSObject) notification.getObject(), tn, viewHolderMap);

				return tn;
			}
			for (EObject o : ref)
			{
				if (o instanceof TreeNodeWrapper && ((TreeNodeWrapper) o).getObject() != null
						&& ((TreeNodeWrapper) o).getObject().equals(notification.getObject()))
				{
					return (TreeNodeWrapper) o;
				}
			}

			TreeNodeWrapper tn = BtsviewmodelFactory.eINSTANCE.createTreeNodeWrapper();
			tn.setObject((BTSObject) notification.getObject());
			tn.setObject((BTSObject) notification.getObject());
			addTooHolderMap((BTSObject) notification.getObject(), tn, viewHolderMap);

			ref.add(tn);
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
	public List<BTSCorpusObject> getRootBTSCorpusObjects(Map<String, BTSQueryResultAbstract> queryResultMap,
			ContentViewer viewer, TreeNodeWrapper parentHolder, EReference referenceName)
	{
		if (queryResultMap != null)
		{
			BTSQueryResultAbstract qra = new BTSQueryResultAbstract();
			qra.setViewer(viewer);
			qra.setParentEObject(parentHolder);
			qra.setReferenceName(referenceName);
			qra.setQueryId(DaoConstants.VIEW_ALL_BTSTEXTCORPUS);
			queryResultMap.put(qra.getQueryId(), qra);
		}
		List<BTSTextCorpus> list = textCorpusService
				.list(BTSConstants.OBJECT_STATE_ACTIVE);
		List<BTSCorpusObject> result = new Vector<BTSCorpusObject>(list.size());
		for (BTSTextCorpus t : list)
		{
			result.add(t);
		}
		return result;
	}

	@Override
	public BTSText createNewText()
	{
		BTSText text = textService.createNew();
		return text;
	}

	@Override
	public BTSAnnotation createNewAnnotation(BTSCorpusObject annotatedObject) {
		BTSAnnotation anno = annotationService
				.createNewAndRelate(annotatedObject);

		return anno;
	}

	@Override
	public String getDisplayName(String id) {
		BTSCorpusObject o = findObject(id);
		
		if (o != null) {
			return o.getName();
		}
		return id;
	}

	@Override
	public BTSCorpusObject findObject(String id) {
		BTSCorpusObject o = null;
		try {
			o = corpusObjectService.find(id);
		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
		}
		if (o != null) {
			return o;
		} else {
			try {
				o = textCorpusService.find(id);
			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
			}
		}
		if (o != null) {
			return o;
		} else {
			try {
				o = thsService.find(id);
			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
			}
		}
		if (o != null) {
			return o;
		} else {
			try {
				o = wlistService.find(id);
			} catch (Exception e) {
				
			}
		}
		return o;
	}

	@Override
	public List<BTSTextCorpus> listTextCorpora() {
		return textCorpusService.list(BTSConstants.OBJECT_STATE_ACTIVE);
	}

	@Override
	public boolean makeAndSaveNewTextCorpus(BTSTextCorpus corpus, boolean synchronizeCorpus) {
		return textCorpusService.makeAndSaveNewTextCorpus(corpus, synchronizeCorpus);
	}
	
	
}
