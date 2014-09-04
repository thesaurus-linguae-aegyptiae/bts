package org.bbaw.bts.core.corpus.controller.partController;

import java.util.List;
import java.util.Map;

import org.bbaw.bts.btsviewmodel.TreeNodeWrapper;
import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject;
import org.bbaw.bts.searchModel.BTSModelUpdateNotification;
import org.bbaw.bts.searchModel.BTSQueryRequest;
import org.bbaw.bts.searchModel.BTSQueryResultAbstract;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.jface.viewers.ContentViewer;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.ViewerFilter;

public interface GenericCorpusObjectNavigatorController <E extends BTSCorpusObject, K>{

	List<E> getRootEntries(
			Map<String, BTSQueryResultAbstract> queryResultMap,
			TreeViewer treeViewer, TreeNodeWrapper root,
			EReference treeNodeWrapperChildren);

	List<E> getDeletedEntries(
			Map<String, BTSQueryResultAbstract> queryResultMap,
			TreeViewer treeViewer, TreeNodeWrapper root,
			EReference treeNodeWrapperChildren);

	void addRelation(E subject, String relationType,
			TreeNodeWrapper treeNodeWrapper);

	void save(E o);

	List<E> findChildren(E parent,
			Map<String, BTSQueryResultAbstract> queryResultMap,
			ContentViewer viewer, TreeNodeWrapper parentHolder,
			EReference referenceName);

	boolean handleModelUpdate(BTSModelUpdateNotification notification,
			Map<String, BTSQueryResultAbstract> queryResultMap,
			Map<String, List<TreeNodeWrapper>> viewHolderMap);

	E createNew();
	
	String getDisplayName(String id);

	List<E> getOrphanEntries(Map map, ViewerFilter[] filters);

	List<E> getSearchEntries(
			BTSQueryRequest query, Map<String, BTSQueryResultAbstract> queryResultMap,
			TreeViewer treeViewer, TreeNodeWrapper rootNode,
			EReference treeNodeWrapperChildren);
}
