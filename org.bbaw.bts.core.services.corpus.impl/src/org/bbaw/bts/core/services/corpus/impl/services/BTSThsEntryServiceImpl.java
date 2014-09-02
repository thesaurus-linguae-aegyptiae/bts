package org.bbaw.bts.core.services.corpus.impl.services;

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
import org.bbaw.bts.core.commons.BTSObjectSearchService;
import org.bbaw.bts.core.commons.corpus.BTSCorpusConstants;
import org.bbaw.bts.core.commons.filter.BTSFilter;
import org.bbaw.bts.core.dao.corpus.BTSThsEntryDao;
import org.bbaw.bts.core.dao.util.DaoConstants;
import org.bbaw.bts.core.services.corpus.BTSThsEntryService;
import org.bbaw.bts.core.services.impl.generic.GenericObjectServiceImpl;
import org.bbaw.bts.corpus.btsCorpusModel.BTSThsEntry;
import org.bbaw.bts.corpus.btsCorpusModel.BtsCorpusModelFactory;
import org.bbaw.bts.searchModel.BTSQueryRequest;
import org.bbaw.bts.tempmodel.CacheTreeNode;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.Preference;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;

public class BTSThsEntryServiceImpl extends
		GenericObjectServiceImpl<BTSThsEntry, String> implements
		BTSThsEntryService, BTSObjectSearchService {

	@Inject
	@Optional
	@Preference(value = BTSPluginIDs.PREF_ACTIVE_CORPORA, nodePath = "org.bbaw.bts.app")
	private String active_corpora;

	@Inject
	@Optional
	@Preference(value = BTSPluginIDs.PREF_MAIN_CORPUS_KEY, nodePath = "org.bbaw.bts.app")
	protected String main_corpus_key;
	@Inject
	private BTSThsEntryDao thsEntryDao;

	@Override
	public List<BTSThsEntry> list(String dbPath, String queryId,
			String objectState) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public BTSThsEntry createNew() {
		BTSThsEntry entry = BtsCorpusModelFactory.eINSTANCE.createBTSThsEntry();
		super.setId(entry);
		super.setRevision(entry);
		entry.setCorpusPrefix(main_corpus_key);
		return entry;
	}

	@Override
	public boolean save(BTSThsEntry entity) {
		super.addRevisionStatement(entity);
		thsEntryDao.add(entity, entity.getProject() + BTSCorpusConstants.THS);
		return true;
	}

	@Override
	public void update(BTSThsEntry entity) {
		thsEntryDao.update(entity, entity.getProject() + BTSCorpusConstants.THS);

	}

	@Override
	public void remove(BTSThsEntry entity) {
		thsEntryDao.remove(entity, entity.getProject() + BTSCorpusConstants.THS);

	}

	@Override
	public BTSThsEntry find(String key) {
		BTSThsEntry entry = null;
		entry = thsEntryDao.find(key, main_project + BTSCorpusConstants.THS);
		if (entry != null) {
			return entry;
		}
		for (String p : active_projects.split(BTSCoreConstants.SPLIT_PATTERN)) {
			entry = thsEntryDao.find(key, p + BTSCorpusConstants.THS);
			if (entry != null) {
				return entry;
			}
		}
		return null;
	}

	@Override
	public List<BTSThsEntry> list(String objectState) {
		List<BTSThsEntry> entries = new Vector<BTSThsEntry>();
		for (String p : active_projects.split(BTSCoreConstants.SPLIT_PATTERN)) {
			entries.addAll(thsEntryDao.list(p + BTSCorpusConstants.THS,
					objectState));
		}
		return filter(entries);
	}

	@Override
	public List<BTSThsEntry> query(BTSQueryRequest query, String objectState,
			boolean registerQuery) {
		List<BTSThsEntry> objects = new Vector<BTSThsEntry>();
		for (String p : active_projects.split(BTSCoreConstants.SPLIT_PATTERN)) {

			objects.addAll(thsEntryDao.query(query, p + BTSCorpusConstants.THS, p
					+ BTSCorpusConstants.THS, objectState, registerQuery));

		}
		return filter(objects);
	}
	@Override
	public List<BTSThsEntry> query(BTSQueryRequest query, String objectState) {
		return query(query, objectState, true);
	}

	@Override
	public List<BTSThsEntry> listRootEntries() {
		List<BTSThsEntry> entries = new Vector<BTSThsEntry>();
		for (String p : active_projects.split(BTSCoreConstants.SPLIT_PATTERN)) {
			entries.addAll(thsEntryDao.list(p + BTSCorpusConstants.THS,
					DaoConstants.VIEW_THS_ROOT_ENTRIES, BTSConstants.OBJECT_STATE_ACTIVE));
		}
		return filter(entries);
	}
	@Override
	public String getNameOfServedClass() {
		return "BTSThsEntry";
	}


	@Override
	public <T> Class<T> getServedClass() {
		return (Class<T>) BTSThsEntry.class;
	}
	@Override
	public List<BTSThsEntry> getOrphanThsEntries(Map map,
			List<BTSFilter> btsFilters) {
		List<BTSThsEntry> allEntries = list(BTSConstants.OBJECT_STATE_ACTIVE);
		allEntries = filter(allEntries);
		
		// load and cache root entries
		List<BTSThsEntry> allRootEntries = listRootEntries();
		Set<String> allRootEntriesSet = new HashSet<String>(allRootEntries.size());
		for (BTSThsEntry e : allRootEntries)
		{
			if (isVisible(e, btsFilters))
			{
				allRootEntriesSet.add(e.get_id());
			}
		}
		
		// init caches
		Map<String, CacheTreeNode> roots = new HashMap<String, CacheTreeNode>();
		Map<String, CacheTreeNode> allNodes = new HashMap<String, CacheTreeNode>();
		Map<String, List<CacheTreeNode>> awaitingHolder = new HashMap<String, List<CacheTreeNode>>();
		Map<String, List<CacheTreeNode>> providingHold = new HashMap<String, List<CacheTreeNode>>();
		
		// iterate over all entries
		for (BTSThsEntry e : allEntries)
		{
			if (isVisible(e, btsFilters))
			{
				System.out.println(e.getName());
				if ("orph4".equals(e.getName())) {
					System.out.println(e.getName());

				}
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
		List<BTSThsEntry> orphans = new Vector<BTSThsEntry>();
		for (CacheTreeNode tn : roots.values())
		{
//			URI uri = null;
//			if (tn.getObject() != null && tn.getObject() instanceof EObject)
//			{
//				EObject eo = (EObject) tn.getObject();
//				uri = eo.eResource().getURI();
//			}
			if (allRootEntriesSet != null && allRootEntriesSet.contains(tn.getId()))
			{
				// tn is rootnode and shown in viewer
			}
			else
			{
				orphans.add((BTSThsEntry) tn.getObject());
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
	private boolean isVisible(BTSThsEntry e, List<BTSFilter> btsFilters) {
		if (btsFilters != null)
		{
			for (BTSFilter f : btsFilters)
			{
				if (f.select(e))
				{
					return true;
				}
			}
			return false;
		}
		return true;
	}
}
