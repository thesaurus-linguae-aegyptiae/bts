package org.bbaw.bts.core.corpus.controller.impl.partController;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.BTSRelation;
import org.bbaw.bts.btsviewmodel.BtsviewmodelFactory;
import org.bbaw.bts.btsviewmodel.TreeNodeWrapper;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.commons.BTSCoreConstants;
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
import org.bbaw.bts.tempmodel.CacheTreeNode;
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
		return new String[]{"partOf", "referencedBy", "referencing", "rootOf"};
	}

	@Override
	public BTSAnnotation createNewAnnotation(BTSCorpusObject annotatedObject) {
		BTSAnnotation anno = lemmaService
				.createNewAnnotationRelationPartOf(annotatedObject);
		
		return anno;
	}

	@Override
	public List<TreeNodeWrapper> loadNodesWithChildren(
			List<BTSLemmaEntry> obs, IProgressMonitor monitor, boolean b) {
		List<TreeNodeWrapper> nodes;
		
		// kinder finden
		
		// eltern finden
		Map<String, CacheTreeNode> roots = new HashMap<String, CacheTreeNode>();
		// all nodes
		Map<String, CacheTreeNode> allNodes = new HashMap<String, CacheTreeNode>();
		// nodes that await a holder, key = id of holder
		Map<String, List<CacheTreeNode>> awaitingHolder = new HashMap<String, List<CacheTreeNode>>();
		// nodes that provide hold to children, key = id of child
		Map<String, List<CacheTreeNode>> providingHold = new HashMap<String, List<CacheTreeNode>>();
		// iterate over all entries
		for (BTSLemmaEntry e : obs)
		{
			CacheTreeNode tn = new CacheTreeNode(e.get_id(), e);
			allNodes.put(tn.getId(), tn);
			boolean held = false;
			List<CacheTreeNode> localHolders = providingHold.get(tn.getId());
			if (localHolders != null)
			{
				for (CacheTreeNode holder : localHolders)
				{
					holder.getChildren().add(tn);
					held = true;
				}
			}
			List<CacheTreeNode> localAwaiting = awaitingHolder.get(tn.getId());
			if (localAwaiting != null)
			{
				for (CacheTreeNode awaiting : localAwaiting)
				{
					tn.getChildren().add(awaiting);
					roots.remove(awaiting.getId());
				}
			}
			for (BTSRelation rel : e.getRelations())
			{
				if (BTSCoreConstants.BASIC_RELATIONS_PARTOF.equals(rel.getType()))
				{
					CacheTreeNode holder = allNodes.get(rel.getObjectId());
					if (holder != null)
					{
						holder.getChildren().add(tn);
						held = true;
					}
					else
					{
						addToMap(tn, rel.getObjectId(), awaitingHolder);
					}
				}
				else if (BTSCoreConstants.BASIC_RELATIONS_CONTAINS.equals(rel.getType()))
				{
					CacheTreeNode contained = allNodes.get(rel.getObjectId());
					if (contained != null)
					{
						tn.getChildren().add(contained);
						roots.remove(contained.getId());
					}
					else
					{
						addToMap(tn, rel.getObjectId(), providingHold);
					}
				}
			}
			if (!held)
			{
				roots.put(tn.getId(), tn);
			}
			if (monitor != null)
			{
				monitor.worked(1);
				if (monitor.isCanceled()) break;
			}
		}
		List<TreeNodeWrapper> rootsNodes = new Vector<TreeNodeWrapper>();
		for (CacheTreeNode cachedtn : roots.values())
		{
			BTSLemmaEntry e = (BTSLemmaEntry) cachedtn.getObject();
			TreeNodeWrapper tn = BtsviewmodelFactory.eINSTANCE
					.createTreeNodeWrapper();
			tn.setObject(e);
			rootsNodes.add(tn);
			Set<BTSLemmaEntry> addedChildren = new HashSet<BTSLemmaEntry>();
			for (CacheTreeNode cachedChild : cachedtn.getChildren())
			{
				
				BTSLemmaEntry child = (BTSLemmaEntry) cachedChild.getObject();
				if (!addedChildren.contains(child))
				{
					TreeNodeWrapper childtn = BtsviewmodelFactory.eINSTANCE
							.createTreeNodeWrapper();
					childtn.setObject(child);
					tn.getChildren().add(childtn);
					addedChildren.add(child);
				}
			}
		}
		
		// kinder von allen abziehen = wurzeln
		
		// kindern ihren eltern anhängen
		
		// zusätzliche kinder suchen und anhängen, wenn nicht schon vorhanden

		nodes = new Vector<TreeNodeWrapper>(obs.size());
		for (BTSObject o : obs) {
			TreeNodeWrapper tn = BtsviewmodelFactory.eINSTANCE
					.createTreeNodeWrapper();
			tn.setObject(o);
			nodes.add(tn);
			if (monitor != null)
			{
				monitor.worked(1);
			}
		}
		return rootsNodes;
	}

	private void addToMap(CacheTreeNode tn,
			String key, Map<String, List<CacheTreeNode>> map) {
		List<CacheTreeNode> list = map.get(key);
		if (list == null)
		{
			list = new Vector<CacheTreeNode>(4);
			map.put(key, list);
		}
		list.add(tn);
	}
}
