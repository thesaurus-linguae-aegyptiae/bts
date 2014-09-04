package org.bbaw.bts.core.services.corpus.impl.services;

import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSRelation;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.commons.BTSPluginIDs;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.commons.filter.BTSFilter;
import org.bbaw.bts.core.services.corpus.GenericCorpusObjectService;
import org.bbaw.bts.core.services.impl.generic.GenericObjectServiceImpl;
import org.bbaw.bts.corpus.btsCorpusModel.BTSCorpusObject;
import org.bbaw.bts.tempmodel.CacheTreeNode;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.Preference;

public abstract class AbstractCorpusObjectServiceImpl <E extends BTSCorpusObject, K extends Serializable>
extends GenericObjectServiceImpl<E, K> 
implements GenericCorpusObjectService<E, K>{

	@Inject
	@Optional
	@Preference(value = BTSPluginIDs.PREF_ACTIVE_CORPORA, nodePath = "org.bbaw.bts.app")
	protected String active_corpora;

	@Inject
	@Optional
	@Preference(value = BTSPluginIDs.PREF_MAIN_CORPUS_KEY, nodePath = "org.bbaw.bts.app")
	protected String main_corpus_key;
	
	public abstract List<E> listRootEntries();
	
	public List<E> getOrphanEntries(Map map,
			List<BTSFilter> btsFilters) {
		List<E> allEntries = list(BTSConstants.OBJECT_STATE_ACTIVE);
		List<E> allFilteredEntries = new Vector<E>();
		for (E e : allEntries)
		{
			if (isVisible(e, btsFilters))
			{
				allFilteredEntries.add(e);
			}
		}
		
		// load and cache root entries
		List<E> allRootEntries = listRootEntries();
		Set<String> allRootEntriesSet = new HashSet<String>(allRootEntries.size());
		for (E e : allRootEntries)
		{
			if (isVisible(e, btsFilters))
			{
				allRootEntriesSet.add(e.get_id());
			}
		}
		
		// init caches
		
		// potential root nodes
		Map<String, CacheTreeNode> roots = new HashMap<String, CacheTreeNode>();
		// all nodes
		Map<String, CacheTreeNode> allNodes = new HashMap<String, CacheTreeNode>();
		// nodes that await a holder, key = id of holder
		Map<String, List<CacheTreeNode>> awaitingHolder = new HashMap<String, List<CacheTreeNode>>();
		// nodes that provide hold to children, key = id of child
		Map<String, List<CacheTreeNode>> providingHold = new HashMap<String, List<CacheTreeNode>>();
		
		// iterate over all entries
		for (E e : allFilteredEntries)
		{
			if (isVisible(e, btsFilters))
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
			}
		}
		List<E> orphans = new Vector<E>();
		for (CacheTreeNode tn : roots.values())
		{
			if (allRootEntriesSet != null && allRootEntriesSet.contains(tn.getId()))
			{
				// tn is rootnode and shown in viewer
			}
			else
			{
				orphans.add((E) tn.getObject());
			}
		}
		return orphans;
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
	private boolean isVisible(E e, List<BTSFilter> btsFilters) {
		if (btsFilters != null)
		{
			for (BTSFilter f : btsFilters)
			{
				if (!f.select(e))
				{
					return false;
				}
			}
			return true;
		}
		return true;
	}
}
