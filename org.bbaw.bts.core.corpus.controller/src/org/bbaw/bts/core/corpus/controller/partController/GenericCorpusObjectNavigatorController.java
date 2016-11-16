package org.bbaw.bts.core.corpus.controller.partController;

import java.util.List;
import java.util.Map;

import org.bbaw.bts.btsviewmodel.TreeNodeWrapper;
import org.bbaw.bts.core.dao.util.BTSQueryRequest;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAbstractText;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAnnotation;
import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject;
import org.bbaw.bts.searchModel.BTSModelUpdateNotification;
import org.bbaw.bts.searchModel.BTSQueryResultAbstract;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.jface.viewers.ContentViewer;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.ViewerFilter;

public interface GenericCorpusObjectNavigatorController <E extends BTSCorpusObject, K>{

	List<E> getRootEntries(
			Map<String, BTSQueryResultAbstract> queryResultMap,
			TreeViewer treeViewer, TreeNodeWrapper root,
			EReference treeNodeWrapperChildren, String queryID, IProgressMonitor monitor);

	List<E> getDeletedEntries(
			Map<String, BTSQueryResultAbstract> queryResultMap,
			TreeViewer treeViewer, TreeNodeWrapper root,
			EReference treeNodeWrapperChildren, String queryID, IProgressMonitor monitor);

	TreeNodeWrapper addRelation(E subject, String relationType,
			TreeNodeWrapper treeNodeWrapper);

	void save(BTSCorpusObject o);

	List<E> findChildren(E parent,
			Map<String, BTSQueryResultAbstract> queryResultMap,
			ContentViewer viewer, TreeNodeWrapper parentHolder,
			EReference referenceName, IProgressMonitor monitor);

	boolean handleModelUpdate(BTSModelUpdateNotification notification,
			Map<String, BTSQueryResultAbstract> queryResultMap,
			Map<String, List<TreeNodeWrapper>> viewHolderMap);

	E createNew();
	
	E find(K id, IProgressMonitor monitor);
	
	String getDisplayName(K id);

	List<E> getOrphanEntries(Map map, ViewerFilter[] filters, IProgressMonitor monitor);

	List<E> getSearchEntries(
			BTSQueryRequest query, Map<String, BTSQueryResultAbstract> queryResultMap,
			StructuredViewer structuredViewer, TreeNodeWrapper rootNode,
			EReference treeNodeWrapperChildren, IProgressMonitor monitor);
	
	boolean checkAndFullyLoad(BTSCorpusObject object, boolean checkForConflicts);
	
	List<TreeNodeWrapper> loadNodes(List<E> obs, IProgressMonitor monitor, boolean asStructuredTree);
	
	BTSAnnotation createNewAnnotation(E selection, String annotationTypePath);

}
