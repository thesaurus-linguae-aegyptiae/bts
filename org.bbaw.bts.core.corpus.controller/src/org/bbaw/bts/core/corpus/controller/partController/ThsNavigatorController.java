package org.bbaw.bts.core.corpus.controller.partController;

import java.util.List;
import java.util.Map;

import org.bbaw.bts.btsviewmodel.TreeNodeWrapper;
import org.bbaw.bts.corpus.btsCorpusModel.BTSThsEntry;
import org.bbaw.bts.searchModel.BTSModelUpdateNotification;
import org.bbaw.bts.searchModel.BTSQueryResultAbstract;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.jface.viewers.ContentViewer;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.ViewerFilter;

public interface ThsNavigatorController {

	List<BTSThsEntry> getRootBTSThsEntries(
			Map<String, BTSQueryResultAbstract> queryResultMap,
			TreeViewer treeViewer, TreeNodeWrapper root,
			EReference treeNodeWrapperChildren);

	List<BTSThsEntry> getDeletedThsEntries(
			Map<String, BTSQueryResultAbstract> queryResultMap,
			TreeViewer treeViewer, TreeNodeWrapper root,
			EReference treeNodeWrapperChildren);

	void addRelation(BTSThsEntry subject, String relationType,
			TreeNodeWrapper treeNodeWrapper);

	void save(BTSThsEntry o);

	List<BTSThsEntry> findChildren(BTSThsEntry parent,
			Map<String, BTSQueryResultAbstract> queryResultMap,
			ContentViewer viewer, TreeNodeWrapper parentHolder,
			EReference referenceName);

	boolean handleModelUpdate(BTSModelUpdateNotification notification,
			Map<String, BTSQueryResultAbstract> queryResultMap,
			Map<String, List<TreeNodeWrapper>> viewHolderMap);

	BTSThsEntry createNew();
	
	String getDisplayName(String id);

	List<BTSThsEntry> getOrphanThsEntries(Map map, ViewerFilter[] filters);
}
